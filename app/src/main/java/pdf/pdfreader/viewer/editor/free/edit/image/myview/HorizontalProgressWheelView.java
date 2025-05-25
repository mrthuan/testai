package pdf.pdfreader.viewer.editor.free.edit.image.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class HorizontalProgressWheelView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f24278a;

    /* renamed from: b  reason: collision with root package name */
    public float f24279b;
    public Paint c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f24280d;

    /* renamed from: e  reason: collision with root package name */
    public int f24281e;

    /* renamed from: f  reason: collision with root package name */
    public int f24282f;

    /* renamed from: g  reason: collision with root package name */
    public int f24283g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f24284h;

    /* renamed from: i  reason: collision with root package name */
    public float f24285i;

    /* renamed from: j  reason: collision with root package name */
    public int f24286j;

    /* loaded from: classes3.dex */
    public interface a {
    }

    public HorizontalProgressWheelView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        super.onDraw(canvas);
        Rect rect = this.f24278a;
        canvas.getClipBounds(rect);
        int width = rect.width() / (this.f24281e + this.f24283g);
        float f10 = this.f24285i % (i11 + i10);
        int width2 = (rect.width() % (this.f24281e + this.f24283g)) / 2;
        for (int i12 = 0; i12 < width; i12++) {
            int i13 = width / 4;
            if (i12 < i13) {
                this.c.setAlpha((int) ((i12 / i13) * 255.0f));
            } else if (i12 > (width * 3) / 4) {
                this.c.setAlpha((int) (((width - i12) / i13) * 255.0f));
            } else {
                this.c.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
            }
            float f11 = -f10;
            float f12 = width2;
            canvas.drawLine(rect.left + f11 + ((this.f24281e + this.f24283g) * i12) + f12, rect.centerY() - (this.f24282f / 8.0f), f12 + f11 + rect.left + ((this.f24281e + this.f24283g) * i12), (this.f24282f / 2.0f) + rect.centerY(), this.c);
        }
        float f13 = ((this.f24283g + this.f24281e) * (width / 2)) + rect.left + width2;
        canvas.drawLine(f13, rect.centerY() - (this.f24282f / 2.0f), f13, (this.f24282f / 2.0f) + rect.centerY(), this.f24280d);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action == 2) {
                float x4 = motionEvent.getX() - this.f24279b;
                if (x4 != 0.0f) {
                    if (!this.f24284h) {
                        this.f24284h = true;
                    }
                    this.f24285i -= x4;
                    postInvalidate();
                    this.f24279b = motionEvent.getX();
                }
            }
        } else {
            this.f24279b = motionEvent.getX();
        }
        return true;
    }

    public void setMiddleLineColor(int i10) {
        this.f24286j = i10;
        this.f24280d.setColor(i10);
        invalidate();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24278a = new Rect();
        this.f24286j = androidx.core.content.a.getColor(getContext(), R.color.ucrop_color_blaze_orange);
        this.f24281e = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);
        this.f24282f = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);
        this.f24283g = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(this.f24281e);
        this.c.setColor(getResources().getColor(R.color.ucrop_color_ebony_clay));
        Paint paint2 = new Paint(this.c);
        this.f24280d = paint2;
        paint2.setColor(this.f24286j);
        this.f24280d.setStrokeCap(Paint.Cap.ROUND);
        this.f24280d.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }

    public void setScrollingListener(a aVar) {
    }
}
