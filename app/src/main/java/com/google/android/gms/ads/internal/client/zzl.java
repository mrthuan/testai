package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzn();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f10200a;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final long f10201b;
    @SafeParcelable.Field
    public final Bundle c;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final int f10202d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final List f10203e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10204f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final int f10205g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10206h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final String f10207i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final zzfh f10208j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final Location f10209k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    public final String f10210l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f10211m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    public final Bundle f10212n;
    @SafeParcelable.Field

    /* renamed from: o  reason: collision with root package name */
    public final List f10213o;
    @SafeParcelable.Field

    /* renamed from: p  reason: collision with root package name */
    public final String f10214p;
    @SafeParcelable.Field

    /* renamed from: q  reason: collision with root package name */
    public final String f10215q;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: r  reason: collision with root package name */
    public final boolean f10216r;
    @SafeParcelable.Field

    /* renamed from: s  reason: collision with root package name */
    public final zzc f10217s;
    @SafeParcelable.Field

    /* renamed from: t  reason: collision with root package name */
    public final int f10218t;
    @SafeParcelable.Field

    /* renamed from: u  reason: collision with root package name */
    public final String f10219u;
    @SafeParcelable.Field

    /* renamed from: v  reason: collision with root package name */
    public final List f10220v;
    @SafeParcelable.Field

    /* renamed from: w  reason: collision with root package name */
    public final int f10221w;
    @SafeParcelable.Field

    /* renamed from: x  reason: collision with root package name */
    public final String f10222x;
    @SafeParcelable.Field

    /* renamed from: y  reason: collision with root package name */
    public final int f10223y;
    @SafeParcelable.Field

    /* renamed from: z  reason: collision with root package name */
    public final long f10224z;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param int i10, @SafeParcelable.Param long j10, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param int i11, @SafeParcelable.Param List list, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i12, @SafeParcelable.Param boolean z11, @SafeParcelable.Param String str, @SafeParcelable.Param zzfh zzfhVar, @SafeParcelable.Param Location location, @SafeParcelable.Param String str2, @SafeParcelable.Param Bundle bundle2, @SafeParcelable.Param Bundle bundle3, @SafeParcelable.Param List list2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z12, @SafeParcelable.Param zzc zzcVar, @SafeParcelable.Param int i13, @SafeParcelable.Param String str5, @SafeParcelable.Param List list3, @SafeParcelable.Param int i14, @SafeParcelable.Param String str6, @SafeParcelable.Param int i15, @SafeParcelable.Param long j11) {
        this.f10200a = i10;
        this.f10201b = j10;
        this.c = bundle == null ? new Bundle() : bundle;
        this.f10202d = i11;
        this.f10203e = list;
        this.f10204f = z10;
        this.f10205g = i12;
        this.f10206h = z11;
        this.f10207i = str;
        this.f10208j = zzfhVar;
        this.f10209k = location;
        this.f10210l = str2;
        this.f10211m = bundle2 == null ? new Bundle() : bundle2;
        this.f10212n = bundle3;
        this.f10213o = list2;
        this.f10214p = str3;
        this.f10215q = str4;
        this.f10216r = z12;
        this.f10217s = zzcVar;
        this.f10218t = i13;
        this.f10219u = str5;
        this.f10220v = list3 == null ? new ArrayList() : list3;
        this.f10221w = i14;
        this.f10222x = str6;
        this.f10223y = i15;
        this.f10224z = j11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        if (this.f10200a != zzlVar.f10200a || this.f10201b != zzlVar.f10201b || !com.google.android.gms.ads.internal.util.client.zzn.a(this.c, zzlVar.c) || this.f10202d != zzlVar.f10202d || !Objects.a(this.f10203e, zzlVar.f10203e) || this.f10204f != zzlVar.f10204f || this.f10205g != zzlVar.f10205g || this.f10206h != zzlVar.f10206h || !Objects.a(this.f10207i, zzlVar.f10207i) || !Objects.a(this.f10208j, zzlVar.f10208j) || !Objects.a(this.f10209k, zzlVar.f10209k) || !Objects.a(this.f10210l, zzlVar.f10210l) || !com.google.android.gms.ads.internal.util.client.zzn.a(this.f10211m, zzlVar.f10211m) || !com.google.android.gms.ads.internal.util.client.zzn.a(this.f10212n, zzlVar.f10212n) || !Objects.a(this.f10213o, zzlVar.f10213o) || !Objects.a(this.f10214p, zzlVar.f10214p) || !Objects.a(this.f10215q, zzlVar.f10215q) || this.f10216r != zzlVar.f10216r || this.f10218t != zzlVar.f10218t || !Objects.a(this.f10219u, zzlVar.f10219u) || !Objects.a(this.f10220v, zzlVar.f10220v) || this.f10221w != zzlVar.f10221w || !Objects.a(this.f10222x, zzlVar.f10222x) || this.f10223y != zzlVar.f10223y || this.f10224z != zzlVar.f10224z) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10200a), Long.valueOf(this.f10201b), this.c, Integer.valueOf(this.f10202d), this.f10203e, Boolean.valueOf(this.f10204f), Integer.valueOf(this.f10205g), Boolean.valueOf(this.f10206h), this.f10207i, this.f10208j, this.f10209k, this.f10210l, this.f10211m, this.f10212n, this.f10213o, this.f10214p, this.f10215q, Boolean.valueOf(this.f10216r), Integer.valueOf(this.f10218t), this.f10219u, this.f10220v, Integer.valueOf(this.f10221w), this.f10222x, Integer.valueOf(this.f10223y), Long.valueOf(this.f10224z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10200a);
        SafeParcelWriter.g(parcel, 2, this.f10201b);
        SafeParcelWriter.b(parcel, 3, this.c);
        SafeParcelWriter.f(parcel, 4, this.f10202d);
        SafeParcelWriter.l(parcel, 5, this.f10203e);
        SafeParcelWriter.a(parcel, 6, this.f10204f);
        SafeParcelWriter.f(parcel, 7, this.f10205g);
        SafeParcelWriter.a(parcel, 8, this.f10206h);
        SafeParcelWriter.j(parcel, 9, this.f10207i);
        SafeParcelWriter.i(parcel, 10, this.f10208j, i10);
        SafeParcelWriter.i(parcel, 11, this.f10209k, i10);
        SafeParcelWriter.j(parcel, 12, this.f10210l);
        SafeParcelWriter.b(parcel, 13, this.f10211m);
        SafeParcelWriter.b(parcel, 14, this.f10212n);
        SafeParcelWriter.l(parcel, 15, this.f10213o);
        SafeParcelWriter.j(parcel, 16, this.f10214p);
        SafeParcelWriter.j(parcel, 17, this.f10215q);
        SafeParcelWriter.a(parcel, 18, this.f10216r);
        SafeParcelWriter.i(parcel, 19, this.f10217s, i10);
        SafeParcelWriter.f(parcel, 20, this.f10218t);
        SafeParcelWriter.j(parcel, 21, this.f10219u);
        SafeParcelWriter.l(parcel, 22, this.f10220v);
        SafeParcelWriter.f(parcel, 23, this.f10221w);
        SafeParcelWriter.j(parcel, 24, this.f10222x);
        SafeParcelWriter.f(parcel, 25, this.f10223y);
        SafeParcelWriter.g(parcel, 26, this.f10224z);
        SafeParcelWriter.p(o10, parcel);
    }
}
