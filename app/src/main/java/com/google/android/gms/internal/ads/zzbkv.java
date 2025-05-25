package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbkv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkv> CREATOR = new zzbkw();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final boolean zzb;
    @SafeParcelable.Field
    public final int zzc;
    @SafeParcelable.Field
    public final String zzd;

    @SafeParcelable.Constructor
    public zzbkv(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i10, @SafeParcelable.Param String str2) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, str);
        SafeParcelWriter.a(parcel, 2, this.zzb);
        SafeParcelWriter.f(parcel, 3, this.zzc);
        SafeParcelWriter.j(parcel, 4, this.zzd);
        SafeParcelWriter.p(o10, parcel);
    }
}
