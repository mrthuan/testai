package com.bytedance.sdk.openadsdk.ABk;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.iMK;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonitorModelGeneratorWrapper.java */
/* loaded from: classes.dex */
public class Tgh implements fl {
    private int CJ;
    long Qhi = System.currentTimeMillis();

    /* renamed from: ac  reason: collision with root package name */
    private int f8446ac;
    private fl cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8447fl;

    public Tgh(fl flVar, int i10, int i11, int i12) {
        this.cJ = flVar;
        this.f8446ac = i10;
        this.CJ = i11;
        this.f8447fl = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.ABk.fl
    public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
        com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel = this.cJ.generatorModel();
        generatorModel.Qhi(BuildConfig.VERSION_NAME);
        generatorModel.Qhi(this.f8446ac);
        generatorModel.cJ(this.CJ);
        generatorModel.ac(this.f8447fl);
        generatorModel.cJ(this.Qhi);
        generatorModel.Tgh(hm.cJ().fl());
        generatorModel.CJ(iMK.CJ());
        return generatorModel;
    }
}
