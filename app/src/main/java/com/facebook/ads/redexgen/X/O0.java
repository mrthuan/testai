package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class O0 {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", "s", "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = O0.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0S> A03;
    public final WeakReference<O1> A04;
    public final WeakReference<C1102Rk> A05;
    public final WeakReference<C1185Up> A06;

    public O0(C1185Up c1185Up, O1 o12, C1102Rk c1102Rk, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1314Zs c1314Zs) {
        this.A06 = new WeakReference<>(c1185Up);
        this.A04 = new WeakReference<>(o12);
        this.A05 = new WeakReference<>(c1102Rk);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1314Zs.A0E());
    }

    private C0S A00() {
        C0S funnel = this.A03.get();
        if (funnel == null) {
            return new C1493co();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return LV.A01(C8N.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i10, String str) {
        A00().AHS(i10, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AHT();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AHU();
            if (this.A06.get().isShown()) {
                A00().AHV();
                new Handler(Looper.getMainLooper()).post(new C1187Ur(this.A05));
            }
            O1 o12 = this.A04.get();
            if (o12 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1013Nz(this, o12));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1185Up webView = this.A06.get();
        if (webView == null || webView.A06()) {
            A00().AHW(true);
            return;
        }
        O1 o12 = this.A04.get();
        if (o12 == null) {
            A00().AHW(true);
            return;
        }
        C0S A00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        A00.AHW(false);
        o12.ACx();
    }
}
