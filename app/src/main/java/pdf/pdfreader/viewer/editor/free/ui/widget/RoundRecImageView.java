package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes3.dex */
public class RoundRecImageView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    public final int f28284d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28285e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f28286f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f28287g;

    /* renamed from: h  reason: collision with root package name */
    public final float f28288h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f28289i;

    public RoundRecImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int i10;
        int width = (canvas.getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (canvas.getHeight() - getPaddingTop()) - getPaddingBottom();
        Drawable drawable = getDrawable();
        int i11 = 0;
        if (drawable == null) {
            bitmap = null;
        } else if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicHeight(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
            bitmap = createBitmap;
        }
        if (bitmap == null) {
            return;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int min = Math.min(width2, height2);
        if (width2 > height2) {
            i10 = 0;
            i11 = (width2 - height2) / 2;
        } else {
            i10 = (height2 - width2) / 2;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, i11, i10, min, min);
        int width3 = createBitmap2.getWidth();
        int height3 = createBitmap2.getHeight();
        int i12 = this.f28285e;
        int i13 = i12 * 2;
        Matrix matrix = new Matrix();
        matrix.postScale((width - i13) / width3, (height - i13) / height3);
        Bitmap createBitmap3 = Bitmap.createBitmap(createBitmap2, 0, 0, width3, height3, matrix, true);
        int width4 = createBitmap3.getWidth();
        int height4 = createBitmap3.getHeight();
        Paint paint = this.f28287g;
        paint.setColor(this.f28284d);
        paint.setStrokeWidth(i12);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        boolean z10 = this.f28289i;
        Paint paint2 = this.f28286f;
        if (z10) {
            canvas.drawCircle(width / 2, height / 2, (Math.min(width, height) / 2) - (i12 / 2), paint);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint2.setShader(new BitmapShader(createBitmap3, tileMode, tileMode));
            canvas.translate(i12, i12);
            canvas.drawCircle(width4 / 2, height4 / 2, Math.min(width4, height4) / 2, paint2);
            return;
        }
        RectF rectF = new RectF(i12 / 2, i12 / 2, width - (i12 / 2), height - (i12 / 2));
        float f10 = this.f28288h;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap3, tileMode2, tileMode2));
        RectF rectF2 = new RectF(0.0f, 0.0f, width4, height4);
        canvas.translate(i12, i12);
        canvas.drawRoundRect(rectF2, f10, f10, paint2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    public RoundRecImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundRecImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setScaleType(ImageView.ScaleType.FIT_XY);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pdf.pdfreader.viewer.editor.free.a.f23899j, i10, 0);
        this.f28288h = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f28289i = obtainStyledAttributes.getBoolean(2, false);
        this.f28284d = obtainStyledAttributes.getColor(0, -1);
        this.f28285e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f28286f = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f28287g = paint2;
        paint2.setAntiAlias(true);
    }
}
