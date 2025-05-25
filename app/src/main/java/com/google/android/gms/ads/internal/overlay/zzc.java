package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f10291a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10292b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f10293d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f10294e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String f10295f;
    @SafeParcelable.Field

    /* renamed from: g  reason: collision with root package name */
    public final String f10296g;
    @SafeParcelable.Field

    /* renamed from: h  reason: collision with root package name */
    public final Intent f10297h;
    @SafeParcelable.Field

    /* renamed from: i  reason: collision with root package name */
    public final zzy f10298i;
    @SafeParcelable.Field

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10299j;

    public zzc(Intent intent, zzy zzyVar) {
        this(null, null, null, null, null, null, null, intent, new ObjectWrapper(zzyVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 2, this.f10291a);
        SafeParcelWriter.j(parcel, 3, this.f10292b);
        SafeParcelWriter.j(parcel, 4, this.c);
        SafeParcelWriter.j(parcel, 5, this.f10293d);
        SafeParcelWriter.j(parcel, 6, this.f10294e);
        SafeParcelWriter.j(parcel, 7, this.f10295f);
        SafeParcelWriter.j(parcel, 8, this.f10296g);
        SafeParcelWriter.i(parcel, 9, this.f10297h, i10);
        SafeParcelWriter.e(parcel, 10, new ObjectWrapper(this.f10298i).asBinder());
        SafeParcelWriter.a(parcel, 11, this.f10299j);
        SafeParcelWriter.p(o10, parcel);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzy zzyVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new ObjectWrapper(zzyVar).asBinder(), false);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param Intent intent, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z10) {
        this.f10291a = str;
        this.f10292b = str2;
        this.c = str3;
        this.f10293d = str4;
        this.f10294e = str5;
        this.f10295f = str6;
        this.f10296g = str7;
        this.f10297h = intent;
        this.f10298i = (zzy) ObjectWrapper.L0(IObjectWrapper.Stub.K(iBinder));
        this.f10299j = z10;
    }
}
