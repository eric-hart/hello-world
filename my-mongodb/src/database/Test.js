import Database from './Database';

/**
 * @class
 */
class Test extends Database {
  /**
   * @constructor
   */
  constructor() {
    super({ port: 27017, host: 'localhost', database: 'test' });
  }
}

export default Test;
