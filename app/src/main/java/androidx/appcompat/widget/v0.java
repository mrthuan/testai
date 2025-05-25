package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class v0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f2689a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w0 f2690b;

    public v0(w0 w0Var) {
        this.f2690b = w0Var;
        this.f2689a = new androidx.appcompat.view.menu.a(w0Var.f2691a.getContext(), w0Var.f2698i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w0 w0Var = this.f2690b;
        Window.Callback callback = w0Var.f2701l;
        if (callback != null && w0Var.f2702m) {
            callback.onMenuItemSelected(0, this.f2689a);
        }
    }
}
