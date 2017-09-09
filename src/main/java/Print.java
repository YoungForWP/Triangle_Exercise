public class Print {

    String printAsterisk(int n, String type) {
        if ("horizontal".equals(type)) return print(n, "*");
        if ("vertical".equals(type)) return print(n, "*\n");
        if ("right".equals(type)) return printRight(n);
        return null;
    }

    private String printRight(int n) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < n; index++) {
            result.append(print(index + 1, "*")).append("\n");
        }
        dealWithBreakLineInEnd(result);
        return result.toString();
    }

    private String print(int n,  String symbol) {
        StringBuilder result = buildString(n, symbol, "");
        dealWithBreakLineInEnd(result);
        System.out.println(result);
        return result.toString();
    }

    private StringBuilder buildString(int n, String symbol, String lastSymbol) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < n; index++) {
            result.append(symbol).append(lastSymbol);
        }
        return result;
    }

    private void dealWithBreakLineInEnd(StringBuilder result) {
        if (hasBreakLineInEnd(result)) {
            removeBreakLine(result);
        }
    }

    private StringBuilder removeBreakLine(StringBuilder result) {
        return result.replace(result.length() - 1, result.length(), "");
    }

    private boolean hasBreakLineInEnd(StringBuilder result) {
        return result.lastIndexOf("\n") == result.length() - 1;
    }
}
