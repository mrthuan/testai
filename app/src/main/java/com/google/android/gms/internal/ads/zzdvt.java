package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdvt implements com.google.android.gms.ads.internal.overlay.zzp, zzcfz {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzdvi zzc;
    private zzcej zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzda zzh;
    private boolean zzi;

    public zzdvt(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzda zzdaVar) {
        zzbbn zzbbnVar = zzbbw.zzia;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(zzfgi.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdaVar.zze(zzfgi.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.zze && !this.zzf) {
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                if (System.currentTimeMillis() >= this.zzg + ((Integer) zzbaVar.c.zza(zzbbw.zzid)).intValue()) {
                    return true;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.e("Ad inspector cannot be opened because it is already open.");
            try {
                zzdaVar.zze(zzfgi.zzd(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfz
    public final synchronized void zza(boolean z10, int i10, String str, String str2) {
        if (z10) {
            com.google.android.gms.ads.internal.util.zze.h("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("Ad inspector failed to load.");
        try {
            zzbze zzbzeVar = com.google.android.gms.ads.internal.zzu.B.f10557g;
            zzbzeVar.zzw(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                zzdaVar.zze(zzfgi.zzd(17, null, null));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdu(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.h("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcej zzcejVar = this.zzd;
        if (zzcejVar != null && !zzcejVar.zzaE()) {
            return this.zzd.zzi();
        }
        return null;
    }

    public final void zzh(zzdvi zzdviVar) {
        this.zzc = zzdviVar;
    }

    public final /* synthetic */ void zzi(String str) {
        JSONObject zze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzbjr zzbjrVar, zzbjk zzbjkVar, zzbiy zzbiyVar) {
        if (!zzl(zzdaVar)) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzcew zzcewVar = zzuVar.f10554d;
            zzcej zza = zzcew.zza(this.zza, zzcgd.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbav.zza(), null, null, null, null);
            this.zzd = zza;
            zzcgb zzN = zza.zzN();
            if (zzN == null) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Failed to obtain a web view for the ad inspector");
                try {
                    zzuVar.f10557g.zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                    zzdaVar.zze(zzfgi.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "InspectorUi.openInspector 3");
                    return;
                }
            }
            this.zzh = zzdaVar;
            zzN.zzR(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbjrVar, null, new zzbjq(this.zza), zzbjkVar, zzbiyVar, null);
            zzN.zzB(this);
            this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzib));
            com.google.android.gms.ads.internal.overlay.zzn.a(this.zza, new AdOverlayInfoParcel(this, this.zzd, this.zzb), true);
            zzuVar.f10560j.getClass();
            this.zzg = System.currentTimeMillis();
        } catch (zzcev e11) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            try {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e11, "InspectorUi.openInspector 0");
                zzdaVar.zze(zzfgi.zzd(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException e12) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e12, "InspectorUi.openInspector 1");
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvs
                @Override // java.lang.Runnable
                public final void run() {
                    zzdvt.this.zzi(str);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }
}
