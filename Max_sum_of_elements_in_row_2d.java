import java.util.Random;

public class Practice {
    public static void main(String[] args){
        int[][] t1=new int[3][3];
        int[] sum_table=new int[3];
        Random num=new Random();
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                
                 int random_num=num.nextInt(11)+1;
                 t1[i][j]=random_num;
                 System.out.print(t1[i][j]+ " ");
                 sum+=t1[i][j];
            }
            System.out.println();
            sum_table[i]=sum;
        }
        
        System.out.println("The row of the table with the greatest sum of elements is "+ (max(sum_table,sum_table.length)+1));
            
        
    }
    
    public static int max(int[] arr,int size){
        int max=arr[0];
        int i;
        int position=0;
        for(i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                position=i;
            }
        }
        return position;
    }
}