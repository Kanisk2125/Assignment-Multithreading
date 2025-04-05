class SafeStock {
    int stock = 1;

    public synchronized void buy() {
        if (stock > 0) {
            System.out.println(Thread.currentThread().getName() + " bought the item.");
            stock--;
        } else {
            System.out.println(Thread.currentThread().getName() + " found stock empty.");
        }
    }
}

class SafeBuyer extends Thread {
    SafeStock s;

    SafeBuyer(SafeStock s) {
        this.s = s;
    }

    public void run() {
        s.buy();
    }

    public static void main(String[] args) {
        SafeStock s = new SafeStock();
        SafeBuyer b1 = new SafeBuyer(s);
        SafeBuyer b2 = new SafeBuyer(s);
        b1.start();
        b2.start();
    }
}
