package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C1726m9;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$BooleanRef;

/* renamed from: com.inmobi.media.m9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1726m9 extends AbstractC1886z1 {

    /* renamed from: b  reason: collision with root package name */
    public final Window f15318b;
    public final AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1726m9(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        kotlin.jvm.internal.g.e(window, "window");
        kotlin.jvm.internal.g.e(config, "config");
        this.f15318b = window;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [qb.y0] */
    @Override // com.inmobi.media.X
    /* renamed from: b */
    public final Bitmap a() {
        long currentTimeMillis = System.currentTimeMillis();
        int width = this.f15318b.getDecorView().getWidth();
        int height = this.f15318b.getDecorView().getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.g.d(createBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int layerType = this.f15318b.getDecorView().getLayerType();
        this.f15318b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f15318b, rect, createBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: qb.y0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                C1726m9.a(Ref$BooleanRef.this, this, i10);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.c.get()) {
            Thread.sleep(500L);
        }
        String message = "success - " + ref$BooleanRef.element + " - time - " + (System.currentTimeMillis() - currentTimeMillis);
        kotlin.jvm.internal.g.e(message, "message");
        this.f15318b.getDecorView().setLayerType(layerType, null);
        if (!ref$BooleanRef.element) {
            return null;
        }
        return a(createBitmap);
    }

    public static final void a(Ref$BooleanRef isSuccess, C1726m9 this$0, int i10) {
        kotlin.jvm.internal.g.e(isSuccess, "$isSuccess");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (i10 == 0) {
            isSuccess.element = true;
        }
        String message = "capture result - success - " + isSuccess.element;
        kotlin.jvm.internal.g.e(message, "message");
        this$0.c.set(true);
    }
}
