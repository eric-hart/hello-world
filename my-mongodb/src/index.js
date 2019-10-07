import Test from 'database/Test';

import Users from 'collection/Users';

async function main() {
  const test = new Test();
  const db = await test.getDatabase();

  const users = new Users({ db });
  const results = await users.find();

  console.log(results);
}

main();
