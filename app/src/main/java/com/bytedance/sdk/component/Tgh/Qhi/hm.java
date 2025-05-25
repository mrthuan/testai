package com.bytedance.sdk.component.Tgh.Qhi;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LogInternalManager.java */
/* loaded from: classes.dex */
public class hm {
    private static hm ABk;
    private static volatile com.bytedance.sdk.component.Tgh.Qhi.fl.Qhi WAv;
    private volatile com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac CJ;
    private volatile com.bytedance.sdk.component.Tgh.Qhi.cJ.ac Gm;
    private volatile Context Qhi;
    private volatile com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh ROR;
    private volatile boolean Sf;
    private volatile com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private volatile com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac f8111ac;
    private volatile com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac cJ;

    /* renamed from: fl  reason: collision with root package name */
    private volatile com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac f8112fl;

    /* renamed from: hm  reason: collision with root package name */
    private volatile Tgh f8113hm;
    private final AtomicBoolean iMK = new AtomicBoolean(false);
    private long pA;

    /* renamed from: zc  reason: collision with root package name */
    private volatile Map<Integer, com.bytedance.sdk.component.Tgh.Qhi.cJ.ac> f8114zc;

    private hm() {
    }

    public static synchronized hm ROR() {
        hm hmVar;
        synchronized (hm.class) {
            if (ABk == null) {
                ABk = new hm();
            }
            hmVar = ABk;
        }
        return hmVar;
    }

    public static com.bytedance.sdk.component.Tgh.Qhi.fl.Qhi fl() {
        if (WAv == null) {
            synchronized (hm.class) {
                if (WAv == null) {
                    WAv = new com.bytedance.sdk.component.Tgh.Qhi.fl.cJ();
                }
            }
        }
        return WAv;
    }

    public com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac ABk() {
        return this.f8111ac;
    }

    public com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh CJ() {
        return this.ROR;
    }

    public void Gm() {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.ac();
    }

    public long HzH() {
        return this.pA * 24 * 60 * 60 * 1000;
    }

    public boolean Qhi() {
        return this.iMK.get();
    }

    public com.bytedance.sdk.component.Tgh.Qhi.cJ.ac Sf() {
        return this.Gm;
    }

    public Context Tgh() {
        return this.Qhi;
    }

    public com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac WAv() {
        return this.Tgh;
    }

    public Map<Integer, com.bytedance.sdk.component.Tgh.Qhi.cJ.ac> ac() {
        return this.f8114zc;
    }

    public boolean cJ() {
        return this.Sf;
    }

    public void hm() {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.cJ();
    }

    public Tgh hpZ() {
        return this.f8113hm;
    }

    public com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac iMK() {
        return this.CJ;
    }

    public com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac pA() {
        return this.f8112fl;
    }

    public com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac zc() {
        return this.cJ;
    }

    public void CJ(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        this.CJ = acVar;
    }

    public void Qhi(boolean z10) {
        this.iMK.set(z10);
    }

    public void ac(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        this.f8111ac = acVar;
    }

    public void cJ(boolean z10) {
        this.Sf = z10;
    }

    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh tgh) {
        this.ROR = tgh;
    }

    public void cJ(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        this.cJ = acVar;
    }

    public void Qhi(Context context) {
        this.Qhi = context;
    }

    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.ac acVar) {
        this.Gm = acVar;
    }

    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        this.Tgh = acVar;
    }

    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh) {
        if (tgh == null) {
            return;
        }
        tgh.Qhi(System.currentTimeMillis());
        com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.Qhi.Qhi(tgh, tgh.CJ());
    }

    public void fl(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar) {
        this.f8112fl = acVar;
    }

    public void Qhi(String str, boolean z10) {
        com.bytedance.sdk.component.Tgh.Qhi.Tgh.Qhi.Qhi().Qhi(str, z10);
    }

    public void Qhi(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.Tgh.Qhi.Tgh.Qhi.Qhi().Qhi(str, list, z10, map, i10, str2);
    }

    public void Qhi(Tgh tgh) {
        this.f8113hm = tgh;
    }

    public void Qhi(long j10) {
        this.pA = j10;
    }
}
