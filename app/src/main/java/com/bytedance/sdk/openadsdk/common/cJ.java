package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.settings.HzH;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: ArbitrageLoadingStyle.java */
/* loaded from: classes.dex */
public class cJ implements CQU.Qhi {
    private final SSWebView CJ;
    private String Gm;
    private boolean HzH;
    private int MQ;
    private final tP Qhi;
    private float Sf;
    private long WAv;

    /* renamed from: ac  reason: collision with root package name */
    private WebView f8735ac;
    private final boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    private ArbitrageLoadingLayout f8736fl;

    /* renamed from: hm  reason: collision with root package name */
    private int f8737hm;
    private long hpZ;
    private int iMK;
    private boolean pA;
    private String Tgh = "landingpage";
    private final Handler ROR = new CQU(iMK.cJ().getLooper(), this);

    /* renamed from: zc  reason: collision with root package name */
    private final AtomicBoolean f8738zc = new AtomicBoolean(false);
    private Pattern ABk = null;
    private long tP = -1;
    private final List<Integer> kYc = new ArrayList();

    public cJ(tP tPVar, SSWebView sSWebView, String str, boolean z10) {
        this.Qhi = tPVar;
        this.CJ = sSWebView;
        this.cJ = z10;
        Qhi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void CJ() {
        if (lG.fl()) {
            fl();
        } else {
            com.bytedance.sdk.component.utils.Sf.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.cJ.2
                @Override // java.lang.Runnable
                public void run() {
                    cJ.this.fl();
                }
            });
        }
    }

    private int ROR() {
        try {
            return this.f8735ac.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private void Sf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.tP);
            jSONObject.put("loading_show_timestamp", this.hpZ);
            WebView webView = this.f8735ac;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.cJ(this.Qhi, this.Tgh, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Tgh() {
        return ROR() > 0 && !this.f8738zc.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void fl() {
        this.pA = false;
        if (this.f8738zc.getAndSet(true)) {
            return;
        }
        this.WAv = SystemClock.elapsedRealtime();
        this.hpZ = System.currentTimeMillis();
        Sf();
        WebView webView = this.f8735ac;
        if (webView != null) {
            this.Gm = webView.getUrl();
        }
        ArbitrageLoadingLayout arbitrageLoadingLayout = this.f8736fl;
        if (arbitrageLoadingLayout == null) {
            return;
        }
        arbitrageLoadingLayout.setVisibility(0);
        this.f8736fl.Qhi(this.Qhi);
        this.f8736fl.Qhi();
        this.f8736fl.setAlpha(this.Sf);
        this.f8736fl.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.cJ.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        ac();
        cJ();
    }

    public void ac(WebView webView, String str, boolean z10) {
        this.kYc.clear();
        this.HzH = z10;
        if (z10) {
            this.pA = true;
        }
        this.MQ = ROR();
    }

    public void cJ(WebView webView, String str, boolean z10) {
        if (!z10 || this.f8736fl == null) {
            return;
        }
        Qhi(1);
    }

    public void Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Tgh = str;
    }

    private void cJ() {
        Handler handler = this.ROR;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.f8737hm);
        }
    }

    private void Qhi() {
        SSWebView sSWebView = this.CJ;
        if (sSWebView != null) {
            this.f8735ac = sSWebView.getWebView();
            View arbitrageLoadingView = this.CJ.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof ArbitrageLoadingLayout) {
                this.f8736fl = (ArbitrageLoadingLayout) arbitrageLoadingView;
            }
        }
        this.f8737hm = HzH.YD().IC();
        this.Sf = HzH.YD().cJP();
    }

    private void ac() {
        Handler handler = this.ROR;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void Qhi(WebView webView, String str, boolean z10) {
        if (z10 && Tgh()) {
            CJ();
        }
    }

    public void Qhi(WebView webView, String str) {
        tP tPVar = this.Qhi;
        if (tPVar == null || !com.bytedance.sdk.component.widget.cJ.Qhi(tPVar.WAv().Qhi(), str)) {
            return;
        }
        this.iMK++;
        com.bytedance.sdk.component.utils.Sf.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.cJ.1
            @Override // java.lang.Runnable
            public void run() {
                if (cJ.this.Tgh()) {
                    cJ.this.CJ();
                }
            }
        });
    }

    public void Qhi(WebView webView, int i10) {
        ArbitrageLoadingLayout arbitrageLoadingLayout = this.f8736fl;
        if (arbitrageLoadingLayout != null) {
            arbitrageLoadingLayout.Qhi(i10);
        }
        if (this.HzH) {
            if (Qhi(i10, 30)) {
                Qhi(30, webView);
            }
            if (Qhi(i10, 50)) {
                Qhi(50, webView);
            }
            if (Qhi(i10, 70)) {
                Qhi(70, webView);
            }
        }
        if (this.f8736fl == null || i10 != 100) {
            return;
        }
        Qhi(1);
    }

    private void Qhi(final int i10) {
        com.bytedance.sdk.component.utils.Sf.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.cJ.4
            @Override // java.lang.Runnable
            public void run() {
                if (cJ.this.f8736fl != null) {
                    cJ.this.f8738zc.set(false);
                    cJ.this.f8736fl.Qhi(cJ.this.Qhi, cJ.this.Tgh, i10, cJ.this.Gm, cJ.this.WAv, cJ.this.pA, cJ.this.iMK, cJ.this.hpZ);
                    cJ.this.iMK = 0;
                }
            }
        });
        ac();
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        if (message.what == 1) {
            Qhi(0);
        }
    }

    public void Qhi(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.tP = SystemClock.elapsedRealtime();
        }
    }

    private boolean Qhi(int i10, int i11) {
        if (i10 < i11 || this.kYc.contains(Integer.valueOf(i11)) || this.MQ < 2) {
            return false;
        }
        this.kYc.add(Integer.valueOf(i11));
        return true;
    }

    private void Qhi(int i10, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i10);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.ac(this.Qhi, this.Tgh, jSONObject);
    }
}
