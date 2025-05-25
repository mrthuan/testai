package pdf.pdfreader.viewer.editor.free.camera.camera;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.activity.k;
import androidx.fragment.app.f;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import kotlinx.coroutines.y0;
import pdf.pdfreader.viewer.editor.free.camera.camera.util.CameraUtil;
import pdf.pdfreader.viewer.editor.free.camera.widget.CameraView;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: CameraHelper.kt */
/* loaded from: classes3.dex */
public final class CameraHelper implements CameraView.a, CameraView.b {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f24067a;

    /* renamed from: b  reason: collision with root package name */
    public final w f24068b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public Camera f24069d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f24070e;

    /* renamed from: f  reason: collision with root package name */
    public CameraView f24071f;

    /* renamed from: g  reason: collision with root package name */
    public sl.a f24072g;

    /* renamed from: h  reason: collision with root package name */
    public sl.a f24073h;

    /* renamed from: i  reason: collision with root package name */
    public sl.a f24074i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f24075j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f24076k;

    /* renamed from: l  reason: collision with root package name */
    public l1.a f24077l;

    /* renamed from: m  reason: collision with root package name */
    public k f24078m;

    /* renamed from: n  reason: collision with root package name */
    public androidx.activity.b f24079n;

    /* renamed from: o  reason: collision with root package name */
    public f f24080o;

    /* renamed from: p  reason: collision with root package name */
    public y0 f24081p;

    /* renamed from: q  reason: collision with root package name */
    public int f24082q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f24083r;

    /* renamed from: s  reason: collision with root package name */
    public vf.a f24084s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f24085t;

    /* renamed from: u  reason: collision with root package name */
    public final tl.a f24086u;

