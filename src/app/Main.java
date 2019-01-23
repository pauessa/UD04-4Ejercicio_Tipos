/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import model.AsistenciaMedica;
import model.Coberturas;
import model.Enfermedades;
import model.Nif;
import model.Seguro;
import model.Sexo;
import model.TipoAsistencia;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Pauessa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory = new Configuration().configure().buildSessionFactory(); 

        // CREAMOS UN OBJETO
        Seguro s = new Seguro(new Nif("20454545L"), "Pepe", "Vidal", "Vidal", 30, Sexo.HOMBRE, true, 0, false, new Coberturas(true, false, true), new Enfermedades(true, true, true, true, "junpertorrekinjausen"), Calendar.getInstance().getTime());
        Set<AsistenciaMedica> asm = new HashSet<>();
        AsistenciaMedica am = new AsistenciaMedica(s, "breve descripcion", "Beniganim", "profe de andoid", TipoAsistencia.HOSPITALARIA, Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), BigDecimal.ONE);
        
        asm.add(am);
        
        s.setAsistenciaMedica(asm);

        //CREAR UNA SESION
        Session session = factory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        session.save(am);

        //session.saveOrUpdate(profesor);
        //CERRAR CONEXION
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
    
}
