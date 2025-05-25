package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
@Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11357a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final long f11358b;
    @SafeParcelable.Field
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f11359d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f11360e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f11361f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final int f11362g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final List f11363h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final String f11364i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final long f11365j;
    @SafeParcelable.Field

    /* renamed from: k  reason: collision with root package name */
    public final int f11366k;
    @SafeParcelable.Field

    /* renamed from: l  reason: collision with root package name */
    public final String f11367l;
    @SafeParcelable.Field

    /* renamed from: m  reason: collision with root package name */
    public final float f11368m;
    @SafeParcelable.Field

    /* renamed from: n  reason: collision with root package name */
    public final long f11369n;
    @SafeParcelable.Field

    /* renamed from: o  reason: collision with root package name */
    public final boolean f11370o;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param int i10, @SafeParcelable.Param long j10, @SafeParcelable.Param int i11, @SafeParcelable.Param String str, @SafeParcelable.Param int i12, @SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param String str2, @SafeParcelable.Param long j11, @SafeParcelable.Param int i13, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param float f10, @SafeParcelable.Param long j12, @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z10) {
        this.f11357a = i10;
        this.f11358b = j10;
        this.c = i11;
        this.f11359d = str;
        this.f11360e = str3;
        this.f11361f = str5;
        this.f11362g = i12;
        this.f11363h = arrayList;
        this.f11364i = str2;
        this.f11365j = j11;
        this.f11366k = i13;
        this.f11367l = str4;
        this.f11368m = f10;
        this.f11369n = j12;
        this.f11370o = z10;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int d() {
        return this.c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String f() {
        String join;
        String str = "";
        List list = this.f11363h;
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(",", list);
        }
        StringBuilder sb2 = new StringBuilder("\t");
        sb2.append(this.f11359d);
        sb2.append("\t");
        sb2.append(this.f11362g);
        sb2.append("\t");
        sb2.append(join);
        sb2.append("\t");
        sb2.append(this.f11366k);
        sb2.append("\t");
        String str2 = this.f11360e;
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append("\t");
        String str3 = this.f11367l;
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append("\t");
        sb2.append(this.f11368m);
        sb2.append("\t");
        String str4 = this.f11361f;
        if (str4 != null) {
            str = str4;
        }
        sb2.append(str);
        sb2.append("\t");
        sb2.append(this.f11370o);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11357a);
        SafeParcelWriter.g(parcel, 2, this.f11358b);
        SafeParcelWriter.j(parcel, 4, this.f11359d);
        SafeParcelWriter.f(parcel, 5, this.f11362g);
        SafeParcelWriter.l(parcel, 6, this.f11363h);
        SafeParcelWriter.g(parcel, 8, this.f11365j);
        SafeParcelWriter.j(parcel, 10, this.f11360e);
        SafeParcelWriter.f(parcel, 11, this.c);
        SafeParcelWriter.j(parcel, 12, this.f11364i);
        SafeParcelWriter.j(parcel, 13, this.f11367l);
        SafeParcelWriter.f(parcel, 14, this.f11366k);
        SafeParcelWriter.d(parcel, 15, this.f11368m);
        SafeParcelWriter.g(parcel, 16, this.f11369n);
        SafeParcelWriter.j(parcel, 17, this.f11361f);
        SafeParcelWriter.a(parcel, 18, this.f11370o);
        SafeParcelWriter.p(o10, parcel);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.f11358b;
    }
}
