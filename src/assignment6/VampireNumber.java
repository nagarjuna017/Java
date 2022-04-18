package assignment6;

class VampireNumber {
    Boolean flag = false;
    public int[] numberDivision(int number) {
        int remainder= 0;
        int index=0;
        int length = (int) (Math.log10(number) + 1);
        int array[] = new int[length];
        while (number != 0) {
            remainder = number % 10;
            array[index] = remainder;
            number = number / 10;
            index++;
        }
        return array;
    }

    Boolean isVampire(int[] arr, int number) {
        int firstPart = 0;
        int secondPart = 0;
        for (int index = 0; index < (arr.length) / 2; index++) {
            firstPart += arr[index] * Math.pow(10, (arr.length) / 2 - index - 1);
        }
        for (int index = (arr.length) / 2; index < arr.length; index++) {
            secondPart += arr[index] * Math.pow(10, (arr.length - index - 1));
        }
        if (firstPart * secondPart == number) {
            return true;
        }
        return false;
    }

    void findNumbers(int[] arr, int index, int number) {
        if (index >= arr.length - 1) {
            if (this.isVampire(arr, number)) {
                flag = true;
            }
        }
        for (int i = index; i < arr.length; i++) {
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
            findNumbers(arr, index + 1, number);
            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }
};

