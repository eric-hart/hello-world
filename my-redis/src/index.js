import redis from 'redis';

import User from 'entity/User';

async function main() {
  const client = redis.createClient();

  const user = new User({ client, id: 1, name: 'Paul Allen' });
  const name = await user.name;

  console.log(name);
}

main();
