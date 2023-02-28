package org.example.designpattern.behavioral.observer.notification;
import static org.example.designpattern.behavioral.observer.notification.EventType.*;

public class MainApp {
    public static void main(String[] args) {
        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailListener("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailListener("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailListener("geekific@subs.com"));
        store.getService().subscribe(NEW_ITEM, new MobileListener("GeekificLnS"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unSubscribe(SALE, new EmailListener("geekific@like.com"));
        store.salePromotion();
    }
}
