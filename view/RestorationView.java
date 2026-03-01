package view;

public class RestorationView {

    public void displayImageInfo(String path, String format) {
        System.out.println("--- Image Details ---");
        System.out.println("Path: " + path);
        System.out.println("Format: " + format);
        System.out.println("----------------------");
    }

    public void showStatus(String message) {
        System.out.println("[System Status]: " + message);
    }
}
