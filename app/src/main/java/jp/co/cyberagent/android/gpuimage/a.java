package jp.co.cyberagent.android.gpuimage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import jp.co.cyberagent.android.gpuimage.GLTextureView;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.util.Rotation;
import rf.e;
import sf.b;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes.dex */
public final class a implements GLSurfaceView.Renderer, GLTextureView.m, Camera.PreviewCallback {

    /* renamed from: r  reason: collision with root package name */
    public static final float[] f19410r = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public e f19411a;

    /* renamed from: e  reason: collision with root package name */
    public final FloatBuffer f19414e;

    /* renamed from: f  reason: collision with root package name */
    public final FloatBuffer f19415f;

    /* renamed from: g  reason: collision with root package name */
    public IntBuffer f19416g;

    /* renamed from: h  reason: collision with root package name */
    public int f19417h;

    /* renamed from: i  reason: collision with root package name */
    public int f19418i;

    /* renamed from: j  reason: collision with root package name */
    public int f19419j;

    /* renamed from: k  reason: collision with root package name */
    public int f19420k;

    /* renamed from: n  reason: collision with root package name */
    public Rotation f19423n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f19424o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f19425p;

    /* renamed from: b  reason: collision with root package name */
    public final Object f19412b = new Object();
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public SurfaceTexture f19413d = null;

    /* renamed from: q  reason: collision with root package name */
    public GPUImage.ScaleType f19426q = GPUImage.ScaleType.CENTER_CROP;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedList f19421l = new LinkedList();

    /* renamed from: m  reason: collision with root package name */
    public final LinkedList f19422m = new LinkedList();

    public a(e eVar) {
        this.f19411a = eVar;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f19414e = asFloatBuffer;
        asFloatBuffer.put(f19410r).position(0);
        this.f19415f = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Rotation rotation = Rotation.NORMAL;
        this.f19424o = false;
        this.f19425p = false;
        this.f19423n = rotation;
        b();
    }

    public static float a(float f10, float f11) {
        if (f10 != 0.0f) {
            return 1.0f - f11;
        }
        return f11;
    }

    public static void c(LinkedList linkedList) {
        synchronized (linkedList) {
            while (!linkedList.isEmpty()) {
                ((Runnable) linkedList.poll()).run();
            }
        }
    }

    public final void b() {
        float f10 = this.f19417h;
        float f11 = this.f19418i;
        Rotation rotation = this.f19423n;
        if (rotation == Rotation.ROTATION_270 || rotation == Rotation.ROTATION_90) {
            f11 = f10;
            f10 = f11;
        }
        float max = Math.max(f10 / this.f19419j, f11 / this.f19420k);
        float round = Math.round(this.f19419j * max) / f10;
        float round2 = Math.round(this.f19420k * max) / f11;
        float[] fArr = f19410r;
        float[] b10 = b.b(this.f19423n, this.f19424o, this.f19425p);
        if (this.f19426q == GPUImage.ScaleType.CENTER_CROP) {
            float f12 = (1.0f - (1.0f / round)) / 2.0f;
            float f13 = (1.0f - (1.0f / round2)) / 2.0f;
            b10 = new float[]{a(b10[0], f12), a(b10[1], f13), a(b10[2], f12), a(b10[3], f13), a(b10[4], f12), a(b10[5], f13), a(b10[6], f12), a(b10[7], f13)};
        } else {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        FloatBuffer floatBuffer = this.f19414e;
        floatBuffer.clear();
        floatBuffer.put(fArr).position(0);
        FloatBuffer floatBuffer2 = this.f19415f;
        floatBuffer2.clear();
        floatBuffer2.put(b10).position(0);
    }

    public final void d(Runnable runnable) {
        synchronized (this.f19421l) {
            this.f19421l.add(runnable);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        LinkedList linkedList = this.f19421l;
        synchronized (linkedList) {
            while (!linkedList.isEmpty()) {
                ((Runnable) linkedList.poll()).run();
            }
        }
        this.f19411a.g(this.c, this.f19414e, this.f19415f);
        c(this.f19422m);
        SurfaceTexture surfaceTexture = this.f19413d;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i10 = previewSize.width;
        int i11 = previewSize.height;
        if (this.f19416g == null) {
            this.f19416g = IntBuffer.allocate(i10 * i11);
        }
        if (this.f19421l.isEmpty()) {
            d(new qf.b(this, bArr, i10, i11));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f19417h = i10;
        this.f19418i = i11;
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glUseProgram(this.f19411a.f29517d);
        this.f19411a.k(i10, i11);
        b();
        synchronized (this.f19412b) {
            this.f19412b.notifyAll();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glDisable(2929);
        this.f19411a.e();
    }
}
