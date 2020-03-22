public class MIssingNumberArrayXOR {
    public static void main (String[] args) {
        {
            int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
            System.out.println("The missing number is " + missingNo(arr));
        }
    }

    public static int missingNo(int[] n) {
        int xor=0;
        for(int i:n) {
            xor = xor^i;
        }
        for(int i=1;i<=n.length+1;i++) {
            xor= xor^i;
        }
        return xor;
    }
}
