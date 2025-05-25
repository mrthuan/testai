package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbvu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvu> CREATOR = new zzbvv();
    @SafeParcelable.Field
    public final com.google.android.gms.ads.internal.client.zzl zza;
    @SafeParcelable.Field
    public final String zzb;

    @SafeParcelable.Constructor
    public zzbvu(@SafeParcelable.Param com.google.android.gms.ads.internal.client.zzl zzlVar, @SafeParcelable.Param String str) {
        this.zza = zzlVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.i(parcel, 2, zzlVar, i10);
        SafeParcelWriter.j(parcel, 3, this.zzb);
        SafeParcelWriter.p(o10, parcel);
    }
}
