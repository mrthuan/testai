package com.bytedance.sdk.component.adexpress.fl;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.component.sdk.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.cJ.Sf;
import com.bytedance.sdk.component.adexpress.cJ.hm;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.cJ.pA;
import com.bytedance.sdk.component.adexpress.cJ.zc;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: BaseWebViewRender.java */
/* loaded from: classes.dex */
public abstract class Qhi implements com.bytedance.sdk.component.adexpress.Qhi, com.bytedance.sdk.component.adexpress.cJ.fl<SSWebView>, zc, com.bytedance.sdk.component.adexpress.theme.Qhi {
    private iMK ABk;
    private boolean Gm;
    protected JSONObject Qhi;
    private Context ROR;
    private String Sf;
    private volatile Sf WAv;

    /* renamed from: ac  reason: collision with root package name */
    protected SSWebView f8251ac;
    protected boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.Qhi.ac.cJ f8252fl;

    /* renamed from: hm  reason: collision with root package name */
    private String f8253hm;
    private boolean iMK;
    private int pA;

    /* renamed from: zc  reason: collision with root package name */
    private hm f8254zc;
    protected int CJ = 8;
    protected AtomicBoolean Tgh = new AtomicBoolean(false);
    private boolean hpZ = false;

    public Qhi(Context context, iMK imk, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.Gm = false;
        this.ROR = context;
        this.ABk = imk;
        this.Sf = imk.CJ();
        themeStatusBroadcastReceiver.Qhi(this);
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            zc();
            return;
        }
        SSWebView ABk = ABk();
        this.f8251ac = ABk;
        if (ABk == null) {
            if (com.bytedance.sdk.component.adexpress.fl.Qhi() != null) {
                this.f8251ac = new SSWebView(com.bytedance.sdk.component.adexpress.fl.Qhi());
                return;
            }
            return;
        }
        this.Gm = true;
    }

    private SSWebView ABk() {
        if (this.ABk.bxS()) {
            return Tgh.Qhi().Qhi(this.ROR, this.Sf);
        }
        return Tgh.Qhi().cJ(this.ROR, this.Sf);
    }

    private void iMK() {
        if (this.ABk.bxS()) {
            Tgh.Qhi().cJ(this.f8251ac);
        } else {
            Tgh.Qhi().ac(this.f8251ac);
        }
    }

    private void zc() {
        if (this.ROR == null && com.bytedance.sdk.component.adexpress.fl.Qhi() != null) {
            this.ROR = com.bytedance.sdk.component.adexpress.fl.Qhi();
        }
        if (this.ROR != null) {
            SSWebView ABk = ABk();
            this.f8251ac = ABk;
            if (ABk == null) {
                this.f8251ac = new SSWebView(new MutableContextWrapper(this.ROR.getApplicationContext()));
            } else {
                this.Gm = true;
            }
        }
    }

    public void CJ() {
        if (this.Tgh.get()) {
            return;
        }
        this.Tgh.set(true);
        ROR();
        if (this.f8251ac.getParent() != null) {
            ((ViewGroup) this.f8251ac.getParent()).removeView(this.f8251ac);
        }
        if (this.cJ) {
            iMK();
        } else {
            Tgh.Qhi().fl(this.f8251ac);
        }
    }

    public iMK Gm() {
        return this.ABk;
    }

    public abstract void ROR();

    public void Sf() {
        hm();
        Activity Qhi = com.bytedance.sdk.component.utils.cJ.Qhi(this.f8251ac);
        if (Qhi != null) {
            this.pA = cJ(Qhi);
        }
    }

    public void Tgh() {
        if (Qhi() == null) {
            return;
        }
        try {
            Qhi().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    public int ac() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    /* renamed from: cJ */
    public SSWebView fl() {
        return Qhi();
    }

    public abstract void cJ(int i10);

    private int cJ(Activity activity) {
        return activity.hashCode();
    }

    public void Qhi(String str) {
        this.f8253hm = str;
    }

    public SSWebView Qhi() {
        return this.f8251ac;
    }

    public void cJ(boolean z10) {
        this.hpZ = z10;
    }

    public void Qhi(hm hmVar) {
        this.f8254zc = hmVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.fl
    public void Qhi(Sf sf2) {
        this.WAv = sf2;
        if (Qhi() != null && Qhi().getWebView() != null) {
            if (TextUtils.isEmpty(this.f8253hm)) {
                this.WAv.Qhi(102, "url is empty");
                return;
            }
            if (!this.ABk.bxS()) {
                if (!this.hpZ && !com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.Qhi(this.Qhi)) {
                    Sf sf3 = this.WAv;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.Qhi == null);
                    sf3.Qhi(103, sb2.toString());
                    return;
                } else if (this.hpZ && !com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.cJ(this.Qhi)) {
                    Sf sf4 = this.WAv;
                    StringBuilder sb3 = new StringBuilder("choice ad data null is ");
                    sb3.append(this.Qhi == null);
                    sf4.Qhi(103, sb3.toString());
                    return;
                }
            }
            this.ABk.fl().Qhi(this.Gm);
            if (this.Gm) {
                try {
                    this.f8251ac.ABk();
                    this.ABk.fl();
                    com.bytedance.sdk.component.utils.zc.Qhi(this.f8251ac.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                    return;
                } catch (Exception e10) {
                    Tgh.Qhi().fl(this.f8251ac);
                    Sf sf5 = this.WAv;
                    sf5.Qhi(102, "load exception is " + e10.getMessage());
                    return;
                }
            }
            SSWebView Qhi = Qhi();
            Qhi.ABk();
            this.ABk.fl();
            Qhi.a_(this.f8253hm);
            return;
        }
        Sf sf6 = this.WAv;
        StringBuilder sb4 = new StringBuilder("SSWebview null is ");
        sb4.append(Qhi() == null);
        sb4.append(" or Webview is null");
        sf6.Qhi(102, sb4.toString());
    }

    public void WAv() {
    }

    public void hm() {
    }

    public void Qhi(boolean z10) {
        this.iMK = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.zc
    public void Qhi(final pA pAVar) {
        if (pAVar == null) {
            if (this.WAv != null) {
                this.WAv.Qhi(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean ac2 = pAVar.ac();
        final float CJ = (float) pAVar.CJ();
        final float fl2 = (float) pAVar.fl();
        if (CJ > 0.0f && fl2 > 0.0f) {
            this.cJ = ac2;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Qhi(pAVar, CJ, fl2);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.fl.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Qhi.this.Qhi(pAVar, CJ, fl2);
                    }
                });
            }
        } else if (this.WAv != null) {
            Sf sf2 = this.WAv;
            sf2.Qhi(105, "width is " + CJ + "height is " + fl2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(pA pAVar, float f10, float f11) {
        pAVar.Gm();
        boolean z10 = this.cJ;
        if (!z10 || this.iMK) {
            if (!z10) {
                Tgh.Qhi().fl(this.f8251ac);
                return;
            } else {
                Qhi(pAVar.Gm(), pAVar.WAv());
                return;
            }
        }
        Qhi(f10, f11);
        cJ(this.CJ);
        if (this.WAv != null) {
            this.WAv.Qhi(Qhi(), pAVar);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.cJ.zc
    public void Qhi(View view, int i10, com.bytedance.sdk.component.adexpress.ac acVar) {
        hm hmVar = this.f8254zc;
        if (hmVar != null) {
            hmVar.Qhi(view, i10, acVar);
        }
    }

    @UiThread
    private void Qhi(float f10, float f11) {
        this.ABk.fl().fl();
        int Qhi = (int) CQU.Qhi(this.ROR, f10);
        int Qhi2 = (int) CQU.Qhi(this.ROR, f11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) Qhi().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(Qhi, Qhi2);
        }
        layoutParams.width = Qhi;
        layoutParams.height = Qhi2;
        Qhi().setLayoutParams(layoutParams);
    }

    private void Qhi(int i10, String str) {
        if (this.WAv != null) {
            this.WAv.Qhi(i10, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Qhi
    public void Qhi(Activity activity) {
        if (this.pA == 0 || activity == null || activity.hashCode() != this.pA) {
            return;
        }
        CJ();
        WAv();
    }

    public void Qhi(JSONObject jSONObject) {
        this.Qhi = jSONObject;
    }
}
