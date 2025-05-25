package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class UnifiedNativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private NativeAd.Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private VideoController zzj;
    private boolean zzk;
    private View zzl;
    private View zzm;
    private Object zzn;
    private Bundle zzo = new Bundle();
    private boolean zzp;
    private boolean zzq;
    private float zzr;

    public View getAdChoicesContent() {
        return this.zzl;
    }

    public final String getAdvertiser() {
        return this.zzf;
    }

    public final String getBody() {
        return this.zzc;
    }

    public final String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.zzo;
    }

    public final String getHeadline() {
        return this.zza;
    }

    public final NativeAd.Image getIcon() {
        return this.zzd;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzr;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzq;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzp;
    }

    public final String getPrice() {
        return this.zzi;
    }

    public final Double getStarRating() {
        return this.zzg;
    }

    public final String getStore() {
        return this.zzh;
    }

    public boolean hasVideoContent() {
        return this.zzk;
    }

    public void setAdChoicesContent(View view) {
        this.zzl = view;
    }

    public final void setAdvertiser(String str) {
        this.zzf = str;
    }

    public final void setBody(String str) {
        this.zzc = str;
    }

    public final void setCallToAction(String str) {
        this.zze = str;
    }

    public final void setExtras(Bundle bundle) {
        this.zzo = bundle;
    }

    public void setHasVideoContent(boolean z10) {
        this.zzk = z10;
    }

    public final void setHeadline(String str) {
        this.zza = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzd = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzb = list;
    }

    public void setMediaContentAspectRatio(float f10) {
        this.zzr = f10;
    }

    public void setMediaView(View view) {
        this.zzm = view;
    }

    public final void setOverrideClickHandling(boolean z10) {
        this.zzq = z10;
    }

    public final void setOverrideImpressionRecording(boolean z10) {
        this.zzp = z10;
    }

    public final void setPrice(String str) {
        this.zzi = str;
    }

    public final void setStarRating(Double d10) {
        this.zzg = d10;
    }

    public final void setStore(String str) {
        this.zzh = str;
    }

    public final View zza() {
        return this.zzm;
    }

    public final VideoController zzb() {
        return this.zzj;
    }

    public final Object zzc() {
        return this.zzn;
    }

    public final void zzd(Object obj) {
        this.zzn = obj;
    }

    public final void zze(VideoController videoController) {
        this.zzj = videoController;
    }

    public void recordImpression() {
    }

    public void handleClick(View view) {
    }

    public void untrackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }
}
