package qf;

import android.opengl.GLES20;
import java.nio.IntBuffer;
import jp.co.cyberagent.android.gpuimage.GPUImageNativeLibrary;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ byte[] f29316a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f29317b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ jp.co.cyberagent.android.gpuimage.a f29318d;

    public b(jp.co.cyberagent.android.gpuimage.a aVar, byte[] bArr, int i10, int i11) {
        this.f29318d = aVar;
        this.f29316a = bArr;
        this.f29317b = i10;
        this.c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        jp.co.cyberagent.android.gpuimage.a aVar = this.f29318d;
        int[] array = aVar.f19416g.array();
        byte[] bArr = this.f29316a;
        int i10 = this.f29317b;
        int i11 = this.c;
        GPUImageNativeLibrary.YUVtoRBGA(bArr, i10, i11, array);
        IntBuffer intBuffer = aVar.f19416g;
        int i12 = this.f29317b;
        int i13 = this.c;
        int i14 = aVar.c;
        int[] iArr = new int[1];
        if (i14 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            c = 0;
            GLES20.glTexImage2D(3553, 0, 6408, i12, i13, 0, 6408, 5121, intBuffer);
        } else {
            c = 0;
            GLES20.glBindTexture(3553, i14);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i12, i13, 6408, 5121, intBuffer);
            iArr[0] = i14;
        }
        aVar.c = iArr[c];
        if (aVar.f19419j != i10) {
            aVar.f19419j = i10;
            aVar.f19420k = i11;
            aVar.b();
        }
    }
}
