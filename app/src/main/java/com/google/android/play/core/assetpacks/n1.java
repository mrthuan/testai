package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class n1 implements q9.l {

    /* renamed from: a  reason: collision with root package name */
    public final q9.m f13327a;

    /* renamed from: b  reason: collision with root package name */
    public final q9.m f13328b;
    public final q9.m c;

    /* renamed from: d  reason: collision with root package name */
    public final q9.m f13329d;

    /* renamed from: e  reason: collision with root package name */
    public final q9.m f13330e;

    /* renamed from: f  reason: collision with root package name */
    public final q9.m f13331f;

    /* renamed from: g  reason: collision with root package name */
    public final q9.m f13332g;

    public n1(q9.l lVar, q9.j jVar, q9.l lVar2, s2 s2Var, q9.l lVar3, q9.l lVar4, q9.l lVar5) {
        this.f13327a = lVar;
        this.f13328b = jVar;
        this.c = lVar2;
        this.f13329d = s2Var;
        this.f13330e = lVar3;
        this.f13331f = lVar4;
        this.f13332g = lVar5;
    }

    @Override // q9.m
    public final Object a() {
        File externalFilesDir;
        String str = (String) this.f13327a.a();
        Object a10 = this.f13328b.a();
        Object a11 = this.c.a();
        Context b10 = ((s2) this.f13329d).b();
        Object a12 = this.f13330e.a();
        q9.k kVar = new q9.k(androidx.activity.s.j(this.f13331f));
        a0 a0Var = (a0) a10;
        y0 y0Var = (y0) a11;
        w1 w1Var = (w1) a12;
        v1 v1Var = (v1) this.f13332g.a();
        if (str != null) {
            externalFilesDir = new File(b10.getExternalFilesDir(null), str);
        } else {
            externalFilesDir = b10.getExternalFilesDir(null);
        }
        return new m1(externalFilesDir, a0Var, y0Var, b10, w1Var, kVar, v1Var);
    }
}
