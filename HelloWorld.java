//import java.util.*;
class NSInClassAssignment
{
    public static void main(String[] args)
    { 
        //Scanner sc=new Scanner(System.in);
		int a[]={2,5,6,11,15};
		// static void floorAndCeil(int a[], int N, int x)
		// {	
    	//Enter your code here
		int start=0;
		int end=4;
		int x=1;
		int maxLess=-1;
		int minGreat=-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid]==x)
			{
				minGreat=x;
				maxLess=x;
			}
			else if(a[mid]>x)
			{
				minGreat=a[mid];
				end=mid-1;
			}
			else
			{
				maxLess=a[mid];
				start=mid+1;
			}
    	}
   		 System.out.println(maxLess+" "+minGreat);
	}
    //     System.out.println("Enter a number");
	// 	int n=sc.nextInt();
	// 	int sum=0,rem=0;
	// 	for(int i=0;i<=n;i++)//n=200
	// 	{
    //         //System.out.println("i is "+i);
	// 		int num=i;//System.out.println("num=i is "+num);
	// 		while(num>0)
	// 		{
	// 			rem=num%10;//System.out.println("rem is "+rem);
	// 			sum=sum+(rem*rem*rem);//System.out.println("sum is "+sum);
	// 			num=num/10;//System.out.println("New num is "+num);
	// 		}
    //         //System.out.println("i is "+ i+" and sum is "+sum );
	// 		if(sum==i)
	// 		{
    //             System.out.println(i+" ");
	// 		}sum=0;
	// 	}
    //     sc.close();
    // }
}




//public static int singleDigit(int n) { // if number is more than one/single digit while(n>9) { System.out.println("in outer loop"); int sum = 0; while(n > 0) { System.out.println("in inner loop"); // 'splitting' the number into digits and adding them to sum sum+=n%10; System.out.println("sum is now: "+ sum); // keep moving the decimal up // so, that we always get the next digit as remainder n=n/10; System.out.println("n is now: "+ n); } // assign the sum of digits to n // and, run the outer loop again; as long as it's >9 n = sum; } return n; }