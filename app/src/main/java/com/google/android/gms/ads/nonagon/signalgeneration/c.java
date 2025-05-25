package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzgcf;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class c implements zzgcf {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzbtc f10632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10633b;
    public final /* synthetic */ zzak c;

    public c(zzak zzakVar, zzbtc zzbtcVar, boolean z10) {
        this.f10632a = zzbtcVar;
        this.f10633b = z10;
        this.c = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        try {
            zzbtc zzbtcVar = this.f10632a;
            String message = th2.getMessage();
            zzbtcVar.zze("Internal error: " + message);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzak zzakVar = this.c;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f10632a.zzf(arrayList);
            if (zzakVar.f10656m || this.f10633b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    boolean Q0 = zzak.Q0(uri, zzakVar.f10668y, zzakVar.f10669z);
                    zzfll zzfllVar = zzakVar.f10655l;
                    if (Q0) {
                        zzfllVar.zzc(zzak.R0(uri, zzakVar.f10665v, "1").toString(), null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgJ)).booleanValue()) {
                            zzfllVar.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }
}
