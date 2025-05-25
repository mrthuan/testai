package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.b;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes2.dex */
public interface c extends b.a {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class a implements TypeEvaluator<d> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f12371b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final d f12372a = new d();

        @Override // android.animation.TypeEvaluator
        public final d evaluate(float f10, d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float f11 = dVar3.f12375a;
            float f12 = 1.0f - f10;
            float f13 = (dVar4.f12375a * f10) + (f11 * f12);
            float f14 = dVar3.f12376b;
            float f15 = dVar4.f12376b * f10;
            float f16 = dVar3.c;
            float f17 = f10 * dVar4.c;
            d dVar5 = this.f12372a;
            dVar5.f12375a = f13;
            dVar5.f12376b = f15 + (f14 * f12);
            dVar5.c = f17 + (f12 * f16);
            return dVar5;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class b extends Property<c, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12373a = new b();

        public b() {
            super(d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final d get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(c cVar, d dVar) {
            cVar.setRevealInfo(dVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: com.google.android.material.circularreveal.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0166c extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0166c f12374a = new C0166c();

        public C0166c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(d dVar);

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public float f12375a;

        /* renamed from: b  reason: collision with root package name */
        public float f12376b;
        public float c;

        public d() {
        }

        public d(float f10, float f11, float f12) {
            this.f12375a = f10;
            this.f12376b = f11;
            this.c = f12;
        }

        public d(d dVar) {
            this(dVar.f12375a, dVar.f12376b, dVar.c);
        }
    }
}
