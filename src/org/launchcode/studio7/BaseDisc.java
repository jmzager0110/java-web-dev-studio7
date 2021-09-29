package org.launchcode.studio7;

public abstract class BaseDisc {

    private String title;
    private String author;
    private Double storageCap;
    private String diskType;

    public BaseDisc(String title, String author, Double storageCap, String diskType) {
        this.title = title;
        this.author = author;
        this.storageCap = storageCap;
        this.diskType = diskType;
    }

    public void readData() {
        System.out.println("Currently reading " + this.title + "disc...");
    }

    public void storeData() {
        System.out.println("Something random according to Rafa... Saving to disk" + this.author);
    }

    public boolean writeData(double dataSize) {
        if(dataSize > storageCap) {
            return false;
        }
        return true;
    }

    public void reportInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Disk Type: " + this.diskType);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getStorageCap() {
        return storageCap;
    }

    public void setStorageCap(Double storageCap) {
        storageCap = storageCap;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
