/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.programaclase06cc;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Itzel Rios
 */
public class ProgramaClase06CC {

    public static void main(String[] args) {
        DAOVenta dao= new DAOVenta();
        Venta venta= new Venta();
        
        DetalleVenta d1= new DetalleVenta();
        DetalleVenta d2= new DetalleVenta();
        
        Date fecha= Date.from(Instant.now());
        venta.setFecha(new java.sql.Date(fecha.getTime()));
        venta.setMonto(100.00);
        
        d1.setDescripcion("Prod 1");
        d1.setCantidad(1.0);
        d1.setPrecio(10.0);
        d1.setSubtotal(10.0);
        d1.setVenta(venta);
        venta.getDetalle().add(d1);
        
        d2.setDescripcion("Prod 2");
        d2.setCantidad(3.0);
        d2.setPrecio(5.0);
        d2.setSubtotal(15.0);
        d2.setVenta(venta);
        venta.getDetalle().add(d2);
        
        dao.create(venta);
    }
}
