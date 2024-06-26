package com.mycompany.gameengine;

public class Configuracion {
    
    private static Configuracion instance = new Configuracion();
    private int height;
    private int width;
    private float minimunRam;
    private float minimunDisk;
    
    private Configuracion(){
        height = 720;
        width = 1280;
        minimunRam = 4.0f;
        minimunDisk = 10.0f;
    }
    
    public static Configuracion getInstance(){
        return instance;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getMinimunRam() {
        return minimunRam;
    }

    public void setMinimunRam(float minimunRam) {
        this.minimunRam = minimunRam;
    }

    public float getMinimunDisk() {
        return minimunDisk;
    }

    public void setMinimunDisk(float minimunDisk) {
        this.minimunDisk = minimunDisk;
    }
}
