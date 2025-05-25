package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f10238a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f10239b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10240d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final int f10241e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final int f10242f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final zzq[] f10243g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10244h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10245i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public boolean f10246j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10247k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10248l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    public final boolean f10249m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    public final boolean f10250n;
    @SafeParcelable.Field

    /* renamed from: o  reason: collision with root package name */
    public final boolean f10251o;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq d() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq f() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 2, this.f10238a);
        SafeParcelWriter.f(parcel, 3, this.f10239b);
        SafeParcelWriter.f(parcel, 4, this.c);
        SafeParcelWriter.a(parcel, 5, this.f10240d);
        SafeParcelWriter.f(parcel, 6, this.f10241e);
        SafeParcelWriter.f(parcel, 7, this.f10242f);
        SafeParcelWriter.m(parcel, 8, this.f10243g, i10);
        SafeParcelWriter.a(parcel, 9, this.f10244h);
        SafeParcelWriter.a(parcel, 10, this.f10245i);
        SafeParcelWriter.a(parcel, 11, this.f10246j);
        SafeParcelWriter.a(parcel, 12, this.f10247k);
        SafeParcelWriter.a(parcel, 13, this.f10248l);
        SafeParcelWriter.a(parcel, 14, this.f10249m);
        SafeParcelWriter.a(parcel, 15, this.f10250n);
        SafeParcelWriter.a(parcel, 16, this.f10251o);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzq(android.content.Context r17, com.google.android.gms.ads.AdSize[] r18) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzq.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i12, @SafeParcelable.Param int i13, @SafeParcelable.Param zzq[] zzqVarArr, @SafeParcelable.Param boolean z11, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13, @SafeParcelable.Param boolean z14, @SafeParcelable.Param boolean z15, @SafeParcelable.Param boolean z16, @SafeParcelable.Param boolean z17, @SafeParcelable.Param boolean z18) {
        this.f10238a = str;
        this.f10239b = i10;
        this.c = i11;
        this.f10240d = z10;
        this.f10241e = i12;
        this.f10242f = i13;
        this.f10243g = zzqVarArr;
        this.f10244h = z11;
        this.f10245i = z12;
        this.f10246j = z13;
        this.f10247k = z14;
        this.f10248l = z15;
        this.f10249m = z16;
        this.f10250n = z17;
        this.f10251o = z18;
    }
}
