import Router from 'koa-joi-router';

const router = new Router('/greeting');

router.get('/greeting', async (ctx, next) => {
  ctx.body = JSON.stringify({ content: 'Hello World!' });
});

export default router;
