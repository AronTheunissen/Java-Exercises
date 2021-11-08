package nl.sogyo.javaopdrachten.quote;
import java.util.Arrays;
import java.util.ArrayList;
import java.time.*;

public class Quote {
    String[][] quotes = {
        {"galileo", "eppur si muove"},
        {"archimedes", "eureka!"},
        {"erasmus", "in regione caecorum rex est luscus"},
        {"socrates", "I know nothing except the fact of my ignorance"},
        {"rené descartes", "cogito, ergo sum"},
        {"sir isaac newton", "if I have seen further it is by standing on the shoulders of giants"}
    };

    public static void main(String... args) {
		Quote quote = new Quote();
        LocalDate date = LocalDate.now();
		int dayNumber = date.getDayOfYear();
		int quoteNumber = (dayNumber + 5) % 6;
		String[] quoteOfDay = quote.quotes[quoteNumber];
		String writer = quoteOfDay[0];
		String justQuote = quoteOfDay[1];
		
		String[] nameParts = writer.split("\s");
		String capitalWriter = "";
		for(int i = 0; i < nameParts.length; i++){
			nameParts[i] = nameParts[i].substring(0,1).toUpperCase() + nameParts[i].substring(1);
			capitalWriter = capitalWriter + " " + nameParts[i];
		}
		
		justQuote = justQuote.substring(0,1).toUpperCase() + justQuote.substring(1);
		char[] quoteLetters = justQuote.toCharArray();
		if(quoteLetters[quoteLetters.length-1] != '!' && quoteLetters[quoteLetters.length-1] != '?' && quoteLetters[quoteLetters.length-1] != '.'){
			justQuote = justQuote + ".";
		}
		System.out.println("The quote for " + date + " : " + justQuote + " -- " + capitalWriter);
    }
}







