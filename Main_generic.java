public class Main_generic {
    public static void main(String[] args) {
        Pair<String, Integer> p3 = new Pair<>("John", 32);

        System.out.println(p3.getFirst());   // พิมพ์ John
        p3.setFirst("Loki");
        System.out.println(p3.getFirst());   // พิมพ์ Loki
        p3.setSecond(4);
        System.out.println(p3.getSecond());  // พิมพ์ 4
    }
}
