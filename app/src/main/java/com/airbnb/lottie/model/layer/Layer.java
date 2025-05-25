package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask;
import e3.e;
import java.util.List;
import java.util.Locale;
import k3.j;
import k3.k;

/* loaded from: classes.dex */
public final class Layer {

    /* renamed from: a  reason: collision with root package name */
    public final List<l3.b> f6101a;

    /* renamed from: b  reason: collision with root package name */
    public final e f6102b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6103d;

    /* renamed from: e  reason: collision with root package name */
    public final LayerType f6104e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6105f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6106g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Mask> f6107h;

    /* renamed from: i  reason: collision with root package name */
    public final k f6108i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6109j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6110k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6111l;

    /* renamed from: m  reason: collision with root package name */
    public final float f6112m;

    /* renamed from: n  reason: collision with root package name */
    public final float f6113n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6114o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6115p;

    /* renamed from: q  reason: collision with root package name */
    public final k3.a f6116q;

    /* renamed from: r  reason: collision with root package name */
    public final j f6117r;

    /* renamed from: s  reason: collision with root package name */
    public final k3.b f6118s;

    /* renamed from: t  reason: collision with root package name */
    public final List<q3.a<Float>> f6119t;

    /* renamed from: u  reason: collision with root package name */
    public final MatteType f6120u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f6121v;

    /* loaded from: classes.dex */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<l3.b> list, e eVar, String str, long j10, LayerType layerType, long j11, String str2, List<Mask> list2, k kVar, int i10, int i11, int i12, float f10, float f11, int i13, int i14, k3.a aVar, j jVar, List<q3.a<Float>> list3, MatteType matteType, k3.b bVar, boolean z10) {
        this.f6101a = list;
        this.f6102b = eVar;
        this.c = str;
        this.f6103d = j10;
        this.f6104e = layerType;
        this.f6105f = j11;
        this.f6106g = str2;
        this.f6107h = list2;
        this.f6108i = kVar;
        this.f6109j = i10;
        this.f6110k = i11;
        this.f6111l = i12;
        this.f6112m = f10;
        this.f6113n = f11;
        this.f6114o = i13;
        this.f6115p = i14;
        this.f6116q = aVar;
        this.f6117r = jVar;
        this.f6119t = list3;
        this.f6120u = matteType;
        this.f6118s = bVar;
        this.f6121v = z10;
    }

    public final String a(String str) {
        int i10;
        StringBuilder k10 = a0.a.k(str);
        k10.append(this.c);
        k10.append("\n");
        e eVar = this.f6102b;
        Layer layer = (Layer) eVar.f16347h.f(this.f6105f, null);
        if (layer != null) {
            k10.append("\t\tParents: ");
            k10.append(layer.c);
            for (Layer layer2 = (Layer) eVar.f16347h.f(layer.f6105f, null); layer2 != null; layer2 = (Layer) eVar.f16347h.f(layer2.f6105f, null)) {
                k10.append("->");
                k10.append(layer2.c);
            }
            k10.append(str);
            k10.append("\n");
        }
        List<Mask> list = this.f6107h;
        if (!list.isEmpty()) {
            k10.append(str);
            k10.append("\tMasks: ");
            k10.append(list.size());
            k10.append("\n");
        }
        int i11 = this.f6109j;
        if (i11 != 0 && (i10 = this.f6110k) != 0) {
            k10.append(str);
            k10.append("\tBackground: ");
            k10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f6111l)));
        }
        List<l3.b> list2 = this.f6101a;
        if (!list2.isEmpty()) {
            k10.append(str);
            k10.append("\tShapes:\n");
            for (l3.b bVar : list2) {
                k10.append(str);
                k10.append("\t\t");
                k10.append(bVar);
                k10.append("\n");
            }
        }
        return k10.toString();
    }

    public final String toString() {
        return a("");
    }
}
