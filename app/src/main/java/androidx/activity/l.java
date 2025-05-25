package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ComponentDialog.kt */
/* loaded from: classes.dex */
public class l extends Dialog implements androidx.lifecycle.p, q, z1.c {

    /* renamed from: a  reason: collision with root package name */
    public androidx.lifecycle.q f1814a;

    /* renamed from: b  reason: collision with root package name */
    public final z1.b f1815b;
    public final OnBackPressedDispatcher c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.g.e(context, "context");
        this.f1815b = new z1.b(this);
        this.c = new OnBackPressedDispatcher(new k(this, 0));
    }

    public static void n(l this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.g.e(view, "view");
        o();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.p
    public final Lifecycle getLifecycle() {
        androidx.lifecycle.q qVar = this.f1814a;
        if (qVar == null) {
            androidx.lifecycle.q qVar2 = new androidx.lifecycle.q(this);
            this.f1814a = qVar2;
            return qVar2;
        }
        return qVar;
    }

    @Override // androidx.activity.q
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override // z1.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.f1815b.f32217b;
    }

    public final void o() {
        Window window = getWindow();
        kotlin.jvm.internal.g.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.g.d(decorView, "window!!.decorView");
        t0.q0(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.g.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.g.d(decorView2, "window!!.decorView");
        s.t0(decorView2, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.g.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.g.d(decorView3, "window!!.decorView");
        t0.r0(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.g.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.c;
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.f1791e = onBackInvokedDispatcher;
            onBackPressedDispatcher.d();
        }
        this.f1815b.b(bundle);
        androidx.lifecycle.q qVar = this.f1814a;
        if (qVar == null) {
            qVar = new androidx.lifecycle.q(this);
            this.f1814a = qVar;
        }
        qVar.f(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.g.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f1815b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        androidx.lifecycle.q qVar = this.f1814a;
        if (qVar == null) {
            qVar = new androidx.lifecycle.q(this);
            this.f1814a = qVar;
        }
        qVar.f(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.q qVar = this.f1814a;
        if (qVar == null) {
            qVar = new androidx.lifecycle.q(this);
            this.f1814a = qVar;
        }
        qVar.f(Lifecycle.Event.ON_DESTROY);
        this.f1814a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        o();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        o();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.g.e(view, "view");
        o();
        super.setContentView(view, layoutParams);
    }
}
