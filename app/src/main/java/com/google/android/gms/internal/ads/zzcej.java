package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public interface zzcej extends com.google.android.gms.ads.internal.client.zza, zzdeq, zzcea, zzbls, zzcfm, zzcfq, zzbme, zzaxw, zzcft, com.google.android.gms.ads.internal.zzm, zzcfw, zzcfx, zzcbk, zzcfy {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcfq, com.google.android.gms.internal.ads.zzcbk
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    @Override // com.google.android.gms.ads.internal.client.zza
    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcbk
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcbk
    void zzC(zzcfl zzcflVar);

    @Override // com.google.android.gms.internal.ads.zzcea
    zzfel zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcfy
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcfw
    zzauo zzI();

    zzazj zzJ();

    zzber zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    zzcgb zzN();

    @Override // com.google.android.gms.internal.ads.zzcfv
    zzcgd zzO();

    zzeem zzP();

    zzeeo zzQ();

    @Override // com.google.android.gms.internal.ads.zzcfm
    zzfeo zzR();

    zzffk zzS();

    y9.a zzT();

    String zzU();

    List zzV();

    void zzW(zzfel zzfelVar, zzfeo zzfeoVar);

    void zzX();

    void zzY();

    void zzZ(int i10);

    void zzaA(String str, Predicate predicate);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD(boolean z10, int i10);

    boolean zzaE();

    boolean zzaF();

    boolean zzaG();

    boolean zzaH();

    void zzaa();

    void zzab();

    void zzac(boolean z10);

    void zzad();

    void zzae(String str, String str2, String str3);

    void zzaf();

    void zzag(String str, zzbix zzbixVar);

    void zzah();

    void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaj(zzcgd zzcgdVar);

    void zzak(zzazj zzazjVar);

    void zzal(boolean z10);

    void zzam();

    void zzan(Context context);

    void zzao(boolean z10);

    void zzap(zzbep zzbepVar);

    void zzaq(boolean z10);

    void zzar(zzber zzberVar);

    void zzas(zzeem zzeemVar);

    void zzat(zzeeo zzeeoVar);

    void zzau(int i10);

    void zzav(boolean z10);

    void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzax(boolean z10);

    void zzay(boolean z10);

    void zzaz(String str, zzbix zzbixVar);

    @Override // com.google.android.gms.ads.internal.zzm
    /* synthetic */ void zzdg();

    @Override // com.google.android.gms.ads.internal.zzm
    /* synthetic */ void zzdh();

    @Override // com.google.android.gms.internal.ads.zzcfq, com.google.android.gms.internal.ads.zzcbk
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcbk
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcbk
    zzbcj zzm();

    @Override // com.google.android.gms.internal.ads.zzcfx, com.google.android.gms.internal.ads.zzcbk
    VersionInfoParcel zzn();

    @Override // com.google.android.gms.internal.ads.zzcbk
    zzcfl zzq();

    @Override // com.google.android.gms.internal.ads.zzcbk
    void zzt(String str, zzccv zzccvVar);
}
