package qf;

import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PixelBuffer.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public GLSurfaceView.Renderer f29326a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f29327b;
    public final EGL10 c;

    /* renamed from: d  reason: collision with root package name */
    public final EGLDisplay f29328d;

    /* renamed from: e  reason: collision with root package name */
    public EGLConfig[] f29329e;

    /* renamed from: f  reason: collision with root package name */
    public final EGLConfig f29330f;

    /* renamed from: g  reason: collision with root package name */
    public final EGLContext f29331g;

    /* renamed from: h  reason: collision with root package name */
    public final EGLSurface f29332h;

    /* renamed from: i  reason: collision with root package name */
    public final GL10 f29333i;

    /* renamed from: j  reason: collision with root package name */
    public final String f29334j;

    public g(int i10, int i11) {
        int[] iArr = {12375, i10, 12374, i11, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.c = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f29328d = eglGetDisplay;
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr2 = {12325, 0, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
        int[] iArr3 = new int[1];
        egl10.eglChooseConfig(eglGetDisplay, iArr2, null, 0, iArr3);
        int i12 = iArr3[0];
        EGLConfig[] eGLConfigArr = new EGLConfig[i12];
        this.f29329e = eGLConfigArr;
        egl10.eglChooseConfig(eglGetDisplay, iArr2, eGLConfigArr, i12, iArr3);
        EGLConfig eGLConfig = this.f29329e[0];
        this.f29330f = eGLConfig;
        EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        this.f29331g = eglCreateContext;
        EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, iArr);
        this.f29332h = eglCreatePbufferSurface;
        egl10.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        this.f29333i = (GL10) eglCreateContext.getGL();
        this.f29334j = Thread.currentThread().getName();
    }
}
