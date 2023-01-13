import java.util.*;
public class practicejava1 {
    public static void oddoreven(int n){
        if((n&1) == 1){
            System.out.println("Given no is odd");
        }
        else{
            System.out.println("Given no is even");
        }

    }
    public static void getbit(int n,int i){
        if((n&(1<<i)) !=0){
            System.out.println("Bit at ith is 1");
        }else{
            System.out.println("Bit ith is 0");
        }
    }
    public static int setbit(int n,int i){
        return (n|(1<<i));
    }
    public static int clearbit(int n,int i){
        return (n&(~(1<<i)));
    }
    public static int updateBit(int n,int i,int newBit){
        // if(newBit == 0){
        //     return clearbit(n, i);
        // }else{
        //     return setbit(n,i);
        // }
        n =clearbit(n, i);
        int BitMask = newBit<<i;
        return n| BitMask;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=sc.nextInt();
        int  newBit =sc.nextInt();
        System.out.println(updateBit(n, i,newBit));

    }
}
