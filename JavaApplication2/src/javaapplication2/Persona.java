/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
/**
 *
 * @author Marcelo
 */
public class Persona {
    private String nom;
    private String ape;
    private int eda;
    private char sex;
    public int dni;
private boolean verificaredad( int eda){
        return eda>0;
} 
 /*     "Subproceso para ver si vota"*/
public boolean vota(){
        return this.eda>16;
}
public Persona(String nom,String ape,int eda,char sex,int dni){
    this.nom=nom;
    this.ape=ape;
    if (this.verificaredad(eda))
         this.eda=eda;
    else
         this.eda=0;
    this.sex=sex;
    this.dni=dni;   
}
    @Override
    public String toString(){
        return "Boca Campeón";
    
}
        
}
