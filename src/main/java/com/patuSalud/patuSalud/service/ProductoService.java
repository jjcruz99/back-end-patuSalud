package com.patuSalud.patuSalud.service;

import com.patuSalud.patuSalud.model.Producto;
import com.patuSalud.patuSalud.repository.IproductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IproductoService {

     ///inyeccion de dependencia
     @Autowired
    private IproductoRepository productoRepository;

    @Override
    public List<Producto> obtenerTodosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void agregarProducto(Producto nuevoProducto) {
       productoRepository.save(nuevoProducto);
    }

    @Override
    public void eliminarProducto(Long id) {
        if(productoRepository.existsById(id)){
            productoRepository.deleteById(id);
        }
        else {
            System.out.println("No existe productos con ese Id");
        }
    }

    @Override
    public Producto buscarProductoId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void actualizarProducto(Producto datosProducto) {
        Producto productoExiste = productoRepository.findById(datosProducto.getId_producto()).orElse(null);
            if (productoExiste != null){
                productoExiste.setNombreProducto(datosProducto.getNombreProducto());
                productoExiste.setDescripcion(datosProducto.getDescripcion());
                productoExiste.setObservacion(datosProducto.getObservacion());
                productoExiste.setReferencia(datosProducto.getReferencia());
                productoExiste.setCantidad_disponible(datosProducto.getCantidad_disponible());
                productoExiste.setImagen_url(datosProducto.getImagen_url());
                productoExiste.setPrecio_unitario(datosProducto.getPrecio_unitario());
                productoRepository.save(productoExiste);
            }
            else{
                System.out.println("No existe el producto");
            }
    }

    @Override
    public int obtenerStockProducto(Long id) {
        Producto productoExiste = productoRepository.findById(id).orElse(null);
        int stockProducto = 0;
          if (productoExiste != null){
              stockProducto = productoExiste.getCantidad_disponible();
          }
          else {
              System.out.println("No existe el producto");
          }
          return stockProducto;
    }

    @Override
    public double obtenerPrecioProducto(Long id) {
        Producto productoExiste = productoRepository.findById(id).orElse(null);
        int precioProducto = 0;
        if (productoExiste != null){
            precioProducto = productoExiste.getCantidad_disponible();
        }
        else {
            System.out.println("No existe el producto");
        }
        return  precioProducto;
    }
}
