package org.example.codeClasses;

import java.util.LinkedList;

public class UsingLinkList {

    public void creatingLinkedList() {
        LinkedList ll = new LinkedList();

        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }

}
