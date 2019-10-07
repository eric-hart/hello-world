package myGroupId.mySwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

/**
 * @class
 */
class ButtonActionListener implements ActionListener {
  JTextArea textArea;

  /**
   * @method
   */
  public ButtonActionListener(JTextArea textArea) {
    this.textArea = textArea;
  }

  /**
   * @method
   */
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    if (command.contentEquals("click")) {
      textArea.setText("Hello World!");
    }
  }
}
