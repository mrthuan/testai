package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f11920a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f11921b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f11922d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final long f11923e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final long f11924f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final String f11925g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11926h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11927i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final long f11928j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final String f11929k;
    @SafeParcelable.Field
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public final long f11930l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    public final long f11931m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    public final int f11932n;
    @SafeParcelable.Field

    /* renamed from: o  reason: collision with root package name */
    public final boolean f11933o;
    @SafeParcelable.Field

    /* renamed from: p  reason: collision with root package name */
    public final boolean f11934p;
    @SafeParcelable.Field

    /* renamed from: q  reason: collision with root package name */
    public final String f11935q;
    @SafeParcelable.Field

    /* renamed from: r  reason: collision with root package name */
    public final Boolean f11936r;
    @SafeParcelable.Field

    /* renamed from: s  reason: collision with root package name */
    public final long f11937s;
    @SafeParcelable.Field

    /* renamed from: t  reason: collision with root package name */
    public final List f11938t;
    @SafeParcelable.Field

    /* renamed from: u  reason: collision with root package name */
    public final String f11939u;
    @SafeParcelable.Field

    /* renamed from: v  reason: collision with root package name */
    public final String f11940v;
    @SafeParcelable.Field

    /* renamed from: w  reason: collision with root package name */
    public final String f11941w;
    @SafeParcelable.Field

    /* renamed from: x  reason: collision with root package name */
    public final String f11942x;
    @SafeParcelable.Field

    /* renamed from: y  reason: collision with root package name */
    public final boolean f11943y;
    @SafeParcelable.Field

    /* renamed from: z  reason: collision with root package name */
    public final long f11944z;

    public zzq(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, boolean z14, long j15) {
        Preconditions.f(str);
        this.f11920a = str;
        this.f11921b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.f11928j = j10;
        this.f11922d = str4;
        this.f11923e = j11;
        this.f11924f = j12;
        this.f11925g = str5;
        this.f11926h = z10;
        this.f11927i = z11;
        this.f11929k = str6;
        this.f11930l = 0L;
        this.f11931m = j13;
        this.f11932n = i10;
        this.f11933o = z12;
        this.f11934p = z13;
        this.f11935q = str7;
        this.f11936r = bool;
        this.f11937s = j14;
        this.f11938t = list;
        this.f11939u = null;
        this.f11940v = str8;
        this.f11941w = str9;
        this.f11942x = str10;
        this.f11943y = z14;
        this.f11944z = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 2, this.f11920a);
        SafeParcelWriter.j(parcel, 3, this.f11921b);
        SafeParcelWriter.j(parcel, 4, this.c);
        SafeParcelWriter.j(parcel, 5, this.f11922d);
        SafeParcelWriter.g(parcel, 6, this.f11923e);
        SafeParcelWriter.g(parcel, 7, this.f11924f);
        SafeParcelWriter.j(parcel, 8, this.f11925g);
        SafeParcelWriter.a(parcel, 9, this.f11926h);
        SafeParcelWriter.a(parcel, 10, this.f11927i);
        SafeParcelWriter.g(parcel, 11, this.f11928j);
        SafeParcelWriter.j(parcel, 12, this.f11929k);
        SafeParcelWriter.g(parcel, 13, this.f11930l);
        SafeParcelWriter.g(parcel, 14, this.f11931m);
        SafeParcelWriter.f(parcel, 15, this.f11932n);
        SafeParcelWriter.a(parcel, 16, this.f11933o);
        SafeParcelWriter.a(parcel, 18, this.f11934p);
        SafeParcelWriter.j(parcel, 19, this.f11935q);
        Boolean bool = this.f11936r;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        SafeParcelWriter.g(parcel, 22, this.f11937s);
        SafeParcelWriter.l(parcel, 23, this.f11938t);
        SafeParcelWriter.j(parcel, 24, this.f11939u);
        SafeParcelWriter.j(parcel, 25, this.f11940v);
        SafeParcelWriter.j(parcel, 26, this.f11941w);
        SafeParcelWriter.j(parcel, 27, this.f11942x);
        SafeParcelWriter.a(parcel, 28, this.f11943y);
        SafeParcelWriter.g(parcel, 29, this.f11944z);
        SafeParcelWriter.p(o10, parcel);
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param long j10, @SafeParcelable.Param long j11, @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z10, @SafeParcelable.Param boolean z11, @SafeParcelable.Param long j12, @SafeParcelable.Param String str6, @SafeParcelable.Param long j13, @SafeParcelable.Param long j14, @SafeParcelable.Param int i10, @SafeParcelable.Param boolean z12, @SafeParcelable.Param boolean z13, @SafeParcelable.Param String str7, @SafeParcelable.Param Boolean bool, @SafeParcelable.Param long j15, @SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param String str8, @SafeParcelable.Param String str9, @SafeParcelable.Param String str10, @SafeParcelable.Param String str11, @SafeParcelable.Param boolean z14, @SafeParcelable.Param long j16) {
        this.f11920a = str;
        this.f11921b = str2;
        this.c = str3;
        this.f11928j = j12;
        this.f11922d = str4;
        this.f11923e = j10;
        this.f11924f = j11;
        this.f11925g = str5;
        this.f11926h = z10;
        this.f11927i = z11;
        this.f11929k = str6;
        this.f11930l = j13;
        this.f11931m = j14;
        this.f11932n = i10;
        this.f11933o = z12;
        this.f11934p = z13;
        this.f11935q = str7;
        this.f11936r = bool;
        this.f11937s = j15;
        this.f11938t = arrayList;
        this.f11939u = str8;
        this.f11940v = str9;
        this.f11941w = str10;
        this.f11942x = str11;
        this.f11943y = z14;
        this.f11944z = j16;
    }
}
