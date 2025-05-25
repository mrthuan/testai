package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class Da extends AbstractC1886z1 {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f14204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Da(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        kotlin.jvm.internal.g.e(adView, "adView");
        kotlin.jvm.internal.g.e(adQualityConfig, "adQualityConfig");
        this.f14204b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.X
    public final Object a() {
        long currentTimeMillis = System.currentTimeMillis();
        View view = (View) this.f14204b.get();
        if (view != null) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.g.d(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            Drawable background = view.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            view.draw(canvas);
            String message = "success - time taken - " + (System.currentTimeMillis() - currentTimeMillis);
            kotlin.jvm.internal.g.e(message, "message");
            return a(createBitmap);
        }
        String message2 = "fail - time taken - " + (System.currentTimeMillis() - currentTimeMillis);
        kotlin.jvm.internal.g.e(message2, "message");
        return null;
    }
}
