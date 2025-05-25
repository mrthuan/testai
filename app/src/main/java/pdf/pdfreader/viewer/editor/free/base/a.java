package pdf.pdfreader.viewer.editor.free.base;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o9.d;
import pdf.pdfreader.viewer.editor.free.utils.a0;

/* compiled from: BaseFragment.java */
/* loaded from: classes3.dex */
public abstract class a extends Fragment {
    public WeakReference<Activity> Y;
    public b Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C0330a f24021a0 = new C0330a();

    /* renamed from: b0  reason: collision with root package name */
    public i2.a f24022b0;

    /* renamed from: c0  reason: collision with root package name */
    public Locale f24023c0;

    /* compiled from: BaseFragment.java */
    /* renamed from: pdf.pdfreader.viewer.editor.free.base.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0330a {

        /* renamed from: a  reason: collision with root package name */
        public int f24024a;

        /* renamed from: b  reason: collision with root package name */
        public Object f24025b;
    }

    /* compiled from: BaseFragment.java */
    /* loaded from: classes3.dex */
    public interface b {
        void A(C0330a c0330a);
    }

    @Override // androidx.fragment.app.Fragment
    public void H(Bundle bundle) {
        this.F = true;
        s0();
        x0();
    }

    @Override // androidx.fragment.app.Fragment
    public void L(Context context) {
        super.L(context);
        if (context instanceof b) {
            this.Z = (b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View N(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        this.Y = new WeakReference<>(i());
        i2.a t02 = t0(layoutInflater, viewGroup);
        this.f24022b0 = t02;
        if (t02 != null) {
            inflate = t02.b();
        } else {
            inflate = layoutInflater.inflate(u0(), viewGroup, false);
        }
        this.f24023c0 = a0.e(i());
        a0.a(g0(), false);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void P() {
        this.F = true;
        this.f24022b0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void b0(View view, Bundle bundle) {
        v0();
    }

    public final void p0(Context context) {
        Locale locale;
        LocaleList locales;
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                locales = context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            if (this.f24023c0 != locale) {
                if (locale != null) {
                    String p10 = ea.a.p("cWE4ZTVyA2c=", "UjG94C5w");
                    d.s(p10, ea.a.p("I2FfZwxhUGV6ci9zEHRSIA==", "wGOsCfsl") + this.f24023c0.getDisplayName() + ea.a.p("Ey0g", "nuv5GAfu") + locale.getDisplayName());
                }
                a0.a(context, false);
            }
        }
    }

    public final void q0(int i10, Object obj) {
        b bVar = this.Z;
        C0330a c0330a = this.f24021a0;
        if (bVar != null) {
            c0330a.f24024a = i10;
            c0330a.f24025b = obj;
        }
        if (bVar != null && c0330a.f24024a != 256) {
            bVar.A(c0330a);
            c0330a.f24024a = 256;
            c0330a.f24025b = null;
        }
    }

    public final View r0(int i10) {
        return this.H.findViewById(i10);
    }

    public abstract void s0();

    public i2.a t0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public abstract int u0();

    public abstract void x0();

    public void v0() {
    }
}
