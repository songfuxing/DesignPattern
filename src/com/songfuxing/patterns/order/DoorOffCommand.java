package com.songfuxing.patterns.order;

/**
 * 具体命令，通过它，发送者(remoteControl)可以和接受者(door)解耦
 */
public class DoorOffCommand implements Command {

    private Door door;

    public DoorOffCommand(Door door) {
        this.door = door;
    }

    public void execute() {
        door.off();
    }

    public void undo() {
        door.on();
    }
}
