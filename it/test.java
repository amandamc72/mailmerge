/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it;
import it.It;
/**
 *
 * @author christian
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        It temp = new It();
        temp.setUp();
        temp.getMails();
        temp.tearDown();
    }
    
}
