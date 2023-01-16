public class Bank {

    private int money = 10000;

    int getMoney() {
        return money;
    }

    public void take(int money) {
        this.money -= money;
    }

    public void repay(int money) {
        this.money += money;
    }

    class Client extends Thread{
        @Override
        public void run() {
            while(money>0) {
                take(1000);
                repay(1000);
            }
        }
    }

    public Bank() {
        new Client().start();
        new Client().start();
        new Client().start();
    }
}