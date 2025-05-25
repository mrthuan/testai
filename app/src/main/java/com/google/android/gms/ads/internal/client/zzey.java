package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbom;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzey extends zzcn {

    /* renamed from: a  reason: collision with root package name */
    public zzblc f10186a;

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        com.google.android.gms.ads.internal.util.client.zzm.c("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.f10351b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzex
            @Override // java.lang.Runnable
            public final void run() {
                zzblc zzblcVar = zzey.this.f10186a;
                if (zzblcVar != null) {
                    try {
                        zzblcVar.zzb(Collections.emptyList());
                    } catch (RemoteException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(5);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzblc zzblcVar) {
        this.f10186a = zzblcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbom zzbomVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
    }
}
