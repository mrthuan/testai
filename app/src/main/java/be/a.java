package be;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.inmobi.media.C1646h;

/* compiled from: ADMediation.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5405a = new Object();

    /* compiled from: ADMediation.java */
    /* renamed from: be.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0036a {
        void a(Context context, yd.a aVar);

        void b(Context context, yd.d dVar);

        void c();

        boolean d();

        void e(Context context, View view, yd.d dVar);

        void f(Context context);

        void g(Context context);
    }

    public static String c(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() < 5) {
                return str;
            }
            return str.substring(str.length() - 5);
        }
        return "";
    }

    public abstract void a(Activity activity);

    public abstract String b();

    public abstract void d(Activity activity, yd.c cVar, InterfaceC0036a interfaceC0036a);

    public final void e(Context context) {
        boolean z10;
        if (context == null) {
            return;
        }
        de.a b10 = de.a.b();
        if (b10.f16192d == -1) {
            b10.a();
        }
        if (b10.f16192d == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            de.a b11 = de.a.b();
            String b12 = b();
            b11.getClass();
            de.a.c(context, b12, C1646h.CLICK_BEACON);
        }
    }

    public final void f(Context context, String str) {
        if (context == null) {
            return;
        }
        de.a b10 = de.a.b();
        if (b10.f16193e == -1) {
            b10.a();
        }
        boolean z10 = true;
        if (b10.f16193e != 1) {
            z10 = false;
        }
        if (z10) {
            de.a b11 = de.a.b();
            b11.getClass();
            de.a.c(context, b(), "failed:" + str);
        }
    }

    public final void g(Context context) {
        if (context == null) {
            return;
        }
        de.a b10 = de.a.b();
        if (b10.c == -1) {
            b10.a();
        }
        boolean z10 = true;
        if (b10.c != 1) {
            z10 = false;
        }
        if (z10) {
            de.a b11 = de.a.b();
            String b12 = b();
            b11.getClass();
            de.a.c(context, b12, "impression");
        }
    }

    public final void h(Context context) {
        if (context == null) {
            return;
        }
        de.a b10 = de.a.b();
        if (b10.f16191b == -1) {
            b10.a();
        }
        boolean z10 = true;
        if (b10.f16191b != 1) {
            z10 = false;
        }
        if (z10) {
            de.a b11 = de.a.b();
            String b12 = b();
            b11.getClass();
            de.a.c(context, b12, "loaded");
        }
    }

    public final void i(Context context) {
        de.a b10 = de.a.b();
        if (b10.f16190a == -1) {
            b10.a();
        }
        boolean z10 = true;
        if (b10.f16190a != 1) {
            z10 = false;
        }
        if (z10) {
            de.a b11 = de.a.b();
            String b12 = b();
            b11.getClass();
            de.a.c(context, b12, "request");
        }
    }
}
