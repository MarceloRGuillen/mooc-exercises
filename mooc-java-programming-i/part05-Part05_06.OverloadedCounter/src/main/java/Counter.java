/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class Counter {
    private int num;
    
    public Counter(int startValue) {
        this.num = startValue;
    }
    
    public Counter() {
        this.num = 0;
    }
    
    public int value() {
        return this.num;
    }
    
    public void increase() {
        this.num++;
    }
    
    public void increase(int increaseBy) {
        if(increaseBy > 0) {
            this.num += increaseBy;   
        }
    }
    
    public void decrease() {
        this.num--;
    }
    
    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) {
            this.num -= decreaseBy;
        }
    }
    
}
