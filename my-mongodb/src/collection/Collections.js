/**
 * @class
 */
class Collections {
  /**
   * @method
   */
  async find(query, options) {
    const find = new Promise((resolve, reject) => {
      this.collection.find(query, options).toArray((err, result) => {
        if (err) {
          reject(err);
        } else {
          resolve(result);
        }
      });
    });

    const result = await find;
    return result;
  }

  /**
   * @method
   */
  async insert(docs, options) {
    const insert = new Promise((resolve, reject) => {
      this.collection.insert(docs, options, (err, result) => {
        if (err) {
          reject(err);
        } else {
          resolve(result);
        }
      });
    });

    const result = await insert;
    return result;
  }

  /**
   * @method
   */
  async updateOne(query, document, options) {
    const update = new Promise((resolve, reject) => {
      this.collection.updateOne(query, document, options, (err, result) => {
        if (err) {
          reject(err);
        } else {
          resolve(result);
        }
      });
    });

    const result = await update;
    return result;
  }

  /**
   * @method
   */
  async deleteOne(filter, options) {
    const deleteOne = new Promise((resolve, reject) => {
      this.collection.deleteOne(filter, options, (err, result) => {
        if (err) {
          reject(err);
        } else {
          resolve(result);
        }
      });
    });

    const result = await deleteOne;
    return result;
  }
}

export default Collections;
