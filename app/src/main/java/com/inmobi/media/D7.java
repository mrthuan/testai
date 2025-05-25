package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class D7 extends C1598d7 {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference f14200a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, "context");
    }

    public final M6 getNativeStrandAd() {
        WeakReference weakReference = this.f14200a;
        if (weakReference != null) {
            return (M6) weakReference.get();
        }
        return null;
    }

    public final void setNativeStrandAd(M6 m62) {
        this.f14200a = new WeakReference(m62);
    }
}
