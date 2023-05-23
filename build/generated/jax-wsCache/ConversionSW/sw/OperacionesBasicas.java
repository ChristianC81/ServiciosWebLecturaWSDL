
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para operacionesBasicas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="operacionesBasicas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacionesBasicas", propOrder = {
    "num1",
    "num2",
    "operacion"
})
public class OperacionesBasicas {

    protected float num1;
    protected float num2;
    protected int operacion;

    /**
     * Obtiene el valor de la propiedad num1.
     * 
     */
    public float getNum1() {
        return num1;
    }

    /**
     * Define el valor de la propiedad num1.
     * 
     */
    public void setNum1(float value) {
        this.num1 = value;
    }

    /**
     * Obtiene el valor de la propiedad num2.
     * 
     */
    public float getNum2() {
        return num2;
    }

    /**
     * Define el valor de la propiedad num2.
     * 
     */
    public void setNum2(float value) {
        this.num2 = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     */
    public int getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     */
    public void setOperacion(int value) {
        this.operacion = value;
    }

}
