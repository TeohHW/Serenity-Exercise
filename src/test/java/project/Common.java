package project;

public class Common {
    public static <MobileElement, MobileDriver> void timeout(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Preserve interrupted status
            System.err.println("Sleep interrupted: " + e.getMessage());
        }

    }
}



