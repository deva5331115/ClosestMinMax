import java.util.Scanner;

public class ClosestMinMax {
    int minMaxlength(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int latestmini=-1;
        int latestmaxi=-1;
        int result=Integer.MAX_VALUE;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==min){
                latestmini=i;
                if (latestmaxi >= 0) {
                    result = Math.min(result, i - latestmaxi + 1);
                }
            }if(arr[i]==max){
                latestmaxi=i;
                if (latestmini >= 0) {
                    result = Math.min(result, i - latestmini + 1);
                }
            }

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] array =new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();

        }
        ClosestMinMax find=new ClosestMinMax();
        System.out.println(find.minMaxlength(array));


    }
}
