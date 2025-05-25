package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbjz;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbsn;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzdjx;
import com.google.android.gms.internal.ads.zzdtt;
import com.google.android.gms.internal.ads.zzeln;
import com.google.android.gms.internal.ads.zzezl;
import com.google.android.gms.internal.ads.zzezm;
import com.google.android.gms.internal.ads.zzfaz;
import com.google.android.gms.internal.ads.zzfcq;
import com.google.android.gms.internal.ads.zzfee;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsg C(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i10) {
        return zzcgj.zzb((Context) ObjectWrapper.L0(iObjectWrapper), zzbomVar, i10).zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu Q(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i10) {
        return new zzt((Context) ObjectWrapper.L0(iObjectWrapper), zzqVar, str, new VersionInfoParcel(i10, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfh V(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdjx((FrameLayout) ObjectWrapper.L0(iObjectWrapper), (FrameLayout) ObjectWrapper.L0(iObjectWrapper2), 242402000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu a(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbom zzbomVar, int i10) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        zzezl zzt = zzcgj.zzb(context, zzbomVar, i10).zzt();
        zzt.zza(str);
        zzt.zzb(context);
        zzezm zzc = zzt.zzc();
        if (i10 >= ((Integer) zzba.f10115d.c.zza(zzbbw.zzeK)).intValue()) {
            return zzc.zza();
        }
        return new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbwg a0(IObjectWrapper iObjectWrapper, String str, zzbom zzbomVar, int i10) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        zzfee zzw = zzcgj.zzb(context, zzbomVar, i10).zzw();
        zzw.zzb(context);
        zzw.zza(str);
        return zzw.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbym i(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i10) {
        return zzcgj.zzb((Context) ObjectWrapper.L0(iObjectWrapper), zzbomVar, i10).zzq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu k(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbom zzbomVar, int i10) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        zzfaz zzu = zzcgj.zzb(context, zzbomVar, i10).zzu();
        zzu.zzc(context);
        zzu.zza(zzqVar);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu o0(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbom zzbomVar, int i10) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        zzfcq zzv = zzcgj.zzb(context, zzbomVar, i10).zzv();
        zzv.zzc(context);
        zzv.zza(zzqVar);
        zzv.zzb(str);
        return zzv.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjz p0(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i10, zzbjw zzbjwVar) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        zzdtt zzk = zzcgj.zzb(context, zzbomVar, i10).zzk();
        zzk.zzb(context);
        zzk.zza(zzbjwVar);
        return zzk.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj v0(IObjectWrapper iObjectWrapper, zzbom zzbomVar, int i10) {
        return zzcgj.zzb((Context) ObjectWrapper.L0(iObjectWrapper), zzbomVar, i10).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq y0(IObjectWrapper iObjectWrapper, String str, zzbom zzbomVar, int i10) {
        Context context = (Context) ObjectWrapper.L0(iObjectWrapper);
        return new zzeln(zzcgj.zzb(context, zzbomVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i10) {
        return zzcgj.zzb((Context) ObjectWrapper.L0(iObjectWrapper), null, i10).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsn zzm(IObjectWrapper iObjectWrapper) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        Activity activity = (Activity) ObjectWrapper.L0(iObjectWrapper);
        Intent intent = activity.getIntent();
        Parcelable.Creator<AdOverlayInfoParcel> creator = AdOverlayInfoParcel.CREATOR;
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            adOverlayInfoParcel = (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            adOverlayInfoParcel = null;
        }
        if (adOverlayInfoParcel == null) {
            return new com.google.android.gms.ads.internal.overlay.zzu(activity);
        }
        int i10 = adOverlayInfoParcel.f10278k;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return new com.google.android.gms.ads.internal.overlay.zzu(activity);
                        }
                        return new zzad(activity);
                    }
                    return new zzz(activity, adOverlayInfoParcel);
                }
                return new zzag(activity);
            }
            return new zzaf(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzt(activity);
    }
}
