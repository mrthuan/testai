package pdf.pdfreader.viewer.editor.free.widget.group;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.play.core.assetpacks.b1;
import ea.a;
import kotlin.jvm.internal.g;
import tf.d;

/* compiled from: ConstraintSizeFrameLayout.kt */
/* loaded from: classes3.dex */
public final class ConstraintSizeFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final int f28815a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28816b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstraintSizeFrameLayout(Context context) {
        this(context, null, 6, 0);
        g.e(context, a.p("UG8ldBZ4dA==", "P4E0Efiq"));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        boolean z11 = false;
        int i12 = this.f28815a;
        if (1 <= i12 && i12 < measuredWidth) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredWidth = i12;
        }
        int i13 = this.f28816b;
        if (1 <= i13 && i13 < measuredHeight) {
            z11 = true;
        }
        if (z11) {
            measuredHeight = i13;
        }
        if (measuredWidth != getMeasuredWidth() || measuredHeight != getMeasuredHeight()) {
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConstraintSizeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, a.p("LG9fdBx4dA==", "AUemgpo3"));
    }

    public /* synthetic */ ConstraintSizeFrameLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintSizeFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("IG8_dDF4dA==", "wYCQT2h7"));
        this.f28815a = -1;
        this.f28816b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jp.a.f19337a);
        try {
            this.f28815a = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f28816b = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            d dVar = d.f30009a;
            obtainStyledAttributes.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (obtainStyledAttributes != null) {
                    try {
                        obtainStyledAttributes.close();
                    } catch (Throwable th4) {
                        b1.n(th2, th4);
                    }
                }
                throw th3;
            }
        }
    }
}
