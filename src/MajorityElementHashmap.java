import java.util.HashMap;

public class MajorityElementHashmap {

    public static void main(String[] args)
    {
        int a[] = new int[]{2,2,2,2,5,5,2,3,3,2};
        findCandidate(a);
    }

    private static void findCandidate(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if (hashMap.containsKey(arr[i])) {
                int count = hashMap.get(arr[i])+1;
                if(count>arr.length/2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    hashMap.put(arr[i],count);
            } else
                hashMap.put(arr[i],1);
        }
        System.out.println(" No Majority element");
    }
}
