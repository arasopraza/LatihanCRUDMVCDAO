/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.arsy.latihanmvcjdbc.event;

import edu.arsy.latihanmvcjdbc.entity.Pelanggan;
import edu.arsy.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM : 10119001
 * NAMA : ARSY OPRAZA AKMA
 * KELAS : IF1
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
    
}
