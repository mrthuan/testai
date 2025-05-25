package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6209a;

    /* renamed from: b  reason: collision with root package name */
    public final k f6210b;
    public final x c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f6211d = new c0(this, true);

    /* renamed from: e  reason: collision with root package name */
    public final c0 f6212e = new c0(this, false);

    /* renamed from: f  reason: collision with root package name */
    public boolean f6213f;

    public d0(Context context, k kVar, x xVar) {
        this.f6209a = context;
        this.f6210b = kVar;
        this.c = xVar;
    }

    public final void a(boolean z10) {
        int i10;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f6213f = z10;
        this.f6212e.a(this.f6209a, intentFilter2);
        if (this.f6213f) {
            c0 c0Var = this.f6211d;
            Context context = this.f6209a;
            synchronized (c0Var) {
                if (!c0Var.f6207a) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (true != c0Var.f6208b) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i10);
                    } else {
                        context.registerReceiver(c0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                    }
                    c0Var.f6207a = true;
                }
            }
            return;
        }
        this.f6211d.a(this.f6209a, intentFilter);
    }
}
