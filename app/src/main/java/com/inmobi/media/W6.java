package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class W6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14786a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14787b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final X6 f14788d;

    /* renamed from: e  reason: collision with root package name */
    public Object f14789e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14790f;

    /* renamed from: g  reason: collision with root package name */
    public String f14791g;

    /* renamed from: h  reason: collision with root package name */
    public String f14792h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14793i;

    /* renamed from: j  reason: collision with root package name */
    public byte f14794j;

    /* renamed from: k  reason: collision with root package name */
    public byte f14795k;

    /* renamed from: l  reason: collision with root package name */
    public byte f14796l;

    /* renamed from: m  reason: collision with root package name */
    public byte f14797m;

    /* renamed from: n  reason: collision with root package name */
    public int f14798n;

    /* renamed from: o  reason: collision with root package name */
    public int f14799o;

    /* renamed from: p  reason: collision with root package name */
    public String f14800p;

    /* renamed from: q  reason: collision with root package name */
    public String f14801q;

    /* renamed from: r  reason: collision with root package name */
    public W6 f14802r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f14803s;

    /* renamed from: t  reason: collision with root package name */
    public final HashMap f14804t;

    /* renamed from: u  reason: collision with root package name */
    public Object f14805u;

    /* renamed from: v  reason: collision with root package name */
    public int f14806v;

    /* renamed from: w  reason: collision with root package name */
    public W6 f14807w;

    public W6(String assetId, String assetName, String assetType, X6 assetStyle, List trackers) {
        kotlin.jvm.internal.g.e(assetId, "assetId");
        kotlin.jvm.internal.g.e(assetName, "assetName");
        kotlin.jvm.internal.g.e(assetType, "assetType");
        kotlin.jvm.internal.g.e(assetStyle, "assetStyle");
        kotlin.jvm.internal.g.e(trackers, "trackers");
        this.f14786a = assetId;
        this.f14787b = assetName;
        this.c = assetType;
        this.f14788d = assetStyle;
        this.f14791g = "NO_ACTION";
        this.f14792h = "";
        this.f14797m = (byte) 2;
        this.f14798n = -1;
        this.f14800p = "";
        this.f14801q = "";
        ArrayList arrayList = new ArrayList();
        this.f14803s = arrayList;
        this.f14804t = new HashMap();
        arrayList.addAll(trackers);
    }

    public static void a(P7 tracker, HashMap hashMap, F6 f62, A4 a42) {
        kotlin.jvm.internal.g.e(tracker, "tracker");
        Y1.f14860a.a(K8.a(tracker.f14579e, hashMap), tracker.f14578d, true, f62, EnumC1765p9.f15379b, a42);
    }

    public static void d(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
    }

    public final void b(byte b10) {
        this.f14797m = b10;
    }

    public final void c(String str) {
        kotlin.jvm.internal.g.e(str, "<set-?>");
    }

    public final void b(String str) {
        String str2;
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.g.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            str2 = str.subSequence(i10, length + 1).toString();
        } else {
            str2 = null;
        }
        this.f14800p = str2;
    }

    public final void a(byte b10) {
        this.f14794j = b10;
    }

    public final void a(C1570b7 c1570b7) {
        this.f14802r = c1570b7;
    }

    public final void a(String eventType, HashMap hashMap, F6 f62, A4 a42) {
        kotlin.jvm.internal.g.e(eventType, "eventType");
        Iterator it = this.f14803s.iterator();
        while (it.hasNext()) {
            P7 p72 = (P7) it.next();
            if (kotlin.jvm.internal.g.a(eventType, p72.c)) {
                a(p72, hashMap, f62, a42);
            }
        }
    }

    public final void a(String value) {
        kotlin.jvm.internal.g.e(value, "value");
        int length = value.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(value.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        this.f14801q = value.subSequence(i10, length + 1).toString();
    }

    public /* synthetic */ W6(String str, String str2, String str3, X6 x62, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "root" : str2, (i10 & 4) != 0 ? "CONTAINER" : str3, (i10 & 8) != 0 ? new X6() : x62, new LinkedList());
    }
}
