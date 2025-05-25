package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.model.Gm;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.media.C1646h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import u.b;
import u.d;
import u.k;
import u.l;
import u.n;

/* loaded from: classes.dex */
public class AdActAction {
    private String CJ;
    private l ROR;
    private ActServiceConnection Sf;

    /* renamed from: ac  reason: collision with root package name */
    private tP f8988ac;
    private Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f8989fl;
    private BindCustomTabsServiceCallback hpZ;
    private Long pA;
    private d Tgh = null;

    /* renamed from: hm  reason: collision with root package name */
    private boolean f8990hm = false;
    private boolean WAv = false;
    private boolean Gm = false;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f8991zc = false;
    private boolean ABk = false;
    private long iMK = 0;
    private cJ HzH = new cJ() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1
        @Override // com.bytedance.sdk.openadsdk.core.act.cJ
        public void Qhi(final d dVar) {
            if (!lG.fl()) {
                lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdActAction.this.Qhi(dVar);
                    }
                });
            } else {
                AdActAction.this.Qhi(dVar);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.act.cJ
        public void Qhi() {
            AdActAction.this.Tgh = null;
            AdActAction.this.Sf = null;
            AdActAction.this.ROR = null;
        }
    };
    public n Qhi = new PAGEngagementSignalsCallback();
    private b kYc = new PAGCustomTabsCallback();

    /* loaded from: classes.dex */
    public interface BindCustomTabsServiceCallback {
        void onBindFail(int i10, String str);

        void onBindSuccess(l lVar);
    }

    /* loaded from: classes.dex */
    public class PAGCustomTabsCallback extends b {
        public PAGCustomTabsCallback() {
        }

        @Override // u.b
        public void onNavigationEvent(int i10, Bundle bundle) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6) {
                            AdActAction.this.Qhi();
                            if (!AdActAction.this.ABk && AdActAction.this.f8988ac != null && !AdActAction.this.Gm && !AdActAction.this.WAv && AdActAction.this.pA != null) {
                                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(AdActAction.this.f8988ac, js.Qhi(AdActAction.this.f8988ac), SystemClock.elapsedRealtime() - AdActAction.this.pA.longValue(), 0, 1);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!AdActAction.this.Gm && AdActAction.this.f8988ac != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("render_type", "h5");
                            jSONObject.putOpt("render_type_2", 0);
                            jSONObject.put(InMobiNetworkValues.URL, AdActAction.this.f8989fl);
                            jSONObject.put("preload_h5_type", AdActAction.this.f8988ac.jN());
                            AdActAction.this.Qhi("load_fail", jSONObject, 0L);
                            AdActAction.this.Gm = true;
                            return;
                        } catch (Throwable th2) {
                            ABk.Qhi("AdActAction", th2.getMessage());
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!AdActAction.this.WAv && AdActAction.this.pA != null && AdActAction.this.f8988ac != null) {
                    long longValue = AdActAction.this.pA.longValue() - SystemClock.elapsedRealtime();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("first_page", true);
                        jSONObject2.putOpt("render_type", "h5");
                        jSONObject2.putOpt("render_type_2", 0);
                        jSONObject2.put(InMobiNetworkValues.URL, AdActAction.this.f8989fl);
                        jSONObject2.put("preload_h5_type", AdActAction.this.f8988ac.jN());
                        AdActAction.this.Qhi("load_finish", jSONObject2, longValue);
                        AdActAction.this.WAv = true;
                        return;
                    } catch (Throwable th3) {
                        ABk.Qhi("AdActAction", th3.getMessage());
                        return;
                    }
                } else {
                    return;
                }
            }
            AdActAction.this.pA = Long.valueOf(SystemClock.elapsedRealtime());
            if (!AdActAction.this.f8991zc && AdActAction.this.f8988ac != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.putOpt("render_type", "h5");
                    jSONObject3.putOpt("render_type_2", 0);
                    AdActAction.this.Qhi("load_start", jSONObject3, 0L);
                    AdActAction.this.f8991zc = true;
                } catch (Throwable th4) {
                    ABk.Qhi("AdActAction", th4.getMessage());
                }
            }
        }
    }

    public AdActAction(Context context, tP tPVar, String str, String str2) {
        this.cJ = context;
        this.f8988ac = tPVar;
        this.CJ = str;
        this.f8989fl = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(d dVar) {
        this.Tgh = dVar;
        this.ROR = dVar.b(this.kYc);
        com.bytedance.sdk.openadsdk.Gm.Qhi.cJ Qhi = Qhi(9);
        try {
            l lVar = this.ROR;
            Bundle bundle = Bundle.EMPTY;
            lVar.getClass();
            try {
                if (lVar.f30108b.b0(lVar.c, bundle)) {
                    l lVar2 = this.ROR;
                    n nVar = this.Qhi;
                    lVar2.getClass();
                    try {
                        boolean w02 = lVar2.f30108b.w0(lVar2.c, new k(nVar), bundle);
                        Qhi.ac(1);
                        Qhi.Qhi(1);
                        if (w02) {
                            Qhi.CJ(1);
                            Qhi.cJ(1);
                        } else {
                            Qhi.cJ(0);
                        }
                    } catch (SecurityException e10) {
                        throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
                    }
                } else {
                    Qhi.ac(0);
                    Qhi.Qhi(0);
                }
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi);
                BindCustomTabsServiceCallback bindCustomTabsServiceCallback = this.hpZ;
                if (bindCustomTabsServiceCallback != null) {
                    bindCustomTabsServiceCallback.onBindSuccess(this.ROR);
                }
            } catch (SecurityException e11) {
                throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e11);
            }
        } catch (Throwable th2) {
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.hpZ;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(11, th2.getMessage());
            }
        }
    }

    public void Qhi(BindCustomTabsServiceCallback bindCustomTabsServiceCallback) {
        this.hpZ = bindCustomTabsServiceCallback;
        if (this.cJ == null || this.f8988ac == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(8));
            String Qhi = Qhi.Qhi(this.cJ);
            if (Qhi == null) {
                return;
            }
            ActServiceConnection actServiceConnection = new ActServiceConnection(this.HzH);
            this.Sf = actServiceConnection;
            d.a(this.cJ, Qhi, actServiceConnection);
        } catch (Throwable th2) {
            String message = th2.getMessage();
            ABk.Qhi("AdActAction", message);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.hpZ;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(10, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi() {
        try {
            ActServiceConnection actServiceConnection = this.Sf;
            if (actServiceConnection == null) {
                return;
            }
            this.cJ.unbindService(actServiceConnection);
            this.Tgh = null;
            this.ROR = null;
            this.Sf = null;
        } catch (Throwable th2) {
            ABk.Qhi("AdActAction", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(String str, final JSONObject jSONObject, final long j10) {
        if (this.f8988ac == null || TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        tP tPVar = this.f8988ac;
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(currentTimeMillis, tPVar, js.Qhi(tPVar), str, new com.bytedance.sdk.openadsdk.Gm.ac.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.2
            @Override // com.bytedance.sdk.openadsdk.Gm.ac.Qhi
            public JSONObject Qhi() {
                JSONObject jSONObject2;
                Throwable th2;
                int i10;
                try {
                    JSONObject jSONObject3 = jSONObject;
                    int i11 = 1;
                    if (bxS.cJ(AdActAction.this.f8988ac)) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    jSONObject3.put("is_playable", i10);
                    JSONObject jSONObject4 = jSONObject;
                    if (!com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(AdActAction.this.f8988ac)) {
                        i11 = 0;
                    }
                    jSONObject4.put("usecache", i11);
                    jSONObject2 = new JSONObject();
                } catch (Throwable th3) {
                    jSONObject2 = null;
                    th2 = th3;
                }
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    long j11 = j10;
                    if (j11 > 0) {
                        jSONObject2.put("duration", j11);
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    ABk.Qhi("AdActAction", th2.getMessage());
                    return jSONObject2;
                }
                return jSONObject2;
            }
        });
    }

    private com.bytedance.sdk.openadsdk.Gm.Qhi.cJ Qhi(int i10) {
        com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJVar = new com.bytedance.sdk.openadsdk.Gm.Qhi.cJ();
        cJVar.Qhi(this.CJ);
        cJVar.Qhi(this.f8988ac);
        cJVar.cJ(js.Qhi(this.f8988ac));
        cJVar.Qhi(i10);
        cJVar.Qhi(false);
        cJVar.cJ(8);
        return cJVar;
    }

    /* loaded from: classes.dex */
    public class PAGEngagementSignalsCallback implements n {
        public PAGEngagementSignalsCallback() {
        }

        @Override // u.n
        public void onVerticalScrollEvent(boolean z10, Bundle bundle) {
            int i10;
            AdActAction.this.iMK = System.currentTimeMillis();
            if (AdActAction.this.f8988ac != null && !AdActAction.this.f8990hm) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(InMobiNetworkValues.URL, AdActAction.this.f8989fl);
                    jSONObject.put("down_time", AdActAction.this.iMK);
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject.put("up_time", currentTimeMillis);
                    com.bytedance.sdk.openadsdk.cJ.ac.cJ(AdActAction.this.f8988ac, js.Qhi(AdActAction.this.f8988ac), "in_web_click", jSONObject, currentTimeMillis - AdActAction.this.iMK);
                } catch (Throwable th2) {
                    ABk.Qhi("AdActAction", th2.getMessage());
                }
                if (!TextUtils.isEmpty(tP.Qhi(AdActAction.this.cJ, AdActAction.this.f8988ac))) {
                    Gm.Qhi Qhi = new Gm.Qhi().cJ(AdActAction.this.iMK).Qhi(System.currentTimeMillis());
                    if (hm.cJ().Qhi()) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(C1646h.CLICK_BEACON, AdActAction.this.f8988ac, Qhi.cJ(i10).ac(zn.ROR(AdActAction.this.cJ)).Qhi(zn.fl(AdActAction.this.cJ)).cJ(zn.Tgh(AdActAction.this.cJ)).Qhi(), js.Qhi(AdActAction.this.f8988ac), true, (Map<String, Object>) new HashMap(), 2);
                }
                AdActAction.this.f8990hm = true;
            }
        }

        @Override // u.n
        public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
        }

        @Override // u.n
        public void onSessionEnded(boolean z10, Bundle bundle) {
        }
    }
}
