package assignment6;

public class VampireMain {
    public static void main(String[] args) {
        VampireNumber vampire = new VampireNumber();
        int number = 1001;
        int counter = 0;
        while (counter < 100) {
            if (((int) (Math.log10(number) + 1))%2 == 0) {
                int[] array = vampire.numberDivision(number);
                vampire.findNumbers(array, 0, number);
                if (vampire.flag) {
                    System.out.println(number + " is a Vampire Number");
                    counter++;
                    vampire.flag = false;
                }

            }
            number++;
        }
    }
}
