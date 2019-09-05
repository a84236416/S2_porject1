package 第三章.第六题;

public class John {
    public void feed(mankind Chinese) {
        Chinese.show();
    }

    public mankind Choice(int typeid) {
        mankind man = null;
        if (typeid == 1) {
            man = new Chinese("中国", "王小强");
        } else if (typeid == 2) {
            man = new American("美国", "约翰");
        } else {
            System.out.println("你可能需要认识新的朋友！！！");
        }
        return man;
    }
}
