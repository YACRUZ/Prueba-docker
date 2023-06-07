/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.Practica08.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.Practica08.models.Biblioteca;

/**
 *
 * @author loken
 */
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer>{
    
}
