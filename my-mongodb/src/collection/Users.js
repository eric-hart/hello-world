import Collections from './Collections';

/**
 * @class
 */
class Users extends Collections {
  /**
   * @constructor
   */
  constructor({ db }) {
    super();
    this.collection = db.collection('users');
  }
}

export default Users;
