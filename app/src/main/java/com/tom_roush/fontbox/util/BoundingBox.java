package com.tom_roush.fontbox.util;

import java.util.List;

/* loaded from: classes2.dex */
public class BoundingBox {
    private float lowerLeftX;
    private float lowerLeftY;
    private float upperRightX;
    private float upperRightY;

    public BoundingBox() {
    }

    public boolean contains(float f10, float f11) {
        if (f10 >= this.lowerLeftX && f10 <= this.upperRightX && f11 >= this.lowerLeftY && f11 <= this.upperRightY) {
            return true;
        }
        return false;
    }

    public float getHeight() {
        return getUpperRightY() - getLowerLeftY();
    }

    public float getLowerLeftX() {
        return this.lowerLeftX;
    }

    public float getLowerLeftY() {
        return this.lowerLeftY;
    }

    public float getUpperRightX() {
        return this.upperRightX;
    }

    public float getUpperRightY() {
        return this.upperRightY;
    }

    public float getWidth() {
        return getUpperRightX() - getLowerLeftX();
    }

    public void setLowerLeftX(float f10) {
        this.lowerLeftX = f10;
    }

    public void setLowerLeftY(float f10) {
        this.lowerLeftY = f10;
    }

    public void setUpperRightX(float f10) {
        this.upperRightX = f10;
    }

    public void setUpperRightY(float f10) {
        this.upperRightY = f10;
    }

    public String toString() {
        return "[" + getLowerLeftX() + "," + getLowerLeftY() + "," + getUpperRightX() + "," + getUpperRightY() + "]";
    }

    public BoundingBox(float f10, float f11, float f12, float f13) {
        this.lowerLeftX = f10;
        this.lowerLeftY = f11;
        this.upperRightX = f12;
        this.upperRightY = f13;
    }

    public BoundingBox(List<Number> list) {
        this.lowerLeftX = list.get(0).floatValue();
        this.lowerLeftY = list.get(1).floatValue();
        this.upperRightX = list.get(2).floatValue();
        this.upperRightY = list.get(3).floatValue();
    }
}
