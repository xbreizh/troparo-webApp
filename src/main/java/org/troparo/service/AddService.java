package org.troparo.service;


import com.telusko.source.*;
import org.troparo.source.*;

import java.util.List;

public class AddService {

    BookService bookService = new BookService();




    public int add(int i, int j){
        return i+j;
    }

    public List<BookTypeOut> testBook(){
        /*BookListResponseType word = null;*/
        BookService bookService = new BookService();
        IBookService iBookService = bookService.getBookServicePort();
        BookListRequestType br = new BookListRequestType();
        BookListResponseType brt = null;
        List<BookTypeOut> bookList =null;
        try {
            brt = iBookService.getAllBooks(br);
            bookList = brt.getBookListType().getBookTypeOut();
            for (BookTypeOut book: bookList){
                System.out.println(book.getTitle());
                System.out.println(book.getAuthor());
                System.out.println(book.getKeywords());
               /* word = book;
*/
            }
        } catch (BusinessException e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
