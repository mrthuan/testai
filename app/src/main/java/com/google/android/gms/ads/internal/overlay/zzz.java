package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzdeq;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzz extends zzbsm {

    /* renamed from: a  reason: collision with root package name */
    public final AdOverlayInfoParcel f10341a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f10342b;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10343d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10344e = false;

    public zzz(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f10341a = adOverlayInfoParcel;
        this.f10342b = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzH() {
        return false;
    }

    public final synchronized void zzb() {
        if (!this.f10343d) {
            zzp zzpVar = this.f10341a.c;
            if (zzpVar != null) {
                zzpVar.zzdu(4);
            }
            this.f10343d = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzl(Bundle bundle) {
        zzp zzpVar;
        boolean booleanValue = ((Boolean) zzba.f10115d.c.zza(zzbbw.zzhY)).booleanValue();
        Activity activity = this.f10342b;
        if (booleanValue && !this.f10344e) {
            activity.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10341a;
        if (adOverlayInfoParcel == null) {
            activity.finish();
        } else if (z10) {
            activity.finish();
        } else {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.f10270b;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                zzdeq zzdeqVar = adOverlayInfoParcel.f10288u;
                if (zzdeqVar != null) {
                    zzdeqVar.zzdG();
                }
                if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzpVar = adOverlayInfoParcel.c) != null) {
                    zzpVar.zzdr();
                }
            }
            zza zzaVar2 = com.google.android.gms.ads.internal.zzu.B.f10552a;
            zzc zzcVar = adOverlayInfoParcel.f10269a;
            if (!zza.b(activity, zzcVar, adOverlayInfoParcel.f10276i, zzcVar.f10298i)) {
                activity.finish();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzm() {
        if (this.f10342b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzo() {
        zzp zzpVar = this.f10341a.c;
        if (zzpVar != null) {
            zzpVar.zzdk();
        }
        if (this.f10342b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzr() {
        if (this.c) {
            this.f10342b.finish();
            return;
        }
        this.c = true;
        zzp zzpVar = this.f10341a.c;
        if (zzpVar != null) {
            zzpVar.zzdH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzu() {
        if (this.f10342b.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzv() {
        zzp zzpVar = this.f10341a.c;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzx() {
        this.f10344e = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzk(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }
}
