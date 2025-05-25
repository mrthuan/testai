package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import l.f;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public boolean f() {
        return false;
    }

    public abstract void g();

    public abstract boolean i(int i10, KeyEvent keyEvent);

    public boolean j(KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract void l(ColorDrawable colorDrawable);

    public abstract void m(boolean z10);

    public abstract void n(boolean z10);

    public abstract void o(boolean z10);

    public abstract void p(CharSequence charSequence);

    public abstract void q();

    public q.a r(f.e eVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0274a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f20280a;

        public C0274a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20280a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.f19430b);
            this.f20280a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0274a() {
            super(-2, -2);
            this.f20280a = 8388627;
        }

        public C0274a(C0274a c0274a) {
            super((ViewGroup.MarginLayoutParams) c0274a);
            this.f20280a = 0;
            this.f20280a = c0274a.f20280a;
        }

        public C0274a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20280a = 0;
        }
    }

    public void h() {
    }
}
