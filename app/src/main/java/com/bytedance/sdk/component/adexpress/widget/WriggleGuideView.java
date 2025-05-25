package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class WriggleGuideView extends View {
    private Bitmap CJ;
    private int Qhi;
    private boolean ROR;
    private boolean Sf;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private Bitmap f8326ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Paint f8327fl;

    /* renamed from: hm  reason: collision with root package name */
    private Qhi f8328hm;

    /* loaded from: classes.dex */
    public interface Qhi {
    }

    private Bitmap Qhi(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), MQ.CJ(getContext(), "tt_wriggle_union"));
        if (decodeResource != null) {
            canvas.drawBitmap(decodeResource, (Rect) null, new RectF(0.0f, 0.0f, i10, i11), this.f8327fl);
        }
        return createBitmap;
    }

    private Bitmap ac(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawCircle(i10 / 2, 10.0f, this.Tgh, paint);
        return createBitmap;
    }

    private Bitmap cJ(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), MQ.CJ(getContext(), "tt_wriggle_union_white"));
        if (decodeResource != null) {
            canvas.drawBitmap(decodeResource, (Rect) null, new RectF(0.0f, 0.0f, i10, i11), paint);
        }
        return createBitmap;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f8328hm != null) {
            this.f8328hm = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.ROR) {
            this.Qhi = getWidth();
            int height = getHeight();
            this.cJ = height;
            this.f8326ac = Qhi(this.Qhi, height);
            this.CJ = cJ(this.Qhi, this.cJ);
            this.ROR = false;
        }
        Bitmap bitmap = this.f8326ac;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f8327fl);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        Bitmap bitmap2 = this.CJ;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.f8327fl);
        }
        this.f8327fl.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(ac(this.Qhi, this.cJ), 0.0f, 0.0f, this.f8327fl);
        this.f8327fl.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        if (this.Sf) {
            this.Tgh += 5;
            invalidate();
            if (this.Tgh >= this.Qhi) {
                this.Sf = false;
            }
        }
    }
}
