package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbwn;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzfb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzbwn f10187a;

    @Override // java.lang.Runnable
    public final void run() {
        zzbwn zzbwnVar = this.f10187a;
        if (zzbwnVar != null) {
            try {
                zzbwnVar.zze(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
            }
        }
    }
}
