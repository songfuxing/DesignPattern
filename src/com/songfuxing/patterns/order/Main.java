package com.songfuxing.patterns.order;

/**
 * Created by songfuxing on 2018/7/31.
 */
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light roomLight = new Light("Living Room");
        Light kitchen = new Light("Kitchen");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(roomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchen);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(roomLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchen);
        Door door = new Door("door");
        DoorOnCommand doorOnCommand = new DoorOnCommand(door);
        DoorOffCommand doorOffCommand = new DoorOffCommand(door);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, doorOnCommand, doorOffCommand);


        remoteControl.onButtonPushed(1);
        remoteControl.undoPushed(1);
    }
}
