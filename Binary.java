// Searching an element in an array using linear method

public class Binary {
    public static int BinarySearch(int numb[], int key) {
        int start = 0, end = numb.length - 1;
        while (start <= end) {
            int mid = (start + end)/ 2;
            if (numb[mid] == key) {
                return mid;
            }
            if (numb[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int numb[] = { 1, 2, 3, 4, 5, 6 };
        int key = 5;
        int i = BinarySearch(numb, key);
        if (i == -1) {
            System.out.print("the key is not found in the array");
        } else {
            System.out.print("the key is : " + i);
        }

    }
}
