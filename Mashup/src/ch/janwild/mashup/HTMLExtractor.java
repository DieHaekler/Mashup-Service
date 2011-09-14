/**
 * 
 */
package ch.janwild.mashup;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @author jwild
 * 
 */
public class HTMLExtractor {

	public Elements extract(Document document, String select) {

		Elements elements = document.select(select);

		System.out.println(document);
		
		return elements;
	
	}

}
