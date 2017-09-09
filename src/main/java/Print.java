public class Print {

    String printAsterisk(int n) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < n; index++) {
            result.append("*");
        }
        return result.toString();
    }
}
