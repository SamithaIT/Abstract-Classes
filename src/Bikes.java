abstract class Bikes {
    Bikes(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear changed");
    }
}
class Honda extends Bikes{
    @Override
    void run() {
        System.out.println("Running 80kmph");
    }
}
class TestAbstraction1{
    public static void main(String[] args) {
        Bikes b=new Honda();
        b.run();
        b.changeGear();
    }
}
