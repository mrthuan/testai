package com.google.ads.mediation.pangle;

/* loaded from: classes.dex */
public class PanglePrivacyConfig {
    private static int coppa = -1;
    private final PangleSdkWrapper pangleSdkWrapper;

    public PanglePrivacyConfig(PangleSdkWrapper pangleSdkWrapper) {
        this.pangleSdkWrapper = pangleSdkWrapper;
    }

    public static int getCoppa() {
        return coppa;
    }

    public void setCoppa(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.pangleSdkWrapper.isInitSuccess()) {
                    this.pangleSdkWrapper.setChildDirected(-1);
                }
                coppa = -1;
                return;
            }
            if (this.pangleSdkWrapper.isInitSuccess()) {
                this.pangleSdkWrapper.setChildDirected(1);
            }
            coppa = 1;
            return;
        }
        if (this.pangleSdkWrapper.isInitSuccess()) {
            this.pangleSdkWrapper.setChildDirected(0);
        }
        coppa = 0;
    }
}
