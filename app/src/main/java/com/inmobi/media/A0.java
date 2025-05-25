package com.inmobi.media;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class A0 extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ B0 f14108a;

    public A0(B0 b02) {
        this.f14108a = b02;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        kotlin.jvm.internal.g.e(drawable, "drawable");
        super.onAnimationEnd(drawable);
        this.f14108a.e();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        kotlin.jvm.internal.g.e(drawable, "drawable");
        super.onAnimationStart(drawable);
    }
}
