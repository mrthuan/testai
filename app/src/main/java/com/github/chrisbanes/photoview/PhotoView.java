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
import p6.d;
import p6.e;
import p6.f;
import p6.g;
import p6.h;
import p6.i;
import p6.j;

/* loaded from: classes.dex */
public class PhotoView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public i f9859a;

    public PhotoView(Context context) {
        this(context, null);
    }

    public i getAttacher() {
        return this.f9859a;
    }

    public RectF getDisplayRect() {
        i iVar = this.f9859a;
        iVar.e();
        return iVar.f(iVar.g());
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f9859a.f23775l;
    }

    public float getMaximumScale() {
        return this.f9859a.f23768e;
    }

    public float getMediumScale() {
        return this.f9859a.f23767d;
    }

    public float getMinimumScale() {
        return this.f9859a.c;
    }

    public float getScale() {
        return this.f9859a.h();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f9859a.f23784u;
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f9859a.f23769f = z10;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f9859a.j();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        i iVar = this.f9859a;
        if (iVar != null) {
            iVar.j();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        i iVar = this.f9859a;
        if (iVar != null) {
            iVar.j();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        i iVar = this.f9859a;
        if (iVar != null) {
            iVar.j();
        }
    }

    public void setMaximumScale(float f10) {
        i iVar = this.f9859a;
        j.a(iVar.c, iVar.f23767d, f10);
        iVar.f23768e = f10;
    }

    public void setMediumScale(float f10) {
        i iVar = this.f9859a;
        j.a(iVar.c, f10, iVar.f23768e);
        iVar.f23767d = f10;
    }

    public void setMinimumScale(float f10) {
        i iVar = this.f9859a;
        j.a(f10, iVar.f23767d, iVar.f23768e);
        iVar.c = f10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9859a.f23779p = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f9859a.f23772i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f9859a.f23780q = onLongClickListener;
    }

    public void setOnMatrixChangeListener(d dVar) {
        this.f9859a.getClass();
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        this.f9859a.getClass();
    }

    public void setOnPhotoTapListener(f fVar) {
        this.f9859a.getClass();
    }

    public void setOnScaleChangeListener(g gVar) {
        this.f9859a.getClass();
    }

    public void setOnSingleFlingListener(h hVar) {
        this.f9859a.getClass();
    }

    public void setRotationBy(float f10) {
        i iVar = this.f9859a;
        iVar.f23776m.postRotate(f10 % 360.0f);
        iVar.d();
    }

    public void setRotationTo(float f10) {
        i iVar = this.f9859a;
        iVar.f23776m.setRotate(f10 % 360.0f);
        iVar.d();
    }

    public void setScale(float f10) {
        i iVar = this.f9859a;
        ImageView imageView = iVar.f23771h;
        iVar.i(f10, imageView.getRight() / 2, imageView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z10;
        i iVar = this.f9859a;
        if (iVar != null) {
            if (scaleType == null) {
                z10 = false;
            } else if (j.a.f23796a[scaleType.ordinal()] != 1) {
                z10 = true;
            } else {
                throw new IllegalStateException("Matrix scale type is not supported");
            }
            if (z10 && scaleType != iVar.f23784u) {
                iVar.f23784u = scaleType;
                iVar.j();
            }
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f9859a.f23766b = i10;
    }

    public void setZoomable(boolean z10) {
        i iVar = this.f9859a;
        iVar.f23783t = z10;
        iVar.j();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9859a = new i(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }
}
