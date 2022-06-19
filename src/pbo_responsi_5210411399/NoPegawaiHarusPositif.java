/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_responsi_5210411399;

/**
 *
 * @author acer
 */
public class NoPegawaiHarusPositif extends Exception{
 
    @Override
    public String getMessage() {
        return "Inputan No. Pegawai harus bilangan positif"; 
    }
}
