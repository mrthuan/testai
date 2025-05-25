package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzdsp;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzf extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final zze f10719a;

    /* renamed from: b  reason: collision with root package name */
    public final zzdsp f10720b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10721d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10722e;

    /* renamed from: f  reason: collision with root package name */
    public final Boolean f10723f;

    public zzf(zze zzeVar, boolean z10, int i10, Boolean bool, zzdsp zzdspVar) {
        this.f10719a = zzeVar;
        this.c = z10;
        this.f10721d = i10;
        this.f10723f = bool;
        this.f10720b = zzdspVar;
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.f10722e = System.currentTimeMillis();
    }

    public static long a() {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        return ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziX)).longValue() + System.currentTimeMillis();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        String str2;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("sgf_reason", str);
        pairArr[1] = new Pair("se", "query_g");
        pairArr[2] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[3] = new Pair("rtype", Integer.toString(6));
        pairArr[4] = new Pair("scar", "true");
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        pairArr[5] = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f10722e));
        pairArr[6] = new Pair("sgpc_rn", Integer.toString(this.f10721d));
        pairArr[7] = new Pair("sgpc_lsu", String.valueOf(this.f10723f));
        boolean z10 = this.c;
        if (true != z10) {
            str2 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str2 = "1";
        }
        pairArr[8] = new Pair("tpc", str2);
        zzq.d(this.f10720b, "sgpcf", pairArr);
        this.f10719a.a(z10, new zzg(null, str, a(), this.f10721d));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        pairArr[4] = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f10722e));
        pairArr[5] = new Pair("sgpc_rn", Integer.toString(this.f10721d));
        pairArr[6] = new Pair("sgpc_lsu", String.valueOf(this.f10723f));
        boolean z10 = this.c;
        if (true != z10) {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str = "1";
        }
        pairArr[7] = new Pair("tpc", str);
        zzq.d(this.f10720b, "sgpcs", pairArr);
        this.f10719a.a(z10, new zzg(queryInfo, "", a(), this.f10721d));
    }
}
