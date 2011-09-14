/**
 * 
 */
package ch.janwild.mashup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author jwild
 *
 */
public class Mashup {

	public Mashup () {
		
		mash();
		
	}
	
	public void mash() {
		
		String url = "http://en.wikipedia.org/wiki/List_of_bands_from_Finland";
		String select = "a[title]";
		
		HTMLFetcher finnishBandsFetcher = new HTMLFetcher();
		HTMLExtractor finnishBandsExtractor = new HTMLExtractor();

		Document finnishBandsDokument = finnishBandsFetcher.fetch(url);
		Elements finnishBandsElements = finnishBandsExtractor.extract(finnishBandsDokument, select);
		
		for (Element element : finnishBandsElements) {
			System.out.println("Elements: " + element.text());
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Mashup();
	}

}
