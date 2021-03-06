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
    public static int binarySearch(int[] elements, int target){
        int left = 0;
        int right = elements.length - 1;
        while (left <= right){
            int middle = (left + right) /2;
            if (target < elements[middle]){
                right = middle - 1;
            }
            else if (target > elements[middle]){
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    public static double binarySearch(double[] elements, int target){
        int left = 0;
        int right = elements.length - 1;
        while (left <= right){
            int middle = (left + right) /2;
            if (target < elements[middle]){
                right = middle - 1;
            }
            else if (target > elements[middle]){
                left = middle + 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
    public static int binarySearch(String[] elements, String target) {
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (elements[middle].compareTo(target) < 0) {
                left = middle + 1;
            } else if (elements[middle].compareTo(target) > 0) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    public static void merge(int[] elements, int from, int mid, int to, int[] temp){
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to){
            if (elements[i] < elements[j]){
                temp[k] = elements[i];
                i++;
            }
            else{
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid){
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to){
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++){
            elements[k] = temp[k];
        }
    }
    public void mergeSortHelper(int[] arr, int left, int right, int[] temp){
        if (left < right){
            int mid = (left+right)/2;
            mergeSortHelper(arr,left, mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr, left, mid, right, temp);
        }
    }
    public void mergeSort(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
}



