package ap1;

public class mergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int i = 0, j = 0, k = 0;

        while (k < n) {
            if (a[i].compareTo(b[j]) < 0) {
                result[k++] = a[i++];
            } else if (a[i].compareTo(b[j]) > 0) {
                result[k++] = b[j++];
            } else {
                result[k++] = a[i++];
                j++;
            }
        }

        return result;
    }
}
