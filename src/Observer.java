
public abstract class Observer {
   
	protected Subject subject;

	protected int MoneyReceived;
   
	public abstract void update();
	
	public abstract void getMoneyReceived();
}
