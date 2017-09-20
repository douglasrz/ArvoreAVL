/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreavl07;

/**
 *
 * @author Douglas
 */
public class No {
    public int chave;
    public int bal;
    public No esq;
    public No dir;

    public No(int chave) {
        this.chave = chave;
        this.bal=0;
        this.dir=null;
        this.esq=null;
    }

    public No() {
    }
    
    
}
