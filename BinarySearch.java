import java.util.*;

public class BinarySearch {
	public static void main(String[]args) {
		int[]a = {1, 2, 3, 4, 5};
        int point = Arrays.binarySearch(a, 2);
        System.out.println(point);
        int point2 = Arrays.binarySearch(a, 2, 3, 2);
        System.out.println(point2);
	}
}
