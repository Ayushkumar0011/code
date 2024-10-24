import java.util.*;
class petya_and_string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int t=(s1.toLowerCase()).compareTo(s2.toLowerCase());
        if(t>0)
        System.out.println(1);
        else if(t<0)
        System.out.println(-1);
        else
        System.out.println(0);

    }
}