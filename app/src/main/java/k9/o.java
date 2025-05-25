package k9;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: EndIconDelegate.java */
/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f19682a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.material.textfield.a f19683b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f19684d;

    public o(com.google.android.material.textfield.a aVar) {
        this.f19682a = aVar.f13070a;
        this.f19683b = aVar;
        this.c = aVar.getContext();
        this.f19684d = aVar.f13075g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public y0.d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof n;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f19683b.e(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(y0.f fVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }
}
