


	import java.util.Random;
	public class BattleShipSearch {
		
		// Searched hoizontally row by row 
		public void horizontalSweepStrategy(int[][] g) {	
			System.out.println("Strategy: Horizontal sweep");
			int boxnumber = 1;
			int shipscount = 1;
			for(int i=0;i<g.length;i++) {
				for(int j=0;j<g.length;j++) {
					if (g[i][j] != 0) {
						
		            shipscount++;
					}
					if(shipscount==8)
						break;
					boxnumber++;
					}								
			}
			System.out.println("Number of cells searched "+ boxnumber);
			
			
		}
	//searches randomly by picking the number randomly
	public void randomSearchStrategy(int[][] grid) {
		System.out.println("Strategy : Random Search ");
		int shipscount=1;
		int boxnumber=1;
		Random rand =  new Random();
		while(shipscount<=8) {
		int a = rand.nextInt(24);
		int b = rand.nextInt(24);
		
		if ((a <25) & (b <25)) {
			
			if(grid[a][b] != 0)
			{
				shipscount++;
			}
	}
		boxnumber++;
		
			}
		System.out.println("Number of cells searched "+ boxnumber);
		}
	
	//Efficient searching technique
	public static int Strategysearch(int[][] grid) {
		System.out.println("Strategy: Strategic Search");
		
		int[][] g1 = new int[25][25];
		int carrier = 0;
		int submarine =0;
		int x,y;
		Random rand =  new Random();
		int count =0;
		int[] carrier1 = new int[2];
		int[] submarine1 = new int[2];
		int boxnumber = 0;
		
	       while(count!=2) {                              //searches for submarines and carriers
			
			x = rand.nextInt(25);
			y = rand.nextInt(25);
			if(g1[x][y]!=1) {
				g1[x][y] =1;
				boxnumber++;
			if (grid[x][y] == 2 & submarine == 0) {
				submarine = 1;
				count++;
				submarine1[0] =x;
				submarine1[1] =y;
							}
			else if(grid[x][y] == 1 & carrier == 0) {
				carrier = 1;
				count++;
				carrier1 [0] =x;
				carrier1 [1] =y;
							}			
		
			}
		}
			
		return boxnumber;
		
	}
	
	}
