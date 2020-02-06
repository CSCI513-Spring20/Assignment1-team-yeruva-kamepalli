	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.util.Arrays;
	import java.util.StringTokenizer;

	public class BattleShip {
		String key1,key2;
		static int temp = 1;
		int carrier =  1;                                            // Carrier
		int subMarine = 2;                                          // Submarine
		static int[][] g1 = new int[25][25];                        //Stores the grid details
		static int[][] g2 = new int[25][25];
		static int[][] g3 = new int[25][25];
	
		
	   public void Shipposition()                                  
	   {
			String[] initialcarrier1 = new String[10];
			String[] endcarrier1 = new String[10];
			String[] initialsub1 = new String[10];
			String[] endsub1 = new String[10];
			
			String[] initialcarrier2 = new String[10];
			String[] endcarrier2 = new String[10];
			String[] initialsub2 = new String[10];
			String[] endsub2 = new String[10];
			
			String[] initialcarrier3 = new String[10];
			String[] endcarrier3 = new String[10];
			String[] initialsub3 = new String[10];
			String[] endsub3 = new String[10];
			try {
				FileReader inputFile = new FileReader("src/inputfile.txt");   //reads input file
				BufferedReader reader = new BufferedReader(inputFile);
				String line;

				while((line = reader.readLine()) != null) {
					StringTokenizer tokenizer = new StringTokenizer(line, "(,)") ; //Tokeizes the coordinates
					for(int i =0;i<8;i++) {
						
					    key1 = tokenizer.nextToken();
						key2 = tokenizer.nextToken();
						//System.out.println(key1);
						//System.out.println(key2);
						
						
						if(i<5) {
							if (temp == 1) {
							if(i==0)
							{
								initialcarrier1[0] = key1;
								initialcarrier1[1] = key2;
								
							}
							else if(i==4)
							{
								endcarrier1[0] = key1;
								endcarrier1[1] = key2;
							}
							g1[Integer.parseInt(key1)][Integer.parseInt(key2)] = carrier;	
							}
							else if(temp == 2) {
								if(i==0)
								{
									initialcarrier2[0] = key1;
									initialcarrier2[1] = key2;
									
								}
								else if(i==4)
								{
									endcarrier2[0] = key1;
									endcarrier2[1] = key2;
								}
								g2[Integer.parseInt(key1)][Integer.parseInt(key2)] = carrier;
							}
							else if (temp == 3){
								if(i==0)
								{
									initialcarrier3[0] = key1;
									initialcarrier3[1] = key2;
									
								}
								else if(i==4)
								{
									endcarrier3[0] = key1;
									endcarrier3[1] = key2;
								}
								g3[Integer.parseInt(key1)][Integer.parseInt(key2)] = carrier;
								
							}
								
						}
						else {
							if(temp ==1) {
								if(i==5)
								{
									initialsub1[0] = key1;
									initialsub1[1] = key2;
									
								}
								else if(i==7)
								{
									endsub1[0] = key1;
									endsub1[1] = key2;
								}
							g1[Integer.parseInt(key1)][Integer.parseInt(key2)] = subMarine;
							
						}
							else if(temp == 2) {
								if(i==5)
								{
									initialsub2[0] = key1;
									initialsub2[1] = key2;
									
								}
								else if(i==7)
								{
									endsub2[0] = key1;
									endsub2[1] = key2;
								}
								g2[Integer.parseInt(key1)][Integer.parseInt(key2)] = subMarine;
							}
							else if(temp == 3) {
								if(i==5)
								{
									initialsub3[0] = key1;
									initialsub3[1] = key2;
									
								}
								else if(i==7)
								{
									endsub3[0] = key1;
									endsub3[1] = key2;
								}
								g3[Integer.parseInt(key1)][Integer.parseInt(key2)] = subMarine;
								
							}
						
						}
					
						}
					temp++;
					
						
				 }
				reader.close();
				} catch (Exception e) {
				e.printStackTrace();
				
				}
			print(initialcarrier1,endcarrier1,initialsub1,endsub1,initialcarrier2,endcarrier2,initialsub2,endsub2,initialcarrier3,endcarrier3,initialsub3,endsub3);
			
		}

	   public static void print(String[] initialcarrier1,String[] endcarrier1,String[] initialsub1,String[] endsub1,String[] initialcarrier2,String[] endcarrier2,String[] initialsub2,String[] endsub2,String[] initialcarrier3,String[] endcarrier3,String[] initialsub3,String[] endsub3)
	   {
			int shipCells;
		   BattleShipSearch ships = new BattleShipSearch();
			
			// Game 1
			
			ships.horizontalSweepStrategy(g1); //calls horizontal search strategy by passing the game1
			System.out.println("Carrier found: ("+initialcarrier1[0]+","+initialcarrier1[1]+") to ("+endcarrier1[0]+","+endcarrier1[1]+")  Submarine found: (" +initialsub1[0]+","+initialsub1[1]+") to ("+endsub1[0]+","+endsub1[1]+")");
			ships.randomSearchStrategy(g1);    // calls randon search strategy by passing the game1
			System.out.println("Carrier found: ("+initialcarrier1[0]+","+initialcarrier1[1]+") to ("+endcarrier1[0]+","+endcarrier1[1]+")  Submarine found: (" +initialsub1[0]+","+initialsub1[1]+") to ("+endsub1[0]+","+endsub1[1]+")");
			shipCells = BattleShipSearch.Strategysearch(g1); //calls strategy search by passing the game1
			System.out.println("Number of cells searched "+ shipCells);
			System.out.println("Carrier found: ("+initialcarrier1[0]+","+initialcarrier1[1]+") to ("+endcarrier1[0]+","+endcarrier1[1]+")  Submarine found: (" +initialsub1[0]+","+initialsub1[1]+") to ("+endsub1[0]+","+endsub1[1]+")");
			
			// Game 2
			
			ships.horizontalSweepStrategy(g2); //calls horizontal search strategy by passing the game2
			System.out.println("Carrier found: ("+initialcarrier2[0]+","+initialcarrier2[1]+") to ("+endcarrier2[0]+","+endcarrier2[1]+")  Submarine found: (" +initialsub2[0]+","+initialsub2[1]+") to ("+endsub2[0]+","+endsub2[1]+")");
			ships.randomSearchStrategy(g2); // calls random search strategy by passing the game2
			System.out.println("Carrier found: ("+initialcarrier2[0]+","+initialcarrier2[1]+") to ("+endcarrier2[0]+","+endcarrier2[1]+")  Submarine found: (" +initialsub2[0]+","+initialsub2[1]+") to ("+endsub2[0]+","+endsub2[1]+")");
			shipCells = BattleShipSearch.Strategysearch(g2); //calls strategy search by passing the game2
			System.out.println("Number of cells searched "+ shipCells);
			System.out.println("Carrier found: ("+initialcarrier2[0]+","+initialcarrier2[1]+") to ("+endcarrier2[0]+","+endcarrier2[1]+")  Submarine found: (" +initialsub2[0]+","+initialsub2[1]+") to ("+endsub2[0]+","+endsub2[1]+")");
		
			
			// Game 3
			
			ships.horizontalSweepStrategy(g3);//calls horizontal search strategy by passing the game3
			System.out.println("Carrier found: ("+initialcarrier3[0]+","+initialcarrier3[1]+") to ("+endcarrier3[0]+","+endcarrier3[1]+")  Submarine found: (" +initialsub3[0]+","+initialsub3[1]+") to ("+endsub3[0]+","+endsub3[1]+")");
			ships.randomSearchStrategy(g3); // calls random search strategy by passing the game3
			System.out.println("Carrier found: ("+initialcarrier3[0]+","+initialcarrier3[1]+") to ("+endcarrier3[0]+","+endcarrier3[1]+")  Submarine found: (" +initialsub3[0]+","+initialsub3[1]+") to ("+endsub3[0]+","+endsub3[1]+")");
			shipCells = BattleShipSearch.Strategysearch(g3); //calls strategy search by passing the game3
			System.out.println("Number of cells searched "+ shipCells);
			System.out.println("Carrier found: ("+initialcarrier3[0]+","+initialcarrier3[1]+") to ("+endcarrier3[0]+","+endcarrier3[1]+")  Submarine found: (" +initialsub3[0]+","+initialsub3[1]+") to ("+endsub3[0]+","+endsub3[1]+")");
			
	   }
		public static void main(String[] args) {
	
			BattleShip battleShip = new BattleShip();
			battleShip.Shipposition();	
			
			
		}

	}


