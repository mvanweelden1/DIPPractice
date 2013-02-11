package dippractice;

/**
 *
 * @author Mark Van Weelden
 */
public class ConsoleOutput implements OutputStrategy {
    
    @Override
    public void outputMsg(String msg){
        System.out.println(msg);
    }
}
