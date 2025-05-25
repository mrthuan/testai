package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* compiled from: Image.java */
/* loaded from: classes.dex */
public class hpZ {
    private double CJ;
    private String Qhi;
    private String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f9097ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f9098fl;

    public double CJ() {
        return this.CJ;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public String ROR() {
        return this.Tgh;
    }

    public boolean Tgh() {
        return this.f9098fl;
    }

    public int ac() {
        return this.f9097ac;
    }

    public int cJ() {
        return this.cJ;
    }

    public boolean fl() {
        if (!TextUtils.isEmpty(this.Qhi) && this.cJ > 0 && this.f9097ac > 0) {
            return true;
        }
        return false;
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void cJ(int i10) {
        this.f9097ac = i10;
    }

    public void Qhi(int i10) {
        this.cJ = i10;
    }

    public void cJ(String str) {
        this.Tgh = str;
    }

    public void Qhi(boolean z10) {
        this.f9098fl = z10;
    }
}
