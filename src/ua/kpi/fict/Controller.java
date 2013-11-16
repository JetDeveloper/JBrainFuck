/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kpi.fict;

import java.util.Scanner;

/**
 *
 * @author Dima
 */
public class Controller {
   private BrainfuckInterpreter interpreter;
   private View consoleView;
   private String program;

    public Controller(BrainfuckInterpreter interpreter, View consoleView) {
        this.interpreter = interpreter;
        this.consoleView = consoleView;
    }
    public void readProgramFromKeyboard(){
        consoleView.printMessage("Please, input program:");
        Scanner scanner = new Scanner(System.in);
        program = scanner.nextLine();
        interpreter.setProgram(program);
        interpreter.run();
        consoleView.printMessage("Result:");
        consoleView.printMessage(interpreter.getResult().toString());
    }
   
}
