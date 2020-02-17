/*
public class AutoArray3D {
public static void main(String args[])
{

	int twoD[][] = new int[5][5];

	int i, j, k=0;

for(i=0;i<5;i++)
{
	for(j=0;j<5;j++)
	{
		twoD[i][j] = k;
			k++;
			System.out.print(twoD[i][j] + " ");
	}
	System.out.println();
}
}
}*/

class AutoArray3D 
{
public static void main(String args[]) 
{
int twoD1[][] = new int[2][2];
int twoD2[][] = new int[2][2];
int i, j, m, n, k = 0, l=0;

for(i=0; i<2; i++)
{	
	for(j=0; j<2; j++) 
	{ 	
		twoD1[i][j] = k;
		System.out.print(twoD1[i][j] + " ");
	k++;
	}
	System.out.println();
}
System.out.println();
	for(m=0; m<2; m++) 
	{	
		for(n=0; n<2; n++)
		{
		twoD2[m][n] = l;
		System.out.print(twoD2[m][n] + " ");
		l++;
	}
		System.out.println();
	}
	for(i=0;i<2;i++)
	{
		for(m=0;m<2;m++) 
		{
			for(j=0; j<2; j++) 
			{ 
				for(n=0; n<2; n++)
				{
					if(i=m)
					{
						if(j=n)
						{
					System.out.print(twoD1[i][j]*twoD2[m][n]);
						}
					}
				}
			}
		}System.out.println();
	}
}

}