package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcej;
import com.google.android.gms.internal.ads.zzfta;
import com.google.android.gms.internal.ads.zzftb;
import com.google.android.gms.internal.ads.zzftk;
import com.google.android.gms.internal.ads.zzfto;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzfuc;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzx {

    /* renamed from: f  reason: collision with root package name */
    public e f10340f;
    public zzcej c = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10339e = false;

    /* renamed from: a  reason: collision with root package name */
    public String f10336a = null;

    /* renamed from: d  reason: collision with root package name */
    public zzfta f10338d = null;

    /* renamed from: b  reason: collision with root package name */
    public String f10337b = null;

    public final void a(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.h(str);
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(PglCryptUtils.KEY_MESSAGE, str);
            hashMap.put("action", str2);
            zzbzo.zze.execute(new zzv(this, "onError", hashMap));
        }
    }

    public final void b(zzcej zzcejVar, zzftk zzftkVar) {
        if (zzcejVar == null) {
            a("adWebview missing", "onLMDShow");
            return;
        }
        this.c = zzcejVar;
        if (!this.f10339e && !c(zzcejVar.getContext())) {
            a("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkC)).booleanValue()) {
            this.f10337b = zzftkVar.zzh();
        }
        if (this.f10340f == null) {
            this.f10340f = new e(this);
        }
        zzfta zzftaVar = this.f10338d;
        if (zzftaVar != null) {
            zzftaVar.zzd(zzftkVar, this.f10340f);
        }
    }

    public final synchronized boolean c(Context context) {
        if (!zzfuc.zza(context)) {
            return false;
        }
        try {
            this.f10338d = zzftb.zza(context);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.util.zze.h("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f10338d == null) {
            this.f10339e = false;
            return false;
        }
        if (this.f10340f == null) {
            this.f10340f = new e(this);
        }
        this.f10339e = true;
        return true;
    }

    public final zzftp d() {
        zzfto zzc = zzftp.zzc();
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzkC)).booleanValue() && !TextUtils.isEmpty(this.f10337b)) {
            zzc.zza(this.f10337b);
        } else {
            String str = this.f10336a;
            if (str != null) {
                zzc.zzb(str);
            } else {
                a("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return zzc.zzc();
    }
}
