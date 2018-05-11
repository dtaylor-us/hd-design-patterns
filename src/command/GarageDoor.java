package command;

public class GarageDoor {
    private String location = "";

    public GarageDoor() {
    }

    public GarageDoor(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " garage door is open");
    }

    public void off() {
        System.out.println(location + " garage door is off");
    }
}