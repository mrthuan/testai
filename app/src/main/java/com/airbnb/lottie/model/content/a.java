package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.content.ShapeStroke;
import e3.k;
import g3.i;
import java.util.ArrayList;
import java.util.List;
import k3.c;
import k3.d;
import k3.f;
import l3.b;

/* compiled from: GradientStroke.java */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f6089a;

    /* renamed from: b  reason: collision with root package name */
    public final GradientType f6090b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public final d f6091d;

    /* renamed from: e  reason: collision with root package name */
    public final f f6092e;

    /* renamed from: f  reason: collision with root package name */
    public final f f6093f;

    /* renamed from: g  reason: collision with root package name */
    public final k3.b f6094g;

    /* renamed from: h  reason: collision with root package name */
    public final ShapeStroke.LineCapType f6095h;

    /* renamed from: i  reason: collision with root package name */
    public final ShapeStroke.LineJoinType f6096i;

    /* renamed from: j  reason: collision with root package name */
    public final float f6097j;

    /* renamed from: k  reason: collision with root package name */
    public final List<k3.b> f6098k;

    /* renamed from: l  reason: collision with root package name */
    public final k3.b f6099l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6100m;

    public a(String str, GradientType gradientType, c cVar, d dVar, f fVar, f fVar2, k3.b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f10, ArrayList arrayList, k3.b bVar2, boolean z10) {
        this.f6089a = str;
        this.f6090b = gradientType;
        this.c = cVar;
        this.f6091d = dVar;
        this.f6092e = fVar;
        this.f6093f = fVar2;
        this.f6094g = bVar;
        this.f6095h = lineCapType;
        this.f6096i = lineJoinType;
        this.f6097j = f10;
        this.f6098k = arrayList;
        this.f6099l = bVar2;
        this.f6100m = z10;
    }

    @Override // l3.b
    public final g3.c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new i(kVar, aVar, this);
    }
}
