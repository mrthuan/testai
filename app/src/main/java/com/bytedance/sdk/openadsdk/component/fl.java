package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.cJ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.Dww;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.aP;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGAppOpenAdImpl.java */
/* loaded from: classes.dex */
public class fl extends PAGAppOpenAd {
    private com.bytedance.sdk.openadsdk.apiImpl.ac.cJ CJ;
    private final Context Qhi;
    private final boolean ROR;
    private boolean Sf;

    /* renamed from: ac  reason: collision with root package name */
    private final AdSlot f8770ac;
    private final tP cJ;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8772hm;

    /* renamed from: fl  reason: collision with root package name */
    private final AtomicBoolean f8771fl = new AtomicBoolean(false);
    private final String Tgh = bxS.Qhi();

    public fl(Context context, tP tPVar, boolean z10, AdSlot adSlot) {
        this.Qhi = context;
        this.cJ = tPVar;
        this.ROR = z10;
        this.f8770ac = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        tP tPVar = this.cJ;
        if (tPVar != null && tPVar.Gy() != null) {
            try {
                return this.cJ.Gy().get(str);
            } catch (Throwable th2) {
                ABk.Qhi("TTAppOpenAdImpl", th2.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        tP tPVar = this.cJ;
        if (tPVar != null) {
            return tPVar.Gy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (!this.f8772hm) {
            aP.Qhi(this.cJ, d10, str, str2);
            this.f8772hm = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.CJ = new Tgh(pAGAppOpenAdInteractionCallback);
        Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.CJ = new Tgh(pAGAppOpenAdInteractionListener);
        Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        Context context;
        int i10;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        int i11 = 1;
        if (this.f8771fl.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            IPMiBroadcastReceiver.Qhi(this.Qhi, this.cJ);
            if (activity != null) {
                context = activity;
            } else {
                context = this.Qhi;
            }
            if (context == null) {
                context = HzH.Qhi();
            }
            try {
                i10 = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception unused) {
                i10 = 0;
            }
            Intent intent = new Intent(context, TTAppOpenAdActivity.class);
            intent.putExtra("orientation_angle", i10);
            if (!this.ROR) {
                i11 = 2;
            }
            intent.putExtra("ad_source", i11);
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.cJ.mZ().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.Tgh);
            } else {
                Dww.Qhi().Tgh();
                Dww.Qhi().Qhi(this.cJ);
                Dww.Qhi().Qhi(this.CJ);
                this.CJ = null;
            }
            intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
            com.bytedance.sdk.component.utils.cJ.Qhi(context, intent, new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.fl.2
                @Override // com.bytedance.sdk.component.utils.cJ.Qhi
                public void Qhi() {
                }

                @Override // com.bytedance.sdk.component.utils.cJ.Qhi
                public void Qhi(Throwable th2) {
                }
            });
            iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.fl.3
                @Override // java.lang.Runnable
                public void run() {
                    if (fl.this.f8770ac != null) {
                        try {
                            if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CQU(fl.this.f8770ac.getCodeId()) == 1) {
                                ROR Qhi = ROR.Qhi(fl.this.Qhi);
                                Qhi.ROR(Integer.parseInt(fl.this.f8770ac.getCodeId()));
                                Qhi.Qhi(fl.this.f8770ac);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
            return;
        }
        ABk.Qhi("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
        throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.Sf) {
            aP.Qhi(this.cJ, d10);
            this.Sf = true;
        }
    }

    private void Qhi() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            lG.ac(new hm("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.fl.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager asInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.Qhi Qhi = com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi();
                    if (fl.this.CJ != null && (asInterface = IListenerManager.Stub.asInterface(Qhi.Qhi(7))) != null) {
                        try {
                            asInterface.registerAppOpenAdListener(fl.this.Tgh, new com.bytedance.sdk.openadsdk.multipro.aidl.cJ.Qhi(fl.this.CJ));
                            fl.this.CJ = null;
                        } catch (RemoteException e10) {
                            ABk.Qhi("TTAppOpenAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
