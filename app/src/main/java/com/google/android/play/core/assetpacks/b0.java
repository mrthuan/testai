package com.google.android.play.core.assetpacks;

import android.content.Context;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class b0 implements q9.l {

    /* renamed from: a  reason: collision with root package name */
    public final q9.m f13170a;

    /* renamed from: b  reason: collision with root package name */
    public final q9.m f13171b;
    public final q9.m c;

    /* renamed from: d  reason: collision with root package name */
    public final q9.m f13172d;

    /* renamed from: e  reason: collision with root package name */
    public final q9.m f13173e;

    /* renamed from: f  reason: collision with root package name */
    public final q9.m f13174f;

    /* renamed from: g  reason: collision with root package name */
    public final q9.m f13175g;

    /* renamed from: h  reason: collision with root package name */
    public final q9.m f13176h;

    /* renamed from: i  reason: collision with root package name */
    public final q9.m f13177i;

    public b0(s2 s2Var, q9.l lVar, q9.l lVar2, q9.j jVar, q9.l lVar3, q9.l lVar4, q9.l lVar5, q9.l lVar6, q9.l lVar7) {
        this.f13170a = s2Var;
        this.f13171b = lVar;
        this.c = lVar2;
        this.f13172d = jVar;
        this.f13173e = lVar3;
        this.f13174f = lVar4;
        this.f13175g = lVar5;
        this.f13176h = lVar6;
        this.f13177i = lVar7;
    }

    @Override // q9.m
    public final Object a() {
        Context b10 = ((s2) this.f13170a).b();
        Object a10 = this.f13171b.a();
        Object a11 = this.c.a();
        q9.k kVar = new q9.k(androidx.activity.s.j(this.f13172d));
        Object a12 = this.f13173e.a();
        return new a0(b10, (g1) a10, (v0) a11, kVar, (y0) a12, (p0) this.f13174f.a(), new q9.k(androidx.activity.s.j(this.f13175g)), new q9.k(androidx.activity.s.j(this.f13176h)), (v1) this.f13177i.a());
    }
}
