public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setOwnerName("Alex");
        acc.setBalance(10000000);
        acc.setLocked(true);

        String locked = acc.isLocked() ? "lock" : "not locked";

        System.out.println(acc.getOwnerName() + " has " + acc.getBalance() + " and account is " + locked);

        System.out.println(Math.PI * 3.14);
    }
}
