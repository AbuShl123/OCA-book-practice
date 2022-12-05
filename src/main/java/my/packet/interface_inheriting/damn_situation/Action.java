package my.packet.interface_inheriting.damn_situation;

public class Action extends Motion implements Moveable{
    /*
    as you can see no compilation errors are appearing there.
    Moveable interface has abstract method move() which has to be implemented by Action class.
    But since Action class also extends Motion, that already has a definition for method move()
    Action is not required to implement method move().
     */
}
