package in.blogspot.randomcompiler.print.all.permutations;

public class PrintAllPermutations {
    private static int permutationsCount = 0;
    
    public static void printAllPermutations(StringBuilder sb, int start, int end) {
        if(start == end) {
            permutationsCount++;
            System.out.println(sb.toString());
        }
        for(int current=start; current<=end; current++) {
            swap(sb, start, current);
            printAllPermutations(sb, start+1, end);
            swap(sb, start, current);
        }
    }

    private static void swap(StringBuilder sb, int i, int j) {
        Character temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
    
    public static void printPermutationsCount() {
        System.out.println("Total permutations " + permutationsCount);
    }
    
    public static void resetPermutationsCount() {
        permutationsCount = 0;
    }
}
