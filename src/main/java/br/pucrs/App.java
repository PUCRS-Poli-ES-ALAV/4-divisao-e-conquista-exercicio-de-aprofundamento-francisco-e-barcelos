package br.pucrs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    }

    public void mergeSort(int[] a, int n){
        if (n <= 1){
            return;
        }
        if (n > 1){
            int div = n/ 2;
            int[] b = new int[div];
            mergeSort(div, n/2);
    
            int[] c = new int[n-div];
            mergeSort(div, n/2);
        }
        merge(a, b, c);
    }
}

