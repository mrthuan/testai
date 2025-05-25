package lib.zj.office.officereader.beans;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes3.dex */
public class TitleBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public String f20902a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20903b;
    public final Paint c;

    /* renamed from: d  reason: collision with root package name */
    public final float f20904d;

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f20905e;

    public TitleBar(Context context) {
        super(context);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int i10 = options.outHeight;
        this.f20903b = i10;
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextSize(24.0f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f10 = fontMetrics.ascent;
        this.f20904d = (((i10 - fontMetrics.descent) + f10) / 2.0f) - f10;
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f20905e = progressBar;
        progressBar.setIndeterminate(true);
        addView(progressBar);
        progressBar.setVisibility(8);
    }

    public int getTitleHeight() {
        return this.f20903b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        String str = this.f20902a;
        if (str != null) {
            canvas.drawText(str, 5.0f, this.f20904d, this.c);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        ProgressBar progressBar = this.f20905e;
        if (progressBar != null) {
            int measuredWidth = progressBar.getMeasuredWidth();
            int measuredHeight = progressBar.getMeasuredHeight();
            progressBar.layout((i14 - measuredWidth) - 5, (i15 - measuredHeight) / 2, i14 - 5, (i15 + measuredHeight) / 2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ProgressBar progressBar = this.f20905e;
        if (progressBar != null) {
            int min = (Math.min(getWidth(), getHeight()) / 2) | SlideAtom.USES_MASTER_SLIDE_ID;
            progressBar.measure(min, min);
        }
    }

    public void setTitle(String str) {
        this.f20902a = str;
        postInvalidate();
    }
}
