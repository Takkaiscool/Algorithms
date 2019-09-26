package Searching;

public class LinearSearch {
    public  static void searchEle(int searchele,int []data){
        int i=0;
        for(i=0;i<data.length;i++){
            if(data[i]==searchele){
                System.out.println("Find the element in the place "+(i+1));
                break;
            }
        }
        if(i==data.length){
            System.out.println("Element is not available in the given data");
        }
    }
    public static void main(String[] args) {
        int []data={56,3,5,87,90,76};
        int searchEle=76;
        searchEle(searchEle,data);

    }
}
