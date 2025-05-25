package com.google.ads.mediation.pangle;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class PangleInitializer implements PAGSdk.PAGInitCallback {
    private static PangleInitializer instance;
    private final ArrayList<Listener> initListeners;
    private boolean isInitialized;
    private boolean isInitializing;
    private final PangleFactory pangleFactory;
    private final PangleSdkWrapper pangleSdkWrapper;

    /* loaded from: classes.dex */
    public interface Listener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    private PangleInitializer() {
        this.isInitializing = false;
        this.isInitialized = false;
        this.initListeners = new ArrayList<>();
        this.pangleSdkWrapper = new PangleSdkWrapper();
        this.pangleFactory = new PangleFactory();
    }

    public static PangleInitializer getInstance() {
        if (instance == null) {
            instance = new PangleInitializer();
        }
        return instance;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void fail(int i10, String str) {
        this.isInitializing = false;
        this.isInitialized = false;
        AdError createSdkError = PangleConstants.createSdkError(i10, str);
        Iterator<Listener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeError(createSdkError);
        }
        this.initListeners.clear();
    }

    public void initialize(Context context, String str, Listener listener) {
        if (TextUtils.isEmpty(str)) {
            AdError createAdapterError = PangleConstants.createAdapterError(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            createAdapterError.toString();
            listener.onInitializeError(createAdapterError);
        } else if (this.isInitializing) {
            this.initListeners.add(listener);
        } else if (this.isInitialized) {
            listener.onInitializeSuccess();
        } else {
            this.isInitializing = true;
            this.initListeners.add(listener);
            this.pangleSdkWrapper.init(context, this.pangleFactory.createPAGConfigBuilder().appId(str).setChildDirected(PanglePrivacyConfig.getCoppa()).setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setDoNotSell(PangleMediationAdapter.getDoNotSell()).setUserData(String.format("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"%s\"}]", BuildConfig.ADAPTER_VERSION)).build(), this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void success() {
        this.isInitializing = false;
        this.isInitialized = true;
        Iterator<Listener> it = this.initListeners.iterator();
        while (it.hasNext()) {
            it.next().onInitializeSuccess();
        }
        this.initListeners.clear();
    }

    public PangleInitializer(PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory) {
        this.isInitializing = false;
        this.isInitialized = false;
        this.initListeners = new ArrayList<>();
        this.pangleSdkWrapper = pangleSdkWrapper;
        this.pangleFactory = pangleFactory;
    }
}
