package pdf.pdfreader.viewer.editor.free.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import jp.a;

/* loaded from: classes3.dex */
public class CustomRoundImageView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public final float f28807d;

    /* renamed from: e  reason: collision with root package name */
    public final float f28808e;

    /* renamed from: f  reason: collision with root package name */
    public final float f28809f;

    /* renamed from: g  reason: collision with root package name */
    public final float f28810g;

    /* renamed from: h  reason: collision with root package name */
    public final float f28811h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f28812i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f28813j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f28814k;

    public CustomRoundImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.f28813j;
        path.reset();
        float f10 = this.f28807d;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        RectF rectF = this.f28814k;
        if (i10 != 0) {
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else {
            float f11 = this.f28808e;
            float f12 = this.f28809f;
            float f13 = this.f28811h;
            float f14 = this.f28810g;
            path.addRoundRect(rectF, new float[]{f11, f11, f12, f12, f13, f13, f14, f14}, Path.Direction.CW);
        }
        canvas.clipPath(path);
        super.onDraw(canvas);
        Paint paint = this.f28812i;
        if (paint != null) {
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f28814k.set(0.0f, 0.0f, i10, i11);
    }

    public CustomRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomRoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f28813j = new Path();
        this.f28814k = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.f19338b, 0, 0);
        this.f28807d = obtainStyledAttributes.getDimension(4, 0.0f);
        this.f28808e = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f28809f = obtainStyledAttributes.getDimension(6, 0.0f);
        this.f28810g = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f28811h = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        int color = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        if (dimension > 0.0f) {
            Paint paint = new Paint(1);
            this.f28812i = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimension);
            paint.setColor(color);
        }
    }
}
