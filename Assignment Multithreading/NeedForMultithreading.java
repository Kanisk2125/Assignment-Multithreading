class OrderProcessor extends Thread {
    private String orderName;

    public OrderProcessor(String orderName) {
        this.orderName = orderName;
    }

    public void run() {
        System.out.println(orderName + " started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(orderName + " completed by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        OrderProcessor o1 = new OrderProcessor("Order 1");
        OrderProcessor o2 = new OrderProcessor("Order 2");
        o1.start();
        o2.start();

        try {
            o1.join();
            o2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + "ms");
    }
}
