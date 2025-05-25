package com.bytedance.sdk.component.fl.cJ;

import com.bytedance.sdk.component.fl.ROR;
import com.bytedance.sdk.component.fl.Sf;
import java.util.Map;

/* compiled from: HttpResponse.java */
/* loaded from: classes.dex */
public class fl<T> implements ROR {
    private String CJ;
    Map<String, String> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private T f8420ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Sf f8421fl;

    public fl(int i10, T t4, String str) {
        this.cJ = i10;
        this.f8420ac = t4;
        this.CJ = str;
    }

    @Override // com.bytedance.sdk.component.fl.ROR
    public String CJ() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.component.fl.ROR
    public Sf Qhi() {
        return this.f8421fl;
    }

    @Override // com.bytedance.sdk.component.fl.ROR
    public T ac() {
        return this.f8420ac;
    }

    @Override // com.bytedance.sdk.component.fl.ROR
    public int cJ() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.fl.ROR
    public Map<String, String> fl() {
        return this.Qhi;
    }

    public void Qhi(Sf sf2) {
        this.f8421fl = sf2;
    }

    public fl(int i10, T t4, String str, Map<String, String> map) {
        this(i10, t4, str);
        this.Qhi = map;
    }
}
