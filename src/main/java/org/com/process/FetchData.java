package org.com.process;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;

public class FetchData {

	public Elements getData() {

		File input = new File("/home/saurabh/temp/input.html");
		Document doc = null;
		try {
			doc = Jsoup
					.connect(
							"https://www.realestate.com.au/neighbourhoods/chelsea%20heights-3196-vic")
					.timeout(10 * 10000).get();
			//System.out.println(doc.body);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Execption occurs");
			e.printStackTrace();
			
		}
		
		Elements eles = doc.select("div[data-trend]");
		System.out.println("KKKKKKKKKKKKKKKK "+eles.html());
		//System.out.println("eles "+eles );
		return eles;
		
	}
	
	
	public static void main(String[] args) {
		FetchData fetch = new FetchData();
		
	}
	}
