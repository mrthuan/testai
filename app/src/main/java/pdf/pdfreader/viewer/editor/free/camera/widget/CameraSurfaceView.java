package pdf.pdfreader.viewer.editor.free.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import kotlin.jvm.internal.g;

/* compiled from: CameraSurfaceView.kt */
/* loaded from: classes3.dex */
public final class CameraSurfaceView extends SurfaceView {

    /* renamed from: a  reason: collision with root package name */
    public sl.a f24109a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraSurfaceView(Context context) {
        this(context, null);
        g.e(context, ea.a.p("LG9fdBx4dA==", "PrrXJLuf"));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i10, int i11) {
        sl.a aVar;
        super.onMeasure(i10, i11);
        sl.a aVar2 = this.f24109a;
        if (aVar2 != null) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            float f10 = size;
            float f11 = size2;
            float a10 = 1.0f / aVar2.a();
            if ((f10 * 1.0f) / f11 > a10) {
                aVar = new sl.a((int) (f11 * a10), size2);
            } else {
                aVar = new sl.a(size, (int) (f10 / a10));
            }
            setMeasuredDimension(aVar.f29823a, aVar.f29824b);
        }
    }

    public final void setCameraPreviewSize(sl.a useSize) {
        g.e(useSize, "useSize");
        getHolder().setFixedSize(useSize.f29823a, useSize.f29824b);
        this.f24109a = useSize;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        g.e(context, ea.a.p("LG9fdBx4dA==", "vfkfXJjr"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraSurfaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("Cm8MdDF4dA==", "4KibT9vw"));
    }
}
