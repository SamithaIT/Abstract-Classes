abstract class Bike {
    abstract void run();
}
class HondaCB extends Bike{
    @Override
    void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Bike b=new HondaCB();
        b.run();
    }
}
