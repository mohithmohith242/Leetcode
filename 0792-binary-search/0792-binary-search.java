public class Solution {

    public int search(int[] a, int key){

        int start = 0;
        int end = a.length-1;

        while(start <= end){

          int mid =  (start + end) / 2;

          if(a[mid] == key){
            return mid;
          }
          if (a[mid] < key){
            start = mid + 1;
          }
          else{
            end = mid - 1;
          }
        }
        return -1;
    }
}