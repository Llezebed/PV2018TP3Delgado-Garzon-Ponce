/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.aplication.controlador;

import Punto4.aplicaton.modelo.ListaRectangulo;
import Punto4.aplicaton.modelo.Rectangulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Amperio
 */
@ManagedBean
@ViewScoped
public class RectanguloFromBean implements Serializable {
    private Rectangulo unRectangulo;
    private ListaRectangulo listaRectangulo;
    private double a;
    private double b;
    
    /**
     * Creates a new instance of RectanguloFormBean
     */
    public RectanguloFromBean() {
        listaRectangulo=new ListaRectangulo();
    }
   
    
    public Rectangulo crearRectangulos (double a,double b){
        /*Es una funcion,se crea rectangulo del tipo Rectangulo, literalmente un nuevo rectangulo para la lista,
        se le añaden los valores correspondientes a cada uno de sus atributos
        y retorna un rectangulo con todos sus datos ya cargados
        */
        Rectangulo rectangulo =new Rectangulo();
        rectangulo.setA(a);
        rectangulo.setB(b);
        rectangulo.setPre(2*rectangulo.getA()+2*rectangulo.getB());
        rectangulo.setSup(rectangulo.getA()*rectangulo.getB());
        return rectangulo;
    }
    public void llenarLista(){
        //Llena el Listado con los datos que le damos
        getListaRectangulo().getListado().add(crearRectangulos(2,3));
         getListaRectangulo().getListado().add(crearRectangulos(4,6));
          getListaRectangulo().getListado().add(crearRectangulos(1,2));
          
          
    }
    public void verLista (){
        int i=0;
        for (Rectangulo cadaRectangulo : listaRectangulo.getListado()){
            System.out.println("Rectangulo N°"+i+" -Base: "+cadaRectangulo.getA()+" - Altura: "+cadaRectangulo.getB()+
                    "-Perimetro: "+cadaRectangulo.getPre()+"-Superficie: "+cadaRectangulo.getSup()) ;
            /*Se crea cadaRectangulo del tipo rectangulo, este tendra el valor de uno de los 
            rectangulos de ListaRectangulo.getListado, uno de los rectangulos, y escribira cada uno de sus datos, y luego
            como es un for, ira avanzndo hasta que listado haya sido completamente recorrido.
            */
            i++;}
            //este i funcion como contador para visualizar cual rectangulo se quiere borrar de la lista
    }
    public void eliminarRetangulo(int num){
        //Elimina el rectangulo de listado segun del inidice que se le indique
        listaRectangulo.getListado().remove(num);
        
    }
    public Rectangulo getUnRectangulo() {
        return unRectangulo;
    }

    /**
     * @param unRectangulo the unRectangulo to set
     */
    public void setUnRectangulo(Rectangulo unRectangulo) {
        this.unRectangulo = unRectangulo;
    }
    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the listaRectangulo
     */
    public ListaRectangulo getListaRectangulo() {
        return listaRectangulo;
    }

    /**
     * @param listaRectangulo the listaRectangulo to set
     */
    public void setListaRectangulo(ListaRectangulo listaRectangulo) {
        this.listaRectangulo = listaRectangulo;
    }
    
}
