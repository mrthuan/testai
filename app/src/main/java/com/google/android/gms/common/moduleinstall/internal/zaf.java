package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void K(zaa zaaVar) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, zaaVar);
        com.google.android.gms.internal.base.zac.zac(zaa, null);
        com.google.android.gms.internal.base.zac.zad(zaa, null);
        zac(2, zaa);
    }
}
