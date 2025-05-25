package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbyq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyq> CREATOR = new zzbyr();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final String zzb;
    @SafeParcelable.Field
    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzq zzc;
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzl zzd;

    @SafeParcelable.Constructor
    public zzbyq(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzq zzqVar, @SafeParcelable.Param com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, str);
        SafeParcelWriter.j(parcel, 2, this.zzb);
        SafeParcelWriter.i(parcel, 3, this.zzc, i10);
        SafeParcelWriter.i(parcel, 4, this.zzd, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
