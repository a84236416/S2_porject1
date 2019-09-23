package 第三章.第六题;

public class Chinese extends mankind{
    private String name;
    String cuisine="四川菜";
    String boxing="太极拳";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  Chinese(String region,String name){
        super(region);
        this.name=name;
    }
    @Override
    public void show(){
        System.out.println(this.getRegion()+"的"+this.name+"喜欢吃"+this.cuisine+"练"+this.boxing);
    }
}
