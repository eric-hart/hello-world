import Entity from 'entity/common/Entity';

import redis from 'redis';

import md5 from 'blueimp-md5';

/**
 * @class
 */
class HashSet extends Entity {
  /**
   * @constructor
   */
  constructor(options) {
    super(options);

    const random = Math.random();
    this.hash = md5(random);
  }

  /**
   * @method
   */
  hget({ key }) {
    const hget = new Promise((resolve, reject) => {
      this.client.hget(this.hash, key, (err, result) => {
        if (err) {
          reject(err);
        } else {
          resolve(result);
        }
      });
    });
    return hget;
  }

  /**
   * @method
   */
  hset({ key, value }) {
    this.client.hset(this.hash, key, value, redis.prrint);
  }
}

export default HashSet;
