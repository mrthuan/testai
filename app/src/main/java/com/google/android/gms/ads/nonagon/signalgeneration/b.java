package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfkf;
import com.google.android.gms.internal.ads.zzgcf;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class b implements zzgcf {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y9.a f10628a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzbyq f10629b;
    public final /* synthetic */ zzbyj c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzfju f10630d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzak f10631e;

    public b(zzak zzakVar, y9.a aVar, zzbyq zzbyqVar, zzbyj zzbyjVar, zzfju zzfjuVar) {
        this.f10628a = aVar;
        this.f10629b = zzbyqVar;
        this.c = zzbyjVar;
        this.f10630d = zzfjuVar;
        this.f10631e = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgT)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "SignalGeneratorImpl.generateSignals");
        }
        zzfkf T0 = zzak.T0(this.f10628a, this.f10629b);
        if (((Boolean) zzbdl.zze.zze()).booleanValue() && T0 != null) {
            zzfju zzfjuVar = this.f10630d;
            zzfjuVar.zzh(th2);
            zzfjuVar.zzg(false);
            T0.zza(zzfjuVar);
            T0.zzh();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.c.zzb(message);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        zzay zzayVar = (zzay) obj;
        zzfkf T0 = zzak.T0(this.f10628a, this.f10629b);
        zzak zzakVar = this.f10631e;
        zzakVar.B.set(true);
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgO)).booleanValue();
        zzbyj zzbyjVar = this.c;
        zzfju zzfjuVar = this.f10630d;
        if (!booleanValue) {
            try {
                zzbyjVar.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.c("QueryInfo generation has been disabled.".concat(e10.toString()));
            }
            if (((Boolean) zzbdl.zze.zze()).booleanValue() && T0 != null) {
                zzfjuVar.zzc("QueryInfo generation has been disabled.");
                zzfjuVar.zzg(false);
                T0.zza(zzfjuVar);
                T0.zzh();
                return;
            }
            return;
        }
        try {
            try {
                if (zzayVar == null) {
                    zzbyjVar.zzc(null, null, null);
                    zzfjuVar.zzg(true);
                    if (((Boolean) zzbdl.zze.zze()).booleanValue() && T0 != null) {
                        T0.zza(zzfjuVar);
                        T0.zzh();
                        return;
                    }
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzayVar.f10694b).optString("request_id", ""))) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("The request ID is empty in request JSON.");
                        zzbyjVar.zzb("Internal error: request ID is empty in request JSON.");
                        zzfjuVar.zzc("Request ID empty");
                        zzfjuVar.zzg(false);
                        if (((Boolean) zzbdl.zze.zze()).booleanValue() && T0 != null) {
                            T0.zza(zzfjuVar);
                            T0.zzh();
                            return;
                        }
                        return;
                    }
                    Bundle bundle = zzayVar.f10695d;
                    if (zzakVar.f10659p && bundle != null && bundle.getInt(zzakVar.f10661r, -1) == -1) {
                        bundle.putInt(zzakVar.f10661r, zzakVar.f10662s.get());
                    }
                    if (zzakVar.f10658o && bundle != null && TextUtils.isEmpty(bundle.getString(zzakVar.f10660q))) {
                        if (TextUtils.isEmpty(zzakVar.f10664u)) {
                            zzakVar.f10664u = com.google.android.gms.ads.internal.zzu.B.c.v(zzakVar.f10646b, zzakVar.f10663t.f10345a);
                        }
                        bundle.putString(zzakVar.f10660q, zzakVar.f10664u);
                    }
                    zzbyjVar.zzc(zzayVar.f10693a, zzayVar.f10694b, bundle);
                    zzfjuVar.zzg(true);
                    if (((Boolean) zzbdl.zze.zze()).booleanValue() && T0 != null) {
                        T0.zza(zzfjuVar);
                        T0.zzh();
                    }
                } catch (JSONException e11) {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Failed to create JSON object from the request string.");
                    String obj2 = e11.toString();
                    zzbyjVar.zzb("Internal error for request JSON: " + obj2);
                    zzfjuVar.zzh(e11);
                    zzfjuVar.zzg(false);
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (((Boolean) zzbdl.zze.zze()).booleanValue() && T0 != null) {
                        T0.zza(zzfjuVar);
                        T0.zzh();
                    }
                }
            } catch (RemoteException e12) {
                zzfjuVar.zzh(e12);
                zzfjuVar.zzg(false);
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (((Boolean) zzbdl.zze.zze()).booleanValue() && T0 != null) {
                    T0.zza(zzfjuVar);
                    T0.zzh();
                }
            }
        } catch (Throwable th2) {
            if (((Boolean) zzbdl.zze.zze()).booleanValue() && T0 != null) {
                T0.zza(zzfjuVar);
                T0.zzh();
            }
            throw th2;
        }
    }
}
