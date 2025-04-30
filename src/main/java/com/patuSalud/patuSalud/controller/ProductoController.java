package com.patuSalud.patuSalud.controller;

import com.patuSalud.patuSalud.model.Producto;
import com.patuSalud.patuSalud.service.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

     @Autowired
     private IproductoService productoService;

     @GetMapping("/productos/listar")
     public List<Producto> obtenerTodosProductos(){
         return productoService.obtenerTodosProductos();
     }

     @PostMapping("/productos/agregar")
     public String agregarProducto(@RequestBody Producto nuevoProducto){
         productoService.agregarProducto(nuevoProducto);
         return "Producto agregado exitosamente";
     }

    //Endpoint
    @DeleteMapping("/productos/borrar/{id}")
    public String eliminarProducto(@PathVariable Long id){ //@PathVariable vas a editar en ejecucion la ruta url
        productoService.eliminarProducto(id);
        return "El producto se elimino";
    }

    //Endpoint
    @PutMapping ("/productos/editar")
    public ResponseEntity<String> actualizarProducto(@RequestBody Producto productoActualizado){
        productoService.actualizarProducto(productoActualizado);
        return ResponseEntity.ok("Se actualizo el producto correctamente");
    }

    //Enpoint
    @GetMapping("/productos/buscarId/{id}")
    public Producto buscarProductoId(@PathVariable Long id){
         return productoService.buscarProductoId(id);
    }

    //Enpoint
    @GetMapping("/productos/stockId/{id}")
    public int obtenerStockProducto(@PathVariable Long id){
        return productoService.obtenerStockProducto(id);
    }

    //Enpoint
    @GetMapping("/productos/precioId/{id}")
    public double obtenerPrecioProducto(@PathVariable Long id){
        return productoService.obtenerPrecioProducto(id);
    }
}
