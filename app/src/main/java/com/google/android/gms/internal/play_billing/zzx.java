package com.google.android.gms.internal.play_billing;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import b.a;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzx {
    private static final ClassLoader zza = zzx.class.getClassLoader();

    private zzx() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzb(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(a.c("Parcel data not fully consumed, unread size: ", dataAvail));
    }

    public static void zzc(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
