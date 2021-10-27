
public class Employee extends Observer{

   public Employee(Subject subject){
      this.subject = subject;
      this.subject.addObserver(this);
      MoneyReceived = 0;
   }

   @Override
   public void update() {	
	   if(subject.getState().equals("SALARY")) {
		   System.out.println( "Give salary to employee: + 1000$" ); 
		   MoneyReceived += 1000;
	   }else if (subject.getState().equals("BONUS")) {
		   System.out.println( "Give bonus to employee: + 100$" ); 
		   MoneyReceived += 100; }
   }
    @Override
   public void getMoneyReceived() {
	   System.out.println( MoneyReceived ); 
   }
}
