public class Vehicle {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
public  Vehicle(){

}
    public Vehicle(String name) {
        this.name = name;
    }
    public void VehicleRum () {
        System.out.println("汽车正在行驶");
    }
}
