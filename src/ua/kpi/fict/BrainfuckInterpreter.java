/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kpi.fict;

/**
 *
 * @author Dima
 */
public class BrainfuckInterpreter {

    private final int MAX_CELLS = 256;
    private String program;
    private int[] memory;
    private int pointer;
    private StringBuffer result;
    private Commands[] commands;

    public BrainfuckInterpreter() {
        memory = new int[MAX_CELLS];
    }

    public void setProgram(String program) {
        this.program = program;
        commands = new Commands[program.length()];
        for (int i = 0; i < program.length(); i++) {
            commands[i] = Commands.parseChar(program.charAt(i));
        }
        result = new StringBuffer();
    }

    public void run() {
        if (program == null) {
            return;
        }

        for (Commands comm : commands) {
            switch (comm) {
                case INC: {
                    memory[pointer]++;
                    break;
                }
                case DEC: {
                    memory[pointer]--;
                    break;
                }
                case MOVE_LEFT: {
                    pointer--;
                    if (pointer < 0) {
                        pointer = MAX_CELLS - 1;
                    }
                    break;
                }
                case MOVE_RIGHT: {
                    pointer++;
                    if (pointer == MAX_CELLS) {
                        pointer = 0;
                    }
                    break;
                }
                case PRINT: {
                    result.append(new Character((char)memory[pointer]));
                    break;
                }

            }
        }
    }
    public StringBuffer getResult() {
        return result;
    }
}
