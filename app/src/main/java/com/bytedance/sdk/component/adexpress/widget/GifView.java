package com.bytedance.sdk.component.adexpress.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.emoji2.text.b;
import androidx.window.layout.g;
import com.bytedance.sdk.component.utils.ABk;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class GifView extends ImageView {
    private boolean ABk;
    private AnimatedImageDrawable CJ;
    private int Gm;
    private Movie Qhi;
    private float ROR;
    private float Sf;
    private boolean Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private int f8292ac;
    private long cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8293fl;

    /* renamed from: hm  reason: collision with root package name */
    private float f8294hm;
    private boolean iMK;

    /* renamed from: zc  reason: collision with root package name */
    private volatile boolean f8295zc;

    public GifView(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8293fl = z10;
        this.Tgh = false;
        this.ABk = true;
        this.iMK = true;
        Qhi();
    }

    private void ac() {
        if (this.Qhi == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.cJ == 0) {
            this.cJ = uptimeMillis;
        }
        int duration = this.Qhi.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.iMK && Math.abs(duration - this.f8292ac) < 60) {
            this.f8292ac = duration;
            this.f8295zc = true;
            return;
        }
        this.f8292ac = (int) ((uptimeMillis - this.cJ) % duration);
    }

    private void cJ() {
        if (this.Qhi != null && !this.f8293fl && this.ABk) {
            postInvalidateOnAnimation();
        }
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && g.m(drawable)) {
            AnimatedImageDrawable c = b.c(drawable);
            this.CJ = c;
            if (!this.f8295zc) {
                c.start();
            }
            if (!this.iMK) {
                c.setRepeatCount(0);
            }
        }
        cJ();
    }

    public void Qhi() {
        if (this.f8293fl) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.Qhi != null && !this.f8293fl) {
            try {
                if (!this.f8295zc) {
                    ac();
                    Qhi(canvas);
                    cJ();
                    return;
                }
                Qhi(canvas);
                return;
            } catch (Throwable th2) {
                ABk.Qhi("GifView", "onDraw->Throwable->", th2);
                return;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Qhi != null && !this.f8293fl) {
            this.ROR = (getWidth() - this.WAv) / 2.0f;
            this.Sf = (getHeight() - this.Gm) / 2.0f;
        }
        if (getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.ABk = z11;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Movie movie;
        float f10;
        float f11;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (!this.f8293fl && (movie = this.Qhi) != null) {
            int width = movie.width();
            int height = this.Qhi.height();
            if (View.MeasureSpec.getMode(i10) != 0 && width > (size2 = View.MeasureSpec.getSize(i10))) {
                f10 = width / size2;
            } else {
                f10 = 1.0f;
            }
            if (View.MeasureSpec.getMode(i11) != 0 && height > (size = View.MeasureSpec.getSize(i11))) {
                f11 = height / size;
            } else {
                f11 = 1.0f;
            }
            float max = 1.0f / Math.max(f10, f11);
            this.f8294hm = max;
            int i12 = (int) (width * max);
            this.WAv = i12;
            int i13 = (int) (height * max);
            this.Gm = i13;
            setMeasuredDimension(i12, i13);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.Qhi != null) {
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            this.ABk = z10;
            cJ();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (this.Qhi != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.ABk = z10;
            cJ();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (this.Qhi != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.ABk = z10;
            cJ();
        }
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.iMK = z10;
        if (!z10) {
            try {
                if (Build.VERSION.SDK_INT >= 28 && (animatedImageDrawable = this.CJ) != null) {
                    animatedImageDrawable.setRepeatCount(0);
                }
            } catch (Exception e10) {
                ABk.Qhi("GifView", "setRepeatConfig error", e10);
            }
        }
    }

    private void Qhi(Canvas canvas) {
        Movie movie = this.Qhi;
        if (movie == null) {
            return;
        }
        movie.setTime(this.f8292ac);
        float f10 = this.f8294hm;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.Qhi.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.Qhi;
            float f11 = this.ROR;
            float f12 = this.f8294hm;
            movie2.draw(canvas, f11 / f12, this.Sf / f12);
        }
        canvas.restore();
    }
}
