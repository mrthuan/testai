package com.bytedance.sdk.component.Tgh.Qhi.Tgh;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: TrackInfo.java */
/* loaded from: classes.dex */
public class fl {
    private boolean Gm;
    private final String Qhi;
    private String ROR;
    private String Sf;
    private final String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final boolean f8080ac;
    private final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final int f8081fl;
    private int CJ = -1;

    /* renamed from: hm  reason: collision with root package name */
    private int f8082hm = 0;
    private String WAv = null;

    public fl(String str, String str2, boolean z10, int i10, String str3) {
        this.Qhi = str;
        this.cJ = str2;
        this.f8080ac = z10;
        this.f8081fl = i10;
        this.Tgh = str3;
    }

    public int CJ() {
        return this.CJ;
    }

    public boolean Gm() {
        if (this.CJ == -1) {
            return true;
        }
        return false;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public String ROR() {
        return this.ROR;
    }

    public int Sf() {
        return this.f8082hm;
    }

    public String Tgh() {
        return this.Tgh;
    }

    public boolean WAv() {
        return this.Gm;
    }

    public boolean ac() {
        return this.f8080ac;
    }

    public String cJ() {
        return this.cJ;
    }

    public int fl() {
        return this.f8081fl;
    }

    public String hm() {
        return this.Sf;
    }

    public void Qhi(int i10) {
        this.CJ = i10;
    }

    public void ac(String str) {
        this.WAv = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.Sf)) {
            this.Sf = String.valueOf(this.WAv);
            return;
        }
        this.Sf += "," + this.WAv;
    }

    public void cJ(int i10) {
        this.f8082hm = i10;
        if (i10 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.ROR)) {
            this.ROR = String.valueOf(this.f8082hm);
            return;
        }
        this.ROR += "," + this.f8082hm;
    }

    public void Qhi(String str) {
        this.ROR = str;
    }

    public void Qhi(boolean z10) {
        this.Gm = z10;
    }

    public Runnable Qhi(String str, Map<String, String> map) {
        return Qhi.Qhi().Qhi(this, str, map);
    }

    public void cJ(String str) {
        this.Sf = str;
    }
}
