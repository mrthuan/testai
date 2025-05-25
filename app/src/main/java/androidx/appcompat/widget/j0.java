package androidx.appcompat.widget;

import android.view.View;

/* compiled from: ScrollingTabContainerView.java */
/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2611a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f2612b;

    public j0(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.f2612b = scrollingTabContainerView;
        this.f2611a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f2611a;
        int left = view.getLeft();
        ScrollingTabContainerView scrollingTabContainerView = this.f2612b;
        scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view.getWidth()) / 2), 0);
        scrollingTabContainerView.f2351a = null;
    }
}
