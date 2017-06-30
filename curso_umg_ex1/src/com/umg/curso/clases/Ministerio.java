package com.umg.curso.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ore on 28/06/17.
 */
public class Ministerio {

    private Deporte[] listado;
    private List<Deportista> dep;
    private Especialista especialista;
    private int cantReal;

    public Ministerio(int cantDeportes) {
        listado = new Deporte[10];
        cantReal = 0;
        dep = new ArrayList<>();

    }

    public List<Deportista> getDep() {
        return dep;
    }

    public void setDep(List<Deportista> dep) {
        this.dep = dep;
    }

    public Deporte[] getListado() {
        return listado;
    }

    public void setListado(Deporte[] listado) {
        this.listado = listado;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public int getCantReal() {
        return cantReal;
    }

    public void setCantReal(int cantReal) {
        this.cantReal = cantReal;
    }


    public  void listaDeportista(Deportista d){

        if(d.getEdad() >= 60) {
           dep.add(0,d);
        } else{
            dep.add(d);
        }

    }

    public float promedioEdad(){
        int suma =0;
        for (Deportista d:dep
             ) {
            suma+=d.getEdad();
        }
        return suma/dep.size();
    }

    public void adicionarDeporte(Deporte d) throws Exception {

        if (cantReal < listado.length) {

            if (d.isConBalon()) {
                for (int i = cantReal; i > 0; i--) {
                    listado[i] = listado[i - 1];
                }
                listado[0] = d;
            } else
                listado[cantReal] = d;
            cantReal++;

        } else
            throw new Exception("Imposible adicionar más Deportes");


    }
}
