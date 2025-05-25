package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Hp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0854Hp implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static String[] A07 = {"feH6P3nQc3OotB4oQb1UE4FOCH6DqRKq", "ul8YptaadtnD", "q4PkZUS7m1HQSRKJ6o4wpu1", "XXuYebdEWKh7urEHiQwrXLDoBbLcg7", "7R8f8O3Jq8ptPdlyh265i6bwGIY3AnOr", "VVgrfIl8yumQyldYn3WSYqBvmAVi9h2x", "B0KhbmvhQV1sBquLYa8NcmTHXN0flo", "NAMxGSXXDRlS3a9YhTQZIWUlxo26242h"};
    public static final int[] A08;
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A07[5].charAt(20) == '6') {
                throw new RuntimeException();
            }
            A07[5] = "lcJc9HVFX4T0AsiVqO0X3akbdgs9NHnd";
            copyOfRange[i13] = (byte) (i14 ^ 109);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{Field.SYMBOL, 59, 48, 31, Field.AUTONUMOUT, Field.MACROBUTTON, Field.MACROBUTTON, Field.GLOSSARY, Field.SYMBOL, 31, Field.MACROBUTTON, Field.GOTOBUTTON, 58, Field.AUTONUMLGL, 59, 124, 58, 61, Field.AUTONUMLGL, 48, Field.SYMBOL, 56, 102, 124, Field.GLOSSARY, 41, Field.BARCODE, Field.BARCODE, Field.SYMBOL, Field.GLOSSARY, Field.GLOSSARY, 97, 121, Field.USERADDRESS, 112, 124, Field.GOTOBUTTON, 41, Field.EQ, 31, Field.MACROBUTTON, Field.GOTOBUTTON, 58, Field.AUTONUMLGL, 59, Field.GLOSSARY, 7, 108, 1, 97, 121, 56, 112, 124, Field.BARCODE, Field.MACROBUTTON, Field.GOTOBUTTON, 58, Field.AUTONUMLGL, 59, Field.GLOSSARY, 7, 108, 1, 97, 121, Field.GLOSSARY, Field.NUMCHARS, 30, 21, 58, 11, Field.NUMCHARS, 24, 13, Field.NUMCHARS, 58, 22, 23, 13, Field.NUMCHARS, 1, 13, Field.AUTOTEXTLIST, 31, 24, 16, 21, Field.NUMCHARS, 29, 7, 5, 14, 33, 16, 7, 3, 22, 7, Field.GOTOBUTTON, 0, 23, 4, 4, 7, 16, Field.EQ, 23, 16, 4, 3, 1, 7, Field.SECTIONPAGES, 4, 3, 11, 14, 7, 6, Field.NOTEREF, 74, Field.SECTION, 106, Field.NOTEREF, Field.AUTOTEXTLIST, 105, Field.INCLUDETEXT, Field.GREETINGLINE, Field.ADDRESSBLOCK, Field.SECTION, 76, Field.ADVANCE, 13, Field.MERGESEQ, 76, Field.INCLUDETEXT, Field.SECTION, Field.NOTEREF, Field.TOA, 31, 29, 22, Field.MACROBUTTON, 20, 19, 14, 19, Field.NUMWORDS, 22, 19, 0, 31, Field.LISTNUM, Field.NUMCHARS, Field.NUMWORDS, 19, 22, 31, 30, Field.INCLUDETEXT, Field.FORMTEXT, 77, 108, 64, 74, Field.INCLUDETEXT, 98, Field.ADVANCE, Field.FORMDROPDOWN, Field.FORMDROPDOWN, Field.INCLUDETEXT, Field.AUTOTEXT, Field.DOCPROPERTY, 1, Field.FORMCHECKBOX, 64, Field.NOTEREF, 77, Field.INCLUDETEXT, Field.FILESIZE, Field.ADDIN, Field.LISTNUM, 113, Field.FORMDROPDOWN, Field.HYPERLINK, 98, Field.FORMDROPDOWN, 78, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.FORMDROPDOWN, Field.FILESIZE, 22, 80, Field.CONTROL, Field.SHAPE, Field.LISTNUM, Field.FORMDROPDOWN, 82, 24, 22, 115, Field.INCLUDETEXT, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.INCLUDETEXT, 12, 22};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public RunnableC0854Hp(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, A08, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0) {
            EGLConfig eGLConfig = eGLConfigArr[0];
            if (A07[2].length() == 26) {
                throw new RuntimeException();
            }
            A07[7] = "SLLQjWjncbGd9Rz2WSR3ZqU1MRAKPCr3";
            if (eGLConfig != null) {
                return eGLConfigArr[0];
            }
        }
        throw new C0852Hn(IK.A0P(A04(0, 67, 49), Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        int[] iArr;
        if (i10 != 0) {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        } else {
            iArr = new int[]{12440, 2, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C0852Hn(A04(67, 23, 20));
    }

    public static EGLDisplay A02() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new C0852Hn(A04(120, 20, 64));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new C0852Hn(A04(ShapeTypes.FLOW_CHART_PREPARATION, 20, 23));
        }
        return eglGetDisplay;
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        int[] pbufferAttributes;
        EGLSurface eglCreatePbufferSurface;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, pbufferAttributes, 0);
            if (eglCreatePbufferSurface == null) {
                throw new C0852Hn(A04(90, 30, 15));
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            throw new C0852Hn(A04(160, 21, 76));
        }
        return eglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new C0852Hn(A04(ShapeTypes.MATH_NOT_EQUAL, 29, 91) + Integer.toHexString(glGetError));
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) AbstractC0844Hf.A01(this.A00);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public final void A08() {
        this.A04.removeCallbacks(this);
        try {
            if (this.A00 != null) {
                this.A00.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
        } finally {
            if (this.A02 != null && !this.A02.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.A02, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            if (this.A03 != null && !this.A03.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            if (this.A01 != null) {
                EGL14.eglDestroyContext(this.A02, this.A01);
            }
            if (IK.A02 >= 19) {
                EGL14.eglReleaseThread();
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
        }
    }

    public final void A09(int i10) {
        this.A02 = A02();
        EGLConfig A00 = A00(this.A02);
        this.A01 = A01(this.A02, A00, i10);
        this.A03 = A03(this.A02, A00, this.A01, i10);
        A06(this.A05);
        this.A00 = new SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.updateTexImage();
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
