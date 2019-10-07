"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

var _regenerator = _interopRequireDefault(require("@babel/runtime/regenerator"));

var _asyncToGenerator2 = _interopRequireDefault(require("@babel/runtime/helpers/asyncToGenerator"));

var _mongodb = require("mongodb");

var _UserMapper = _interopRequireDefault(require("./mapper/UserMapper"));

function main() {
  return _main.apply(this, arguments);
}

function _main() {
  _main = (0, _asyncToGenerator2.default)(
  /*#__PURE__*/
  _regenerator.default.mark(function _callee() {
    var connection, connectionResult, db, collection, find, findResult;
    return _regenerator.default.wrap(function _callee$(_context) {
      while (1) {
        switch (_context.prev = _context.next) {
          case 0:
            connection = new Promise(function (resolve, reject) {
              var url = 'mongodb://localhost:27017';

              _mongodb.MongoClient.connect(url, function (err, db) {
                if (err) {
                  reject(err);
                } else {
                  resolve(db);
                }
              });
            });
            _context.next = 3;
            return connection;

          case 3:
            connectionResult = _context.sent;
            db = connectionResult.db('test');
            collection = db.collection('user');
            find = new Promise(function (resolve, reject) {
              collection.find({}).toArray(function (err, result) {
                if (err) {
                  reject(err);
                } else {
                  resolve(result);
                }
              });
            });
            _context.next = 9;
            return find;

          case 9:
            findResult = _context.sent;
            console.log(findResult);

          case 11:
          case "end":
            return _context.stop();
        }
      }
    }, _callee, this);
  }));
  return _main.apply(this, arguments);
}

main();