public class Main {

    public static void main(String[] args) {
        Krug krug = new Krug("krug ",4.5);
        Pravokutnik pravokutnik = new Pravokutnik("pravokutnik ",4,6);
        Trokut trokut = new Trokut("trokut ",1,2,7);
        System.out.println(krug.toString());
        System.out.println(pravokutnik.toString());
        System.out.println(trokut.toString());
    }
}