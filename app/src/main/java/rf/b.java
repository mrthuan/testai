package rf;

import android.opengl.GLES20;

/* compiled from: GPUImageBrightnessFilter.java */
/* loaded from: classes.dex */
public class b extends e {

    /* renamed from: i  reason: collision with root package name */
    public int f29509i;

    /* renamed from: j  reason: collision with root package name */
    public float f29510j;

    public b() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float brightness;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4((textureColor.rgb + vec3(brightness)), textureColor.w);\n }");
        this.f29510j = 0.0f;
    }

    @Override // rf.e
    public final void i() {
        super.i();
        this.f29509i = GLES20.glGetUniformLocation(this.f29517d, "brightness");
    }

    @Override // rf.e
    public final void j() {
        float f10 = this.f29510j;
        this.f29510j = f10;
        l(f10, this.f29509i);
    }
}
