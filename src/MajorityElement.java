//Moore's voting algorithm
public class MajorityElement {
    public static void main(String[] args) {
    int[] a= {2,2,3,4,2,3,2};
    int size = a.length;
MajorityElement majorityElement = new MajorityElement();
majorityElement.printMajority(a,size);
    }

    void printMajority(int a[], int size)
    {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);

        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }
    boolean isMajority(int[] a, int size,int cand) {
        int count=0;
        for(int i=0;i<size;i++) {
         if(a[i]==cand)
             count ++;
        }
        if(count>size/2)
        {
            return true;
        } else
            return false;
    }
    public int findCandidate(int[] a ,int n ){
        int maj_element=0,count=1;
        for(int i=0;i<a.length-1;i++) {
            if (a[maj_element] == a[i]) {
                count++;
            }
                else
                    count--;
                if(count==0) {
                    maj_element=i;
                    count=1;
            }
        }
        return a[maj_element];
    }
}
    