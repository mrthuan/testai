package com.bytedance.sdk.component.Qhi;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.Qhi.zc;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Environment.java */
/* loaded from: classes.dex */
public class Gm {
    hm CJ;
    WebView Qhi;
    boolean ROR;
    boolean Sf;
    boolean Tgh;
    pA WAv;
    Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    Context f7977fl;

    /* renamed from: hm  reason: collision with root package name */
    iMK f7978hm;
    zc.Qhi hpZ;
    boolean iMK;
    boolean pA;

    /* renamed from: ac  reason: collision with root package name */
    String f7976ac = "IESJSBridge";
    String Gm = "host";

    /* renamed from: zc  reason: collision with root package name */
    final Set<String> f7979zc = new LinkedHashSet();
    final Set<String> ABk = new LinkedHashSet();

    public Gm(WebView webView) {
        this.Qhi = webView;
    }

    private void ac() {
        if ((this.Qhi != null || this.iMK || this.cJ != null) && ((!TextUtils.isEmpty(this.f7976ac) || this.Qhi == null) && this.CJ != null)) {
            return;
        }
        throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
    }

    public Gm Qhi(Qhi qhi) {
        this.cJ = qhi;
        return this;
    }

    public Gm cJ(boolean z10) {
        this.ROR = z10;
        return this;
    }

    public Gm Qhi(String str) {
        this.f7976ac = str;
        return this;
    }

    public kYc cJ() {
        ac();
        return new kYc(this);
    }

    public Gm Qhi(ABk aBk) {
        this.CJ = hm.Qhi(aBk);
        return this;
    }

    public Gm Qhi(boolean z10) {
        this.Tgh = z10;
        return this;
    }

    public Gm Qhi() {
        this.pA = true;
        return this;
    }

    public Gm() {
    }
}
