package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("XYZ", "Book1", 1994, "1");
        Book book2 = new Book("ABC", "Book2", 1997, "2");
        Book book3 = new Book("DEF", "Book3", 2001, "3");
        Book book4 = new Book("KLM", "Book4", 2020, "4");
        Book book5 = new Book("KLM", "Book4", 2013, "5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(2001, median);
    }
}
