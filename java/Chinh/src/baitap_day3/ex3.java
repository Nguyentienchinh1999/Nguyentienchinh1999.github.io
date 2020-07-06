package baitap_day3;
import java.util.Arrays;
import java.util.Scanner;
public class ex3 {
	public static void main(String[] args) {
		insert();
		coincide();
		count();
	}
	static Scanner S = new Scanner(System.in);
	public static void insert() {
		int[] arr = {90,90,20,27,35,22,10,8,8};
		int k = 100;
		int n =arr.length;
		for(int i = n - 1 ; i > 2; i--) {
			
			arr[i] =arr[i - 1];
			System.out.println(i - 1);
		}
		n++;
		arr[2] = k;
		System.out.println("mảng sau khi đã thêm : " + Arrays.toString(arr));
	}
	public static void coincide(){
		 int[] arr = {90,90,20,27,35,22,10,8,8};
		 int k;
		 int n = arr.length;
		 for(int i = 1; i < n; i++) {
			 for(int j = 0; j < i; j++ ) {
				 if(arr[i] == arr[j])	{
					 for(k = i; k < n; k++ ) {
						 arr[k] = arr[k + 1];
						 n--;
						 i--;
					 }
				 }
			 }
		}
		 System.out.println("mảng sau khi đã xóa các phần tử trùng: " + Arrays.toString(arr));
		 
	}
	
	public static void count() {
		int arr[] = new int[9];
		double tienDien;
		for(int i = 0; i < 9; i++ ) {
			System.out.println("nhập vào  hộ gia đình thứ: " + i + ": ");
			arr[i]  = S.nextInt();
		if(arr[i] < 0) {
			System.out.println("nhập sai");
		}else if(arr[i]<= 50) {
			tienDien =  (arr[i] * 1.549);
			System.out.println("tiền điện là: " + tienDien);
		}else if(arr[i] <= 100) {
			tienDien =  (arr[i] * 1.600);
			System.out.println("tiền điện là: " + tienDien);
	    }else if(arr[i] <= 200) {
	    	tienDien =  (arr[i] * 1.857);
	    	System.out.println("tiền điện là: " + tienDien);
	    }else if(arr[i] <= 300) {
	    	tienDien =  (arr[i] * 2.340);
	    	System.out.println("tiền điện là: " + tienDien);
	    }else if(arr[i] <= 400) {
	    	tienDien =  (arr[i] * 2.615);
	    	System.out.println("tiền điện là: " + tienDien);
	    }else{
	    	tienDien =  (arr[i] * 2.710);
	    	System.out.println("tiền điện là: " + tienDien);
	    }
	    }
	    }
}

