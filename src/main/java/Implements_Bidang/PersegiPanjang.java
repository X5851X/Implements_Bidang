/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements_Bidang;

/**
 *
 * @author R
 */
public class PersegiPanjang implements Bidang2D{
    private int panjang;
    private int lebar;
    
    @Override
    public int setPanjang(int p) {
      this.panjang = p;
      return panjang;
    }

    @Override
    public int setLebar(int l) {
      this.lebar = l;
      return lebar;
    }

    @Override
    public int getLuas() {
        int luas = this.panjang*this.lebar;
        return luas;
    }
    
}
