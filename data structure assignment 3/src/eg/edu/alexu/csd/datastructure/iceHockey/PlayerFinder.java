package eg.edu.alexu.csd.datastructure.iceHockey;

import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;


public class PlayerFinder implements IPlayerFinder {
	private int xmin;
	private int xmax;
	private int ymin;
	private int ymax;
	
	
	/**
	 * for points comparison
	 * @author OWNER
	 *
	 */
	
	 static class sortPoints implements Comparator<Point> {
	        
	        public int compare(Point p1, Point p2) {
	            return p1.x- p2.x;
	        }
	    }
	
	
	
	/**
	 * this function is used to determine the coordinates of the smallest box surrounding the player
	 * @param f number of row
	 * @param g  number of column
	 */
	 
	
	
	public void setcoordinates(int f, int g) {
		if (f<ymin) {
			ymin=f;
		}
		if (f >ymax) {
			ymax=f;
		}
		if(g >xmax) {
			xmax=g;
		}
		if (g < xmin) {
			xmin=g;
		}
	
	}
	
	
	
	
	
	
	public int calcArea(char arr[][],int m, int n, int i, int j, char k) {
		int flag=1,count=0;
		while(flag==1) {
			flag=0;
			for(int f=0; f<m; f++) {
				for(int g=0; g<n; g++) {
				  if (arr[f][g]=='-') {
					if ((f+1)<m) { 
				      if(arr[f+1][g]==k ) {
						arr[f+1][g]='-';
						setcoordinates(f+1,g);
						flag=1;
						count ++;
					}}
					 if((g+1)<n ) {
							if(arr[f][g+1]==k ) {
						arr[f][g+1]='-';
						setcoordinates(f,g+1);

						flag=1;
						count ++;
					}}
					if((f-1)>=0) { 
							if(arr[f-1][g]==k ) {
						arr[f-1][g]='-';
						setcoordinates(f-1,g);

						flag=1;
						count ++;
					}}
					if((g-1)>=0) { 
							if(arr[f][g-1]==k ) {
						arr[f][g-1]='-';
						setcoordinates(f,g-1);
						flag=1;
						count ++;
					}}
				  }}
			       }}
		return (count+1)*4;
}
	
	
	
	
	

public 	java.awt.Point[]  findPlayers(String[] photo, int team, int threshold){
		if(photo==null) {
			return null;
		}
		
		
		
		int m=photo.length;
        if (m==0){
        	return null;
        }
        int n=photo[0].length();
        int area;
        char[][]arr=new char[m][n];

        for(int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=photo[i].charAt(j);
        }}
        

        Point[] p=new Point[50];
        int pcount=0;

        char c=(char)(team+'0');
        
     
        
       for(int i=0;i<m;++i) {
            for (int j=0;j<n;++j){
                if(arr[i][j]==c){
                	arr[i][j]='-';
                	ymin=i ; ymax=i;
                	xmin=j;xmax=j;
                    area=calcArea(arr,m,n,i,j,c);
                    if(area>=threshold) {
                	  
                 	p[pcount]=new Point();
                    p[pcount].setLocation(((2*xmin+2*xmax)/2)+1,((2*ymin+2*ymax)/2)+1);
                	pcount++;
                	}
                } } }

       Arrays.sort(p,0,pcount,new sortPoints());
       Point[] p2=new Point[pcount];
       System.arraycopy(p,0,p2,0,pcount); 
   
		
		
		return p2;
	}

}
