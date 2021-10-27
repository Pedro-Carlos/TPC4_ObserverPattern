
import java.util.*;

public class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private String state;

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
      updateAllObservers();
   }

   public void addObserver(Observer observer){
      observers.add(observer);		
   }

   private void updateAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}