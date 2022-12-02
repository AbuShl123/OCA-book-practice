package my.packet.exceptions;

public class CanWeHandleErrors {
    public void ohNo() {
        // can we throw errors?
        throw new ExceptionInInitializerError();
        // but we're not required to handle them
    }

    public void ohNo(int param) throws ExceptionInInitializerError {
        // we can declare them though
    }

    public void badThings() {
        try {
            int a = 0;
            throw new ExceptionInInitializerError();
        } catch (StackOverflowError e) {
            System.out.println("That's error");
        } catch (RuntimeException e) {
            System.out.println("that's runtime");
        } catch (Error e){
            System.out.println("unexpected error I guess");
        }//catch (InterruptedException e) {} that's compilation error:)
        finally {
            System.out.println("finally");
        }

        try {
            System.out.println("trying to do something");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
