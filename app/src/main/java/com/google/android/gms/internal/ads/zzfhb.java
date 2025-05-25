package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzfhb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfhb> CREATOR = new zzfhc();
    public final Context zza;
    public final zzfgy zzb;
    @SafeParcelable.Field
    public final int zzc;
    @SafeParcelable.Field
    public final int zzd;
    @SafeParcelable.Field
    public final int zze;
    @SafeParcelable.Field
    public final String zzf;
    public final int zzg;
    private final zzfgy[] zzh;
    @SafeParcelable.Field
    private final int zzi;
    @SafeParcelable.Field
    private final int zzj;
    @SafeParcelable.Field
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfhb(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param int i12, @SafeParcelable.Param int i13, @SafeParcelable.Param String str, @SafeParcelable.Param int i14, @SafeParcelable.Param int i15) {
        zzfgy[] values = zzfgy.values();
        this.zzh = values;
        int[] zza = zzfgz.zza();
        this.zzl = zza;
        int[] zza2 = zzfha.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = values[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = zza[i14];
        this.zzk = i15;
        int i16 = zza2[i15];
    }

    public static zzfhb zza(zzfgy zzfgyVar, Context context) {
        if (zzfgyVar == zzfgy.Rewarded) {
            zzbbn zzbbnVar = zzbbw.zzfI;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            return new zzfhb(context, zzfgyVar, ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue(), ((Integer) zzbaVar.c.zza(zzbbw.zzfO)).intValue(), ((Integer) zzbaVar.c.zza(zzbbw.zzfQ)).intValue(), (String) zzbaVar.c.zza(zzbbw.zzfS), (String) zzbaVar.c.zza(zzbbw.zzfK), (String) zzbaVar.c.zza(zzbbw.zzfM));
        } else if (zzfgyVar == zzfgy.Interstitial) {
            zzbbn zzbbnVar2 = zzbbw.zzfJ;
            com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f10115d;
            return new zzfhb(context, zzfgyVar, ((Integer) zzbaVar2.c.zza(zzbbnVar2)).intValue(), ((Integer) zzbaVar2.c.zza(zzbbw.zzfP)).intValue(), ((Integer) zzbaVar2.c.zza(zzbbw.zzfR)).intValue(), (String) zzbaVar2.c.zza(zzbbw.zzfT), (String) zzbaVar2.c.zza(zzbbw.zzfL), (String) zzbaVar2.c.zza(zzbbw.zzfN));
        } else if (zzfgyVar == zzfgy.AppOpen) {
            zzbbn zzbbnVar3 = zzbbw.zzfW;
            com.google.android.gms.ads.internal.client.zzba zzbaVar3 = com.google.android.gms.ads.internal.client.zzba.f10115d;
            return new zzfhb(context, zzfgyVar, ((Integer) zzbaVar3.c.zza(zzbbnVar3)).intValue(), ((Integer) zzbaVar3.c.zza(zzbbw.zzfY)).intValue(), ((Integer) zzbaVar3.c.zza(zzbbw.zzfZ)).intValue(), (String) zzbaVar3.c.zza(zzbbw.zzfU), (String) zzbaVar3.c.zza(zzbbw.zzfV), (String) zzbaVar3.c.zza(zzbbw.zzfX));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzi;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, i11);
        SafeParcelWriter.f(parcel, 2, this.zzc);
        SafeParcelWriter.f(parcel, 3, this.zzd);
        SafeParcelWriter.f(parcel, 4, this.zze);
        SafeParcelWriter.j(parcel, 5, this.zzf);
        SafeParcelWriter.f(parcel, 6, this.zzj);
        SafeParcelWriter.f(parcel, 7, this.zzk);
        SafeParcelWriter.p(o10, parcel);
    }

    private zzfhb(Context context, zzfgy zzfgyVar, int i10, int i11, int i12, String str, String str2, String str3) {
        int i13;
        this.zzh = zzfgy.values();
        this.zzl = zzfgz.zza();
        this.zzm = zzfha.zza();
        this.zza = context;
        this.zzi = zzfgyVar.ordinal();
        this.zzb = zzfgyVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else {
            i13 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i13;
        this.zzj = i13 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
