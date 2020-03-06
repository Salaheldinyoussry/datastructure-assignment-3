package eg.edu.alexu.csd.datastructure.iceHockey;

import java.awt.Point;

public class main {

	public static void main(String[] args) {

		
		
		
		   PlayerFinder l = new PlayerFinder();
		   	 String[] g= new String[]{ "44444H44S4", "K444K4L444", "4LJ44T44XH", "444O4VIF44", "44C4D4U444", "4V4Y4KB4M4", "G4W4HP4O4W", "4444ZDQ4S4", "4BR4Y4A444", "4G4V4T4444"};
		   	

		   	 
		   	 
		   	 
		   	Point[] p= l.findPlayers(g, 4, 16);
		   	
		   

  if(p!=null) {
		   	
		   	for (int i=0; i<p.length; i++) {
		   		if(p[i]!=null) {
		   		System.out.println(p[i].x);
		   		System.out.println(p[i].y);
		   		System.out.println(" ");

		   		}
		   	
		   	}
		   	}
		
	}
		
		
		
		
		
		
	}


