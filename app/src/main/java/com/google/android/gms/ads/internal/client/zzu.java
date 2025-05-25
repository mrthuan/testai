package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f10255a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public long f10256b;
    @SafeParcelable.Field
    public zze c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f10257d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f10258e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f10259f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final String f10260g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final String f10261h;

    @SafeParcelable.Constructor
    public zzu(@SafeParcelable.Param String str, @SafeParcelable.Param long j10, @SafeParcelable.Param zze zzeVar, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5) {
        this.f10255a = str;
        this.f10256b = j10;
        this.c = zzeVar;
        this.f10257d = bundle;
        this.f10258e = str2;
        this.f10259f = str3;
        this.f10260g = str4;
        this.f10261h = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.f10255a);
        SafeParcelWriter.g(parcel, 2, this.f10256b);
        SafeParcelWriter.i(parcel, 3, this.c, i10);
        SafeParcelWriter.b(parcel, 4, this.f10257d);
        SafeParcelWriter.j(parcel, 5, this.f10258e);
        SafeParcelWriter.j(parcel, 6, this.f10259f);
        SafeParcelWriter.j(parcel, 7, this.f10260g);
        SafeParcelWriter.j(parcel, 8, this.f10261h);
        SafeParcelWriter.p(o10, parcel);
    }
}
