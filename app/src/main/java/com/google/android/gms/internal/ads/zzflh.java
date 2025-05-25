package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzflh {
    private final zzein zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfey zzf;
    private final zzfez zzg;
    private final Clock zzh;
    private final zzauo zzi;

    public zzflh(zzein zzeinVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzfey zzfeyVar, zzfez zzfezVar, Clock clock, zzauo zzauoVar) {
        this.zza = zzeinVar;
        this.zzb = versionInfoParcel.f10345a;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfeyVar;
        this.zzg = zzfezVar;
        this.zzh = clock;
        this.zzi = zzauoVar;
    }

    public static final List zzf(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", b.a.c("2.", i11)));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j10, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzi(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (com.google.android.gms.ads.internal.util.client.zzl.c()) {
            return "fakeForAdDebugLog";
        }
        return str;
    }

    private static String zzj(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfex zzfexVar, zzfel zzfelVar, List list) {
        return zzd(zzfexVar, zzfelVar, false, "", "", list);
    }

    public final List zzd(zzfex zzfexVar, zzfel zzfelVar, boolean z10, String str, String str2, List list) {
        String str3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            if (true != z10) {
                str3 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            } else {
                str3 = "1";
            }
            String zzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfexVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfelVar != null) {
                zzj = zzbyc.zzc(zzj(zzj(zzj(zzj, "@gw_qdata@", zzfelVar.zzy), "@gw_adnetid@", zzfelVar.zzx), "@gw_allocid@", zzfelVar.zzw), this.zze, zzfelVar.zzW, zzfelVar.zzaw);
            }
            String zzj2 = zzj(zzj(zzj(zzj(zzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z12 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdf)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean z13 = !TextUtils.isEmpty(str2);
            if (!z12) {
                if (!z13) {
                    arrayList.add(zzj2);
                }
            } else {
                z11 = z13;
            }
            if (this.zzi.zzf(Uri.parse(zzj2))) {
                Uri.Builder buildUpon = Uri.parse(zzj2).buildUpon();
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzj2 = buildUpon.build().toString();
            }
            arrayList.add(zzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[LOOP:0: B:13:0x005f->B:15:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zze(com.google.android.gms.internal.ads.zzfel r11, java.util.List r12, com.google.android.gms.internal.ads.zzbvn r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.Clock r1 = r10.zzh
            long r1 = r1.a()
            java.lang.String r3 = r13.zzc()     // Catch: android.os.RemoteException -> Lb0
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb0
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb0
            com.google.android.gms.internal.ads.zzbbn r4 = com.google.android.gms.internal.ads.zzbbw.zzdg
            com.google.android.gms.ads.internal.client.zzba r5 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r5 = r5.c
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            com.google.android.gms.internal.ads.zzfez r4 = r10.zzg
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.zzfus r4 = com.google.android.gms.internal.ads.zzfus.zzc()
            goto L3b
        L32:
            com.google.android.gms.internal.ads.zzfey r4 = r4.zza
            goto L37
        L35:
            com.google.android.gms.internal.ads.zzfey r4 = r10.zzf
        L37:
            com.google.android.gms.internal.ads.zzfus r4 = com.google.android.gms.internal.ads.zzfus.zzd(r4)
        L3b:
            com.google.android.gms.internal.ads.zzflf r5 = new com.google.android.gms.internal.ads.zzflf
            r5.<init>()
            com.google.android.gms.internal.ads.zzfus r5 = r4.zza(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzflg r7 = new com.google.android.gms.internal.ads.zzflg
            r7.<init>()
            com.google.android.gms.internal.ads.zzfus r4 = r4.zza(r7)
            java.lang.Object r4 = r4.zzb(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L5f:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Laf
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzj(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzj(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzj(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzbyc.zzc(r6, r7, r8, r9)
            r0.add(r6)
            goto L5f
        Laf:
            return r0
        Lb0:
            r11 = 6
            com.google.android.gms.ads.internal.util.client.zzm.g(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflh.zze(com.google.android.gms.internal.ads.zzfel, java.util.List, com.google.android.gms.internal.ads.zzbvn):java.util.List");
    }
}
