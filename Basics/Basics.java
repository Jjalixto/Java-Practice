package Basics;

import java.util.ArrayList;

public class Basics {
    void printNumbers(int A) {   //void r:ejecuta directamente
        for (int i = 1; i <= A; i++) {
            System.out.println(i); //sout no permite array 
        }
    }   

    void printimpar(int B){
        for(int i = 1;i <=B;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

    void printsum(int C){
        int sum = 0;
        for(int i = 0;i <=C;i++){
            sum += i;
            System.out.println("Number "+i+" sum "+sum);
        }
    }

    void recarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
    }

        void enmax(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                System.out.println(i);
            }  
        }
    }

        double promedio(int[] arr){
            int sum = 0;
            for(int i=0;i<arr.length;i++){
                sum += arr[i];
            }
            double result = sum/arr.length;
            return result;
        }
        
        void arrimpar(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<=10;i++){
            if(i%2!=0){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }

    void mayor(int[] arr, int F){
        ArrayList<Integer> array3  = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]>F){
                System.out.println(arr[i]);
            }
            array3.add(null);
        }
    }

        void cuadrado(int []arr){
            ArrayList<Double> array2 = new ArrayList<>();

            for(int i=0;i<arr.length;i++){ 
                array2.add(Math.pow(arr[i], 2));
            }
            System.out.println(array2);
        }

            void deleteNegative(int []arr){
            ArrayList<Integer> array5 = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                    if(arr[i]>0){
                        array5.add(arr[i]);
                    }else if(arr[i]<0){
                        array5.add(0);
                    }
            System.out.println(array5);
            }
        }

        //     void maxMinProm(int []arr){
        //         ArrayList<Integer> array4 = new ArrayList<>();
        //         int max = 0;
        //         int min = arr[0];
        //         int prom = 0;
        //         double result = 0;
        //         for(int i=0;i<arr.length;i++){
        //                 prom += arr[i];
        //                 result = prom/arr.length;
        //                 if(arr[i]>max){
        //                     max = arr[i];
        //                 }
        //                 if(arr[i]<min){
        //                     min = arr[i];
        //                 }
        //         }
        //         System.out.println("Promedio: "+result);
        //         System.out.println("Maximo: "+max);
        //         System.out.println("Minimo: "+min);
        // }

        void exerciseEleven(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1]=0;
            }
}
