/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.porfolioBackEnd.model;

import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */
public class PorfolioDataTypeAutomatic {
  private String imagenDeFondo=;
  private String imagenFoto=;
  private String nombre=;
  private String puestoActual=;
  private String residenciaActual=;
  CompaniaActual CompaniaActualObject=;
  InstitucionEducativa InstitucionEducativaObject=;
  private String acercaDe=;
  ArrayList<Object> antecedentesLaborales = new ArrayList<Object>()=;
  ArrayList<Object> educacion = new ArrayList<Object>()=;
  ArrayList<Object> skills = new ArrayList<Object>()=;
  ArrayList<Object> proyectosRealizados = new ArrayList<Object>()=;
  ArrayList<Object> otrosIntereses = new ArrayList<Object>()=;


 // Getter Methods 

  public String getImagenDeFondo() {
    return imagenDeFondo;
  }

  public String getImagenFoto() {
    return imagenFoto;
  }

  public String getNombre() {
    return nombre;
  }

  public String getPuestoActual() {
    return puestoActual;
  }

  public String getResidenciaActual() {
    return residenciaActual;
  }

  public CompaniaActual getCompaniaActual() {
    return CompaniaActualObject;
  }

  public InstitucionEducativa getInstitucionEducativa() {
    return InstitucionEducativaObject;
  }

  public String getAcercaDe() {
    return acercaDe;
  }

 // Setter Methods 

  public void setImagenDeFondo( String imagenDeFondo ) {
    this.imagenDeFondo = imagenDeFondo;
  }

  public void setImagenFoto( String imagenFoto ) {
    this.imagenFoto = imagenFoto;
  }

  public void setNombre( String nombre ) {
    this.nombre = nombre;
  }

  public void setPuestoActual( String puestoActual ) {
    this.puestoActual = puestoActual;
  }

  public void setResidenciaActual( String residenciaActual ) {
    this.residenciaActual = residenciaActual;
  }

  public void setCompaniaActual( CompaniaActual companiaActualObject ) {
    this.CompaniaActualObject = companiaActualObject;
  }

  public void setInstitucionEducativa( InstitucionEducativa institucionEducativaObject ) {
    this.InstitucionEducativaObject = institucionEducativaObject;
  }

  public void setAcercaDe( String acercaDe ) {
    this.acercaDe = acercaDe;
  }
}
public class InstitucionEducativa {
  private String nombre;
  private String img;
  private String url;


 // Getter Methods 

  public String getNombre() {
    return nombre;
  }

  public String getImg() {
    return img;
  }

  public String getUrl() {
    return url;
  }

 // Setter Methods 

  public void setNombre( String nombre ) {
    this.nombre = nombre;
  }

  public void setImg( String img ) {
    this.img = img;
  }

  public void setUrl( String url ) {
    this.url = url;
  }
}
public class CompaniaActual {
  private String nombre;
  private String img;
  private String url;


 // Getter Methods 

  public String getNombre() {
    return nombre;
  }

  public String getImg() {
    return img;
  }

  public String getUrl() {
    return url;
  }

 // Setter Methods 

  public void setNombre( String nombre ) {
    this.nombre = nombre;
  }

  public void setImg( String img ) {
    this.img = img;
  }

  public void setUrl( String url ) {
    this.url = url;
  }

}
