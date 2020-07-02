package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product apple = new Product("apple");
        Product orange = new Product("orange");

        Item item1 = new Item(new BigDecimal(2), 1, new BigDecimal(2));
        Item item2 = new Item(new BigDecimal(2), 30000, new BigDecimal(60000));
        Item item3 = new Item(new BigDecimal(45), 2, new BigDecimal(90));

        apple.getItems().add(item1);
        apple.getItems().add(item2);
        orange.getItems().add(item3);

        item1.setProduct(apple);
        item2.setProduct(apple);
        item3.setProduct(orange);

        Invoice invoice = new Invoice("Invoice no 1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(apple);
        productDao.save(orange);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        //Then
        Assert.assertNotNull(invoice.getId());
        Assert.assertNotEquals(0, invoice.getId());


        //CleanUp
        itemDao.delete(item1);
        itemDao.delete(item2);
        itemDao.delete(item3);
        invoiceDao.delete(invoice);
        productDao.delete(apple);
        productDao.delete(orange);
    }
}
