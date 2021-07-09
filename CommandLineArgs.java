/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandlineargs;

/**
 *
 * @author felix
 */
public class CommandLineArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j = 0; 
        for(int i = 1; i <=10; i++){
                j=i*i;
            System.out.println(j);
    }
    }
}
