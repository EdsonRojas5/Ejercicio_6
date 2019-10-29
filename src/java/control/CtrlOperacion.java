package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author edson
 */
@Named(value = "ctrlOperacion")
@RequestScoped
public class CtrlOperacion {

    public double suma(double num1,double num2){
        double sum=num1+num2;
        return sum;
    }
    
    public double resta(double num1,double num2){
        double rest=num1-num2;
        return rest;
    }
    
    public double multiplicacion(double num1,double num2){
        double mult=num1*num2;
        return mult;
    }
    
}