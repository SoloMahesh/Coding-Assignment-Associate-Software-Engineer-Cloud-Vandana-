
import java.util.Scanner;

public class Roman_To_Integer {

    public static int romanToInt(String s) {
        int k = s.length();
        int sum = 0, temp1=0,temp2=0;
        char[]a = {'B','I','V','X','L','C','D','M'};
        for(int i=0;i<k;i++){
            if(i!=k-1){
	            for(int j=0;j<a.length;j++)
	            {
	                if(s.charAt(i+1)==a[j])
	                 temp2 = j;
	                if(s.charAt(i)==a[j])
	                 temp1 = j;
	            }
            }
            else{
            temp1=0;
            temp2=0;}
            if(s.charAt(i) == 'M'){
                if(temp1<temp2)
                sum-=1000;
                else
                sum+=1000;
            }
            else if(s.charAt(i)=='D'){
                if(temp1<temp2)
                sum-=500;
                else
                sum+=500;
            }
            else if(s.charAt(i)=='C'){
                if(temp1<temp2)
                sum-=100;
                else
                sum+=100;
            }
            else if(s.charAt(i)=='L')
            {
                if(temp1<temp2)
                sum-=50;
                else
                sum+=50;
            }
            else if(s.charAt(i)=='X')
            {
                if(temp1<temp2)
                sum-=10;
                else
                sum+=10;
            }
            else if(s.charAt(i)=='V')
            {
                if(temp1<temp2)
                sum-=5;
                else
                sum+=5;
            }
            else if(s.charAt(i)=='I')
            {
                if(temp1<temp2)
                sum-=1;
                else
                sum+=1;
            }
        }
        return sum;
    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String romanNumber = sc.next();
		System.out.println(romanToInt(romanNumber));
	}

}
