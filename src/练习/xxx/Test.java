package 练习.xxx;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        PersonA a = new PersonA(bank, "Counter");
        PersonB b = new PersonB(bank, "ATM");
        a.start();
        b.start();
    }
}
