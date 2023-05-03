/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.programa02;

/**
 *
 * @author btoarriola
 */
public class Programa02 {

    public static void main(String[] args) {
        
        //esto no se puede pq solo se puede instancair ṕor el metodo getinstance Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();
        singleton.imprimir();
    }
}
