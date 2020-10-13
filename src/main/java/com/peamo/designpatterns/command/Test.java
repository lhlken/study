package com.peamo.designpatterns.command;

/**
 * @author hualong.li
 * @date 2018/8/28
 */
public class Test {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0,lightOnCommand);
        remoteControl.setCommand(1,lightOffCommand);

        remoteControl.pushButton(0);
        remoteControl.pushButton(1);
    }
}
