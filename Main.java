import java.util.Scanner;

public class Main {

    int sumLastNums(int n) {
        int x = n % 10;
        int y = (n / 10) % 10;
        return x + y;
    }

    boolean isPositive (int n) {
        if(n >= 0){
            return true;
        }else{
            return false;
        }

    }

    boolean isUpperCase (char x){
        return Character.isUpperCase(x);
    }

    boolean isDivisor(int a, int b) {
        return (b != 0 && a % b == 0) || (a != 0 && b % a == 0);
    }

    int lastNumSum(int a, int b){
        return a % 10 + b % 10;
    }

    double safeDiv (int x, int y){
        if (y == 0) return 0;
        return (double) x / y;
    }

    String makeDecision (int x, int y){
        if(x>y){
            return x + " > " + y;
        }else if(x<y){
            return x + " < " + y;
        }else{
            return x + " == " + y;
        }
    }

    boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }
    String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return x + " лет";
        }
        if (lastDigit == 1) {
            return x + " год";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
                break;
        }
    }

    String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();

        for (int i = x; i >= 0; i--) {
            result.append(i);
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public int pow(int x, int y) {
        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }

    public boolean equalNum(int x) {
        x = Math.abs(x);
        int last = x % 10;
        x = x / 10;
        while (x > 0) {
            if (x % 10 != last) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }


    static void main(String[] args) {
        Main main = new Main();
        boolean flag = true;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.print("-----| lab N1 V4 |----\n");
            System.out.print("---------- n1 --------\n");
            System.out.print("sumLastNums          1\n");
            System.out.print("isPositive           2\n");
            System.out.print("isUpperCase          3\n");
            System.out.print("isDivisor            4\n");
            System.out.print("lastNumSum           5\n");
            System.out.print("---------- n2 --------\n");
            System.out.print("safeDiv              6\n");
            System.out.print("makeDecision         7\n");
            System.out.print("sum3                 8\n");
            System.out.print("age                  9\n");
            System.out.print("printDays           10\n");
            System.out.print("---------- n3 --------\n");
            System.out.print("reverseListNums     11\n");
            System.out.print("pow                 12\n");
            System.out.print("equalNum            13\n");
            System.out.print("leftTriangle        14\n");
            System.out.print("rightTriangle       15\n");
            System.out.print("---------- n4 --------\n");
            System.out.print("findLast            16\n");
            System.out.print("add                 17\n");
            System.out.print("reverse             18\n");
            System.out.print("concat              19\n");
            System.out.print("deleteNegative      20\n");
            System.out.print("Выберите задачу: ");


            int i = scanner.nextInt();

            switch (i) {
                case 1:
                    int n = scanner.nextInt();
                    System.out.print(main.sumLastNums(n) + "\n");
                    break;
                case 2:
                    int n2 = scanner.nextInt();
                    System.out.print(main.isPositive(n2) + "\n");
                    break;
                case 3:
                    String n3 = scanner.next();
                    System.out.print(main.isUpperCase(n3.toCharArray()[0]) + "\n");
                    break;
                case 4:
                    int n4 = scanner.nextInt();
                    int n5 = scanner.nextInt();
                    System.out.print(main.isDivisor(n4,n5) + "\n");
                    break;
                case 5:
                    int n6 = scanner.nextInt();
                    int n7 = scanner.nextInt();
                    System.out.print(main.lastNumSum(n6,n7) + "\n");
                    break;
                case 6:
                    int n8 = scanner.nextInt();
                    int n9 = scanner.nextInt();
                    System.out.print(main.safeDiv(n8,n9) + "\n");
                    break;
                case 7:
                    int n10 = scanner.nextInt();
                    int n11 = scanner.nextInt();
                    System.out.print(main.makeDecision(n10,n11) + "\n");
                    break;
                case 8:
                    int n12 = scanner.nextInt();
                    int n13 = scanner.nextInt();
                    int n14 = scanner.nextInt();
                    System.out.print(main.sum3(n12,n13,n14) + "\n");
                    break;
                case 9:
                    int n15 = scanner.nextInt();
                    System.out.print(main.age(n15) + "\n");
                    break;
                case 10:
                    String n16 = scanner.next();
                    main.printDays(n16);
                    break;
                case 11:
                    int n17 = scanner.nextInt();
                    System.out.print(main.reverseListNums(n17) + "\n");
                    break;
                case 12:
                    int n18 = scanner.nextInt();
                    int n19 = scanner.nextInt();
                    System.out.print(main.pow(n18,n19) + "\n");
                    break;
                case 13:
                    int n20 = scanner.nextInt();
                    System.out.print(main.equalNum(n20) + "\n");
                    break;
                case 14:
                    int n21 = scanner.nextInt();
                    main.leftTriangle(n21);
                    break;
                case 15:
                    int n22 = scanner.nextInt();
                    main.rightTriangle(n22);
                    break;
                case 16:
                    int len1 = scanner.nextInt();
                    int[] arr1 = new int[len1];
                    for (int j = 0; j < len1; j++) {
                        arr1[j] = scanner.nextInt();
                    }
                    int x1 = scanner.nextInt();
                    System.out.print(main.findLast(arr1, x1) + "\n");
                    break;
                case 17:
                    int len2 = scanner.nextInt();
                    int[] arr2 = new int[len2];
                    for (int j = 0; j < len2; j++) {
                        arr2[j] = scanner.nextInt();
                    }
                    int x2 = scanner.nextInt();
                    int pos = scanner.nextInt();
                    int[] res17 = main.add(arr2, x2, pos);
                    for (int j = 0; j < res17.length; j++) {
                        System.out.print(res17[j] + " ");
                    }
                    System.out.println();
                    break;
                case 18:
                    int len3 = scanner.nextInt();
                    int[] arr3 = new int[len3];
                    for (int j = 0; j < len3; j++) {
                        arr3[j] = scanner.nextInt();
                    }
                    main.reverse(arr3);
                    for (int j = 0; j < arr3.length; j++) {
                        System.out.print(arr3[j] + " ");
                    }
                    System.out.println();
                    break;
                case 19:
                    int len4 = scanner.nextInt();
                    int[] arr4 = new int[len4];
                    for (int j = 0; j < len4; j++) {
                        arr4[j] = scanner.nextInt();
                    }
                    int len5 = scanner.nextInt();
                    int[] arr5 = new int[len5];
                    for (int j = 0; j < len5; j++) {
                        arr5[j] = scanner.nextInt();
                    }
                    int[] res19 = main.concat(arr4, arr5);
                    for (int j = 0; j < res19.length; j++) {
                        System.out.print(res19[j] + " ");
                    }
                    System.out.println();
                    break;
                case 20:
                    int len6 = scanner.nextInt();
                    int[] arr6 = new int[len6];
                    for (int j = 0; j < len6; j++) {
                        arr6[j] = scanner.nextInt();
                    }
                    int[] res20 = main.deleteNegative(arr6);
                    for (int j = 0; j < res20.length; j++) {
                        System.out.print(res20[j] + " ");
                    }
                    System.out.println();
                    break;

                default:
                    flag = false;
                    break;
            }
        } while (flag);

    }
}