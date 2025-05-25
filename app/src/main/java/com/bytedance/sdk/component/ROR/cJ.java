package com.bytedance.sdk.component.ROR;

import com.bytedance.sdk.component.cJ.Qhi.Gm;
import java.io.File;
import java.util.Map;

/* compiled from: NetResponse.java */
/* loaded from: classes.dex */
public class cJ {
    final String CJ;
    final int Qhi;
    Gm ROR;
    final long Tgh;

    /* renamed from: ac  reason: collision with root package name */
    final Map<String, String> f8018ac;
    final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    final long f8019fl;

    /* renamed from: hm  reason: collision with root package name */
    private final boolean f8020hm;
    private File Sf = null;
    private byte[] WAv = null;

    public cJ(boolean z10, int i10, String str, Map<String, String> map, String str2, long j10, long j11) {
        this.f8020hm = z10;
        this.Qhi = i10;
        this.cJ = str;
        this.f8018ac = map;
        this.CJ = str2;
        this.f8019fl = j10;
        this.Tgh = j11;
    }

    public String CJ() {
        return this.CJ;
    }

    public int Qhi() {
        return this.Qhi;
    }

    public long ROR() {
        return this.f8019fl - this.Tgh;
    }

    public Gm Sf() {
        return this.ROR;
    }

    public boolean Tgh() {
        return this.f8020hm;
    }

    public Map<String, String> ac() {
        return this.f8018ac;
    }

    public String cJ() {
        return this.cJ;
    }

    public File fl() {
        return this.Sf;
    }

    public void Qhi(File file) {
        this.Sf = file;
    }

    public void Qhi(byte[] bArr) {
        this.WAv = bArr;
    }

    public void Qhi(Gm gm2) {
        this.ROR = gm2;
    }
}
