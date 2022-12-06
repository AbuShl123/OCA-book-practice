package my.packet.exceptions;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            new ExceptionHandling().hello();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    void hello() throws IOException {
        throw new IOException("exception from hello() method!");
    }
}
