package jp.co.cyberagent.android.gpuimage;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import jp.co.cyberagent.android.gpuimage.util.Rotation;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import qf.d;
import qf.f;
import qf.g;
import rf.e;

/* loaded from: classes.dex */
public final class GPUImage {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19389a;

    /* renamed from: b  reason: collision with root package name */
    public final jp.co.cyberagent.android.gpuimage.a f19390b;

    /* renamed from: d  reason: collision with root package name */
    public GLSurfaceView f19391d;

    /* renamed from: e  reason: collision with root package name */
    public GLTextureView f19392e;

    /* renamed from: f  reason: collision with root package name */
    public e f19393f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f19394g;
    public int c = 0;

    /* renamed from: h  reason: collision with root package name */
    public ScaleType f19395h = ScaleType.CENTER_CROP;

    /* loaded from: classes.dex */
    public enum ScaleType {
        CENTER_INSIDE,
        CENTER_CROP
    }

    /* loaded from: classes.dex */
    public class a extends b {

        /* renamed from: e  reason: collision with root package name */
        public final File f19397e;

        public a(GPUImage gPUImage, GPUImage gPUImage2, File file) {
            super(gPUImage2);
            this.f19397e = file;
        }

        @Override // jp.co.cyberagent.android.gpuimage.GPUImage.b
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFile(this.f19397e.getAbsolutePath(), options);
        }

        @Override // jp.co.cyberagent.android.gpuimage.GPUImage.b
        public final int b() {
            int attributeInt = new ExifInterface(this.f19397e.getAbsolutePath()).getAttributeInt("Orientation", 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return ShapeTypes.MATH_EQUAL;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final GPUImage f19398a;

        /* renamed from: b  reason: collision with root package name */
        public int f19399b;
        public int c;

        public b(GPUImage gPUImage) {
            this.f19398a = gPUImage;
        }

        public abstract Bitmap a(BitmapFactory.Options options);

        public abstract int b();

        /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.graphics.Bitmap doInBackground(java.lang.Void[] r15) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.co.cyberagent.android.gpuimage.GPUImage.b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            super.onPostExecute(bitmap2);
            GPUImage gPUImage = this.f19398a;
            jp.co.cyberagent.android.gpuimage.a aVar = gPUImage.f19390b;
            aVar.getClass();
            aVar.d(new qf.e(aVar));
            gPUImage.f19394g = null;
            gPUImage.b();
            gPUImage.f19394g = bitmap2;
            jp.co.cyberagent.android.gpuimage.a aVar2 = gPUImage.f19390b;
            aVar2.getClass();
            if (bitmap2 != null) {
                aVar2.d(new f(aVar2, bitmap2));
            }
            gPUImage.b();
        }
    }

    /* loaded from: classes.dex */
    public class c extends b {

        /* renamed from: e  reason: collision with root package name */
        public final Uri f19401e;

        public c(GPUImage gPUImage, Uri uri) {
            super(gPUImage);
            this.f19401e = uri;
        }

