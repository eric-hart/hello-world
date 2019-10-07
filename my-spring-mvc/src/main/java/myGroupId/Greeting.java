package myGroupId.mySwingMVC;

/**
 * @class
 */
public class Greeting {
  /**
   * @construtor
   */
  Greeting(double id, String content) {
    this.id = id;
    this.content = content;
  }

  /**
   * @property
   */
  private double id;

  /**
   * @property
   */
  private String content;

  /**
   * @method
   */
  public double getId() {
    return id;
  }

  /**
   * @method
   */
  public String getContent() {
    return content;
  }
}
