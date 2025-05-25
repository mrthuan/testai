package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbh {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f10425a;

    /* renamed from: b  reason: collision with root package name */
    public final double[] f10426b;
    public final double[] c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f10427d;

    /* renamed from: e  reason: collision with root package name */
    public int f10428e;

    public zzbh(zzbf zzbfVar) {
        ArrayList arrayList = zzbfVar.f10424b;
        int size = arrayList.size();
        this.f10425a = (String[]) zzbfVar.f10423a.toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        this.f10426b = dArr;
        ArrayList arrayList2 = zzbfVar.c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i11 = 0; i11 < size3; i11++) {
            dArr2[i11] = ((Double) arrayList2.get(i11)).doubleValue();
        }
        this.c = dArr2;
        this.f10427d = new int[size];
        this.f10428e = 0;
    }
}
