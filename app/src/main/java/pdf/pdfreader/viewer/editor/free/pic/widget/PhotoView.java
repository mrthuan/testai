package pdf.pdfreader.viewer.editor.free.pic.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ea.a;
import p000do.d;
import p000do.e;
import p000do.f;
import p000do.g;
import p000do.h;
import p000do.i;
import p000do.j;
import p000do.k;
import p000do.l;

/* loaded from: classes3.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public k f26491d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView.ScaleType f26492e;

    public PhotoView(Context context) {
        this(context, null);
    }

    public k getAttacher() {
        return this.f26491d;
    }

    public RectF getDisplayRect() {
        return this.f26491d.c();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f26491d.f16286l;
    }

    public float getMaximumScale() {
        return this.f26491d.f16279e;
    }

    public float getMediumScale() {
        return this.f26491d.f16278d;
    }

    public float getMinimumScale() {
        return this.f26491d.c;
    }

    public float getScale() {
        return this.f26491d.f();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f26491d.f16296v;
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f26491d.f16280f = z10;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f26491d.h();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        k kVar = this.f26491d;
        if (kVar != null) {
            kVar.h();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        k kVar = this.f26491d;
        if (kVar != null) {
            kVar.h();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        k kVar = this.f26491d;
        if (kVar != null) {
            kVar.h();
        }
    }

    public void setMaximumScale(float f10) {
        k kVar = this.f26491d;
        l.a(kVar.c, kVar.f16278d, f10);
        kVar.f16279e = f10;
    }

    public void setMediumScale(float f10) {
        k kVar = this.f26491d;
        l.a(kVar.c, f10, kVar.f16279e);
        kVar.f16278d = f10;
    }

    public void setMinimumScale(float f10) {
        k kVar = this.f26491d;
        l.a(f10, kVar.f16278d, kVar.f16279e);
        kVar.c = f10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f26491d.f16290p = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f26491d.f16283i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f26491d.f16291q = onLongClickListener;
    }

    public void setOnMatrixChangeListener(d dVar) {
        this.f26491d.getClass();
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        this.f26491d.getClass();
    }

    public void setOnPhotoTapListener(f fVar) {
        this.f26491d.getClass();
    }

    public void setOnScaleChangeListener(g gVar) {
        this.f26491d.getClass();
    }

    public void setOnSingleFlingListener(h hVar) {
        this.f26491d.getClass();
    }

    public void setOnViewDragListener(i iVar) {
        this.f26491d.getClass();
    }

    public void setOnViewTapListener(j jVar) {
        this.f26491d.getClass();
    }

    public void setRotationBy(float f10) {
        k kVar = this.f26491d;
        kVar.f16287m.postRotate(f10 % 360.0f);
        kVar.a();
    }

    public void setRotationTo(float f10) {
        k kVar = this.f26491d;
        kVar.f16287m.setRotate(f10 % 360.0f);
        kVar.a();
    }

    public void setScale(float f10) {
        k kVar = this.f26491d;
        ImageView imageView = kVar.f16282h;
        kVar.g(f10, imageView.getRight() / 2, imageView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        boolean z10;
        k kVar = this.f26491d;
        if (kVar == null) {
            this.f26492e = scaleType;
            return;
        }
        kVar.getClass();
        if (scaleType == null) {
            z10 = false;
        } else if (l.a.f16310a[scaleType.ordinal()] != 1) {
            z10 = true;
        } else {
            throw new IllegalStateException(a.p("fmE_chp4QnMRYVhlSXQvcCEgW3Nmbix0b3MtcBlvSnRWZA==", "OXi85Imf"));
        }
        if (z10 && scaleType != kVar.f16296v) {
            kVar.f16296v = scaleType;
            kVar.h();
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f26491d.f16277b = i10;
    }

    public void setZoomable(boolean z10) {
        k kVar = this.f26491d;
        kVar.f16295u = z10;
        kVar.h();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f26491d = new k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f26492e;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f26492e = null;
        }
    }
}
