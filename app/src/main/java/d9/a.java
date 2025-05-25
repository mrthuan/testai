package d9;

import android.view.View;
import com.google.android.material.search.SearchBar;

/* compiled from: SearchBar.java */
/* loaded from: classes2.dex */
public final class a implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchBar f16152a;

    public a(SearchBar searchBar) {
        this.f16152a = searchBar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        SearchBar searchBar = this.f16152a;
        y0.c.a(searchBar.f12800k0, searchBar.f12801l0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        SearchBar searchBar = this.f16152a;
        y0.c.b(searchBar.f12800k0, searchBar.f12801l0);
    }
}
