package co.themafia.hbm;
// Generated 10/03/2013 10:50:03 PM by Hibernate Tools 3.2.1.GA



/**
 * ConfirmacionId generated by hbm2java
 */
public class ConfirmacionId  implements java.io.Serializable {


     private int idConfirmacion;
     private int idPedido;

    public ConfirmacionId() {
    }

    public ConfirmacionId(int idConfirmacion, int idPedido) {
       this.idConfirmacion = idConfirmacion;
       this.idPedido = idPedido;
    }
   
    public int getIdConfirmacion() {
        return this.idConfirmacion;
    }
    
    public void setIdConfirmacion(int idConfirmacion) {
        this.idConfirmacion = idConfirmacion;
    }
    public int getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ConfirmacionId) ) return false;
		 ConfirmacionId castOther = ( ConfirmacionId ) other; 
         
		 return (this.getIdConfirmacion()==castOther.getIdConfirmacion())
 && (this.getIdPedido()==castOther.getIdPedido());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdConfirmacion();
         result = 37 * result + this.getIdPedido();
         return result;
   }   


}

