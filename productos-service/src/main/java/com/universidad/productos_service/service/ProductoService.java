package com.example.productos_service.service;

import com.example.productos_service.domain.Producto;

public interface ProductoService {

    Producto crear(String nombre, Double precio, Integer stock);

    Producto buscarPorId(Long id);

    Producto actualizarStock(Long id, Integer stock);

    void eliminar(Long id);
}