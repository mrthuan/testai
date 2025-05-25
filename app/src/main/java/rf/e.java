package rf;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.LinkedList;

/* compiled from: GPUImageFilter.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<Runnable> f29515a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29516b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public int f29517d;

    /* renamed from: e  reason: collision with root package name */
    public int f29518e;

    /* renamed from: f  reason: collision with root package name */
    public int f29519f;

    /* renamed from: g  reason: collision with root package name */
    public int f29520g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f29521h;

    public e() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public final void d() {
        this.f29521h = false;
        GLES20.glDeleteProgram(this.f29517d);
        f();
    }

    public final void e() {
        if (!this.f29521h) {
            i();
            j();
        }
    }

    public void g(int i10, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        GLES20.glUseProgram(this.f29517d);
        synchronized (this.f29515a) {
            while (!this.f29515a.isEmpty()) {
                this.f29515a.removeFirst().run();
            }
        }
        if (!this.f29521h) {
            return;
        }
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(this.f29518e, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.f29518e);
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(this.f29520g, 2, 5126, false, 0, (Buffer) floatBuffer2);
        GLES20.glEnableVertexAttribArray(this.f29520g);
        if (i10 != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i10);
            GLES20.glUniform1i(this.f29519f, 0);
        }
        h();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f29518e);
        GLES20.glDisableVertexAttribArray(this.f29520g);
        GLES20.glBindTexture(3553, 0);
    }

    public void i() {
        int a10;
        int[] iArr = new int[1];
        int a11 = sf.a.a(35633, this.f29516b);
        int i10 = 0;
        if (a11 != 0 && (a10 = sf.a.a(35632, this.c)) != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(glCreateProgram, a11);
            GLES20.glAttachShader(glCreateProgram, a10);
            GLES20.glLinkProgram(glCreateProgram);
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] > 0) {
                GLES20.glDeleteShader(a11);
                GLES20.glDeleteShader(a10);
                i10 = glCreateProgram;
            }
        }
        this.f29517d = i10;
        this.f29518e = GLES20.glGetAttribLocation(i10, "position");
        this.f29519f = GLES20.glGetUniformLocation(this.f29517d, "inputImageTexture");
        this.f29520g = GLES20.glGetAttribLocation(this.f29517d, "inputTextureCoordinate");
        this.f29521h = true;
    }

    public final void l(float f10, int i10) {
        d dVar = new d(this, i10, f10);
        synchronized (this.f29515a) {
            this.f29515a.addLast(dVar);
        }
    }

    public e(String str, String str2) {
        this.f29515a = new LinkedList<>();
        this.f29516b = str;
        this.c = str2;
    }

    public void f() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k(int i10, int i11) {
    }
}
