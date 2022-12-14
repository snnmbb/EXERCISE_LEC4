import java.time.LocalDate;

public class Admin extends User {
    @Override
    protected void doSomething() {
        System.out.println("Hello admin " +this.getName()+"!");
    }
   protected void doSomething(int n)
    {
        int time = 0 ;
        while(time < n )
        {
            super.doSomething();
            time++;
        }
    }
    public void doExtra(){
        if(getDob().equals(LocalDate.now()))
        {
            System.out.println("Happy birthday Admin!");
        }
    }
}
