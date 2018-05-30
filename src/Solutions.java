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
	
/*
* 理解错了题意，原题意思是J里每一个元素都是一种宝石，
*此做法是把J整个作为了一块宝石
*
*然而，it's a way to compare String arrays
* (calculate how many times string A appears in string B)
*/
	public static int numJewelsInStones_StringComparison(String J, String S) {
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

/*-----------------------------------------------------------------------------*/

	public static int numJewelsInStones(String J, String S) {
		char[] JJ=J.toCharArray();
		char[] SS=S.toCharArray();
		int jewels=0;
		if(JJ.length<=SS.length)
		{
			for(char j:JJ)
			{
				for(int i=0;i<SS.length;i++)
				{
					if(SS[i]==j)
					{
						jewels++;
					}
				}
			}
		}
		return jewels;
	}




/*-----------------------------------------------------------------------------*/
}
