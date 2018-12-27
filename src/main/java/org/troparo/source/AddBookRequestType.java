
package org.troparo.source;

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
 *         &lt;element ref="{http://troparo.org/entities/book}BookTypeIn"/>
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
    "bookTypeIn"
})
@XmlRootElement(name = "addBookRequestType")
public class AddBookRequestType {

    @XmlElement(name = "BookTypeIn", required = true)
    protected BookTypeIn bookTypeIn;

    /**
     * Gets the value of the bookTypeIn property.
     * 
     * @return
     *     possible object is
     *     {@link BookTypeIn }
     *     
     */
    public BookTypeIn getBookTypeIn() {
        return bookTypeIn;
    }

    /**
     * Sets the value of the bookTypeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookTypeIn }
     *     
     */
    public void setBookTypeIn(BookTypeIn value) {
        this.bookTypeIn = value;
    }

}
