package in.blogspot.randomcompiler.print.all.permutations;

public class PrintAllPermutationsDemo {

    public static void main(String[] args) {
        PrintAllPermutations.printAllPermutations(new StringBuilder().append("Welcome"), 0, 6);
        PrintAllPermutations.printPermutationsCount();
        PrintAllPermutations.resetPermutationsCount();
        
        PrintAllPermutations.printAllPermutations(new StringBuilder().append("Permutation"), 0, 10);
        PrintAllPermutations.printPermutationsCount();
        PrintAllPermutations.resetPermutationsCount();
    }

}
