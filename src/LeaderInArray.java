public class LeaderInArray {
    void printLeader(int[] arr,int size) {
        int max_array_right = arr[size - 1];
        System.out.println("The leader is" +max_array_right+ "");
        for (int i = size - 2; i >= 0; i--) {
            if (max_array_right < arr[i]) {
                max_array_right = arr[i];
                System.out.println("The leader is" +max_array_right+ "");
            }
        }
    }
        public static void main(String[] args)
        {
            LeaderInArray lead = new LeaderInArray();
            int array[] = new int[]{16, 17, 4, 3, 5, 2};
            int n = array.length;
            lead.printLeader(array, n);
        }
}
