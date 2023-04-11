import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int[] a=new int[2];
        for(int i=0;i<2;i++){
            a[i]=sc.nextInt();
        }
        if(a[0]==0)
        System.out.println("1");
        else
        System.out.println(1*a[0]+2*a[1]+1);
    }
}