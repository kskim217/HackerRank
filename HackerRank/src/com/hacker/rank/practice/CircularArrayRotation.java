package com.hacker.rank.practice;
import java.util.Scanner;

public class CircularArrayRotation {
	public static void main(String[] args) {
		
		Scanner in = Util.getScanner();
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            int idx = m - (k % n) < 0 ? n + ( m - (k % n)) : m - (k % n) ;
            System.out.println(a[idx]);
            Util.println(a[idx]);
        }
	}
	
}
