
package org.troparo.source;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://troparo.org/entities/book}BookTypeOut" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookTypeOut"
})
@XmlRootElement(name = "BookListType")
public class BookListType {

    @XmlElement(name = "BookTypeOut", required = true)
    protected List<BookTypeOut> bookTypeOut;

    /**
     * Gets the value of the bookTypeOut property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookTypeOut property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookTypeOut().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookTypeOut }
     * 
     * 
     */
    public List<BookTypeOut> getBookTypeOut() {
        if (bookTypeOut == null) {
            bookTypeOut = new ArrayList<BookTypeOut>();
        }
        return this.bookTypeOut;
    }

}
