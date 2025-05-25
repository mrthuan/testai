package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdni extends zzbfw {
    private final Context zza;
    private final zzdjb zzb;
    private zzdkb zzc;
    private zzdiw zzd;

    public zzdni(Context context, zzdjb zzdjbVar, zzdkb zzdkbVar, zzdiw zzdiwVar) {
        this.zza = context;
        this.zzb = zzdjbVar;
        this.zzc = zzdkbVar;
        this.zzd = zzdiwVar;
    }

    private final zzber zzd(String str) {
        return new zzdnh(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfa zzf() {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final zzbfd zzg(String str) {
        return (zzbfd) this.zzb.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final IObjectWrapper zzh() {
        return new ObjectWrapper(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final String zzj(String str) {
        return (String) this.zzb.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final List zzk() {
        try {
            y.i zzh = this.zzb.zzh();
            y.i zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.c + zzi.c];
            int i10 = 0;
            for (int i11 = 0; i11 < zzh.c; i11++) {
                strArr[i10] = (String) zzh.h(i11);
                i10++;
            }
            for (int i12 = 0; i12 < zzi.c; i12++) {
                strArr[i10] = (String) zzi.h(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzl() {
        zzdiw zzdiwVar = this.zzd;
        if (zzdiwVar != null) {
            zzdiwVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (Objects.equals(zzC, "Google")) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzC)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdiw zzdiwVar = this.zzd;
                if (zzdiwVar != null) {
                    zzdiwVar.zzf(zzC, false);
                }
            }
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzn(String str) {
        zzdiw zzdiwVar = this.zzd;
        if (zzdiwVar != null) {
            zzdiwVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzo() {
        zzdiw zzdiwVar = this.zzd;
        if (zzdiwVar != null) {
            zzdiwVar.zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdiw zzdiwVar;
        Object L0 = ObjectWrapper.L0(iObjectWrapper);
        if ((L0 instanceof View) && this.zzb.zzu() != null && (zzdiwVar = this.zzd) != null) {
            zzdiwVar.zzJ((View) L0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzq() {
        zzdiw zzdiwVar = this.zzd;
        if ((zzdiwVar != null && !zzdiwVar.zzW()) || this.zzb.zzr() == null || this.zzb.zzs() != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdkb zzdkbVar;
        Object L0 = ObjectWrapper.L0(iObjectWrapper);
        if ((L0 instanceof ViewGroup) && (zzdkbVar = this.zzc) != null && zzdkbVar.zzf((ViewGroup) L0)) {
            this.zzb.zzq().zzar(zzd("_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdkb zzdkbVar;
        Object L0 = ObjectWrapper.L0(iObjectWrapper);
        if ((L0 instanceof ViewGroup) && (zzdkbVar = this.zzc) != null && zzdkbVar.zzg((ViewGroup) L0)) {
            this.zzb.zzs().zzar(zzd("_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final boolean zzt() {
        zzeeo zzu = this.zzb.zzu();
        if (zzu != null) {
            com.google.android.gms.ads.internal.zzu.B.f10573w.zzk(zzu.zza());
            if (this.zzb.zzr() != null) {
                this.zzb.zzr().zzd("onSdkLoaded", new y.b());
                return true;
            }
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("Trying to start OMID session before creation.");
        return false;
    }
}
