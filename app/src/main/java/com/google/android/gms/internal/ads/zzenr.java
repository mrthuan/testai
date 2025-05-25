package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzenr implements zzevn {
    final zzffg zza;
    private final long zzb;

    public zzenr(zzffg zzffgVar, long j10) {
        if (zzffgVar != null) {
            this.zza = zzffgVar;
            this.zzb = j10;
            return;
        }
        throw new NullPointerException("the targeting must not be null");
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.f10221w);
        bundle.putString("slotname", this.zza.zzf);
        int i10 = this.zza.zzo.zza;
        if (i10 != 0) {
            int i11 = i10 - 1;
            boolean z16 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    bundle.putBoolean("is_rewarded_interstitial", true);
                }
            } else {
                bundle.putBoolean("is_new_rewarded", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
            long j10 = zzlVar.f10201b;
            String format = simpleDateFormat.format(new Date(j10));
            if (j10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzffu.zzf(bundle, "cust_age", format, z10);
            zzffu.zzb(bundle, "extras", zzlVar.c);
            int i12 = zzlVar.f10202d;
            if (i12 != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzffu.zze(bundle, "cust_gender", i12, z11);
            zzffu.zzd(bundle, "kw", zzlVar.f10203e);
            int i13 = zzlVar.f10205g;
            if (i13 != -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            zzffu.zze(bundle, "tag_for_child_directed_treatment", i13, z12);
            if (zzlVar.f10204f) {
                bundle.putBoolean("test_request", true);
            }
            bundle.putInt("ppt_p13n", zzlVar.f10223y);
            int i14 = zzlVar.f10200a;
            if (i14 >= 2 && zzlVar.f10206h) {
                z13 = true;
            } else {
                z13 = false;
            }
            zzffu.zze(bundle, "d_imp_hdr", 1, z13);
            String str = zzlVar.f10207i;
            if (i14 >= 2 && !TextUtils.isEmpty(str)) {
                z14 = true;
            } else {
                z14 = false;
            }
            zzffu.zzf(bundle, "ppid", str, z14);
            Location location = zzlVar.f10209k;
            if (location != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", location.getAccuracy() * 1000.0f);
                bundle2.putLong("lat", (long) (location.getLatitude() * 1.0E7d));
                bundle2.putLong(Constants.LONG, (long) (1.0E7d * location.getLongitude()));
                bundle2.putLong("time", location.getTime() * 1000);
                bundle.putBundle("uule", bundle2);
            }
            zzffu.zzc(bundle, InMobiNetworkValues.URL, zzlVar.f10210l);
            zzffu.zzd(bundle, "neighboring_content_urls", zzlVar.f10220v);
            zzffu.zzb(bundle, "custom_targeting", zzlVar.f10212n);
            zzffu.zzd(bundle, "category_exclusions", zzlVar.f10213o);
            zzffu.zzc(bundle, "request_agent", zzlVar.f10214p);
            zzffu.zzc(bundle, "request_pkg", zzlVar.f10215q);
            if (i14 >= 7) {
                z15 = true;
            } else {
                z15 = false;
            }
            zzffu.zzg(bundle, "is_designed_for_families", zzlVar.f10216r, z15);
            if (i14 >= 8) {
                int i15 = zzlVar.f10218t;
                if (i15 == -1) {
                    z16 = false;
                }
                zzffu.zze(bundle, "tag_for_under_age_of_consent", i15, z16);
                zzffu.zzc(bundle, "max_ad_content_rating", zzlVar.f10219u);
                return;
            }
            return;
        }
        throw null;
    }
}
