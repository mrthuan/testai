package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import cg.p;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MagnifierContainer.kt */
/* loaded from: classes3.dex */
public final class MagnifierContainer extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Path f28213a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f28214b;
    public final Paint c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f28215d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f28216e;

    /* renamed from: f  reason: collision with root package name */
    public float f28217f;

    /* renamed from: g  reason: collision with root package name */
    public float f28218g;

    /* renamed from: h  reason: collision with root package name */
    public int f28219h;

    /* renamed from: i  reason: collision with root package name */
    public int f28220i;

    /* renamed from: j  reason: collision with root package name */
    public int f28221j;

    /* renamed from: k  reason: collision with root package name */
    public float f28222k;

    /* renamed from: l  reason: collision with root package name */
    public p<? super Boolean, ? super Boolean, tf.d> f28223l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MagnifierContainer(Context context) {
        this(context, null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "lzAa4e8c"));
    }

    private final float getScaleValue() {
        float f10 = this.f28222k;
        if (f10 < 2.5f) {
            return 1.8f;
        }
        if (f10 < 2.7f) {
            return 1.7f;
        }
        if (f10 < 3.0f) {
            return 1.6f;
        }
        if (f10 < 3.2f) {
            return 1.5f;
        }
        if (f10 < 3.4f) {
            return 1.4f;
        }
        if (f10 < 3.6f) {
            return 1.3f;
        }
        if (f10 < 3.8f) {
            return 1.2f;
        }
        if (f10 < 4.0f) {
            return 1.1f;
        }
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.graphics.Bitmap r5, float r6, float r7, int r8, int r9, int r10, float r11) {
        /*
            r4 = this;
            float r0 = r4.f28217f
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 != 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r3
        Ld:
            if (r0 != 0) goto L1d
            float r0 = r4.f28218g
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L17
            r0 = r2
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = r3
            goto L1e
        L1d:
            r0 = r2
        L1e:
            r4.f28216e = r5
            r4.f28217f = r6
            r4.f28218g = r7
            r4.f28221j = r10
            r4.f28219h = r8
            r4.f28220i = r9
            r4.f28222k = r11
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 != 0) goto L32
            r5 = r2
            goto L33
        L32:
            r5 = r3
        L33:
            if (r5 != 0) goto L4c
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 != 0) goto L3a
            goto L3b
        L3a:
            r2 = r3
        L3b:
            if (r2 == 0) goto L3e
            goto L4c
        L3e:
            cg.p<? super java.lang.Boolean, ? super java.lang.Boolean, tf.d> r5 = r4.f28223l
            if (r5 == 0) goto L59
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r5.invoke(r6, r7)
            goto L59
        L4c:
            cg.p<? super java.lang.Boolean, ? super java.lang.Boolean, tf.d> r5 = r4.f28223l
            if (r5 == 0) goto L59
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r5.invoke(r6, r7)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.MagnifierContainer.a(android.graphics.Bitmap, float, float, int, int, int, float):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Bitmap bitmap;
        kotlin.jvm.internal.g.e(canvas, "canvas");
        super.dispatchDraw(canvas);
        boolean z11 = true;
        if (this.f28217f == -1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (this.f28218g != -1.0f) {
                z11 = false;
            }
            if (!z11 && (bitmap = this.f28216e) != null) {
                kotlin.jvm.internal.g.b(bitmap);
                if (!bitmap.isRecycled()) {
                    canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                    float f10 = this.f28217f;
                    int i10 = this.f28219h;
                    float f11 = this.f28218g;
                    float f12 = 100;
                    int i11 = this.f28221j;
                    RectF rectF = new RectF(f10 - (i10 / 2), ((f11 - this.f28220i) - f12) + i11, f10 + (i10 / 2), (f11 - f12) + i11);
                    RectF rectF2 = new RectF(rectF.left - 0.5f, rectF.top - 0.5f, rectF.right + 0.5f, rectF.bottom + 0.5f);
                    int i12 = this.f28220i;
                    canvas.drawRoundRect(rectF2, i12 / 2.0f, i12 / 2.0f, this.c);
                    int i13 = this.f28220i;
                    canvas.drawRoundRect(rectF, i13 / 2.0f, i13 / 2.0f, this.f28215d);
                    canvas.save();
                    Path path = this.f28213a;
                    path.reset();
                    int i14 = this.f28220i;
                    path.addRoundRect(rectF, i14 / 2.0f, i14 / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    float scaleValue = getScaleValue();
                    canvas.scale(scaleValue, scaleValue, this.f28217f, ((this.f28218g - (this.f28220i / 2)) - f12) + this.f28221j);
                    canvas.drawColor(-1);
                    Bitmap bitmap2 = this.f28216e;
                    kotlin.jvm.internal.g.b(bitmap2);
                    canvas.drawBitmap(bitmap2, rectF.left, rectF.top, this.f28214b);
                    canvas.restore();
                }
            }
        }
    }

    public final p<Boolean, Boolean, tf.d> getOnMagnifierShowOrHide() {
        return this.f28223l;
    }

    public final void setOnMagnifierShowOrHide(p<? super Boolean, ? super Boolean, tf.d> pVar) {
        this.f28223l = pVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MagnifierContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "lzwfI4cg"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "LfAx1yEX"));
        this.f28213a = new Path();
        Paint paint = new Paint();
        this.f28214b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        Paint paint3 = new Paint();
        this.f28215d = paint3;
        this.f28217f = -1.0f;
        this.f28218g = -1.0f;
        this.f28219h = 200;
        this.f28220i = 100;
        this.f28222k = 1.0f;
        this.f28219h = getContext().getResources().getDimensionPixelSize(R.dimen.dp_140);
        this.f28220i = getContext().getResources().getDimensionPixelSize(R.dimen.dp_86);
        paint.setFlags(1);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setFlags(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(androidx.core.content.a.getColor(getContext(), R.color.colorMagnifierShadow));
        paint2.setShadowLayer(20.0f, 0.0f, 0.0f, -16777216);
        paint3.setFlags(1);
        paint3.setColor(androidx.core.content.a.getColor(getContext(), R.color.colorMagnifierStroke));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.dp_1));
    }
}
