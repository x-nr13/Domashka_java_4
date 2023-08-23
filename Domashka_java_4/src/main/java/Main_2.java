import java.util.Random;
public class Main_2 {
    public static void main(String[] args) {
        System.out.println("Задача номер: 2");

        int[] array = new int[5];
        Random random = new Random();

        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(90)+10;
        }

        System.out.print("Массив: ");
        for (int num:array){
            System.out.print(num+" ");
        }

        boolean isStrictlyIncreasing=true;
        for (int i=1; i<array.length; i++) {
            if (array[i]<=array[i-1]){
                isStrictlyIncreasing=false;
                break;
            }
        }

        if (isStrictlyIncreasing){
            System.out.println("\nМассив является строго возрастающей последовательностью.");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью.");
        }
    }
}
