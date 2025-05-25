package pdf.pdfreader.viewer.editor.free.feature.scan.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: CameraGridView.kt */
/* loaded from: classes3.dex */
public final class CameraGridView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f25863a;

    /* renamed from: b  reason: collision with root package name */
    public Size f25864b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraGridView(Context context) {
        this(context, null);
        g.e(context, a.p("G28IdFZ4dA==", "1Qxf37mY"));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g.e(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = this.f25863a;
        paint.setColor(1728053247);
        float width = (getWidth() * 1.0f) / getHeight();
        float height = (this.f25864b.getHeight() * 1.0f) / this.f25864b.getWidth();
        if (height > width) {
            float width2 = (getWidth() * 1.0f) / height;
            float height2 = (getHeight() - width2) / 2;
            float f10 = (width2 / 3.0f) + height2;
            canvas.drawLine(0.0f, f10, getWidth(), f10, paint);
            float f11 = ((width2 * 2.0f) / 3.0f) + height2;
            canvas.drawLine(0.0f, f11, getWidth(), f11, paint);
            float f12 = width2 + height2;
            canvas.drawLine(getWidth() / 3.0f, height2, getWidth() / 3.0f, f12, paint);
            canvas.drawLine((getWidth() * 2.0f) / 3.0f, height2, (getWidth() * 2.0f) / 3.0f, f12, paint);
            return;
        }
        canvas.drawLine(0.0f, getHeight() / 3.0f, getWidth(), getHeight() / 3.0f, paint);
        canvas.drawLine(0.0f, (getHeight() * 2.0f) / 3.0f, getWidth(), (getHeight() * 2.0f) / 3.0f, paint);
        canvas.drawLine(getWidth() / 3.0f, 0.0f, getWidth() / 3.0f, getHeight(), paint);
        canvas.drawLine((getWidth() * 2.0f) / 3.0f, 0.0f, (getWidth() * 2.0f) / 3.0f, getHeight(), paint);
    }

    public final void setCameraPreviewSize(Size cameraPreviewSize) {
        g.e(cameraPreviewSize, "cameraPreviewSize");
        this.f25864b = cameraPreviewSize;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        g.e(context, a.p("UG8ldBZ4dA==", "aLVMMLvT"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("LG9fdBx4dA==", "eul4ZiUT"));
        Paint paint = new Paint();
        this.f25863a = paint;
        this.f25864b = new Size(1920, 1080);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth((int) ((context.getResources().getDisplayMetrics().density * 1.0f) + 0.5f));
    }
}
