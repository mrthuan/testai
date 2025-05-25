package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.emoji2.text.u;
import androidx.window.layout.k;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.ROR;
import java.io.File;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class GifView extends ImageView {
    private volatile boolean ABk;
    private int CJ;
    private int Gm;
    private int Qhi;
    private boolean ROR;
    private float Sf;
    private boolean Tgh;
    private float WAv;

    /* renamed from: ac  reason: collision with root package name */
    private long f9248ac;
    private Movie cJ;

    /* renamed from: fl  reason: collision with root package name */
    private AnimatedImageDrawable f9249fl;

    /* renamed from: hm  reason: collision with root package name */
    private float f9250hm;
    private boolean iMK;
    private boolean pA;

    /* renamed from: zc  reason: collision with root package name */
    private int f9251zc;

    public GifView(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Tgh = z10;
        this.ROR = false;
        this.iMK = true;
        this.pA = true;
        Qhi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r2 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.ImageDecoder.Source ac(byte[] r6) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.getContext()     // Catch: java.lang.Throwable -> L34
            boolean r2 = com.bytedance.sdk.openadsdk.multipro.cJ.ac()     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto Le
            java.lang.String r2 = "GIF_AD_CACHE/"
            goto L10
        Le:
            java.lang.String r2 = "/GIF_CACHE/"
        L10:
            java.lang.String r3 = "TT_GIF_FILE"
            java.io.File r1 = Qhi(r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L34
            int r3 = r6.length     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r2.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L32
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L32
            r3 = 28
            if (r6 < r3) goto L2e
            android.graphics.ImageDecoder$Source r6 = androidx.media.p.b(r1)     // Catch: java.lang.Throwable -> L32
            r2.close()     // Catch: java.lang.Throwable -> L2d
        L2d:
            return r6
        L2e:
            r2.close()     // Catch: java.lang.Throwable -> L40
            goto L40
        L32:
            r6 = move-exception
            goto L36
        L34:
            r6 = move-exception
            r2 = r0
        L36:
            java.lang.String r1 = "GifView"
            java.lang.String r3 = "GifView  getSourceByFile fail : "
            com.bytedance.sdk.component.utils.ABk.Qhi(r1, r3, r6)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L40
            goto L2e
        L40:
            return r0
        L41:
            r6 = move-exception
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.lang.Throwable -> L47
        L47:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.GifView.ac(byte[]):android.graphics.ImageDecoder$Source");
    }

    private AnimatedImageDrawable cJ(int i10) {
        ImageDecoder.Source createSource;
        if (i10 != -1 && Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(getResources(), i10);
            return Qhi(createSource);
        }
        return null;
    }

    public void Qhi() {
        if (this.Tgh) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.cJ != null && !this.Tgh) {
            try {
                if (!this.ABk) {
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
        if (this.cJ != null && !this.Tgh) {
            this.Sf = (getWidth() - this.Gm) / 2.0f;
            this.f9250hm = (getHeight() - this.f9251zc) / 2.0f;
        }
        if (getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.iMK = z11;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Movie movie;
        float f10;
        float f11;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (!this.Tgh && (movie = this.cJ) != null) {
            int width = movie.width();
            int height = this.cJ.height();
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
            this.WAv = max;
            int i12 = (int) (width * max);
            this.Gm = i12;
            int i13 = (int) (height * max);
            this.f9251zc = i13;
            setMeasuredDimension(i12, i13);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.cJ != null) {
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            this.iMK = z10;
            cJ();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (this.cJ != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.iMK = z10;
            cJ();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (this.cJ != null) {
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.iMK = z10;
            cJ();
        }
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.pA = z10;
        if (!z10) {
            try {
                if (Build.VERSION.SDK_INT >= 28 && (animatedImageDrawable = this.f9249fl) != null) {
                    animatedImageDrawable.setRepeatCount(0);
                }
            } catch (Exception e10) {
                ABk.Qhi("GifView", "setRepeatConfig error", e10);
            }
        }
    }

    public void Qhi(int i10, boolean z10) {
        this.ABk = z10;
        this.Qhi = i10;
        if (i10 != -1) {
            if (!this.Tgh) {
                this.cJ = Qhi(i10);
            } else {
                this.f9249fl = cJ(i10);
            }
        }
    }

    private AnimatedImageDrawable cJ(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Qhi(ac(bArr));
    }

    private void cJ() {
        if (this.cJ == null || this.Tgh || !this.iMK) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public void Qhi(byte[] bArr, boolean z10) {
        this.ABk = z10;
        if (bArr != null) {
            if (!this.Tgh) {
                this.cJ = Qhi(bArr);
            } else {
                this.f9249fl = cJ(bArr);
            }
            cJ();
        }
    }

    private void ac() {
        if (this.cJ == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f9248ac == 0) {
            this.f9248ac = uptimeMillis;
        }
        int duration = this.cJ.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.pA && Math.abs(duration - this.CJ) < 60) {
            this.CJ = duration;
            this.ABk = true;
            return;
        }
        this.CJ = (int) ((uptimeMillis - this.f9248ac) % duration);
    }

    private Movie Qhi(int i10) {
        try {
            return Movie.decodeStream(getResources().openRawResource(i10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Movie Qhi(byte[] bArr) {
        try {
            return Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    private AnimatedImageDrawable Qhi(ImageDecoder.Source source) {
        Drawable decodeDrawable;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        decodeDrawable = ImageDecoder.decodeDrawable(source);
        setImageDrawable(decodeDrawable);
        if (k.h(decodeDrawable)) {
            AnimatedImageDrawable b10 = u.b(decodeDrawable);
            if (!this.ABk) {
                b10.start();
            }
            return b10;
        }
        return null;
    }

    public static File Qhi(Context context, String str, String str2) {
        return ROR.Qhi(context, com.bytedance.sdk.openadsdk.multipro.cJ.ac(), str, str2);
    }

    private void Qhi(Canvas canvas) {
        Movie movie = this.cJ;
        if (movie == null) {
            return;
        }
        movie.setTime(this.CJ);
        float f10 = this.WAv;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.cJ.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.cJ;
            float f11 = this.Sf;
            float f12 = this.WAv;
            movie2.draw(canvas, f11 / f12, this.f9250hm / f12);
        }
        canvas.restore();
    }
}
