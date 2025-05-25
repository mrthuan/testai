package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: com.inmobi.media.s3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1797s3 extends B1 implements A9 {

    /* renamed from: b  reason: collision with root package name */
    public long f15429b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15430d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15431e;

    /* renamed from: f  reason: collision with root package name */
    public final A4 f15432f;

    /* renamed from: g  reason: collision with root package name */
    public final C1772q3 f15433g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15434h;

    /* renamed from: i  reason: collision with root package name */
    public final AdConfig.RenderingConfig f15435i;

    /* renamed from: j  reason: collision with root package name */
    public final tf.c f15436j;

    /* renamed from: k  reason: collision with root package name */
    public L5 f15437k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797s3(Context context, long j10, String placementType, String impressionId, String creativeId, A4 a42) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(placementType, "placementType");
        kotlin.jvm.internal.g.e(impressionId, "impressionId");
        kotlin.jvm.internal.g.e(creativeId, "creativeId");
        this.f15429b = j10;
        this.c = placementType;
        this.f15430d = impressionId;
        this.f15431e = creativeId;
        this.f15432f = a42;
        this.f15434h = "s3";
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        this.f15435i = ((AdConfig) AbstractC1773q4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getRendering();
        this.f15436j = kotlin.a.a(C1784r3.f15402a);
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        AdConfig adConfig = (AdConfig) AbstractC1773q4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        C1772q3 c1772q3 = new C1772q3("IN_CUSTOM_EXPAND", a42);
        this.f15433g = c1772q3;
        setWebViewClient(c1772q3);
    }

    private final AdConfig getAdConfig() {
        return (AdConfig) this.f15436j.getValue();
    }

    @Override // com.inmobi.media.A9
    public final void a(String triggerApi) {
        kotlin.jvm.internal.g.e(triggerApi, "triggerApi");
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.f15431e);
        hashMap.put("trigger", triggerApi);
        hashMap.put("impressionId", this.f15430d);
        hashMap.put("adType", this.c);
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("BlockAutoRedirection", hashMap, EnumC1686jb.f15238a);
    }

    @Override // com.inmobi.media.A9
    public final boolean d() {
        boolean z10;
        String TAG = this.f15434h;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        if (getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < this.f15435i.getUserTouchResetTime()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.f15435i.getAutoRedirectionEnforcement() || z10) {
            return true;
        }
        return false;
    }

    @Override // com.inmobi.media.B1
    public final D5 f() {
        E5 e52 = new E5(true, "DEFAULT", getAdConfig().isCCTEnabled());
        Context context = getContext();
        A4 a42 = this.f15432f;
        L5 l52 = this.f15437k;
        kotlin.jvm.internal.g.b(context);
        return new D5(context, e52, null, null, this, l52, a42);
    }

    public final L5 getLandingPageTelemetryMetaData() {
        return this.f15437k;
    }

    @Override // com.inmobi.media.A9
    public long getViewTouchTimestamp() {
        return this.f15429b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String data, String str, String str2) {
        kotlin.jvm.internal.g.e(data, "data");
        super.loadData(data, str, str2);
        C1772q3 c1772q3 = this.f15433g;
        if (c1772q3 != null) {
            c1772q3.f14156d = true;
        } else {
            kotlin.jvm.internal.g.i("embeddedBrowserViewClient");
            throw null;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        kotlin.jvm.internal.g.e(url, "url");
        super.loadUrl(url);
        C1772q3 c1772q3 = this.f15433g;
        if (c1772q3 != null) {
            c1772q3.f14156d = true;
        } else {
            kotlin.jvm.internal.g.i("embeddedBrowserViewClient");
            throw null;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryMetaData(L5 l52) {
        this.f15437k = l52;
    }

    public void setViewTouchTimestamp(long j10) {
        this.f15429b = j10;
    }
}
