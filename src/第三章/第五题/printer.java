package 第三章.第五题;

public abstract class printer {
    public String Printer;

    public String getPrinte() {
        return Printer;
    }

    public void setPrinte(String printe) {
        Printer = printe;
    }

    public printer(String printer) {
        this.Printer = printer;
    }

    public abstract void print();
}
