/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kpi.fict;

/**
 *
 * @author Dima
 */
public class View {
    private BrainfuckInterpreter interpreter;

    public View(BrainfuckInterpreter interpreter) {
        this.interpreter = interpreter;
    }
    public void printMessage(String message) {
        System.out.println(message);
    }
}
