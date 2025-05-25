package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.g0;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import k0.b;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class u extends ComponentActivity implements b.d {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.q mFragmentLifecycleRegistry;
    final x mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class a extends z<u> implements androidx.core.content.c, androidx.core.content.d, k0.v, k0.w, androidx.lifecycle.p0, androidx.activity.q, androidx.activity.result.g, z1.c, k0, x0.i {
        public a() {
            super(u.this);
        }

        @Override // androidx.fragment.app.w
        public final View F(int i10) {
            return u.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.w
        public final boolean H() {
            Window window = u.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.z
        public final void J(PrintWriter printWriter, String[] strArr) {
            u.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.z
        public final u K() {
            return u.this;
        }

        @Override // androidx.fragment.app.z
        public final LayoutInflater L() {
            u uVar = u.this;
            return uVar.getLayoutInflater().cloneInContext(uVar);
        }

        @Override // androidx.fragment.app.z
        public final void M() {
            u.this.invalidateMenu();
        }

        @Override // x0.i
        public final void addMenuProvider(x0.n nVar) {
            u.this.addMenuProvider(nVar);
        }

        @Override // androidx.core.content.c
        public final void addOnConfigurationChangedListener(w0.a<Configuration> aVar) {
            u.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // k0.v
        public final void addOnMultiWindowModeChangedListener(w0.a<k0.k> aVar) {
            u.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // k0.w
        public final void addOnPictureInPictureModeChangedListener(w0.a<k0.y> aVar) {
            u.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.d
        public final void addOnTrimMemoryListener(w0.a<Integer> aVar) {
            u.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.activity.result.g
        public final androidx.activity.result.f getActivityResultRegistry() {
            return u.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.p
        public final Lifecycle getLifecycle() {
            return u.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.q
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return u.this.getOnBackPressedDispatcher();
        }

        @Override // z1.c
        public final androidx.savedstate.a getSavedStateRegistry() {
            return u.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.p0
        public final androidx.lifecycle.o0 getViewModelStore() {
            return u.this.getViewModelStore();
        }

        @Override // x0.i
        public final void removeMenuProvider(x0.n nVar) {
            u.this.removeMenuProvider(nVar);
        }

        @Override // androidx.core.content.c
        public final void removeOnConfigurationChangedListener(w0.a<Configuration> aVar) {
            u.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // k0.v
        public final void removeOnMultiWindowModeChangedListener(w0.a<k0.k> aVar) {
            u.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // k0.w
        public final void removeOnPictureInPictureModeChangedListener(w0.a<k0.y> aVar) {
            u.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // androidx.core.content.d
        public final void removeOnTrimMemoryListener(w0.a<Integer> aVar) {
            u.this.removeOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.k0
        public final void u(Fragment fragment) {
            u.this.onAttachFragment(fragment);
        }
    }

    public u() {
        this.mFragments = new x(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new a.b() { // from class: androidx.fragment.app.q
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                Bundle lambda$init$0;
                lambda$init$0 = u.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new w0.a() { // from class: androidx.fragment.app.r
            @Override // w0.a
            public final void accept(Object obj) {
                u.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new w0.a() { // from class: androidx.fragment.app.s
            @Override // w0.a
            public final void accept(Object obj) {
                u.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new i.b() { // from class: androidx.fragment.app.t
            @Override // i.b
            public final void a(Context context) {
                u.this.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        z<?> zVar = this.mFragments.f3954a;
        zVar.f3964g.b(zVar, zVar, null);
    }

    private static boolean markState(g0 g0Var, Lifecycle.State state) {
        u K;
        boolean z10 = false;
        for (Fragment fragment : g0Var.H()) {
            if (fragment != null) {
                z<?> zVar = fragment.f3687t;
                if (zVar == null) {
                    K = null;
                } else {
                    K = zVar.K();
                }
                if (K != null) {
                    z10 |= markState(fragment.q(), state);
                }
                x0 x0Var = fragment.Q;
                if (x0Var != null) {
                    x0Var.b();
                    if (x0Var.f3958e.f4071d.isAtLeast(Lifecycle.State.STARTED)) {
                        fragment.Q.f3958e.h(state);
                        z10 = true;
                    }
                }
                if (fragment.P.f4071d.isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.P.h(state);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f3954a.f3964g.f3780f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            o1.a.a(this).b(str2, printWriter);
        }
        this.mFragments.f3954a.f3964g.v(str, fileDescriptor, printWriter, strArr);
    }

    public g0 getSupportFragmentManager() {
        return this.mFragments.f3954a.f3964g;
    }

    @Deprecated
    public o1.a getSupportLoaderManager() {
        return o1.a.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
        h0 h0Var = this.mFragments.f3954a.f3964g;
        h0Var.E = false;
        h0Var.F = false;
        h0Var.L.f3837i = false;
        h0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f3954a.f3964g.k();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f3954a.f3964g.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f3954a.f3964g.t(5);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f3954a.f3964g.y(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
        h0 h0Var = this.mFragments.f3954a.f3964g;
        h0Var.E = false;
        h0Var.F = false;
        h0Var.L.f3837i = false;
        h0Var.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            h0 h0Var = this.mFragments.f3954a.f3964g;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f3837i = false;
            h0Var.t(4);
        }
        this.mFragments.f3954a.f3964g.y(true);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_START);
        h0 h0Var2 = this.mFragments.f3954a.f3964g;
        h0Var2.E = false;
        h0Var2.F = false;
        h0Var2.L.f3837i = false;
        h0Var2.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        h0 h0Var = this.mFragments.f3954a.f3964g;
        h0Var.F = true;
        h0Var.L.f3837i = true;
        h0Var.t(4);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(k0.a0 a0Var) {
        b.e eVar;
        int i10 = k0.b.f19457a;
        if (a0Var != null) {
            eVar = new b.e(a0Var);
        } else {
            eVar = null;
        }
        b.C0261b.c(this, eVar);
    }

    public void setExitSharedElementCallback(k0.a0 a0Var) {
        b.e eVar;
        int i10 = k0.b.f19457a;
        if (a0Var != null) {
            eVar = new b.e(a0Var);
        } else {
            eVar = null;
        }
        b.C0261b.d(this, eVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        if (i10 == -1) {
            int i14 = k0.b.f19457a;
            b.a.c(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else if (fragment.f3687t != null) {
            if (g0.J(2)) {
                fragment.toString();
                Objects.toString(intentSender);
                Objects.toString(intent);
                Objects.toString(bundle);
            }
            g0 u7 = fragment.u();
            if (u7.A != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    } else {
                        intent2 = intent;
                    }
                    if (g0.J(2)) {
                        bundle.toString();
                        intent2.toString();
                        Objects.toString(fragment);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                } else {
                    intent2 = intent;
                }
                kotlin.jvm.internal.g.e(intentSender, "intentSender");
                androidx.activity.result.h hVar = new androidx.activity.result.h(intentSender, intent2, i11, i12);
                u7.C.addLast(new g0.l(fragment.f3673f, i10));
                if (g0.J(2)) {
                    fragment.toString();
                }
                u7.A.a(hVar);
                return;
            }
            z<?> zVar = u7.f3794t;
            if (i10 == -1) {
                Activity activity = zVar.f3961d;
                int i15 = k0.b.f19457a;
                b.a.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
                return;
            }
            zVar.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        } else {
            throw new IllegalStateException(androidx.activity.f.l("Fragment ", fragment, " not attached to Activity"));
        }
    }

    public void supportFinishAfterTransition() {
        int i10 = k0.b.f19457a;
        b.C0261b.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i10 = k0.b.f19457a;
        b.C0261b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i10 = k0.b.f19457a;
        b.C0261b.e(this);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            int i11 = k0.b.f19457a;
            b.a.b(this, intent, -1, bundle);
            return;
        }
        fragment.o0(intent, i10, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public u(int i10) {
        super(i10);
        this.mFragments = new x(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // k0.b.d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
