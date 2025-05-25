package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbrp extends zzbrq implements zzbix {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcej zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbe zzk;
    private float zzl;
    private int zzm;

    public zzbrp(zzcej zzcejVar, Context context, zzbbe zzbbeVar) {
        super(zzcejVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcejVar;
        this.zzi = context;
        this.zzk = zzbbeVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        JSONObject jSONObject;
        zzcej zzcejVar = (zzcej) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
        DisplayMetrics displayMetrics = this.zza;
        int i10 = displayMetrics.widthPixels;
        zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
        this.zzb = Math.round(i10 / displayMetrics.density);
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        Activity zzi = this.zzh.zzi();
        if (zzi != null && zzi.getWindow() != null) {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            int[] m10 = com.google.android.gms.ads.internal.util.zzt.m(zzi);
            this.zzd = Math.round(m10[0] / this.zza.density);
            this.zze = Math.round(m10[1] / this.zza.density);
        } else {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbro zzbroVar = new zzbro();
        zzbbe zzbbeVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbroVar.zze(zzbbeVar.zza(intent));
        zzbbe zzbbeVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbroVar.zzc(zzbbeVar2.zza(intent2));
        zzbroVar.zza(this.zzk.zzb());
        zzbroVar.zzd(this.zzk.zzc());
        zzbroVar.zzb(true);
        z10 = zzbroVar.zza;
        z11 = zzbroVar.zzb;
        z12 = zzbroVar.zzc;
        z13 = zzbroVar.zzd;
        z14 = zzbroVar.zze;
        zzcej zzcejVar2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            jSONObject = null;
        }
        zzcejVar2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        Context context = this.zzi;
        com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
        zzb(zzayVar.f10108a.f(context, iArr[0]), zzayVar.f10108a.f(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzm.g(2)) {
            com.google.android.gms.ads.internal.util.client.zzm.d("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().f10345a);
    }

    public final void zzb(int i10, int i11) {
        int i12;
        Context context = this.zzi;
        int i13 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            i12 = com.google.android.gms.ads.internal.util.zzt.n((Activity) context)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcej zzcejVar = this.zzh;
            int width = zzcejVar.getWidth();
            int height = zzcejVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzK)).booleanValue()) {
                if (width == 0) {
                    if (this.zzh.zzO() != null) {
                        width = this.zzh.zzO().zzb;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i13 = this.zzh.zzO().zza;
                    }
                    Context context2 = this.zzi;
                    com.google.android.gms.ads.internal.client.zzay zzayVar = com.google.android.gms.ads.internal.client.zzay.f10107f;
                    this.zzf = zzayVar.f10108a.f(context2, width);
                    this.zzg = zzayVar.f10108a.f(this.zzi, i13);
                }
            }
            i13 = height;
            Context context22 = this.zzi;
            com.google.android.gms.ads.internal.client.zzay zzayVar2 = com.google.android.gms.ads.internal.client.zzay.f10107f;
            this.zzf = zzayVar2.f10108a.f(context22, width);
            this.zzg = zzayVar2.f10108a.f(this.zzi, i13);
        }
        zzg(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzN().zzC(i10, i11);
    }
}
