package javastudy1;

public class Works2 {
        public static void main(String args[]) {
            int [] array = {2,5,10,8,9};
            int intMin = calcMin(array);
            System.out.println("最小値は" + intMin);
        }

public static int calcMin(int[] array) {

        int intMin = array[0];

        for (int i = 1; i < array.length; i++ ) {
            if(intMin > array[i]) {
                intMin = array[i];
            }
        }
        return intMin;
    }
    }


