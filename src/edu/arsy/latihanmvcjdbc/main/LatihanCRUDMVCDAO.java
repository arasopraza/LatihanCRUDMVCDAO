/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.arsy.latihanmvcjdbc.main;

import edu.arsy.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.arsy.latihanmvcjdbc.entity.Pelanggan;
import edu.arsy.latihanmvcjdbc.error.PelangganException;
import edu.arsy.latihanmvcjdbc.service.PelangganDao;
import edu.arsy.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author
 * NIM : 10119001
 * NAMA : ARSY OPRAZA AKMA
 * KELAS : IF1
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
      
    }
    
}
