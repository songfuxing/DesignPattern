package com.songfuxing.patterns.order;

/**
 * 具体命令，通过它，发送者(remoteControl)可以和接受者(light解耦
 */
public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
