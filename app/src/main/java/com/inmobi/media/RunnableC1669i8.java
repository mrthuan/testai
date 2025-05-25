package com.inmobi.media;

import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.inmobi.media.i8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1669i8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f15191a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f15192b;

    public RunnableC1669i8(Context context, ImageView imageView) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(imageView, "imageView");
        this.f15191a = new WeakReference(context);
        this.f15192b = new WeakReference(imageView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.f15191a.get();
        ImageView imageView = (ImageView) this.f15192b.get();
        if (context != null && imageView != null) {
            HashMap hashMap = C1867x8.c;
            C1655h8.a(context, imageView);
        }
    }
}
