package org.example.designpattern.behavioral.observer.notification;

import java.util.*;

public class NotificationService {

    private final Map<EventType, List<Listener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(EventType.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(EventType eventType, Listener listener){
        customers.get(eventType).add(listener);
    }
    public void unSubscribe(EventType eventType, Listener listener){
        customers.get(eventType).remove(listener);
    }

    public void notifyCustomers(EventType eventType){
        customers.get(eventType).forEach(listener -> listener.update(eventType));
    }

}
