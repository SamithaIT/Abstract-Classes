abstract class Language {
    public void display(){
        System.out.println("This is Java");
    }
}
class Main extends Language{
    public static void main(String[] args) {
        Main m=new Main();
        m.display();
    }
}
