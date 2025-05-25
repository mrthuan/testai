package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class DrawableSplashScreen$DrawableSplashScreenView extends ImageView {
    public DrawableSplashScreen$DrawableSplashScreenView(Context context) {
        this(context, null, 0);
    }

    public void setSplashDrawable(Drawable drawable) {
        setScaleType(ImageView.ScaleType.FIT_XY);
        setImageDrawable(drawable);
    }

    public DrawableSplashScreen$DrawableSplashScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawableSplashScreen$DrawableSplashScreenView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
