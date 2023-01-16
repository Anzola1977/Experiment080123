public class Main4 {

    public static void main(String[] args) throws InterruptedException {
//        Bank bank = new Bank();
//        while(true) {
//            System.out.println(bank.getMoney());
//            Thread.sleep(1000);
        ZooManager zooManager = new ZooManager();
        zooManager.put("Maksim", "zooManager");
        System.out.println(zooManager.get("Maksim"));


    }
}
