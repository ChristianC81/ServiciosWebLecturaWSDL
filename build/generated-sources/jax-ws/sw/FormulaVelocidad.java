
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formulaVelocidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formulaVelocidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formulaVelocidad", propOrder = {
    "distancia",
    "tiempo"
})
public class FormulaVelocidad {

    protected float distancia;
    protected float tiempo;

    /**
     * Obtiene el valor de la propiedad distancia.
     * 
     */
    public float getDistancia() {
        return distancia;
    }

    /**
     * Define el valor de la propiedad distancia.
     * 
     */
    public void setDistancia(float value) {
        this.distancia = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     */
    public float getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     */
    public void setTiempo(float value) {
        this.tiempo = value;
    }

}
