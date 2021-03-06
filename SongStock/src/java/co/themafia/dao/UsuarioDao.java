/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.themafia.dao;

import co.themafia.hbm.Usuario;
import co.themafia.hbm.conf.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Alejandro
 */
public class UsuarioDao {
    
    Session session;
    
    public UsuarioDao() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public void agregarUsuario(String nombre,String apellido,String email,String contrasena){
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setEmail(email);
        u.setContrasena(contrasena);
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
    }
    
    public boolean existeEmailUsuario(String email){
        boolean respuesta = false;
        Usuario u = new Usuario();
        session.beginTransaction();
        u = (Usuario) session.createQuery("from Usuario where email = :email").setString("email", email).uniqueResult();
        if(u.equals(null)){
            respuesta = true;
        }
        return respuesta;
    }
    
    public Usuario loguearUsuario(String email, String contrasena) {
        Usuario usuario = null;
        try {
            session.beginTransaction();
            Query query = session.createQuery("FROM Usuario u "
                    + "WHERE u.email = :emailP "
                    + "AND u.contrasena = :contrasenaP");
            query.setParameter("emailP", email);
            query.setParameter("contrasenaP", contrasena);
            usuario = (Usuario) query.uniqueResult();
        } 
        catch (Exception e) {
        }
        return usuario;
    }
}
