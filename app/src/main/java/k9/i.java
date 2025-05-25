package k9;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import f9.h;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes2.dex */
public class i extends f9.h {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f19660y = 0;

    /* renamed from: x  reason: collision with root package name */
    public a f19661x;

    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    /* loaded from: classes2.dex */
    public static class b extends i {
        @Override // f9.h
        public final void g(Canvas canvas) {
            if (this.f19661x.f19662v.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f19661x.f19662v);
            } else {
                canvas.clipRect(this.f19661x.f19662v, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    public i(a aVar) {
        super(aVar);
        this.f19661x = aVar;
    }

    @Override // f9.h, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f19661x = new a(this.f19661x);
        return this;
    }

    public final void x(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f19661x.f19662v;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* compiled from: CutoutDrawable.java */
    /* loaded from: classes2.dex */
    public static final class a extends h.b {

        /* renamed from: v  reason: collision with root package name */
        public final RectF f19662v;

        public a(f9.m mVar, RectF rectF) {
            super(mVar);
            this.f19662v = rectF;
        }

        @Override // f9.h.b, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.invalidateSelf();
            return bVar;
        }

        public a(a aVar) {
            super(aVar);
            this.f19662v = aVar.f19662v;
        }
    }
}
