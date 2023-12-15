// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] zahlen = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int gesucht = 7;

        SearchArray searchArray = new SearchArray();
        System.out.println(searchArray.search(zahlen, gesucht));
    }
}