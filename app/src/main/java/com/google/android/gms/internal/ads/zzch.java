package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzch {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfxr zzh;
    private final zzfxr zzi;
    private final int zzj;
    private final int zzk;
    private final zzfxr zzl;
    private final zzcg zzm;
    private zzfxr zzn;
    private int zzo;
    private final HashMap zzp;
    private final HashSet zzq;

    @Deprecated
    public zzch() {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = zzfxr.zzm();
        this.zzi = zzfxr.zzm();
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = zzfxr.zzm();
        this.zzm = zzcg.zza;
        this.zzn = zzfxr.zzm();
        this.zzo = 0;
        this.zzp = new HashMap();
        this.zzq = new HashSet();
    }

    public final zzch zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzet.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzo = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzn = zzfxr.zzn(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final zzch zzf(int i10, int i11, boolean z10) {
        this.zze = i10;
        this.zzf = i11;
        this.zzg = true;
        return this;
    }

    public zzch(zzci zzciVar) {
        this.zza = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzc = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zze = zzciVar.zzi;
        this.zzf = zzciVar.zzj;
        this.zzg = zzciVar.zzk;
        this.zzh = zzciVar.zzl;
        this.zzi = zzciVar.zzn;
        this.zzj = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzl = zzciVar.zzr;
        this.zzm = zzciVar.zzs;
        this.zzn = zzciVar.zzt;
        this.zzo = zzciVar.zzu;
        this.zzq = new HashSet(zzciVar.zzB);
        this.zzp = new HashMap(zzciVar.zzA);
    }
}
