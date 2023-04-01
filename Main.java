import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row, col;
    //input rindas
    row = sc.nextInt();
    //input kolonnas
    col = sc.nextInt();
    int[][] a = new int[row][col];
    
    for (int i = 0; i < a.length; i++) {
      for (int j= 0; j<a[i].length; j++) {
        a[i][j]=row;
         a[i][j]=i+j+1; 
    }
    }
    for (int[] rows :a) {
      for(int item :rows){
        System.out.print(item + " ");
      }
    System.out.println();
    }
    int s=0;
    for(int[]r:a){
      for(int i = 0; i<r.length; i++){
        if(i%2!=0){
          s=s+r[i];
        }
      }
    }
      System.out.print("sum=" +s);
      }
    }
      System.out.print("sum=" +0);
    }
}
}
