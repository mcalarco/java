/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoproyecto;

/**
 *
 * @author Alumno
 */
public class rectangulo extends Figura  {
   private float base;
   private float altura;
   
   public rectangulo(float base, float altura){
       this.base=base;
       this.altura=altura;
   }
   public float getarea(){
       return base*altura;
   }
   
   public float getperimetro(){
       return 2*base+2*altura;
   }
}
