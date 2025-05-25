package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    @SafeParcelable.Field
    final int zza;
    @SafeParcelable.Field
    final zzj zzb;
    @SafeParcelable.Field
    final com.google.android.gms.location.zzax zzc;
    @SafeParcelable.Field
    final zzai zzd;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param int i10, @SafeParcelable.Param zzj zzjVar, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param IBinder iBinder2) {
        com.google.android.gms.location.zzax zzb;
        this.zza = i10;
        this.zzb = zzjVar;
        zzai zzaiVar = null;
        if (iBinder == null) {
            zzb = null;
        } else {
            zzb = com.google.android.gms.location.zzaw.zzb(iBinder);
        }
        this.zzc = zzb;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzaiVar = (zzai) queryLocalInterface;
            } else {
                zzaiVar = new zzag(iBinder2);
            }
        }
        this.zzd = zzaiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder asBinder;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.zza);
        SafeParcelWriter.i(parcel, 2, this.zzb, i10);
        com.google.android.gms.location.zzax zzaxVar = this.zzc;
        IBinder iBinder = null;
        if (zzaxVar == null) {
            asBinder = null;
        } else {
            asBinder = zzaxVar.asBinder();
        }
        SafeParcelWriter.e(parcel, 3, asBinder);
        zzai zzaiVar = this.zzd;
        if (zzaiVar != null) {
            iBinder = zzaiVar.asBinder();
        }
        SafeParcelWriter.e(parcel, 4, iBinder);
        SafeParcelWriter.p(o10, parcel);
    }
}
