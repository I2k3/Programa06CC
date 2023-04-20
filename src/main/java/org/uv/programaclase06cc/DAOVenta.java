/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programaclase06cc;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author fermin
 */
public class DAOVenta implements IDAOGeneral<Venta, Integer>{

    @Override
    public Venta create(Venta p) {
        Session session= HibernateUtil.getSession();
        Transaction t= session.beginTransaction();
        
        session.save(p);
        for (Iterator<DetalleVenta> iterator = p.getDetalle().iterator(); iterator.hasNext();) {
            DetalleVenta det = iterator.next();
            session.save(det);
        }
        
        t.commit();
        session.close();
        return p;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Venta update(Integer id, Venta p) {
        return null;
    }

    @Override
    public List<Venta> findAll() {
        return null;
    }

    @Override
    public Venta findById(Integer id) {
        return null;
    }
    
}
