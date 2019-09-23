package 第三章.第五题;

public class lnkperPrinter extends printer {
    private String linkjet;

    public String getLinkjet() {
        return linkjet;
    }

    public void setLinkjet(String linkjet) {
        this.linkjet = linkjet;
    }

    public lnkperPrinter(String Printer, String linkjet) {
        super(Printer);
        this.linkjet = linkjet;
    }

    @Override
    public void print() {
        System.out.println("我是" + this.linkjet + "," + this.getPrinte());
    }
}
