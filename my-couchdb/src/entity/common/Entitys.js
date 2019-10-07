import fetch from 'node-fetch';

/**
 * @class
 */
class Entitys {
  /**
   * @constructor
   */
  constructor({ protocal='http', host='127.0.0.1', port='5984', database='_users' }) {
    this.location = protocal + '://' + host + ':' + port + '/' + database;
  }

  /**
   * @method
   */
  async get({ id }) {
    const url = this.location + '/' + id;
    const method = 'GET';

    const result = await fetch(url, { url });
    return result.json();
  }

  /**
   * @method
   */
  async put({ id, entity }) {
    const url = this.location + '/' + id;
    const method = 'PUT';
    const body = JSON.stringify(entity);

    const result = await fetch(url, { method, body });
    return result.json();
  }

  /**
   * @method
   */
  async delete({ id }) {
    const url = this.location + '?id='+ id;
    const method = 'DELETE';
    const headers = { 'Content-Type': 'application/json' };

    const result = await fetch(url, { method, headers });
    return result.json();
  }
}

export default Entitys;
