package nn;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.hssf.record.BOFRecord;

/* compiled from: CameraUtils.kt */
/* loaded from: classes3.dex */
public final class a {
    public static int a(Context context) {
        long j10;
        jn.a.c.getClass();
        int intValue = ((Number) jn.a.f19331l.b(jn.a.f19323d[7])).intValue();
        if (intValue == 0) {
            int i10 = 0;
            Integer num = null;
            try {
                EGL egl = EGLContext.getEGL();
                g.c(egl, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuN25hbgBsHiA7eUFlWWpWdjt4ZG0cYxpvUGQHdCxvCy4zaD5vG28BLipnXS48R3sxMA==", "U3TOXLur"));
                EGL10 egl10 = (EGL10) egl;
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                g.d(eglGetDisplay, ea.a.p("KmddLhxnW0c_dA5pBnAEYUwoK0cJMVUuC0cnXw5Fd0EaTGVfPUlkUBZBEyk=", "GdG4NkJ1"));
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
                int i11 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i11];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i11, iArr);
                int[] iArr2 = new int[1];
                int i12 = iArr[0];
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i14], 12332, iArr2);
                    int i15 = iArr2[0];
                    if (i13 < i15) {
                        i13 = i15;
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                num = Integer.valueOf(i13);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            if (num != null) {
                i10 = num.intValue();
            }
            int i16 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i10 <= 0) {
                intValue = Integer.MAX_VALUE;
            } else {
                intValue = i10 - 200;
                if (intValue < 1080) {
                    intValue = 1080;
                }
            }
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                Object systemService = context.getSystemService(ea.a.p("LmNFaQ9pQ3k=", "YiYvMObi"));
                g.c(systemService, ea.a.p("JHUkbBZjD24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA-eThlFmEAZDpvD2QaYSdwFkExdCB2X3QNTRBuMGcncg==", "MUJH6nzn"));
                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                long j11 = 1024;
                j10 = (memoryInfo.totalMem / j11) / j11;
            } catch (Throwable th3) {
                th3.printStackTrace();
                j10 = 1024;
            }
            if (j10 < 1024) {
                i16 = 1080;
            } else if (j10 < 1500) {
                i16 = BOFRecord.VERSION;
            } else if (j10 < 2000) {
                i16 = 1920;
            } else if (j10 < 3000) {
                i16 = 3072;
            }
            if (intValue > i16) {
                intValue = i16;
            }
            if (intValue > 4320) {
                intValue = 4320;
            }
            jn.a.c.getClass();
            jn.a.f19331l.c(jn.a.f19323d[7], Integer.valueOf(intValue));
        }
        return intValue;
    }
}
