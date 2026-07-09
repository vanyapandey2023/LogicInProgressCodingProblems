class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] array = new int[length];   
        for(int i = 0; i < nums1.length; i++){
            array[i] = nums1[i]; 
        }
        for (int i = 0; i < nums2.length; i++) {
            array[nums1.length + i] = nums2[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                }
            }
        }
        if (length % 2 == 1) {
            return array[length / 2];
        } else {
            int ans2 = (length / 2) - 1;
            int ans3 = length / 2;
            
            return (array[ans2] + array[ans3]) / 2.0;
        }

    }
}


