package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public static void isFirstAliquot(int first, int second) {
        if (first >= 2 && first % second == 0)
            System.out.println("Aliqout");
        else
            System.out.println("Not aliqout");
    }

    public static void main(String[] args) {
        isFirstAliquot(6, 12);
    }
}
