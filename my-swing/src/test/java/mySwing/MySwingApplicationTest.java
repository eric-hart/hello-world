package myGroupId.mySwing;

import javax.swing.SwingUtilities;

import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runner.RunWith;
import org.junit.Test;

import myGroupId.mySwing.MySwingApplication;

/**
 * @class
 */
public class MySwingApplicationTest {
  /**
   * @method
   */
  @Test
  public void applicationShouldRun() throws Exception {
    MySwingApplication application = new MySwingApplication();
    SwingUtilities.invokeLater(application);
    application.button.doClick();
    boolean asserttion = application.textArea.getText().contains("Hello World!");
    assertThat("UI:\"textArea\" should contain \"Hello World!\";", asserttion);
  }
}
