package com.bytedance.sdk.openadsdk.core;

/* compiled from: SingleAppData.java */
/* loaded from: classes.dex */
public class Dww {
    private static Dww Qhi;
    private com.bytedance.sdk.openadsdk.apiImpl.CJ.ac CJ;
    private com.bytedance.sdk.openadsdk.apiImpl.ac.cJ Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.tP f8904ac;
    private com.bytedance.sdk.openadsdk.core.model.Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ f8905fl;

    private Dww() {
    }

    public static Dww Qhi() {
        if (Qhi == null) {
            Qhi = new Dww();
        }
        return Qhi;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ CJ() {
        return this.f8905fl;
    }

    public com.bytedance.sdk.openadsdk.core.model.Qhi ROR() {
        return this.cJ;
    }

    public void Tgh() {
        this.f8904ac = null;
        this.cJ = null;
        this.CJ = null;
        this.f8905fl = null;
        this.Tgh = null;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.CJ.ac ac() {
        return this.CJ;
    }

    public com.bytedance.sdk.openadsdk.core.model.tP cJ() {
        return this.f8904ac;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.ac.cJ fl() {
        return this.Tgh;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        this.f8904ac = tPVar;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar) {
        this.f8905fl = cJVar;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar) {
        this.CJ = acVar;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.apiImpl.ac.cJ cJVar) {
        this.Tgh = cJVar;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
        this.cJ = qhi;
    }
}
