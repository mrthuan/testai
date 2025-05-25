package kl;

import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class i {
    public static final boolean a(int i10, ViewPager2 viewPager2) {
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter != null && i10 >= 0 && i10 < adapter.getItemCount()) {
            return true;
        }
        return false;
    }

    public static final void b(ViewStub viewStub) {
        kotlin.jvm.internal.g.e(viewStub, "<this>");
        try {
            if (viewStub.getParent() != null) {
                viewStub.inflate();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static final void c(int i10, ViewPager2 viewPager2) {
        if (a(i10, viewPager2) && !viewPager2.e()) {
            viewPager2.i(i10, false);
        }
    }
}
