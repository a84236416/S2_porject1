package 第三章.第五题;

public class LaserPrinter extends printer {
    private String laser;

    public String getLaser() {
        return laser;
    }

    public void setLaser(String laser) {
        this.laser = laser;
    }

    public LaserPrinter(String Printer, String laser) {
        super(Printer);
        this.laser = laser;

    }

    @Override
    public void print() {
        System.out.println("我是" + this.laser + "," + this.getPrinte());
    }
}
