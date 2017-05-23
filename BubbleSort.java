/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Random;

/**
 *
 * @author kendrabooker
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int[] arr = new int[10];
        
        for(int i=0; i<arr.length; i++){
        
            arr[i] = 1 + r.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        
        int temp = 0;
        for(int i=0; i<arr.length ; i++){
        
            for(int j=0; j<arr.length; j++){
            
                if(arr[i] < arr[j]){
                
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println();
        for(int i=0; i<arr.length; i++){
        
            System.out.print(arr[i] + " ");
        }
    }
    
}
