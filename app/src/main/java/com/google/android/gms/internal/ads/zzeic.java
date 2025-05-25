package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzeic implements zzeet {
    private static Bundle zzd(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        return new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(zzfex zzfexVar, zzfel zzfelVar) {
        String optString = zzfelVar.zzv.optString("pubid", "");
        zzffg zzffgVar = zzfexVar.zza.zza;
        zzffe zzffeVar = new zzffe();
        zzffeVar.zzq(zzffgVar);
        zzffeVar.zzt(optString);
        Bundle zzd = zzd(zzffgVar.zzd.f10211m);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfelVar.zzv.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfelVar.zzv.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfelVar.zzD.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfelVar.zzD.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzffgVar.zzd;
        Bundle bundle = zzlVar.f10212n;
        List list = zzlVar.f10213o;
        String str = zzlVar.f10214p;
        String str2 = zzlVar.f10215q;
        int i10 = zzlVar.f10202d;
        boolean z10 = zzlVar.f10216r;
        List list2 = zzlVar.f10203e;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.f10217s;
        boolean z11 = zzlVar.f10204f;
        int i11 = zzlVar.f10218t;
        int i12 = zzlVar.f10205g;
        String str3 = zzlVar.f10219u;
        boolean z12 = zzlVar.f10206h;
        List list3 = zzlVar.f10220v;
        String str4 = zzlVar.f10207i;
        int i13 = zzlVar.f10221w;
        zzffeVar.zzH(new com.google.android.gms.ads.internal.client.zzl(zzlVar.f10200a, zzlVar.f10201b, zzd2, i10, list2, z11, i12, z12, str4, zzlVar.f10208j, zzlVar.f10209k, zzlVar.f10210l, zzd, bundle, list, str, str2, z10, zzcVar, i11, str3, list3, i13, zzlVar.f10222x, zzlVar.f10223y, zzlVar.f10224z));
        zzffg zzJ = zzffeVar.zzJ();
        Bundle bundle2 = new Bundle();
        zzfeo zzfeoVar = zzfexVar.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(zzfeoVar.zza));
        bundle3.putInt("refresh_interval", zzfeoVar.zzc);
        bundle3.putString("gws_query_id", zzfeoVar.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        zzffg zzffgVar2 = zzfexVar.zza.zza;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzffgVar2.zzf);
        bundle4.putString("allocation_id", zzfelVar.zzw);
        bundle4.putString("ad_source_name", zzfelVar.zzF);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(zzfelVar.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(zzfelVar.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfelVar.zzp));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(zzfelVar.zzm));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(zzfelVar.zzg));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(zzfelVar.zzh));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(zzfelVar.zzi));
        bundle4.putString("transaction_id", zzfelVar.zzj);
        bundle4.putString("valid_from_timestamp", zzfelVar.zzk);
        bundle4.putBoolean("is_closable_area_disabled", zzfelVar.zzP);
        bundle4.putString("recursive_server_response_data", zzfelVar.zzao);
        if (zzfelVar.zzl != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzfelVar.zzl.zzb);
            bundle5.putString("rb_type", zzfelVar.zzl.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return zzc(zzJ, bundle2, zzfelVar, zzfexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        if (!TextUtils.isEmpty(zzfelVar.zzv.optString("pubid", ""))) {
            return true;
        }
        return false;
    }

    public abstract y9.a zzc(zzffg zzffgVar, Bundle bundle, zzfel zzfelVar, zzfex zzfexVar);
}
