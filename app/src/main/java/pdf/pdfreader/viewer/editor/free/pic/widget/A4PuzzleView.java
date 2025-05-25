package pdf.pdfreader.viewer.editor.free.pic.widget;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public class A4PuzzleView extends PuzzleView {
    public A4PuzzleView(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        setMeasuredDimension(measuredWidth, (int) (measuredWidth * 1.4142857f));
    }

    public A4PuzzleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public A4PuzzleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
