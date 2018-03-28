const assert = require('assert');
const path = require('path');

const jsonfile = require('../dist/bundle.js');

describe('promise-jsonfile', () => {
    it('should read json file correctly', done => {
        jsonfile.read(path.resolve(__dirname, 'data.json')).then(data => {
            assert(data.foo === 'hello');
            assert(data.bar === 'world');
            done();
        }).catch(err => {
            throw err;
        });
    });
    it('should write json file correctly', done => {
        jsonfile.write(path.resolve(__dirname, 'output.json'), {
            foo: 'hello',
            bar: 'output',
        }).then(() => {
            done();
        }).catch(err => {
            throw err;
        });
    });
});
