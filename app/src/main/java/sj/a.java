package sj;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

/* compiled from: SafeToastContext.java */
/* loaded from: classes3.dex */
public final class a extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f29818a = 0;

    /* compiled from: SafeToastContext.java */
    /* renamed from: sj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0376a extends ContextWrapper {
        public C0376a(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            if ("window".equals(str)) {
                return new b((WindowManager) getBaseContext().getSystemService(str));
            }
            return super.getSystemService(str);
        }
    }

    /* compiled from: SafeToastContext.java */
    /* loaded from: classes3.dex */
    public final class b implements WindowManager {

        /* renamed from: a  reason: collision with root package name */
        public final WindowManager f29820a;

        public b(WindowManager windowManager) {
            this.f29820a = windowManager;
        }

        @Override // android.view.ViewManager
        public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
            try {
                this.f29820a.addView(view, layoutParams);
            } catch (WindowManager.BadTokenException e10) {
                e10.getMessage();
                int i10 = a.f29818a;
                a.this.getClass();
            } catch (Throwable unused) {
            }
        }

        @Override // android.view.WindowManager
        public final Display getDefaultDisplay() {
            return this.f29820a.getDefaultDisplay();
        }

        @Override // android.view.ViewManager
        public final void removeView(View view) {
            this.f29820a.removeView(view);
        }

        @Override // android.view.WindowManager
        public final void removeViewImmediate(View view) {
            this.f29820a.removeViewImmediate(view);
        }

        @Override // android.view.ViewManager
        public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
            this.f29820a.updateViewLayout(view, layoutParams);
        }
    }

    public a(Context context, Toast toast) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return new C0376a(getBaseContext().getApplicationContext());
    }
}
