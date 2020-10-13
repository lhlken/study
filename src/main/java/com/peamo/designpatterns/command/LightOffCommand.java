package com.peamo.designpatterns.command;

/**
 * @author hualong.li
 * @date 2018/8/28
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }
}
