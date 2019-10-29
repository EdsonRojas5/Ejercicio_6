package logica;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import control.CtrlOperacion;

/**
 *
 * @author Richard
 */
@Named(value = "ctrlMate")
@ManagedBean
public class CtrlMate {
    public Double numero1;
    public Double numero2;
    public String resultado;
    CtrlOperacion operacion;
    
    public CtrlMate() {
        operacion = new CtrlOperacion();
    }
    
    public void accionSumar(){
        resultado = operacion.suma(getNumero1(), getNumero2())+"";
    }
    
    public void accionRestar(){
        setResultado ( operacion.resta (getNumero1(), getNumero2())+"");
    }
   
    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public CtrlOperacion getOperaciones() {
        return operacion;
    }

    public void setOperaciones(CtrlOperacion operacion) {
        this.operacion = operacion;
    }
    
}