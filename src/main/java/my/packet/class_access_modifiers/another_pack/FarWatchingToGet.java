package my.packet.class_access_modifiers.another_pack;

//  import my.packet.class_access_modifiers.DefaultAccessClass; doesn't work -- because it is default access

import my.packet.class_access_modifiers.CloseWatchingToGet;

public class FarWatchingToGet {
    // DefaultAccessClass obj;
    // since FarWatchingToGet is in the another package in cannot access to DefaultAccessClass
    public void anyWantToGet() {
        CloseWatchingToGet close = new CloseWatchingToGet();
        System.out.println(close.defaultAccessClass); // ha-ha! by declaring a reference that's class has
        // a defaultAccessClass as one of its fields we can actually access the instance of defaultAccessClass.

//      close.defaultAccessClass.text; // none of the fields or methods are accessible though


        // but... can we use encapsulation???
        close.printText();
        String $_$ = close.getText();
        // yes
    }
}
