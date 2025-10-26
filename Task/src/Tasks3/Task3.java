package Tasks3;

public class Task3 {
    public void checkPositive(int num){
        if (num > 0) {
            System.out.println(num + " is Positive.");
        }else{
            System.out.println(num + " is Negative.");
        }

    }
    public void nestIf(int num) {
        if (num >= 0) {
            if (num == 0) {
                System.out.println("Number is Zero.");
            } else {
                System.out.println(num + " is Positive.");
            }
        } else {
            System.out.println(num + " is Negative.");
        }
    }
    public void printDay(int dayNumber) {
        switch (dayNumber) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number.");
        }
    }
    public void whileLoop() {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }

    public void doWhileLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }

    public void forLoop() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public void breakExample() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Stopping at " + i);
                break;
            }
            System.out.println(i);
        }
    }

    public void continueExample() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static String checkNumber(int num) {
        if (num > 0) {
            return num + " is Positive";
        } else if (num < 0) {
            return num + " is Negative";
        } else {
            return "Number is Zero";
        }
    }

    public void allJump(int numbers) {
        if (numbers == 0) {
            System.out.println("Zero found");
            return;
        }

        for (int i = 1; i <= numbers; i++) {
            if (i < 0) {
                System.out.println("Negative number skipped: " + i);
                continue;
            }

            if (i == 5) {
                System.out.println("Number 5 found — breaking loop.");
                break;
            }

            System.out.println("Processing: " + i);
        }
    }

    public static void main(String[] args) {
        Task3 t3 = new Task3();
//        t3.checkPositive(2);
//        t3.nestIf(0);
//        t3.printDay(7);
//        t3.whileLoop();
//        t3.doWhileLoop();
//        t3.forLoop();
//        t3.breakExample();
//        t3.continueExample();
//          System.out.println(checkNumber(10));
//          System.out.println(checkNumber(-3));
//          System.out.println(checkNumber(0));
          t3.allJump(5);

    }
}
