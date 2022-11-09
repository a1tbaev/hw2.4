public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Adil", "Programmer", "Coding");
        Dancer dancer = new Dancer("Agusha", "Dancer", "Dancing");
        Singer singer = new Singer("Adil", "Singer", "Singing", "Play guitar");
        System.out.println(singer);
        System.out.println(dancer);
        System.out.println(programmer);
    }
}