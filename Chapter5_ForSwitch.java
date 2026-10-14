// Chapter5_ForSwitch.java
public class Chapter5_ForSwitch {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}