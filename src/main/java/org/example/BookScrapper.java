package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class BookScrapper {

    public static void main(String[] args) {
     String url ="https://books.toscrape.com/";


      try{
          Document document = Jsoup.connect(url).get();
          Elements books = document.select(".product_pod"); //here we are using cssQuery to select the class product_pod in html page.
          System.out.println("***********************");
          System.out.println("Books - Web Scrapper");
          System.out.println("***********************"+ "\n");

          for(Element book: books){
              String title = book.select("h3 > a").text(); // here we are selecting the anchor tags "<a>" which are inside h3 tags
                                   // and we are using '>' after h3 to refer to a tags that are right after h3.

              String price = book.select(".price_color").text(); //do inspect in the url and look for price_color classes to understand.

              String actual_price = price.substring(1);
              /*
                So the prices from the websites are coming as strings while scraping and in strings the characters start from 0,
                and here we are starting from 1 because in the first index of the price is the pound sign not the actual number
                hence to ignore that we start from index 1 and get the actual price as a string here.
               */

              //get books with 20 pounds; Here we need to parse the actual price to double to make the comparison valid.
              if(Double.parseDouble(actual_price) < 20.0){
                  System.out.println(title + " - " + price);
              }


          }
          //System.out.println(document.outerHtml());//this prints html code.
          System.out.println("\n"+"****Program Finished Successfully******");
      }
      catch(IOException e){
          e.printStackTrace();
      }

    }

}
