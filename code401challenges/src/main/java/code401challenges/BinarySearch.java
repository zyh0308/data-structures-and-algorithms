package code401challenges;

public class BinarySearch {

    public static int binarySearch(int[] inputArray, int key) {
        int endPoint = inputArray.length -1;
        int startPoint=0;
        int midPoint=(endPoint-startPoint)/2;

        while (endPoint-startPoint>0){
            if (inputArray[midPoint] == key){
                return midPoint;
            }
            if (key<inputArray[midPoint]){
                midPoint=endPoint;

            }
            if (key>inputArray[midPoint]){
                midPoint=startPoint;
            }
        }
        return -1;



    }
}
