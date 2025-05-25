package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final int f10146a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10147b;
    @SafeParcelable.Field
    public final String c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public zze f10148d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public IBinder f10149e;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param int i10, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param zze zzeVar, @SafeParcelable.Param IBinder iBinder) {
        this.f10146a = i10;
        this.f10147b = str;
        this.c = str2;
        this.f10148d = zzeVar;
        this.f10149e = iBinder;
    }

    public final AdError d() {
        zze zzeVar = this.f10148d;
        AdError adError = null;
        if (zzeVar != null) {
            adError = new AdError(zzeVar.f10146a, zzeVar.f10147b, zzeVar.c, null);
        }
        return new AdError(this.f10146a, this.f10147b, this.c, adError);
    }

    public final LoadAdError f() {
        AdError adError;
        zzdn zzdlVar;
        zze zzeVar = this.f10148d;
        ResponseInfo responseInfo = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new AdError(zzeVar.f10146a, zzeVar.f10147b, zzeVar.c, null);
        }
        int i10 = this.f10146a;
        String str = this.f10147b;
        String str2 = this.c;
        IBinder iBinder = this.f10149e;
        if (iBinder == null) {
            zzdlVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzdn) {
                zzdlVar = (zzdn) queryLocalInterface;
            } else {
                zzdlVar = new zzdl(iBinder);
            }
        }
        if (zzdlVar != null) {
            responseInfo = new ResponseInfo(zzdlVar);
        }
        return new LoadAdError(i10, str, str2, adError, responseInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f10146a);
        SafeParcelWriter.j(parcel, 2, this.f10147b);
        SafeParcelWriter.j(parcel, 3, this.c);
        SafeParcelWriter.i(parcel, 4, this.f10148d, i10);
        SafeParcelWriter.e(parcel, 5, this.f10149e);
        SafeParcelWriter.p(o10, parcel);
    }
}
