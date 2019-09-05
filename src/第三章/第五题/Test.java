package 第三章.第五题;

public class Test {
    public static void main(String[] args) {
        printer p = new DotMatrixPrinter("打印机", "针式");
        p.print();
        printer p1 = new LaserPrinter("打印机", "喷墨");
        p1.print();
        printer p2 = new lnkperPrinter("打印机", "激光");
        p2.print();
    }
}
