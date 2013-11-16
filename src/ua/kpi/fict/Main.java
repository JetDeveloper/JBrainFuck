/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kpi.fict;

/**
 *
 * @author Dima
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BrainfuckInterpreter interpreter = new BrainfuckInterpreter();
        View consoleView = new View(interpreter);
        Controller controller = new Controller(interpreter, consoleView);
        
        controller.readProgramFromKeyboard();
    }
}
