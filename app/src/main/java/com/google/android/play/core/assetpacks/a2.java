package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f13166a;

    /* renamed from: b  reason: collision with root package name */
    public final g1 f13167b;
    public final y0 c;

    /* renamed from: d  reason: collision with root package name */
    public final q9.k f13168d;

    /* renamed from: e  reason: collision with root package name */
    public final q9.k f13169e;

    public a2(d0 d0Var, q9.k kVar, g1 g1Var, q9.k kVar2, y0 y0Var) {
        this.f13166a = d0Var;
        this.f13168d = kVar;
        this.f13167b = g1Var;
        this.f13169e = kVar2;
        this.c = y0Var;
    }

    public final void a(z1 z1Var) {
        long j10 = z1Var.f13459e;
        d0 d0Var = this.f13166a;
        File l10 = d0Var.l(z1Var.c, j10, z1Var.f13249b);
        boolean exists = l10.exists();
        String str = z1Var.f13249b;
        int i10 = z1Var.f13248a;
        if (exists) {
            int i11 = z1Var.f13458d;
            File l11 = d0Var.l(i11, j10, str);
            l11.mkdirs();
            if (l10.renameTo(l11)) {
                ((Executor) this.f13169e.a()).execute(new com.android.billingclient.api.h0(4, this, z1Var));
                g1 g1Var = this.f13167b;
                g1Var.getClass();
                g1Var.c(new z0(g1Var, str, i11, j10));
                this.c.a(str);
                ((t2) this.f13168d.a()).d(i10, str);
                return;
            }
            throw new ck(String.format("Cannot promote pack %s from %s to %s", str, l10.getAbsolutePath(), l11.getAbsolutePath()), i10);
        }
        throw new ck(String.format("Cannot find pack files to promote for pack %s at %s", str, l10.getAbsolutePath()), i10);
    }
}
