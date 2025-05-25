package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: UGenLoadTemplateListenerImpl.java */
/* loaded from: classes.dex */
public class hpZ implements com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh {
    private long Qhi = 0;
    private long cJ = 0;

    /* renamed from: ac  reason: collision with root package name */
    private int f9148ac = 0;
    private String CJ = null;

    /* renamed from: fl  reason: collision with root package name */
    private String f9149fl = null;
    private final AtomicBoolean Tgh = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
    public void Qhi() {
        this.Qhi = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
    public void Qhi(int i10, String str, String str2) {
        this.f9148ac = i10;
        this.CJ = str;
        this.f9149fl = str2;
        this.cJ = SystemClock.elapsedRealtime();
        this.Tgh.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
    public void Qhi(String str) {
        this.f9149fl = str;
        this.cJ = SystemClock.elapsedRealtime();
        this.Tgh.set(true);
    }

    public void Qhi(tP tPVar, String str) {
        if (this.Tgh.get()) {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, false, str, "success", this.cJ - this.Qhi, this.f9149fl, "ad", 0, null);
        } else {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, false, str, "fail", this.cJ - this.Qhi, this.f9149fl, "ad", this.f9148ac, this.CJ);
        }
    }
}
