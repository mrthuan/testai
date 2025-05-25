package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbe {

    /* renamed from: a  reason: collision with root package name */
    public final String f10419a;

    /* renamed from: b  reason: collision with root package name */
    public final double f10420b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f10421d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10422e;

    public zzbe(String str, double d10, double d11, double d12, int i10) {
        this.f10419a = str;
        this.c = d10;
        this.f10420b = d11;
        this.f10421d = d12;
        this.f10422e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        if (!Objects.a(this.f10419a, zzbeVar.f10419a) || this.f10420b != zzbeVar.f10420b || this.c != zzbeVar.c || this.f10422e != zzbeVar.f10422e || Double.compare(this.f10421d, zzbeVar.f10421d) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10419a, Double.valueOf(this.f10420b), Double.valueOf(this.c), Double.valueOf(this.f10421d), Integer.valueOf(this.f10422e)});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f10419a, NamingTable.TAG);
        toStringHelper.a(Double.valueOf(this.c), "minBound");
        toStringHelper.a(Double.valueOf(this.f10420b), "maxBound");
        toStringHelper.a(Double.valueOf(this.f10421d), "percent");
        toStringHelper.a(Integer.valueOf(this.f10422e), "count");
        return toStringHelper.toString();
    }
}
