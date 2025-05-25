package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zak extends zap {
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.f11150b = true;
        if (this.c.get() != null) {
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        this.f11150b = false;
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void k(ConnectionResult connectionResult, int i10) {
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void l() {
        throw null;
    }

    public final k0 o(int i10) {
        throw null;
    }
}
