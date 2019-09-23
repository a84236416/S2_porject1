public class Truck extends Vehicle {
    public Truck() {
        super();
    }

    public Truck(String name) {
        super(name);
    }

    public void TruckRum() {
        super.VehicleRum();
        VehicleRum();
    }

    @Override
    public void VehicleRum() {
        System.out.println("我觉得蛮好的" + getName());
    }
}
