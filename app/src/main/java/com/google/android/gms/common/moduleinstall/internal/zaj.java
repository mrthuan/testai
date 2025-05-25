package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import t7.f;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zaj implements RemoteCall {
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        f fVar = new f((TaskCompletionSource) obj2);
        zaf zafVar = (zaf) ((zaz) obj).getService();
        Parcel zaa = zafVar.zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, fVar);
        com.google.android.gms.internal.base.zac.zad(zaa, null);
        zafVar.zac(6, zaa);
    }
}
