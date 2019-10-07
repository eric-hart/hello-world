import '@babel/register';

import fetch from 'node-fetch';

import test from 'ava';

import Users from 'entity/Users';

test.beforeEach(async (it) => {
  await fetch('http://127.0.0.1:5984/users', { method: 'PUT' });

  it.context.users = new Users();
});

test.serial('[entity] Users -> get :: spec;', async (it) => {
  const result = await it.context.users.get({ id: 1 });
  it.deepEqual(JSON.stringify(result), '{"error":"not_found","reason":"missing"}');
});

test.serial('[entity] Users -> put :: spec;', async (it) => {
  const entity = { id: 1, name: 'Paul Allen' };
  await it.context.users.put({ id: 1, entity });

  let result = await it.context.users.get({ id: 1 });
  it.pass();
});

test.serial('[entity] Users -> delete :: spec;', async (it) => {
  it.context.users.delete({ id: 1 });

  const result = await it.context.users.get({ id: 1 });
  it.deepEqual(JSON.stringify(result), '{"error":"not_found","reason":"no_db_file"}');
});
