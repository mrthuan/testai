package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzdw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final zzdw f10003a;

    public AbstractAdRequestBuilder() {
        zzdw zzdwVar = new zzdw();
        this.f10003a = zzdwVar;
        zzdwVar.f10127d.add("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final AbstractAdRequestBuilder a(Bundle bundle) {
        zzdw zzdwVar = this.f10003a;
        zzdwVar.getClass();
        zzdwVar.f10126b.putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzdwVar.f10127d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (AdRequest.Builder) this;
    }
}
