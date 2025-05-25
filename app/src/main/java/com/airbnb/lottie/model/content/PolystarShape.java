package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import e3.k;
import g3.c;
import g3.n;
import k3.l;
import l3.b;

/* loaded from: classes.dex */
public final class PolystarShape implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f6061a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f6062b;
    public final k3.b c;

    /* renamed from: d  reason: collision with root package name */
    public final l<PointF, PointF> f6063d;

    /* renamed from: e  reason: collision with root package name */
    public final k3.b f6064e;

    /* renamed from: f  reason: collision with root package name */
    public final k3.b f6065f;

    /* renamed from: g  reason: collision with root package name */
    public final k3.b f6066g;

    /* renamed from: h  reason: collision with root package name */
    public final k3.b f6067h;

    /* renamed from: i  reason: collision with root package name */
    public final k3.b f6068i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6069j;

    /* loaded from: classes.dex */
    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        Type(int i10) {
            this.value = i10;
        }

        public static Type forValue(int i10) {
            Type[] values;
            for (Type type : values()) {
                if (type.value == i10) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, k3.b bVar, l<PointF, PointF> lVar, k3.b bVar2, k3.b bVar3, k3.b bVar4, k3.b bVar5, k3.b bVar6, boolean z10) {
        this.f6061a = str;
        this.f6062b = type;
        this.c = bVar;
        this.f6063d = lVar;
        this.f6064e = bVar2;
        this.f6065f = bVar3;
        this.f6066g = bVar4;
        this.f6067h = bVar5;
        this.f6068i = bVar6;
        this.f6069j = z10;
    }

    @Override // l3.b
    public final c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new n(kVar, aVar, this);
    }
}
