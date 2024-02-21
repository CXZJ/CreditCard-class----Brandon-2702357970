public class Main {
    public static void main(String[] args) {
        CreditCard cd = new CreditCard("Joe", "BCA", "abc", 500000, 8000000);

        System.out.println(cd.getCustomer());
        System.out.println(cd.getBank());
        System.out.println(cd.getAccount());
        System.out.println(cd.getLimit());
        System.out.println(cd.getBalance());
        System.out.println(cd.charge(100000));
        cd.makePayment(50000);
        System.out.println(cd.getBalance());

    }
}