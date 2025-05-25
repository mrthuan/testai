package jp.co.cyberagent.android.gpuimage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* renamed from: l  reason: collision with root package name */
    public static final j f19342l = new j();

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<GLTextureView> f19343a;

    /* renamed from: b  reason: collision with root package name */
    public i f19344b;
    public m c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19345d;

    /* renamed from: e  reason: collision with root package name */
    public e f19346e;

    /* renamed from: f  reason: collision with root package name */
    public f f19347f;

    /* renamed from: g  reason: collision with root package name */
    public g f19348g;

    /* renamed from: h  reason: collision with root package name */
    public int f19349h;

    /* renamed from: i  reason: collision with root package name */
    public int f19350i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f19351j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f19352k;

    /* loaded from: classes.dex */
    public abstract class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f19353a;

        public a(int[] iArr) {
            if (GLTextureView.this.f19350i == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[length + 2];
                int i10 = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                iArr2[i10] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                iArr = iArr2;
            }
            this.f19353a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public class b extends a {
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19355d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19356e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19357f;

        /* renamed from: g  reason: collision with root package name */
        public final int f19358g;

        /* renamed from: h  reason: collision with root package name */
        public final int f19359h;

        /* renamed from: i  reason: collision with root package name */
        public final int f19360i;

        public b(int i10, int i11) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i10, 12325, i11, 12326, 0, 12344});
            this.c = new int[1];
            this.f19355d = 8;
            this.f19356e = 8;
            this.f19357f = 8;
            this.f19358g = i10;
            this.f19359h = i11;
            this.f19360i = 0;
        }

        public final int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
            int[] iArr = this.c;
            if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, iArr)) {
                return 0;
            }
            return iArr[0];
        }
    }

    /* loaded from: classes.dex */
    public class c implements f {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public static class d implements g {
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<GLTextureView> f19363a;

        /* renamed from: b  reason: collision with root package name */
        public EGL10 f19364b;
        public EGLDisplay c;

        /* renamed from: d  reason: collision with root package name */
        public EGLSurface f19365d;

        /* renamed from: e  reason: collision with root package name */
        public EGLConfig f19366e;

        /* renamed from: f  reason: collision with root package name */
        public EGLContext f19367f;

        public h(WeakReference<GLTextureView> weakReference) {
            this.f19363a = weakReference;
        }

        public static String c(int i10, String str) {
            return str + " failed: " + i10;
        }

        public final boolean a() {
            if (this.f19364b != null) {
                if (this.c != null) {
                    if (this.f19366e != null) {
                        b();
                        GLTextureView gLTextureView = this.f19363a.get();
                        EGLSurface eGLSurface = null;
                        if (gLTextureView != null) {
                            g gVar = gLTextureView.f19348g;
                            EGL10 egl10 = this.f19364b;
                            EGLDisplay eGLDisplay = this.c;
                            EGLConfig eGLConfig = this.f19366e;
                            SurfaceTexture surfaceTexture = gLTextureView.getSurfaceTexture();
                            ((d) gVar).getClass();
                            try {
                                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                            } catch (IllegalArgumentException unused) {
                                j jVar = GLTextureView.f19342l;
                            }
                            this.f19365d = eGLSurface;
                        } else {
                            this.f19365d = null;
                        }
                        EGLSurface eGLSurface2 = this.f19365d;
                        if (eGLSurface2 != null && eGLSurface2 != EGL10.EGL_NO_SURFACE) {
                            if (!this.f19364b.eglMakeCurrent(this.c, eGLSurface2, eGLSurface2, this.f19367f)) {
                                c(this.f19364b.eglGetError(), "eglMakeCurrent");
                                return false;
                            }
                            return true;
                        }
                        this.f19364b.eglGetError();
                        return false;
                    }
                    throw new RuntimeException("eglConfig not initialized");
                }
                throw new RuntimeException("eglDisplay not initialized");
            }
            throw new RuntimeException("egl not initialized");
        }

        public final void b() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f19365d;
            if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                this.f19364b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = this.f19363a.get();
                if (gLTextureView != null) {
                    g gVar = gLTextureView.f19348g;
                    EGL10 egl10 = this.f19364b;
                    EGLDisplay eGLDisplay = this.c;
                    EGLSurface eGLSurface3 = this.f19365d;
                    ((d) gVar).getClass();
                    egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
                }
                this.f19365d = null;
            }
        }

        public final void d() {
            EGLConfig eGLConfig;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f19364b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.c = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f19364b.eglInitialize(eglGetDisplay, new int[2])) {
                    GLTextureView gLTextureView = this.f19363a.get();
                    if (gLTextureView == null) {
                        this.f19366e = null;
                        this.f19367f = null;
                    } else {
                        e eVar = gLTextureView.f19346e;
                        EGL10 egl102 = this.f19364b;
                        EGLDisplay eGLDisplay = this.c;
                        a aVar = (a) eVar;
                        int[] iArr = new int[1];
                        if (egl102.eglChooseConfig(eGLDisplay, aVar.f19353a, null, 0, iArr)) {
                            int i10 = 0;
                            int i11 = iArr[0];
                            if (i11 > 0) {
                                EGLConfig[] eGLConfigArr = new EGLConfig[i11];
                                if (egl102.eglChooseConfig(eGLDisplay, aVar.f19353a, eGLConfigArr, i11, iArr)) {
                                    b bVar = (b) aVar;
                                    while (true) {
                                        if (i10 < i11) {
                                            eGLConfig = eGLConfigArr[i10];
                                            int a10 = bVar.a(egl102, eGLDisplay, eGLConfig, 12325);
                                            int a11 = bVar.a(egl102, eGLDisplay, eGLConfig, 12326);
                                            if (a10 >= bVar.f19359h && a11 >= bVar.f19360i) {
                                                int a12 = bVar.a(egl102, eGLDisplay, eGLConfig, 12324);
                                                int a13 = bVar.a(egl102, eGLDisplay, eGLConfig, 12323);
                                                int a14 = bVar.a(egl102, eGLDisplay, eGLConfig, 12322);
                                                int a15 = bVar.a(egl102, eGLDisplay, eGLConfig, 12321);
                                                if (a12 == bVar.f19355d && a13 == bVar.f19356e && a14 == bVar.f19357f && a15 == bVar.f19358g) {
                                                    break;
                                                }
                                            }
                                            i10++;
                                        } else {
                                            eGLConfig = null;
                                            break;
                                        }
                                    }
                                    if (eGLConfig != null) {
                                        this.f19366e = eGLConfig;
                                        f fVar = gLTextureView.f19347f;
                                        EGL10 egl103 = this.f19364b;
                                        EGLDisplay eGLDisplay2 = this.c;
                                        int i12 = GLTextureView.this.f19350i;
                                        int[] iArr2 = {12440, i12, 12344};
                                        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                                        if (i12 == 0) {
                                            iArr2 = null;
                                        }
                                        this.f19367f = egl103.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, iArr2);
                                    } else {
                                        throw new IllegalArgumentException("No config chosen");
                                    }
                                } else {
                                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                                }
                            } else {
                                throw new IllegalArgumentException("No configs match configSpec");
                            }
                        } else {
                            throw new IllegalArgumentException("eglChooseConfig failed");
                        }
                    }
                    EGLContext eGLContext2 = this.f19367f;
                    if (eGLContext2 != null && eGLContext2 != EGL10.EGL_NO_CONTEXT) {
                        this.f19365d = null;
                        return;
                    } else {
                        this.f19367f = null;
                        throw new RuntimeException(c(this.f19364b.eglGetError(), "createContext"));
                    }
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }
    }

    /* loaded from: classes.dex */
    public static class i extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public boolean f19368a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f19369b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f19370d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f19371e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19372f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f19373g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f19374h;

        /* renamed from: m  reason: collision with root package name */
        public boolean f19379m;

        /* renamed from: p  reason: collision with root package name */
        public h f19382p;

        /* renamed from: q  reason: collision with root package name */
        public final WeakReference<GLTextureView> f19383q;

        /* renamed from: n  reason: collision with root package name */
        public final ArrayList<Runnable> f19380n = new ArrayList<>();

        /* renamed from: o  reason: collision with root package name */
        public boolean f19381o = true;

        /* renamed from: i  reason: collision with root package name */
        public int f19375i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f19376j = 0;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19378l = true;

        /* renamed from: k  reason: collision with root package name */
        public int f19377k = 1;

        public i(WeakReference<GLTextureView> weakReference) {
            this.f19383q = weakReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:149:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0103 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:183:0x01f6 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [int] */
        /* JADX WARN: Type inference failed for: r9v13 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 530
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.co.cyberagent.android.gpuimage.GLTextureView.i.a():void");
        }

        public final boolean b() {
            if (this.c && !this.f19370d && this.f19375i > 0 && this.f19376j > 0 && (this.f19378l || this.f19377k == 1)) {
                return true;
            }
            return false;
        }

        public final void c() {
            j jVar = GLTextureView.f19342l;
            synchronized (jVar) {
                this.f19368a = true;
                jVar.notifyAll();
                while (!this.f19369b) {
                    try {
                        GLTextureView.f19342l.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public final void d(int i10) {
            if (i10 >= 0 && i10 <= 1) {
                j jVar = GLTextureView.f19342l;
                synchronized (jVar) {
                    this.f19377k = i10;
                    jVar.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public final void e() {
            if (this.f19372f) {
                h hVar = this.f19382p;
                if (hVar.f19367f != null) {
                    GLTextureView gLTextureView = hVar.f19363a.get();
                    if (gLTextureView != null) {
                        f fVar = gLTextureView.f19347f;
                        EGL10 egl10 = hVar.f19364b;
                        EGLDisplay eGLDisplay = hVar.c;
                        EGLContext eGLContext = hVar.f19367f;
                        ((c) fVar).getClass();
                        if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                            Objects.toString(eGLDisplay);
                            Objects.toString(eGLContext);
                            throw new RuntimeException(h.c(egl10.eglGetError(), "eglDestroyContex"));
                        }
                    }
                    hVar.f19367f = null;
                }
                EGLDisplay eGLDisplay2 = hVar.c;
                if (eGLDisplay2 != null) {
                    hVar.f19364b.eglTerminate(eGLDisplay2);
                    hVar.c = null;
                }
                this.f19372f = false;
                j jVar = GLTextureView.f19342l;
                if (jVar.f19386d == this) {
                    jVar.f19386d = null;
                }
                jVar.notifyAll();
            }
        }

        public final void f() {
            if (this.f19373g) {
                this.f19373g = false;
                this.f19382p.b();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            setName("GLThread " + getId());
            try {
                a();
            } catch (InterruptedException unused) {
                j jVar = GLTextureView.f19342l;
            } catch (Throwable th2) {
                j jVar2 = GLTextureView.f19342l;
                GLTextureView.f19342l.b(this);
                throw th2;
            }
            GLTextureView.f19342l.b(this);
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public boolean f19384a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f19385b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public i f19386d;

        public final synchronized void a(GL10 gl10) {
            boolean z10;
            if (!this.f19385b) {
                if (!this.f19384a) {
                    this.f19384a = true;
                }
                if (!gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.c = z10;
                notifyAll();
                this.f19385b = true;
            }
        }

        public final synchronized void b(i iVar) {
            iVar.f19369b = true;
            if (this.f19386d == iVar) {
                this.f19386d = null;
            }
            notifyAll();
        }
    }

    /* loaded from: classes.dex */
    public interface k {
    }

    /* loaded from: classes.dex */
    public static class l extends Writer {

        /* renamed from: a  reason: collision with root package name */
        public final StringBuilder f19387a = new StringBuilder();

        public final void a() {
            StringBuilder sb2 = this.f19387a;
            if (sb2.length() > 0) {
                sb2.toString();
                sb2.delete(0, sb2.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            a();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                char c = cArr[i10 + i12];
                if (c == '\n') {
                    a();
                } else {
                    this.f19387a.append(c);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public class n extends b {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public n(boolean r3) {
            /*
                r1 = this;
                jp.co.cyberagent.android.gpuimage.GLTextureView.this = r2
                r0 = 0
                if (r3 == 0) goto L8
                r3 = 16
                goto L9
            L8:
                r3 = r0
            L9:
                r1.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.co.cyberagent.android.gpuimage.GLTextureView.n.<init>(jp.co.cyberagent.android.gpuimage.GLTextureView, boolean):void");
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f19343a = new WeakReference<>(this);
        this.f19352k = new ArrayList();
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.f19344b == null) {
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    public final void b() {
        i iVar = this.f19344b;
        iVar.getClass();
        j jVar = f19342l;
        synchronized (jVar) {
            iVar.f19378l = true;
            jVar.notifyAll();
        }
    }

    public final void c(int i10, int i11) {
        boolean z10;
        i iVar = this.f19344b;
        iVar.getClass();
        j jVar = f19342l;
        synchronized (jVar) {
            iVar.f19375i = i10;
            iVar.f19376j = i11;
            iVar.f19381o = true;
            iVar.f19378l = true;
            iVar.f19379m = false;
            jVar.notifyAll();
            while (!iVar.f19369b && !iVar.f19379m) {
                if (iVar.f19372f && iVar.f19373g && iVar.b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
                try {
                    f19342l.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void finalize() {
        try {
            i iVar = this.f19344b;
            if (iVar != null) {
                iVar.c();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f19349h;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f19351j;
    }

    public int getRenderMode() {
        int i10;
        i iVar = this.f19344b;
        iVar.getClass();
        synchronized (f19342l) {
            i10 = iVar.f19377k;
        }
        return i10;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        if (this.f19345d && this.c != null) {
            i iVar = this.f19344b;
            if (iVar != null) {
                synchronized (f19342l) {
                    i10 = iVar.f19377k;
                }
            } else {
                i10 = 1;
            }
            i iVar2 = new i(this.f19343a);
            this.f19344b = iVar2;
            if (i10 != 1) {
                iVar2.d(i10);
            }
            this.f19344b.start();
        }
        this.f19345d = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        i iVar = this.f19344b;
        if (iVar != null) {
            iVar.c();
        }
        this.f19345d = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        getSurfaceTexture();
        c(i12 - i10, i13 - i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        i iVar = this.f19344b;
        iVar.getClass();
        j jVar = f19342l;
        synchronized (jVar) {
            iVar.c = true;
            jVar.notifyAll();
            while (iVar.f19371e && !iVar.f19369b) {
                try {
                    f19342l.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        c(i10, i11);
        Iterator it = this.f19352k.iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureAvailable(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i iVar = this.f19344b;
        iVar.getClass();
        j jVar = f19342l;
        synchronized (jVar) {
            iVar.c = false;
            jVar.notifyAll();
            while (!iVar.f19371e && !iVar.f19369b) {
                try {
                    f19342l.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        Iterator it = this.f19352k.iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c(i10, i11);
        Iterator it = this.f19352k.iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        b();
        Iterator it = this.f19352k.iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void setDebugFlags(int i10) {
        this.f19349h = i10;
    }

    public void setEGLConfigChooser(e eVar) {
        a();
        this.f19346e = eVar;
    }

    public void setEGLContextClientVersion(int i10) {
        a();
        this.f19350i = i10;
    }

    public void setEGLContextFactory(f fVar) {
        a();
        this.f19347f = fVar;
    }

    public void setEGLWindowSurfaceFactory(g gVar) {
        a();
        this.f19348g = gVar;
    }

    public void setPreserveEGLContextOnPause(boolean z10) {
        this.f19351j = z10;
    }

    public void setRenderMode(int i10) {
        i iVar = this.f19344b;
        iVar.getClass();
        if (i10 >= 0 && i10 <= 1) {
            j jVar = f19342l;
            synchronized (jVar) {
                iVar.f19377k = i10;
                jVar.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("renderMode");
    }

    public void setRenderer(m mVar) {
        a();
        if (this.f19346e == null) {
            this.f19346e = new n(true);
        }
        if (this.f19347f == null) {
            this.f19347f = new c();
        }
        if (this.f19348g == null) {
            this.f19348g = new d();
        }
        this.c = mVar;
        i iVar = new i(this.f19343a);
        this.f19344b = iVar;
        iVar.start();
    }

    public void setEGLConfigChooser(boolean z10) {
        setEGLConfigChooser(new n(z10));
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19343a = new WeakReference<>(this);
        this.f19352k = new ArrayList();
        setSurfaceTextureListener(this);
    }

    public void setGLWrapper(k kVar) {
    }
}
