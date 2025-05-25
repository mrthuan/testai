package com.google.ads.mediation.inmobi;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class InMobiInitializer implements SdkInitializationListener {
    public static final int INITIALIZED = 2;
    public static final int INITIALIZING = 1;
    public static final int UNINITIALIZED = 0;
    private static InMobiInitializer instance;
    private final InMobiSdkWrapper inMobiSdkWrapper;
    int initializationStatus;
    final ArrayList<Listener> listeners;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface InitializationStatus {
    }

    /* loaded from: classes.dex */
    public interface Listener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    private InMobiInitializer() {
        this.listeners = new ArrayList<>();
        this.initializationStatus = 0;
        this.inMobiSdkWrapper = new InMobiSdkWrapper();
    }

    public static InMobiInitializer getInstance() {
        if (instance == null) {
            instance = new InMobiInitializer();
        }
        return instance;
    }

    public void init(Context context, String str, Listener listener) {
        if (this.initializationStatus == 2) {
            listener.onInitializeSuccess();
            return;
        }
        this.listeners.add(listener);
        if (this.initializationStatus == 1) {
            return;
        }
        this.initializationStatus = 1;
        this.inMobiSdkWrapper.init(context, str, InMobiConsent.getConsentObj(), this);
    }

    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(Error error) {
        if (error == null) {
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            this.initializationStatus = 2;
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onInitializeSuccess();
            }
        } else {
            this.initializationStatus = 0;
            AdError createAdapterError = InMobiConstants.createAdapterError(101, error.getLocalizedMessage());
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onInitializeError(createAdapterError);
            }
        }
        this.listeners.clear();
    }

    public InMobiInitializer(InMobiSdkWrapper inMobiSdkWrapper) {
        this.listeners = new ArrayList<>();
        this.initializationStatus = 0;
        this.inMobiSdkWrapper = inMobiSdkWrapper;
    }
}
