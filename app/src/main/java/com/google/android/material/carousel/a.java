package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: KeylineState.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f12249a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f12250b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12251d;

    /* compiled from: KeylineState.java */
    /* renamed from: com.google.android.material.carousel.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0164a {

        /* renamed from: a  reason: collision with root package name */
        public final float f12252a;
        public b c;

        /* renamed from: d  reason: collision with root package name */
        public b f12254d;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f12253b = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public int f12255e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f12256f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f12257g = 0.0f;

        public C0164a(float f10) {
            this.f12252a = f10;
        }

        public final void a(float f10, float f11, float f12, boolean z10) {
            if (f12 <= 0.0f) {
                return;
            }
            b bVar = new b(Float.MIN_VALUE, f10, f11, f12);
            ArrayList arrayList = this.f12253b;
            if (z10) {
                if (this.c == null) {
                    this.c = bVar;
                    this.f12255e = arrayList.size();
                }
                if (this.f12256f != -1 && arrayList.size() - this.f12256f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 == this.c.f12260d) {
                    this.f12254d = bVar;
                    this.f12256f = arrayList.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.c == null && f12 < this.f12257g) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else {
                if (this.f12254d != null && f12 > this.f12257g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f12257g = f12;
            arrayList.add(bVar);
        }

        public final a b() {
            if (this.c != null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f12253b;
                    int size = arrayList2.size();
                    float f10 = this.f12252a;
                    if (i10 < size) {
                        b bVar = (b) arrayList2.get(i10);
                        arrayList.add(new b((i10 * f10) + (this.c.f12259b - (this.f12255e * f10)), bVar.f12259b, bVar.c, bVar.f12260d));
                        i10++;
                    } else {
                        return new a(f10, arrayList, this.f12255e, this.f12256f);
                    }
                }
            } else {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
        }
    }

    /* compiled from: KeylineState.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f12258a;

        /* renamed from: b  reason: collision with root package name */
        public final float f12259b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f12260d;

        public b(float f10, float f11, float f12, float f13) {
            this.f12258a = f10;
            this.f12259b = f11;
            this.c = f12;
            this.f12260d = f13;
        }
    }

    public a(float f10, ArrayList arrayList, int i10, int i11) {
        this.f12249a = f10;
        this.f12250b = Collections.unmodifiableList(arrayList);
        this.c = i10;
        this.f12251d = i11;
    }

    public final b a() {
        return this.f12250b.get(this.c);
    }

    public final b b() {
        return this.f12250b.get(0);
    }

    public final b c() {
        return this.f12250b.get(this.f12251d);
    }

    public final b d() {
        return (b) a0.a.f(this.f12250b, -1);
    }
}
