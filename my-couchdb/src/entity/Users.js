import Entitys from 'entity/common/Entitys';

/**
 * @class
 */
class Users extends Entitys {
  /**
   * @constructor
   */
  constructor(options={}) {
    options.database = 'users';
    super(options);
  }
}

export default Users;
