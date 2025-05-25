package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.Dww;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.bxS;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.Jma;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements CQU.Qhi {
    private static com.bytedance.sdk.openadsdk.apiImpl.ac.cJ Sf;
    private int CQU;
    private IListenerManager EBS;
    private FrameLayout Eh;
    private TTAdDislikeDialog Gm;
    private float HzH;
    private String MQ;
    private com.bytedance.sdk.openadsdk.component.ac NFd;
    private com.bytedance.sdk.openadsdk.component.Tgh.cJ WAv;
    private boolean aP;
    private com.bytedance.sdk.openadsdk.apiImpl.ac.cJ bxS;
    private float hpZ;
    private boolean kYc;
    private Sf pA;
    private int pM;
    private tP qMt;
    private AdSlot sDy;
    private int tP;

    /* renamed from: zc  reason: collision with root package name */
    private TTAdDislikeToast f8529zc;
    protected final AtomicBoolean Qhi = new AtomicBoolean(false);
    protected final CQU cJ = new CQU(Looper.getMainLooper(), this);

    /* renamed from: ac  reason: collision with root package name */
    final AtomicBoolean f8526ac = new AtomicBoolean(false);
    final AtomicBoolean CJ = new AtomicBoolean(false);

    /* renamed from: hm  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.Sf.Qhi f8528hm = new com.bytedance.sdk.openadsdk.component.Sf.Qhi();

    /* renamed from: fl  reason: collision with root package name */
    protected boolean f8527fl = false;
    private final AtomicBoolean ABk = new AtomicBoolean(false);
    private Jma iMK = Jma.cJ();
    private final AtomicBoolean Dww = new AtomicBoolean(false);
    long Tgh = 0;
    private volatile boolean lB = false;
    private final com.bytedance.sdk.openadsdk.component.Qhi lG = new com.bytedance.sdk.openadsdk.component.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.Qhi
        public void CJ() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi, com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
        public void Qhi() {
            TTAppOpenAdActivity.this.tP();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi
        public void ac() {
            TTAppOpenAdActivity.this.Tgh();
            TTAppOpenAdActivity.this.iMK.CJ();
            TTAppOpenAdActivity.this.hpZ();
            if (TTAppOpenAdActivity.this.kYc) {
                TTAppOpenAdActivity.this.Gm();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi, com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
        public void cJ(long j10, int i10) {
            StringBuilder sb2 = new StringBuilder("onError() called with: totalPlayTime = [");
            sb2.append(j10);
            sb2.append("], percent = [");
            sb2.append(i10);
            sb2.append("]");
            TTAppOpenAdActivity.this.tP();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi
        public void fl() {
            TTAppOpenAdActivity.this.kYc();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi, com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
        public void Qhi(long j10, long j11) {
            TTAppOpenAdActivity.this.f8528hm.Qhi(j10);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.f8527fl && tTAppOpenAdActivity.NFd != null && TTAppOpenAdActivity.this.NFd.fl() != null && TTAppOpenAdActivity.this.NFd.fl().cJ()) {
                TTAppOpenAdActivity.this.NFd.fl().CJ();
            }
            TTAppOpenAdActivity.this.zc();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi, com.bytedance.sdk.openadsdk.component.Tgh.Qhi
        public void cJ(View view) {
            TTAppOpenAdActivity.this.Qhi();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi, com.bytedance.sdk.openadsdk.component.Tgh.Qhi
        public void cJ() {
            TTAppOpenAdActivity.this.lB = true;
            if (com.bytedance.sdk.openadsdk.HzH.Qhi.Qhi("splash_auto_close_switch", 0) == 0) {
                if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                    if (TTAppOpenAdActivity.this.bxS != null) {
                        TTAppOpenAdActivity.this.bxS.ac();
                    }
                } else {
                    TTAppOpenAdActivity.this.Qhi("onAdTimeOver");
                }
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi, com.bytedance.sdk.openadsdk.component.Tgh.Qhi
        public void Qhi(View view) {
            TTAppOpenAdActivity.this.MQ();
        }

        @Override // com.bytedance.sdk.openadsdk.component.Qhi, com.bytedance.sdk.openadsdk.component.Tgh.Qhi
        public void Qhi(int i10, int i11, boolean z10) {
            if (TTAppOpenAdActivity.this.NFd != null) {
                TTAppOpenAdActivity.this.NFd.Qhi(i10, i11, z10);
            }
        }
    };
    private final Runnable Jma = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            String str;
            int i10;
            if (TTAppOpenAdActivity.this.ABk.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.qMt != null && TTAppOpenAdActivity.this.qMt.IC() && TTAppOpenAdActivity.this.qMt.cJP() != null && TTAppOpenAdActivity.this.qMt.cJP().Qhi() != null) {
                TTAppOpenAdActivity.this.qMt.cJP().Qhi().Qhi(0L);
            }
            TTAppOpenAdActivity.this.pA = new Sf();
            TTAppOpenAdActivity.this.pA.Qhi(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.iMK.CJ();
            if (TTAppOpenAdActivity.this.WAv != null) {
                TTAppOpenAdActivity.this.WAv.cJ();
            }
            TTAppOpenAdActivity.this.HzH();
            View findViewById = TTAppOpenAdActivity.this.findViewById(16908290);
            JSONObject jSONObject = new JSONObject();
            if (findViewById != null) {
                try {
                    jSONObject.put(InMobiNetworkValues.WIDTH, findViewById.getWidth());
                    jSONObject.put(InMobiNetworkValues.HEIGHT, findViewById.getHeight());
                    jSONObject.put("alpha", findViewById.getAlpha());
                } catch (JSONException unused) {
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.CQU);
            if (TTAppOpenAdActivity.this.kYc) {
                str = "video_normal_ad";
            } else {
                str = "image_normal_ad";
            }
            jSONObject2.put("openad_creative_type", str);
            if (com.bytedance.sdk.openadsdk.component.view.Qhi.ac() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.aP || TTAppOpenAdActivity.this.qMt.gT()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.pA());
                TTAppOpenAdActivity.this.Qhi(jSONObject2);
            }
            if (TTAppOpenAdActivity.this.qMt.czB()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            jSONObject2.put("is_icon_only", i10);
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(TTAppOpenAdActivity.this.qMt, "open_ad", jSONObject2);
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(TTAppOpenAdActivity.this.findViewById(16908290), TTAppOpenAdActivity.this.qMt, new Tgh.Qhi(TTAppOpenAdActivity.this.pA()));
            TTAppOpenAdActivity.this.ABk.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zn.Qhi((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                zn.Qhi((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        ABk.Qhi("TTAppOpenAdActivity", e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (HzH.CJ().qMt(String.valueOf(this.tP)) == 1) {
            if (this.f8528hm.cJ() >= HzH.CJ().EBS(String.valueOf(this.tP)) * 1000) {
                MQ();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HzH.cJ(getApplicationContext());
        if (!cJ(bundle)) {
            finish();
        } else if (!iMK.fl()) {
            finish();
        } else {
            if (bundle != null) {
                com.bytedance.sdk.openadsdk.cJ.ac.fl(this.qMt, "open_ad", (JSONObject) null);
            }
            this.kYc = tP.fl(this.qMt);
            new StringBuilder("onCreate: isVideo is ").append(this.kYc);
            if (this.kYc) {
                this.f8528hm.Qhi((float) this.qMt.FQ().Tgh());
            } else {
                this.f8528hm.Qhi(HzH.CJ().bxS(String.valueOf(this.tP)));
            }
            com.bytedance.sdk.openadsdk.component.Tgh.cJ cJVar = new com.bytedance.sdk.openadsdk.component.Tgh.cJ(this.f8528hm);
            this.WAv = cJVar;
            cJVar.Qhi(this.lG);
            ROR();
            FrameLayout frameLayout = new FrameLayout(this);
            this.Eh = frameLayout;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            try {
                setContentView(this.Eh);
                this.Eh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z10;
                        try {
                            int CQU = TTAppOpenAdActivity.this.qMt.CQU();
                            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                            if (tTAppOpenAdActivity.qMt != null && TTAppOpenAdActivity.this.qMt.EBS() == 2 && (CQU == 3 || CQU == 7)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            tTAppOpenAdActivity.aP = z10;
                            if (TTAppOpenAdActivity.this.aP) {
                                TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity2.NFd = new com.bytedance.sdk.openadsdk.component.cJ(tTAppOpenAdActivity2, tTAppOpenAdActivity2.qMt, TTAppOpenAdActivity.this.Eh, TTAppOpenAdActivity.this.lG, TTAppOpenAdActivity.this.pM, TTAppOpenAdActivity.this.kYc, TTAppOpenAdActivity.this.f8528hm);
                            } else {
                                TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity3.NFd = new com.bytedance.sdk.openadsdk.component.ac(tTAppOpenAdActivity3, tTAppOpenAdActivity3.qMt, TTAppOpenAdActivity.this.Eh, TTAppOpenAdActivity.this.lG, TTAppOpenAdActivity.this.pM, TTAppOpenAdActivity.this.kYc, TTAppOpenAdActivity.this.f8528hm);
                                TTAppOpenAdActivity.this.NFd.Qhi(TTAppOpenAdActivity.this.HzH, TTAppOpenAdActivity.this.hpZ);
                            }
                            TTAppOpenAdActivity.this.NFd.Qhi((ViewGroup) TTAppOpenAdActivity.this.Eh);
                            TTAppOpenAdActivity.this.NFd.Qhi();
                            TTAppOpenAdActivity.this.NFd.cJ();
                        } catch (Throwable th2) {
                            TTAppOpenAdActivity.this.finish();
                            ABk.Qhi("TTAppOpenAdActivity", th2.getMessage());
                        }
                    }
                });
                try {
                    final View decorView = getWindow().getDecorView();
                    if (Build.VERSION.SDK_INT >= 35) {
                        decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                            /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
                                r0 = r5.getBoundingRects();
                             */
                            @Override // android.view.View.OnApplyWindowInsetsListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public android.view.WindowInsets onApplyWindowInsets(android.view.View r5, android.view.WindowInsets r6) {
                                /*
                                    r4 = this;
                                    android.view.DisplayCutout r5 = androidx.window.layout.e.f(r6)     // Catch: java.lang.Throwable -> L27
                                    if (r5 == 0) goto L27
                                    java.util.List r0 = androidx.window.layout.k.d(r5)     // Catch: java.lang.Throwable -> L27
                                    if (r0 == 0) goto L27
                                    boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L27
                                    if (r0 != 0) goto L27
                                    android.view.View r0 = r2     // Catch: java.lang.Throwable -> L27
                                    int r1 = androidx.window.layout.e.b(r5)     // Catch: java.lang.Throwable -> L27
                                    int r2 = androidx.window.layout.f.c(r5)     // Catch: java.lang.Throwable -> L27
                                    int r3 = androidx.window.layout.g.b(r5)     // Catch: java.lang.Throwable -> L27
                                    int r5 = androidx.emoji2.text.b.a(r5)     // Catch: java.lang.Throwable -> L27
                                    r0.setPadding(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L27
                                L27:
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.AnonymousClass3.onApplyWindowInsets(android.view.View, android.view.WindowInsets):android.view.WindowInsets");
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                com.bytedance.sdk.openadsdk.Gm.ac.cJ();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.cJ.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.Tgh.cJ cJVar = this.WAv;
        if (cJVar != null) {
            cJVar.fl();
        }
        com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(this.qMt);
        if (this.kYc) {
            com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(this.qMt, this.f8528hm.cJ(), this.f8528hm.Qhi(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(this.qMt, -1L, this.f8528hm.Qhi(), false);
        }
        if (this.iMK.fl() && this.ABk.get()) {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(String.valueOf(this.iMK.ac()), this.qMt, "open_ad", this.pA);
            this.iMK = Jma.cJ();
        }
        com.bytedance.sdk.openadsdk.component.ac acVar = this.NFd;
        if (acVar != null) {
            acVar.ac();
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("recycleRes");
        }
        Sf = null;
        this.bxS = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.Gm;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback(null);
        }
        if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().CQU(String.valueOf(this.tP)) == 1) {
            com.bytedance.sdk.openadsdk.component.ROR.Qhi(HzH.Qhi()).Qhi(this.sDy);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f8527fl = false;
        ac();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.ac acVar;
        super.onResume();
        this.f8527fl = true;
        if (this.Qhi.getAndSet(true)) {
            if (this.Dww.get()) {
                tP();
                if (this.kYc && (acVar = this.NFd) != null && acVar.fl() != null) {
                    this.NFd.fl().Qhi(3);
                }
                finish();
                return;
            }
            cJ();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            tP tPVar = this.qMt;
            if (tPVar != null) {
                str = tPVar.mZ().toString();
            } else {
                str = null;
            }
            bundle.putString("material_meta", str);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.MQ);
            bundle.putInt("ad_source", this.CQU);
            bundle.putLong("start_show_time", this.Tgh);
        } catch (Throwable th2) {
            ABk.Qhi("TTAppOpenAdActivity", th2.getMessage());
        }
        Sf = this.bxS;
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.ac.Qhi(this, this.qMt);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        int i10;
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (!this.aP) {
                this.iMK.CJ();
            }
            tP tPVar = this.qMt;
            if (tPVar != null && tPVar.qb() && !this.qMt.ZRq()) {
                this.qMt.ROR(true);
                tP tPVar2 = this.qMt;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar2, "open_ad", tPVar2.up());
            }
        } else if (this.ABk.get()) {
            if (this.iMK.fl()) {
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(String.valueOf(this.iMK.ac()), this.qMt, "open_ad", this.pA);
            }
            this.iMK = Jma.cJ();
        }
        tP tPVar3 = this.qMt;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 8;
        }
        com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(tPVar3, i10);
    }

    private void ABk() {
        this.f8529zc.Qhi(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm() {
        if (!this.kYc || this.qMt.czB() || this.lB) {
            return;
        }
        this.cJ.sendEmptyMessageDelayed(100, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HzH() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.ac.cJ cJVar = this.bxS;
        if (cJVar != null) {
            cJVar.Qhi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MQ() {
        com.bytedance.sdk.openadsdk.component.ac acVar;
        bxS.ac(this.tP);
        tP();
        if (this.kYc && (acVar = this.NFd) != null && acVar.fl() != null) {
            this.NFd.fl().Qhi(4);
        }
        com.bytedance.sdk.openadsdk.component.CJ.cJ.Qhi(this.qMt, (int) this.f8528hm.cJ(), this.WAv.Qhi(), this.f8528hm.Qhi());
        tP tPVar = this.qMt;
        if (tPVar != null && tPVar.IC() && this.qMt.cJP() != null && this.qMt.cJP().Qhi() != null) {
            com.bytedance.sdk.openadsdk.core.ROR.fl Qhi = this.qMt.cJP().Qhi();
            com.bytedance.sdk.openadsdk.component.ac acVar2 = this.NFd;
            long ROR = (acVar2 == null || acVar2.fl() == null) ? 0L : this.NFd.fl().ROR();
            Qhi.Tgh(ROR);
            Qhi.fl(ROR);
        }
        finish();
    }

    private void ROR() {
        if (26 == Build.VERSION.SDK_INT) {
            if (getResources().getConfiguration().orientation == 1) {
                this.pM = 1;
            } else {
                this.pM = 2;
            }
        } else {
            this.pM = this.qMt.SL();
        }
        Sf();
    }

    private void Sf() {
        int min;
        int max;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.pM);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
            if (i10 == 27) {
                try {
                    hm();
                } catch (Throwable th2) {
                    ABk.Qhi("TTAppOpenAdActivity", th2.getMessage());
                    return;
                }
            } else {
                hm();
            }
        }
        Pair<Integer, Integer> Sf2 = zn.Sf(getApplicationContext());
        if (this.pM == 2) {
            min = Math.max(((Integer) Sf2.first).intValue(), ((Integer) Sf2.second).intValue());
            max = Math.min(((Integer) Sf2.first).intValue(), ((Integer) Sf2.second).intValue());
        } else {
            min = Math.min(((Integer) Sf2.first).intValue(), ((Integer) Sf2.second).intValue());
            max = Math.max(((Integer) Sf2.first).intValue(), ((Integer) Sf2.second).intValue());
        }
        this.hpZ = max;
        this.HzH = min;
        float Qhi = zn.Qhi();
        if (zn.ac((Activity) this)) {
            int i11 = this.pM;
            if (i11 == 1) {
                this.hpZ -= Qhi;
            } else if (i11 == 2) {
                this.HzH -= Qhi;
            }
        }
        com.bytedance.sdk.openadsdk.component.ac acVar = this.NFd;
        if (acVar != null) {
            acVar.Qhi(this.HzH, this.hpZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Tgh() {
        this.WAv.cJ(HzH.CJ().EBS(String.valueOf(this.tP)));
        this.WAv.Qhi(this.f8528hm.Qhi());
    }

    private void WAv() {
        if (this.Gm == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this, this.qMt);
            this.Gm = tTAdDislikeDialog;
            tTAdDislikeDialog.setDislikeSource("video_player");
            this.Gm.setCallback(new TTAdDislikeDialog.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                public void Qhi(View view) {
                    TTAppOpenAdActivity.this.f8526ac.set(true);
                    TTAppOpenAdActivity.this.ac();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                public void cJ(View view) {
                    TTAppOpenAdActivity.this.f8526ac.set(false);
                    TTAppOpenAdActivity.this.cJ();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                public void Qhi(int i10, FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.CJ.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.CJ.set(true);
                    TTAppOpenAdActivity.this.iMK();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(16908290);
        frameLayout.addView(this.Gm);
        if (this.f8529zc == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.f8529zc = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void hm() {
        if (this.pM == 2) {
            if (fl()) {
                setRequestedOrientation(8);
            } else {
                setRequestedOrientation(0);
            }
        } else {
            setRequestedOrientation(1);
        }
        if (this.pM == 2 || !zn.ac((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hpZ() {
        if (this.ABk.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.Jma);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iMK() {
        this.f8529zc.Qhi(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kYc() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdClicked");
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.ac.cJ cJVar = this.bxS;
            if (cJVar != null) {
                cJVar.onAdClicked();
            }
        }
        if (com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Dww(String.valueOf(this.tP))) {
            this.Dww.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int pA() {
        if (this.qMt.gT()) {
            return 5;
        }
        if (this.aP) {
            return this.NFd.CJ();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tP() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.ac.cJ cJVar = this.bxS;
        if (cJVar != null) {
            cJVar.cJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zc() {
        if (!this.kYc || this.qMt.czB()) {
            return;
        }
        this.cJ.removeMessages(100);
    }

    public IListenerManager CJ() {
        if (this.EBS == null) {
            this.EBS = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi().Qhi(7));
        }
        return this.EBS;
    }

    public void ac() {
        if (this.kYc) {
            com.bytedance.sdk.openadsdk.component.ac acVar = this.NFd;
            if (acVar != null && acVar.fl() != null && this.NFd.fl().cJ()) {
                this.NFd.fl().CJ();
            }
            zc();
        }
        com.bytedance.sdk.openadsdk.component.Tgh.cJ cJVar = this.WAv;
        if (cJVar != null) {
            cJVar.CJ();
        }
    }

    public boolean fl() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e10) {
            ABk.Qhi("TTAppOpenAdActivity", e10.getMessage());
            return false;
        }
    }

    public void cJ() {
        if (this.f8526ac.get()) {
            return;
        }
        if (this.kYc) {
            com.bytedance.sdk.openadsdk.component.ac acVar = this.NFd;
            if (acVar != null && acVar.fl() != null && this.NFd.fl().ac()) {
                this.NFd.fl().fl();
            }
            Gm();
        }
        com.bytedance.sdk.openadsdk.component.Tgh.cJ cJVar = this.WAv;
        if (cJVar != null) {
            cJVar.ac();
        }
    }

    public void Qhi() {
        if (isFinishing()) {
            return;
        }
        if (this.CJ.get()) {
            ABk();
            return;
        }
        if (this.Gm == null) {
            try {
                WAv();
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th2);
            }
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.Gm;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.Qhi();
        }
    }

    private boolean cJ(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.qMt = com.bytedance.sdk.openadsdk.core.cJ.Qhi(new JSONObject(stringExtra));
                    } catch (Exception e10) {
                        ABk.Qhi("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e10);
                    }
                }
                this.MQ = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.qMt = Dww.Qhi().cJ();
            this.bxS = Dww.Qhi().fl();
            Dww.Qhi().Tgh();
        }
        Qhi(getIntent());
        Qhi(bundle);
        tP tPVar = this.qMt;
        if (tPVar == null) {
            finish();
            return false;
        }
        this.sDy = tPVar.lB();
        this.qMt.Qhi(this.Tgh);
        this.tP = this.qMt.Hy();
        com.bytedance.sdk.openadsdk.utils.cJ.Qhi(this.qMt);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject Qhi(JSONObject jSONObject) {
        if (pA() == 0) {
            return this.NFd.Qhi(jSONObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final String str) {
        lG.ac(new hm("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.CJ().executeAppOpenAdCallback(TTAppOpenAdActivity.this.MQ, str);
                } catch (Throwable th2) {
                    ABk.Qhi("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void Qhi(Intent intent) {
        if (intent != null) {
            this.CQU = intent.getIntExtra("ad_source", 0);
            this.Tgh = intent.getLongExtra("start_show_time", 0L);
        }
    }

    public void Qhi(Bundle bundle) {
        if (bundle != null) {
            if (this.bxS == null) {
                this.bxS = Sf;
                Sf = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.MQ = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.CQU = bundle.getInt("ad_source", 0);
                this.Tgh = bundle.getLong("start_show_time", 0L);
                this.qMt = com.bytedance.sdk.openadsdk.core.cJ.Qhi(new JSONObject(string));
            } catch (Throwable th2) {
                ABk.Qhi("TTAppOpenAdActivity", th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        com.bytedance.sdk.openadsdk.component.ac acVar;
        if (message.what == 100) {
            if (this.kYc && (acVar = this.NFd) != null && acVar.fl() != null) {
                this.NFd.fl().Qhi(1);
            }
            tP();
            finish();
        }
    }
}
