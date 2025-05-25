package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzgcf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class d implements zzgcf {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzbtc f10634a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f10635b;
    public final /* synthetic */ zzak c;

    public d(zzak zzakVar, zzbtc zzbtcVar, boolean z10) {
        this.f10634a = zzbtcVar;
        this.f10635b = z10;
        this.c = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        try {
            zzbtc zzbtcVar = this.f10634a;
            String message = th2.getMessage();
            zzbtcVar.zze("Internal error: " + message);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzak zzakVar;
        List<Uri> list = (List) obj;
        try {
            ArrayList arrayList = zzak.F;
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                zzakVar = this.c;
                if (hasNext) {
                    if (zzak.Q0((Uri) it.next(), zzakVar.f10666w, zzakVar.f10667x)) {
                        zzakVar.f10662s.getAndIncrement();
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f10634a.zzf(list);
            if (zzakVar.f10657n || this.f10635b) {
                for (Uri uri : list) {
                    boolean Q0 = zzak.Q0(uri, zzakVar.f10666w, zzakVar.f10667x);
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
