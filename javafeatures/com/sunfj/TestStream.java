import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        //iterate方式生成Stream对象
        Stream<Integer> limit = Stream.iterate(0, n -> n + 2).limit(6);
        /*System.out.println(limit.getClass());
        limit.forEach(System.out::println);*/

        //中间操作符->filter\map
        List<Integer> collect = limit.filter(i -> i > 2).map(i->i+1).toList();
        collect.forEach(System.out::print);

        //中间操作符-》distinct
        Stream<Integer> integerStream = Stream.of(1, 1, 2, 2, 3);
        List<Integer> list = integerStream.distinct().toList();
        list.forEach(System.out::print);

        //...
        Stream.generate(Math::random).limit(5).map(User::new).sorted().forEach(System.out::println);
    }
}
@Data
@AllArgsConstructor
@ToString
class User implements Comparable{
    private String name;
    private Double percent;
    private String address;

    public static void main(String[] args) {
        List<User> users = User.initUserListDemo();
        users.forEach(user -> System.out.println(user.getPercent()));
    }
    public static List<User> initUserListDemo(){
        return Stream.generate(Math::random).limit(100).map(User::new).toList();
    }
    public User(Double d){
        this.percent = d;
    }

    @Override
    public int compareTo(Object o) {
        if(((User)o).getPercent()>percent){
            return 1;
        }else if (((User) o).getPercent().equals(percent)){
            return 0;
        }else {
            return -1;
        }
    }
}