package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.s;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import androidx.fragment.app.u;
import androidx.savedstate.a;
import java.util.ArrayList;
import k0.b;
import k0.b0;
import k0.l;
import kotlin.jvm.internal.g;
import l.e;
import l.f;
import l.s;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import q.a;
import s0.h;

/* compiled from: AppCompatActivity.java */
/* loaded from: classes.dex */
public class c extends u implements l.c, b0.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private e mDelegate;
    private Resources mResources;

    /* compiled from: AppCompatActivity.java */
    /* loaded from: classes.dex */
    public class a implements a.b {
        public a() {
        }

        @Override // androidx.savedstate.a.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            c.this.getDelegate().t();
            return bundle;
        }
    }

    /* compiled from: AppCompatActivity.java */
    /* loaded from: classes.dex */
    public class b implements i.b {
        public b() {
        }

        @Override // i.b
        public final void a(Context context) {
            c cVar = c.this;
            e delegate = cVar.getDelegate();
            delegate.l();
            cVar.getSavedStateRegistry().a(c.DELEGATE_TAG);
            delegate.p();
        }
    }

    public c() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        t0.q0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        g.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        t0.r0(getWindow().getDecorView(), this);
        s.t0(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().e(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        l.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // k0.j, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        l.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().f(i10);
    }

    public e getDelegate() {
        if (this.mDelegate == null) {
            s.a aVar = e.f20282a;
            this.mDelegate = new f(this, null, this, this);
        }
        return this.mDelegate;
    }

    public l.b getDrawerToggleDelegate() {
        return getDelegate().h();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().j();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i10 = c1.f2555a;
        }
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public l.a getSupportActionBar() {
        return getDelegate().k();
    }

    @Override // k0.b0.a
    public Intent getSupportParentActivityIntent() {
        return l.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().m();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().o(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(b0 b0Var) {
        b0Var.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = l.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            Context context = b0Var.f19460b;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(context.getPackageManager());
            }
            ArrayList<Intent> arrayList = b0Var.f19459a;
            int size = arrayList.size();
            try {
                for (Intent b10 = l.b(context, component); b10 != null; b10 = l.b(context, b10.getComponent())) {
                    arrayList.add(size, b10);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().q();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        l.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.d() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().r();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().s();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().u();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().v();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            b0 b0Var = new b0(this);
            onCreateSupportNavigateUpTaskStack(b0Var);
            onPrepareSupportNavigateUpTaskStack(b0Var);
            ArrayList<Intent> arrayList = b0Var.f19459a;
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Context context = b0Var.f19460b;
                if (!androidx.core.content.a.startActivities(context, intentArr, null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
                try {
                    int i10 = k0.b.f19457a;
                    b.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        supportNavigateUpTo(supportParentActivityIntent);
        return true;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().E(charSequence);
    }

    @Override // l.c
    public q.a onWindowStartingSupportActionMode(a.InterfaceC0365a interfaceC0365a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        l.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        initViewTreeOwners();
        getDelegate().y(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().C(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().D(i10);
    }

    public q.a startSupportActionMode(a.InterfaceC0365a interfaceC0365a) {
        return getDelegate().F(interfaceC0365a);
    }

    @Override // androidx.fragment.app.u
    public void supportInvalidateOptionsMenu() {
        getDelegate().m();
    }

    public void supportNavigateUpTo(Intent intent) {
        l.a.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().x(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return l.a.c(this, intent);
    }

    public c(int i10) {
        super(i10);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().z(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().A(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(h hVar) {
    }

    public void onNightModeChanged(int i10) {
    }

    public void onPrepareSupportNavigateUpTaskStack(b0 b0Var) {
    }

    @Override // l.c
    public void onSupportActionModeFinished(q.a aVar) {
    }

    @Override // l.c
    public void onSupportActionModeStarted(q.a aVar) {
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }
}
