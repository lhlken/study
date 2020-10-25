package com.peamo.designpatterns.command;

/**
 * @author hwalong
 * @date 2018/8/28
 */
public class RemoteControl {

    private Command[] commands = new Command[7];

    public RemoteControl() {
        for(int i = 0;i<this.commands.length;i++) {
            this.commands[i] = new NoCommand();
        }
    }

    public void setCommand(int i,Command command) {
        this.commands[i] = command;
    }

    public void pushButton(int i) {
        this.commands[i].execute();
    }
}
