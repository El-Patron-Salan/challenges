package challenges.chall_09;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {
    private Driver(){}
    private final static char[] mustHaveWord = "LOVES".toCharArray();
    private static Scanner input = new Scanner(System.in);

    private static String firstName() {
        System.out.println("Your name: ");
        return input.nextLine();
    }
    private static String secondName() {
        System.out.println("Your crash name: ");
        return input.nextLine();
    }

    private static char[] changeNameToArray(String name) {
        return name.toUpperCase().toCharArray();
    }

    private static char[] mergeArrays(char[] firstName, char[] word, char[] secondName) {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(word);
        sb.append(secondName);
        return sb.toString().toCharArray();
    }

    private static ArrayList<Integer> countOccurrenceOfLetters(char[] mergedArray) {
        ArrayList<Integer> count = new ArrayList<>();
        int len = mergedArray.length;
        //array to store frequencies of each letter
        int[] freq = new int[len];
        int visited = -1;
        for(int i = 0; i < len; i++) {
            int found = 1;
            //check every element after element [i] points to
            for(int j = i + 1; j < len; j++) {
                if(mergedArray[i] == mergedArray[j]) {
                    found++;
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited) {
                freq[i] = found;
                count.add(freq[i]);
            }
        }
        return count;
    }
//    static void show(ArrayList<Integer> list) {
//        System.out.println("List = " + list);
//        System.out.println("List size = " + list.size());
//
//        for (Integer integer : list) {
//            System.out.println("\nPrint value = " + integer);
//        }
//    }

    private static int sumElements(int firstElement, int secondElement) {
        return firstElement + secondElement;
    }

    private static int calculateLoveChance(ArrayList<Integer> list) {

        ArrayList<Integer> tempList = new ArrayList<>();
        while(list.size() != 2) {
            int midElement = 0;
            for(int j = 0; j < list.size() / 2; j++) {

                midElement = (list.size() / 2);
                if(sumElements(list.get(j), (list.get(list.size() - 1 - j))) >= 10) {
                    String number = String.valueOf(sumElements(list.get(j), (list.get(list.size() - 1 - j))));
                    char[] digits = number.toCharArray();
                    for(int i = 0; i <= 1; i++)
                        tempList.add(Character.getNumericValue(digits[i]));
                }
                else
                    tempList.add(sumElements(list.get(j), (list.get(list.size() - 1 - j))));

            }
            if(list.size() % 2 != 0) tempList.add(tempList.size(), list.get(midElement));
            //replace elements in list with tempList
            list.clear();
            list.addAll(tempList);
            tempList.clear();
        }
        return Integer.parseInt(String.valueOf(list.get(0)) + list.get(1));
    }

    static int calculator() {
        //input names
        String name1 = firstName();
        String name2 = secondName();
        //put these names in an array
        char[] name1Array = changeNameToArray(name1);
        char[] name2Array = changeNameToArray(name2);
        //merge
        char[] merge = mergeArrays(name1Array, mustHaveWord, name2Array);
        //count occurrences
        ArrayList<Integer> occurrences = new ArrayList<>(countOccurrenceOfLetters(merge));
        //calculate
        return calculateLoveChance(occurrences);
    }

}
