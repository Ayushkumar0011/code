import java.util.*;
public class baseconversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the base to convert");
        int base=sc.nextInt();
        String s="";
        if(n<0){
        s+='-';
        n=n*-1;
        }
        System.out.println(s+convert(n, base));
    }
    public static String convert(int num,int n)
    {
        if(num<n)
        return ""+num;
        else
        {
            return ""+convert(num/n,n)+(num%n);
        }
    }
    
}
