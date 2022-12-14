public class Main {
    public static void main(String[] args) {
        Admin nicolas = new Admin();
        nicolas.setName("Nicolas");
        nicolas.setDob(1964 , 1 ,7);
        nicolas.doSomething();
        nicolas.doSomething(3);

        Admin peter = new Admin();
        peter.setName("Peter");
        peter.doExtra();
  }
}