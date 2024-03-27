public class TestBuilder {
    public static void main(String[] args) {
        TargetClassBuilder builder = TargetClass::new;
        TargetClass tc = builder.build("Hello World");
    }
}
class TargetClass{
    private String property;

    public TargetClass(String property) {
        this.property = property;
    }
}

interface TargetClassBuilder{
    TargetClass build(String property);
}