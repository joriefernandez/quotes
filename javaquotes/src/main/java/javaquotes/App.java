/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaquotes;

public class App {

    private static final String FILE = "src/main/resources/recentquotes.json";

    public static void main(String[] args) {

       QuoteReader qReader = new QuoteReader(FILE);
       System.out.println(qReader.getRandomQuote());

    }


}
