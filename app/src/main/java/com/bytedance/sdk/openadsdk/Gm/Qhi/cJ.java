package com.bytedance.sdk.openadsdk.Gm.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;

/* compiled from: BrowserLogModel.java */
/* loaded from: classes.dex */
public class cJ {
    private int CJ;
    private String Qhi;
    private int ROR;
    private String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private String f8485ac;
    private tP cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8486fl;
    private int Sf = 0;

    /* renamed from: hm  reason: collision with root package name */
    private int f8487hm = 0;

    public int CJ() {
        return this.CJ;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public int ROR() {
        return this.ROR;
    }

    public int Sf() {
        return this.Sf;
    }

    public String Tgh() {
        return this.Tgh;
    }

    public String ac() {
        tP tPVar;
        if (TextUtils.isEmpty(this.f8485ac) && (tPVar = this.cJ) != null) {
            this.f8485ac = js.Qhi(tPVar);
        }
        return this.f8485ac;
    }

    public tP cJ() {
        return this.cJ;
    }

    public boolean fl() {
        return this.f8486fl;
    }

    public int hm() {
        return this.f8487hm;
    }

    public void CJ(int i10) {
        this.f8487hm = i10;
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void cJ(String str) {
        this.f8485ac = str;
    }

    public void Qhi(tP tPVar) {
        this.cJ = tPVar;
    }

    public void cJ(int i10) {
        this.ROR = i10;
    }

    public void Qhi(int i10) {
        this.CJ = i10;
    }

    public void Qhi(boolean z10) {
        this.f8486fl = z10;
    }

    public void ac(String str) {
        this.Tgh = str;
    }

    public void ac(int i10) {
        this.Sf = i10;
    }
}
