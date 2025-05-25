package pdf.pdfreader.viewer.editor.free.widget.text;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: ItalicSSTextView.kt */
/* loaded from: classes3.dex */
public final class ItalicSSTextView extends ShadowLayerWithShaderTextView {

    /* renamed from: n  reason: collision with root package name */
    public boolean f28849n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItalicSSTextView(Context context) {
        this(context, null, 6, 0);
        g.e(context, a.p("E282dD14dA==", "vPpXXNHH"));
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (this.f28849n && getLayoutDirection() != 1) {
            return (int) Math.max(0.0f, super.getCompoundPaddingLeft() - (getTextSize() / 5.0f));
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (this.f28849n && getLayoutDirection() == 1) {
            return (int) Math.max(0.0f, super.getCompoundPaddingLeft() - (getTextSize() / 5.0f));
        }
        return super.getCompoundPaddingRight();
    }

    @Override // pdf.pdfreader.viewer.editor.free.widget.text.ShadowLayerWithShaderTextView, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        g.e(canvas, "canvas");
        this.f28849n = true;
        super.onDraw(canvas);
        this.f28849n = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItalicSSTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, a.p("MW8fdDR4dA==", "KlRqQCOc"));
    }

    public /* synthetic */ ItalicSSTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItalicSSTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("UG8ldBZ4dA==", "JSIsk1sw"));
    }
}
