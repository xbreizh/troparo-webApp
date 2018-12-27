
package org.troparo.source;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.telusko.source package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.telusko.source
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBookRequestType }
     * 
     */
    public AddBookRequestType createAddBookRequestType() {
        return new AddBookRequestType();
    }

    /**
     * Create an instance of {@link BookTypeIn }
     * 
     */
    public BookTypeIn createBookTypeIn() {
        return new BookTypeIn();
    }

    /**
     * Create an instance of {@link AddBookResponseType }
     * 
     */
    public AddBookResponseType createAddBookResponseType() {
        return new AddBookResponseType();
    }

    /**
     * Create an instance of {@link BookListRequestType }
     * 
     */
    public BookListRequestType createBookListRequestType() {
        return new BookListRequestType();
    }

    /**
     * Create an instance of {@link BookListResponseType }
     * 
     */
    public BookListResponseType createBookListResponseType() {
        return new BookListResponseType();
    }

    /**
     * Create an instance of {@link BookListType }
     * 
     */
    public BookListType createBookListType() {
        return new BookListType();
    }

    /**
     * Create an instance of {@link BookTypeOut }
     * 
     */
    public BookTypeOut createBookTypeOut() {
        return new BookTypeOut();
    }

    /**
     * Create an instance of {@link BusinessFaultType }
     * 
     */
    public BusinessFaultType createBusinessFaultType() {
        return new BusinessFaultType();
    }

}
