package dippractice;

/**
 *
 * @author Mark Van Weelden
 */
public class MessageService {
    
    
    
    public void outputMsg(OutputStrategy out, InputStrategy in){
        
        String msg = in.getInput();
        
        out.outputMsg(msg);
    }
    
}
