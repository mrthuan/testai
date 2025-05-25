package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.NinePatchDrawable;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class CornerIV extends PAGImageView {
    private int Qhi;
    private int cJ;

    public CornerIV(Context context) {
        super(context);
        this.Qhi = 0;
        this.cJ = 0;
    }

    private boolean Qhi() {
        return getDrawable() == null || getWidth() == 0 || getHeight() == 0;
    }

    private boolean cJ() {
        if (getDrawable().getClass() != NinePatchDrawable.class) {
            if (!(getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable) getDrawable()).getBitmap() != null) {
                return false;
            }
            return true;
        }
        return true;
    }

    private Paint getPaint() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    private int getRadius() {
        if (this.Qhi == 0) {
            this.Qhi = getWidth();
        }
        if (this.cJ == 0) {
            this.cJ = getHeight();
        }
        int i10 = this.Qhi;
        int i11 = this.cJ;
        if (i10 >= i11) {
            i10 = i11;
        }
        return i10 / 2;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int radius;
        Bitmap bitmap2;
        if (Qhi()) {
            return;
        }
        measure(0, 0);
        if (cJ()) {
            return;
        }
        try {
            bitmap = ((BitmapDrawable) getDrawable()).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            super.onDraw(canvas);
            return;
        }
        try {
            bitmap2 = Qhi(bitmap, getRadius());
        } catch (Throwable unused2) {
            bitmap2 = null;
        }
        if (bitmap2 == null) {
            super.onDraw(canvas);
        } else {
            canvas.drawBitmap(bitmap2, (this.Qhi / 2) - radius, (this.cJ / 2) - radius, (Paint) null);
        }
    }

    private Bitmap Qhi(Bitmap bitmap, int i10) {
        Bitmap createBitmap;
        int i11 = i10 * 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height > width) {
            createBitmap = Bitmap.createBitmap(bitmap, 0, (height - width) / 2, width, width);
        } else {
            createBitmap = height < width ? Bitmap.createBitmap(bitmap, (width - height) / 2, 0, height, height) : null;
        }
        if (createBitmap != null) {
            bitmap = createBitmap;
        }
        if (bitmap.getWidth() != i11 || bitmap.getHeight() != i11) {
            bitmap = Bitmap.createScaledBitmap(bitmap, i11, i11, true);
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = getPaint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap2;
    }
}
