package com.company.builder;

import com.company.hierarchy.MachineGun;
import com.company.hierarchy.Pistol;
import com.company.hierarchy.Rifle;

public class Platoon {
    protected String  name;
    protected Pistol pistol = null;
    protected MachineGun machineGun = null;
    protected Rifle rifle = null;

    public void showInfo(){
        System.out.println(name);
        if(pistol != null)pistol.printDescription();
        if(machineGun != null)machineGun.printDescription();
        if(rifle!= null)rifle.printDescription();
    }
    public static class Builder {
        private  Platoon newPlatoon;
        public  Builder(){
            newPlatoon = new Platoon();
        }
        public Builder withName(String newName){
            newPlatoon.name = newName;
            return this;
        }
        public Builder withPistol(Pistol newPistol){
            newPlatoon.pistol = newPistol;
            return this;
        }
        public Builder withMachineGun(MachineGun newMachineGun){
            newPlatoon.machineGun = newMachineGun;
            return this;
        }
        public Builder withRifle(Rifle newRifle){
            newPlatoon.rifle = newRifle;
            return this;
        }
        public Platoon build(){
            return newPlatoon;
        }
    }
}
