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
public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz=new WalkingZombie(100,1);
        JumpingZombie jz=new JumpingZombie(100,2);
        Barrier b=new Barrier(100);
        Plant p=new Plant();
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("-------------------");
        for(int i=0;i<4;i++){ //Destroy the enemies 4 times{ //Destroy the enemies 4 times
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
    }
}
