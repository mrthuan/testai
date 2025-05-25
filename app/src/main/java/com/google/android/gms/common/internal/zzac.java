package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public abstract class zzac extends zzb implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                zzk zzkVar = (zzk) com.google.android.gms.internal.common.zzc.zza(parcel, zzk.CREATOR);
                com.google.android.gms.internal.common.zzc.zzb(parcel);
                zzd zzdVar = (zzd) this;
                BaseGmsClient baseGmsClient = zzdVar.f11295a;
                Preconditions.k(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                Preconditions.j(zzkVar);
                BaseGmsClient.zzj(baseGmsClient, zzkVar);
                Preconditions.k(zzdVar.f11295a, "onPostInitComplete can be called only once per call to getRemoteService");
                zzdVar.f11295a.onPostInitHandler(readInt, readStrongBinder, zzkVar.f11302a, zzdVar.f11296b);
                zzdVar.f11295a = null;
            } else {
                parcel.readInt();
                Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.common.zzc.zzb(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            com.google.android.gms.internal.common.zzc.zzb(parcel);
            zzd zzdVar2 = (zzd) this;
            Preconditions.k(zzdVar2.f11295a, "onPostInitComplete can be called only once per call to getRemoteService");
            zzdVar2.f11295a.onPostInitHandler(parcel.readInt(), parcel.readStrongBinder(), (Bundle) com.google.android.gms.internal.common.zzc.zza(parcel, Bundle.CREATOR), zzdVar2.f11296b);
            zzdVar2.f11295a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
