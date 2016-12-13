package com.hacker.rank.practice;

import java.util.Scanner;

public class TwoDArrayDS {
	public static void main(String[] args) {
        Scanner in = Util.getScanner();
        int arr[][] = new int[6][6];
        int maxVal = 0;
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
                if(arr_i > 1 && arr_j > 1){
                    int val = 0;
                    val += arr[arr_i-2][arr_j-2];
                    val += arr[arr_i-1][arr_j-2];
                    val += arr[arr_i][arr_j-2];
                    
                    val += arr[arr_i-1][arr_j-1];
                    
                    val += arr[arr_i-2][arr_j];
                    val += arr[arr_i-1][arr_j];
                    val += arr[arr_i][arr_j];
                    if(maxVal < val )maxVal = val;
                }
            }
        }
        System.out.println(maxVal);
    }
}
