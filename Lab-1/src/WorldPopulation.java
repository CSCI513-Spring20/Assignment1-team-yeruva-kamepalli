import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {

	static Sortstrategy sortStrategy;
	long[] population = new long[13484]; 
    public WorldPopulation(){
			
	
		
		
	}
	
	public void readInputFile(){
		population = readPopulationFile("src\\WorldPopulation.csv");
		
		
	}
	 
	public void setStrategy(Sortstrategy strategy){
		sortStrategy = strategy;
	}
	
	
	public long[] readPopulationFile(String csvFile){
		 final String delimiter = ",";
			try {
				
		         File file = new File(csvFile);
		         FileReader fr = new FileReader(file);
		         BufferedReader br = new BufferedReader(fr);

		         String line = "";
		         String [] tempArr;
		         int i=0;
		         while((line = br.readLine()) != null) {
		        	 tempArr = line.split(delimiter);
		             population[i] =  Long.parseLong(tempArr[tempArr.length - 1]);
		          i++;
		         }
		         br.close();
		         } catch(IOException ioe) {
		            ioe.printStackTrace();
		         }
		return population;
	}
	
	
	public void sortPopulation(){	
		
        Bubblesort sort = new Bubblesort();
		sort.bubbleSort(population);
		long totalTime = sort.getSortTime();
		System.out.println("Total time for Bubble Sort : " +totalTime);
		
		
		Insertionsort sort1 = new Insertionsort();
		sort1.insertionSort(population);
		long totalTimeins = sort1.getSortTime();
		System.out.println("Total time for Insertion sort : " +totalTimeins);
	
		
		Selectionsort sort2 = new Selectionsort();
		sort2.Ssort(population);
		long totalTimesel = sort2.getSortTime();
		System.out.println("Total time for Selection sort : " +totalTimesel);
		
		
   }
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(sortStrategy); 
		worldPopulation.sortPopulation();	
	}

}
