package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import ea.a;

/* loaded from: classes3.dex */
public class ReaderRoundProgressBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f28097a;

    /* renamed from: b  reason: collision with root package name */
    public int f28098b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f28099d;

    /* renamed from: e  reason: collision with root package name */
    public float f28100e;

    /* renamed from: f  reason: collision with root package name */
    public float f28101f;

    /* renamed from: g  reason: collision with root package name */
    public int f28102g;

    /* renamed from: h  reason: collision with root package name */
    public int f28103h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f28104i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f28105j;

    /* renamed from: k  reason: collision with root package name */
    public final int f28106k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f28107l;

    public ReaderRoundProgressBar(Context context) {
        this(context, null);
    }

    public int getCricleColor() {
        return this.f28098b;
    }

    public int getCricleProgressColor() {
        return this.c;
    }

    public synchronized int getMax() {
        return this.f28102g;
    }

    public synchronized int getProgress() {
        return this.f28103h;
    }

    public float getRoundWidth() {
        return this.f28101f;
    }

    public int getTextColor() {
        return this.f28099d;
    }

    public float getTextSize() {
        return this.f28100e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f10 = width;
        int i11 = (int) (f10 - (this.f28101f / 2.0f));
        Paint paint = this.f28097a;
        paint.setColor(this.f28098b);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f28101f);
        paint.setAntiAlias(true);
        canvas.drawCircle(f10, f10, i11, paint);
        paint.setStrokeWidth(0.0f);
        paint.setColor(this.f28099d);
        paint.setTextSize(this.f28100e);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setStyle(Paint.Style.FILL);
        int i12 = (int) ((this.f28103h / this.f28102g) * 100.0f);
        float measureText = paint.measureText(i12 + "");
        paint.setTextSize(this.f28100e * 0.6f);
        float measureText2 = paint.measureText(a.p("JQ==", "Kn3nkiqY"));
        paint.setTextSize(this.f28100e);
        boolean z10 = this.f28105j;
        int i13 = this.f28106k;
        if (z10 && ((i12 != 0 || this.f28104i) && i13 == 0)) {
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f11 = fontMetrics.bottom;
            float f12 = f10 - ((measureText2 + measureText) / 2.0f);
            float f13 = (((f11 - fontMetrics.top) / 2.0f) - f11) + f10;
            canvas.drawText(i12 + "", f12, f13, paint);
            paint.setTextSize(this.f28100e * 0.6f);
            canvas.drawText(a.p("JQ==", "65xLVMp0"), f12 + measureText + 3.0f, f13, paint);
        }
        paint.setStrokeWidth(this.f28101f);
        paint.setColor(this.c);
        paint.setStrokeCap(Paint.Cap.ROUND);
        float f14 = width - i11;
        float f15 = width + i11;
        RectF rectF = new RectF(f14, f14, f15, f15);
        if (i13 != 0) {
            if (i13 == 1) {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                if (this.f28103h != 0) {
                    canvas.drawArc(rectF, -90.0f, (i10 * 360) / this.f28102g, true, paint);
                    return;
                }
                return;
            }
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, -90.0f, (this.f28103h * 360) / this.f28102g, false, paint);
        if (this.f28107l && this.f28103h > 0) {
            canvas.save();
            canvas.rotate((this.f28103h * 360) / this.f28102g, f10, f10);
            paint.setStrokeWidth(0.0f);
            paint.setColor(-1);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            float f16 = this.f28101f;
            canvas.drawCircle(f10, f14, (f16 / 2.0f) - (f16 / 5.0f), paint);
            canvas.restore();
        }
    }

    public void setCricleColor(int i10) {
        this.f28098b = i10;
    }

    public void setCricleProgressColor(int i10) {
        this.c = i10;
    }

    public synchronized void setMax(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f28102g = i10;
    }

    public synchronized void setProgress(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f28102g;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 <= i11) {
            this.f28103h = i10;
            postInvalidate();
        }
    }

    public void setRoundWidth(float f10) {
        this.f28101f = f10;
    }

    public synchronized void setShowProgressTextWhenZero(boolean z10) {
        this.f28104i = z10;
    }

    public void setShowWhiteDot(boolean z10) {
        this.f28107l = z10;
    }

    public void setTextColor(int i10) {
        this.f28099d = i10;
    }

    public void setTextSize(float f10) {
        this.f28100e = f10;
    }

    public ReaderRoundProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReaderRoundProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28104i = false;
        this.f28107l = false;
        this.f28097a = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23898i);
        this.f28098b = obtainStyledAttributes.getColor(1, -65536);
        this.c = obtainStyledAttributes.getColor(2, -16711936);
        this.f28099d = obtainStyledAttributes.getColor(6, -16711936);
        this.f28100e = obtainStyledAttributes.getDimension(8, 15.0f);
        this.f28101f = obtainStyledAttributes.getDimension(4, 5.0f);
        this.f28102g = obtainStyledAttributes.getInteger(0, 100);
        this.f28105j = obtainStyledAttributes.getBoolean(7, true);
        this.f28107l = obtainStyledAttributes.getBoolean(3, false);
        this.f28106k = obtainStyledAttributes.getInt(5, 0);
        obtainStyledAttributes.recycle();
    }
}
