package com.inmobi.media;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.util.Map;
import lib.zj.office.fc.hssf.record.chart.ChartStartBlockRecord;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Kb extends AbstractC1689k0 {

    /* renamed from: h  reason: collision with root package name */
    public static final Jb f14402h = new Jb();

    /* renamed from: i  reason: collision with root package name */
    private static final String f14403i = "Kb";

    /* renamed from: j  reason: collision with root package name */
    public static final String f14404j = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: ";

    /* renamed from: k  reason: collision with root package name */
    public static final String f14405k = "Ad show is already called. Please wait for the the ad to be shown.";

    /* renamed from: l  reason: collision with root package name */
    public static final String f14406l = "preload() and load() cannot be called on the same instance, please use a different instance.";

    /* renamed from: m  reason: collision with root package name */
    public static final String f14407m = "Please make an ad request first in order to start loading the ad.";

    /* renamed from: n  reason: collision with root package name */
    public static final String f14408n = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: ";

    /* renamed from: a  reason: collision with root package name */
    private byte f14409a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f14410b;
    private PublisherCallbacks c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f14411d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    private AdMetaInfo f14412e;

    /* renamed from: f  reason: collision with root package name */
    private A4 f14413f;

    /* renamed from: g  reason: collision with root package name */
    private WatermarkData f14414g;

    public final void a(byte b10) {
        this.f14409a = b10;
    }

    public final void b(PublisherCallbacks publisherCallbacks) {
        this.c = publisherCallbacks;
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void c(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdLoadSucceeded " + this);
        }
        this.f14412e = info;
        AbstractC1846w0 j10 = j();
        if (j10 != null) {
            j10.b((byte) 1);
        }
    }

    public final void d(AdMetaInfo adMetaInfo) {
        this.f14412e = adMetaInfo;
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void e() {
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdWillShow " + this);
        }
        byte b10 = this.f14409a;
        if (b10 != 4 && b10 != 5) {
            this.f14411d.post(new androidx.appcompat.widget.y0(this, 9));
            A4 a43 = this.f14413f;
            if (a43 != null) {
                String TAG2 = f14403i;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).d(TAG2, "AdManager state - WILL_DISPLAY");
            }
            this.f14409a = (byte) 4;
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void h() {
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onUserLeftApplication " + this);
        }
        this.f14411d.post(new androidx.activity.i(this, 6));
    }

    public abstract AbstractC1846w0 j();

    public final JSONObject k() {
        JSONObject bidInfo;
        AdMetaInfo adMetaInfo = this.f14412e;
        if (adMetaInfo == null || (bidInfo = adMetaInfo.getBidInfo()) == null) {
            return new JSONObject();
        }
        return bidInfo;
    }

    public final PublisherCallbacks l() {
        return this.c;
    }

    public final String m() {
        String creativeID;
        AdMetaInfo adMetaInfo = this.f14412e;
        if (adMetaInfo == null || (creativeID = adMetaInfo.getCreativeID()) == null) {
            return "";
        }
        return creativeID;
    }

    public final AdMetaInfo n() {
        return this.f14412e;
    }

    public final byte o() {
        if (v()) {
            return (byte) 2;
        }
        return (byte) 1;
    }

    public final A4 p() {
        return this.f14413f;
    }

    public final byte q() {
        return this.f14409a;
    }

    public final Handler s() {
        return this.f14411d;
    }

    public final WatermarkData t() {
        return this.f14414g;
    }

    public final Boolean u() {
        return this.f14410b;
    }

    public final boolean v() {
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1) {
            return true;
        }
        return false;
    }

    public void w() {
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "submitAdLoadCalled " + this);
        }
        AbstractC1846w0 j10 = j();
        if (j10 != null) {
            j10.t0();
        }
    }

    public final void a(Boolean bool) {
        this.f14410b = bool;
    }

    public final void b(WatermarkData watermarkData) {
        this.f14414g = watermarkData;
    }

    public final void a(A4 a42) {
        this.f14413f = a42;
    }

    public final void b(AbstractC1846w0 abstractC1846w0, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onLoadFailure " + this);
        }
        A4 a43 = this.f14413f;
        if (a43 != null) {
            String TAG2 = f14403i;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).d(TAG2, "AdManager state - LOAD_FAILED");
        }
        this.f14409a = (byte) 3;
        this.f14411d.post(new v4.a(1, abstractC1846w0, this, status));
    }

    public static final void a(AbstractC1846w0 abstractC1846w0, Kb this$0, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(status, "$status");
        if (abstractC1846w0 != null) {
            abstractC1846w0.b((byte) 1);
        }
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(status);
        }
        A4 a43 = this$0.f14413f;
        if (a43 != null) {
            ((B4) a43).a();
        }
    }

    public static final void c(Kb this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void b(AdMetaInfo info) {
        AbstractC1846w0 j10;
        kotlin.jvm.internal.g.e(info, "info");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdFetchSuccess " + this);
        }
        A4 a43 = this.f14413f;
        if (a43 != null) {
            String TAG2 = f14403i;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).d(TAG2, "AdManager state - FETCHED");
        }
        this.f14409a = (byte) 7;
        if (!v() || (j10 = j()) == null) {
            return;
        }
        j10.b((byte) 2);
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdFetchFailed " + this);
        }
        this.f14409a = (byte) 3;
        this.f14411d.post(new f0.s(8, this, status));
    }

    public static final void a(Kb this$0, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(status, "$status");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(status);
        }
        A4 a43 = this$0.f14413f;
        if (a43 != null) {
            ((B4) a43).a();
        }
    }

    public static final void b(Kb this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(AdMetaInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdDisplayed " + this);
        }
        if (this.f14409a != 5) {
            this.f14412e = info;
            this.f14411d.post(new androidx.fragment.app.a1(4, this, info));
            A4 a43 = this.f14413f;
            if (a43 != null) {
                String TAG2 = f14403i;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).d(TAG2, "AdManager state - DISPLAYED");
            }
            this.f14409a = (byte) 5;
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void b(Map<Object, ? extends Object> rewards) {
        kotlin.jvm.internal.g.e(rewards, "rewards");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdRewardActionCompleted " + this);
        }
        this.f14411d.post(new com.facebook.appevents.g(5, this, rewards));
    }

    public static final void b(Kb this$0, Map rewards) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(rewards, "$rewards");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(rewards);
        }
    }

    public static /* synthetic */ void r() {
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void b(InMobiAdRequestStatus reason) {
        kotlin.jvm.internal.g.e(reason, "reason");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onRequestCreationFailed " + this);
        }
        this.f14411d.post(new com.facebook.appevents.g(4, this, reason));
    }

    public static final void a(Kb this$0, AdMetaInfo info) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(info, "$info");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(info);
        }
    }

    public static final void b(Kb this$0, InMobiAdRequestStatus reason) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(reason, "$reason");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onRequestPayloadCreationFailed");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRequestPayloadCreationFailed(reason);
        }
        A4 a43 = this$0.f14413f;
        if (a43 != null) {
            ((B4) a43).a();
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(AbstractC1846w0 abstractC1846w0, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.g.e(status, "status");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdLoadFailed " + this);
        }
        b(abstractC1846w0, status);
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void b() {
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdDismissed " + this);
        }
        this.f14411d.post(new androidx.appcompat.widget.z0(this, 6));
        A4 a43 = this.f14413f;
        if (a43 != null) {
            ((B4) a43).a();
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(Map<Object, ? extends Object> params) {
        kotlin.jvm.internal.g.e(params, "params");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdInteraction " + this);
        }
        this.f14411d.post(new l.r(9, this, params));
    }

    public static final void a(Kb this$0, Map params) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(params, "$params");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(params);
        }
    }

    public final void a(PublisherCallbacks callbacks) {
        kotlin.jvm.internal.g.e(callbacks, "callbacks");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "getSignals " + this);
        }
        if (j() != null) {
            AbstractC1846w0 j10 = j();
            if (j10 != null) {
                j10.y0();
            }
            this.c = callbacks;
            AbstractC1846w0 j11 = j();
            if (j11 != null) {
                j11.P();
            }
        }
    }

    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        AbstractC1846w0 j10;
        AbstractC1846w0 j11;
        kotlin.jvm.internal.g.e(callbacks, "callbacks");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "load " + this);
        }
        if (kotlin.jvm.internal.g.a(this.f14410b, Boolean.TRUE)) {
            Z5.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            A4 a43 = this.f14413f;
            if (a43 != null) {
                String TAG2 = f14403i;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).a(TAG2, "Cannot call load(byte[]) API after load() API is called");
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            AbstractC1846w0 j12 = j();
            if (j12 != null) {
                j12.a((short) 2140);
                return;
            }
            return;
        }
        this.f14410b = Boolean.FALSE;
        this.f14409a = (byte) 1;
        A4 a44 = this.f14413f;
        if (a44 != null && (j11 = j()) != null) {
            j11.a(a44);
        }
        if (j() == null || (j10 = j()) == null || !j10.e((byte) 1)) {
            return;
        }
        A4 a45 = this.f14413f;
        if (a45 != null) {
            String TAG3 = f14403i;
            kotlin.jvm.internal.g.d(TAG3, "TAG");
            ((B4) a45).a(TAG3, "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.c = callbacks;
        AbstractC1846w0 j13 = j();
        if (j13 != null) {
            j13.a(bArr);
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(byte[] request) {
        kotlin.jvm.internal.g.e(request, "request");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onRequestCreated " + this);
        }
        this.f14411d.post(new androidx.fragment.app.g(7, this, request));
    }

    public static final void a(Kb this$0, byte[] request) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(request, "$request");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onRequestPayloadCreated");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRequestPayloadCreated(request);
        }
        A4 a43 = this$0.f14413f;
        if (a43 != null) {
            ((B4) a43).a();
        }
    }

    public void a(WatermarkData watermarkData) {
        kotlin.jvm.internal.g.e(watermarkData, "watermarkData");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String str = f14403i;
            StringBuilder a10 = A5.a(str, "TAG", "setWatermark - ");
            a10.append(watermarkData.getWatermarkBase64EncodedString());
            ((B4) a42).c(str, a10.toString());
        }
        this.f14414g = watermarkData;
    }

    @SuppressLint({"SwitchIntDef"})
    public final boolean a(String tag, String placementString, PublisherCallbacks publisherCallbacks) {
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(placementString, "placementString");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            ((B4) a42).c(tag, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, f14406l);
            A4 a43 = this.f14413f;
            if (a43 != null) {
                ((B4) a43).b(tag, f14406l);
            }
            AbstractC1846w0 j10 = j();
            if (j10 != null) {
                j10.a((short) 2005);
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b10 = this.f14409a;
        if (b10 == 8) {
            Z5.a((byte) 1, tag, f14408n.concat(placementString));
            A4 a44 = this.f14413f;
            if (a44 != null) {
                ((B4) a44).b(tag, f14408n.concat(placementString));
            }
            AbstractC1846w0 j11 = j();
            if (j11 != null) {
                j11.a((short) 2002);
                return false;
            }
            return false;
        } else if (b10 == 1) {
            Z5.a((byte) 1, tag, f14408n.concat(placementString));
            A4 a45 = this.f14413f;
            if (a45 != null) {
                ((B4) a45).b(tag, f14408n.concat(placementString));
            }
            AbstractC1846w0 j12 = j();
            if (j12 != null) {
                j12.a((short) 2001);
                return false;
            }
            return false;
        } else if (b10 != 5) {
            if (b10 != 0) {
            }
            return true;
        } else {
            Z5.a((byte) 1, tag, f14404j.concat(placementString));
            A4 a46 = this.f14413f;
            if (a46 != null) {
                ((B4) a46).b(tag, f14404j.concat(placementString));
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            AbstractC1846w0 j13 = j();
            if (j13 != null) {
                j13.b((short) 2003);
                return false;
            }
            return false;
        }
    }

    public final boolean a(String tag, String placementString) {
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(placementString, "placementString");
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "canRender " + this);
        }
        byte b10 = this.f14409a;
        if (b10 == 1) {
            Z5.a((byte) 1, tag, f14408n.concat(placementString));
            A4 a43 = this.f14413f;
            if (a43 != null) {
                String TAG2 = f14403i;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                ((B4) a43).b(TAG2, "adload in progress");
            }
            AbstractC1846w0 j10 = j();
            if (j10 != null) {
                j10.b((short) 2129);
                return false;
            }
            return false;
        } else if (b10 == 8) {
            Z5.a((byte) 1, tag, f14408n.concat(placementString));
            A4 a44 = this.f14413f;
            if (a44 != null) {
                String TAG3 = f14403i;
                kotlin.jvm.internal.g.d(TAG3, "TAG");
                ((B4) a44).b(TAG3, "ad loading into view is in progress");
            }
            AbstractC1846w0 j11 = j();
            if (j11 != null) {
                j11.b((short) 2164);
                return false;
            }
            return false;
        } else if (b10 == 5) {
            Z5.a((byte) 1, tag, f14404j.concat(placementString));
            A4 a45 = this.f14413f;
            if (a45 != null) {
                String TAG4 = f14403i;
                kotlin.jvm.internal.g.d(TAG4, "TAG");
                ((B4) a45).b(TAG4, "ad active before renderAd");
            }
            AbstractC1846w0 j12 = j();
            if (j12 != null) {
                j12.b(ChartStartBlockRecord.sid);
            }
            AbstractC1846w0 j13 = j();
            if (j13 != null) {
                j13.m0();
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            return false;
        } else if (b10 == 7) {
            return true;
        } else {
            A4 a46 = this.f14413f;
            if (a46 != null) {
                String TAG5 = f14403i;
                kotlin.jvm.internal.g.d(TAG5, "TAG");
                ((B4) a46).b(TAG5, "ad in illegal state");
            }
            AbstractC1846w0 j14 = j();
            if (j14 != null) {
                j14.b((short) 2165);
            }
            AbstractC1846w0 j15 = j();
            if (j15 != null) {
                j15.m0();
            }
            b(j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            throw new IllegalStateException(f14407m);
        }
    }

    public static final void a(Kb this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        A4 a43 = this$0.f14413f;
        if (a43 != null) {
            String TAG2 = f14403i;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).b(TAG2, "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(C1780qb c1780qb) {
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "onAdImpression " + this);
        }
        this.f14411d.post(new f0.s(7, this, c1780qb));
    }

    public static final void a(Kb this$0, C1780qb c1780qb) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (this$0.c == null) {
            A4 a42 = this$0.f14413f;
            if (a42 != null) {
                String TAG = f14403i;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                ((B4) a42).b(TAG, "callback is null");
            }
            if (c1780qb != null) {
                c1780qb.c();
                return;
            }
            return;
        }
        A4 a43 = this$0.f14413f;
        if (a43 != null) {
            String TAG2 = f14403i;
            kotlin.jvm.internal.g.d(TAG2, "TAG");
            ((B4) a43).a(TAG2, "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c1780qb);
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(EnumC1648h1 audioStatusInternal) {
        kotlin.jvm.internal.g.e(audioStatusInternal, "audioStatusInternal");
        this.f14411d.post(new n0.g(8, this, audioStatusInternal));
    }

    public static final void a(Kb this$0, EnumC1648h1 audioStatusInternal) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(audioStatusInternal, "$audioStatusInternal");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String str = f14403i;
            StringBuilder a10 = A5.a(str, "TAG", "callback - onAudioStatusChanged - ");
            a10.append(audioStatusInternal.f15118a);
            ((B4) a42).a(str, a10.toString());
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(audioStatusInternal);
        }
    }

    @Override // com.inmobi.media.AbstractC1689k0
    public void a(String log) {
        kotlin.jvm.internal.g.e(log, "log");
        this.f14411d.post(new l.r(10, this, log));
    }

    public static final void a(Kb this$0, String log) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(log, "$log");
        A4 a42 = this$0.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).a(TAG, "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = this$0.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(log);
        }
    }

    public void a(short s4) {
        A4 a42 = this.f14413f;
        if (a42 != null) {
            String TAG = f14403i;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            ((B4) a42).c(TAG, "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC1846w0 j10 = j();
        if (j10 != null) {
            j10.a(s4);
        }
    }
}
