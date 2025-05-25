package com.tom_roush.fontbox.afm;

import com.tom_roush.fontbox.util.BoundingBox;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CharMetric {
    private BoundingBox boundingBox;
    private int characterCode;
    private List<Ligature> ligatures = new ArrayList();
    private String name;
    private float[] vv;

    /* renamed from: w  reason: collision with root package name */
    private float[] f15975w;

    /* renamed from: w0  reason: collision with root package name */
    private float[] f15976w0;
    private float w0x;
    private float w0y;

    /* renamed from: w1  reason: collision with root package name */
    private float[] f15977w1;
    private float w1x;
    private float w1y;
    private float wx;
    private float wy;

    public void addLigature(Ligature ligature) {
        this.ligatures.add(ligature);
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public int getCharacterCode() {
        return this.characterCode;
    }

    public List<Ligature> getLigatures() {
        return this.ligatures;
    }

    public String getName() {
        return this.name;
    }

    public float[] getVv() {
        return this.vv;
    }

    public float[] getW() {
        return this.f15975w;
    }

    public float[] getW0() {
        return this.f15976w0;
    }

    public float getW0x() {
        return this.w0x;
    }

    public float getW0y() {
        return this.w0y;
    }

    public float[] getW1() {
        return this.f15977w1;
    }

    public float getW1x() {
        return this.w1x;
    }

    public float getW1y() {
        return this.w1y;
    }

    public float getWx() {
        return this.wx;
    }

    public float getWy() {
        return this.wy;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setCharacterCode(int i10) {
        this.characterCode = i10;
    }

    public void setLigatures(List<Ligature> list) {
        this.ligatures = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setVv(float[] fArr) {
        this.vv = fArr;
    }

    public void setW(float[] fArr) {
        this.f15975w = fArr;
    }

    public void setW0(float[] fArr) {
        this.f15976w0 = fArr;
    }

    public void setW0x(float f10) {
        this.w0x = f10;
    }

    public void setW0y(float f10) {
        this.w0y = f10;
    }

    public void setW1(float[] fArr) {
        this.f15977w1 = fArr;
    }

    public void setW1x(float f10) {
        this.w1x = f10;
    }

    public void setW1y(float f10) {
        this.w1y = f10;
    }

    public void setWx(float f10) {
        this.wx = f10;
    }

    public void setWy(float f10) {
        this.wy = f10;
    }
}
