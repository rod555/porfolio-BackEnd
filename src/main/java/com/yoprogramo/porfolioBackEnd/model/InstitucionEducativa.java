/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yoprogramo.porfolioBackEnd.model;

/**
 *
 * @author rodrigo
 */
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

