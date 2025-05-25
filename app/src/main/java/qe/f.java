package qe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* compiled from: RenderEffectBlur.java */
/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: b  reason: collision with root package name */
    public int f29306b;
    public int c;

    /* renamed from: e  reason: collision with root package name */
    public g f29308e;

    /* renamed from: f  reason: collision with root package name */
    public Context f29309f;

    /* renamed from: a  reason: collision with root package name */
    public final RenderNode f29305a = a4.f.d();

    /* renamed from: d  reason: collision with root package name */
    public float f29307d = 1.0f;

    @Override // qe.a
    public final Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // qe.a
    public final void d(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f29305a);
            return;
        }
        if (this.f29308e == null) {
            this.f29308e = new g(this.f29309f);
        }
        this.f29308e.e(bitmap, this.f29307d);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f29308e.f29310a);
    }

    @Override // qe.a
    public final void destroy() {
        this.f29305a.discardDisplayList();
        g gVar = this.f29308e;
        if (gVar != null) {
            gVar.destroy();
        }
    }

    @Override // qe.a
    public final Bitmap e(Bitmap bitmap, float f10) {
        RecordingCanvas beginRecording;
        RenderEffect createBlurEffect;
        this.f29307d = f10;
        int height = bitmap.getHeight();
        int i10 = this.f29306b;
        RenderNode renderNode = this.f29305a;
        if (height != i10 || bitmap.getWidth() != this.c) {
            this.f29306b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.c = width;
            renderNode.setPosition(0, 0, width, this.f29306b);
        }
        beginRecording = renderNode.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        renderNode.endRecording();
        createBlurEffect = RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR);
        renderNode.setRenderEffect(createBlurEffect);
        return bitmap;
    }

    @Override // qe.a
    public final void a() {
    }

    @Override // qe.a
    public final void c() {
    }
}
