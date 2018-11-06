# promise-jsonfile

Read and write JSON file with Promise.

[![Build Status](https://travis-ci.org/oychao/promise-jsonfile.svg?branch=master)](https://travis-ci.org/oychao/promise-jsonfile)

This library is derived from [node-jsonfile][1].

## How to use

Typescript supported, check the [demo][2].

### Installation

```bash
npm install promise-jsonfile --save
```

### Usage

```javascript
import jsonfile from 'promise-jsonfile';

// read file
jsonfile
  .read('./your/file/path.json')
  .then(jsonData => {
    // do something
  })
  .catch(err => {
    throw err;
  });

// write file
jsonfile
  .write('./your/output/path.json', {
    your: 'json',
    data: 'here'
  })
  .then(() => {
    // do something
  })
  .cathc(err => {
    throw err;
  });
```

## Licence

[![](http://www.wtfpl.net/wp-content/uploads/2012/12/wtfpl-badge-4.png)](http://www.wtfpl.net/)

[1]: https://github.com/jprichardson/node-jsonfile
[2]: https://github.com/oychao/promise-jsonfile/tree/master/demo
