package 第三章.第六题;

public class American extends mankind {
    private String name;
    String pizza = "披萨";
    String rugby = "橄榄球";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public American(String region, String name) {
        super(region);
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(this.getRegion() + "的" + this.name + "喜欢吃" + this.pizza + "打" + this.rugby);
    }
}
