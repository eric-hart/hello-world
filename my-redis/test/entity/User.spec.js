import "@babel/register";

import test from 'ava';

import redis from 'redis';

import User from 'entity/User';

test.beforeEach((it) => {
  const client = redis.createClient();
  const user = new User({ client });
  it.context.user = user;
});

test.serial('[entity] User -> name :: spec;', async (it) => {
  it.context.user.name = 'Paul Allen';

  const name = await it.context.user.name;
  it.deepEqual(name, 'Paul Allen');
});

test.serial('[entity] User -> id :: spec;', async (it) => {
  it.context.user.id = '1';

  const id = await it.context.user.id;
  it.deepEqual(id, '1');
});
