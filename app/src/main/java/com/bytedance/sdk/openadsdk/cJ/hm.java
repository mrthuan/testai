package com.bytedance.sdk.openadsdk.cJ;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ArbitrageLandingLog.java */
/* loaded from: classes.dex */
public class hm {
    private final tP Qhi;
    private final WebView ROR;
    private int Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private int f8697fl;

    /* renamed from: hm  reason: collision with root package name */
    private long f8698hm;
    private String Sf = "landingpage";
    private final Map<Integer, Long> cJ = new HashMap();

    /* renamed from: ac  reason: collision with root package name */
    private final List<Integer> f8696ac = new ArrayList();
    private final Map<Integer, String> CJ = new HashMap();

    public hm(tP tPVar, WebView webView) {
        this.Qhi = tPVar;
        this.ROR = webView;
    }

    public void CJ(String str) {
        this.Sf = str;
    }

    public void Qhi(String str) {
        if (Qhi(true)) {
            ac.Qhi(this.Qhi, this.Sf, this.f8697fl, str);
            this.CJ.put(Integer.valueOf(this.f8697fl), str);
            this.f8698hm = SystemClock.elapsedRealtime();
        }
    }

    public void ac(String str) {
        String str2 = this.CJ.get(Integer.valueOf(this.f8697fl));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i10 = this.f8697fl;
        if (i10 > 0) {
            ac.Qhi(this.Qhi, this.Sf, i10, str3, str, 1);
        }
    }

    public void cJ(String str) {
        if (Qhi(false)) {
            ac.Qhi(this.Qhi, this.Sf, this.f8697fl, str, (float) (SystemClock.elapsedRealtime() - this.f8698hm));
        }
    }

    private void cJ(boolean z10) {
        try {
            WebBackForwardList copyBackForwardList = this.ROR.copyBackForwardList();
            if (copyBackForwardList != null) {
                if (z10) {
                    this.f8697fl = copyBackForwardList.getCurrentIndex() + 1;
                } else {
                    this.Tgh = copyBackForwardList.getCurrentIndex() + 1;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("ArbitrageLandingLog", th2.toString());
        }
    }

    public void Qhi(WebView webView, String str) {
        tP tPVar = this.Qhi;
        if (tPVar == null || !com.bytedance.sdk.component.widget.cJ.Qhi(tPVar.WAv().Qhi(), str)) {
            return;
        }
        String str2 = this.CJ.get(Integer.valueOf(this.f8697fl));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        ac.Qhi(this.Qhi, this.Sf, this.f8697fl, str2, str, 2);
    }

    private boolean Qhi(boolean z10) {
        int i10 = z10 ? this.f8697fl : this.Tgh;
        cJ(z10);
        int i11 = z10 ? this.f8697fl : this.Tgh;
        return i11 > 0 && i11 != i10;
    }
}
