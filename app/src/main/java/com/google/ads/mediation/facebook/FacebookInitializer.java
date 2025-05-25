package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class FacebookInitializer implements AudienceNetworkAds.InitListener {
    private static FacebookInitializer instance;
    private boolean isInitializing = false;
    private boolean isInitialized = false;
    private final ArrayList<Listener> listeners = new ArrayList<>();

    /* loaded from: classes.dex */
    public interface Listener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    private FacebookInitializer() {
    }

    public static FacebookInitializer getInstance() {
        if (instance == null) {
            instance = new FacebookInitializer();
        }
        return instance;
    }

    public void initialize(Context context, String str, Listener listener) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        getInstance().initialize(context, arrayList, listener);
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.isInitializing = false;
        this.isInitialized = initResult.isSuccess();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            Listener next = it.next();
            if (initResult.isSuccess()) {
                next.onInitializeSuccess();
            } else {
                next.onInitializeError(new AdError(104, initResult.getMessage(), "com.google.ads.mediation.facebook", null));
            }
        }
        this.listeners.clear();
    }

    public void initialize(Context context, ArrayList<String> arrayList, Listener listener) {
        if (this.isInitializing) {
            this.listeners.add(listener);
        } else if (this.isInitialized) {
            listener.onInitializeSuccess();
        } else {
            this.isInitializing = true;
            getInstance().listeners.add(listener);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.18.0.0").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }
}
