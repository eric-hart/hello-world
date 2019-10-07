import { MongoClient } from 'mongodb';

/**
 * @class
 */
class Database {
  /**
   * @constructor
   */
  constructor({ host, port, database }) {
    const connection = new Promise((resolve, reject) => {
      const url = `mongodb://${host}:${port}`;
      MongoClient.connect(url, (err, db) => {
        if (err) {
          reject(err);
        } else {
          resolve(db);
        }
      });
    });

    this.database = database;
    this.connection = connection;
  }

  /**
   * @method
   */
  async getDatabase() {
    const mongodb = await this.connection;
    return mongodb.db(this.database);
  }
}

export default Database;
