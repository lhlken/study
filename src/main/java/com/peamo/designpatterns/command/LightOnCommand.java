package com.peamo.designpatterns.command;

/**
 * @author hualong.li
 * @date 2018/8/28
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }
}
