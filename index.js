import fs from 'fs';

const read = (file, option) => {
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

const write = (file, data, option) => {
    return new Promise((resolve, reject) => {
        try {
            if (typeof data !== 'object') {
                throw new TypeError('only object data supported');
            }
            data = JSON.stringify(data);
            fs.writeFile(file, data, option, fileErr => {
                console.log(fileErr);
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

function stripBom(content) {
    if (Buffer.isBuffer(content)) {
        content = content.toString('utf8');
    }
    return content.replace(/^\uFEFF/, '');
}

export default { read, write, };

