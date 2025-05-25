package com.inmobi.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.A4;
import com.inmobi.media.AbstractC1692k3;
import com.inmobi.media.AbstractC1863x4;
import com.inmobi.media.B4;
import com.inmobi.media.B7;
import com.inmobi.media.C1780qb;
import com.inmobi.media.C1803s9;
import com.inmobi.media.Ha;
import com.inmobi.media.Ia;
import com.inmobi.media.N6;
import com.inmobi.media.O6;
import com.inmobi.media.Q4;
import com.inmobi.media.Q7;
import com.inmobi.media.V6;
import com.inmobi.media.Z5;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class InMobiNative {
    public static final Companion Companion = new Companion(null);

    /* renamed from: j  reason: collision with root package name */
    public static final String f14074j = "InMobiNative";

    /* renamed from: a  reason: collision with root package name */
    public final Q7 f14075a;

    /* renamed from: b  reason: collision with root package name */
    public final NativeCallbacks f14076b;
    public N6 c;

    /* renamed from: d  reason: collision with root package name */
    public VideoEventListener f14077d;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f14078e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14079f;

    /* renamed from: g  reason: collision with root package name */
    public final C1803s9 f14080g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference f14081h;

    /* renamed from: i  reason: collision with root package name */
    public LockScreenListener f14082i;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public Companion(kotlin.jvm.internal.d dVar) {
        }
    }

    /* loaded from: classes2.dex */
    public interface LockScreenListener {
        void onActionRequired(InMobiNative inMobiNative);
    }

    /* loaded from: classes2.dex */
    public static final class NativeCallbacks extends B7 {

        /* renamed from: b  reason: collision with root package name */
        private boolean f14083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeCallbacks(InMobiNative inMobiNative) {
            super(inMobiNative);
            g.e(inMobiNative, "inMobiNative");
            this.f14083b = true;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdClicked(Map<Object, ? extends Object> params) {
            g.e(params, "params");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((O6) mPubListener).f14540a.onAdClicked(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdDismissed() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((O6) mPubListener).f14540a.onAdFullScreenDismissed(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdDisplayed(AdMetaInfo info) {
            g.e(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((O6) mPubListener).f14540a.onAdFullScreenDisplayed(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            g.e(status, "status");
            onAdLoadFailed(status);
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            g.e(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                mPubListener.onAdFetchSuccessful(inMobiNative, info);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdImpressed() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((O6) mPubListener).f14540a.onAdImpressed(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdImpression(C1780qb c1780qb) {
            N6 n62;
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative != null) {
                n62 = inMobiNative.getMPubListener();
            } else {
                n62 = null;
            }
            if (n62 == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                if (c1780qb != null) {
                    c1780qb.c();
                    return;
                }
                return;
            }
            n62.onAdImpression(inMobiNative);
            if (c1780qb != null) {
                c1780qb.d();
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdLoadFailed(InMobiAdRequestStatus status) {
            g.e(status, "status");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f14083b) {
                this.f14083b = true;
                N6 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadFailed(inMobiNative, status);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdLoadSucceeded(AdMetaInfo info) {
            g.e(info, "info");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
            } else if (!this.f14083b) {
                this.f14083b = true;
                N6 mPubListener = inMobiNative.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadSucceeded(inMobiNative, info);
                }
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdWillDisplay() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            LockScreenListener lockScreenListener = inMobiNative.f14082i;
            if (lockScreenListener != null) {
                lockScreenListener.onActionRequired(inMobiNative);
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((O6) mPubListener).f14540a.onAdFullScreenWillDisplay(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAudioStateChanged(boolean z10) {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            VideoEventListener videoEventListener = inMobiNative.f14077d;
            if (videoEventListener != null) {
                videoEventListener.onAudioStateChanged(inMobiNative, z10);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onRequestPayloadCreated(byte[] request) {
            g.e(request, "request");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((O6) mPubListener).f14540a.onRequestPayloadCreated(request);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
            g.e(reason, "reason");
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((O6) mPubListener).f14540a.onRequestPayloadCreationFailed(reason);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onUserLeftApplication() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            LockScreenListener lockScreenListener = inMobiNative.f14082i;
            if (lockScreenListener != null) {
                lockScreenListener.onActionRequired(inMobiNative);
            }
            N6 mPubListener = inMobiNative.getMPubListener();
            if (mPubListener != null) {
                ((O6) mPubListener).f14540a.onUserWillLeaveApplication(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onVideoCompleted() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            VideoEventListener videoEventListener = inMobiNative.f14077d;
            if (videoEventListener != null) {
                videoEventListener.onVideoCompleted(inMobiNative);
            }
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onVideoSkipped() {
            InMobiNative inMobiNative = getNativeRef().get();
            if (inMobiNative == null) {
                String str = InMobiNative.f14074j;
                g.d(str, "access$getTAG$cp(...)");
                Z5.a((byte) 1, str, "Lost reference to InMobiNative! callback cannot be given");
                return;
            }
            VideoEventListener videoEventListener = inMobiNative.f14077d;
            if (videoEventListener != null) {
                videoEventListener.onVideoSkipped(inMobiNative);
            }
        }

        public final void resetHasGivenCallbackFlag() {
            this.f14083b = false;
        }
    }

    public InMobiNative(Context context, long j10, NativeAdEventListener listener) {
        g.e(context, "context");
        g.e(listener, "listener");
        C1803s9 c1803s9 = new C1803s9();
        this.f14080g = c1803s9;
        if (Ha.q()) {
            c1803s9.f15448a = j10;
            this.f14081h = new WeakReference(context);
            this.c = new O6(listener);
            NativeCallbacks nativeCallbacks = new NativeCallbacks(this);
            this.f14076b = nativeCallbacks;
            this.f14075a = new Q7(nativeCallbacks);
            return;
        }
        String TAG = f14074j;
        g.d(TAG, "TAG");
        throw new SdkNotInitializedException(TAG);
    }

    public final boolean a(boolean z10) {
        if (!z10 && this.c == null) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Listener supplied is null, your call is ignored.");
            return false;
        } else if (this.f14081h.get() != null) {
            return true;
        } else {
            String TAG2 = f14074j;
            g.d(TAG2, "TAG");
            Z5.a((byte) 1, TAG2, "Context supplied is null, your call is ignored.");
            return false;
        }
    }

    public final void destroy() {
        View view;
        try {
            WeakReference weakReference = this.f14078e;
            if (weakReference == null) {
                view = null;
            } else {
                view = (View) weakReference.get();
            }
            if (view != null) {
                ((ViewGroup) view).removeAllViews();
            }
            this.f14075a.x();
            this.c = null;
            this.f14077d = null;
            this.f14079f = false;
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Failed to destroy ad; SDK encountered an unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final String getAdCtaText() {
        try {
            return this.f14075a.y();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not get the ctaText; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return null;
        }
    }

    public final String getAdDescription() {
        try {
            return this.f14075a.z();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not get the description; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return null;
        }
    }

    public final String getAdIconUrl() {
        try {
            return this.f14075a.A();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not get the iconUrl; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return null;
        }
    }

    public final String getAdLandingPageUrl() {
        try {
            return this.f14075a.B();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not get the adLandingPageUrl; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return null;
        }
    }

    public final float getAdRating() {
        try {
            return this.f14075a.C();
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            Z5.a((byte) 1, "InMobi", "Could not get rating; SDK encountered an unexpected error");
            String TAG = f14074j;
            g.d(TAG, "TAG");
            return 0.0f;
        }
    }

    public final String getAdTitle() {
        try {
            return this.f14075a.D();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not get the ad title; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return null;
        }
    }

    public final JSONObject getCustomAdContent() {
        try {
            return this.f14075a.E();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not get the ad customJson ; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return null;
        }
    }

    public final N6 getMPubListener() {
        return this.c;
    }

    public final View getPrimaryViewOfWidth(Context context, View view, ViewGroup viewGroup, int i10) {
        V6 v62;
        try {
            if (context == null) {
                String TAG = f14074j;
                g.d(TAG, "TAG");
                Z5.a((byte) 1, TAG, "View can not be rendered using null context");
                return null;
            }
            if (this.f14075a.j() == null) {
                v62 = null;
            } else {
                v62 = (V6) this.f14075a.j();
            }
            if (v62 == null) {
                String TAG2 = f14074j;
                g.d(TAG2, "TAG");
                Z5.a((byte) 1, TAG2, "InMobiNative is not initialized. Ignoring InMobiNative.getPrimaryView()");
                return null;
            }
            this.f14081h = new WeakReference(context);
            v62.a(context);
            g.b(viewGroup);
            WeakReference weakReference = new WeakReference(v62.a(view, viewGroup, i10));
            this.f14078e = weakReference;
            View view2 = (View) weakReference.get();
            if (view2 == null) {
                String TAG3 = f14074j;
                g.d(TAG3, "TAG");
                return null;
            }
            this.f14079f = true;
            return view2;
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            Z5.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            String TAG4 = f14074j;
            g.d(TAG4, "TAG");
            return null;
        }
    }

    public final void getSignals() {
        if (a(false)) {
            this.f14076b.resetHasGivenCallbackFlag();
            Context context = (Context) this.f14081h.get();
            if (context != null) {
                this.f14075a.a(this.f14080g, context, false, "getToken");
            }
            this.f14075a.a(this.f14076b);
        }
    }

    public final boolean isAppDownload() {
        try {
            return this.f14075a.G();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not get isAppDownload; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return false;
        }
    }

    public final boolean isReady() {
        return this.f14075a.F();
    }

    public final Boolean isVideo() {
        try {
            return this.f14075a.I();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not get isVideo; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
            return null;
        }
    }

    public final void load(byte[] bArr) {
        if (a(false)) {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC1692k3.c((Context) this.f14081h.get());
            }
            this.f14080g.f15451e = "AB";
            Context context = (Context) this.f14081h.get();
            if (context != null) {
                this.f14075a.a(this.f14080g, context, true, "native");
            }
            this.f14076b.resetHasGivenCallbackFlag();
            this.f14075a.a(bArr, this.f14076b);
        }
    }

    public final void pause() {
        try {
            this.f14075a.K();
        } catch (Exception unused) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    public final void reportAdClickAndOpenLandingPage() {
        try {
            this.f14075a.L();
        } catch (Exception e10) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "reportAdClickAndOpenLandingPage failed; SDK encountered unexpected error");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public final void resume() {
        try {
            this.f14075a.M();
        } catch (Exception unused) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void setContentUrl(String str) {
        this.f14080g.f15452f = str;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            Ia.a(map.get("tp"));
            Ia.b(map.get("tp-v"));
        }
        this.f14080g.c = map;
    }

    public final void setKeywords(String str) {
        this.f14080g.f15449b = str;
    }

    public final void setListener(NativeAdEventListener listener) {
        g.e(listener, "listener");
        this.c = new O6(listener);
    }

    public final void setMPubListener(N6 n62) {
        this.c = n62;
    }

    public final void setPrimaryViewReturned(boolean z10) {
        this.f14079f = z10;
    }

    public final void setVideoEventListener(VideoEventListener listener) {
        g.e(listener, "listener");
        this.f14077d = listener;
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        g.e(lockScreenListener, "lockScreenListener");
        if (this.f14081h.get() == null) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "InMobiNative is not initialized. Provided context is null. Ignoring showOnLockScreen");
            return;
        }
        try {
            Q7 q72 = this.f14075a;
            C1803s9 c1803s9 = this.f14080g;
            Object obj = this.f14081h.get();
            g.b(obj);
            q72.a(c1803s9, (Context) obj);
            this.f14082i = lockScreenListener;
        } catch (Exception unused) {
            String TAG2 = f14074j;
            g.d(TAG2, "TAG");
            Z5.a((byte) 1, TAG2, "SDK encountered unexpected error in showOnLockScreen");
        }
    }

    public final void takeAction() {
        try {
            this.f14075a.N();
        } catch (Exception unused) {
            String TAG = f14074j;
            g.d(TAG, "TAG");
            Z5.a((byte) 1, TAG, "SDK encountered unexpected error in takeAction");
        }
    }

    public final void load() {
        try {
            if (a(true)) {
                this.f14076b.resetHasGivenCallbackFlag();
                if (this.f14079f) {
                    Q7 q72 = this.f14075a;
                    q72.a(q72.j(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
                    String TAG = f14074j;
                    g.d(TAG, "TAG");
                    Z5.a((byte) 1, TAG, "You can call load() on an instance of InMobiNative only once if the ad request has been successful. Ignoring InMobiNative.load()");
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC1692k3.c((Context) this.f14081h.get());
                }
                this.f14080g.f15451e = "NonAB";
                Context context = (Context) this.f14081h.get();
                if (context != null) {
                    this.f14075a.a(this.f14080g, context, true, "native");
                }
                this.f14075a.J();
            }
        } catch (Exception e10) {
            this.f14075a.a((short) 2192);
            N6 n62 = this.c;
            if (n62 != null) {
                n62.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            A4 p10 = this.f14075a.p();
            if (p10 != null) {
                String TAG2 = f14074j;
                g.d(TAG2, "TAG");
                ((B4) p10).a(TAG2, "Load failed with unexpected error: ", e10);
            }
        }
    }

    public final void load(Context context) {
        g.e(context, "context");
        if (a(true)) {
            this.f14081h = new WeakReference(context);
            load();
        }
    }
}
