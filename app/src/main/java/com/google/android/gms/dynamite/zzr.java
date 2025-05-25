package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public final class zzr extends zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper K(ObjectWrapper objectWrapper, String str, int i10, ObjectWrapper objectWrapper2) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, objectWrapper2);
        return a0.a.d(zzB(2, zza));
    }

    public final IObjectWrapper L0(ObjectWrapper objectWrapper, String str, int i10, ObjectWrapper objectWrapper2) {
        Parcel zza = zza();
        zzc.zze(zza, objectWrapper);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zze(zza, objectWrapper2);
        return a0.a.d(zzB(3, zza));
    }
}
