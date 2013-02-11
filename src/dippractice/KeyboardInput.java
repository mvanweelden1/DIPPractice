package dippractice;

import java.util.Scanner;

/**
 *
 * @author Mark van Weelden
 */
public class KeyboardInput implements InputStrategy{

    @Override
    public String getInput() {
        System.out.println("Please enter some text, then press return:");

            Scanner keyboard = new Scanner(System.in);
            return keyboard.nextLine();
    }
    

    
    
    
}
