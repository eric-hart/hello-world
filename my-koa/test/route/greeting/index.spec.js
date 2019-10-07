import fetch from 'node-fetch';

import process from 'child_process';

import test from 'ava';

test.beforeEach(async (test) => {
  const devCommand = process.spawn('yarn', ['run', 'dev']);

  const execPromise = new Promise((resolve, reject) => {
    devCommand.stdout.on('data', (data) => {
      resolve(data);
    });
    devCommand.stderr.on('data', (data) => {
      reject(data);
    });
  });

  await execPromise;
});

test('[TEST] path: \"/greeting\" output;', async (test) => {
  const responsePromise = fetch('http://localhost:3000/greeting');
  const response = await responsePromise;

  const textPromise = response.text();
  const text = await textPromise;

  test.deepEqual(text, '{"content":"Hello World!"}');
});
