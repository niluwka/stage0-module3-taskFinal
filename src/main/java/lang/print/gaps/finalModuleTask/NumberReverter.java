package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String str = Integer.toString(number);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedStr = sb.toString();
        System.out.println(reversedStr);

    }
}
