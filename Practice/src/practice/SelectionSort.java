package practice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {38,22,45,12};
        int min = 0;
        int temp=0;
        for (int i = 0; i <a.length; i++) {
//            int min;
//            int temp=0;
            for (int j =i+1; j <a.length; j++) {
                if(a[j]<a[min])
                {
                    min=j;
                }    
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
    }
    
}
