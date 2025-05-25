package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zza {
    public static final boolean a(Context context, Intent intent, zzaa zzaaVar, zzy zzyVar, boolean z10) {
        int i10;
        if (z10) {
            Uri data = intent.getData();
            try {
                com.google.android.gms.ads.internal.zzu.B.c.getClass();
                i10 = com.google.android.gms.ads.internal.util.zzt.A(context, data);
                if (zzaaVar != null) {
                    zzaaVar.zzg();
                }
            } catch (ActivityNotFoundException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.e(e10.getMessage());
                i10 = 6;
            }
            if (zzyVar != null) {
                zzyVar.zzb(i10);
            }
            if (i10 != 5) {
                return false;
            }
            return true;
        }
        try {
            String uri = intent.toURI();
            com.google.android.gms.ads.internal.util.zze.h("Launching an intent: " + uri);
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            com.google.android.gms.ads.internal.util.zzt.zzT(context, intent);
            if (zzaaVar != null) {
                zzaaVar.zzg();
            }
            if (zzyVar != null) {
                zzyVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.e(e11.getMessage());
            if (zzyVar != null) {
                zzyVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, zzc zzcVar, zzaa zzaaVar, zzy zzyVar) {
        int i10 = 0;
        if (zzcVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("No intent data for launcher overlay.");
            return false;
        }
        zzbbw.zza(context);
        boolean z10 = zzcVar.f10299j;
        Intent intent = zzcVar.f10297h;
        if (intent != null) {
            return a(context, intent, zzaaVar, zzyVar, z10);
        }
        Intent intent2 = new Intent();
        String str = zzcVar.f10292b;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Open GMSG did not contain a URL.");
            return false;
        }
        String str2 = zzcVar.c;
        if (!TextUtils.isEmpty(str2)) {
            intent2.setDataAndType(Uri.parse(str), str2);
        } else {
            intent2.setData(Uri.parse(str));
        }
        intent2.setAction("android.intent.action.VIEW");
        String str3 = zzcVar.f10293d;
        if (!TextUtils.isEmpty(str3)) {
            intent2.setPackage(str3);
        }
        String str4 = zzcVar.f10294e;
        if (!TextUtils.isEmpty(str4)) {
            String[] split = str4.split(PackagingURIHelper.FORWARD_SLASH_STRING, 2);
            if (split.length < 2) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Could not parse component name from open GMSG: ".concat(String.valueOf(str4)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str5 = zzcVar.f10295f;
        if (!TextUtils.isEmpty(str5)) {
            try {
                i10 = Integer.parseInt(str5);
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        zzbbn zzbbnVar = zzbbw.zzea;
        zzba zzbaVar = zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzdZ)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                com.google.android.gms.ads.internal.util.zzt.zzo(context, intent2);
            }
        }
        return a(context, intent2, zzaaVar, zzyVar, z10);
    }
}
