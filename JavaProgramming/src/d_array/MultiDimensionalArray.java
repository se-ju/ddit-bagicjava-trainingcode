package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		 /*
		  * 다차원 배열
		  * - 배열인데 배열이 저장되어 있는 형태이다.
		  */
		
		//2차원
		int[][] array2;
		
		
		//3차원
		int[][][] array3;
		
		
		int[][] arr = new int[2][3]; //2칸짜리 배열안에 각 칸마다 3칸짜리 배열이 생성된다.
		/*
		 * arr(변수) = 100번지(주소)
		 * 
		 * 100번지
		 * {200번지, 300번지}
		 * 
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 */
		
		int arr2[][] = new int[][] {{1, 2, 3},{4, 5, 6}};
		
		//2차원 배열
		int[] arr3[] = {{1, 2, 3}
		               ,{4, 5, 6}
		               ,{7, 8, 9}};
		
		//3차원 배열
		int[][][] aaa = new int[][][] {
			{{1,1},{2,2}},
			{{3,3},{4,4}}
		};
		
		
		int[][] arr4 = new int[3][]; //가변 배열
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		System.out.println(arr[0][1]);
		
//		arr[0] = 10;
		arr[0] = new int[5];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		/*
		 * {{10, 20, 0, 0, 0}}
		 * {100, 0, 0}
		 */
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
		
		
		int[][] scores = new int[3][5];
		//배열의 모든 인덱스에 0~100사이의 랜덤한 값을 저장해주세요.
		//각 학생의 점수 합계와 평균을 구해보자. 
		
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];				
		
		for (int i = 0; i < scores.length; i++) {
			 for (int j = 0; j < scores[i].length; j++) {
				 scores[i][j] = (int)(Math.random() * 101); 
				 //scores[i][j] = random;
				 
			 }
			 System.out.println(Arrays.toString(scores[i]));
		 }for (int i = 0; i < scores.length; i++) {
			   for (int j = 0; j < scores[i].length; j++) {
				    sum[i] += scores[i][j];
			   }
			   avg[i] = (double)sum[i]/scores[i].length;
			   System.out.println((i) + 1 + "번  학생 --- 합계 : "
			   + sum[i] + ", " + "번 평균 : " + avg[i]);
			  
		 }
		
		
		
	}
	
}
