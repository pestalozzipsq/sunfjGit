import java.util.Arrays;
import java.util.List;

public class TestFunctionImport {
    public static void main(String[] args) {
       /* String[] array = {"aaaa", "bbbb", "cccc"};
        List<String> list = Arrays.asList(array);
        //省略lambda
        list.forEach(System.out::println);

        FunctionA functionA = test->{return test+1;};
        System.out.println(functionA.get("1"));

        String msg3 = joinStr("你好", item->item+"！世界"); //输出：你好！世界
        System.out.println(msg3);*/




    }

    private static String joinStr(String a, FunctionA b) {
        return b.get(a);
    }
}
