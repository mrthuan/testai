package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements androidx.lifecycle.n {

    /* renamed from: b  reason: collision with root package name */
    public static int f1784b;
    public static Field c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f1785d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f1786e;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f1787a;

    public ImmLeaksCleaner(Activity activity) {
        this.f1787a = activity;
    }

    @Override // androidx.lifecycle.n
    public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f1784b == 0) {
            try {
                f1784b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f1785d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f1786e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                c = declaredField3;
                declaredField3.setAccessible(true);
                f1784b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1784b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1787a.getSystemService("input_method");
            try {
                Object obj = c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f1785d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1786e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
