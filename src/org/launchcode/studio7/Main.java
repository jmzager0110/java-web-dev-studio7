package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        DVD aDVD= new DVD("Blade Runner", "Harrison Ford", "video");
        CD myCD = new CD("Spice Girls", "Spice Girls", "music");

        aDVD.pause();
        aDVD.spinDisk();
        aDVD.readData();
        aDVD.storeData();
        System.out.println(aDVD.writeData(45.00));
        aDVD.reportInfo();

        System.out.println("Next media item loading...");

        myCD.pause();
        myCD.spinDisk();
        myCD.readData();
        myCD.storeData();
        System.out.println(myCD.writeData(9000.00));
        myCD.reportInfo();

    }
}
