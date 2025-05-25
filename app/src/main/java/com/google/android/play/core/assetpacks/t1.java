package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f13385a;

    /* renamed from: b  reason: collision with root package name */
    public final g1 f13386b;
    public final y0 c;

    /* renamed from: d  reason: collision with root package name */
    public final v1 f13387d;

    /* renamed from: e  reason: collision with root package name */
    public final q9.k f13388e;

    /* renamed from: f  reason: collision with root package name */
    public final q9.k f13389f;

    public t1(d0 d0Var, q9.k kVar, g1 g1Var, q9.k kVar2, y0 y0Var, v1 v1Var) {
        this.f13385a = d0Var;
        this.f13388e = kVar;
        this.f13386b = g1Var;
        this.f13389f = kVar2;
        this.c = y0Var;
        this.f13387d = v1Var;
    }

    public final void a(s1 s1Var) {
        int i10 = s1Var.c;
        long j10 = s1Var.f13381d;
        d0 d0Var = this.f13385a;
        d0Var.getClass();
        String str = s1Var.f13249b;
        File file = new File(d0Var.d(i10, j10, str), "_packs");
        File file2 = new File(new File(d0Var.d(i10, j10, str), "_slices"), "_metadata");
        boolean exists = file.exists();
        String str2 = s1Var.f13249b;
        int i11 = s1Var.f13248a;
        if (exists && file2.exists()) {
            File l10 = d0Var.l(i10, j10, str2);
            l10.mkdirs();
            if (file.renameTo(l10)) {
                new File(d0Var.l(i10, j10, str2), "merge.tmp").delete();
                File file3 = new File(d0Var.l(i10, j10, str2), "_metadata");
                file3.mkdirs();
                if (file2.renameTo(file3)) {
                    try {
                        this.f13387d.b(s1Var.c, s1Var.f13249b, s1Var.f13382e, s1Var.f13381d);
                        ((Executor) this.f13389f.a()).execute(new com.android.billingclient.api.i0(6, this, s1Var));
                        g1 g1Var = this.f13386b;
                        g1Var.getClass();
                        g1Var.c(new z0(g1Var, str2, i10, j10));
                        this.c.a(str2);
                        ((t2) this.f13388e.a()).d(i11, str2);
                        return;
                    } catch (IOException e10) {
                        throw new ck(String.format("Could not write asset pack version tag for pack %s: %s", str2, e10.getMessage()), i11);
                    }
                }
                throw new ck("Cannot move metadata files to final location.", i11);
            }
            throw new ck("Cannot move merged pack files to final location.", i11);
        }
        throw new ck(String.format("Cannot find pack files to move for pack %s.", str2), i11);
    }
}
