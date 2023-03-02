package Questions;

public class Question5 {

    public static void resolution() {
        String tallys = "Tallys";
        System.out.println(tallys);
        for (int i = (tallys.length() - 1); i >= 0; i--) {
            char each = tallys.charAt(i);
            System.out.print(each);
        }
    }
}