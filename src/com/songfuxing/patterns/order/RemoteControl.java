package com.songfuxing.patterns.order;

/**
 * 调用者，有commands集合，invoker，通过对command操作来影响接收者
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        Command noCommand = new NoCommand();

        for(int i = 0; i < 3; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand ;
        }
        undoCommand = noCommand;
    }

    // invoker
    // 把命令赋给调用者
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] =  onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoPushed(int slot) {
        undoCommand.undo();
    }
}
