package eg.edu.alexu.csd.datastructure.iceHockey;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.awt.*;

import org.junit.jupiter.api.Test;

class tests {

	@Test
	void test() {
		
		
		
		
		PlayerFinder pr = new PlayerFinder();
		java.awt.Point [] p1= pr.findPlayers(new String []
				{
						"33JUBU33",
						"3U3O4433",
						"O33P44NB",
						"PO3NSDP3",
						"VNDSD333",
						"OINFD33X"
				}, 3, 16);
		java.awt.Point [] p2 = new java.awt.Point [3] ;
		p2[0]=new Point();
		p2[1]=new Point();
		p2[2]=new Point();
		p2[0].setLocation(4,5);
		p2[1].setLocation(13,9);
		p2[2].setLocation(14,2);
				
		assertArrayEquals(p1, p2);
		
		
		
		
	
	}
	
	
	
	@Test
	void test1() {
		
		PlayerFinder pl = new PlayerFinder();
		java.awt.Point [] p1= pl.findPlayers(new String []
				{
						"44444H44S4",
						"K444K4L444",
						"4LJ44T44XH",
						"444O4VIF44",
						"44C4D4U444",
						"4V4Y4KB4M4",
						"G4W4HP4O4W",
						"4444ZDQ4S4",
						"4BR4Y4A444",
						"4G4V4T4444"
				}, 4, 16);
		java.awt.Point [] p2 = new java.awt.Point [6] ;
				p2[0]=new Point();
		p2[0]=new Point();
		p2[1]=new Point();
		p2[2]=new Point();
		p2[3]=new Point();
		p2[4]=new Point();
		p2[5]=new Point();

		
		p2[0].setLocation(3,8);
		p2[1].setLocation(4,16);
		p2[2].setLocation(5,4);
		p2[3].setLocation(16,3);
		p2[4].setLocation(16,17);
		p2[5].setLocation(17,9);
				
		assertArrayEquals(p1, p2);
	}
		
		
		
	
	
	@Test
	void test2() {
		
		PlayerFinder pl=new PlayerFinder();
		
		java.awt.Point [] p1= pl.findPlayers(new String []
				{
						"8D88888J8L8E888",
						"88NKMG8N8E8JI88",
						"888NS8EU88HN8EO",
						"LUQ888A8TH8OIH8",
						"888QJ88R8SG88TY",
						"88ZQV88B88OUZ8O",
						"FQ88WF8Q8GG88B8",
						"8S888HGSB8FT8S8",
						"8MX88D88888T8K8",
						"8S8A88MGVDG8XK8",
						"M88S8B8I8M88J8N",
						"8W88X88ZT8KA8I8",
						"88SQGB8I8J88W88",
						"U88H8NI8CZB88B8",
						"8PK8H8T8888TQR8"
				}, 8, 9);
		java.awt.Point [] p2 = new java.awt.Point [19];
		
		p2[0]=new Point();
		p2[1]=new Point();
		p2[2]=new Point();
		p2[3]=new Point();
		p2[4]=new Point();
		p2[5]=new Point();
		p2[6]=new Point();
		p2[7]=new Point();
		p2[8]=new Point();
		p2[9]=new Point();
		p2[10]=new Point();
		p2[11]=new Point();
		p2[12]=new Point();
		p2[13]=new Point();
		p2[14]=new Point();
		p2[15]=new Point();
		p2[16]=new Point();
		p2[17]=new Point();
		p2[18]=new Point();
		
		p2[0].setLocation(1,17);
		p2[1].setLocation(3,3);
		p2[2].setLocation(3,10);
		p2[3].setLocation(3,25);
		p2[4].setLocation(5,21);
		p2[5].setLocation(8,17);
		p2[6].setLocation(9,2);
		p2[7].setLocation(10,9);
		p2[8].setLocation(12,23);
		p2[9].setLocation(17,16);
		p2[10].setLocation(18,3);
		p2[11].setLocation(18,11);
		p2[12].setLocation(18,28);
		p2[13].setLocation(22,20);
		p2[14].setLocation(23,26);
		p2[15].setLocation(24,15);
		p2[16].setLocation(27,2);
		p2[17].setLocation(28,26);
		p2[18].setLocation(29,16);
		

		assertArrayEquals(p1, p2);
	}
		
		
		
		
		
	@Test
	void test3() {
		
		PlayerFinder pl=new PlayerFinder();

		java.awt.Point [] p1= pl.findPlayers(new String []
				{
						"11111",
						"1AAA1",
						"1A1A1",
						"1AAA1",
						"11111"
				}, 1, 3);
		java.awt.Point [] p2 = new java.awt.Point [2];
		
p2[0]=new Point();
		
		p2[0].setLocation(5,5);
p2[1]=new Point();
		
		p2[1].setLocation(5,5);
		assertArrayEquals(p1, p2);
		
		
		
		
		
		
		
		
	}	
		
		
		
		
	@Test
	void test4() {	
	
		
		PlayerFinder pl=new PlayerFinder();

		java.awt.Point [] p1= pl.findPlayers(new String []
				{
						
				}, 1, 3);
		
		assertArrayEquals(p1, null);
		
		
	

	
	
	
	}
	







	@Test
	void test5() {	
	
		
		PlayerFinder pl=new PlayerFinder();

		java.awt.Point [] actual= pl.findPlayers(new String [] {"9"}, 9,1);
		java.awt.Point [] expected = new java.awt.Point [] 
				{
				new java.awt.Point(1,1),
				};
		assertArrayEquals(expected, actual);
	
	}


	
	
	
	
	
	
	
	
	
	

	@Test
	void test6()
	{		PlayerFinder pl=new PlayerFinder();

		java.awt.Point [] actual= pl.findPlayers(new String [] {"99999","99999","99999","99999","99999"}, 9,5);
		java.awt.Point [] expected = new java.awt.Point [] 
				{
				new java.awt.Point(5,5),
				};
		assertArrayEquals(expected, actual);
	}
	
	
	
	
	
	
	

	@Test
	void test7()
	{		PlayerFinder pl=new PlayerFinder();

		java.awt.Point [] actual= pl.findPlayers(new String [] {"99","99"}, 9,7);
		java.awt.Point [] expected = new java.awt.Point [] 
				{
				new java.awt.Point(2,2),
				};
		assertArrayEquals(expected, actual);
	}



}
