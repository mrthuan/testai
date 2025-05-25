package pdf.pdfreader.viewer.editor.free.widget.text;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: ItalicTextView.kt */
/* loaded from: classes3.dex */
public final class ItalicTextView extends AppCompatTextView {

    /* renamed from: h  reason: collision with root package name */
    public boolean f28850h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItalicTextView(Context context) {
        this(context, null, 6, 0);
        g.e(context, a.p("UG8ldBZ4dA==", "N1WV0IlC"));
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (this.f28850h && getLayoutDirection() != 1) {
            return (int) Math.max(0.0f, super.getCompoundPaddingLeft() - (getTextSize() / 5.0f));
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (this.f28850h && getLayoutDirection() == 1) {
            return (int) Math.max(0.0f, super.getCompoundPaddingRight() - (getTextSize() / 5.0f));
        }
        return super.getCompoundPaddingRight();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        g.e(canvas, "canvas");
        this.f28850h = true;
        super.onDraw(canvas);
        this.f28850h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItalicTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, a.p("DG8odCd4dA==", "bFoFBIx7"));
    }

    public /* synthetic */ ItalicTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItalicTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("LG9fdBx4dA==", "dzvwPRXe"));
    }
}
