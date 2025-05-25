package rf;

import android.opengl.GLES20;

/* compiled from: GPUImageContrastFilter.java */
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: i  reason: collision with root package name */
    public int f29511i;

    /* renamed from: j  reason: collision with root package name */
    public float f29512j;

    public c() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform lowp float contrast;\n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     gl_FragColor = vec4(((textureColor.rgb - vec3(0.5)) * contrast + vec3(0.5)), textureColor.w);\n }");
        this.f29512j = 1.2f;
    }

    @Override // rf.e
    public final void i() {
        super.i();
        this.f29511i = GLES20.glGetUniformLocation(this.f29517d, "contrast");
    }

    @Override // rf.e
    public final void j() {
        float f10 = this.f29512j;
        this.f29512j = f10;
        l(f10, this.f29511i);
    }
}
