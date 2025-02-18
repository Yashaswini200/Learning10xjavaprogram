package Task1302;

import java.util.Scanner;

public class Task1301_duplicates {
    public static void main(String[] args) {
        Scanner  a=new Scanner(System.in);
        System.out.println("enter b");
        int b=a.nextInt();
        int[] arr=new int[b];
        int size=arr.length;
        for(int i=0;i<size;i++){
            arr[i]=a.nextInt();
        }
        int i=0;
        for(int j=1;j<size;j++){

           if( arr[i]!=arr[j]){
              arr[i+1]=arr[j];
              i++;
           }


        }

       int newsize=i+1;
        for(int k=0;k<newsize;k++){
            System.out.println(arr[k]);
        }
    }
}
