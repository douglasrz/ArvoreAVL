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
public class ArvoreAVL07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AVL07 novo=new AVL07();
        novo.inserir(8);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(5);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(7);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(4);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(12);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(14);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(10);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(9);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(3);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(6);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(11);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        novo.inserir(13);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        
        System.out.println("REMOVER 3");
        novo.remove(3);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        System.out.println("REMOVER 7");
        novo.remove(7);
        novo.percorrerPreOrdem(novo.raiz);
        System.out.println("******************");
        System.out.println("REMOVER 8");
        novo.remove(8);
        novo.percorrerPreOrdem(novo.raiz);
    }
    
}
