/**
 * 
 */
package ch.janwild.mashup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author jwild
 *
 */
public class HTMLFetcher {
	
	public Document fetch (String url) {
		
		Document document = null;
		try {
			document = Jsoup.connect("http://en.wikipedia.org/wiki/List_of_bands_from_Finland").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return document;
		
	}

}
