# BookScrapper

BookScrapper is a simple Java-based web scraping project that demonstrates how to extract book information from the website [Books to Scrape](https://books.toscrape.com/) using the Jsoup library. This project is a learning exercise to understand the basics of web scraping and working with HTML elements in Java.

## Project Overview

The BookScrapper project connects to the Books to Scrape website, selects book elements using CSS selectors, and extracts the titles and prices of the books. It then filters and prints the books that are priced below 20 pounds.

## Features

- Connects to a specified URL using Jsoup.
- Uses CSS selectors to extract relevant HTML elements.
- Extracts and prints book titles and prices.
- Filters books based on price criteria.

## Technologies Used

- Java
- Jsoup library

## How It Works

1. **Connect to the website:** The project uses Jsoup to connect to the Books to Scrape website.
2. **Select book elements:** It uses CSS selectors to select the `product_pod` class, which contains book details.
3. **Extract title and price:** It extracts the title and price of each book.
4. **Filter by price:** It converts the price from a string to a double and filters books that are priced below 20 pounds.
5. **Print results:** It prints the titles and prices of the filtered books.

## Usage

To run the project, ensure you have the Jsoup library included in your dependencies. Then, execute the main method in the `BookScrapper` class. The program will scrape the book details from the website and print the titles and prices of books priced below 20 pounds.
