package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzca;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzh();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10088a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final zzcb f10089b;
    @SafeParcelable.Field
    public final IBinder c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class Builder {
    }

    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param boolean z10, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2) {
        zzcb zzcbVar;
        this.f10088a = z10;
        if (iBinder != null) {
            zzcbVar = zzca.zzd(iBinder);
        } else {
            zzcbVar = null;
        }
        this.f10089b = zzcbVar;
        this.c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.a(parcel, 1, this.f10088a);
        zzcb zzcbVar = this.f10089b;
        if (zzcbVar == null) {
            asBinder = null;
        } else {
            asBinder = zzcbVar.asBinder();
        }
        SafeParcelWriter.e(parcel, 2, asBinder);
        SafeParcelWriter.e(parcel, 3, this.c);
        SafeParcelWriter.p(o10, parcel);
    }
}
