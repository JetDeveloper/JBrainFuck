/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kpi.fict;

/**
 *
 * @author Dima
 */
public enum Commands {

    
    //TODO: cycles '['  ']'
    NOP(0), MOVE_LEFT(1), MOVE_RIGHT(2), PRINT(3), INPUT(4), INC(5), DEC(6);
    private int type;

    public int getType() {
        return type;
    }

    private Commands(int type) {
        this.type = type;
    }

    public static Commands parseChar(char command) {
        switch (command) {
            case '>':
                return Commands.MOVE_RIGHT;
            case '<':
                return Commands.MOVE_LEFT;
            case '+':
                return Commands.INC;
            case '-':
                return Commands.DEC;
            case '.': 
                return Commands.PRINT;
            case ',':
                return Commands.INPUT;
            default:
                return Commands.NOP;
        }
    }
}
