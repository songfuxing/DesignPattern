package com.songfuxing.patterns.order;

/**
 * 具体命令，通过它，发送者(remoteControl)可以和接受者(light解耦
 */
public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
