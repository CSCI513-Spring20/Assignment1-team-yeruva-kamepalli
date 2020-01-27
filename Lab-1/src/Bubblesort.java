
import java.util.Timer;
import java.util.TimerTask;


public class Bubblesort {
	public static Timer timer;
	long totalTime;
	 long startTime;
	 long endTime;
public void bubbleSort(long[] population)
{
		 startTime = System.currentTimeMillis();
 for(int i=(population.length-1);i>=0;i--)
 {
	 for(int j=1;j<=i;j++)
	 {
		 if(population[j-1]>population[j])
		 {
			 long temp=population[j-1];
			 population[j-1]=population[j];
			 population[j]=temp;
		 }
	 }
 }
 endTime = System.currentTimeMillis();
}

 public long getSortTime()
 {   
	   
	   return totalTime= endTime-startTime;
 }
 
 public void resetTimer() {
	 TimerTask timerTask = new TimerTask() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	
	 };
	 timer = new Timer();
	 timer.schedule(timerTask, 1000);
}
 

 
 
 public String strategyName()
 {
	 
	return "Bubble Sort";
	 
 }
}
