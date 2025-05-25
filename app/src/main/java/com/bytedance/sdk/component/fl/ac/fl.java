package com.bytedance.sdk.component.fl.ac;

import com.bytedance.sdk.component.fl.zc;
import java.util.Map;

/* compiled from: ImageResponse.java */
/* loaded from: classes.dex */
public class fl<T> implements zc {
    private T CJ;
    private int Gm;
    private String Qhi;
    private Map<String, String> ROR;
    private boolean Sf;
    private int Tgh;
    private com.bytedance.sdk.component.fl.Sf WAv;

    /* renamed from: ac  reason: collision with root package name */
    private T f8415ac;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8416fl;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8417hm;

    @Override // com.bytedance.sdk.component.fl.zc
    public Map<String, String> CJ() {
        return this.ROR;
    }

    public fl Qhi(ac acVar, T t4) {
        this.f8415ac = t4;
        this.Qhi = acVar.fl();
        this.cJ = acVar.Qhi();
        this.f8416fl = acVar.cJ();
        this.Tgh = acVar.ac();
        this.f8417hm = acVar.pA();
        this.WAv = acVar.hpZ();
        this.Gm = acVar.HzH();
        return this;
    }

    @Override // com.bytedance.sdk.component.fl.zc
    public int ROR() {
        return this.Gm;
    }

    @Override // com.bytedance.sdk.component.fl.zc
    public boolean Tgh() {
        return this.f8417hm;
    }

    @Override // com.bytedance.sdk.component.fl.zc
    public T ac() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.component.fl.zc
    public T cJ() {
        return this.f8415ac;
    }

    @Override // com.bytedance.sdk.component.fl.zc
    public boolean fl() {
        return this.Sf;
    }

    public fl Qhi(ac acVar, T t4, Map<String, String> map, boolean z10) {
        this.ROR = map;
        this.Sf = z10;
        return Qhi(acVar, t4);
    }

    @Override // com.bytedance.sdk.component.fl.zc
    public String Qhi() {
        return this.cJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.fl.zc
    public void Qhi(Object obj) {
        this.CJ = this.f8415ac;
        this.f8415ac = obj;
    }
}
