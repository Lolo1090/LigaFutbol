package com.example.lolo.ligafutbol;

import java.io.Serializable;

/**
 * Created by Lolo on 04/11/2017.
 */

public class Equipo implements Serializable { //mandar objetos

    private String nombre, url;
    private int id,puntos,golesFavor,golesContra,rojas,amarillas,icono,plantilla;

    public Equipo(int id,String nombre, int puntos, int golesFavor, int golesContra, int rojas, int amarillas,int icono,int plantilla,String url) {
        this.id=id;
        this.nombre = nombre;
        this.puntos = puntos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.rojas = rojas;
        this.amarillas = amarillas;
        this.icono=icono;
        this.plantilla=plantilla;
        this.url=url;
    }

    //GETTER----------------------------------------------

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public int getRojas() {
        return rojas;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public int getIcono() {
        return icono;
    }

    public int getPlantilla() {
        return plantilla;
    }

    public String getUrl() {
        return url;
    }

    //SETTER -----------------------------------------------

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public void setPlantilla(int plantilla) {
        this.plantilla = plantilla;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
