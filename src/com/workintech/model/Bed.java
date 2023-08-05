package com.workintech.model;

import javax.swing.plaf.PanelUI;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quits;

    public Bed(String style, int pillows, int height, int sheets, int quits) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quits = quits;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuits() {
        return quits;
    }

    public void make(){
        System.out.println("The bed is being made. ");
    }
}
