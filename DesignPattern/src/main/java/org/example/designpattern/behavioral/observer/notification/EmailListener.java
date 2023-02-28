package org.example.designpattern.behavioral.observer.notification;

public record EmailListener(String email) implements Listener{
    @Override
    public void update(EventType eventType) {
        System.out.println("Sending mail to " + email + " concerning " + eventType);
    }
}
