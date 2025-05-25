package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes2.dex */
public final class B0 implements P3 {

    /* renamed from: a  reason: collision with root package name */
    public final AnimatedImageDrawable f14138a;

    public B0(String filePath) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        kotlin.jvm.internal.g.e(filePath, "filePath");
        createSource = ImageDecoder.createSource(new File(filePath));
        decodeDrawable = ImageDecoder.decodeDrawable(createSource);
        kotlin.jvm.internal.g.c(decodeDrawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedImageDrawable");
        this.f14138a = androidx.emoji2.text.u.b(decodeDrawable);
    }

    @Override // com.inmobi.media.P3
    public final void a(O3 o32) {
    }

    @Override // com.inmobi.media.P3
    public final boolean c() {
        boolean isRunning;
        isRunning = this.f14138a.isRunning();
        return isRunning;
    }

    @Override // com.inmobi.media.P3
    public final int d() {
        int intrinsicWidth;
        intrinsicWidth = this.f14138a.getIntrinsicWidth();
        return intrinsicWidth;
    }

    public final void e() {
        this.f14138a.start();
    }

    @Override // com.inmobi.media.P3
    public final void start() {
        this.f14138a.registerAnimationCallback(new A0(this));
        this.f14138a.start();
    }

    @Override // com.inmobi.media.P3
    public final void a(boolean z10) {
    }

    @Override // com.inmobi.media.P3
    public final int a() {
        int intrinsicHeight;
        intrinsicHeight = this.f14138a.getIntrinsicHeight();
        return intrinsicHeight;
    }

    @Override // com.inmobi.media.P3
    public final void a(Canvas canvas, float f10, float f11) {
        kotlin.jvm.internal.g.b(canvas);
        canvas.translate(f10, f11);
        this.f14138a.draw(canvas);
    }

    @Override // com.inmobi.media.P3
    public final void b() {
    }
}
