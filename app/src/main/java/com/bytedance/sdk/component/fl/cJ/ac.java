package com.bytedance.sdk.component.fl.cJ;

import com.bytedance.sdk.component.fl.pA;

/* compiled from: HttpRequest.java */
/* loaded from: classes.dex */
public class ac implements com.bytedance.sdk.component.fl.Tgh {
    private pA CJ;
    private String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8419ac;
    private boolean cJ;

    public ac(String str, boolean z10, boolean z11, pA pAVar) {
        this.Qhi = str;
        this.cJ = z10;
        this.f8419ac = z11;
        this.CJ = pAVar;
    }

    @Override // com.bytedance.sdk.component.fl.Tgh
    public String Qhi() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.fl.Tgh
    public boolean ac() {
        return this.f8419ac;
    }

    @Override // com.bytedance.sdk.component.fl.Tgh
    public boolean cJ() {
        return this.cJ;
    }
}
