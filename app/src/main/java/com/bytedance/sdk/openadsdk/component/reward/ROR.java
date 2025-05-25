package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.cJ;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.Dww;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.aP;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGInterstitialAdImpl.java */
/* loaded from: classes.dex */
class ROR extends PAGInterstitialAd {
    private final Context Qhi;
    private boolean Sf;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ f8833ac;
    private final com.bytedance.sdk.openadsdk.core.model.Qhi cJ;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8835hm;

    /* renamed from: fl  reason: collision with root package name */
    private final AtomicBoolean f8834fl = new AtomicBoolean(false);
    private boolean Tgh = false;
    private boolean CJ = false;
    private final String ROR = bxS.Qhi();

    public ROR(Context context, com.bytedance.sdk.openadsdk.core.model.Qhi qhi) {
        this.Qhi = context;
        this.cJ = qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.Qhi qhi = this.cJ;
        if (qhi != null && qhi.fl() != null && this.cJ.fl().Gy() != null) {
            try {
                return this.cJ.fl().Gy().get(str);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTFullScreenVideoAdImpl", th2.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.Qhi qhi = this.cJ;
        if (qhi != null && qhi.fl() != null) {
            return this.cJ.fl().Gy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (!this.f8835hm) {
            aP.Qhi(this.cJ.fl(), d10, str, str2);
            this.f8835hm = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.f8833ac = new com.bytedance.sdk.openadsdk.component.ac.Qhi(pAGInterstitialAdInteractionCallback);
        Qhi(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.f8833ac = new com.bytedance.sdk.openadsdk.component.ac.Qhi(pAGInterstitialAdInteractionListener);
        Qhi(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        Context context;
        Intent intent;
        Intent intent2;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.Qhi qhi = this.cJ;
        if (qhi != null && qhi.CJ()) {
            boolean Tgh = this.cJ.Tgh();
            final tP fl2 = this.cJ.fl();
            if (com.bykv.vk.openvk.component.video.Qhi.ac.Qhi.cJ()) {
                List<tP> ac2 = this.cJ.ac();
                if (ac2 != null) {
                    for (tP tPVar : ac2) {
                        IPMiBroadcastReceiver.Qhi(this.Qhi, tPVar);
                    }
                }
                if (this.f8834fl.get()) {
                    return;
                }
                this.f8834fl.set(true);
                if (fl2 != null && (fl2.FQ() != null || fl2.cjC() != null)) {
                    if (activity == null) {
                        context = this.Qhi;
                    } else {
                        context = activity;
                    }
                    if (context == null) {
                        context = HzH.Qhi();
                    }
                    if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().gT()) {
                        intent = new Intent(context, TTAdActivity.class);
                    } else {
                        if (Tgh) {
                            intent2 = new Intent(context, TTFullScreenExpressVideoActivity.class);
                        } else if (Qhi(fl2)) {
                            if (com.bytedance.sdk.openadsdk.component.reward.cJ.hm.Qhi(fl2)) {
                                intent = new Intent(context, TTInterstitialExpressActivity.class);
                            } else {
                                intent2 = new Intent(context, TTFullScreenExpressVideoActivity.class);
                            }
                        } else if (com.bytedance.sdk.openadsdk.component.reward.cJ.hm.Qhi(fl2)) {
                            intent = new Intent(context, TTInterstitialActivity.class);
                        } else {
                            intent = new Intent(context, TTFullScreenVideoActivity.class);
                        }
                        intent = intent2;
                    }
                    intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(intent, activity, this.CJ, this.cJ, this.ROR);
                    intent.putExtra("is_verity_playable", this.Tgh);
                    if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                        Dww.Qhi().Qhi(this.f8833ac);
                        this.f8833ac = null;
                    }
                    com.bytedance.sdk.component.utils.cJ.Qhi(context, intent, new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.ROR.1
                        @Override // com.bytedance.sdk.component.utils.cJ.Qhi
                        public void Qhi() {
                            if (ROR.this.Tgh) {
                                try {
                                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi(fl2.FQ().zc());
                                } catch (Throwable unused) {
                                }
                            }
                        }

                        @Override // com.bytedance.sdk.component.utils.cJ.Qhi
                        public void Qhi(Throwable th2) {
                            com.bytedance.sdk.component.utils.ABk.Qhi("TTFullScreenVideoAdImpl", "show full screen video error: ", th2);
                            if (ROR.this.Tgh) {
                                try {
                                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi(fl2.FQ().zc(), -1, th2 != null ? th2.getMessage() : "playable tool error open");
                                } catch (Throwable unused) {
                                }
                            }
                            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(fl2, "fullscreen_interstitial_ad", "activity start  fail ");
                        }
                    });
                    if (!Tgh) {
                        Qhi.Qhi(this.cJ.fl(), this.CJ, false);
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(fl2, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(fl2, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.ABk.Qhi("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.Sf) {
            aP.Qhi(this.cJ.fl(), d10);
            this.Sf = true;
        }
    }

    public void Qhi(boolean z10) {
        this.Tgh = z10;
    }

    public void Qhi() {
        if (this.f8834fl.get()) {
            return;
        }
        this.CJ = true;
    }

    private static boolean Qhi(tP tPVar) {
        if (tPVar == null) {
            return false;
        }
        int hpZ = tPVar.hpZ();
        return (tPVar.EBS() != 2 || hpZ == 5 || hpZ == 33 || hpZ == 6 || hpZ == 19 || hpZ == 12) ? false : true;
    }

    private void Qhi(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            lG.ac(new com.bytedance.sdk.component.Sf.hm("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.ROR.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Qhi Qhi = com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi();
                    if (i10 == 1 && ROR.this.f8833ac != null) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.cJ.ac acVar = new com.bytedance.sdk.openadsdk.multipro.aidl.cJ.ac(ROR.this.f8833ac);
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(Qhi.Qhi(1));
                        if (asInterface != null) {
                            try {
                                asInterface.registerFullVideoListener(ROR.this.ROR, acVar);
                            } catch (RemoteException e10) {
                                com.bytedance.sdk.component.utils.ABk.Qhi("TTFullScreenVideoAdImpl", e10.getMessage());
                            }
                        }
                    }
                }
            }, 5);
        }
    }
}
