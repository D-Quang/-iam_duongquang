import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n;
    // nhap
		System.out.println("nhap vao canh ma tran ");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[][] a = new int[n][n];
		int[][] b= new int[n][n];
		int[][] c= new int[n][n];
		int[][] d= new int[n][n];
		int[][] e= new int[n][n];
		System.out.println("nhap vao ma tran a");
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        a[i][j] = sc.nextInt();
		    }
		}
		System.out.println("nhap vao ma tran b");
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		       b[i][j] = sc.nextInt();
		    }
		}
		// xuat
		System.out.println("ma tran a la: ");
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		       System.out.print(a[i][j]+" ");
		    }System.out.println();
		}
		System.out.println("ma tran b la: ");
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		       System.out.print(b[i][j]+" ");
		    }
		    System.out.println();
		}
		// cong
        System.out.println("tong hai ma tran la");
        for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        c[i][j]=a[i][j]+b[i][j];
		        System.out.print(c[i][j]+" ");   
		    }
            System.out.println();
        }
        
        //nhan
        
        for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        for (int k = 0; k < n; k++) {
		             e[i][j]=0;
		             e[i][j] = e[i][j] + a[i][k] * b[k][j];
		        
		    }}}
		System.out.println("tich hai ma tran la");
        for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        
		        System.out.print(e[i][j]+" ");   
		    }
            System.out.println();
        }    
        
    }
	
	}




