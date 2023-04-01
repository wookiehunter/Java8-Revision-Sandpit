public class Count implements IFace1 {
    private Integer A;
    private Integer B;
    public Count(Integer a, Integer b) {
        A = a;
        B = b;
    }
    public Integer add() {
        return A + B;
    }
    public Integer subtract() {
        return A - B;
    }
    public Integer multiply() {
        return A * B;
    }
    public Integer divide() {
        return A / B;
    }
    public String numbers() {
        return "First number: " + A + " Second number: " + B;
    }
    public String name() {
        return IFace1.name;
    }
}
