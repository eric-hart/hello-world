import Koa from 'koa';

import greetingRoute from './route/greeting';

const app = new Koa();

app.use(greetingRoute.middleware());

export default app;
