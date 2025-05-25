package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzbug extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbug> CREATOR = new zzbuh();
    @SafeParcelable.Field
    public final String zza;
    @SafeParcelable.Field
    public final int zzb;
    @SafeParcelable.Field
    public final Bundle zzc;
    @SafeParcelable.Field
    public final byte[] zzd;
    @SafeParcelable.Field
    public final boolean zze;
    @SafeParcelable.Field
    public final String zzf;
    @SafeParcelable.Field
    public final String zzg;

    @SafeParcelable.Constructor
    public zzbug(@SafeParcelable.Param String str, @SafeParcelable.Param int i10, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param boolean z10, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = bundle;
        this.zzd = bArr;
        this.zze = z10;
        this.zzf = str2;
        this.zzg = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.j(parcel, 1, str);
        SafeParcelWriter.f(parcel, 2, this.zzb);
        SafeParcelWriter.b(parcel, 3, this.zzc);
        SafeParcelWriter.c(parcel, 4, this.zzd);
        SafeParcelWriter.a(parcel, 5, this.zze);
        SafeParcelWriter.j(parcel, 6, this.zzf);
        SafeParcelWriter.j(parcel, 7, this.zzg);
        SafeParcelWriter.p(o10, parcel);
    }
}
