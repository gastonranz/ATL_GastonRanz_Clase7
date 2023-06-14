import java.util.Scanner;

public class EjerciciosClase7 {
    public static void main(String[] args) {
        int[] numbers = EjerciciosClase7.printNumbers();
        EjerciciosClase7.averageNumber(numbers);
    }

    private static int[] printNumbers() {
        Scanner num = new Scanner(System.in);
        int[] numbers = new int[5];
        Integer i = 0;
        System.out.println("Type 5 numbers and watch them on console!\nType your " + (i + 1) + "st number:");
        numbers[i] = num.nextInt();
        i++;

        System.out.println("Type your " + (i + 1) + "nd number:");
        numbers[i] = num.nextInt();
        i++;

        System.out.println("Type your " + (i + 1) + "rd number:");
        numbers[i] = num.nextInt();
        i++;

        do {
            System.out.println("Type your " + (i + 1) + "th number:");
            numbers[i] = new Scanner(System.in).nextInt();
            i++;
        } while(i < numbers.length);

        System.out.println("\n-- Your numbers are: --\n");

        for(i = 0; i < numbers.length; i++) {
            System.out.println("numbers [" + i + "] = " + numbers[i]);
        }
        EjerciciosClase7.numMenorMedioMayor(numbers);
        return numbers;
    }

    private static void numMenorMedioMayor(int[] numbers) {
        int numMayor = numbers[0];
        int numMedio = numbers[0];
        int numMenor = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > numMayor) numMayor = numbers[i];
        }

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < numMenor) numMenor = numbers[i];
        }

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > numMenor && numbers[i] < numMayor) numMedio = numbers[i];
        }
        EjerciciosClase7.showCorrectNumbers(numMenor, numMedio, numMayor);
    }

    private static void showCorrectNumbers(int numMenor, int numMedio, int numMayor) {
        System.out.println("\n-- Your Bigger number is: " + numMayor + " --\n-- Your Average number is: " + numMedio + " --\n" +
                "-- Your Smaller number is: " + numMenor + " --");
    }

    private static void averageNumber(int[] numbers) {
        float total = 0;
        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("\nYour Average number is: " + (total / (float) numbers.length));
    }
}