package pdf.pdfreader.viewer.editor.free.widget.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import ea.a;
import kotlin.jvm.internal.g;

/* compiled from: ReaderTabLayout.kt */
/* loaded from: classes3.dex */
public final class ReaderTabLayout extends TabLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReaderTabLayout(Context context) {
        this(context, null, 6, 0);
        g.e(context, a.p("UG8ldBZ4dA==", "iOy0Woqy"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReaderTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        g.e(context, a.p("UG8ldBZ4dA==", "QhGCL0Pw"));
    }

    public /* synthetic */ ReaderTabLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderTabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, a.p("LG9fdBx4dA==", "JIOfuIKX"));
        Drawable tabSelectedIndicator = getTabSelectedIndicator();
        g.d(tabSelectedIndicator, a.p("O2FTUxxsUmMuZS5JG2QBY1R0AXI=", "ZsR6hgr1"));
        setSelectedTabIndicator(new np.a(tabSelectedIndicator));
    }
}
