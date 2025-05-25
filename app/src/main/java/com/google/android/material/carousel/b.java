package com.google.android.material.carousel;

import android.view.animation.LinearInterpolator;
import androidx.activity.r;
import androidx.appcompat.view.menu.d;
import com.google.android.material.carousel.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: KeylineStateList.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f12261a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f12262b;
    public final List<a> c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f12263d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f12264e;

    /* renamed from: f  reason: collision with root package name */
    public final float f12265f;

    /* renamed from: g  reason: collision with root package name */
    public final float f12266g;

    public b(a aVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f12261a = aVar;
        this.f12262b = Collections.unmodifiableList(arrayList);
        this.c = Collections.unmodifiableList(arrayList2);
        float f10 = ((a) d.b(arrayList, 1)).b().f12258a - aVar.b().f12258a;
        this.f12265f = f10;
        float f11 = aVar.d().f12258a - ((a) d.b(arrayList2, 1)).d().f12258a;
        this.f12266g = f11;
        this.f12263d = a(f10, arrayList, true);
        this.f12264e = a(f11, arrayList2, false);
    }

    public static float[] a(float f10, ArrayList arrayList, boolean z10) {
        float f11;
        float f12;
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i10 = 1; i10 < size; i10++) {
            int i11 = i10 - 1;
            a aVar = (a) arrayList.get(i11);
            a aVar2 = (a) arrayList.get(i10);
            if (z10) {
                f11 = aVar2.b().f12258a - aVar.b().f12258a;
            } else {
                f11 = aVar.d().f12258a - aVar2.d().f12258a;
            }
            float f13 = f11 / f10;
            if (i10 == size - 1) {
                f12 = 1.0f;
            } else {
                f12 = fArr[i11] + f13;
            }
            fArr[i10] = f12;
        }
        return fArr;
    }

    public static a b(List<a> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                float a10 = f8.b.a(0.0f, 1.0f, f11, f12, f10);
                a aVar = list.get(i10 - 1);
                a aVar2 = list.get(i10);
                if (aVar.f12249a == aVar2.f12249a) {
                    List<a.b> list2 = aVar.f12250b;
                    int size2 = list2.size();
                    List<a.b> list3 = aVar2.f12250b;
                    if (size2 == list3.size()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < list2.size(); i11++) {
                            a.b bVar = list2.get(i11);
                            a.b bVar2 = list3.get(i11);
                            float f13 = bVar.f12258a;
                            float f14 = bVar2.f12258a;
                            LinearInterpolator linearInterpolator = f8.b.f17141a;
                            float l10 = r.l(f14, f13, a10, f13);
                            float f15 = bVar2.f12259b;
                            float f16 = bVar.f12259b;
                            float l11 = r.l(f15, f16, a10, f16);
                            float f17 = bVar2.c;
                            float f18 = bVar.c;
                            float l12 = r.l(f17, f18, a10, f18);
                            float f19 = bVar2.f12260d;
                            float f20 = bVar.f12260d;
                            arrayList.add(new a.b(l10, l11, l12, r.l(f19, f20, a10, f20)));
                        }
                        return new a(aVar.f12249a, arrayList, f8.b.b(a10, aVar.c, aVar2.c), f8.b.b(a10, aVar.f12251d, aVar2.f12251d));
                    }
                    throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
                }
                throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
            }
            i10++;
            f11 = f12;
        }
        return list.get(0);
    }

    public static a c(a aVar, int i10, int i11, float f10, int i12, int i13) {
        boolean z10;
        ArrayList arrayList = new ArrayList(aVar.f12250b);
        arrayList.add(i11, (a.b) arrayList.remove(i10));
        a.C0164a c0164a = new a.C0164a(aVar.f12249a);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            a.b bVar = (a.b) arrayList.get(i14);
            float f11 = bVar.f12260d;
            float f12 = (f11 / 2.0f) + f10;
            if (i14 >= i12 && i14 <= i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            c0164a.a(f12, bVar.c, f11, z10);
            f10 += bVar.f12260d;
        }
        return c0164a.b();
    }
}
