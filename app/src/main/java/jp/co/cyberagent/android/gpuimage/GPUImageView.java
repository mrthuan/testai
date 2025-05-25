package jp.co.cyberagent.android.gpuimage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import jp.co.cyberagent.android.gpuimage.GLTextureView;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.util.Rotation;
import qf.c;
import qf.f;
import qf.h;
import rf.e;

/* loaded from: classes.dex */
public class GPUImageView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f19403a;

    /* renamed from: b  reason: collision with root package name */
    public View f19404b;
    public GPUImage c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19405d;

    /* renamed from: e  reason: collision with root package name */
    public e f19406e;

    /* renamed from: f  reason: collision with root package name */
    public float f19407f;

    /* loaded from: classes.dex */
    public class a extends GLSurfaceView {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.SurfaceView, android.view.View
        public final void onMeasure(int i10, int i11) {
            GPUImageView.this.getClass();
            super.onMeasure(i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public class b extends GLTextureView {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.View
        public final void onMeasure(int i10, int i11) {
            GPUImageView.this.getClass();
            super.onMeasure(i10, i11);
        }
    }

    public GPUImageView(Context context) {
        super(context);
        this.f19403a = 0;
        this.f19405d = true;
        this.f19407f = 0.0f;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h.f29335a, 0, 0);
            try {
                this.f19403a = obtainStyledAttributes.getInt(1, this.f19403a);
                this.f19405d = obtainStyledAttributes.getBoolean(0, this.f19405d);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.c = new GPUImage(context);
        if (this.f19403a == 1) {
            b bVar = new b(context, attributeSet);
            this.f19404b = bVar;
            GPUImage gPUImage = this.c;
            gPUImage.c = 1;
            gPUImage.f19392e = bVar;
            bVar.setEGLContextClientVersion(2);
            GLTextureView gLTextureView = gPUImage.f19392e;
            gLTextureView.getClass();
            gLTextureView.setEGLConfigChooser(new GLTextureView.b(8, 16));
            gPUImage.f19392e.setOpaque(false);
            gPUImage.f19392e.setRenderer(gPUImage.f19390b);
            gPUImage.f19392e.setRenderMode(0);
            gPUImage.f19392e.b();
        } else {
            a aVar = new a(context, attributeSet);
            this.f19404b = aVar;
            GPUImage gPUImage2 = this.c;
            gPUImage2.c = 0;
            gPUImage2.f19391d = aVar;
            aVar.setEGLContextClientVersion(2);
            gPUImage2.f19391d.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            gPUImage2.f19391d.getHolder().setFormat(1);
            gPUImage2.f19391d.setRenderer(gPUImage2.f19390b);
            gPUImage2.f19391d.setRenderMode(0);
            gPUImage2.f19391d.requestRender();
        }
        addView(this.f19404b);
    }

    public e getFilter() {
        return this.f19406e;
    }

    public GPUImage getGPUImage() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f19407f != 0.0f) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            float f10 = size;
            float f11 = this.f19407f;
            float f12 = size2;
            if (f10 / f11 < f12) {
                size2 = Math.round(f10 / f11);
            } else {
                size = Math.round(f12 * f11);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setFilter(e eVar) {
        this.f19406e = eVar;
        this.c.c(eVar);
        View view = this.f19404b;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).requestRender();
        } else if (view instanceof GLTextureView) {
            ((GLTextureView) view).b();
        }
    }

    public void setImage(Bitmap bitmap) {
        GPUImage gPUImage = this.c;
        gPUImage.f19394g = bitmap;
        jp.co.cyberagent.android.gpuimage.a aVar = gPUImage.f19390b;
        aVar.getClass();
        if (bitmap != null) {
            aVar.d(new f(aVar, bitmap));
        }
        gPUImage.b();
    }

    public void setRatio(float f10) {
        this.f19407f = f10;
        this.f19404b.requestLayout();
        GPUImage gPUImage = this.c;
        jp.co.cyberagent.android.gpuimage.a aVar = gPUImage.f19390b;
        aVar.getClass();
        aVar.d(new qf.e(aVar));
        gPUImage.f19394g = null;
        gPUImage.b();
    }

    public void setRenderMode(int i10) {
        View view = this.f19404b;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).setRenderMode(i10);
        } else if (view instanceof GLTextureView) {
            ((GLTextureView) view).setRenderMode(i10);
        }
    }

    public void setRotation(Rotation rotation) {
        jp.co.cyberagent.android.gpuimage.a aVar = this.c.f19390b;
        aVar.f19423n = rotation;
        aVar.b();
        View view = this.f19404b;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).requestRender();
        } else if (view instanceof GLTextureView) {
            ((GLTextureView) view).b();
        }
    }

    public void setScaleType(GPUImage.ScaleType scaleType) {
        GPUImage gPUImage = this.c;
        gPUImage.f19395h = scaleType;
        jp.co.cyberagent.android.gpuimage.a aVar = gPUImage.f19390b;
        aVar.f19426q = scaleType;
        aVar.d(new qf.e(aVar));
        gPUImage.f19394g = null;
        gPUImage.b();
    }

    @Deprecated
    public void setUpCamera(Camera camera) {
        GPUImage gPUImage = this.c;
        int i10 = gPUImage.c;
        if (i10 == 0) {
            gPUImage.f19391d.setRenderMode(1);
        } else if (i10 == 1) {
            gPUImage.f19392e.setRenderMode(1);
        }
        jp.co.cyberagent.android.gpuimage.a aVar = gPUImage.f19390b;
        aVar.getClass();
        aVar.d(new c(aVar, camera));
        Rotation rotation = Rotation.NORMAL;
        aVar.f19424o = false;
        aVar.f19425p = false;
        aVar.f19423n = rotation;
        aVar.b();
    }

    public GPUImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19403a = 0;
        this.f19405d = true;
        this.f19407f = 0.0f;
        a(context, attributeSet);
    }

    public void setImage(Uri uri) {
        GPUImage gPUImage = this.c;
        gPUImage.getClass();
        new GPUImage.c(gPUImage, uri).execute(new Void[0]);
    }

    public void setImage(File file) {
        GPUImage gPUImage = this.c;
        gPUImage.getClass();
        new GPUImage.a(gPUImage, gPUImage, file).execute(new Void[0]);
    }
}
