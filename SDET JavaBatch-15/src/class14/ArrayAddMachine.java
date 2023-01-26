package class14;

public class ArrayAddMachine {
    static void addArrayElementsMachine(int [] arr){
        int sum=0;
        for (int number:arr) {
            sum+=number;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int [] array1={10,20,30,40,50};
        addArrayElementsMachine(array1);
        int [] array2={40,30,30,45,60};
        addArrayElementsMachine(array2);
    }

}
