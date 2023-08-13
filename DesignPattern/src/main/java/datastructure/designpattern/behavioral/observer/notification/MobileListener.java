package datastructure.designpattern.behavioral.observer.notification;

public record MobileListener(String username) implements  Listener{
    @Override
    public void update(EventType eventType) {
        System.out.println("Sending mobile app notification to " + username + " concerning " + eventType);
    }
}
