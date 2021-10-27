
public class Boss extends Observer{
	
   public Boss(Subject subject){
      this.subject = subject;
      this.subject.addObserver(this);
      MoneyReceived = 0;
   }


   @Override
   public void update() {	
	   if(subject.getState().equals("SALARY")) {
		   System.out.println( "Give salary to boss: + 2000$" ); 
		   MoneyReceived += 2000;
	   }else if (subject.getState().equals("BONUS")) {
		   System.out.println( "Give bonus to boss: + 200$" ); 
		   MoneyReceived += 200; }
   }
    @Override
   public void getMoneyReceived() {
	   System.out.println( MoneyReceived ); 
   }
}