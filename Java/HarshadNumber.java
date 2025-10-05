import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0,n=num;
    while(num>0){
    int rem=num%10;
    sum+=rem;
    num/=10;
  }
System.out.println(n%sum==0?"Harshad Number":"Not a Harshad Number");
}
}
