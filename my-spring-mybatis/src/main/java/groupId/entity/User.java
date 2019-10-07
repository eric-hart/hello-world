package groupId.my.spring.mybatis.entity;

import java.io.Serializable;

/**
 * @class
 */
public class User implements Serializable {
  /**
   * @property
   */
  private static final long serialVersionUID = 1L;

  /**
   * @property
   */
  private Integer id;

  /**
   * @property
   */
  private String name;

  /**
   * @constructor
   */
  public User(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * @method
   */
  public Integer getId() {
    return this.id;
  }

  /**
   * @method
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * @method
   */
  public String getName() {
    return this.name;
  }

  /**
   * @method
   */
  public void setName(String name) {
    this.name = name;
  }
}
