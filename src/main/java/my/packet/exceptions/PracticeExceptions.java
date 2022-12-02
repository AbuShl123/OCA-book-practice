package my.packet.exceptions;

import java.io.IOException;
import java.util.zip.ZipException;

public class PracticeExceptions {
    public void throwsException() throws IOException {

    }
}

class Child extends PracticeExceptions {
    @Override
    public void throwsException() throws RuntimeException, ZipException {

    }

    public void ohNO() throws IOException{

    }
}
