
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _SendEmailResponse_QNAME = new QName("http://service/", "send_EmailResponse");
    private final static QName _SendEmail_QNAME = new QName("http://service/", "send_Email");
    private final static QName _TestWebService_QNAME = new QName("http://service/", "test_WebService");
    private final static QName _SendEmailBatch_QNAME = new QName("http://service/", "send_EmailBatch");
    private final static QName _SendEmailBatchResponse_QNAME = new QName("http://service/", "send_EmailBatchResponse");
    private final static QName _TestWebServiceResponse_QNAME = new QName("http://service/", "test_WebServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestWebService }
     * 
     */
    public TestWebService createTestWebService() {
        return new TestWebService();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link TestWebServiceResponse }
     * 
     */
    public TestWebServiceResponse createTestWebServiceResponse() {
        return new TestWebServiceResponse();
    }

    /**
     * Create an instance of {@link SendEmailBatchResponse }
     * 
     */
    public SendEmailBatchResponse createSendEmailBatchResponse() {
        return new SendEmailBatchResponse();
    }

    /**
     * Create an instance of {@link SendEmailBatch }
     * 
     */
    public SendEmailBatch createSendEmailBatch() {
        return new SendEmailBatch();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWebService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "testWebService")
    public JAXBElement<TestWebService> createTestWebService(TestWebService value) {
        return new JAXBElement<TestWebService>(_TestWebService_QNAME, TestWebService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sendEmailBatch")
    public JAXBElement<SendEmailBatch> createSendEmailBatch(SendEmailBatch value) {
        return new JAXBElement<SendEmailBatch>(_SendEmailBatch_QNAME, SendEmailBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailBatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "sendEmailBatchResponse")
    public JAXBElement<SendEmailBatchResponse> createSendEmailBatchResponse(SendEmailBatchResponse value) {
        return new JAXBElement<SendEmailBatchResponse>(_SendEmailBatchResponse_QNAME, SendEmailBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestWebServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "testWebServiceResponse")
    public JAXBElement<TestWebServiceResponse> createTestWebServiceResponse(TestWebServiceResponse value) {
        return new JAXBElement<TestWebServiceResponse>(_TestWebServiceResponse_QNAME, TestWebServiceResponse.class, null, value);
    }

}
