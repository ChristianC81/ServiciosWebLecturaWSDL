
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
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

    private final static QName _EuroAdolar_QNAME = new QName("http://sw/", "euroAdolar");
    private final static QName _EuroAdolarResponse_QNAME = new QName("http://sw/", "euroAdolarResponse");
    private final static QName _FormulaArea_QNAME = new QName("http://sw/", "formulaArea");
    private final static QName _FormulaAreaResponse_QNAME = new QName("http://sw/", "formulaAreaResponse");
    private final static QName _FormulaEnergiaCinetica_QNAME = new QName("http://sw/", "formulaEnergiaCinetica");
    private final static QName _FormulaEnergiaCineticaResponse_QNAME = new QName("http://sw/", "formulaEnergiaCineticaResponse");
    private final static QName _FormulaVelocidad_QNAME = new QName("http://sw/", "formulaVelocidad");
    private final static QName _FormulaVelocidadResponse_QNAME = new QName("http://sw/", "formulaVelocidadResponse");
    private final static QName _Hello_QNAME = new QName("http://sw/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://sw/", "helloResponse");
    private final static QName _Login_QNAME = new QName("http://sw/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://sw/", "loginResponse");
    private final static QName _OperacionesBasicas_QNAME = new QName("http://sw/", "operacionesBasicas");
    private final static QName _OperacionesBasicasResponse_QNAME = new QName("http://sw/", "operacionesBasicasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EuroAdolar }
     * 
     */
    public EuroAdolar createEuroAdolar() {
        return new EuroAdolar();
    }

    /**
     * Create an instance of {@link EuroAdolarResponse }
     * 
     */
    public EuroAdolarResponse createEuroAdolarResponse() {
        return new EuroAdolarResponse();
    }

    /**
     * Create an instance of {@link FormulaArea }
     * 
     */
    public FormulaArea createFormulaArea() {
        return new FormulaArea();
    }

    /**
     * Create an instance of {@link FormulaAreaResponse }
     * 
     */
    public FormulaAreaResponse createFormulaAreaResponse() {
        return new FormulaAreaResponse();
    }

    /**
     * Create an instance of {@link FormulaEnergiaCinetica }
     * 
     */
    public FormulaEnergiaCinetica createFormulaEnergiaCinetica() {
        return new FormulaEnergiaCinetica();
    }

    /**
     * Create an instance of {@link FormulaEnergiaCineticaResponse }
     * 
     */
    public FormulaEnergiaCineticaResponse createFormulaEnergiaCineticaResponse() {
        return new FormulaEnergiaCineticaResponse();
    }

    /**
     * Create an instance of {@link FormulaVelocidad }
     * 
     */
    public FormulaVelocidad createFormulaVelocidad() {
        return new FormulaVelocidad();
    }

    /**
     * Create an instance of {@link FormulaVelocidadResponse }
     * 
     */
    public FormulaVelocidadResponse createFormulaVelocidadResponse() {
        return new FormulaVelocidadResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link OperacionesBasicas }
     * 
     */
    public OperacionesBasicas createOperacionesBasicas() {
        return new OperacionesBasicas();
    }

    /**
     * Create an instance of {@link OperacionesBasicasResponse }
     * 
     */
    public OperacionesBasicasResponse createOperacionesBasicasResponse() {
        return new OperacionesBasicasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroAdolar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroAdolar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "euroAdolar")
    public JAXBElement<EuroAdolar> createEuroAdolar(EuroAdolar value) {
        return new JAXBElement<EuroAdolar>(_EuroAdolar_QNAME, EuroAdolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroAdolarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroAdolarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "euroAdolarResponse")
    public JAXBElement<EuroAdolarResponse> createEuroAdolarResponse(EuroAdolarResponse value) {
        return new JAXBElement<EuroAdolarResponse>(_EuroAdolarResponse_QNAME, EuroAdolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormulaArea }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormulaArea }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "formulaArea")
    public JAXBElement<FormulaArea> createFormulaArea(FormulaArea value) {
        return new JAXBElement<FormulaArea>(_FormulaArea_QNAME, FormulaArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormulaAreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormulaAreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "formulaAreaResponse")
    public JAXBElement<FormulaAreaResponse> createFormulaAreaResponse(FormulaAreaResponse value) {
        return new JAXBElement<FormulaAreaResponse>(_FormulaAreaResponse_QNAME, FormulaAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormulaEnergiaCinetica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormulaEnergiaCinetica }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "formulaEnergiaCinetica")
    public JAXBElement<FormulaEnergiaCinetica> createFormulaEnergiaCinetica(FormulaEnergiaCinetica value) {
        return new JAXBElement<FormulaEnergiaCinetica>(_FormulaEnergiaCinetica_QNAME, FormulaEnergiaCinetica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormulaEnergiaCineticaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormulaEnergiaCineticaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "formulaEnergiaCineticaResponse")
    public JAXBElement<FormulaEnergiaCineticaResponse> createFormulaEnergiaCineticaResponse(FormulaEnergiaCineticaResponse value) {
        return new JAXBElement<FormulaEnergiaCineticaResponse>(_FormulaEnergiaCineticaResponse_QNAME, FormulaEnergiaCineticaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormulaVelocidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormulaVelocidad }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "formulaVelocidad")
    public JAXBElement<FormulaVelocidad> createFormulaVelocidad(FormulaVelocidad value) {
        return new JAXBElement<FormulaVelocidad>(_FormulaVelocidad_QNAME, FormulaVelocidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormulaVelocidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FormulaVelocidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "formulaVelocidadResponse")
    public JAXBElement<FormulaVelocidadResponse> createFormulaVelocidadResponse(FormulaVelocidadResponse value) {
        return new JAXBElement<FormulaVelocidadResponse>(_FormulaVelocidadResponse_QNAME, FormulaVelocidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionesBasicas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionesBasicas }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionesBasicas")
    public JAXBElement<OperacionesBasicas> createOperacionesBasicas(OperacionesBasicas value) {
        return new JAXBElement<OperacionesBasicas>(_OperacionesBasicas_QNAME, OperacionesBasicas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionesBasicasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionesBasicasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "operacionesBasicasResponse")
    public JAXBElement<OperacionesBasicasResponse> createOperacionesBasicasResponse(OperacionesBasicasResponse value) {
        return new JAXBElement<OperacionesBasicasResponse>(_OperacionesBasicasResponse_QNAME, OperacionesBasicasResponse.class, null, value);
    }

}
