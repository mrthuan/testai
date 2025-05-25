package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class m0 extends zabw {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f11019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f11020b;

    public m0(n0 n0Var, AlertDialog alertDialog) {
        this.f11020b = n0Var;
        this.f11019a = alertDialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        this.f11020b.f11023b.m();
        Dialog dialog = this.f11019a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
