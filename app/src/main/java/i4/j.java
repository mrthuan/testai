package i4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class j implements Handler.Callback {

    /* renamed from: i  reason: collision with root package name */
    public static final a f18449i = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile com.bumptech.glide.f f18450a;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f18452d;

    /* renamed from: e  reason: collision with root package name */
    public final b f18453e;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f18451b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final y.b<View, Fragment> f18454f = new y.b<>();

    /* renamed from: g  reason: collision with root package name */
    public final y.b<View, android.app.Fragment> f18455g = new y.b<>();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f18456h = new Bundle();

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public class a implements b {
    }

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public j(b bVar) {
        this.f18453e = bVar == null ? f18449i : bVar;
        this.f18452d = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(y.b bVar, List list) {
        View view;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && (view = fragment.H) != null) {
                bVar.put(view, fragment);
                c(bVar, fragment.q().H());
            }
        }
    }

    public static boolean k(Context context) {
        Activity a10 = a(context);
        if (a10 != null && a10.isFinishing()) {
            return false;
        }
        return true;
    }

    @TargetApi(26)
    @Deprecated
    public final void b(FragmentManager fragmentManager, y.b<View, android.app.Fragment> bVar) {
        android.app.Fragment fragment;
        List<android.app.Fragment> fragments;
        if (Build.VERSION.SDK_INT >= 26) {
            fragments = fragmentManager.getFragments();
            for (android.app.Fragment fragment2 : fragments) {
                if (fragment2.getView() != null) {
                    bVar.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), bVar);
                }
            }
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            Bundle bundle = this.f18456h;
            bundle.putInt("key", i10);
            try {
                fragment = fragmentManager.getFragment(bundle, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                bVar.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), bVar);
            }
            i10 = i11;
        }
    }

    @Deprecated
    public final com.bumptech.glide.f d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        i i10 = i(fragmentManager, fragment, z10);
        com.bumptech.glide.f fVar = i10.f18445d;
        if (fVar == null) {
            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
            ((a) this.f18453e).getClass();
            com.bumptech.glide.f fVar2 = new com.bumptech.glide.f(b10, i10.f18443a, i10.f18444b, context);
            i10.f18445d = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public final com.bumptech.glide.f e(Activity activity) {
        if (p4.j.f()) {
            return f(activity.getApplicationContext());
        }
        if (!activity.isDestroyed()) {
            return d(activity, activity.getFragmentManager(), null, k(activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final com.bumptech.glide.f f(Context context) {
        boolean z10;
        if (context != null) {
            char[] cArr = p4.j.f23703a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !(context instanceof Application)) {
                if (context instanceof u) {
                    return h((u) context);
                }
                if (context instanceof Activity) {
                    return e((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f18450a == null) {
                synchronized (this) {
                    if (this.f18450a == null) {
                        com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context.getApplicationContext());
                        b bVar = this.f18453e;
                        z3.c cVar = new z3.c(2);
                        ge.a aVar = new ge.a(1);
                        Context applicationContext = context.getApplicationContext();
                        ((a) bVar).getClass();
                        this.f18450a = new com.bumptech.glide.f(b10, cVar, aVar, applicationContext);
                    }
                }
            }
            return this.f18450a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.f g(Fragment fragment) {
        if (fragment.r() != null) {
            if (p4.j.f()) {
                return f(fragment.r().getApplicationContext());
            }
            return l(fragment.r(), fragment.q(), fragment, fragment.G());
        }
        throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
    }

    public final com.bumptech.glide.f h(u uVar) {
        if (p4.j.f()) {
            return f(uVar.getApplicationContext());
        }
        if (!uVar.isDestroyed()) {
            return l(uVar, uVar.getSupportFragmentManager(), null, k(uVar));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        Object obj3;
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 != 2) {
                obj3 = null;
                z10 = false;
                obj2 = null;
                if (z10 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Objects.toString(obj2);
                }
                return z10;
            }
            obj = (g0) message.obj;
            remove = this.c.remove(obj);
        } else {
            obj = (FragmentManager) message.obj;
            remove = this.f18451b.remove(obj);
        }
        Object obj4 = remove;
        obj2 = obj;
        obj3 = obj4;
        if (z10) {
            Objects.toString(obj2);
        }
        return z10;
    }

    public final i i(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        i iVar = (i) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (iVar == null) {
            HashMap hashMap = this.f18451b;
            i iVar2 = (i) hashMap.get(fragmentManager);
            if (iVar2 == null) {
                iVar2 = new i();
                iVar2.f18447f = fragment;
                if (fragment != null && fragment.getActivity() != null) {
                    iVar2.a(fragment.getActivity());
                }
                if (z10) {
                    iVar2.f18443a.c();
                }
                hashMap.put(fragmentManager, iVar2);
                fragmentManager.beginTransaction().add(iVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f18452d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return iVar2;
        }
        return iVar;
    }

    public final m j(g0 g0Var, Fragment fragment, boolean z10) {
        m mVar = (m) g0Var.D("com.bumptech.glide.manager");
        if (mVar == null) {
            HashMap hashMap = this.c;
            m mVar2 = (m) hashMap.get(g0Var);
            if (mVar2 == null) {
                mVar2 = new m();
                mVar2.f18462d0 = fragment;
                if (fragment != null && fragment.r() != null) {
                    Fragment fragment2 = fragment;
                    while (true) {
                        Fragment fragment3 = fragment2.f3689v;
                        if (fragment3 == null) {
                            break;
                        }
                        fragment2 = fragment3;
                    }
                    g0 g0Var2 = fragment2.f3686s;
                    if (g0Var2 != null) {
                        mVar2.p0(fragment.r(), g0Var2);
                    }
                }
                if (z10) {
                    mVar2.Y.c();
                }
                hashMap.put(g0Var, mVar2);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(g0Var);
                aVar.c(0, mVar2, "com.bumptech.glide.manager", 1);
                aVar.g();
                this.f18452d.obtainMessage(2, g0Var).sendToTarget();
            }
            return mVar2;
        }
        return mVar;
    }

    public final com.bumptech.glide.f l(Context context, g0 g0Var, Fragment fragment, boolean z10) {
        m j10 = j(g0Var, fragment, z10);
        com.bumptech.glide.f fVar = j10.f18461c0;
        if (fVar == null) {
            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
            ((a) this.f18453e).getClass();
            com.bumptech.glide.f fVar2 = new com.bumptech.glide.f(b10, j10.Y, j10.Z, context);
            j10.f18461c0 = fVar2;
            return fVar2;
        }
        return fVar;
    }
}
