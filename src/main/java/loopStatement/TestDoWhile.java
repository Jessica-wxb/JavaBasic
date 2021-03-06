package loopStatement;

/**
 * @author Administrator
 * do...while循环
 * 对于while语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次
 * do...while循环和while循环相似，不同的是，do...while循环至少会执行一次
 * do{  // 代码语句  }while(布尔表达式)
 *
 * 注意：布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。如果布尔表达式的值为true，
 * 则语句块一直执行，知道布尔表达式的值为false
 */
public class TestDoWhile {
    public static void main(String[] args) {
        // 定义变量x,并进行初始化
        int x = 10;
        do {
            System.out.println("value of x:" + x);
            x++;
            System.out.println("\n");
        } while (x < 20);

    }
}
