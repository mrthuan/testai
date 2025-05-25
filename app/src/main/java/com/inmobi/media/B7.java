package com.inmobi.media;

import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class B7 extends PublisherCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<InMobiNative> f14145a;

    public B7(InMobiNative inMobiNative) {
        kotlin.jvm.internal.g.e(inMobiNative, "inMobiNative");
        this.f14145a = new WeakReference<>(inMobiNative);
    }

    public final WeakReference<InMobiNative> getNativeRef() {
        return this.f14145a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        N6 mPubListener;
        kotlin.jvm.internal.g.e(log, "log");
        InMobiNative inMobiNative = this.f14145a.get();
        if (inMobiNative == null || (mPubListener = inMobiNative.getMPubListener()) == null) {
            return;
        }
        mPubListener.onImraidLog(inMobiNative, log);
    }

    public final void setNativeRef(WeakReference<InMobiNative> weakReference) {
        kotlin.jvm.internal.g.e(weakReference, "<set-?>");
        this.f14145a = weakReference;
    }
}
