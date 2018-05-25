import java.util.*;

public class Solutions
{
	public static boolean JudgeRouteCircle(String moves){
		char[] a= moves.toCharArray();
		int x=0,y=0;
		for(char item:a){
			switch(item){
				case 'U':y++;break;
				case 'D':y--;break;
				case 'L':x--;break;
				case 'R':x++;break;
			}
		}
		if(x==0 & y==0)
			return true;
		else
			return false;
	}
	
/*----------------------------------------------------------------------------*/	
	
	public int numJewelsInStones(String J, String S) {
		int nums=0;
		
		return nums;
	}
}
