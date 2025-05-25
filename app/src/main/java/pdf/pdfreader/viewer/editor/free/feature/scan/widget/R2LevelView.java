package pdf.pdfreader.viewer.editor.free.feature.scan.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class R2LevelView extends View {

    /* renamed from: a  reason: collision with root package name */
    public float f25865a;

    /* renamed from: b  reason: collision with root package name */
    public float f25866b;
    public Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public Bitmap f25867d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f25868e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25869f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f25870g;

    /* renamed from: h  reason: collision with root package name */
    public final PointF f25871h;

    /* renamed from: i  reason: collision with root package name */
    public PointF f25872i;

    /* renamed from: j  reason: collision with root package name */
    public int f25873j;

    public R2LevelView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f25869f;
        Paint paint = this.f25870g;
        if (z10) {
            Bitmap bitmap = this.f25868e;
            float f10 = this.f25865a;
            canvas.drawBitmap(bitmap, f10 / 2.0f, f10 / 2.0f, paint);
            return;
        }
        Bitmap bitmap2 = this.c;
        float f11 = this.f25865a;
        canvas.drawBitmap(bitmap2, f11 / 2.0f, f11 / 2.0f, paint);
        if (this.f25872i != null) {
            canvas.save();
            PointF pointF = this.f25872i;
            canvas.translate(pointF.x, pointF.y);
            canvas.drawBitmap(this.f25867d, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824) {
            size = getPaddingRight() + this.c.getWidth() + getPaddingLeft();
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingTop() + this.c.getHeight() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
        if (size > 0 && size != this.f25873j) {
            this.f25873j = size;
            float f10 = size / 2.0f;
            this.f25865a = f10;
            float f11 = f10 / 2.0f;
            this.f25866b = f11;
            this.f25871h.set(f10 - f11, f10 - f11);
            float width = ((int) this.f25865a) / this.c.getWidth();
            Matrix matrix = new Matrix();
            matrix.postScale(width, width);
            Bitmap bitmap = this.c;
            this.c = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.c.getHeight(), matrix, true);
            Bitmap bitmap2 = this.f25868e;
            this.f25868e = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.f25868e.getHeight(), matrix, true);
            float width2 = (((int) this.f25866b) * 2) / this.f25867d.getWidth();
            Matrix matrix2 = new Matrix();
            matrix2.postScale(width2, width2);
            Bitmap bitmap3 = this.f25867d;
            this.f25867d = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.f25867d.getHeight(), matrix2, true);
        }
    }

    public R2LevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public R2LevelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25865a = 0.0f;
        this.f25869f = false;
        this.f25870g = new Paint();
        PointF pointF = new PointF();
        this.f25871h = pointF;
        this.f25873j = 0;
        this.f25868e = BitmapFactory.decodeResource(context.getResources(), R.drawable.img_spiritlevel_done);
        this.c = BitmapFactory.decodeResource(context.getResources(), R.drawable.img_spiritlevel_ing_center);
        this.f25867d = BitmapFactory.decodeResource(context.getResources(), R.drawable.img_spiritlevel_ing);
        float width = this.c.getWidth() / 2.0f;
        this.f25865a = width;
        this.f25866b = width;
        float f10 = width - width;
        pointF.set(f10, f10);
    }
}
