package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.cJ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
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

/* compiled from: PAGRewardVideoAdImpl.java */
/* loaded from: classes.dex */
class hm extends PAGRewardedAd {
    private com.bytedance.sdk.openadsdk.apiImpl.CJ.ac CJ;
    private final Context Qhi;
    private boolean Sf;

    /* renamed from: ac  reason: collision with root package name */
    private final AdSlot f8863ac;
    private final com.bytedance.sdk.openadsdk.core.model.Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8864fl;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8865hm;
    private final AtomicBoolean Tgh = new AtomicBoolean(false);
    private final String ROR = bxS.Qhi();

    public hm(Context context, com.bytedance.sdk.openadsdk.core.model.Qhi qhi, AdSlot adSlot) {
        this.Qhi = context;
        this.cJ = qhi;
        this.f8863ac = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.Qhi qhi = this.cJ;
        if (qhi != null && qhi.fl() != null && this.cJ.fl().Gy() != null) {
            try {
                return this.cJ.fl().Gy().get(str);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTRewardVideoAdImpl", th2.getMessage());
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
        if (!this.f8865hm) {
            aP.Qhi(this.cJ.fl(), d10, str, str2);
            this.f8865hm = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.CJ = new WAv(pAGRewardedAdInteractionCallback);
        Qhi(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.CJ = new WAv(pAGRewardedAdInteractionListener);
        Qhi(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        Context context;
        Intent intent;
        Intent intent2;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
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
                if (!this.Tgh.compareAndSet(false, true)) {
                    return;
                }
                if (fl2 != null && fl2.FQ() != null) {
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
                            intent2 = new Intent(context, TTRewardExpressVideoActivity.class);
                        } else if (Qhi(fl2)) {
                            intent2 = new Intent(context, TTRewardExpressVideoActivity.class);
                        } else {
                            intent = new Intent(context, TTRewardVideoActivity.class);
                        }
                        intent = intent2;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(intent, activity, this.f8864fl, this.cJ, this.ROR);
                    intent.putExtra("media_extra", this.f8863ac.getMediaExtra());
                    intent.putExtra("user_id", this.f8863ac.getUserID());
                    intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                    if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                        Dww.Qhi().Qhi(this.CJ);
                        this.CJ = null;
                    }
                    com.bytedance.sdk.component.utils.cJ.Qhi(context, intent, new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.hm.1
                        @Override // com.bytedance.sdk.component.utils.cJ.Qhi
                        public void Qhi() {
                        }

                        @Override // com.bytedance.sdk.component.utils.cJ.Qhi
                        public void Qhi(Throwable th2) {
                            com.bytedance.sdk.component.utils.ABk.Qhi("TTRewardVideoAdImpl", "show reward video error: ", th2);
                            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(fl2, "fullscreen_interstitial_ad", "activity start  fail ");
                        }
                    });
                    if (!Tgh) {
                        Qhi.Qhi(this.cJ.fl(), this.f8864fl, true);
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(fl2, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(fl2, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.ABk.Qhi("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.Sf) {
            aP.Qhi(this.cJ.fl(), d10);
            this.Sf = true;
        }
    }

    public void Qhi() {
        if (this.Tgh.get()) {
            return;
        }
        this.f8864fl = true;
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
            lG.ac(new com.bytedance.sdk.component.Sf.hm("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.hm.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Qhi Qhi = com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi();
                    if (i10 == 0 && hm.this.CJ != null) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.cJ.fl flVar = new com.bytedance.sdk.openadsdk.multipro.aidl.cJ.fl(hm.this.CJ);
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(Qhi.Qhi(0));
                        if (asInterface != null) {
                            try {
                                asInterface.registerRewardVideoListener(hm.this.ROR, flVar);
                            } catch (RemoteException e10) {
                                com.bytedance.sdk.component.utils.ABk.Qhi("TTRewardVideoAdImpl", e10.getMessage());
                            }
                        }
                    }
                }
            }, 5);
        }
    }
}
