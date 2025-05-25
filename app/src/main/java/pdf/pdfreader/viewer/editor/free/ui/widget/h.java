package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: ShadowDrawable.java */
/* loaded from: classes3.dex */
public final class h extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f28395a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f28396b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28397d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final int f28398e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28399f;

    /* renamed from: g  reason: collision with root package name */
    public final int f28400g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f28401h;

    /* renamed from: i  reason: collision with root package name */
    public RectF f28402i;

    /* compiled from: ShadowDrawable.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f28403a = 12;

        /* renamed from: b  reason: collision with root package name */
        public int f28404b = Color.parseColor(ea.a.p("EDQvMEMwUjAw", "58QFxKBe"));
        public int c = 18;

        /* renamed from: d  reason: collision with root package name */
        public int f28405d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f28406e = 0;

        /* renamed from: f  reason: collision with root package name */
        public final int[] f28407f;

        public a() {
            this.f28407f = r1;
            int[] iArr = {0};
        }
    }

    public h(int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        this.f28401h = iArr;
        this.f28398e = i10;
        this.c = i12;
        this.f28399f = i13;
        this.f28400g = i14;
        Paint paint = new Paint();
        this.f28395a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(i12, i13, i14, i11);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        Paint paint2 = new Paint();
        this.f28396b = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f28396b;
        int[] iArr = this.f28401h;
        if (iArr != null) {
            if (iArr.length == 1) {
                paint.setColor(iArr[0]);
            } else {
                RectF rectF = this.f28402i;
                float f10 = rectF.left;
                float height = rectF.height() / 2.0f;
                RectF rectF2 = this.f28402i;
                paint.setShader(new LinearGradient(f10, height, rectF2.right, rectF2.height() / 2.0f, this.f28401h, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        int i10 = this.f28397d;
        Paint paint2 = this.f28395a;
        if (i10 == 1) {
            RectF rectF3 = this.f28402i;
            int i11 = this.f28398e;
            canvas.drawRoundRect(rectF3, i11, i11, paint2);
            canvas.drawRoundRect(this.f28402i, i11, i11, paint);
            return;
        }
        canvas.drawCircle(this.f28402i.centerX(), this.f28402i.centerY(), Math.min(this.f28402i.width(), this.f28402i.height()) / 2.0f, paint2);
        canvas.drawCircle(this.f28402i.centerX(), this.f28402i.centerY(), Math.min(this.f28402i.width(), this.f28402i.height()) / 2.0f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f28395a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.c;
        int i15 = this.f28399f;
        int i16 = this.f28400g;
        this.f28402i = new RectF((i10 + i14) - i15, (i11 + i14) - i16, (i12 - i14) - i15, (i13 - i14) - i16);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28395a.setColorFilter(colorFilter);
    }
}
