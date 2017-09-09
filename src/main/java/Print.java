public class Print {

    String printAsterisk(int n, String type) {
        StringBuilder result = new StringBuilder();
        if ("horizontal".equals(type)) {
            for (int index = 0; index < n; index++) {
                result.append("*");
            }
        } else if ("vertical".equals(type)) {
            for (int index = 0; index < n; index++) {
                result.append("*\n");
            }
            result.replace(result.length() - 1, result.length(), "");
        }
        System.out.println(result);
        return result.toString();
    }
}
