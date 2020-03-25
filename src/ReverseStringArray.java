public class ReverseStringArray {
    public static void main(String[] args) {
        String code = "code";
        System.out.println(code);
        char[] array = code.toCharArray();
        for (int index = 0, mirroredIndex = array.length - 1; index < mirroredIndex; index++,
                mirroredIndex--) {
            char temp = array[index];
            array[index] = array[mirroredIndex];
            array[mirroredIndex] = temp;
        }
// print reversed
        System.out.println(new String(array));
    }
}
