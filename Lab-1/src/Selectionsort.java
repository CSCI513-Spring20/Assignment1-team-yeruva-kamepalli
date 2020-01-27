import java.util.Timer;
import java.util.TimerTask;

public class Selectionsort {
	public static Timer timer;
	public Selectionsort()
	{
		
	}
	long totalTime;
	 long startTime;
	 long endTime;
	
	public void Ssort(long[] population)
	{
		startTime = System.currentTimeMillis();
		int length1 = population.length-1;
		for(int i=0;i<length1;i++)
		{
			 int min = i;
		      for (int j = i+1; j<length1;j++)
		      {
		            if (population[j] < population[min])
		            {
		            	min = j;
		            }
		      }  
		      int temp = (int) population[i];
		      population[i] = population[min];
			
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
