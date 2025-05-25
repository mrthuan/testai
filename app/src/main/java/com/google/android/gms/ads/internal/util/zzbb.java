package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfgi;
import com.google.android.gms.internal.ads.zzfvj;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    @SafeParcelable.Field

    /* renamed from: a  reason: collision with root package name */
    public final String f10417a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final int f10418b;

    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param String str, @SafeParcelable.Param int i10) {
        this.f10417a = str == null ? "" : str;
        this.f10418b = i10;
    }

    public static zzbb d(Throwable th2) {
        String message;
        com.google.android.gms.ads.internal.client.zze zza = zzfgi.zza(th2);
        if (zzfvj.zzd(th2.getMessage())) {
            message = zza.f10147b;
        } else {
            message = th2.getMessage();
        }
        return new zzbb(message, zza.f10146a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, this.f10417a);
        SafeParcelWriter.f(parcel, 2, this.f10418b);
        SafeParcelWriter.p(o10, parcel);
    }
}
