import org.omg.PortableInterceptor.INACTIVE;

public class Runner {

    public static void main(String[] args) {

        System.out.print("INSERTION SORT");
        System.out.println();
        int[] testlist = InPlaceSorts.randIntArr(10);
        int[] oldlist = InPlaceSorts.copyIntArr(testlist);
        long time = System.nanoTime();
        for (int num: testlist){
            System.out.print(num+" ");
        }
        System.out.println();
        InPlaceSorts.insertionSort(testlist);
        for (int num: testlist){
            System.out.print(num+" ");
        }
        System.out.println();
        if (InPlaceSorts.checkSort(testlist) && InPlaceSorts.checkSum(oldlist,testlist)){
            System.out.print("Insertion Sort was successful!");
        }
        System.out.println();
        time = System.nanoTime()-time;
        System.out.println("Insert Sort ints Time taken: " + time);
        //for(int cur : testlist){
        //  System.out.println(cur);
        //}
        System.out.print("-----------------------------------------------------");
        System.out.println();


        System.out.print("BUBBLE SORT");
        System.out.println();
        String [] StringList = InPlaceSorts.randomStringArr(3,1);
        String [] oldStringList = InPlaceSorts.copyStirngArr(StringList);
        long time2 = System.nanoTime();
        for (String num: StringList){
            System.out.print(num+" ");
        }
        System.out.println();
        InPlaceSorts.bubbleSort(StringList);
        for (String num: StringList){
            System.out.print(num+" ");
        }
        System.out.println();
        if (InPlaceSorts.checkAlpha(StringList)){
            System.out.print("Bubble Sort was successful!");
        }
        time2 = System.nanoTime() - time2;
        System.out.println("\nBubble Sort Strings Time taken: " + time2);
        //for(String cur : randomWords){
        //    System.out.println(cur);
        //}
        System.out.print("-----------------------------------------------------");
        System.out.println();


        System.out.print("SELECTION SORT");
        System.out.println();
        double[] testDouble = InPlaceSorts.randDoubleArr(10);
        double [] oldList = InPlaceSorts.copyDoubleArr(testDouble);
        long time3 = System.nanoTime();
        for (double num: testDouble){
            System.out.print(num+" ");
        }
        System.out.println();
        InPlaceSorts.selectionSort(testDouble);
        for (double num: testDouble){
            System.out.print(num+" ");
        }
        System.out.println();
        if (InPlaceSorts.checkSort(testDouble) && InPlaceSorts.checkSum(oldList,testDouble)){
            System.out.print("Selection Sort was successful!");
        }
        System.out.println();
        time = System.nanoTime()-time;
        System.out.println("Selection Sort ints Time taken: " + time);
        //for(int cur : testlist){
        //  System.out.println(cur);
        //}
    }
}