        @Override // jp.co.cyberagent.android.gpuimage.GPUImage.b
        public final Bitmap a(BitmapFactory.Options options) {
            InputStream openStream;
            Uri uri = this.f19401e;
            try {
                if (!uri.getScheme().startsWith("http") && !uri.getScheme().startsWith(Constants.SCHEME)) {
                    boolean startsWith = uri.getPath().startsWith("/android_asset/");
                    GPUImage gPUImage = GPUImage.this;
                    if (startsWith) {
                        openStream = gPUImage.f19389a.getAssets().open(uri.getPath().substring(15));
                    } else {
                        openStream = gPUImage.f19389a.getContentResolver().openInputStream(uri);
                    }
                    return BitmapFactory.decodeStream(openStream, null, options);
                }
                openStream = new URL(uri.toString()).openStream();
                return BitmapFactory.decodeStream(openStream, null, options);
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        @Override // jp.co.cyberagent.android.gpuimage.GPUImage.b
        public final int b() {
            Cursor query = GPUImage.this.f19389a.getContentResolver().query(this.f19401e, new String[]{"orientation"}, null, null, null);
            if (query == null || query.getCount() != 1) {
                return 0;
            }
            query.moveToFirst();
            int i10 = query.getInt(0);
            query.close();
            return i10;
        }
    }

    public GPUImage(Context context) {
        if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
            this.f19389a = context;
            e eVar = new e();
            this.f19393f = eVar;
            this.f19390b = new jp.co.cyberagent.android.gpuimage.a(eVar);
            return;
        }
        throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2;
        if (this.f19391d != null || this.f19392e != null) {
            jp.co.cyberagent.android.gpuimage.a aVar = this.f19390b;
            aVar.getClass();
            aVar.d(new qf.e(aVar));
            this.f19390b.d(new qf.a(this));
            synchronized (this.f19393f) {
                b();
                try {
                    this.f19393f.wait();
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
        jp.co.cyberagent.android.gpuimage.a aVar2 = new jp.co.cyberagent.android.gpuimage.a(this.f19393f);
        Rotation rotation = Rotation.NORMAL;
        jp.co.cyberagent.android.gpuimage.a aVar3 = this.f19390b;
        boolean z10 = aVar3.f19424o;
        boolean z11 = aVar3.f19425p;
        aVar2.f19424o = z10;
        aVar2.f19425p = z11;
        aVar2.f19423n = rotation;
        aVar2.b();
        aVar2.f19426q = this.f19395h;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        g gVar = new g(width, height);
        gVar.f29326a = aVar2;
        if (Thread.currentThread().getName().equals(gVar.f29334j)) {
            GLSurfaceView.Renderer renderer = gVar.f29326a;
            EGLConfig eGLConfig = gVar.f29330f;
            GL10 gl10 = gVar.f29333i;
            renderer.onSurfaceCreated(gl10, eGLConfig);
            gVar.f29326a.onSurfaceChanged(gl10, width, height);
        }
        aVar2.d(new f(aVar2, bitmap));
        if (gVar.f29326a == null || !Thread.currentThread().getName().equals(gVar.f29334j)) {
            bitmap2 = null;
        } else {
            GLSurfaceView.Renderer renderer2 = gVar.f29326a;
            GL10 gl102 = gVar.f29333i;
            renderer2.onDrawFrame(gl102);
            gVar.f29326a.onDrawFrame(gl102);
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            gVar.f29327b = createBitmap;
            GPUImageNativeLibrary.adjustBitmap(createBitmap);
            bitmap2 = gVar.f29327b;
        }
        this.f19393f.d();
        aVar2.d(new qf.e(aVar2));
        GLSurfaceView.Renderer renderer3 = gVar.f29326a;
        GL10 gl103 = gVar.f29333i;
        renderer3.onDrawFrame(gl103);
        gVar.f29326a.onDrawFrame(gl103);
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGL10 egl10 = gVar.c;
        EGLDisplay eGLDisplay = gVar.f29328d;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        egl10.eglDestroySurface(eGLDisplay, gVar.f29332h);
        egl10.eglDestroyContext(eGLDisplay, gVar.f29331g);
        egl10.eglTerminate(eGLDisplay);
        jp.co.cyberagent.android.gpuimage.a aVar4 = this.f19390b;
        e eVar = this.f19393f;
        aVar4.getClass();
        aVar4.d(new d(aVar4, eVar));
        Bitmap bitmap3 = this.f19394g;
        if (bitmap3 != null) {
            jp.co.cyberagent.android.gpuimage.a aVar5 = this.f19390b;
            aVar5.getClass();
            aVar5.d(new f(aVar5, bitmap3));
        }
        b();
        return bitmap2;
    }

    public final void b() {
        GLTextureView gLTextureView;
        int i10 = this.c;
        if (i10 == 0) {
            GLSurfaceView gLSurfaceView = this.f19391d;
            if (gLSurfaceView != null) {
                gLSurfaceView.requestRender();
            }
        } else if (i10 == 1 && (gLTextureView = this.f19392e) != null) {
            gLTextureView.b();
        }
    }

    public final void c(e eVar) {
        this.f19393f = eVar;
        jp.co.cyberagent.android.gpuimage.a aVar = this.f19390b;
        aVar.getClass();
        aVar.d(new d(aVar, eVar));
        b();
    }
}
