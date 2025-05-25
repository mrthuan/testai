package pdf.pdfreader.viewer.editor.free.edit.image.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import gm.b;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class OverlayView extends View {
    public final int A;
    public final int B;
    public b C;
    public boolean D;

    /* renamed from: a  reason: collision with root package name */
    public final RectF f24287a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f24288b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f24289d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f24290e;

    /* renamed from: f  reason: collision with root package name */
    public int f24291f;

    /* renamed from: g  reason: collision with root package name */
    public int f24292g;

    /* renamed from: h  reason: collision with root package name */
    public float f24293h;

    /* renamed from: i  reason: collision with root package name */
    public float[] f24294i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f24295j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f24296k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f24297l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f24298m;

    /* renamed from: n  reason: collision with root package name */
    public int f24299n;

    /* renamed from: o  reason: collision with root package name */
    public final Path f24300o;

    /* renamed from: p  reason: collision with root package name */
    public final Paint f24301p;

    /* renamed from: q  reason: collision with root package name */
    public final Paint f24302q;

    /* renamed from: r  reason: collision with root package name */
    public final Paint f24303r;

    /* renamed from: s  reason: collision with root package name */
    public final Paint f24304s;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f24305t;

    /* renamed from: u  reason: collision with root package name */
    public int f24306u;

    /* renamed from: v  reason: collision with root package name */
    public float f24307v;

    /* renamed from: w  reason: collision with root package name */
    public float f24308w;

    /* renamed from: x  reason: collision with root package name */
    public int f24309x;

    /* renamed from: y  reason: collision with root package name */
    public final int f24310y;

    /* renamed from: z  reason: collision with root package name */
    public final int f24311z;

    public OverlayView(Context context) {
        this(context, null);
    }

    public final void a() {
        RectF rectF = this.f24287a;
        this.f24290e = aj.b.r(rectF);
        rectF.centerX();
        rectF.centerY();
        this.f24294i = null;
        Path path = this.f24300o;
        path.reset();
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public RectF getCropViewRect() {
        return this.f24287a;
    }

    public int getFreestyleCropMode() {
        return this.f24306u;
    }

    public b getOverlayViewChangeListener() {
        return this.C;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        boolean z10 = this.f24298m;
        RectF rectF = this.f24287a;
        if (z10) {
            canvas.clipPath(this.f24300o, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f24299n);
        canvas.restore();
        if (this.f24298m) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.f24301p);
        }
        if (this.f24297l) {
            if (this.f24294i == null && !rectF.isEmpty()) {
                this.f24294i = new float[(this.f24292g * 4) + (this.f24291f * 4)];
                int i10 = 0;
                for (int i11 = 0; i11 < this.f24291f; i11++) {
                    float[] fArr = this.f24294i;
                    int i12 = i10 + 1;
                    fArr[i10] = rectF.left;
                    int i13 = i12 + 1;
                    float f10 = i11 + 1.0f;
                    fArr[i12] = ((f10 / (this.f24291f + 1)) * rectF.height()) + rectF.top;
                    float[] fArr2 = this.f24294i;
                    int i14 = i13 + 1;
                    fArr2[i13] = rectF.right;
                    i10 = i14 + 1;
                    fArr2[i14] = ((f10 / (this.f24291f + 1)) * rectF.height()) + rectF.top;
                }
                int i15 = 0;
                while (i15 < this.f24292g) {
                    int i16 = i10 + 1;
                    float f11 = i15 + 1.0f;
                    this.f24294i[i10] = ((f11 / (this.f24292g + 1)) * rectF.width()) + rectF.left;
                    float[] fArr3 = this.f24294i;
                    int i17 = i16 + 1;
                    fArr3[i16] = rectF.top;
                    int i18 = i17 + 1;
                    fArr3[i17] = ((f11 / (this.f24292g + 1)) * rectF.width()) + rectF.left;
                    this.f24294i[i18] = rectF.bottom;
                    i15++;
                    i10 = i18 + 1;
                }
            }
            float[] fArr4 = this.f24294i;
            if (fArr4 != null) {
                canvas.drawLines(fArr4, this.f24302q);
            }
        }
        int i19 = this.f24306u;
        Paint paint = this.f24304s;
        if (i19 != 0) {
            float[] fArr5 = new float[16];
            this.f24295j = fArr5;
            fArr5[0] = rectF.left;
            fArr5[1] = (rectF.height() * 0.33333334f) + rectF.top;
            float[] fArr6 = this.f24295j;
            fArr6[2] = rectF.left;
            fArr6[3] = (rectF.height() * 0.6666667f) + rectF.top;
            float[] fArr7 = this.f24295j;
            fArr7[4] = rectF.right;
            fArr7[5] = (rectF.height() * 0.33333334f) + rectF.top;
            float[] fArr8 = this.f24295j;
            fArr8[6] = rectF.right;
            fArr8[7] = (rectF.height() * 0.6666667f) + rectF.top;
            this.f24295j[8] = (rectF.width() * 0.33333334f) + rectF.left;
            float[] fArr9 = this.f24295j;
            fArr9[9] = rectF.top;
            fArr9[10] = (rectF.width() * 0.6666667f) + rectF.left;
            float[] fArr10 = this.f24295j;
            fArr10[11] = rectF.top;
            fArr10[12] = (rectF.width() * 0.33333334f) + rectF.left;
            float[] fArr11 = this.f24295j;
            fArr11[13] = rectF.bottom;
            fArr11[14] = (rectF.width() * 0.6666667f) + rectF.left;
            float[] fArr12 = this.f24295j;
            fArr12[15] = rectF.bottom;
            canvas.drawLines(fArr12, paint);
        }
        if (this.f24296k) {
            canvas.drawRect(rectF, this.f24303r);
        }
        if (this.f24306u != 0) {
            canvas.save();
            RectF rectF2 = this.f24288b;
            rectF2.set(rectF);
            int i20 = this.B;
            float f12 = i20;
            float f13 = -i20;
            rectF2.inset(f12, f13);
            canvas.clipRect(rectF2, Region.Op.DIFFERENCE);
            rectF2.set(rectF);
            rectF2.inset(f13, f12);
            canvas.clipRect(rectF2, Region.Op.DIFFERENCE);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.c = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f24289d = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.D) {
                this.D = false;
                setTargetAspectRatio(this.f24293h);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
        if (r2.contains(r6, r5) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292 A[ADDED_TO_REGION] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.edit.image.myview.OverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.f24298m = z10;
    }

    public void setCropFrameColor(int i10) {
        this.f24303r.setColor(i10);
    }

    public void setCropFrameStrokeWidth(int i10) {
        this.f24303r.setStrokeWidth(i10);
    }

    public void setCropGridColor(int i10) {
        this.f24302q.setColor(i10);
    }

    public void setCropGridColumnCount(int i10) {
        this.f24292g = i10;
        this.f24294i = null;
    }

    public void setCropGridCornerColor(int i10) {
        this.f24304s.setColor(i10);
        this.f24305t.setColor(i10);
    }

    public void setCropGridRowCount(int i10) {
        this.f24291f = i10;
        this.f24294i = null;
    }

    public void setCropGridStrokeWidth(int i10) {
        this.f24302q.setStrokeWidth(i10);
    }

    public void setDimmedColor(int i10) {
        this.f24299n = i10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.f24306u = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        this.f24306u = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(b bVar) {
        this.C = bVar;
    }

    public void setShowCropFrame(boolean z10) {
        this.f24296k = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.f24297l = z10;
    }

    public void setTargetAspectRatio(float f10) {
        this.f24293h = f10;
        int i10 = this.c;
        if (i10 > 0) {
            int i11 = (int) (i10 / f10);
            int i12 = this.f24289d;
            RectF rectF = this.f24287a;
            if (i11 > i12) {
                int i13 = (int) (i12 * f10);
                int i14 = (i10 - i13) / 2;
                rectF.set(getPaddingLeft() + i14, getPaddingTop(), getPaddingLeft() + i13 + i14, getPaddingTop() + this.f24289d);
            } else {
                int i15 = (i12 - i11) / 2;
                rectF.set(getPaddingLeft(), getPaddingTop() + i15, getPaddingLeft() + this.c, getPaddingTop() + i11 + i15);
            }
            b bVar = this.C;
            if (bVar != null) {
                ((fm.b) bVar).f17309a.f24339a.setCropRect(rectF);
            }
            a();
            postInvalidate();
            return;
        }
        this.D = true;
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24287a = new RectF();
        this.f24288b = new RectF();
        this.f24294i = null;
        this.f24295j = null;
        this.f24300o = new Path();
        this.f24301p = new Paint(1);
        this.f24302q = new Paint(1);
        this.f24303r = new Paint(1);
        this.f24304s = new Paint(1);
        this.f24305t = new Paint(1);
        this.f24306u = 0;
        this.f24307v = -1.0f;
        this.f24308w = -1.0f;
        this.f24309x = -1;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.f24310y = dimensionPixelSize;
        this.f24311z = Math.max((int) ShapeTypes.FLOW_CHART_EXTRACT, dimensionPixelSize);
        this.A = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.B = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
    }
}
