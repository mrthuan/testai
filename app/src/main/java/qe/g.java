package qe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* compiled from: RenderScriptBlur.java */
@Deprecated
/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: b  reason: collision with root package name */
    public final RenderScript f29311b;
    public final ScriptIntrinsicBlur c;

    /* renamed from: d  reason: collision with root package name */
    public Allocation f29312d;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f29310a = new Paint(2);

    /* renamed from: e  reason: collision with root package name */
    public int f29313e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f29314f = -1;

    public g(Context context) {
        RenderScript create = RenderScript.create(context);
        this.f29311b = create;
        this.c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    @Override // qe.a
    public final Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    @Override // qe.a
    public final void d(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f29310a);
    }

    @Override // qe.a
    public final void destroy() {
        this.c.destroy();
        this.f29311b.destroy();
        Allocation allocation = this.f29312d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @Override // qe.a
    public final Bitmap e(Bitmap bitmap, float f10) {
        boolean z10;
        RenderScript renderScript = this.f29311b;
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        if (bitmap.getHeight() == this.f29314f && bitmap.getWidth() == this.f29313e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Allocation allocation = this.f29312d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f29312d = Allocation.createTyped(renderScript, createFromBitmap.getType());
            this.f29313e = bitmap.getWidth();
            this.f29314f = bitmap.getHeight();
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.c;
        scriptIntrinsicBlur.setRadius(f10);
        scriptIntrinsicBlur.setInput(createFromBitmap);
        scriptIntrinsicBlur.forEach(this.f29312d);
        this.f29312d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }

    @Override // qe.a
    public final void a() {
    }

    @Override // qe.a
    public final void c() {
    }
}
