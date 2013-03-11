package co.themafia.hbm;
// Generated 10/03/2013 10:50:03 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Recopilacion generated by hbm2java
 */
public class Recopilacion  implements java.io.Serializable {


     private int idRecopilacion;
     private Usuario usuario;
     private String nombreRecopilacion;
     private Boolean publico;
     private Set<Cancion> cancions = new HashSet<Cancion>(0);

    public Recopilacion() {
    }

	
    public Recopilacion(int idRecopilacion, Usuario usuario) {
        this.idRecopilacion = idRecopilacion;
        this.usuario = usuario;
    }
    public Recopilacion(int idRecopilacion, Usuario usuario, String nombreRecopilacion, Boolean publico, Set<Cancion> cancions) {
       this.idRecopilacion = idRecopilacion;
       this.usuario = usuario;
       this.nombreRecopilacion = nombreRecopilacion;
       this.publico = publico;
       this.cancions = cancions;
    }
   
    public int getIdRecopilacion() {
        return this.idRecopilacion;
    }
    
    public void setIdRecopilacion(int idRecopilacion) {
        this.idRecopilacion = idRecopilacion;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getNombreRecopilacion() {
        return this.nombreRecopilacion;
    }
    
    public void setNombreRecopilacion(String nombreRecopilacion) {
        this.nombreRecopilacion = nombreRecopilacion;
    }
    public Boolean getPublico() {
        return this.publico;
    }
    
    public void setPublico(Boolean publico) {
        this.publico = publico;
    }
    public Set<Cancion> getCancions() {
        return this.cancions;
    }
    
    public void setCancions(Set<Cancion> cancions) {
        this.cancions = cancions;
    }




}

