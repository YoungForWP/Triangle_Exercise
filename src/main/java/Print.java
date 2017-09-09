public class Print {

    String printAsterisk(int n, String type) {
        if ("horizontal".equals(type)) {
            return print(n, "*");
        } else if ("vertical".equals(type)) {
            return print(n, "*\n");
        }
        return null;
    }

    private String print(int n,  String symbol) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < n; index++) {
            result.append(symbol);
        }
        if (hasBreakLineInEnd(result)) {
            removeBreakLine(result);
        }
        System.out.println(result);
        return result.toString();
    }

    private StringBuilder removeBreakLine(StringBuilder result) {
        return result.replace(result.length() - 1, result.length(), "");
    }

    private boolean hasBreakLineInEnd(StringBuilder result) {
        return result.lastIndexOf("\n") == result.length() - 1;
    }
}
