package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: AppCompatProgressBarHelper.java */
/* loaded from: classes.dex */
public class m {
    public static final int[] c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f2617a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f2618b;

    public m(ProgressBar progressBar) {
        this.f2617a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i10) {
        ProgressBar progressBar = this.f2617a;
        u0 m10 = u0.m(progressBar.getContext(), attributeSet, c, i10, 0);
        Drawable f10 = m10.f(0);
        if (f10 != null) {
            if (f10 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f10;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i11 = 0; i11 < numberOfFrames; i11++) {
                    Drawable b10 = b(animationDrawable.getFrame(i11), true);
                    b10.setLevel(Constants.CP_MAC_ROMAN);
                    animationDrawable2.addFrame(b10, animationDrawable.getDuration(i11));
                }
                animationDrawable2.setLevel(Constants.CP_MAC_ROMAN);
                f10 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f10);
        }
        Drawable f11 = m10.f(1);
        if (f11 != null) {
            progressBar.setProgressDrawable(b(f11, false));
        }
        m10.n();
    }

    public final Drawable b(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof p0.b) {
            p0.b bVar = (p0.b) drawable;
            Drawable b10 = bVar.b();
            if (b10 != null) {
                bVar.a(b(b10, z10));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                int id2 = layerDrawable.getId(i10);
                Drawable drawable2 = layerDrawable.getDrawable(i10);
                if (id2 != 16908301 && id2 != 16908303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                drawableArr[i10] = b(drawable2, z11);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                layerDrawable2.setId(i11, layerDrawable.getId(i11));
                layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2618b == null) {
                this.f2618b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z10) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}
