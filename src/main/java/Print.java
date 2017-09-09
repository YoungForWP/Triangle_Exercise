public class Print {

    String printAsterisk(int n, String type) {
        StringBuilder result = new StringBuilder();
        if ("horizontal".equals(type)) {
            for (int index = 0; index < n; index++) {
                result.append("*");
            }
        } else if ("vertical".equals(type)) {
            result.append("*\n*");
        }
        System.out.println(result);
        return result.toString();
    }
}
