package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                zzd(parcel.readInt(), (PendingIntent) zzc.zzb(parcel, PendingIntent.CREATOR));
            } else {
                zzc(parcel.readInt(), parcel.createStringArray());
            }
        } else {
            zzb(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }
}
