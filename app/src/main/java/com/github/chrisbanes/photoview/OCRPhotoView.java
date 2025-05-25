package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import p6.b;
import p6.d;
import p6.e;
import p6.f;
import p6.g;
import p6.h;
import p6.j;

/* loaded from: classes.dex */
public class OCRPhotoView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public b f9858a;

    public OCRPhotoView(Context context) {
        this(context, null);
    }

    public b getAttacher() {
        return this.f9858a;
    }

    public RectF getDisplayRect() {
        b bVar = this.f9858a;
        bVar.e();
        return bVar.f(bVar.g());
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f9858a.f23744l;
    }

    public float getMaximumScale() {
        return this.f9858a.f23737e;
    }

    public float getMediumScale() {
        return this.f9858a.f23736d;
    }

    public float getMinimumScale() {
        return this.f9858a.c;
    }

    public float getScale() {
        return this.f9858a.h();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f9858a.f23753u;
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f9858a.f23738f = z10;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f9858a.j();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        b bVar = this.f9858a;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        b bVar = this.f9858a;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b bVar = this.f9858a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void setMaximumScale(float f10) {
        b bVar = this.f9858a;
        j.a(bVar.c, bVar.f23736d, f10);
        bVar.f23737e = f10;
    }

    public void setMediumScale(float f10) {
        b bVar = this.f9858a;
        j.a(bVar.c, f10, bVar.f23737e);
        bVar.f23736d = f10;
    }

    public void setMinimumScale(float f10) {
        b bVar = this.f9858a;
        j.a(f10, bVar.f23736d, bVar.f23737e);
        bVar.c = f10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9858a.f23748p = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f9858a.f23741i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9858a.f23749q = onLongClickListener;
    }

    public void setOnMatrixChangeListener(d dVar) {
        this.f9858a.getClass();
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        this.f9858a.getClass();
    }

    public void setOnPhotoTapListener(f fVar) {
        this.f9858a.getClass();
    }

    public void setOnScaleChangeListener(g gVar) {
        this.f9858a.getClass();
    }

    public void setOnSingleFlingListener(h hVar) {
        this.f9858a.getClass();
    }

    public void setRotationBy(float f10) {
        b bVar = this.f9858a;
        bVar.f23745m.postRotate(f10 % 360.0f);
        bVar.d();
    }

    public void setRotationTo(float f10) {
        b bVar = this.f9858a;
        bVar.f23745m.setRotate(f10 % 360.0f);
        bVar.d();
    }

    public void setScale(float f10) {
        b bVar = this.f9858a;
        ImageView imageView = bVar.f23740h;
        bVar.i(f10, imageView.getRight() / 2, imageView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z10;
        b bVar = this.f9858a;
        if (bVar != null) {
            if (scaleType == null) {
                z10 = false;
            } else if (j.a.f23796a[scaleType.ordinal()] != 1) {
                z10 = true;
            } else {
                throw new IllegalStateException("Matrix scale type is not supported");
            }
            if (z10 && scaleType != bVar.f23753u) {
                bVar.f23753u = scaleType;
                bVar.j();
            }
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f9858a.f23735b = i10;
    }

    public void setZoomable(boolean z10) {
        b bVar = this.f9858a;
        bVar.f23752t = z10;
        bVar.j();
    }

    public OCRPhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OCRPhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9858a = new b(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }
}
