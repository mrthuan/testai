package rf;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import jp.co.cyberagent.android.gpuimage.util.Rotation;

/* compiled from: GPUImageTwoInputFilter.java */
/* loaded from: classes.dex */
public class i extends e {

    /* renamed from: i  reason: collision with root package name */
    public int f29535i;

    /* renamed from: j  reason: collision with root package name */
    public int f29536j;

    /* renamed from: k  reason: collision with root package name */
    public int f29537k;

    /* renamed from: l  reason: collision with root package name */
    public ByteBuffer f29538l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f29539m;

    public i() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor.a);\n }");
        this.f29537k = -1;
        float[] b10 = sf.b.b(Rotation.NORMAL, false, false);
        ByteBuffer order = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = order.asFloatBuffer();
        asFloatBuffer.put(b10);
        asFloatBuffer.flip();
        this.f29538l = order;
    }

    @Override // rf.e
    public final void f() {
        GLES20.glDeleteTextures(1, new int[]{this.f29537k}, 0);
        this.f29537k = -1;
    }

    @Override // rf.e
    public final void h() {
        GLES20.glEnableVertexAttribArray(this.f29535i);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.f29537k);
        GLES20.glUniform1i(this.f29536j, 3);
        this.f29538l.position(0);
        GLES20.glVertexAttribPointer(this.f29535i, 2, 5126, false, 0, (Buffer) this.f29538l);
    }

    @Override // rf.e
    public void i() {
        super.i();
        this.f29535i = GLES20.glGetAttribLocation(this.f29517d, "inputTextureCoordinate2");
        this.f29536j = GLES20.glGetUniformLocation(this.f29517d, "inputImageTexture2");
        GLES20.glEnableVertexAttribArray(this.f29535i);
    }
}
