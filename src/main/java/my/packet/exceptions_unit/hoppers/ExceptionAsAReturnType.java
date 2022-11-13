package my.packet.exceptions_unit.hoppers;

public class ExceptionAsAReturnType {

    public Exception method() {
        return new Exception();// wtf
    }
}
