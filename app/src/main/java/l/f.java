package l;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import l.v;
import n0.f;
import pdf.pdfreader.viewer.editor.free.R;
import q.a;
import q.e;
import x0.f0;
import x0.g;
import x0.n0;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class f extends l.e implements h.a, LayoutInflater.Factory2 {

    /* renamed from: i0  reason: collision with root package name */
    public static final y.i<String, Integer> f20290i0 = new y.i<>();

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f20291j0 = {16842836};

    /* renamed from: k0  reason: collision with root package name */
    public static final boolean f20292k0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: l0  reason: collision with root package name */
    public static final boolean f20293l0 = true;
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public o[] M;
    public o N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public final int T;
    public int U;
    public int V;
    public boolean W;
    public m X;
    public k Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f20294a0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f20296c0;

    /* renamed from: d0  reason: collision with root package name */
    public Rect f20297d0;

    /* renamed from: e0  reason: collision with root package name */
    public Rect f20298e0;

    /* renamed from: f0  reason: collision with root package name */
    public q f20299f0;

    /* renamed from: g0  reason: collision with root package name */
    public OnBackInvokedDispatcher f20300g0;

    /* renamed from: h0  reason: collision with root package name */
    public OnBackInvokedCallback f20301h0;

    /* renamed from: j  reason: collision with root package name */
    public final Object f20302j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f20303k;

    /* renamed from: l  reason: collision with root package name */
    public Window f20304l;

    /* renamed from: m  reason: collision with root package name */
    public j f20305m;

    /* renamed from: n  reason: collision with root package name */
    public final l.c f20306n;

    /* renamed from: o  reason: collision with root package name */
    public l.a f20307o;

    /* renamed from: p  reason: collision with root package name */
    public q.f f20308p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f20309q;

    /* renamed from: r  reason: collision with root package name */
    public androidx.appcompat.widget.w f20310r;

    /* renamed from: s  reason: collision with root package name */
    public d f20311s;

    /* renamed from: t  reason: collision with root package name */
    public p f20312t;

    /* renamed from: u  reason: collision with root package name */
    public q.a f20313u;

    /* renamed from: v  reason: collision with root package name */
    public ActionBarContextView f20314v;

    /* renamed from: w  reason: collision with root package name */
    public PopupWindow f20315w;

    /* renamed from: x  reason: collision with root package name */
    public l.i f20316x;

    /* renamed from: y  reason: collision with root package name */
    public n0 f20317y = null;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f20318z = true;

    /* renamed from: b0  reason: collision with root package name */
    public final a f20295b0 = new a();

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            if ((fVar.f20294a0 & 1) != 0) {
                fVar.O(0);
            }
            if ((fVar.f20294a0 & 4096) != 0) {
                fVar.O(108);
            }
            fVar.Z = false;
            fVar.f20294a0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class b implements l.b {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class d implements n.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
            f.this.K(hVar);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            Window.Callback U = f.this.U();
            if (U != null) {
                U.onMenuOpened(108, hVar);
                return true;
            }
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class e implements a.InterfaceC0365a {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0365a f20321a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends androidx.activity.s {
            public a() {
            }

            @Override // x0.o0
            public final void a() {
                e eVar = e.this;
                f.this.f20314v.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.f20315w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f20314v.getParent() instanceof View) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.h.c((View) fVar.f20314v.getParent());
                }
                fVar.f20314v.h();
                fVar.f20317y.d(null);
                fVar.f20317y = null;
                ViewGroup viewGroup = fVar.B;
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                f0.h.c(viewGroup);
            }
        }

        public e(a.InterfaceC0365a interfaceC0365a) {
            this.f20321a = interfaceC0365a;
        }

        @Override // q.a.InterfaceC0365a
        public final void a(q.a aVar) {
            this.f20321a.a(aVar);
            f fVar = f.this;
            if (fVar.f20315w != null) {
                fVar.f20304l.getDecorView().removeCallbacks(fVar.f20316x);
            }
            if (fVar.f20314v != null) {
                n0 n0Var = fVar.f20317y;
                if (n0Var != null) {
                    n0Var.b();
                }
                n0 a10 = f0.a(fVar.f20314v);
                a10.a(0.0f);
                fVar.f20317y = a10;
                a10.d(new a());
            }
            l.c cVar = fVar.f20306n;
            if (cVar != null) {
                cVar.onSupportActionModeFinished(fVar.f20313u);
            }
            fVar.f20313u = null;
            ViewGroup viewGroup = fVar.B;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.h.c(viewGroup);
            fVar.c0();
        }

        @Override // q.a.InterfaceC0365a
        public final boolean b(q.a aVar, androidx.appcompat.view.menu.h hVar) {
            ViewGroup viewGroup = f.this.B;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.h.c(viewGroup);
            return this.f20321a.b(aVar, hVar);
        }

        @Override // q.a.InterfaceC0365a
        public final boolean c(q.a aVar, MenuItem menuItem) {
            return this.f20321a.c(aVar, menuItem);
        }

        @Override // q.a.InterfaceC0365a
        public final boolean d(q.a aVar, androidx.appcompat.view.menu.h hVar) {
            return this.f20321a.d(aVar, hVar);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: l.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0275f {
        public static void a(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void b(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class g {
        public static String a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class h {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        public static s0.h b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return s0.h.b(languageTags);
        }

        public static void c(s0.h hVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(hVar.f29693a.a());
            LocaleList.setDefault(forLanguageTags);
        }

        public static void d(Configuration configuration, s0.h hVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(hVar.f29693a.a());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class i {
        public static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, l.n] */
        public static OnBackInvokedCallback b(Object obj, final f fVar) {
            Objects.requireNonNull(fVar);
            ?? r02 = new OnBackInvokedCallback() { // from class: l.n
                public final void onBackInvoked() {
                    f.this.X();
                }
            };
            l.l.b(obj).registerOnBackInvokedCallback(1000000, r02);
            return r02;
        }

        public static void c(Object obj, Object obj2) {
            l.l.b(obj).unregisterOnBackInvokedCallback(l.k.a(obj2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class j extends q.h {

        /* renamed from: b  reason: collision with root package name */
        public c f20324b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f20325d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f20326e;

        public j(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
            } finally {
                this.c = false;
            }
        }

        @Override // q.h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f20325d) {
                return this.f29051a.dispatchKeyEvent(keyEvent);
            }
            if (!f.this.N(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
            if (r6 != false) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // q.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 1
                if (r0 != 0) goto L4f
                int r0 = r6.getKeyCode()
                l.f r2 = l.f.this
                r2.V()
                l.a r3 = r2.f20307o
                r4 = 0
                if (r3 == 0) goto L1c
                boolean r0 = r3.i(r0, r6)
                if (r0 == 0) goto L1c
                goto L48
            L1c:
                l.f$o r0 = r2.N
                if (r0 == 0) goto L31
                int r3 = r6.getKeyCode()
                boolean r0 = r2.Z(r0, r3, r6)
                if (r0 == 0) goto L31
                l.f$o r6 = r2.N
                if (r6 == 0) goto L48
                r6.f20344l = r1
                goto L48
            L31:
                l.f$o r0 = r2.N
                if (r0 != 0) goto L4a
                l.f$o r0 = r2.T(r4)
                r2.a0(r0, r6)
                int r3 = r6.getKeyCode()
                boolean r6 = r2.Z(r0, r3, r6)
                r0.f20343k = r4
                if (r6 == 0) goto L4a
            L48:
                r6 = r1
                goto L4b
            L4a:
                r6 = r4
            L4b:
                if (r6 == 0) goto L4e
                goto L4f
            L4e:
                r1 = r4
            L4f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: l.f.j.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.c) {
                this.f29051a.onContentChanged();
            }
        }

        @Override // q.h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 == 0 && !(menu instanceof androidx.appcompat.view.menu.h)) {
                return false;
            }
            return super.onCreatePanelMenu(i10, menu);
        }

        @Override // q.h, android.view.Window.Callback
        public final View onCreatePanelView(int i10) {
            View view;
            c cVar = this.f20324b;
            if (cVar != null) {
                v.e eVar = (v.e) cVar;
                if (i10 == 0) {
                    view = new View(v.this.f20382a.getContext());
                } else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i10);
        }

        @Override // q.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            f fVar = f.this;
            if (i10 == 108) {
                fVar.V();
                l.a aVar = fVar.f20307o;
                if (aVar != null) {
                    aVar.c(true);
                }
            } else {
                fVar.getClass();
            }
            return true;
        }

        @Override // q.h, android.view.Window.Callback
        public final void onPanelClosed(int i10, Menu menu) {
            if (this.f20326e) {
                this.f29051a.onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            f fVar = f.this;
            if (i10 == 108) {
                fVar.V();
                l.a aVar = fVar.f20307o;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i10 == 0) {
                o T = fVar.T(i10);
                if (T.f20345m) {
                    fVar.L(T, false);
                }
            } else {
                fVar.getClass();
            }
        }

        @Override // q.h, android.view.Window.Callback
        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.h hVar;
            if (menu instanceof androidx.appcompat.view.menu.h) {
                hVar = (androidx.appcompat.view.menu.h) menu;
            } else {
                hVar = null;
            }
            if (i10 == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.f2073x = true;
            }
            c cVar = this.f20324b;
            if (cVar != null) {
                v.e eVar = (v.e) cVar;
                if (i10 == 0) {
                    v vVar = v.this;
                    if (!vVar.f20384d) {
                        vVar.f20382a.f2702m = true;
                        vVar.f20384d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (hVar != null) {
                hVar.f2073x = false;
            }
            return onPreparePanel;
        }

        @Override // q.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.h hVar = f.this.T(0).f20340h;
            if (hVar != null) {
                super.onProvideKeyboardShortcuts(list, hVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // q.h, android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            f fVar = f.this;
            if (fVar.f20318z && i10 == 0) {
                e.a aVar = new e.a(fVar.f20303k, callback);
                q.a F = fVar.F(aVar);
                if (F != null) {
                    return aVar.e(F);
                }
                return null;
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class k extends l {
        public final PowerManager c;

        public k(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // l.f.l
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // l.f.l
        public final int c() {
            if (this.c.isPowerSaveMode()) {
                return 2;
            }
            return 1;
        }

        @Override // l.f.l
        public final void d() {
            f.this.d();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public a f20329a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                l.this.d();
            }
        }

        public l() {
        }

        public final void a() {
            a aVar = this.f20329a;
            if (aVar != null) {
                try {
                    f.this.f20303k.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f20329a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f20329a == null) {
                    this.f20329a = new a();
                }
                f.this.f20303k.registerReceiver(this.f20329a, b10);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class m extends l {
        public final x c;

        public m(x xVar) {
            super();
            this.c = xVar;
        }

        @Override // l.f.l
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
        @Override // l.f.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c() {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l.f.m.c():int");
        }

        @Override // l.f.l
        public final void d() {
            f.this.d();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class n extends ContentFrameLayout {
        public n(q.c cVar) {
            super(cVar);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!f.this.N(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            if (motionEvent.getAction() == 0) {
                int x4 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x4 >= -5 && y10 >= -5 && x4 <= getWidth() + 5 && y10 <= getHeight() + 5) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    f fVar = f.this;
                    fVar.L(fVar.T(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(m.a.a(getContext(), i10));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class o {

        /* renamed from: a  reason: collision with root package name */
        public final int f20334a;

        /* renamed from: b  reason: collision with root package name */
        public int f20335b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f20336d;

        /* renamed from: e  reason: collision with root package name */
        public n f20337e;

        /* renamed from: f  reason: collision with root package name */
        public View f20338f;

        /* renamed from: g  reason: collision with root package name */
        public View f20339g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f20340h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f20341i;

        /* renamed from: j  reason: collision with root package name */
        public q.c f20342j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f20343k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f20344l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f20345m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f20346n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f20347o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f20348p;

        public o(int i10) {
            this.f20334a = i10;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class p implements n.a {
        public p() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
            boolean z11;
            int i10;
            o oVar;
            androidx.appcompat.view.menu.h k10 = hVar.k();
            int i11 = 0;
            if (k10 != hVar) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                hVar = k10;
            }
            f fVar = f.this;
            o[] oVarArr = fVar.M;
            if (oVarArr != null) {
                i10 = oVarArr.length;
            } else {
                i10 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    oVar = oVarArr[i11];
                    if (oVar != null && oVar.f20340h == hVar) {
                        break;
                    }
                    i11++;
                } else {
                    oVar = null;
                    break;
                }
            }
            if (oVar != null) {
                if (z11) {
                    fVar.J(oVar.f20334a, oVar, k10);
                    fVar.L(oVar, true);
                    return;
                }
                fVar.L(oVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            Window.Callback U;
            if (hVar == hVar.k()) {
                f fVar = f.this;
                if (fVar.G && (U = fVar.U()) != null && !fVar.R) {
                    U.onMenuOpened(108, hVar);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    public f(Context context, Window window, l.c cVar, Object obj) {
        y.i<String, Integer> iVar;
        Integer orDefault;
        androidx.appcompat.app.c cVar2;
        this.T = -100;
        this.f20303k = context;
        this.f20306n = cVar;
        this.f20302j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof androidx.appcompat.app.c) {
                    cVar2 = (androidx.appcompat.app.c) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            cVar2 = null;
            if (cVar2 != null) {
                this.T = cVar2.getDelegate().i();
            }
        }
        if (this.T == -100 && (orDefault = (iVar = f20290i0).getOrDefault(this.f20302j.getClass().getName(), null)) != null) {
            this.T = orDefault.intValue();
            iVar.remove(this.f20302j.getClass().getName());
        }
        if (window != null) {
            H(window);
        }
        androidx.appcompat.widget.h.d();
    }

    public static s0.h I(Context context) {
        s0.h hVar;
        s0.h b10;
        Locale c10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (hVar = l.e.c) == null) {
            return null;
        }
        s0.h S = S(context.getApplicationContext().getResources().getConfiguration());
        s0.j jVar = hVar.f29693a;
        if (i10 >= 24) {
            if (jVar.isEmpty()) {
                b10 = s0.h.f29692b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i11 = 0; i11 < S.d() + hVar.d(); i11++) {
                    if (i11 < hVar.d()) {
                        c10 = hVar.c(i11);
                    } else {
                        c10 = S.c(i11 - hVar.d());
                    }
                    if (c10 != null) {
                        linkedHashSet.add(c10);
                    }
                }
                b10 = s0.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (jVar.isEmpty()) {
            b10 = s0.h.f29692b;
        } else {
            b10 = s0.h.b(hVar.c(0).toString());
        }
        if (!b10.f29693a.isEmpty()) {
            return b10;
        }
        return S;
    }

    public static Configuration M(Context context, int i10, s0.h hVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                h.d(configuration2, hVar);
            } else {
                C0275f.b(configuration2, hVar.c(0));
                C0275f.a(configuration2, hVar.c(0));
            }
        }
        return configuration2;
    }

    public static s0.h S(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return h.b(configuration);
        }
        return s0.h.b(g.a(configuration.locale));
    }

    @Override // l.e
    public final void A(View view, ViewGroup.LayoutParams layoutParams) {
        P();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f20305m.a(this.f20304l.getCallback());
    }

    @Override // l.e
    public final void C(Toolbar toolbar) {
        CharSequence charSequence;
        Object obj = this.f20302j;
        if (!(obj instanceof Activity)) {
            return;
        }
        V();
        l.a aVar = this.f20307o;
        if (!(aVar instanceof y)) {
            this.f20308p = null;
            if (aVar != null) {
                aVar.h();
            }
            this.f20307o = null;
            if (toolbar != null) {
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.f20309q;
                }
                v vVar = new v(toolbar, charSequence, this.f20305m);
                this.f20307o = vVar;
                this.f20305m.f20324b = vVar.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f20305m.f20324b = null;
            }
            m();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // l.e
    public final void D(int i10) {
        this.U = i10;
    }

    @Override // l.e
    public final void E(CharSequence charSequence) {
        this.f20309q = charSequence;
        androidx.appcompat.widget.w wVar = this.f20310r;
        if (wVar != null) {
            wVar.setWindowTitle(charSequence);
            return;
        }
        l.a aVar = this.f20307o;
        if (aVar != null) {
            aVar.p(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (x0.f0.g.c(r9) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    @Override // l.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q.a F(q.a.InterfaceC0365a r9) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.F(q.a$a):q.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.G(boolean, boolean):boolean");
    }

    public final void H(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f20304l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof j)) {
                j jVar = new j(callback);
                this.f20305m = jVar;
                window.setCallback(jVar);
                Context context = this.f20303k;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f20291j0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    androidx.appcompat.widget.h a10 = androidx.appcompat.widget.h.a();
                    synchronized (a10) {
                        drawable = a10.f2594a.g(context, true, resourceId);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f20304l = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f20300g0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f20301h0) != null) {
                        i.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f20301h0 = null;
                    }
                    Object obj = this.f20302j;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f20300g0 = i.a(activity);
                            c0();
                            return;
                        }
                    }
                    this.f20300g0 = null;
                    c0();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void J(int i10, o oVar, androidx.appcompat.view.menu.h hVar) {
        if (hVar == null) {
            if (oVar == null && i10 >= 0) {
                o[] oVarArr = this.M;
                if (i10 < oVarArr.length) {
                    oVar = oVarArr[i10];
                }
            }
            if (oVar != null) {
                hVar = oVar.f20340h;
            }
        }
        if ((oVar == null || oVar.f20345m) && !this.R) {
            j jVar = this.f20305m;
            Window.Callback callback = this.f20304l.getCallback();
            jVar.getClass();
            try {
                jVar.f20326e = true;
                callback.onPanelClosed(i10, hVar);
            } finally {
                jVar.f20326e = false;
            }
        }
    }

    public final void K(androidx.appcompat.view.menu.h hVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.f20310r.i();
        Window.Callback U = U();
        if (U != null && !this.R) {
            U.onPanelClosed(108, hVar);
        }
        this.L = false;
    }

    public final void L(o oVar, boolean z10) {
        n nVar;
        androidx.appcompat.widget.w wVar;
        if (z10 && oVar.f20334a == 0 && (wVar = this.f20310r) != null && wVar.a()) {
            K(oVar.f20340h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f20303k.getSystemService("window");
        if (windowManager != null && oVar.f20345m && (nVar = oVar.f20337e) != null) {
            windowManager.removeView(nVar);
            if (z10) {
                J(oVar.f20334a, oVar, null);
            }
        }
        oVar.f20343k = false;
        oVar.f20344l = false;
        oVar.f20345m = false;
        oVar.f20338f = null;
        oVar.f20346n = true;
        if (this.N == oVar) {
            this.N = null;
        }
        if (oVar.f20334a == 0) {
            c0();
        }
    }

    public final boolean N(KeyEvent keyEvent) {
        View decorView;
        boolean z10;
        boolean z11;
        boolean z12;
        AudioManager audioManager;
        Object obj = this.f20302j;
        boolean z13 = true;
        if (((obj instanceof g.a) || (obj instanceof l.p)) && (decorView = this.f20304l.getDecorView()) != null && x0.g.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            j jVar = this.f20305m;
            Window.Callback callback = this.f20304l.getCallback();
            jVar.getClass();
            try {
                jVar.f20325d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                jVar.f20325d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    o T = T(0);
                    if (T.f20345m) {
                        return true;
                    }
                    a0(T, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z13 = false;
                }
                this.O = z13;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f20313u != null) {
                    return true;
                }
                o T2 = T(0);
                androidx.appcompat.widget.w wVar = this.f20310r;
                Context context = this.f20303k;
                if (wVar != null && wVar.d() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    if (!this.f20310r.a()) {
                        if (!this.R && a0(T2, keyEvent)) {
                            z11 = this.f20310r.g();
                        }
                        z11 = false;
                    } else {
                        z11 = this.f20310r.f();
                    }
                } else {
                    boolean z14 = T2.f20345m;
                    if (!z14 && !T2.f20344l) {
                        if (T2.f20343k) {
                            if (T2.f20347o) {
                                T2.f20343k = false;
                                z12 = a0(T2, keyEvent);
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                Y(T2, keyEvent);
                                z11 = true;
                            }
                        }
                        z11 = false;
                    } else {
                        L(T2, true);
                        z11 = z14;
                    }
                }
                if (!z11 || (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) == null) {
                    return true;
                }
                audioManager.playSoundEffect(0);
                return true;
            }
        } else if (X()) {
            return true;
        }
        return false;
    }

    public final void O(int i10) {
        o T = T(i10);
        if (T.f20340h != null) {
            Bundle bundle = new Bundle();
            T.f20340h.u(bundle);
            if (bundle.size() > 0) {
                T.f20348p = bundle;
            }
            T.f20340h.y();
            T.f20340h.clear();
        }
        T.f20347o = true;
        T.f20346n = true;
        if ((i10 == 108 || i10 == 0) && this.f20310r != null) {
            o T2 = T(0);
            T2.f20343k = false;
            a0(T2, null);
        }
    }

    public final void P() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.A) {
            int[] iArr = k.a.f19438k;
            Context context2 = this.f20303k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    x(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    x(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    x(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    x(10);
                }
                this.J = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                Q();
                this.f20304l.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.K) {
                    if (this.J) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.H = false;
                        this.G = false;
                    } else if (this.G) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new q.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        androidx.appcompat.widget.w wVar = (androidx.appcompat.widget.w) viewGroup.findViewById(R.id.decor_content_parent);
                        this.f20310r = wVar;
                        wVar.setWindowCallback(U());
                        if (this.H) {
                            this.f20310r.h(109);
                        }
                        if (this.E) {
                            this.f20310r.h(2);
                        }
                        if (this.F) {
                            this.f20310r.h(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.I ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    l.g gVar = new l.g(this);
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.i.u(viewGroup, gVar);
                    if (this.f20310r == null) {
                        this.C = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = d1.f2566a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f20304l.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f20304l.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new l.h(this));
                    this.B = viewGroup;
                    Object obj = this.f20302j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f20309q;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        androidx.appcompat.widget.w wVar2 = this.f20310r;
                        if (wVar2 != null) {
                            wVar2.setWindowTitle(charSequence);
                        } else {
                            l.a aVar = this.f20307o;
                            if (aVar != null) {
                                aVar.p(charSequence);
                            } else {
                                TextView textView = this.C;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(16908290);
                    View decorView = this.f20304l.getDecorView();
                    contentFrameLayout2.f2297g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                    if (f0.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.A = true;
                    o T = T(0);
                    if (!this.R && T.f20340h == null) {
                        this.f20294a0 |= 4096;
                        if (!this.Z) {
                            f0.d.m(this.f20304l.getDecorView(), this.f20295b0);
                            this.Z = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void Q() {
        if (this.f20304l == null) {
            Object obj = this.f20302j;
            if (obj instanceof Activity) {
                H(((Activity) obj).getWindow());
            }
        }
        if (this.f20304l != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final l R(Context context) {
        if (this.X == null) {
            if (x.f20398d == null) {
                Context applicationContext = context.getApplicationContext();
                x.f20398d = new x(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.X = new m(x.f20398d);
        }
        return this.X;
    }

    public final o T(int i10) {
        o[] oVarArr = this.M;
        if (oVarArr == null || oVarArr.length <= i10) {
            o[] oVarArr2 = new o[i10 + 1];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.M = oVarArr2;
            oVarArr = oVarArr2;
        }
        o oVar = oVarArr[i10];
        if (oVar == null) {
            o oVar2 = new o(i10);
            oVarArr[i10] = oVar2;
            return oVar2;
        }
        return oVar;
    }

    public final Window.Callback U() {
        return this.f20304l.getCallback();
    }

    public final void V() {
        P();
        if (this.G && this.f20307o == null) {
            Object obj = this.f20302j;
            if (obj instanceof Activity) {
                this.f20307o = new y((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.f20307o = new y((Dialog) obj);
            }
            l.a aVar = this.f20307o;
            if (aVar != null) {
                aVar.m(this.f20296c0);
            }
        }
    }

    public final int W(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.Y == null) {
                            this.Y = new k(context);
                        }
                        return this.Y.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return R(context).c();
            }
        }
        return i10;
    }

    public final boolean X() {
        boolean z10 = this.O;
        this.O = false;
        o T = T(0);
        if (T.f20345m) {
            if (!z10) {
                L(T, true);
            }
            return true;
        }
        q.a aVar = this.f20313u;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        V();
        l.a aVar2 = this.f20307o;
        if (aVar2 == null || !aVar2.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
        if (r2 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0178, code lost:
        if (r2.f2047f.getCount() > 0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(l.f.o r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.Y(l.f$o, android.view.KeyEvent):void");
    }

    public final boolean Z(o oVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.h hVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!oVar.f20343k && !a0(oVar, keyEvent)) || (hVar = oVar.f20340h) == null) {
            return false;
        }
        return hVar.performShortcut(i10, keyEvent, 1);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final boolean a(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        int i10;
        int i11;
        o oVar;
        Window.Callback U = U();
        if (U != null && !this.R) {
            androidx.appcompat.view.menu.h k10 = hVar.k();
            o[] oVarArr = this.M;
            if (oVarArr != null) {
                i10 = oVarArr.length;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    oVar = oVarArr[i11];
                    if (oVar != null && oVar.f20340h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    oVar = null;
                    break;
                }
            }
            if (oVar != null) {
                return U.onMenuItemSelected(oVar.f20334a, menuItem);
            }
        }
        return false;
    }

    public final boolean a0(o oVar, KeyEvent keyEvent) {
        boolean z10;
        androidx.appcompat.widget.w wVar;
        androidx.appcompat.widget.w wVar2;
        Resources.Theme theme;
        int i10;
        boolean z11;
        androidx.appcompat.widget.w wVar3;
        androidx.appcompat.widget.w wVar4;
        if (this.R) {
            return false;
        }
        if (oVar.f20343k) {
            return true;
        }
        o oVar2 = this.N;
        if (oVar2 != null && oVar2 != oVar) {
            L(oVar2, false);
        }
        Window.Callback U = U();
        int i11 = oVar.f20334a;
        if (U != null) {
            oVar.f20339g = U.onCreatePanelView(i11);
        }
        if (i11 != 0 && i11 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (wVar4 = this.f20310r) != null) {
            wVar4.b();
        }
        if (oVar.f20339g == null && (!z10 || !(this.f20307o instanceof v))) {
            androidx.appcompat.view.menu.h hVar = oVar.f20340h;
            if (hVar == null || oVar.f20347o) {
                if (hVar == null) {
                    Context context = this.f20303k;
                    if ((i11 == 0 || i11 == 108) && this.f20310r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            q.c cVar = new q.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.h hVar2 = new androidx.appcompat.view.menu.h(context);
                    hVar2.f2054e = this;
                    androidx.appcompat.view.menu.h hVar3 = oVar.f20340h;
                    if (hVar2 != hVar3) {
                        if (hVar3 != null) {
                            hVar3.r(oVar.f20341i);
                        }
                        oVar.f20340h = hVar2;
                        androidx.appcompat.view.menu.g gVar = oVar.f20341i;
                        if (gVar != null) {
                            hVar2.b(gVar, hVar2.f2051a);
                        }
                    }
                    if (oVar.f20340h == null) {
                        return false;
                    }
                }
                if (z10 && (wVar2 = this.f20310r) != null) {
                    if (this.f20311s == null) {
                        this.f20311s = new d();
                    }
                    wVar2.c(oVar.f20340h, this.f20311s);
                }
                oVar.f20340h.y();
                if (!U.onCreatePanelMenu(i11, oVar.f20340h)) {
                    androidx.appcompat.view.menu.h hVar4 = oVar.f20340h;
                    if (hVar4 != null) {
                        if (hVar4 != null) {
                            hVar4.r(oVar.f20341i);
                        }
                        oVar.f20340h = null;
                    }
                    if (z10 && (wVar = this.f20310r) != null) {
                        wVar.c(null, this.f20311s);
                    }
                    return false;
                }
                oVar.f20347o = false;
            }
            oVar.f20340h.y();
            Bundle bundle = oVar.f20348p;
            if (bundle != null) {
                oVar.f20340h.s(bundle);
                oVar.f20348p = null;
            }
            if (!U.onPreparePanel(0, oVar.f20339g, oVar.f20340h)) {
                if (z10 && (wVar3 = this.f20310r) != null) {
                    wVar3.c(null, this.f20311s);
                }
                oVar.f20340h.x();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            oVar.f20340h.setQwertyMode(z11);
            oVar.f20340h.x();
        }
        oVar.f20343k = true;
        oVar.f20344l = false;
        this.N = oVar;
        return true;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public final void b(androidx.appcompat.view.menu.h hVar) {
        androidx.appcompat.widget.w wVar = this.f20310r;
        if (wVar != null && wVar.d() && (!ViewConfiguration.get(this.f20303k).hasPermanentMenuKey() || this.f20310r.e())) {
            Window.Callback U = U();
            if (this.f20310r.a()) {
                this.f20310r.f();
                if (!this.R) {
                    U.onPanelClosed(108, T(0).f20340h);
                    return;
                }
                return;
            } else if (U != null && !this.R) {
                if (this.Z && (1 & this.f20294a0) != 0) {
                    View decorView = this.f20304l.getDecorView();
                    a aVar = this.f20295b0;
                    decorView.removeCallbacks(aVar);
                    aVar.run();
                }
                o T = T(0);
                androidx.appcompat.view.menu.h hVar2 = T.f20340h;
                if (hVar2 != null && !T.f20347o && U.onPreparePanel(0, T.f20339g, hVar2)) {
                    U.onMenuOpened(108, T.f20340h);
                    this.f20310r.g();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        o T2 = T(0);
        T2.f20346n = true;
        L(T2, false);
        Y(T2, null);
    }

    public final void b0() {
        if (!this.A) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    @Override // l.e
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        P();
        ((ViewGroup) this.B.findViewById(16908290)).addView(view, layoutParams);
        this.f20305m.a(this.f20304l.getCallback());
    }

    public final void c0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f20300g0 != null && (T(0).f20345m || this.f20313u != null)) {
                z10 = true;
            }
            if (z10 && this.f20301h0 == null) {
                this.f20301h0 = i.b(this.f20300g0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f20301h0) != null) {
                i.c(this.f20300g0, onBackInvokedCallback);
            }
        }
    }

    @Override // l.e
    public final boolean d() {
        return G(true, true);
    }

    @Override // l.e
    public final Context e(final Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = true;
        this.P = true;
        int i18 = this.T;
        if (i18 == -100) {
            i18 = l.e.f20283b;
        }
        int W = W(context, i18);
        if (l.e.n(context) && l.e.n(context)) {
            if (s0.a.b()) {
                if (!l.e.f20286f) {
                    l.e.f20282a.execute(new Runnable() { // from class: l.d
                        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
                            if (r5 != null) goto L19;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                r7 = this;
                                int r0 = android.os.Build.VERSION.SDK_INT
                                r1 = 33
                                r2 = 1
                                if (r0 < r1) goto L83
                                android.content.ComponentName r0 = new android.content.ComponentName
                                android.content.Context r1 = r1
                                java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
                                r0.<init>(r1, r3)
                                android.content.pm.PackageManager r3 = r1.getPackageManager()
                                int r3 = r3.getComponentEnabledSetting(r0)
                                if (r3 == r2) goto L83
                                boolean r3 = s0.a.b()
                                java.lang.String r4 = "locale"
                                if (r3 == 0) goto L5c
                                y.d<java.lang.ref.WeakReference<l.e>> r3 = l.e.f20287g
                                java.util.Iterator r3 = r3.iterator()
                            L28:
                                r5 = r3
                                y.h$a r5 = (y.h.a) r5
                                boolean r6 = r5.hasNext()
                                if (r6 == 0) goto L4a
                                java.lang.Object r5 = r5.next()
                                java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
                                java.lang.Object r5 = r5.get()
                                l.e r5 = (l.e) r5
                                if (r5 == 0) goto L28
                                android.content.Context r5 = r5.g()
                                if (r5 == 0) goto L28
                                java.lang.Object r3 = r5.getSystemService(r4)
                                goto L4b
                            L4a:
                                r3 = 0
                            L4b:
                                if (r3 == 0) goto L61
                                android.os.LocaleList r3 = l.e.b.a(r3)
                                s0.h r5 = new s0.h
                                s0.k r6 = new s0.k
                                r6.<init>(r3)
                                r5.<init>(r6)
                                goto L63
                            L5c:
                                s0.h r5 = l.e.c
                                if (r5 == 0) goto L61
                                goto L63
                            L61:
                                s0.h r5 = s0.h.f29692b
                            L63:
                                s0.j r3 = r5.f29693a
                                boolean r3 = r3.isEmpty()
                                if (r3 == 0) goto L7c
                                java.lang.String r3 = l.s.b(r1)
                                java.lang.Object r4 = r1.getSystemService(r4)
                                if (r4 == 0) goto L7c
                                android.os.LocaleList r3 = l.e.a.a(r3)
                                l.e.b.b(r4, r3)
                            L7c:
                                android.content.pm.PackageManager r1 = r1.getPackageManager()
                                r1.setComponentEnabledSetting(r0, r2, r2)
                            L83:
                                l.e.f20286f = r2
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.d.run():void");
                        }
                    });
                }
            } else {
                synchronized (l.e.f20289i) {
                    s0.h hVar = l.e.c;
                    if (hVar == null) {
                        if (l.e.f20284d == null) {
                            l.e.f20284d = s0.h.b(s.b(context));
                        }
                        if (!l.e.f20284d.f29693a.isEmpty()) {
                            l.e.c = l.e.f20284d;
                        }
                    } else if (!hVar.equals(l.e.f20284d)) {
                        s0.h hVar2 = l.e.c;
                        l.e.f20284d = hVar2;
                        s.a(context, hVar2.f29693a.a());
                    }
                }
            }
        }
        s0.h I = I(context);
        boolean z11 = false;
        Configuration configuration = null;
        if (f20293l0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(M(context, W, I, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof q.c) {
            try {
                ((q.c) context).a(M(context, W, I, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f20292k0) {
            return context;
        }
        int i19 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f10 = configuration3.fontScale;
                float f11 = configuration4.fontScale;
                if (f10 != f11) {
                    configuration.fontScale = f11;
                }
                int i20 = configuration3.mcc;
                int i21 = configuration4.mcc;
                if (i20 != i21) {
                    configuration.mcc = i21;
                }
                int i22 = configuration3.mnc;
                int i23 = configuration4.mnc;
                if (i22 != i23) {
                    configuration.mnc = i23;
                }
                if (i19 >= 24) {
                    h.a(configuration3, configuration4, configuration);
                } else if (!w0.b.a(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i24 = configuration3.touchscreen;
                int i25 = configuration4.touchscreen;
                if (i24 != i25) {
                    configuration.touchscreen = i25;
                }
                int i26 = configuration3.keyboard;
                int i27 = configuration4.keyboard;
                if (i26 != i27) {
                    configuration.keyboard = i27;
                }
                int i28 = configuration3.keyboardHidden;
                int i29 = configuration4.keyboardHidden;
                if (i28 != i29) {
                    configuration.keyboardHidden = i29;
                }
                int i30 = configuration3.navigation;
                int i31 = configuration4.navigation;
                if (i30 != i31) {
                    configuration.navigation = i31;
                }
                int i32 = configuration3.navigationHidden;
                int i33 = configuration4.navigationHidden;
                if (i32 != i33) {
                    configuration.navigationHidden = i33;
                }
                int i34 = configuration3.orientation;
                int i35 = configuration4.orientation;
                if (i34 != i35) {
                    configuration.orientation = i35;
                }
                int i36 = configuration3.screenLayout & 15;
                int i37 = configuration4.screenLayout & 15;
                if (i36 != i37) {
                    configuration.screenLayout |= i37;
                }
                int i38 = configuration3.screenLayout & 192;
                int i39 = configuration4.screenLayout & 192;
                if (i38 != i39) {
                    configuration.screenLayout |= i39;
                }
                int i40 = configuration3.screenLayout & 48;
                int i41 = configuration4.screenLayout & 48;
                if (i40 != i41) {
                    configuration.screenLayout |= i41;
                }
                int i42 = configuration3.screenLayout & 768;
                int i43 = configuration4.screenLayout & 768;
                if (i42 != i43) {
                    configuration.screenLayout |= i43;
                }
                if (i19 >= 26) {
                    i10 = configuration3.colorMode;
                    int i44 = i10 & 3;
                    i11 = configuration4.colorMode;
                    if (i44 != (i11 & 3)) {
                        i16 = configuration.colorMode;
                        i17 = configuration4.colorMode;
                        configuration.colorMode = i16 | (i17 & 3);
                    }
                    i12 = configuration3.colorMode;
                    int i45 = i12 & 12;
                    i13 = configuration4.colorMode;
                    if (i45 != (i13 & 12)) {
                        i14 = configuration.colorMode;
                        i15 = configuration4.colorMode;
                        configuration.colorMode = i14 | (i15 & 12);
                    }
                }
                int i46 = configuration3.uiMode & 15;
                int i47 = configuration4.uiMode & 15;
                if (i46 != i47) {
                    configuration.uiMode |= i47;
                }
                int i48 = configuration3.uiMode & 48;
                int i49 = configuration4.uiMode & 48;
                if (i48 != i49) {
                    configuration.uiMode |= i49;
                }
                int i50 = configuration3.screenWidthDp;
                int i51 = configuration4.screenWidthDp;
                if (i50 != i51) {
                    configuration.screenWidthDp = i51;
                }
                int i52 = configuration3.screenHeightDp;
                int i53 = configuration4.screenHeightDp;
                if (i52 != i53) {
                    configuration.screenHeightDp = i53;
                }
                int i54 = configuration3.smallestScreenWidthDp;
                int i55 = configuration4.smallestScreenWidthDp;
                if (i54 != i55) {
                    configuration.smallestScreenWidthDp = i55;
                }
                int i56 = configuration3.densityDpi;
                int i57 = configuration4.densityDpi;
                if (i56 != i57) {
                    configuration.densityDpi = i57;
                }
            }
        }
        Configuration M = M(context, W, I, configuration, true);
        q.c cVar = new q.c(context, (int) com.google.ads.mediation.pangle.R.style.Theme_AppCompat_Empty);
        cVar.a(M);
        try {
            if (context.getTheme() == null) {
                z10 = false;
            }
            z11 = z10;
        } catch (NullPointerException unused3) {
        }
        if (z11) {
            f.C0297f.a(cVar.getTheme());
        }
        return cVar;
    }

    @Override // l.e
    public final <T extends View> T f(int i10) {
        P();
        return (T) this.f20304l.findViewById(i10);
    }

    @Override // l.e
    public final Context g() {
        return this.f20303k;
    }

    @Override // l.e
    public final b h() {
        return new b();
    }

    @Override // l.e
    public final int i() {
        return this.T;
    }

    @Override // l.e
    public final MenuInflater j() {
        Context context;
        if (this.f20308p == null) {
            V();
            l.a aVar = this.f20307o;
            if (aVar != null) {
                context = aVar.e();
            } else {
                context = this.f20303k;
            }
            this.f20308p = new q.f(context);
        }
        return this.f20308p;
    }

    @Override // l.e
    public final l.a k() {
        V();
        return this.f20307o;
    }

    @Override // l.e
    public final void l() {
        LayoutInflater from = LayoutInflater.from(this.f20303k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            boolean z10 = from.getFactory2() instanceof f;
        }
    }

    @Override // l.e
    public final void m() {
        if (this.f20307o != null) {
            V();
            if (!this.f20307o.f()) {
                this.f20294a0 |= 1;
                if (!this.Z) {
                    View decorView = this.f20304l.getDecorView();
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.d.m(decorView, this.f20295b0);
                    this.Z = true;
                }
            }
        }
    }

    @Override // l.e
    public final void o(Configuration configuration) {
        if (this.G && this.A) {
            V();
            l.a aVar = this.f20307o;
            if (aVar != null) {
                aVar.g();
            }
        }
        androidx.appcompat.widget.h a10 = androidx.appcompat.widget.h.a();
        Context context = this.f20303k;
        synchronized (a10) {
            a10.f2594a.k(context);
        }
        this.S = new Configuration(this.f20303k.getResources().getConfiguration());
        G(false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
        if (r9.equals("ImageButton") == false) goto L125;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // l.e
    public final void p() {
        String str;
        this.P = true;
        G(false, true);
        Q();
        Object obj = this.f20302j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = k0.l.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                l.a aVar = this.f20307o;
                if (aVar == null) {
                    this.f20296c0 = true;
                } else {
                    aVar.m(true);
                }
            }
            synchronized (l.e.f20288h) {
                l.e.w(this);
                l.e.f20287g.add(new WeakReference<>(this));
            }
        }
        this.S = new Configuration(this.f20303k.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // l.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f20302j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = l.e.f20288h
            monitor-enter(r0)
            l.e.w(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.Z
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f20304l
            android.view.View r0 = r0.getDecorView()
            l.f$a r1 = r3.f20295b0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f20302j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            y.i<java.lang.String, java.lang.Integer> r0 = l.f.f20290i0
            java.lang.Object r1 = r3.f20302j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            y.i<java.lang.String, java.lang.Integer> r0 = l.f.f20290i0
            java.lang.Object r1 = r3.f20302j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            l.a r0 = r3.f20307o
            if (r0 == 0) goto L63
            r0.h()
        L63:
            l.f$m r0 = r3.X
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            l.f$k r0 = r3.Y
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.q():void");
    }

    @Override // l.e
    public final void r() {
        P();
    }

    @Override // l.e
    public final void s() {
        V();
        l.a aVar = this.f20307o;
        if (aVar != null) {
            aVar.o(true);
        }
    }

    @Override // l.e
    public final void u() {
        G(true, false);
    }

    @Override // l.e
    public final void v() {
        V();
        l.a aVar = this.f20307o;
        if (aVar != null) {
            aVar.o(false);
        }
    }

    @Override // l.e
    public final boolean x(int i10) {
        if (i10 == 8) {
            i10 = 108;
        } else if (i10 == 9) {
            i10 = 109;
        }
        if (this.K && i10 == 108) {
            return false;
        }
        if (this.G && i10 == 1) {
            this.G = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f20304l.requestFeature(i10);
                            }
                            b0();
                            this.H = true;
                            return true;
                        }
                        b0();
                        this.G = true;
                        return true;
                    }
                    b0();
                    this.I = true;
                    return true;
                }
                b0();
                this.F = true;
                return true;
            }
            b0();
            this.E = true;
            return true;
        }
        b0();
        this.K = true;
        return true;
    }

    @Override // l.e
    public final void y(int i10) {
        P();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f20303k).inflate(i10, viewGroup);
        this.f20305m.a(this.f20304l.getCallback());
    }

    @Override // l.e
    public final void z(View view) {
        P();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f20305m.a(this.f20304l.getCallback());
    }

    @Override // l.e
    public final void t() {
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