    /* compiled from: CameraHelper.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void K0();

        void T0();
    }

    public CameraHelper(CameraActivity cameraActivity, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, CameraActivity cameraActivity2) {
        g.e(cameraActivity, ea.a.p("UmM_aQVpFnk=", "PSO9DiN6"));
        ea.a.p("LG9Dbwx0Xm4_UylvBWU=", "mfIdGWyR");
        g.e(cameraActivity2, ea.a.p("XG4KdQdvJG8RdUdMAHMiZSplcg==", "YpnzsESJ"));
        this.f24067a = cameraActivity;
        this.f24068b = lifecycleCoroutineScopeImpl;
        this.c = cameraActivity2;
        this.f24076k = new Handler();
        this.f24086u = new tl.a();
        new ArrayList();
    }

    public static void f(final CameraHelper cameraHelper) {
        g.e(cameraHelper, ea.a.p("O2hYc10w", "B2CQ3bP3"));
        final vf.a aVar = cameraHelper.f24084s;
        cameraHelper.f24084s = t0.s0(true, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper$delayStartPreview$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ d invoke() {
                invoke2();
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Camera camera;
                CameraView cameraView;
                SurfaceHolder surfaceHolder;
                SurfaceHolder surfaceHolder2;
                Thread thread = aVar;
                if (thread != null) {
                    thread.join();
                }
                CameraHelper cameraHelper2 = cameraHelper;
                Integer num = cameraHelper2.f24070e;
                if (num == null) {
                    cameraHelper2.l();
                } else if (cameraHelper2.f24069d == null) {
                    try {
                        cameraHelper2.f24069d = Camera.open(num.intValue());
                        cameraHelper2.f24082q = 0;
                    } catch (Throwable th2) {
                        b.b.M(ea.a.p("NmgGcG8=", "bAUuMb9z"), th2);
                        if (cameraHelper2.f24082q < 2) {
                            cameraHelper2.i();
                            cameraHelper2.f24082q++;
                        }
                    }
                }
                CameraView cameraView2 = cameraHelper2.f24071f;
                if (((cameraView2 == null || (surfaceHolder2 = cameraView2.getSurfaceHolder()) == null) ? null : surfaceHolder2.getSurface()) == null || (camera = cameraHelper2.f24069d) == null || (cameraView = cameraHelper2.f24071f) == null || (surfaceHolder = cameraView.getSurfaceHolder()) == null) {
                    return;
                }
                try {
                    cameraHelper2.m();
                    camera.setPreviewDisplay(surfaceHolder);
                    camera.startPreview();
                    cameraHelper2.f24086u.a(camera, 0.0f);
                } catch (Throwable th3) {
                    b.b.M(ea.a.p("BWgacA==", "bNfiqRGT"), th3);
                }
            }
        }, 30);
    }

    public static void g(final CameraHelper cameraHelper) {
        g.e(cameraHelper, ea.a.p("O2hYc10w", "vmOTGIG1"));
        final vf.a aVar = cameraHelper.f24084s;
        cameraHelper.f24084s = t0.s0(true, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper$delayStopPreview$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ d invoke() {
                invoke2();
                return d.f30009a;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)|4|5|6|(1:8)(1:51)|(1:10)(1:50)|11|(12:16|(2:(1:23)|(2:25|(1:27)(1:28)))|30|31|(1:33)|35|36|(1:38)|39|(1:41)|42|44)|49|(0)|30|31|(0)|35|36|(0)|39|(0)|42|44|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
                ea.a.p("JGg-dAMy", "x2GMsHfW");
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #2 {all -> 0x006e, blocks: (B:34:0x0066, B:36:0x006a), top: B:51:0x0066 }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #4 {all -> 0x0094, blocks: (B:39:0x0076, B:41:0x007a, B:42:0x007f, B:44:0x0083, B:45:0x0086), top: B:55:0x0076 }] */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0083 A[Catch: all -> 0x008b, TryCatch #4 {all -> 0x0094, blocks: (B:39:0x0076, B:41:0x007a, B:42:0x007f, B:44:0x0083, B:45:0x0086), top: B:55:0x0076 }] */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2() {
                /*
                    r8 = this;
                    java.lang.Thread r0 = r1
                    if (r0 == 0) goto L7
                    r0.join()
                L7:
                    pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper r0 = r2
                    r0.getClass()
                    r1 = 0
                    android.hardware.Camera r2 = r0.f24069d     // Catch: java.lang.Throwable -> L5f
                    if (r2 == 0) goto L16
                    android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch: java.lang.Throwable -> L5f
                    goto L17
                L16:
                    r2 = r1
                L17:
                    if (r2 == 0) goto L1e
                    java.util.List r3 = r2.getSupportedFlashModes()     // Catch: java.lang.Throwable -> L5f
                    goto L1f
                L1e:
                    r3 = r1
                L1f:
                    java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L5f
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto L2e
                    boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L5f
                    if (r3 == 0) goto L2c
                    goto L2e
                L2c:
                    r3 = r4
                    goto L2f
                L2e:
                    r3 = r5
                L2f:
                    if (r3 != 0) goto L66
                    if (r2 == 0) goto L49
                    java.util.List r3 = r2.getSupportedFlashModes()     // Catch: java.lang.Throwable -> L5f
                    if (r3 == 0) goto L49
                    java.lang.String r6 = "XGZm"
                    java.lang.String r7 = "uAi7amgK"
                    java.lang.String r6 = ea.a.p(r6, r7)     // Catch: java.lang.Throwable -> L5f
                    boolean r3 = r3.contains(r6)     // Catch: java.lang.Throwable -> L5f
                    if (r3 != r5) goto L49
                    r4 = r5
                L49:
                    if (r4 == 0) goto L66
                    java.lang.String r3 = "IGZm"
                    java.lang.String r4 = "1cTIYTgG"
                    java.lang.String r3 = ea.a.p(r3, r4)     // Catch: java.lang.Throwable -> L5f
                    r2.setFlashMode(r3)     // Catch: java.lang.Throwable -> L5f
                    android.hardware.Camera r3 = r0.f24069d     // Catch: java.lang.Throwable -> L5f
                    if (r3 != 0) goto L5b
                    goto L66
                L5b:
                    r3.setParameters(r2)     // Catch: java.lang.Throwable -> L5f
                    goto L66
                L5f:
                    java.lang.String r2 = "C2hEdDgx"
                    java.lang.String r3 = "ECh7HLhd"
                    ea.a.p(r2, r3)
                L66:
                    android.hardware.Camera r2 = r0.f24069d     // Catch: java.lang.Throwable -> L6e
                    if (r2 == 0) goto L76
                    r2.stopPreview()     // Catch: java.lang.Throwable -> L6e
                    goto L76
                L6e:
                    java.lang.String r2 = "JGg-dAMy"
                    java.lang.String r3 = "x2GMsHfW"
                    ea.a.p(r2, r3)
                L76:
                    androidx.fragment.app.f r2 = r0.f24080o     // Catch: java.lang.Throwable -> L94
                    if (r2 == 0) goto L7f
                    android.os.Handler r3 = r0.f24076k     // Catch: java.lang.Throwable -> L94
                    r3.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L94
                L7f:
                    android.hardware.Camera r2 = r0.f24069d     // Catch: java.lang.Throwable -> L8b
                    if (r2 == 0) goto L86
                    r2.release()     // Catch: java.lang.Throwable -> L8b
                L86:
                    r0.f24069d = r1     // Catch: java.lang.Throwable -> L8b
                    r0.f24070e = r1     // Catch: java.lang.Throwable -> L8b
                    goto L9b
                L8b:
                    java.lang.String r0 = "UGg5Yw=="
                    java.lang.String r1 = "x70lSDuL"
                    ea.a.p(r0, r1)     // Catch: java.lang.Throwable -> L94
                    goto L9b
                L94:
                    java.lang.String r0 = "UGg4dAMz"
                    java.lang.String r1 = "OfhGpf0e"
                    ea.a.p(r0, r1)
                L9b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper$delayStopPreview$2$1.invoke2():void");
            }
        }, 30);
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.widget.CameraView.a
    public final void a() {
        this.f24075j = false;
        j();
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.widget.CameraView.b
    public final void b(float f10) {
        Camera camera = this.f24069d;
        if (camera == null) {
            return;
        }
        this.f24086u.a(camera, (f10 - 1.0f) * 2);
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.widget.CameraView.a
    public final void c() {
        this.f24075j = true;
        this.f24083r = Boolean.FALSE;
        i();
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.widget.CameraView.b
    public final void d(float f10, float f11, final pdf.pdfreader.viewer.editor.free.camera.widget.a aVar) {
        if (this.f24069d != null) {
            try {
                this.c.K0();
                f fVar = this.f24080o;
                Handler handler = this.f24076k;
                if (fVar != null) {
                    handler.removeCallbacks(fVar);
                }
                Camera camera = this.f24069d;
                if (camera != null) {
                    camera.cancelAutoFocus();
                }
                Camera camera2 = this.f24069d;
                g.b(camera2);
                Camera.Parameters parameters = camera2.getParameters();
                if (parameters.getSupportedFocusModes().contains(ea.a.p("LnVFbw==", "VdtGc1Wl"))) {
                    parameters.setFocusMode(ea.a.p("UnU_bw==", "2o4GTL5T"));
                } else if (parameters.getSupportedFocusModes().contains(ea.a.p("XmEocm8=", "6AfJY0oJ"))) {
                    parameters.setFocusMode(ea.a.p("XmEocm8=", "7g0jcR5Q"));
                }
                if (parameters.getMaxNumFocusAreas() > 0) {
                    parameters.setFocusAreas(ge.a.j(new Camera.Area(h(f10, f11), 1000)));
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    parameters.setMeteringAreas(ge.a.j(new Camera.Area(h(f10, f11), 1000)));
                }
                Camera camera3 = this.f24069d;
                if (camera3 != null) {
                    camera3.setParameters(parameters);
                }
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                f fVar2 = new f(8, this, ref$BooleanRef, aVar);
                this.f24080o = fVar2;
                handler.postDelayed(fVar2, 3000L);
                Camera camera4 = this.f24069d;
                if (camera4 != null) {
                    camera4.autoFocus(new Camera.AutoFocusCallback() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.a
                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z10, Camera camera5) {
                            String p10 = ea.a.p("aGgRc39vWnU7UgNzQWx0", "yNLp99Yq");
                            Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                            g.e(ref$BooleanRef2, p10);
                            String p11 = ea.a.p("O2hYc10w", "MhB6tgMg");
                            CameraHelper cameraHelper = this;
                            g.e(cameraHelper, p11);
                            ref$BooleanRef2.element = true;
                            CameraView.c cVar = aVar;
                            if (cVar != null) {
                                cVar.a(z10);
                            }
                            cameraHelper.c.T0();
                            f fVar3 = cameraHelper.f24080o;
                            if (fVar3 != null) {
                                Handler handler2 = cameraHelper.f24076k;
                                handler2.removeCallbacks(fVar3);
                                handler2.postDelayed(fVar3, 3000L);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
                ea.a.p("IGNHYwF5Zg==", "zwniZtJD");
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.camera.widget.CameraView.a
    public final void e() {
        if (!this.f24075j) {
            this.f24075j = true;
            i();
        }
    }

    public final Rect h(float f10, float f11) {
        float f12 = (float) AdError.SERVER_ERROR_CODE;
        int i10 = 1000;
        float f13 = 1000;
        int i11 = (int) ((f10 * f12) - f13);
        int i12 = (int) ((f11 * f12) - f13);
        int i13 = ((int) (100 * 1.0f)) / 2;
        int i14 = i11 - i13;
        if (i14 > 1000) {
            i14 = 1000;
        } else if (i14 < -1000) {
            i14 = -1000;
        }
        float f14 = i14;
        int i15 = i12 - i13;
        if (i15 > 1000) {
            i15 = 1000;
        } else if (i15 < -1000) {
            i15 = -1000;
        }
        float f15 = i15;
        int i16 = i11 + i13;
        if (i16 > 1000) {
            i16 = 1000;
        } else if (i16 < -1000) {
            i16 = -1000;
        }
        float f16 = i16;
        int i17 = i12 + i13;
        if (i17 <= 1000) {
            if (i17 < -1000) {
                i10 = -1000;
            } else {
                i10 = i17;
            }
        }
        RectF rectF = new RectF(f14, f15, f16, i10);
        Integer num = this.f24070e;
        if (num != null) {
            int intValue = num.intValue();
            Matrix matrix = new Matrix();
            matrix.setRotate(-CameraUtil.c(this.f24067a, intValue), 0.0f, 0.0f);
            matrix.mapRect(rectF);
        }
        return new Rect(t0.o0(rectF.left), t0.o0(rectF.top), t0.o0(rectF.right), t0.o0(rectF.bottom));
    }

    public final void i() {
        if (this.f24075j) {
            Boolean bool = this.f24083r;
            Boolean bool2 = Boolean.TRUE;
            if (!g.a(bool, bool2)) {
                this.f24083r = bool2;
                k kVar = this.f24078m;
                Handler handler = this.f24076k;
                if (kVar != null) {
                    handler.removeCallbacks(kVar);
                }
                k kVar2 = new k(this, 20);
                this.f24078m = kVar2;
                handler.post(kVar2);
            }
        }
    }

    public final void j() {
        Boolean bool = this.f24083r;
        Boolean bool2 = Boolean.FALSE;
        if (g.a(bool, bool2)) {
            return;
        }
        this.f24083r = bool2;
        androidx.activity.b bVar = this.f24079n;
        Handler handler = this.f24076k;
        if (bVar != null) {
            handler.removeCallbacks(bVar);
        }
        androidx.activity.b bVar2 = new androidx.activity.b(this, 24);
        this.f24079n = bVar2;
        handler.post(bVar2);
    }

    public final Size k() {
        sl.a aVar = this.f24072g;
        if (aVar != null) {
            return new Size(aVar.f29823a, aVar.f29824b);
        }
        return null;
    }

    public final void l() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i10 = 0; i10 < numberOfCameras; i10++) {
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    this.f24070e = Integer.valueOf(i10);
                    this.f24069d = Camera.open(i10);
                    return;
                }
            }
        } catch (Exception e10) {
            b.b.M(ea.a.p("BGgGaQ==", "94guzshq"), e10);
        }
        this.f24070e = null;
        this.f24069d = null;
    }

    public final void m() {
        boolean z10;
        Camera camera = this.f24069d;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        Integer num = this.f24070e;
        if (num != null) {
            int intValue = num.intValue();
            sl.a aVar = this.f24072g;
            if (aVar == null) {
                return;
            }
            camera.setDisplayOrientation(CameraUtil.c(this.f24067a, intValue));
            parameters.setPreviewSize(aVar.f29823a, aVar.f29824b);
            sl.a a10 = CameraUtil.a(camera, aVar);
            parameters.setPictureSize(a10.f29823a, a10.f29824b);
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            boolean z11 = false;
            if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (parameters.getSupportedFocusModes().contains(ea.a.p("UG8ldBpuF28HcxlwAGMidTZl", "Q03cRHQb"))) {
                    parameters.setFocusMode(ea.a.p("Om8mdA5uRm89c0twXWMjdUpl", "F4YHg3oo"));
                } else if (parameters.getSupportedFocusModes().contains(ea.a.p("LnVFbw==", "LcAnKQkk"))) {
                    parameters.setFocusMode(ea.a.p("UnU_bw==", "RCgB0NtK"));
                } else if (parameters.getSupportedFocusModes().contains(ea.a.p("UG8ldBpuF28Hcxl2AGQzbw==", "u5ajxKJE"))) {
                    parameters.setFocusMode(ea.a.p("UW9ZdBNuHm89c0t2XWQybw==", "tN27zkrj"));
                }
            }
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes == null || supportedFlashModes.isEmpty()) {
                z11 = true;
            }
            if (!z11) {
                if (this.f24085t) {
                    if (parameters.getSupportedFlashModes().contains(ea.a.p("O29DY2g=", "M3xzIreG"))) {
                        parameters.setFlashMode(ea.a.p("O29DY2g=", "Rxw3Jp3Q"));
                    } else if (parameters.getSupportedFlashModes().contains(ea.a.p("XG4=", "IASIcwcM"))) {
                        parameters.setFlashMode(ea.a.p("Hm4=", "Dvqs8fuj"));
                    }
                } else if (parameters.getSupportedFlashModes().contains(ea.a.p("IGZm", "DokKADuB"))) {
                    parameters.setFlashMode(ea.a.p("WGZm", "3i7Z9rHe"));
                }
            }
            camera.setParameters(parameters);
        }
    }

    public final void n(final CameraView cameraView, final int i10, final int i11, int i12, int i13) {
        this.f24071f = cameraView;
        this.f24073h = new sl.a(i10, i11);
        this.f24074i = new sl.a(i12, i13);
        cameraView.setUserSeePreviewSize(new sl.a(i10, i11));
        cameraView.setCameraViewListener(this);
        cameraView.setGestureListener(this);
        final SharedPreferences sharedPreferences = this.f24067a.getSharedPreferences(ea.a.p("UGEUZA==", "gtSbhfH3"), 0);
        g.d(sharedPreferences, ea.a.p("UmM_aQVpFnlcZ1F0Omg3ciFkYnIjZiZy0oDuTS0sdENcbj9lC3RMTT1EcV85Uh9WBVR3KQ==", "0HhTqjqz"));
        final int i14 = sharedPreferences.getInt(ea.a.p("FWkFYzBwdw==", "LNeZRHpR"), 0);
        final int i15 = sharedPreferences.getInt(ea.a.p("SWkIYxFwaA==", "XB9WsCTK"), 0);
        if (i14 != 0 && i15 != 0) {
            cameraView.setCameraPreviewSize(new sl.a(i14, i15));
        }
        this.f24084s = t0.s0(true, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper$setCameraView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ d invoke() {
                invoke2();
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Camera camera;
                CameraHelper.this.l();
                try {
                    camera = CameraHelper.this.f24069d;
                } catch (Throwable unused) {
                    ea.a.p("UGgiYw==", "wHAD5Xtz");
                }
                if (camera == null) {
                    return;
                }
                final sl.a b10 = CameraUtil.b(camera, new sl.a(i10, i11));
                CameraHelper.this.f24072g = b10;
                final CameraView cameraView2 = cameraView;
                final int i16 = i14;
                final int i17 = i15;
                final SharedPreferences sharedPreferences2 = sharedPreferences;
                cameraView2.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        String p10 = ea.a.p("F2MqbRZyA1YbZXc=", "6Nm0wydS");
                        CameraView cameraView3 = CameraView.this;
                        g.e(cameraView3, p10);
                        String p11 = ea.a.p("F2MqbRZyA0IXc0BQG2UgaSF3YWk8ZQ==", "lq4qR3aP");
                        sl.a aVar = b10;
                        g.e(aVar, p11);
                        String p12 = ea.a.p("a3BDZR9z", "lJtyvDdt");
                        SharedPreferences sharedPreferences3 = sharedPreferences2;
                        g.e(sharedPreferences3, p12);
                        cameraView3.setCameraPreviewSize(aVar);
                        if (i16 == 0 || i17 == 0) {
                            sharedPreferences3.edit().putInt(ea.a.p("P2luYxtwdw==", "VA2kJITM"), aVar.f29823a).apply();
                            sharedPreferences3.edit().putInt(ea.a.p("Q2kXYzNwaA==", "O33HQfL4"), aVar.f29824b).apply();
                        }
                    }
                });
                CameraHelper.this.i();
            }
        }, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:3:0x0006, B:6:0x000d, B:8:0x0019, B:14:0x0025, B:16:0x0029, B:18:0x0039, B:19:0x0043, B:21:0x0053, B:22:0x005d, B:24:0x006d, B:25:0x0076), top: B:30:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(boolean r6) {
        /*
            r5 = this;
            java.lang.String r0 = "XG4="
            java.lang.String r1 = "O29DY2g="
            java.lang.String r2 = "XGZm"
            r5.f24085t = r6     // Catch: java.lang.Throwable -> L7a
            android.hardware.Camera r6 = r5.f24069d     // Catch: java.lang.Throwable -> L7a
            if (r6 != 0) goto Ld
            return
        Ld:
            android.hardware.Camera$Parameters r3 = r6.getParameters()     // Catch: java.lang.Throwable -> L7a
            java.util.List r4 = r3.getSupportedFlashModes()     // Catch: java.lang.Throwable -> L7a
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L7a
            if (r4 == 0) goto L22
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r4 == 0) goto L20
            goto L22
        L20:
            r4 = 0
            goto L23
        L22:
            r4 = 1
        L23:
            if (r4 != 0) goto L76
            boolean r4 = r5.f24085t     // Catch: java.lang.Throwable -> L7a
            if (r4 == 0) goto L5d
            java.util.List r2 = r3.getSupportedFlashModes()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "1tceif2M"
            java.lang.String r4 = ea.a.p(r1, r4)     // Catch: java.lang.Throwable -> L7a
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L43
            java.lang.String r0 = "MF63rsl3"
            java.lang.String r0 = ea.a.p(r1, r0)     // Catch: java.lang.Throwable -> L7a
            r3.setFlashMode(r0)     // Catch: java.lang.Throwable -> L7a
            goto L76
        L43:
            java.util.List r1 = r3.getSupportedFlashModes()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "5KjSNcmZ"
            java.lang.String r2 = ea.a.p(r0, r2)     // Catch: java.lang.Throwable -> L7a
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L76
            java.lang.String r1 = "Da5i8BBx"
            java.lang.String r0 = ea.a.p(r0, r1)     // Catch: java.lang.Throwable -> L7a
            r3.setFlashMode(r0)     // Catch: java.lang.Throwable -> L7a
            goto L76
        L5d:
            java.util.List r0 = r3.getSupportedFlashModes()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "UkSe5Si1"
            java.lang.String r1 = ea.a.p(r2, r1)     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L76
            java.lang.String r0 = "02xYZPoP"
            java.lang.String r0 = ea.a.p(r2, r0)     // Catch: java.lang.Throwable -> L7a
            r3.setFlashMode(r0)     // Catch: java.lang.Throwable -> L7a
        L76:
            r6.setParameters(r3)     // Catch: java.lang.Throwable -> L7a
            goto L86
        L7a:
            r6 = move-exception
            java.lang.String r0 = "UGg4Zg=="
            java.lang.String r1 = "0Vz9bK8W"
            java.lang.String r0 = ea.a.p(r0, r1)
            b.b.M(r0, r6)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.camera.camera.CameraHelper.o(boolean):void");
    }

    public final void p(final String filePath, final int i10, final int i11, final CameraActivity cameraActivity) {
        Integer num;
        final sl.a aVar;
        final sl.a aVar2;
        Handler handler = this.f24076k;
        g.e(filePath, "filePath");
        Camera camera = this.f24069d;
        if (camera != null && (num = this.f24070e) != null) {
            final int intValue = num.intValue();
            final sl.a aVar3 = this.f24072g;
            if (aVar3 == null || (aVar = this.f24074i) == null || (aVar2 = this.f24073h) == null) {
                return;
            }
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(intValue, cameraInfo);
                if (cameraInfo.canDisableShutterSound) {
                    camera.enableShutterSound(false);
                }
            } catch (Throwable unused) {
                ea.a.p("UGg_cHM=", "1XdFaWkm");
            }
            try {
                camera.takePicture(null, null, new Camera.PictureCallback() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.b
                    @Override // android.hardware.Camera.PictureCallback
                    public final void onPictureTaken(byte[] bArr, Camera camera2) {
                        int i12 = intValue;
                        int i13 = i11;
                        int i14 = i10;
                        String p10 = ea.a.p("R2gic1cw", "gmW0L23n");
                        CameraHelper cameraHelper = CameraHelper.this;
                        g.e(cameraHelper, p10);
                        String p11 = ea.a.p("F2YibBZQA3Ro", "0dqNbyEs");
                        String str = filePath;
                        g.e(str, p11);
                        String p12 = ea.a.p("a2NQbRxyVlAoZTxpEHc7aU9l", "TLytpjfK");
                        sl.a aVar4 = aVar3;
                        g.e(aVar4, p12);
                        String p13 = ea.a.p("F3MjbwRQEGUEaVF3JGEuUy16ZQ==", "v3e152T2");
                        sl.a aVar5 = aVar;
                        g.e(aVar5, p13);
                        String p14 = ea.a.p("QXVAZR1TVmUYcgN2XWUgTVl4AWkzZQ==", "8Xe3o3iH");
                        sl.a aVar6 = aVar2;
                        g.e(aVar6, p14);
                        String p15 = ea.a.p("QWwCcwxlWWVy", "bbekx7rn");
                        rl.a aVar7 = cameraActivity;
                        g.e(aVar7, p15);
                        cameraHelper.f24081p = t0.d0(cameraHelper.f24068b, null, null, new CameraHelper$takePhoto$1$1(cameraHelper, bArr, i12, str, i13, aVar4, aVar5, aVar6, i14, aVar7, null), 3);
                    }
                });
                try {
                    l1.a aVar4 = new l1.a(13, this, cameraActivity);
                    this.f24077l = aVar4;
                    handler.postDelayed(aVar4, 10000L);
                } catch (Throwable unused2) {
                    l1.a aVar5 = this.f24077l;
                    if (aVar5 != null) {
                        handler.removeCallbacks(aVar5);
                    }
                    cameraActivity.s0();
                    ea.a.p("LGhFcA==", "KhzYb4wX");
                }
            } catch (Throwable unused3) {
            }
        }
    }
}
