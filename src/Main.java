
public class Main {
    public static void main(String[] args) {
        LogProcessor obj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        obj.log(LogProcessor.ERROR, "error message");
        obj.log(LogProcessor.DEBUG, "debug message");
        obj.log(LogProcessor.INFO, "info message");
    }
}