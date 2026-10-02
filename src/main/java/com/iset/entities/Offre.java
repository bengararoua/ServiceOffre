package com.iset.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Offre {
@Id @GeneratedValue 
long code; 
String intitulé; 
String specialité; 
String société; 
int nbpostes; 
String pays;

public Offre() {}

 public Offre(String intitulé, String specialité, String société, int nbpostes, String pays) {
    this.intitulé = intitulé;
    this.specialité = specialité;
    this.société = société;
    this.nbpostes = nbpostes;
    this.pays = pays;
}
public long getCode(){
    return this.code;
}
public String getIntitulé(){
    return this.intitulé;
}
public String getSpecialité(){
    return this.specialité;
}
public String getSociété(){
    return this.société;
}
public int getNBPostes(){
    return this.nbpostes;
}
public String getPays(){
    return this.pays;
}

public void setCode(long code){
    this.code=code;
}
public void setIntitulé(String intitulé ){
    this.intitulé=intitulé;
}
public void setSpecialité(String specialité){
    this.specialité=specialité;
}
public void setSociété(String société){
    this.société=société;
}
public void setNBPostes(int nbpostes){
    this.nbpostes=nbpostes;
}
public void getPays(String pays){
    this.pays=pays;
}
}
