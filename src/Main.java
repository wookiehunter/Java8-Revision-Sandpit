public class Main implements IFace1 {
    public static void main(String[] args) {
        IFace1.Animal();
        Swims();
        System.out.println(IFace1.namme);
        System.out.println(IFace1.Bird());

        Count count = new Count(10, 20);
        System.out.println(count.add());
        System.out.println(count.subtract());
        System.out.println(count.multiply());
        System.out.println(count.divide());
        System.out.println(count.numbers());

        Counts counts = new Counts(5, 10);
        System.out.println(counts.add());
    }

    public static void Swims() {
        System.out.println("Splishy splash...");
    }
}