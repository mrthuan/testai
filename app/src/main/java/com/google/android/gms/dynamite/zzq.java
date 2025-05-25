package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzq extends zza {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper K(ObjectWrapper objectWrapper, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        return a0.a.d(zzB(2, zza));
    }

    public final IObjectWrapper L0(ObjectWrapper objectWrapper, String str, int i10, ObjectWrapper objectWrapper2) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, objectWrapper2);
        return a0.a.d(zzB(8, zza));
    }

    public final IObjectWrapper M0(ObjectWrapper objectWrapper, String str, int i10) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        return a0.a.d(zzB(4, zza));
    }

    public final IObjectWrapper N0(ObjectWrapper objectWrapper, String str, boolean z10, long j10) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(z10 ? 1 : 0);
        zza.writeLong(j10);
        return a0.a.d(zzB(7, zza));
    }
}
