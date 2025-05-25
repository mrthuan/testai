package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    @SafeParcelable.Field
    final int zza;
    @SafeParcelable.Field
    final zzba zzb;
    @SafeParcelable.Field
    final com.google.android.gms.location.zzbd zzc;
    @SafeParcelable.Field
    final PendingIntent zzd;
    @SafeParcelable.Field
    final com.google.android.gms.location.zzba zze;
    @SafeParcelable.Field
    final zzai zzf;

    @SafeParcelable.Constructor
    public zzbc(@SafeParcelable.Param int i10, @SafeParcelable.Param zzba zzbaVar, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param IBinder iBinder2, @SafeParcelable.Param IBinder iBinder3) {
        com.google.android.gms.location.zzbd zzb;
        com.google.android.gms.location.zzba zzb2;
        this.zza = i10;
        this.zzb = zzbaVar;
        zzai zzaiVar = null;
        if (iBinder == null) {
            zzb = null;
        } else {
            zzb = com.google.android.gms.location.zzbc.zzb(iBinder);
        }
        this.zzc = zzb;
        this.zzd = pendingIntent;
        if (iBinder2 == null) {
            zzb2 = null;
        } else {
            zzb2 = com.google.android.gms.location.zzaz.zzb(iBinder2);
        }
        this.zze = zzb2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzaiVar = (zzai) queryLocalInterface;
            } else {
                zzaiVar = new zzag(iBinder3);
            }
        }
        this.zzf = zzaiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.zzbd, android.os.IBinder] */
    public static zzbc zza(com.google.android.gms.location.zzbd zzbdVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, zzbdVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.zzba, android.os.IBinder] */
    public static zzbc zzc(com.google.android.gms.location.zzba zzbaVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, zzbaVar, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        IBinder asBinder2;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.zza);
        SafeParcelWriter.i(parcel, 2, this.zzb, i10);
        com.google.android.gms.location.zzbd zzbdVar = this.zzc;
        IBinder iBinder = null;
        if (zzbdVar == null) {
            asBinder = null;
        } else {
            asBinder = zzbdVar.asBinder();
        }
        SafeParcelWriter.e(parcel, 3, asBinder);
        SafeParcelWriter.i(parcel, 4, this.zzd, i10);
        com.google.android.gms.location.zzba zzbaVar = this.zze;
        if (zzbaVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = zzbaVar.asBinder();
        }
        SafeParcelWriter.e(parcel, 5, asBinder2);
        zzai zzaiVar = this.zzf;
        if (zzaiVar != null) {
            iBinder = zzaiVar.asBinder();
        }
        SafeParcelWriter.e(parcel, 6, iBinder);
        SafeParcelWriter.p(o10, parcel);
    }
}
