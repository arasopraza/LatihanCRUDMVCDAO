/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.arsy.latihanmvcjdbc.service;

import edu.arsy.latihanmvcjdbc.entity.Pelanggan;
import edu.arsy.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author
 * NIM : 10119001
 * NAMA : ARSY OPRAZA AKMA
 * KELAS : IF1
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
