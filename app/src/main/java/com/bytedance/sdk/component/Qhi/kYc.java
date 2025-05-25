package com.bytedance.sdk.component.Qhi;

import android.webkit.WebView;
import com.bytedance.component.sdk.annotation.UiThread;
import com.bytedance.sdk.component.Qhi.fl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsBridge2.java */
/* loaded from: classes.dex */
public class kYc {
    static bxS Qhi;
    private final Gm CJ;
    private volatile boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final WebView f7993ac;
    private final Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final List<pA> f7994fl;

    public kYc(Gm gm2) {
        ArrayList arrayList = new ArrayList();
        this.f7994fl = arrayList;
        this.Tgh = false;
        this.CJ = gm2;
        if (gm2.Sf && Qhi != null) {
            throw null;
        }
        if (gm2.Qhi != null) {
            Qhi qhi = gm2.cJ;
            if (qhi == null) {
                this.cJ = new pM();
            } else {
                this.cJ = qhi;
            }
        } else {
            this.cJ = gm2.cJ;
        }
        this.cJ.Qhi(gm2, (EBS) null);
        this.f7993ac = gm2.Qhi;
        arrayList.add(gm2.WAv);
        CQU.Qhi(gm2.ROR);
    }

    public static Gm Qhi(WebView webView) {
        return new Gm(webView);
    }

    private void cJ() {
        if (this.Tgh) {
            WAv.Qhi(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public kYc Qhi(String str, Tgh<?, ?> tgh) {
        return Qhi(str, (String) null, tgh);
    }

    @UiThread
    public kYc Qhi(String str, String str2, Tgh<?, ?> tgh) {
        cJ();
        this.cJ.ROR.Qhi(str, tgh);
        return this;
    }

    public kYc Qhi(String str, fl.cJ cJVar) {
        return Qhi(str, (String) null, cJVar);
    }

    @UiThread
    public kYc Qhi(String str, String str2, fl.cJ cJVar) {
        cJ();
        this.cJ.ROR.Qhi(str, cJVar);
        return this;
    }

    public void Qhi() {
        if (this.Tgh) {
            return;
        }
        this.cJ.cJ();
        this.Tgh = true;
        Iterator<pA> it = this.f7994fl.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
