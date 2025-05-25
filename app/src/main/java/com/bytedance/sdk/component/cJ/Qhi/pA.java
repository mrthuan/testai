package com.bytedance.sdk.component.cJ.Qhi;

/* compiled from: RequestBody.java */
/* loaded from: classes.dex */
public class pA {
    public String CJ;
    public Qhi Tgh;

    /* renamed from: ac  reason: collision with root package name */
    public WAv f8360ac;

    /* renamed from: fl  reason: collision with root package name */
    public byte[] f8361fl;

    /* compiled from: RequestBody.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public pA() {
    }

    public String Qhi() {
        return this.CJ;
    }

    public pA(WAv wAv, String str, Qhi qhi) {
        this.f8360ac = wAv;
        this.CJ = str;
        this.Tgh = qhi;
    }

    public static pA Qhi(WAv wAv, String str) {
        return new pA(wAv, str, Qhi.STRING_TYPE);
    }

    public static pA Qhi(WAv wAv, byte[] bArr) {
        return new pA(wAv, bArr, Qhi.BYTE_ARRAY_TYPE);
    }

    public pA(WAv wAv, byte[] bArr, Qhi qhi) {
        this.f8360ac = wAv;
        this.f8361fl = bArr;
        this.Tgh = qhi;
    }
}
