package com.tom_roush.fontbox.afm;

/* loaded from: classes2.dex */
public class KernPair {
    private String firstKernCharacter;
    private String secondKernCharacter;

    /* renamed from: x  reason: collision with root package name */
    private float f15978x;

    /* renamed from: y  reason: collision with root package name */
    private float f15979y;

    public String getFirstKernCharacter() {
        return this.firstKernCharacter;
    }

    public String getSecondKernCharacter() {
        return this.secondKernCharacter;
    }

    public float getX() {
        return this.f15978x;
    }

    public float getY() {
        return this.f15979y;
    }

    public void setFirstKernCharacter(String str) {
        this.firstKernCharacter = str;
    }

    public void setSecondKernCharacter(String str) {
        this.secondKernCharacter = str;
    }

    public void setX(float f10) {
        this.f15978x = f10;
    }

    public void setY(float f10) {
        this.f15979y = f10;
    }
}
