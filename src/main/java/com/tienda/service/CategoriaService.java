package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //se obtiene un listado de categoria en un list
    public List<Categoria> getCategorias(boolean activos);

    public Categoria getCategoria(Categoria cayegoria);

    public void save(Categoria categoria);

    public void delete(Categoria categoria);

}
