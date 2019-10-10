package 练习.xxx;

public class PersonB extends Thread{
    Bank bank;
    String mode;
    public PersonB(Bank bank, String mode) {
        this.bank = bank;
        this.mode = mode;
    }
    public void run() {
        while (bank.money >= 100) {
            try {
                bank.outMoney(100, mode);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
