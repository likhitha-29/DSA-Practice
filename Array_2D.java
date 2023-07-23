import java.io.IOException;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        int[][] a=new int[6][6];
        for(int i=0;i<6;i++) {
            for(int j=0;j<6;j++) {
                a[i][j]=s.nextInt();
            }
        }
        int sum=0;
        int max=(int)Double.NEGATIVE_INFINITY;
        for(int i=0;i<4;i++) {
            sum=0;
            for(int j=0;j<4;j++) {
                sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(sum >max) {
                    max=sum;  
                }
            }
        }
        System.out.println(max);
    }
}
