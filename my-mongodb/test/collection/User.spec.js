import "@babel/register";

import test from 'ava';

import Test from 'database/Test';

import Users from 'collection/Users';

test.before(async it => {
  const test = new Test();
  const db = await test.getDatabase();

  const users = new Users({ db });
  it.context.users = users;
});

test.serial('[collection] -> User :: find;', async it => {
  const result = await it.context.users.find();
  it.deepEqual(JSON.stringify(result), '[]');
});

test.serial('[collection] -> User :: insert;', async it => {
  const user = { "_id": 1, "name": "Paul Allen" };
  await it.context.users.insert(user);
  const result = await it.context.users.find();

  it.deepEqual(JSON.stringify(result), '[{"_id":1,"name":"Paul Allen"}]');
});

test.serial('[collection] -> User :: update;', async it => {
  const selector = { _id: 1 };
  const document = { $set: {  _id: 1, "name": "Yuki Hsu" } };
  await it.context.users.updateOne(selector, document);
  const result = await it.context.users.find();

  it.deepEqual(JSON.stringify(result), '[{"_id":1,"name":"Yuki Hsu"}]');
});

test.serial('[collection] -> User :: delete;', async it => {
  const filter = { "_id": 1 };
  await it.context.users.deleteOne(filter);
  const result = await it.context.users.find();

  it.deepEqual(JSON.stringify(result), '[]');
});
