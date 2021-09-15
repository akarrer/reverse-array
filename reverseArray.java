public class reverseArray {
    public static void main(String []args){
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original Array");
        for (int i= 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
        System.out.println("Original Array Printed in Reverse Order");
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i] + " ");
        }

    }
}
