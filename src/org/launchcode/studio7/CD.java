package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String title, String author, Double storageCap, String diskType) {
        super(title, author, storageCap, diskType);
    }

    public CD(String title, String author, String diskType){
        this(title, author, 700.00, diskType);
    }

    @Override
    public void spinDisk() {
        System.out.println("The CD is spinning...");

    }

    @Override
    public void pause() {
        System.out.println("The CD is paused...");

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
