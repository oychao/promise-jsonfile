# promise-jsonfile

Read and write JSON file with Promise.

[![Build Status](https://travis-ci.org/oychao/promise-jsonfile.svg?branch=master)](https://travis-ci.org/oychao/promise-jsonfile) [![996.icu](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu)

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

[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)

[1]: https://github.com/jprichardson/node-jsonfile
[2]: https://github.com/oychao/promise-jsonfile/tree/master/demo
