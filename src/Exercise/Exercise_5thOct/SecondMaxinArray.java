package Exercise.Exercise_5thOct;

public class SecondMaxinArray {
    public static void main(String[] args) {
        int[] numbers = {22, 41, 12, 1, 100, 33, 46, 82};
        int max1=0;
        int max2=0;
        for(int i=0; i<numbers.length;i++){
            if(max1<numbers[i]){
                max1=numbers[i];
            }
        }
        System.out.println("maximum number is:"+max1);
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]!=max1){
                if(max2<numbers[i]){
                    max2=numbers[i];
                }
            }
        }
        System.out.println("Second maximum number is:"+max2);
    }
}
