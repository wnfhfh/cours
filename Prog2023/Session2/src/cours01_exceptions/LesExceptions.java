package cours01_exceptions;

public class LesExceptions {
    public LesExceptions() {
        lancerUneExceptionV1();
        System.out.println("test");
    }

    private void lancerUneExceptionV1() {
        try {
            lancerUneException();
        }
        catch (RuntimeException e){
            System.out.println("Exception \n" + e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println("suite");
    }

    private void lancerUneException() {
        throw new RuntimeException("test exception"); //si on faisait IOException, on serait obligé de mettre try-catch/la traiter
    }

    public static void main(String[] args) {
        new LesExceptions();
    }
}
