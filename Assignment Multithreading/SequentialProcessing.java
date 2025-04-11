public class SequentialProcessing {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
            System.out.println("Order 1 processed");
            Thread.sleep(1000);
            System.out.println("Order 2 processed");
        } catch (Exception e) {}
        long end = System.currentTimeMillis();
        System.out.println("Total Time Taken: " + (end - start) + "ms");
    }
}
