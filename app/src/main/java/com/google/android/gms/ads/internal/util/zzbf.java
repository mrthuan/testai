package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbf {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10423a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f10424b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void a(String str, double d10, double d11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10 = 0;
        while (true) {
            arrayList = this.f10423a;
            int size = arrayList.size();
            arrayList2 = this.f10424b;
            arrayList3 = this.c;
            if (i10 >= size) {
                break;
            }
            double doubleValue = ((Double) arrayList3.get(i10)).doubleValue();
            double doubleValue2 = ((Double) arrayList2.get(i10)).doubleValue();
            if (d10 < doubleValue || (doubleValue == d10 && d11 < doubleValue2)) {
                break;
            }
            i10++;
        }
        arrayList.add(i10, str);
        arrayList3.add(i10, Double.valueOf(d10));
        arrayList2.add(i10, Double.valueOf(d11));
    }
}
