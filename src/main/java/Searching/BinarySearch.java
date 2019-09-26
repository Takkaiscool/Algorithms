package Searching;

public class BinarySearch {
    public static int binarySearch(int []data,int first,int last,int searchElement){
        int mid=(first+last)/2;
        while (first<=last){
            if(data[mid]<searchElement){
                first=mid+1;
            }else if(data[mid]==searchElement){
                return mid+1;
            }else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        return 0;
    }

    public static int binarySearchWithRecursive(int []data,int first,int last,int searchElement){
        int mid=(first+last)/2;

            if (data[mid] == searchElement)
                return mid + 1;
            else if (data[mid] < searchElement)
               return  binarySearch(data, mid + 1, last, searchElement);
            else if (data[mid] > searchElement)
                return binarySearch(data, first, mid - 1, searchElement);

        return 0;

    }
    public static void main(String[] args) {
        int data[] = {10,20,30,40,50};
        int key = 50;
        int last=data.length-1;
        System.out.println(binarySearch(data,0,last,key));
        System.out.println(binarySearchWithRecursive(data,0,last,key));


    }
}
