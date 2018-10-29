import * as fs from 'fs';

const read = (file: string, option: object) => {
  return new Promise((resolve, reject) => {
    fs.readFile(file, option, (err, data) => {
      if (err) {
        reject(err);
        return;
      }
      data = JSON.parse(stripBom(data));
      resolve(data);
    });
  });
};

const write = (file: string, data: object, option: object) => {
  return new Promise((resolve, reject) => {
    try {
      if (typeof data !== 'object') {
        throw new TypeError('only object data supported');
      }
      fs.writeFile(file, JSON.stringify(data), option, fileErr => {
        if (fileErr) {
          reject(fileErr);
          return;
        }
        resolve();
      });
    } catch (typeErr) {
      reject(typeErr);
    }
  });
};

function stripBom(content: Buffer) {
  let result: string = '';
  if (Buffer.isBuffer(content)) {
    result = content.toString('utf8');
  }
  return result.replace(/^\uFEFF/, '');
}

export default { read, write };
