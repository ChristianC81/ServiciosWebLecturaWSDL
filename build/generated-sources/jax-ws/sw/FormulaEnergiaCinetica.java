
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formulaEnergiaCinetica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formulaEnergiaCinetica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="velocidad" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formulaEnergiaCinetica", propOrder = {
    "masa",
    "velocidad"
})
public class FormulaEnergiaCinetica {

    protected float masa;
    protected float velocidad;

    /**
     * Obtiene el valor de la propiedad masa.
     * 
     */
    public float getMasa() {
        return masa;
    }

    /**
     * Define el valor de la propiedad masa.
     * 
     */
    public void setMasa(float value) {
        this.masa = value;
    }

    /**
     * Obtiene el valor de la propiedad velocidad.
     * 
     */
    public float getVelocidad() {
        return velocidad;
    }

    /**
     * Define el valor de la propiedad velocidad.
     * 
     */
    public void setVelocidad(float value) {
        this.velocidad = value;
    }

}
