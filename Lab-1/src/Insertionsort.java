import java.util.Timer;
import java.util.TimerTask;

public class Insertionsort {
	public static Timer timer;
	long totalTime;
	 long startTime;
	 long endTime;
 public void insertionSort(long[] population)
 {
	 startTime = System.currentTimeMillis();
	for(int i=1;i<population.length;i++) 
	{
		int index=(int) population[i];int j=i;
		while(j>0 && population[j-1]>index)
		{
			population[j]=population[j-1];
			j--;
			
		}
		population[j]=index;
	}
	 endTime = System.currentTimeMillis();
 }
 
 public long getSortTime()
 {   
	  
	   return totalTime= endTime-startTime;
 }
 
 public String strategyName()
 {
	 
	return "Bubble Sort";
	 
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
 
 }
