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
	
	public static int numJewelsInStones(String J, String S) {
		char[] JJ=J.toCharArray();
		char[] SS=S.toCharArray();
		int jewels=0;
		if (JJ.length<=SS.length)
		{
			for(int i=0;i<=SS.length-JJ.length;i++)
			{
				if(SS[i]==JJ[0])
				{
					boolean isJ=true;
					for(int j=1;j<JJ.length;j++)
					{
						if(SS[i+j]!=JJ[j])
						{
							isJ=false;
							break;
						}
					}
					if(isJ)
						jewels++;
				}
			}
			return jewels;
		}else{
			return 0;
		}
	}
}
