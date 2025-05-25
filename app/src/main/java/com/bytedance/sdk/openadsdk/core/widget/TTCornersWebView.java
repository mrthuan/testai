package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class TTCornersWebView extends WebView {
    private int CJ;
    private int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f9278ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final float[] f9279fl;

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f9278ac = getScrollX();
        this.CJ = getScrollY();
        Path path = new Path();
        int i10 = this.CJ;
        path.addRoundRect(new RectF(0.0f, i10, this.f9278ac + this.Qhi, i10 + this.cJ), this.f9279fl, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.Qhi = getMeasuredWidth();
        this.cJ = getMeasuredHeight();
    }
}
