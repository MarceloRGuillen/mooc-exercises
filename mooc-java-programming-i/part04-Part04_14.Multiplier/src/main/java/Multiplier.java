/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int number) {
        this.number = number;
    }
    
    public int multiply(int number) {
        this.number = this.number * number;
        return this.number;
    }
}
