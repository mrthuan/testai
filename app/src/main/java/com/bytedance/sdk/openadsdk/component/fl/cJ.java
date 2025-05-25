package com.bytedance.sdk.openadsdk.component.fl;

import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: TTAppOpenAdCallBackResult.java */
/* loaded from: classes.dex */
public class cJ {
    private int CJ;
    private int Qhi;
    private boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private tP f8773ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f8774fl;

    public cJ(int i10, int i11, tP tPVar) {
        this.Qhi = i10;
        this.cJ = i11;
        this.f8773ac = tPVar;
    }

    public tP CJ() {
        return this.f8773ac;
    }

    public void Qhi(boolean z10) {
        this.Tgh = z10;
    }

    public String Tgh() {
        return this.f8774fl;
    }

    public int ac() {
        return this.cJ;
    }

    public int cJ() {
        return this.Qhi;
    }

    public int fl() {
        return this.CJ;
    }

    public boolean Qhi() {
        return this.Tgh;
    }

    public cJ(int i10, int i11, int i12, String str) {
        this.Qhi = i10;
        this.cJ = i11;
        this.CJ = i12;
        this.f8774fl = str;
    }
}
