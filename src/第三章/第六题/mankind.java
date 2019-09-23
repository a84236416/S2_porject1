package 第三章.第六题;

public abstract class mankind {
    private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public mankind(String region) {
        this.region = region;
    }

    public abstract void show();
}
