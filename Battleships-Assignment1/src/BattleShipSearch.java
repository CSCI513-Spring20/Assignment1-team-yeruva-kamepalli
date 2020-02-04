


	import java.util.Random;
	public class BattleShipSearch {
		
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
	
	public static int Strategysearch(int[][] g1) {
		System.out.println("Strategy: Strategic Search");
		int count = 0;
		int shipCells = 1;
		for(int i=0;i<25;i++) {
		for(int j=0;j<25;j++) {
		if(g1[i][j] != 0) {
		count = search(i,j,g1,count);
		count++;
		}
		if(count==8) break;
		shipCells++;
		}
		}

		return shipCells;
		}
		public static int search(int i,int j,int[][] g1,int count) {
		
		if( i>=2 && j>=2 && i<24 && j<24) {
		
	
		if(g1[i][j-1] != 0) {
		count++;
	
		}
		if(g1[i][j+1] != 0) {
		count++;
	
		}
		if(g1[i+1][j-1] != 0) {
		count++;
	
		}
		if(g1[i+1][j] != 0) {
		count++;
		
		}
		if(g1[i+1][j+1] != 0) {
		count++;
	
		}

		}
		

		return count;
		}
}