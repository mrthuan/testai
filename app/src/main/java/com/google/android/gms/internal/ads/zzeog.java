package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeog implements zzevn {
    public final com.google.android.gms.ads.internal.client.zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeog(com.google.android.gms.ads.internal.client.zzq zzqVar, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        if (zzqVar != null) {
            this.zza = zzqVar;
            this.zzb = str;
            this.zzc = z10;
            this.zzd = str2;
            this.zze = f10;
            this.zzf = i10;
            this.zzg = i11;
            this.zzh = str3;
            this.zzi = z11;
            return;
        }
        throw new NullPointerException("the adSize must not be null");
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z10;
        boolean z11;
        Bundle bundle = (Bundle) obj;
        if (this.zza.f10241e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzffu.zzf(bundle, "smart_w", "full", z10);
        if (this.zza.f10239b == -2) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzffu.zzf(bundle, "smart_h", "auto", z11);
        zzffu.zzg(bundle, "ene", true, this.zza.f10246j);
        zzffu.zzf(bundle, "rafmt", "102", this.zza.f10249m);
        zzffu.zzf(bundle, "rafmt", "103", this.zza.f10250n);
        zzffu.zzf(bundle, "rafmt", "105", this.zza.f10251o);
        zzffu.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzffu.zzg(bundle, "interscroller_slot", true, this.zza.f10251o);
        zzffu.zzc(bundle, "format", this.zzb);
        zzffu.zzf(bundle, "fluid", InMobiNetworkValues.HEIGHT, this.zzc);
        zzffu.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(OperatorName.SHADING_FILL, this.zzg);
        zzffu.zzf(bundle, OperatorName.NON_STROKING_COLOR, this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = this.zza.f10243g;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(InMobiNetworkValues.HEIGHT, this.zza.f10239b);
            bundle2.putInt(InMobiNetworkValues.WIDTH, this.zza.f10241e);
            bundle2.putBoolean("is_fluid_height", this.zza.f10245i);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.f10245i);
                bundle3.putInt(InMobiNetworkValues.HEIGHT, zzqVar.f10239b);
                bundle3.putInt(InMobiNetworkValues.WIDTH, zzqVar.f10241e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
