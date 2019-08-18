package Searching;

public class BinarySearch {
    public static int binarySearch(int []data,int first,int last,int key){
        int mid=(first+last)/2;
        while (first<=last){
            if(data[mid]<key){
                first=mid+1;
            }else if(data[mid]==key){
                return mid+1;
            }else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        return 0;
    }
    public static void main(String[] args) {
        int data[] = {10,20,30,40,50};
        int key = 60;
        int last=data.length-1;
        System.out.println(binarySearch(data,0,last,key));


    }
}
