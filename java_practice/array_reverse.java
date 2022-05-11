public class array_reverse {
    public static void main(String[] args) {
        int a[] = {4, 5, 6, 7, 8};
        System.out.println("Array elements in reverse :-");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
