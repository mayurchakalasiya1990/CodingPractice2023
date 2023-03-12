package org.example.collection;

import java.util.ArrayList;
import java.util.Collections;

public class UnmodifiableList {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        list = (ArrayList) Collections.unmodifiableCollection(list);
        list.add(4);

    }

}

