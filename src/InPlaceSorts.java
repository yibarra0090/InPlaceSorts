public class InPlaceSorts {
    //SORTING ALG
    public static void bubbleSort(String[] arr) {
        int i;
        boolean check = true;  // will determine when the sort is finished
        String temp;

        while (check) {
            check = false;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {         // ascending sort
                    temp = arr[i];
                    arr[i] = arr[i + 1];     // swapping according to algorithm
                    arr[i + 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void selectionSort(double[] arr) {
        int minPos = 0;
        for (int curPos = 0; curPos < arr.length; curPos++) {
            double minVal = arr[curPos];
            for (int nextPos = curPos + 1; nextPos < arr.length; nextPos++) {
                if (arr[nextPos] < minVal) {
                    minVal = arr[nextPos];
                    minPos = nextPos;
                }
                swapdouble(arr, minPos, curPos);
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    //SWAP
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void swapdouble(double[] arr, int a, int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void swapString(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //Random Generators
    public static int[] randIntArr(int count) {
        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            num[i] = (int) (Math.random() * 10001);
        }
        return num;
    }

    public static double[] randDoubleArr(int count) {
        double[] num = new double[count];
        for (int i = 0; i < count; i++) {
            num[i] = (Math.random() * 10000);
        }
        return num;
    }

    public static String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }

    //Copy
    public static int[] copyIntArr(int[] arr) {
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    public static double[] copyDoubleArr(double[] arr) {
        double[] copyArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    public static String[] copyStirngArr(String[] arr) {
        String[] copyArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    //CHECK
    public static boolean checkSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > i + 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > i + 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkAlpha(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        if (before.length != after.length) {
            return false;
        }
        int sumBef = 0;
        int sumAft = 0;
        for (int i = 0; i < before.length - 1; i++) {
            sumBef = sumBef + before[i];
            sumAft = sumAft + after[i];
        }
        if (sumAft != sumAft) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean checkSum(double [] before, double [] after){
        if (before.length != after.length){
            return false;
        }
        double sumBef = 0;
        double sumAft = 0;
        for (int i =0; i < before.length-1; i++){
            sumBef = sumBef + before[i];
            sumAft = sumAft + after[i];
        }
        if (sumAft != sumAft){
            return false;
        } else {
            return true;
        }
    }
}



