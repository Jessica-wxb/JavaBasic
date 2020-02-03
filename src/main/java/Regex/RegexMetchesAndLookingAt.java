package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator
 *
 * matches和lookingAt方法
 * matches和lookingAt方法都用来尝试匹配一个输入序列模式。它们的不同是matches要求整个序列都匹配，而lookingAt不要求。
 * lookingAt方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配。
 * 这两个方法经常在输入字符串的开始使用
 */
public class RegexMetchesAndLookingAt {
    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static final String INPUT2 = "oooooooooofffffffoooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;

    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is:" + REGEX);
        System.out.println("Current INPUT is :" + INPUT);
        System.out.println("Current INPUT2 is ：" + INPUT2);

        System.out.println("lookingAt():" + matcher.lookingAt());
        System.out.println("matches():" + matcher.matches());
        System.out.println("lookingAt():" + matcher2.lookingAt());
    }
}
