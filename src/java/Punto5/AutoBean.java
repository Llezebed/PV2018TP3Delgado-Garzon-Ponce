/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Florencia
 */
public class AutoBean implements Serializable {
    private Auto unauto;
    private ListaAuto listauto;

    public AutoBean() {
        listauto=new ListaAuto();
    }
    
     public Auto crearAuto(String col,String mar,String mod, String pat, String tg){
         Auto auto =new Auto();
         auto.setColor(col);
         auto.setMarca(mar);
         auto.setPatente(pat);
         auto.setTcomb(tg);
         auto.setModelo(mod);
         return auto;
     }
     public void llenarLista(){
         getListauto().getLista().add(crearAuto("Rojo","Toyota","Corola","ELO821","Normal"));
         getListauto().getLista().add(crearAuto("Negro","Honda","Civic","RIW621","Normal"));
         getListauto().getLista().add(crearAuto("Azul","Ferrari","F12","OMG293","Normal"));
         
     }
     public void verLista(){
         int i=0;
         for (Auto cdAuto: listauto.getLista()){
             System.out.println("Auto N°: "+i+"|Marca: "+cdAuto.getMarca()+"|Modelo:"+cdAuto.getModelo()+"|Color: "+
                     cdAuto.getColor()+"|Patente: "+cdAuto.getPatente()+"|Tipo de Combustible: "+cdAuto.getTcomb());
       i++;}
     }
     public void editarlist (){
         Scanner sc=new Scanner(System.in);
         String col,mar,mod,pat,tc;
         int num;
         System.out.println("Ingrese el numero del auto que desea editar");
         num=sc.nextInt();
         System.out.println("Ingrese Marca");
         mar=sc.next();
         System.out.println("Ingrese Modelo");
         mod=sc.next();
         System.out.println("Ingrese Color");
         col=sc.next();
          System.out.println("Ingrese N° de Patente");
          pat=sc.next();
           System.out.println("Ingrese tipo de combustible");
           tc=sc.next();
           listauto.getLista().remove(num);
           listauto.getLista().add(num, crearAuto(col,mar,mod,pat,tc));
     }
             
    /**
     * @return the unauto
     */
    public Auto getUnauto() {
        return unauto;
    }

    /**
     * @param unauto the unauto to set
     */
    public void setUnauto(Auto unauto) {
        this.unauto = unauto;
    }

    /**
     * @return the listauto
     */
    public ListaAuto getListauto() {
        return listauto;
    }

    /**
     * @param listauto the listauto to set
     */
    public void setListauto(ListaAuto listauto) {
        this.listauto = listauto;
    }


  
}
