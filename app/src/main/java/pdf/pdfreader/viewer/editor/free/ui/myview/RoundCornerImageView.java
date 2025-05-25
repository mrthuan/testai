package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.a;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* loaded from: classes3.dex */
public class RoundCornerImageView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public int f28112d;

    /* renamed from: e  reason: collision with root package name */
    public final Path f28113e;

    /* renamed from: f  reason: collision with root package name */
    public float f28114f;

    /* renamed from: g  reason: collision with root package name */
    public RectF f28115g;

    public RoundCornerImageView(Context context) {
        this(context, null);
        this.f28113e = new Path();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Path path = this.f28113e;
        path.reset();
        int width = getWidth();
        int height = getHeight();
        if (this.f28115g == null) {
            this.f28115g = new RectF(0.0f, 0.0f, width, height);
        }
        RectF rectF = this.f28115g;
        float f10 = this.f28114f;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f28115g = new RectF(0.0f, 0.0f, i10, i11);
    }

    public void setCornerSize(int i10) {
        this.f28112d = i10;
        this.f28114f = t0.C(getContext(), this.f28112d);
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f28113e = new Path();
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f23897h, i10, 0);
        this.f28112d = obtainStyledAttributes.getInt(0, 5);
        this.f28113e = new Path();
        this.f28114f = t0.C(context, this.f28112d);
        obtainStyledAttributes.recycle();
    }
}
