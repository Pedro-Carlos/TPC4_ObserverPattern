
public class Main {
   public static void main(String[] args) {
      Subject subject = new Subject();

      Boss boss = new Boss(subject);
      Employee employee = new Employee(subject);
      
      subject.setState("SALARY");
      boss.getMoneyReceived();
      employee.getMoneyReceived();
      subject.setState("BONUS");
      boss.getMoneyReceived();
      employee.getMoneyReceived();
   }
}
