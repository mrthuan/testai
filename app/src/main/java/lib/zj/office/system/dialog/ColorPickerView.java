package lib.zj.office.system.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import si.a;

/* loaded from: classes3.dex */
public class ColorPickerView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f21024a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f21025b;
    public final int[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f21026d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21027e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21028f;

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21026d = FunctionEval.FunctionID.EXTERNAL_FUNC;
        int[] iArr = {-65536, -65281, -16776961, -16711681, -16711936, -256, -65536};
        this.c = iArr;
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, iArr, (float[]) null);
        Paint paint = new Paint(1);
        this.f21024a = paint;
        paint.setShader(sweepGradient);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(50.0f);
        Paint paint2 = new Paint(1);
        this.f21025b = paint2;
        paint2.setColor(a.c);
        paint2.setStrokeWidth(5.0f);
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
    }

    public int getColor() {
        return this.f21025b.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = (float) ShapeTypes.FLOW_CHART_PREPARATION;
        Paint paint = this.f21024a;
        float strokeWidth = f10 - (paint.getStrokeWidth() * 0.5f);
        canvas.translate(f10, f10);
        float f11 = -strokeWidth;
        canvas.drawOval(new RectF(f11, f11, strokeWidth, strokeWidth), paint);
        Paint paint2 = this.f21025b;
        canvas.drawCircle(0.0f, 0.0f, 32.0f, paint2);
        if (this.f21027e) {
            int color = paint2.getColor();
            paint2.setStyle(Paint.Style.STROKE);
            if (!this.f21028f) {
                paint2.setAlpha(128);
            }
            canvas.drawCircle(0.0f, 0.0f, paint2.getStrokeWidth() + 32.0f, paint2);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(color);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(280, 280);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r8 != 2) goto L25;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.system.dialog.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAlpha(int i10) {
        this.f21026d = i10;
        this.f21025b.setAlpha(i10);
        invalidate();
    }
}
