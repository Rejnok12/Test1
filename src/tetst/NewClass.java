package tetst;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import static java.util.Collections.list;
public class NewClass {
    private int n;
    private int l;
    public int a;
    Scanner sc = new Scanner(System.in);
    private int[] loadArray(){
        n =sc.nextInt();
        l =sc.nextInt();
        int[] array = new int[n];
        for(int x=0;x<=(n-1);x++){
            array[x] = sc.nextInt();
        }
        return array;
    } 
    public void Triple(){
        int[] hello = loadArray();
        ArrayList<Integer> sumList = new ArrayList<>();
        for(int x=0;x<=n-3;x++){
            for(int y = x+1;y<=n-2;y++){
                for(int z = x+2;z<=(n-1);z++){
                    sumList.add(hello[x] + hello[y] + hello[z]);   
                }
            }
        }
        Object[] sum = sumList.toArray();
        Arrays.sort(sum);
        System.out.println(sum[l-1]);
    }
}
