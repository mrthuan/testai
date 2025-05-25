// Auto-fixed: added missing class declaration
public class AdFormat {
package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);
    
    private final int zzb;

    AdFormat(int i10) {
        this.zzb = i10;
    }

    public int getValue() {
        return this.zzb;
    }
}

}
