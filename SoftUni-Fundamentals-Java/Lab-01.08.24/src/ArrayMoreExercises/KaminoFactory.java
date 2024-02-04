package ArrayMoreExercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        ArrayList<DNA> results = new ArrayList<DNA>();
        int index = 1;
        while(!input.equals("Clone them!")){
            int[] array = Arrays
                    .stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            DNA dna = new DNA(array);
            dna.index = index;
            dna = LIS(array,dna);
            results.add(dna);
            input = scanner.nextLine();
            index ++;
        }
        DNA bestDna = DNA.getTheBestDNA(results);
        System.out.printf("Best DNA sample %d with sum: %d.\n",bestDna.index ,bestDna.sumNumbers);
        for (int number: bestDna.array) {
            System.out.printf("%d ",number);
        }

    }
    public static DNA LIS(int[] DNA,DNA dna){
        int length = DNA.length;
        int[] lastIndex = new int[length];
        int[] maxLenght = new int[length];
        Arrays.fill(lastIndex,-1);
        if (DNA.length == 1){
            if (DNA[0] == 1){
                lastIndex[0] = 0;
                maxLenght[0] = 1;
            }
        }else {
            for (int i = 0; i < length - 1; i++) {
                if (DNA[i] == 1) {
                    lastIndex[i] = i;
                    if (i - 1 < 0) maxLenght[i] += 1;
                    else maxLenght[i] = maxLenght[i - 1] + 1;
                }
            }
        }
        int maxIndex = -1;
        for (int number:lastIndex) {
            if (maxIndex < number)maxIndex = number;
        }
        int maxLen = 0;
        for (int number:maxLenght) {
            if (maxLen < number)maxLen = number;
        }
        dna.setLeftIndex(maxIndex - maxLen + 1);
        dna.setMaxLenght(maxLen);
    return dna;
    }

    public static class DNA {
        public int lenght = 0;
        public int sumNumbers = 0;
        public int leftIndex = -1;
        public int[] array = new int[1];
        public int index = -1;
        public DNA(){}
        public DNA(int[] array){
            this.array = array;
            this.sumNumbers = Arrays.stream(this.array).sum();
        }
        public void setLeftIndex(int leftIndex) {
            this.leftIndex = leftIndex;
        }
        public void setMaxLenght(int maxLen){
            this.lenght = maxLen;
        }

        public static DNA getTheBestDNA(ArrayList<DNA> array){
            DNA bestDNA = new DNA();
            for (DNA dna:array) {
                if (dna.lenght > bestDNA.lenght){
                    bestDNA = dna;
                }
                else if(dna.lenght == bestDNA.lenght){
                    if (dna.leftIndex < bestDNA.leftIndex){
                        bestDNA = dna;
                    }
                    else if (dna.leftIndex == bestDNA.leftIndex){
                        if (dna.sumNumbers > bestDNA.sumNumbers){
                            bestDNA = dna;
                        }
                    }

                }
            }
            return bestDNA;
        }

    }

}
