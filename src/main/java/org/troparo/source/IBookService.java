
package org.troparo.source;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IBookService", targetNamespace = "http://troparo.org/services/BookService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBookService {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.telusko.source.AddBookResponseType
     * @throws BusinessException
     */
    @WebMethod
    @WebResult(name = "addBookResponseType", targetNamespace = "http://troparo.org/entities/book", partName = "parameters")
    public AddBookResponseType addBook(
        @WebParam(name = "addBookRequestType", targetNamespace = "http://troparo.org/entities/book", partName = "parameters")
        AddBookRequestType parameters)
        throws BusinessException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.telusko.source.BookListResponseType
     * @throws BusinessException
     */
    @WebMethod
    @WebResult(name = "BookListResponseType", targetNamespace = "http://troparo.org/entities/book", partName = "parameters")
    public BookListResponseType getAllBooks(
        @WebParam(name = "BookListRequestType", targetNamespace = "http://troparo.org/entities/book", partName = "parameters")
        BookListRequestType parameters)
        throws BusinessException
    ;

}
