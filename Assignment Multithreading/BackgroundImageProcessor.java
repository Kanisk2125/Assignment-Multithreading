public class BackgroundImageProcessor extends Thread {
    public void run() {
        try {
            Thread.sleep(2000); // Simulate heavy processing
            System.out.println("Image processed in background by " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("UI rendering started...");

        BackgroundImageProcessor bg = new BackgroundImageProcessor();
        bg.start();

        System.out.println("User can interact with UI meanwhile...");
    }
}
