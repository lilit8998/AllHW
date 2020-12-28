public class Stack {
    private  int[] array = new int[10];
    private int size;

    public Stack(){
        size = -1;
    }

    public void push(int value){
        if (size == array.length){
            System.out.println("Stack-ը վերջացավ");
        } else {
            array[++size] = value;
        }
    }

    public int pop(){
        if (size < 0){
            System.out.println("Stack-ը դաարկ է");
            return 0;
        } else {
            return array[size--];
        }
    }
}
