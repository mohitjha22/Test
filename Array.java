class Array {
    public static void sort(int arr[]) {
        int len = arr.length;
        for(int i=0; i < len-1; i++) {
            int min_idx = i;
            for(int j=i+1; j<len; j++) {
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static int[] merge(int arr1[], int arr2[]) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int res[] = new int[l1+l2];

        for(int i=0;i<l1;i++)
            res[i] = arr1[i];

        for(int i=l1;i<l1+l2;i++)
            res[i] = arr2[i-l1];

        return res;
    }
    public static void main(String args[]) {
        int arr1[] = new int[]{2,98,4,1};
        int arr2[] = new int[]{33,56,1,1,0};

        int result[] = merge(arr1, arr2);
        sort(result);
        int len = result.length;

        for(int i=0; i < len; i++)
            System.out.print(result[i] + " ");
    }
    
}
