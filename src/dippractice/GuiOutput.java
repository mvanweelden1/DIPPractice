package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Mark Van Weelden
 */
public class GuiOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
