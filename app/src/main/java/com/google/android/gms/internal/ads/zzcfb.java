package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcfb extends FrameLayout implements zzcej {
    private final zzcej zza;
    private final zzcaz zzb;
    private final AtomicBoolean zzc;

    public zzcfb(zzcej zzcejVar) {
        super(zzcejVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcejVar;
        this.zzb = new zzcaz(zzcejVar.zzE(), this, this);
        addView((View) zzcejVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void destroy() {
        final zzeem zzP;
        final zzeeo zzQ = zzQ();
        if (zzQ != null) {
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
            zzfVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcez
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzu.B.f10573w.zzi(zzeeo.this.zza());
                }
            });
            zzcej zzcejVar = this.zza;
            Objects.requireNonNull(zzcejVar);
            zzfVar.postDelayed(new zzcex(zzcejVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeA)).intValue());
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeC)).booleanValue() && (zzP = zzP()) != null) {
            com.google.android.gms.ads.internal.util.zzt.f10496l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfa
                @Override // java.lang.Runnable
                public final void run() {
                    zzP.zzf(new zzcey(zzcfb.this));
                }
            });
        } else {
            this.zza.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcej zzcejVar = this.zza;
        if (zzcejVar != null) {
            zzcejVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcej
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcej
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzA(int i10) {
        this.zza.zzA(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzB(int i10) {
        this.zzb.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final void zzC(zzcfl zzcflVar) {
        this.zza.zzC(zzcflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcea
    public final zzfel zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfw
    public final zzauo zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final zzazj zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final zzber zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final zzcgb zzN() {
        return ((zzcfi) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfv
    public final zzcgd zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final zzeem zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final zzeeo zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfm
    public final zzfeo zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final zzffk zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final y9.a zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzW(zzfel zzfelVar, zzfeo zzfeoVar) {
        this.zza.zzW(zzfelVar, zzfeoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzZ(int i10) {
        this.zza.zzZ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(String str) {
        ((zzcfi) this.zza).zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaD(boolean z10, int i10) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaD)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaD(z10, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    public final /* synthetic */ void zzaI(boolean z10) {
        zzcej zzcejVar = this.zza;
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
        Objects.requireNonNull(zzcejVar);
        zzfVar.post(new zzcex(zzcejVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11) {
        this.zza.zzaJ(zzcVar, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaK(String str, String str2, int i10) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaL(boolean z10, int i10, boolean z11) {
        this.zza.zzaL(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaM(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zza.zzaM(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzaN(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zza.zzaN(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzab() {
        float f10;
        HashMap hashMap = new HashMap(3);
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        hashMap.put("app_muted", String.valueOf(zzuVar.f10558h.d()));
        hashMap.put("app_volume", String.valueOf(zzuVar.f10558h.a()));
        zzcfi zzcfiVar = (zzcfi) this.zza;
        AudioManager audioManager = (AudioManager) zzcfiVar.getContext().getSystemService("audio");
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume != 0) {
                f10 = streamVolume / streamMaxVolume;
                hashMap.put("device_volume", String.valueOf(f10));
                zzcfiVar.zzd("volume", hashMap);
            }
        }
        f10 = 0.0f;
        hashMap.put("device_volume", String.valueOf(f10));
        zzcfiVar.zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzac(boolean z10) {
        this.zza.zzac(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzae(String str, String str2, String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzag(String str, zzbix zzbixVar) {
        this.zza.zzag(str, zzbixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzah() {
        String str;
        zzeeo zzQ;
        zzeem zzP;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
        Resources zze = zzuVar.f10557g.zze();
        if (zze != null) {
            str = zze.getString(R.string.arg_res_0x7f13043f);
        } else {
            str = "Test Ad";
        }
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        zzbbn zzbbnVar = zzbbw.zzeC;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && (zzP = zzP()) != null) {
            zzP.zza(textView);
        } else if (((Boolean) zzbaVar.c.zza(zzbbw.zzeB)).booleanValue() && (zzQ = zzQ()) != null && zzQ.zzb()) {
            zzuVar.f10573w.zzg(zzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzai(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaj(zzcgd zzcgdVar) {
        this.zza.zzaj(zzcgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzak(zzazj zzazjVar) {
        this.zza.zzak(zzazjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzal(boolean z10) {
        this.zza.zzal(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzao(boolean z10) {
        this.zza.zzao(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzap(zzbep zzbepVar) {
        this.zza.zzap(zzbepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaq(boolean z10) {
        this.zza.zzaq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzar(zzber zzberVar) {
        this.zza.zzar(zzberVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzas(zzeem zzeemVar) {
        this.zza.zzas(zzeemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzat(zzeeo zzeeoVar) {
        this.zza.zzat(zzeeoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzau(int i10) {
        this.zza.zzau(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzav(boolean z10) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzaw(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzax(boolean z10) {
        this.zza.zzax(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzay(boolean z10) {
        this.zza.zzay(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzaz(String str, zzbix zzbixVar) {
        this.zza.zzaz(str, zzbixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        zzcej zzcejVar = this.zza;
        if (zzcejVar != null) {
            zzcejVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
        zzcej zzcejVar = this.zza;
        if (zzcejVar != null) {
            zzcejVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.ads.internal.zzm
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.ads.internal.zzm
    public final void zzdh() {
        this.zza.zzdh();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final String zzdi() {
        return this.zza.zzdi();
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzdp(zzaxv zzaxvVar) {
        this.zza.zzdp(zzaxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdx)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final int zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdx)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfq, com.google.android.gms.internal.ads.zzcbk
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final zzbci zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcfi) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final zzbcj zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfx, com.google.android.gms.internal.ads.zzcbk
    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final zzcaz zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final zzccv zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final zzcfl zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcbk
    public final void zzt(String str, zzccv zzccvVar) {
        this.zza.zzt(str, zzccvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzv(boolean z10, long j10) {
        this.zza.zzv(z10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzz(boolean z10) {
        this.zza.zzz(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcej, com.google.android.gms.internal.ads.zzcfy
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzy(int i10) {
    }
}
