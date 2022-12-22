abstract class Bank {
    abstract int getRateOfInterest();
}
class BOC extends Bank{
    @Override
    int getRateOfInterest() {
        return 20;
    }
}
class HNB extends Bank{
    @Override
    int getRateOfInterest() {
        return 21;
    }
}
class Test{
    public static void main(String[] args) {
        Bank b;
        b=new BOC();
        System.out.println("BOC rate: "+b.getRateOfInterest()+"%");
        b=new HNB();
        System.out.println("HNB rate: "+b.getRateOfInterest()+"%");

    }
}
