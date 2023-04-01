public class Main {
    public static void main(String[] args) {
        Count count = new Count(10, 20);
        System.out.println(count.add());
        System.out.println(count.subtract());
        System.out.println(count.multiply());
        System.out.println(count.divide());
        System.out.println(count.numbers());
        System.out.println(count.name());

        Counts counts = new Counts(10, 2);
        System.out.println(counts.add());
        System.out.println(counts.subtract());
        System.out.println(counts.multiply());
        System.out.println(counts.divide());
        System.out.println(counts.numbers());
    }

    public static void Swims() {
        System.out.println("Splishy splash...");
    }
}