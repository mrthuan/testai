package pdf.pdfreader.viewer.editor.free.camera.camera.util;

import android.hardware.Camera;
import cg.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.j;
import kotlin.collections.m;
import kotlin.jvm.internal.g;

/* compiled from: CameraUtil.kt */
/* loaded from: classes3.dex */
public final class CameraUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final sl.a f24101a = new sl.a(1920, 1080);

    public static sl.a a(Camera camera, sl.a aVar) {
        List<Camera.Size> supportedPictureSizes = camera.getParameters().getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPictureSizes) {
            int i10 = size.width;
            int i11 = size.height;
            if (i10 * i11 >= 2073600) {
                arrayList.add(new sl.a(i10, i11));
            }
        }
        final CameraUtil$getBestCameraCaptureSize$1 cameraUtil$getBestCameraCaptureSize$1 = new p<sl.a, sl.a, Integer>() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.CameraUtil$getBestCameraCaptureSize$1
            @Override // cg.p
            public final Integer invoke(sl.a aVar2, sl.a aVar3) {
                return Integer.valueOf((aVar3.f29823a * aVar3.f29824b) - (aVar2.f29823a * aVar2.f29824b));
            }
        };
        j.j0(arrayList, new Comparator() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String p10 = ea.a.p("a3RccDA=", "wCCl3RbF");
                p pVar = p.this;
                g.e(pVar, p10);
                return ((Number) pVar.invoke(obj, obj2)).intValue();
            }
        });
        float a10 = aVar.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sl.a aVar2 = (sl.a) it.next();
            if (Math.abs(a10 - aVar2.a()) < 0.01d) {
                ea.a.p("LGFBdAxyUlMzemU=", "4cK8BJJy");
                return aVar2;
            }
        }
        if (!arrayList.isEmpty()) {
            return (sl.a) m.r0(arrayList);
        }
        ea.a.p("IWFGdDZyXFMhegNMXXN0", "7NB6C91z");
        final CameraUtil$getBestCameraCaptureSize$2 cameraUtil$getBestCameraCaptureSize$2 = new p<Camera.Size, Camera.Size, Integer>() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.CameraUtil$getBestCameraCaptureSize$2
            @Override // cg.p
            public final Integer invoke(Camera.Size size2, Camera.Size size3) {
                return Integer.valueOf((size3.width * size3.height) - (size2.width * size2.height));
            }
        };
        j.j0(supportedPictureSizes, new Comparator() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String p10 = ea.a.p("F3QmcDA=", "IDJya3oc");
                p pVar = p.this;
                g.e(pVar, p10);
                return ((Number) pVar.invoke(obj, obj2)).intValue();
            }
        });
        if (!supportedPictureSizes.isEmpty()) {
            Camera.Size size2 = (Camera.Size) m.r0(supportedPictureSizes);
            return new sl.a(size2.width, size2.height);
        }
        return f24101a;
    }

    public static sl.a b(Camera camera, sl.a aVar) {
        boolean z10;
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        double d10 = aVar.f29824b;
        int i10 = (int) (d10 * 0.6d);
        double d11 = aVar.f29823a;
        int i11 = (int) (0.6d * d11);
        int i12 = (int) (d10 * 1.5d);
        int i13 = 1280;
        if (i12 < 1280) {
            i12 = 1280;
        }
        int i14 = (int) (d11 * 1.5d);
        if (i14 >= 1280) {
            i13 = i14;
        }
        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Camera.Size next = it.next();
            int i15 = next.width;
            if (i10 <= i15 && i15 <= i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i16 = next.height;
                if ((i11 > i16 || i16 > i13) ? false : false) {
                    arrayList.add(new sl.a(i15, i16));
                }
            }
        }
        final float a10 = 1.0f / aVar.a();
        j.j0(arrayList, new c(new p<sl.a, sl.a, Integer>() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.CameraUtil$getBestCameraPreviewSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public final Integer invoke(sl.a aVar2, sl.a aVar3) {
                int i17 = aVar2.f29824b;
                float f10 = (aVar2.f29823a * 1.0f) / i17;
                int i18 = aVar3.f29824b;
                float abs = Math.abs(f10 - a10) - Math.abs(((aVar3.f29823a * 1.0f) / i18) - a10);
                if (Math.abs(abs) < 0.001d) {
                    return Integer.valueOf((aVar3.f29823a * i18) - (aVar2.f29823a * i17));
                }
                if (abs < 0.0f) {
                    return -1;
                }
                return 1;
            }
        }, 0));
        ArrayList arrayList2 = new ArrayList();
        for (Camera.Size size : supportedPictureSizes) {
            int i17 = size.width;
            int i18 = size.height;
            if (i17 * i18 >= 2073600) {
                arrayList2.add(new sl.a(i17, i18));
            }
        }
        final CameraUtil$getBestCameraPreviewSize$2 cameraUtil$getBestCameraPreviewSize$2 = new p<sl.a, sl.a, Integer>() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.CameraUtil$getBestCameraPreviewSize$2
            @Override // cg.p
            public final Integer invoke(sl.a aVar2, sl.a aVar3) {
                return Integer.valueOf((aVar3.f29823a * aVar3.f29824b) - (aVar2.f29823a * aVar2.f29824b));
            }
        };
        j.j0(arrayList2, new Comparator() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String p10 = ea.a.p("dHQ0cDA=", "yVPYHkLz");
                p pVar = p.this;
                g.e(pVar, p10);
                return ((Number) pVar.invoke(obj, obj2)).intValue();
            }
        });
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sl.a aVar2 = (sl.a) it2.next();
            float a11 = aVar2.a();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (Math.abs(a11 - ((sl.a) it3.next()).a()) < 0.01d) {
                    ea.a.p("Q3IOdgBlFVMhemU=", "UP3kib7U");
                    return aVar2;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return (sl.a) m.r0(arrayList);
        }
        ea.a.p("Q3IudhplFVMbelFMAHN0", "QlBm5Vhr");
        final p<Camera.Size, Camera.Size, Integer> pVar = new p<Camera.Size, Camera.Size, Integer>() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.CameraUtil$getBestCameraPreviewSize$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public final Integer invoke(Camera.Size size2, Camera.Size size3) {
                float abs = Math.abs(((size2.width * 1.0f) / size2.height) - a10) - Math.abs(((size3.width * 1.0f) / size3.height) - a10);
                if (Math.abs(abs) < 0.001d) {
                    return Integer.valueOf((size3.width * size3.height) - (size2.width * size2.height));
                }
                if (abs < 0.0f) {
                    return -1;
                }
                return 1;
            }
        };
        j.j0(supportedPreviewSizes, new Comparator() { // from class: pdf.pdfreader.viewer.editor.free.camera.camera.util.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String p10 = ea.a.p("F3QmcDA=", "P0E2xywL");
                p pVar2 = p.this;
                g.e(pVar2, p10);
                return ((Number) pVar2.invoke(obj, obj2)).intValue();
            }
        });
        if (!supportedPreviewSizes.isEmpty()) {
            Camera.Size size2 = (Camera.Size) m.r0(supportedPreviewSizes);
            return new sl.a(size2.width, size2.height);
        }
        return f24101a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(android.app.Activity r2, int r3) {
        /*
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g.e(r2, r0)
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r0.<init>()
            android.hardware.Camera.getCameraInfo(r3, r0)
            android.view.WindowManager r2 = r2.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getRotation()
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2b
            r1 = 2
            if (r2 == r1) goto L28
            r1 = 3
            if (r2 == r1) goto L25
            goto L2e
        L25:
            r2 = 270(0x10e, float:3.78E-43)
            goto L2f
        L28:
            r2 = 180(0xb4, float:2.52E-43)
            goto L2f
        L2b:
            r2 = 90
            goto L2f
        L2e:
            r2 = 0
        L2f:
            int r1 = r0.facing
            if (r1 != r3) goto L3d
            int r3 = r0.orientation
            int r3 = r3 + r2
            int r3 = r3 % 360
            int r2 = 360 - r3
            int r2 = r2 % 360
            goto L44
        L3d:
            int r3 = r0.orientation
            int r3 = r3 - r2
            int r3 = r3 + 360
            int r2 = r3 % 360
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.camera.camera.util.CameraUtil.c(android.app.Activity, int):int");
    }
}
