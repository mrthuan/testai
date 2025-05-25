package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f4812a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f4813b;
    public final /* synthetic */ FragmentStateAdapter c;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.c = fragmentStateAdapter;
        this.f4812a = frameLayout;
        this.f4813b = fVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        FrameLayout frameLayout = this.f4812a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.c.l(this.f4813b);
        }
    }
}
