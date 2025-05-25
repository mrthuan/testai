package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.hpZ.Sf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullPlayableManager.java */
/* loaded from: classes.dex */
public class Sf implements Handler.Callback, com.bytedance.sdk.openadsdk.WAv.Sf {

    /* renamed from: hm  reason: collision with root package name */
    private static final Sf.Qhi f8805hm = new Sf.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.1
        @Override // com.bytedance.sdk.openadsdk.hpZ.Sf.Qhi
        public void Qhi(String str, String str2, Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi(str, str2, th2);
        }
    };
    private final String ABk;
    private boolean CQU;
    private boolean Dww;
    private boolean EBS;
    private final Activity Gm;
    private HomeWatcherReceiver MQ;
    private boolean Sf;
    private volatile boolean WAv;
    private volatile boolean bxS;
    private hpZ hpZ;
    private final Qhi iMK;
    private PlayableLoadingView kYc;
    private com.bytedance.sdk.openadsdk.hpZ.hm qMt;

    /* renamed from: zc  reason: collision with root package name */
    private final tP f8808zc;
    protected final AtomicBoolean Qhi = new AtomicBoolean(false);
    private final Handler pA = new Handler(this);
    boolean cJ = false;

    /* renamed from: ac  reason: collision with root package name */
    boolean f8806ac = false;
    long CJ = 0;

    /* renamed from: fl  reason: collision with root package name */
    int f8807fl = 0;
    int Tgh = 0;
    int ROR = 0;
    private int HzH = 1;
    private boolean tP = true;
    private final com.bytedance.sdk.openadsdk.WAv.fl pM = new com.bytedance.sdk.openadsdk.WAv.fl() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.8
        @Override // com.bytedance.sdk.openadsdk.WAv.fl
        public void Qhi(int i10) {
        }

        @Override // com.bytedance.sdk.openadsdk.WAv.fl
        public void Qhi() {
            if (!Sf.this.iMK.FQ.isFinishing() && Sf.this.iMK.cJ.Ls() && bxS.hm(Sf.this.iMK.cJ)) {
                Sf.this.pA.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD);
                Sf.this.pA.sendMessage(Sf.Qhi(1, 0));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.WAv.fl
        public void cJ() {
        }
    };

    public Sf(Qhi qhi) {
        this.iMK = qhi;
        this.Gm = qhi.FQ;
        this.ABk = qhi.f8798fl;
        this.f8808zc = qhi.cJ;
    }

    private String CQU() {
        String str;
        String str2;
        String Eh = com.bytedance.sdk.openadsdk.core.HzH.CJ().Eh();
        if (!TextUtils.isEmpty(Eh) && this.f8808zc.pv() != null) {
            String cJ = this.f8808zc.pv().cJ();
            double CJ = this.f8808zc.pv().CJ();
            int fl2 = this.f8808zc.pv().fl();
            if (this.f8808zc.dIT() != null && !TextUtils.isEmpty(this.f8808zc.dIT().Qhi())) {
                str = this.f8808zc.dIT().Qhi();
            } else {
                str = "";
            }
            String HLI = this.f8808zc.HLI();
            String ac2 = this.f8808zc.pv().ac();
            String Qhi = this.f8808zc.pv().Qhi();
            String cJ2 = this.f8808zc.pv().cJ();
            String dVA = this.f8808zc.dVA();
            StringBuilder sb2 = new StringBuilder("appname=");
            sb2.append(URLEncoder.encode(cJ));
            sb2.append("&stars=");
            sb2.append(CJ);
            sb2.append("&comments=");
            sb2.append(fl2);
            sb2.append("&icon=");
            sb2.append(URLEncoder.encode(str));
            sb2.append("&downloading=true&id=");
            sb2.append(URLEncoder.encode(HLI));
            sb2.append("&packageName=");
            sb2.append(URLEncoder.encode(ac2));
            sb2.append("&downloadUrl=");
            sb2.append(URLEncoder.encode(Qhi));
            sb2.append("&name=");
            sb2.append(URLEncoder.encode(cJ2));
            sb2.append("&orientation=");
            if (this.HzH == 1) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            sb2.append(str2);
            sb2.append("&apptitle=");
            sb2.append(URLEncoder.encode(dVA));
            return Eh + "?" + ((Object) sb2);
        }
        return Eh;
    }

    private boolean Dww() {
        if (this.kYc == null) {
            return false;
        }
        if (this.f8808zc.Ls() && bxS.Gm(this.f8808zc)) {
            this.kYc.cJ(this.f8808zc, this.HzH);
            return true;
        }
        this.kYc.ac();
        return false;
    }

    private static com.bytedance.sdk.openadsdk.hpZ.fl EBS() {
        String Tgh = com.bytedance.sdk.openadsdk.common.Qhi.Tgh();
        Tgh.getClass();
        char c = 65535;
        switch (Tgh.hashCode()) {
            case 1653:
                if (Tgh.equals("2g")) {
                    c = 0;
                    break;
                }
                break;
            case 1684:
                if (Tgh.equals("3g")) {
                    c = 1;
                    break;
                }
                break;
            case 1715:
                if (Tgh.equals("4g")) {
                    c = 2;
                    break;
                }
                break;
            case 1746:
                if (Tgh.equals("5g")) {
                    c = 3;
                    break;
                }
                break;
            case 3649301:
                if (Tgh.equals("wifi")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return com.bytedance.sdk.openadsdk.hpZ.fl.TYPE_2G;
            case 1:
                return com.bytedance.sdk.openadsdk.hpZ.fl.TYPE_3G;
            case 2:
                return com.bytedance.sdk.openadsdk.hpZ.fl.TYPE_4G;
            case 3:
                return com.bytedance.sdk.openadsdk.hpZ.fl.TYPE_5G;
            case 4:
                return com.bytedance.sdk.openadsdk.hpZ.fl.TYPE_WIFI;
            default:
                return com.bytedance.sdk.openadsdk.hpZ.fl.TYPE_UNKNOWN;
        }
    }

    private void bxS() {
        this.kYc = (PlayableLoadingView) this.iMK.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.YAV);
    }

    public static /* synthetic */ com.bytedance.sdk.openadsdk.hpZ.fl qMt() {
        return EBS();
    }

    public void ABk() {
        if (this.qMt != null && zn.CJ(this.iMK.lG.Sf())) {
            this.qMt.cJ(true);
        }
    }

    public int Gm() {
        return this.Tgh;
    }

    public boolean HzH() {
        return this.bxS;
    }

    public com.bytedance.sdk.openadsdk.hpZ.hm MQ() {
        return this.qMt;
    }

    public void ROR() {
        if (this.CJ > 0) {
            return;
        }
        this.CJ = System.currentTimeMillis();
        Handler handler = this.pA;
        handler.sendMessage(handler.obtainMessage(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK, Gm(), 0));
        ac(true);
    }

    public void Sf() {
        int i10;
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar;
        com.bytedance.sdk.openadsdk.utils.zc zcVar;
        if (!bxS.ac(this.f8808zc) && this.kYc.isShown() && (zcVar = this.iMK.gga) != null) {
            zcVar.Qhi(Gm() * 1000);
        }
        if (bxS.zc(this.f8808zc) && this.kYc.isShown()) {
            Qhi qhi = this.iMK;
            qhi.f8802zn.cJ(qhi.ReL);
        }
        PlayableLoadingView playableLoadingView = this.kYc;
        if (playableLoadingView != null) {
            playableLoadingView.ac();
        }
        if (this.Qhi.getAndSet(true)) {
            return;
        }
        if (this.iMK.lG.js() && (hmVar = this.qMt) != null) {
            hmVar.Qhi(1);
        }
        if (bxS.cJ(this.f8808zc) && bxS.hpZ(this.f8808zc)) {
            hpZ hpz = this.iMK.lG;
            if (hpz != null && !hpz.js()) {
                if (!this.iMK.lG.hpZ()) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
                com.bytedance.sdk.openadsdk.hpZ.hm hmVar2 = this.qMt;
                if (hmVar2 != null) {
                    hmVar2.Qhi(i10);
                }
                if (bxS.Gm(this.iMK.cJ)) {
                    Qhi qhi2 = this.iMK;
                    int i11 = qhi2.Tgh;
                    tP tPVar = qhi2.cJ;
                    Qhi(i11, tPVar, tPVar.LpL());
                    ROR();
                    this.iMK.PAe.Gm();
                }
                this.iMK.f8802zn.Qhi(false);
                this.iMK.lG.Jma();
                this.bxS = true;
                this.iMK.js.ac(false);
                this.iMK.lB.Qhi(true);
                this.iMK.dIT = true;
                if (bxS.zc(this.f8808zc)) {
                    this.pA.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
                    this.iMK.js.CJ(false);
                    CQU cqu = this.iMK.xyz;
                    if (cqu != null) {
                        cqu.removeMessages(1);
                        this.iMK.xyz.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, 1000L);
                    }
                }
                com.bytedance.sdk.openadsdk.hpZ.hm hmVar3 = this.qMt;
                if (hmVar3 != null) {
                    hmVar3.cJ(true);
                    return;
                }
                return;
            }
            Qhi qhi3 = this.iMK;
            qhi3.f8802zn.Qhi(qhi3.ReL);
        }
    }

    public boolean WAv() {
        return this.WAv;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        PlayableLoadingView playableLoadingView;
        hpZ hpz;
        int i10 = message.what;
        if (i10 == 900) {
            if (!this.WAv || !bxS.Gm(this.iMK.cJ)) {
                return true;
            }
            int i11 = message.arg1;
            if (i11 > 0) {
                this.iMK.js.CJ(true);
                int CJ = this.iMK.CQU.CJ(i11);
                if (CJ == i11) {
                    this.iMK.js.Qhi(String.valueOf(i11), null);
                } else if (CJ > 0) {
                    this.iMK.js.Qhi(String.valueOf(i11), String.format(MQ.Qhi(this.iMK.FQ.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(CJ)));
                } else if (HzH()) {
                    this.iMK.tP.set(true);
                    this.iMK.ReL.pA();
                } else {
                    this.iMK.js.Qhi(String.valueOf(i11), MQ.Qhi(this.iMK.FQ.getApplicationContext(), "tt_reward_screen_skip_tx"));
                    this.iMK.js.fl(true);
                }
                Message obtain = Message.obtain();
                obtain.what = OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK;
                obtain.arg1 = i11 - 1;
                this.pA.sendMessageDelayed(obtain, 1000L);
                this.iMK.CQU.fl(i11);
            } else {
                if (bxS.ac(this.f8808zc) && (!bxS.hpZ(this.f8808zc) || !this.iMK.CQU.HzH())) {
                    this.iMK.js.ac();
                    this.iMK.js.fl(true);
                } else {
                    this.iMK.js.CJ(false);
                    this.iMK.tP.set(true);
                    this.iMK.ReL.pA();
                }
                if (!this.Sf) {
                    this.Dww = true;
                }
            }
            this.iMK.PAe.iMK();
        } else if (i10 != 800 || ((playableLoadingView = this.kYc) != null && (!playableLoadingView.isShown() || this.kYc.CJ()))) {
            return true;
        } else {
            JSONObject jSONObject = new JSONObject();
            long j10 = 0;
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i12 = message.arg2;
                if (i12 != 0) {
                    jSONObject.put("remove_loading_page_reason", i12);
                }
                String fl2 = bxS.fl(this.f8808zc);
                Qhi qhi = this.iMK;
                if (qhi != null && (hpz = qhi.lG) != null) {
                    String bxS = hpz.bxS();
                    if (!TextUtils.isEmpty(bxS)) {
                        fl2 = bxS;
                    }
                }
                jSONObject.put("playable_url", fl2);
                PlayableLoadingView playableLoadingView2 = this.kYc;
                if (playableLoadingView2 != null) {
                    j10 = playableLoadingView2.getDisplayDuration();
                }
                jSONObject.put("duration", j10);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFPM", "handleMessage json error", e10);
            }
            Qhi qhi2 = this.iMK;
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(qhi2.cJ, qhi2.f8798fl, "remove_loading_page", jSONObject, j10);
            this.pA.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD);
            if (!this.Gm.isFinishing()) {
                this.iMK.CQU.Sf();
            }
        }
        return true;
    }

    public void hm() {
        int i10;
        if (this.kYc.isShown()) {
            return;
        }
        PlayableLoadingView playableLoadingView = this.kYc;
        if (playableLoadingView != null) {
            playableLoadingView.cJ(this.f8808zc, this.HzH);
            if (this.iMK.lG.Sf() != null) {
                i10 = this.iMK.lG.Sf().getProgress();
            } else {
                i10 = 0;
            }
            this.kYc.setProgress(i10);
        }
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
        if (hmVar != null) {
            hmVar.NFd();
        }
    }

    public com.bytedance.sdk.openadsdk.WAv.fl hpZ() {
        return this.pM;
    }

    public void iMK() {
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
        if (hmVar != null) {
            hmVar.cJ(false);
        }
        this.pA.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
    }

    public boolean kYc() {
        return this.Dww;
    }

    public void pA() {
        this.pA.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
        this.pA.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
    }

    public boolean tP() {
        PlayableLoadingView playableLoadingView = this.kYc;
        if (playableLoadingView != null && playableLoadingView.isShown()) {
            return true;
        }
        return false;
    }

    public int zc() {
        return this.f8807fl;
    }

    public boolean CJ() {
        return this.cJ;
    }

    public void Tgh() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.MQ = homeWatcherReceiver;
            homeWatcherReceiver.Qhi(new HomeWatcherReceiver.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.7
                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.Qhi
                public void Qhi() {
                    Sf.this.f8806ac = true;
                }

                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.Qhi
                public void cJ() {
                    Sf.this.f8806ac = true;
                }
            });
            this.Gm.getApplicationContext().registerReceiver(this.MQ, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    public void ac() {
        this.cJ = true;
    }

    public void cJ(int i10) {
        if (i10 == 5) {
            this.Sf = true;
            if (bxS.hpZ(this.f8808zc)) {
                this.pA.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
                this.iMK.xyz.sendEmptyMessage(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
            }
        }
        this.pA.sendMessage(Qhi(i10, 0));
    }

    public void fl() {
        if (this.CQU) {
            return;
        }
        this.CQU = true;
        ac(false);
        Qhi(this.Gm.getApplicationContext());
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
        if (hmVar != null) {
            hmVar.js();
        }
        this.pA.removeCallbacksAndMessages(null);
        DeviceUtils.AudioInfoReceiver.cJ(this);
    }

    public static Message Qhi(int i10, int i11) {
        Message obtain = Message.obtain();
        obtain.what = OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD;
        obtain.arg1 = i10;
        if (i10 == 3) {
            obtain.arg2 = i11;
        }
        return obtain;
    }

    public int CJ(int i10) {
        return this.ROR - (this.Tgh - i10);
    }

    public void ac(int i10) {
        PlayableLoadingView playableLoadingView = this.kYc;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i10);
        }
    }

    public void CJ(boolean z10) {
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
        if (hmVar != null) {
            hmVar.cJ(z10);
        }
    }

    public void ac(boolean z10) {
        this.WAv = z10;
        if (z10) {
            return;
        }
        this.pA.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
    }

    public void Tgh(int i10) {
        this.f8807fl = i10;
    }

    public void Qhi() {
        if (this.EBS) {
            return;
        }
        this.EBS = true;
        Qhi qhi = this.iMK;
        this.hpZ = qhi.lG;
        this.HzH = qhi.Dq;
        bxS();
        if (bxS.cJ(this.f8808zc)) {
            DeviceUtils.AudioInfoReceiver.Qhi(this);
        }
        if (Dww() && bxS.Gm(this.f8808zc) && bxS.hm(this.f8808zc)) {
            Handler handler = this.pA;
            handler.sendMessageDelayed(handler.obtainMessage(OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD, 2, bxS.Qhi(2)), bxS.ABk(this.f8808zc) * 1000);
        }
    }

    public void Tgh(boolean z10) {
        if (!z10 || this.iMK.CQU.HzH()) {
            return;
        }
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
        if (hmVar != null) {
            hmVar.Qhi(1);
        }
        boolean Gm = bxS.Gm(this.f8808zc);
        if ((Gm || bxS.hpZ(this.f8808zc)) && this.f8808zc.Ls() && !bxS.hm(this.f8808zc)) {
            Handler handler = this.pA;
            handler.sendMessageDelayed(handler.obtainMessage(OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD, 0, 0), 1000L);
        }
        if (Gm) {
            this.iMK.CQU.cJ();
            this.iMK.lG.cJ(true);
            this.iMK.lG.ac(true);
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(System.currentTimeMillis(), this.iMK.cJ, this.ABk, "py_loading_success");
        }
    }

    public void ac(String str) {
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
        if (hmVar != null) {
            hmVar.fl(com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(this.f8808zc));
            this.qMt.ROR(str);
        }
    }

    public void cJ() {
        if (this.Qhi.getAndSet(true)) {
            return;
        }
        this.hpZ.lG();
        if (bxS.ac(this.f8808zc)) {
            this.hpZ.Tgh();
        }
    }

    public void fl(int i10) {
        this.f8807fl = i10 - 1;
    }

    public void cJ(boolean z10) {
        if (z10) {
            try {
                if (!TextUtils.isEmpty(this.hpZ.bxS()) && this.hpZ.qMt() != 0) {
                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi(this.hpZ.bxS(), this.hpZ.qMt(), this.hpZ.EBS());
                }
            } catch (Throwable unused) {
            }
        }
        if (z10) {
            try {
                if (TextUtils.isEmpty(this.hpZ.bxS())) {
                    return;
                }
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi().cJ(this.hpZ.bxS());
            } catch (Throwable unused2) {
            }
        }
    }

    public void fl(boolean z10) {
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
        if (hmVar != null) {
            hmVar.Qhi(z10);
        }
    }

    public void cJ(String str) {
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
        if (hmVar != null) {
            hmVar.fl(com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(this.f8808zc));
            this.qMt.Sf(str);
        }
        if (HzH()) {
            this.iMK.lG.CJ(true);
            this.iMK.lB.Qhi(true);
            this.iMK.dIT = true;
        }
    }

    public void Qhi(final com.bytedance.sdk.openadsdk.WAv.Tgh tgh, boolean z10) {
        com.bytedance.sdk.openadsdk.Gm.cJ cJVar;
        kYc Qhi;
        com.bytedance.sdk.openadsdk.hpZ.hm CJ;
        if (bxS.cJ(this.f8808zc) && this.iMK.jPH) {
            if (com.bytedance.sdk.openadsdk.core.hm.cJ().HzH()) {
                com.bytedance.sdk.openadsdk.hpZ.Sf.Qhi(f8805hm);
            }
            com.bytedance.sdk.openadsdk.hpZ.Qhi qhi = new com.bytedance.sdk.openadsdk.hpZ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.2
                @Override // com.bytedance.sdk.openadsdk.hpZ.Qhi
                public void Qhi(int i10, String str) {
                    super.Qhi(i10, str);
                    if (Sf.this.kYc == null || !Sf.this.kYc.isShown()) {
                        return;
                    }
                    Sf.this.pA.sendMessage(Sf.Qhi(3, bxS.Qhi(i10)));
                }

                @Override // com.bytedance.sdk.openadsdk.hpZ.Qhi
                public void cJ() {
                    Sf.this.iMK.lG.WAv().ac(true);
                    com.bytedance.sdk.openadsdk.WAv.Tgh tgh2 = tgh;
                    if (tgh2 != null) {
                        tgh2.Qhi();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.hpZ.Qhi
                public com.bytedance.sdk.openadsdk.hpZ.fl Qhi() {
                    return Sf.qMt();
                }

                @Override // com.bytedance.sdk.openadsdk.hpZ.Qhi
                public void Qhi(JSONObject jSONObject) {
                    com.bytedance.sdk.openadsdk.cJ.ac.cJ(Sf.this.f8808zc, Sf.this.ABk, "playable_track", jSONObject);
                }
            };
            com.bytedance.sdk.openadsdk.hpZ.ac acVar = new com.bytedance.sdk.openadsdk.hpZ.ac() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.3
                @Override // com.bytedance.sdk.openadsdk.hpZ.ac
                public void Qhi(String str, JSONObject jSONObject) {
                    Sf.this.iMK.lG.WAv().Qhi(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cid", this.f8808zc.HLI());
                jSONObject.put("log_extra", this.f8808zc.EGK());
                CJ = com.bytedance.sdk.openadsdk.hpZ.hm.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), this.iMK.lG.Sf().getWebView(), acVar, qhi).Tgh(this.iMK.lG.bxS()).fl(com.bytedance.sdk.openadsdk.common.Qhi.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).Qhi(com.bytedance.sdk.openadsdk.common.Qhi.Qhi()).ac(jSONObject).Qhi("sdkEdition", com.bytedance.sdk.openadsdk.common.Qhi.ac()).cJ(com.bytedance.sdk.openadsdk.common.Qhi.fl()).CJ(com.bytedance.sdk.openadsdk.common.Qhi.CJ()).ac(false).Qhi(z10).Qhi(bxS.ABk(this.f8808zc)).cJ(bxS.ABk(this.f8808zc)).CJ(bxS.Gm(this.f8808zc));
                this.qMt = CJ;
            } catch (Exception unused) {
                if (this.qMt == null) {
                    cJVar = new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.4
                        @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                        public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("PlayablePlugin_init").cJ(jSONObject2.toString());
                        }
                    };
                }
            } catch (Throwable th2) {
                if (this.qMt == null) {
                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.4
                        @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                        public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("PlayablePlugin_init").cJ(jSONObject2.toString());
                        }
                    });
                }
                throw th2;
            }
            if (CJ == null) {
                cJVar = new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.4
                    @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                    public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("PlayablePlugin_is_null", true);
                        return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("PlayablePlugin_init").cJ(jSONObject2.toString());
                    }
                };
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi("PlayablePlugin_init", false, cJVar);
            }
            if (this.qMt != null && !TextUtils.isEmpty(bxS.CJ(this.f8808zc))) {
                this.qMt.ac(bxS.CJ(this.f8808zc));
            }
            com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
            if (hmVar != null) {
                Set<String> Gm = hmVar.Gm();
                final WeakReference weakReference = new WeakReference(this.qMt);
                for (String str : Gm) {
                    if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (Qhi = this.iMK.lG.WAv().Qhi()) != null) {
                        Qhi.Qhi(str, new com.bytedance.sdk.component.Qhi.Tgh<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.5
                            @Override // com.bytedance.sdk.component.Qhi.Tgh
                            public JSONObject Qhi(JSONObject jSONObject2, com.bytedance.sdk.component.Qhi.ROR ror) {
                                try {
                                    com.bytedance.sdk.openadsdk.hpZ.hm hmVar2 = (com.bytedance.sdk.openadsdk.hpZ.hm) weakReference.get();
                                    if (hmVar2 == null) {
                                        return null;
                                    }
                                    return hmVar2.CJ(Qhi(), jSONObject2);
                                } catch (Throwable unused2) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public void Qhi(DownloadListener downloadListener) {
        SSWebView hm2 = this.hpZ.hm();
        if (hm2 == null) {
            return;
        }
        String CQU = CQU();
        if (TextUtils.isEmpty(CQU)) {
            return;
        }
        hm2.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh(this.Gm, this.hpZ.Gm(), this.f8808zc.HLI(), null, false) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (Sf.this.tP) {
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(System.currentTimeMillis(), Sf.this.f8808zc, Sf.this.ABk, "loading_h5_success");
                }
                super.onPageFinished(webView, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                Sf.this.tP = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                Sf.this.tP = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                Sf.this.tP = false;
            }
        });
        hm2.a_(CQU);
        hm2.setDisplayZoomControls(false);
        hm2.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.fl(this.hpZ.Gm(), this.hpZ.zc()));
        hm2.setDownloadListener(downloadListener);
    }

    public void Qhi(boolean z10) {
        if (z10) {
            this.hpZ.Sf().setDomStorageEnabled(true);
        }
    }

    private void Qhi(Context context) {
        try {
            this.MQ.Qhi(null);
            context.getApplicationContext().unregisterReceiver(this.MQ);
        } catch (Throwable unused) {
        }
    }

    public void Qhi(String str) {
        if (this.f8806ac) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.CJ);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFPM", "sendPlayableEvent error", e10);
            }
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(this.f8808zc, this.ABk, str, jSONObject);
            if ("return_foreground".equals(str)) {
                this.f8806ac = false;
            }
        }
    }

    public void Qhi(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.CJ);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFPM", "endShow json error", e10);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Qhi(com.bytedance.sdk.openadsdk.core.cJ.Tgh tgh) {
        PlayableLoadingView playableLoadingView = this.kYc;
        if (playableLoadingView == null || playableLoadingView.getDownloadButton() == null) {
            return;
        }
        if (bxS.Gm(this.f8808zc) || bxS.hpZ(this.f8808zc)) {
            this.kYc.getDownloadButton().setOnClickListener(tgh);
            this.kYc.getDownloadButton().setOnTouchListener(tgh);
        }
    }

    public void Qhi(int i10, tP tPVar, boolean z10) {
        if (tPVar == null) {
            return;
        }
        this.Tgh = tPVar.TKG();
        this.ROR = com.bytedance.sdk.openadsdk.core.HzH.CJ().Qhi(String.valueOf(i10), z10);
    }

    @Override // com.bytedance.sdk.openadsdk.WAv.Sf
    public void Qhi(int i10) {
        if (!bxS.zc(this.iMK.cJ) || this.iMK.WAv.get()) {
            if (bxS.Gm(this.iMK.cJ) || bxS.zc(this.iMK.cJ)) {
                if (this.iMK.lB.cJ()) {
                    Qhi qhi = this.iMK;
                    boolean z10 = qhi.dIT;
                    qhi.lB.Qhi();
                    if (i10 == 0) {
                        this.iMK.js.cJ(true);
                        this.iMK.bxS.cJ(true);
                        return;
                    }
                    this.iMK.js.cJ(false);
                    this.iMK.bxS.cJ(false);
                    return;
                }
                this.iMK.lB.Qhi(-1);
                Qhi qhi2 = this.iMK;
                boolean z11 = qhi2.dIT;
                qhi2.lB.Qhi();
                Qhi qhi3 = this.iMK;
                if (qhi3.Qe) {
                    if (i10 == 0) {
                        qhi3.dIT = true;
                        qhi3.js.cJ(true);
                        this.iMK.bxS.cJ(true);
                        return;
                    }
                    qhi3.dIT = false;
                    qhi3.js.cJ(false);
                    this.iMK.bxS.cJ(false);
                }
            }
        }
    }

    public void Qhi(int i10, String str, String str2) {
        try {
            com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
            if (hmVar != null) {
                hmVar.fl(com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(this.f8808zc));
                this.qMt.Qhi(i10, str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public void Qhi(boolean z10, String str, int i10) {
        try {
            com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.qMt;
            if (hmVar != null) {
                hmVar.fl(com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(this.f8808zc));
                this.qMt.Qhi(z10, str, i10);
            }
        } catch (Exception unused) {
        }
    }

    public void Qhi(long j10) {
        Message obtain = Message.obtain();
        obtain.what = OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK;
        obtain.arg1 = zc();
        this.pA.sendMessageDelayed(obtain, j10);
    }
}
