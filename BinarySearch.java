import java.util.*;

public class BinarySearch {
    public static void main(String[]args) {
	int[]a = {1, 2, 3, 4, 5};
        int point = Arrays.binarySearch(a, 2);
        System.out.println(point);
        int point2 = Arrays.binarySearch(a, 2, 3, 2);
        System.out.println(point2);
	    
	/*Without the class function*/
	while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
               low = mid + 1;	
            } else if (sortedArray[mid] > key) {
               high = mid - 1;
            } else if (sortedArray[mid] == key) {
               index = mid;
               break;
        }
    }
}
	
static int LowerBound(int a[], int x) { // x is the target value or key
  int l=-1,r=a.length;
  while(l+1<r) {
    int m=(l+r)>>>1;
    if(a[m]>=x) r=m;
    else l=m;
  }
  return r;
}
	
static int UpperBound(int a[], int x) {// x is the key or target value
    int l=-1,r=a.length;
    while(l+1<r) {
       int m=(l+r)>>>1;
       if(a[m]<=x) l=m;
       else r=m;
    }
    return l+1;
 }
	
//This is the binary search used to find the minimum value that can be used in a search
//See this problem for reference: http://www.usaco.org/index.php?page=viewproblem2&cpid=690
	
	
	
	

