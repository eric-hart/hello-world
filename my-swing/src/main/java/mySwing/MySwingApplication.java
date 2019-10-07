package myGroupId.mySwing;

import java.awt.Container;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import myGroupId.mySwing.ButtonActionListener;


/**
 * @class
 *
 */
public class MySwingApplication implements Runnable {
  /**
   * @property
   */
  public JButton button;

  /**
   * @property
   */
  public JFrame frame;

  /**
   * @property
   */
  public JPanel panel;

  /**
   * @property
   */
  public JTextArea textArea;

  /**
   * @property
   */
  public Container container;

  /**
   * @construtor
   */
  public MySwingApplication() {
    this.button = new JButton();
    this.panel = new JPanel();
    this.frame = new JFrame();
    this.textArea = new JTextArea();
  }

  /**
  * @method
   */
  public static void main(String[] args) {
    MySwingApplication application = new MySwingApplication();
    SwingUtilities.invokeLater(application);
  }

  /**
   * @method
   */
  public void run() {
    this.frame.setTitle("my swing application");
    this.frame.setSize(300, 300);
    this.container = this.frame.getContentPane();

    this.button.setText("click");
    ButtonActionListener buttonActionListener = new ButtonActionListener(this.textArea);
    this.button.addActionListener(buttonActionListener);

    this.panel.add(this.button);
    this.panel.add(this.textArea);
    this.container.add(this.panel);
    this.frame.setVisible(true);
  }
}
