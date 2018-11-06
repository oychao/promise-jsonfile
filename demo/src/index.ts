const path = require('path');
const jsonfile = require('promise-jsonfile');

jsonfile
  .read(path.resolve(__dirname, 'data.json'))
  .then(data => {
    console.log(data);
  })
  .catch(err => {
    throw err;
  });

jsonfile
  .write(path.resolve(__dirname, 'output.json'), {
    foo: 'hello',
    bar: 'output'
  })
  .then(() => {
    console.log('done');
  })
  .catch(err => {
    throw err;
  });

const copyJsonFile = function(i: string, o: string): Promise<any> {
  return jsonfile
    .read(path.resolve(__dirname, i))
    .then(data => jsonfile.write(path.resolve(__dirname, o), data));
};

copyJsonFile('data.json', 'data2.json');
