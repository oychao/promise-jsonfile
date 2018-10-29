import * as path from 'path';
import jsonfile from 'promise-jsonfile';

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
