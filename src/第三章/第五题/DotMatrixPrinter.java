package 第三章.第五题;

public class DotMatrixPrinter extends printer {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DotMatrixPrinter(String Printer, String type) {
        super(Printer);
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("我是" + this.type + "," + this.getPrinte());
    }
}


