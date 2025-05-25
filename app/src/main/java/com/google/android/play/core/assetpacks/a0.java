package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class a0 extends q9.x {

    /* renamed from: g  reason: collision with root package name */
    public final g1 f13156g;

    /* renamed from: h  reason: collision with root package name */
    public final v0 f13157h;

    /* renamed from: i  reason: collision with root package name */
    public final p0 f13158i;

    /* renamed from: j  reason: collision with root package name */
    public final y0 f13159j;

    /* renamed from: k  reason: collision with root package name */
    public final v1 f13160k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f13161l;

    /* renamed from: m  reason: collision with root package name */
    public final q9.k f13162m;

    /* renamed from: n  reason: collision with root package name */
    public final q9.k f13163n;

    /* renamed from: o  reason: collision with root package name */
    public final q9.k f13164o;

    public a0(Context context, g1 g1Var, v0 v0Var, q9.k kVar, y0 y0Var, p0 p0Var, q9.k kVar2, q9.k kVar3, v1 v1Var) {
        super(new q9.y("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f13161l = new Handler(Looper.getMainLooper());
        this.f13156g = g1Var;
        this.f13157h = v0Var;
        this.f13162m = kVar;
        this.f13159j = y0Var;
        this.f13158i = p0Var;
        this.f13163n = kVar2;
        this.f13164o = kVar3;
        this.f13160k = v1Var;
    }

    @Override // q9.x
    public final void b(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        q9.y yVar = this.f29133a;
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList != null && stringArrayList.size() == 1) {
                i0 c = AssetPackState.c(bundleExtra, stringArrayList.get(0), this.f13159j, this.f13160k, new b1());
                yVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", c);
                PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
                if (pendingIntent != null) {
                    this.f13158i.f13349a = pendingIntent;
                }
                ((Executor) this.f13164o.a()).execute(new a8.a0(this, bundleExtra, c));
                ((Executor) this.f13163n.a()).execute(new com.android.billingclient.api.i0(5, this, bundleExtra));
                return;
            }
            yVar.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        yVar.b("Empty bundle received from broadcast.", new Object[0]);
    }

    public final void e(Bundle bundle) {
        h1 h1Var;
        g1 g1Var = this.f13156g;
        g1Var.getClass();
        if (((Boolean) g1Var.c(new wk.g(g1Var, bundle))).booleanValue()) {
            v0 v0Var = this.f13157h;
            q9.k kVar = v0Var.f13411j;
            q9.y yVar = v0.f13402k;
            yVar.a("Run extractor loop", new Object[0]);
            AtomicBoolean atomicBoolean = v0Var.f13410i;
            if (!atomicBoolean.compareAndSet(false, true)) {
                yVar.e("runLoop already looping; return", new Object[0]);
                return;
            }
            while (true) {
                try {
                    h1Var = v0Var.f13409h.a();
                } catch (ck e10) {
                    yVar.b("Error while getting next extraction task: %s", e10.getMessage());
                    if (e10.f13204a >= 0) {
                        ((t2) kVar.a()).b(e10.f13204a);
                        v0Var.a(e10, e10.f13204a);
                    }
                    h1Var = null;
                }
                if (h1Var != null) {
                    try {
                        if (h1Var instanceof r0) {
                            v0Var.f13404b.a((r0) h1Var);
                        } else if (h1Var instanceof g2) {
                            v0Var.c.a((g2) h1Var);
                        } else if (h1Var instanceof q1) {
                            v0Var.f13405d.a((q1) h1Var);
                        } else if (h1Var instanceof s1) {
                            v0Var.f13406e.a((s1) h1Var);
                        } else if (h1Var instanceof x1) {
                            v0Var.f13407f.a((x1) h1Var);
                        } else if (h1Var instanceof z1) {
                            v0Var.f13408g.a((z1) h1Var);
                        } else {
                            yVar.b("Unknown task type: %s", h1Var.getClass().getName());
                        }
                    } catch (Exception e11) {
                        yVar.b("Error during extraction task: %s", e11.getMessage());
                        ((t2) kVar.a()).b(h1Var.f13248a);
                        v0Var.a(e11, h1Var.f13248a);
                    }
                } else {
                    atomicBoolean.set(false);
                    return;
                }
            }
        }
    }
}
