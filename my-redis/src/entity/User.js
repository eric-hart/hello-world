import HashSet from 'entity/common/HashSet';

/**
 * @class
 */
class User extends HashSet {
  /**
   * @constructor
   */
  constructor(options) {
    super(options);

    const { id, name } = options;
    this.id = id;
    this.name = name;
  }

  /**
   * @method
   */
  get id() {
    return this.hget({ key: 'id' });
  }

  /**
   * @method
   */
  set id(id) {
    this.hset({ key: 'id', value: id });
  }

  /**
   * @method
   */
  get name() {
    return this.hget({ key: 'name' });
  }

  /**
   * @method
   */
  set name(name) {
    this.hset({ key: 'name', value: name });
  }
}

export default User;
