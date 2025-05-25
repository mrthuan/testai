package rf;

import android.annotation.SuppressLint;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.gpuimage.util.Rotation;

/* compiled from: GPUImageFilterGroup.java */
/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: i  reason: collision with root package name */
    public final List<e> f29522i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f29523j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f29524k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f29525l;

    /* renamed from: m  reason: collision with root package name */
    public final FloatBuffer f29526m;

    /* renamed from: n  reason: collision with root package name */
    public final FloatBuffer f29527n;

    /* renamed from: o  reason: collision with root package name */
    public final FloatBuffer f29528o;

    public f() {
        this(null);
    }

    @Override // rf.e
    public final void f() {
        int[] iArr = this.f29525l;
        if (iArr != null) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.f29525l = null;
        }
        int[] iArr2 = this.f29524k;
        if (iArr2 != null) {
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.f29524k = null;
        }
        for (e eVar : this.f29522i) {
            eVar.d();
        }
    }

    @Override // rf.e
    @SuppressLint({"WrongCall"})
    public final void g(int i10, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        ArrayList arrayList;
        boolean z10;
        synchronized (this.f29515a) {
            while (!this.f29515a.isEmpty()) {
                this.f29515a.removeFirst().run();
            }
        }
        if (this.f29521h && this.f29524k != null && this.f29525l != null && (arrayList = this.f29523j) != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar = (e) this.f29523j.get(i11);
                int i12 = size - 1;
                if (i11 < i12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    GLES20.glBindFramebuffer(36160, this.f29524k[i11]);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i11 == 0) {
                    eVar.g(i10, floatBuffer, floatBuffer2);
                } else {
                    FloatBuffer floatBuffer3 = this.f29527n;
                    FloatBuffer floatBuffer4 = this.f29526m;
                    if (i11 == i12) {
                        if (size % 2 == 0) {
                            floatBuffer3 = this.f29528o;
                        }
                        eVar.g(i10, floatBuffer4, floatBuffer3);
                    } else {
                        eVar.g(i10, floatBuffer4, floatBuffer3);
                    }
                }
                if (z10) {
                    GLES20.glBindFramebuffer(36160, 0);
                    i10 = this.f29525l[i11];
                }
            }
        }
    }

    @Override // rf.e
    public final void i() {
        super.i();
        for (e eVar : this.f29522i) {
            eVar.e();
        }
    }

    @Override // rf.e
    public final void k(int i10, int i11) {
        if (this.f29524k != null) {
            int[] iArr = this.f29525l;
            if (iArr != null) {
                GLES20.glDeleteTextures(iArr.length, iArr, 0);
                this.f29525l = null;
            }
            int[] iArr2 = this.f29524k;
            if (iArr2 != null) {
                GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
                this.f29524k = null;
            }
        }
        List<e> list = this.f29522i;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            list.get(i12).k(i10, i11);
        }
        ArrayList arrayList = this.f29523j;
        if (arrayList != null && arrayList.size() > 0) {
            int i13 = 1;
            int size2 = this.f29523j.size() - 1;
            this.f29524k = new int[size2];
            this.f29525l = new int[size2];
            int i14 = 0;
            while (i14 < size2) {
                GLES20.glGenFramebuffers(i13, this.f29524k, i14);
                GLES20.glGenTextures(i13, this.f29525l, i14);
                GLES20.glBindTexture(3553, this.f29525l[i14]);
                GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glBindFramebuffer(36160, this.f29524k[i14]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f29525l[i14], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                i14++;
                i13 = 1;
            }
        }
    }

    public final void m() {
        List<e> list = this.f29522i;
        if (list == null) {
            return;
        }
        ArrayList arrayList = this.f29523j;
        if (arrayList == null) {
            this.f29523j = new ArrayList();
        } else {
            arrayList.clear();
        }
        for (e eVar : list) {
            if (eVar instanceof f) {
                f fVar = (f) eVar;
                fVar.m();
                ArrayList arrayList2 = fVar.f29523j;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    this.f29523j.addAll(arrayList2);
                }
            } else {
                this.f29523j.add(eVar);
            }
        }
    }

    public f(ArrayList arrayList) {
        this.f29522i = arrayList;
        if (arrayList == null) {
            this.f29522i = new ArrayList();
        } else {
            m();
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f29526m = asFloatBuffer;
        asFloatBuffer.put(jp.co.cyberagent.android.gpuimage.a.f19410r).position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f29527n = asFloatBuffer2;
        asFloatBuffer2.put(sf.b.f29797a).position(0);
        float[] b10 = sf.b.b(Rotation.NORMAL, false, true);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(b10.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f29528o = asFloatBuffer3;
        asFloatBuffer3.put(b10).position(0);
    }
}
