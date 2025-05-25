package com.inmobi.media;

import android.content.ComponentName;
import android.net.Uri;
import u.e;

/* loaded from: classes2.dex */
public final class L2 extends u.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N2 f14417a;

    public L2(N2 n22) {
        this.f14417a = n22;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        kotlin.jvm.internal.g.e(name, "name");
        this.f14417a.f14515a = null;
    }

    @Override // u.g
    public final void onCustomTabsServiceConnected(ComponentName name, u.d client) {
        u.l lVar;
        kotlin.jvm.internal.g.e(name, "name");
        kotlin.jvm.internal.g.e(client, "client");
        N2 n22 = this.f14417a;
        n22.f14515a = client;
        K2 k22 = n22.c;
        if (k22 != null) {
            M1 m12 = (M1) k22;
            Uri parse = Uri.parse(m12.f14448a);
            kotlin.jvm.internal.g.d(parse, "parse(...)");
            N2 n23 = m12.f14451e;
            u.d dVar = n23.f14515a;
            if (dVar != null) {
                lVar = dVar.b(new M2(n23));
            } else {
                lVar = null;
            }
            e.b bVar = new e.b(lVar);
            bVar.f30090a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            J2.a(m12.f14452f, bVar.a(), parse, m12.f14449b, m12.c, m12.f14450d);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.g.e(name, "name");
        this.f14417a.f14515a = null;
    }
}
