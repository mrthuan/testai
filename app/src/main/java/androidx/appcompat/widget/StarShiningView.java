package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class StarShiningView extends View {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f2415a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f2416b;
    public Paint c;

    public StarShiningView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        this.f2415a = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.lib_rate_star);
        this.f2416b = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.lib_rate_shining_right);
        this.c = new Paint();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            float width = (this.f2415a.getWidth() / 2.0f) + (getWidth() / 2.0f);
            float height = (getHeight() / 2.0f) - (this.f2415a.getHeight() / 2.0f);
            if (this.f2416b.getWidth() + width > getWidth()) {
                width = getWidth() - this.f2416b.getWidth();
            }
            if (height - this.f2416b.getHeight() < 0.0f) {
                height = this.f2416b.getHeight();
            }
            if (width - (getWidth() / 2.0f) > (getHeight() / 2.0f) - height) {
                width = ((getHeight() / 2.0f) + (getWidth() / 2.0f)) - height;
            } else {
                height = (getHeight() / 2.0f) - (width - (getWidth() / 2.0f));
            }
            canvas.drawBitmap(this.f2416b, width, height - bitmap.getHeight(), this.c);
        }
    }

    public StarShiningView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public StarShiningView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    public void setRtl(boolean z10) {
    }
}
