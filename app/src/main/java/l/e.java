package l;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import l.f;
import l.s;
import q.a;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final s.a f20282a = new s.a(new s.b());

    /* renamed from: b  reason: collision with root package name */
    public static int f20283b = -100;
    public static s0.h c = null;

    /* renamed from: d  reason: collision with root package name */
    public static s0.h f20284d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f20285e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f20286f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final y.d<WeakReference<e>> f20287g = new y.d<>();

    /* renamed from: h  reason: collision with root package name */
    public static final Object f20288h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f20289i = new Object();

    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static void B(int i10) {
        if ((i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) && f20283b != i10) {
            f20283b = i10;
            synchronized (f20288h) {
                Iterator<WeakReference<e>> it = f20287g.iterator();
                while (it.hasNext()) {
                    e eVar = it.next().get();
                    if (eVar != null) {
                        eVar.d();
                    }
                }
            }
        }
    }

    public static boolean n(Context context) {
        int i10;
        if (f20285e == null) {
            try {
                int i11 = AppLocalesMetadataHolderService.f1914a;
                if (Build.VERSION.SDK_INT >= 24) {
                    i10 = AppLocalesMetadataHolderService.a.a() | 128;
                } else {
                    i10 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, AppLocalesMetadataHolderService.class), i10).metaData;
                if (bundle != null) {
                    f20285e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f20285e = Boolean.FALSE;
            }
        }
        return f20285e.booleanValue();
    }

    public static void w(e eVar) {
        synchronized (f20288h) {
            Iterator<WeakReference<e>> it = f20287g.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void C(Toolbar toolbar);

    public abstract void E(CharSequence charSequence);

    public abstract q.a F(a.InterfaceC0365a interfaceC0365a);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public abstract <T extends View> T f(int i10);

    public Context g() {
        return null;
    }

    public abstract f.b h();

    public int i() {
        return -100;
    }

    public abstract MenuInflater j();

    public abstract l.a k();

    public abstract void l();

    public abstract void m();

    public abstract void o(Configuration configuration);

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract boolean x(int i10);

    public abstract void y(int i10);

    public abstract void z(View view);

    public void D(int i10) {
    }

    public Context e(Context context) {
        return context;
    }
}
