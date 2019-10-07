import Users from 'entity/Users';

async function main() {
  const users = new Users();

  const result = await users.get({ id: 1 });
  console.log(result);
}

main();
