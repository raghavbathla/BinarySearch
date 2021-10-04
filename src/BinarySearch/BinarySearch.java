package BinarySearch;

public class BinarySearch {
    public  static  int binarySearch(String[] arr,String x){
        int i = 0; int r = arr.length-1;
        while (i<=r){
            int m = i + (r-1)/2;
            int res = x.compareTo(arr[m]);
            if(res==0)
                return m;
            if (res > 0)
                i = m + 1;


            else
                r = m - 1;
        }
return -1;
    }

}
