package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Rare books store");
        Book book1 = new Book("The ninth gate", "Arturo Pérez-Reverte", LocalDate.of(1450, 05, 05));
        Book book2 = new Book("The City in the Sea", "Edgar Allan Poe", LocalDate.of(1847, 10, 15));
        Book book3 = new Book("The Big Four", "Agatha Christie", LocalDate.of(1966, 01, 10));
        //When
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        //Then
        System.out.println(library.books);
        Assert.assertEquals(3, library.books.size());
    }
}
