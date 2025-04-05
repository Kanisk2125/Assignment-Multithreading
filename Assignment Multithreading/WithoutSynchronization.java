class SharedStock {
    static int stock = 1;
}

class Buyer extends Thread {
    public void run() {
        if (SharedStock.stock > 0) {
            System.out.println(Thread.currentThread().getName() + " bought the item.");
            SharedStock.stock--;
        } else {
            System.out.println(Thread.currentThread().getName() + " found stock empty.");
        }
    }

    public static void main(String[] args) {
        Buyer b1 = new Buyer();
        Buyer b2 = new Buyer();
        b1.start();
        b2.start();
    }
}
