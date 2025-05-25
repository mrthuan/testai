package com.google.android.gms.ads.internal;

import a6.h;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbzo;
import j7.b;
import j7.c;
import j7.d;
import j7.e;
import java.util.Iterator;
import java.util.TreeMap;
import y9.a;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzt extends zzbt {

    /* renamed from: a  reason: collision with root package name */
    public final VersionInfoParcel f10544a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.client.zzq f10545b;
    public final a c = zzbzo.zza.zzb(new c(this));

    /* renamed from: d  reason: collision with root package name */
    public final Context f10546d;

    /* renamed from: e  reason: collision with root package name */
    public final e f10547e;

    /* renamed from: f  reason: collision with root package name */
    public WebView f10548f;

    /* renamed from: g  reason: collision with root package name */
    public zzbh f10549g;

    /* renamed from: h  reason: collision with root package name */
    public zzauo f10550h;

    /* renamed from: i  reason: collision with root package name */
    public AsyncTask f10551i;

    public zzt(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, VersionInfoParcel versionInfoParcel) {
        this.f10546d = context;
        this.f10544a = versionInfoParcel;
        this.f10545b = zzqVar;
        this.f10548f = new WebView(context);
        this.f10547e = new e(context, str);
        K(0);
        this.f10548f.setVerticalScrollBarEnabled(false);
        this.f10548f.getSettings().setJavaScriptEnabled(true);
        this.f10548f.setWebViewClient(new j7.a(this));
        this.f10548f.setOnTouchListener(new b(this));
    }

    public final void K(int i10) {
        if (this.f10548f == null) {
            return;
        }
        this.f10548f.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        Preconditions.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        this.f10549g = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzazs zzazsVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsw zzbswVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbcr zzbcrVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsz zzbszVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvt zzbvtVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfk zzfkVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        TreeMap treeMap;
        Preconditions.k(this.f10548f, "This Search Ad has already been torn down");
        e eVar = this.f10547e;
        eVar.getClass();
        eVar.f19052d = zzlVar.f10208j.f10192a;
        Bundle bundle2 = zzlVar.f10211m;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            bundle = null;
        }
        if (bundle != null) {
            String str = (String) zzbde.zzc.zze();
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                treeMap = eVar.c;
                if (!hasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    eVar.f19053e = bundle.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.f10544a.f10345a);
            if (((Boolean) zzbde.zza.zze()).booleanValue()) {
                Bundle a10 = zzad.a(eVar.f19050a, (String) zzbde.zzb.zze());
                for (String str2 : a10.keySet()) {
                    treeMap.put(str2, a10.get(str2).toString());
                }
            }
        }
        this.f10551i = new d(this).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzac(zzcf zzcfVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.f10545b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        Preconditions.e("getAdFrame must be called on the main UI thread.");
        return new ObjectWrapper(this.f10548f);
    }

    public final String zzq() {
        String str = this.f10547e.f19053e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return h.d("https://", str, (String) zzbde.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        Preconditions.e("destroy must be called on the main UI thread.");
        this.f10551i.cancel(true);
        this.c.cancel(false);
        this.f10548f.destroy();
        this.f10548f = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        Preconditions.e("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbk zzbkVar) {
    }
}
