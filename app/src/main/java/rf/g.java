package rf;

import android.opengl.GLES20;

/* compiled from: GPUImageSharpenFilter.java */
/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: i  reason: collision with root package name */
    public int f29529i;

    /* renamed from: j  reason: collision with root package name */
    public float f29530j;

    /* renamed from: k  reason: collision with root package name */
    public int f29531k;

    /* renamed from: l  reason: collision with root package name */
    public int f29532l;

    public g() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \nuniform float sharpness;\n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate; \nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\n\nvarying float centerMultiplier;\nvarying float edgeMultiplier;\n\nvoid main()\n{\n    gl_Position = position;\n    \n    mediump vec2 widthStep = vec2(imageWidthFactor, 0.0);\n    mediump vec2 heightStep = vec2(0.0, imageHeightFactor);\n    \n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n    topTextureCoordinate = inputTextureCoordinate.xy + heightStep;     \n    bottomTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n    \n    centerMultiplier = 1.0 + 4.0 * sharpness;\n    edgeMultiplier = sharpness;\n}", "precision highp float;\n\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 leftTextureCoordinate;\nvarying highp vec2 rightTextureCoordinate; \nvarying highp vec2 topTextureCoordinate;\nvarying highp vec2 bottomTextureCoordinate;\n\nvarying highp float centerMultiplier;\nvarying highp float edgeMultiplier;\n\nuniform sampler2D inputImageTexture;\n\nvoid main()\n{\n    mediump vec3 textureColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;\n\n    gl_FragColor = vec4((textureColor * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), texture2D(inputImageTexture, bottomTextureCoordinate).w);\n}");
        this.f29530j = 0.0f;
    }

    @Override // rf.e
    public final void i() {
        super.i();
        this.f29529i = GLES20.glGetUniformLocation(this.f29517d, "sharpness");
        this.f29531k = GLES20.glGetUniformLocation(this.f29517d, "imageWidthFactor");
        this.f29532l = GLES20.glGetUniformLocation(this.f29517d, "imageHeightFactor");
    }

    @Override // rf.e
    public final void j() {
        float f10 = this.f29530j;
        this.f29530j = f10;
        l(f10, this.f29529i);
    }

    @Override // rf.e
    public final void k(int i10, int i11) {
        l(1.0f / i10, this.f29531k);
        l(1.0f / i11, this.f29532l);
    }
}
