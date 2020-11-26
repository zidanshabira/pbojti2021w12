/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Zidan
 */
public class Barrier implements Destroyable{
    protected int strength;
    
    public Barrier(int strength){
        this.strength=strength;
    }
    
    public void setStrength(int strength){
        this.strength=strength;
    }
    
    public int getStrength(){
        return strength;
    }

    @Override
    public void destroyed() {
        int destroy=(int)(this.strength*0.200);
    }
    
    public String getBarrierInfo(){
        return "Barrier Strength= "+strength+"\n";
        
    }
}
