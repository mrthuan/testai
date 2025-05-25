package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.ac.cJ;
import com.bytedance.sdk.openadsdk.component.reward.ABk;
import com.bytedance.sdk.openadsdk.component.reward.Gm;
import com.bytedance.sdk.openadsdk.component.reward.Sf;
import com.bytedance.sdk.openadsdk.component.reward.Tgh;

/* loaded from: classes.dex */
public class TTC3Proxy {
    public static void a(Context context) {
        try {
            ABk.Qhi(context).Qhi();
        } catch (Throwable unused) {
        }
        try {
            Tgh.Qhi(context).Qhi();
        } catch (Throwable unused2) {
        }
    }

    public static void loadFull(Context context, AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        adSlot.setDurationSlotType(8);
        Tgh.Qhi(context).Qhi(adSlot, new cJ(pAGInterstitialAdLoadListener));
    }

    public static void loadReward(Context context, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        adSlot.setDurationSlotType(7);
        ABk.Qhi(context).Qhi(adSlot, new Sf(pAGRewardedAdLoadListener));
    }

    public static void verityPlayable(String str, int i10, String str2, String str3, String str4) {
        Gm.Qhi(str, i10, str2, str3, str4);
    }
}
