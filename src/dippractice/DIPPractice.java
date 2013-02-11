package dippractice;

/**
 *
 * @author Mark Van Weelden
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OutputStrategy outStrategy = new GuiOutput();
        
        InputStrategy inputStrategy = new KeyboardInput();
        
        MessageService msgService = new MessageService();
        
        msgService.outputMsg(outStrategy, inputStrategy);
    }
}
