package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import t7.g;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zan implements RemoteCall {
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        g gVar = new g((TaskCompletionSource) obj2);
        zaf zafVar = (zaf) ((zaz) obj).getService();
        Parcel zaa = zafVar.zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, gVar);
        com.google.android.gms.internal.base.zac.zac(zaa, null);
        zafVar.zac(3, zaa);
    }
}
