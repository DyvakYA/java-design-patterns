package behavioral.chainOfResponsibility;

public class FileLogger extends Logger {

    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("Write to the file: " + message);
    }
}
