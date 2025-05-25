package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import java.util.Objects;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: DialogFragment.java */
/* loaded from: classes.dex */
public class m extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler Y;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3857h0;

    /* renamed from: j0  reason: collision with root package name */
    public Dialog f3859j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f3860k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f3861l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f3862m0;
    public final a Z = new a();

    /* renamed from: a0  reason: collision with root package name */
    public final b f3850a0 = new b();

    /* renamed from: b0  reason: collision with root package name */
    public final c f3851b0 = new c();

    /* renamed from: c0  reason: collision with root package name */
    public int f3852c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public int f3853d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f3854e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f3855f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public int f3856g0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public final d f3858i0 = new d();

    /* renamed from: n0  reason: collision with root package name */
    public boolean f3863n0 = false;

    /* compiled from: DialogFragment.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            m mVar = m.this;
            mVar.f3851b0.onDismiss(mVar.f3859j0);
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            m mVar = m.this;
            Dialog dialog = mVar.f3859j0;
            if (dialog != null) {
                mVar.onCancel(dialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            m mVar = m.this;
            Dialog dialog = mVar.f3859j0;
            if (dialog != null) {
                mVar.onDismiss(dialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.x<androidx.lifecycle.p> {
        public d() {
        }

        @Override // androidx.lifecycle.x
        @SuppressLint({"SyntheticAccessor"})
        public final void m(androidx.lifecycle.p pVar) {
            if (pVar != null) {
                m mVar = m.this;
                if (mVar.f3855f0) {
                    View h02 = mVar.h0();
                    if (h02.getParent() == null) {
                        if (mVar.f3859j0 != null) {
                            if (g0.J(3)) {
                                Objects.toString(mVar.f3859j0);
                            }
                            mVar.f3859j0.setContentView(h02);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* loaded from: classes.dex */
    public class e extends w {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ w f3868d;

        public e(Fragment.c cVar) {
            this.f3868d = cVar;
        }

        @Override // androidx.fragment.app.w
        public final View F(int i10) {
            w wVar = this.f3868d;
            if (wVar.H()) {
                return wVar.F(i10);
            }
            Dialog dialog = m.this.f3859j0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        @Override // androidx.fragment.app.w
        public final boolean H() {
            if (!this.f3868d.H() && !m.this.f3863n0) {
                return false;
            }
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public final void H(Bundle bundle) {
        this.F = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void L(Context context) {
        super.L(context);
        this.R.f(this.f3858i0);
        if (!this.f3862m0) {
            this.f3861l0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M(Bundle bundle) {
        boolean z10;
        super.M(bundle);
        this.Y = new Handler();
        if (this.f3691x == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3855f0 = z10;
        if (bundle != null) {
            this.f3852c0 = bundle.getInt("android:style", 0);
            this.f3853d0 = bundle.getInt("android:theme", 0);
            this.f3854e0 = bundle.getBoolean("android:cancelable", true);
            this.f3855f0 = bundle.getBoolean("android:showsDialog", this.f3855f0);
            this.f3856g0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void P() {
        this.F = true;
        Dialog dialog = this.f3859j0;
        if (dialog != null) {
            this.f3860k0 = true;
            dialog.setOnDismissListener(null);
            this.f3859j0.dismiss();
            if (!this.f3861l0) {
                onDismiss(this.f3859j0);
            }
            this.f3859j0 = null;
            this.f3863n0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Q() {
        this.F = true;
        if (!this.f3862m0 && !this.f3861l0) {
            this.f3861l0 = true;
        }
        this.R.i(this.f3858i0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:12:0x0018, B:14:0x0024, B:24:0x003c, B:26:0x0044, B:27:0x004b, B:20:0x002e, B:22:0x0034, B:23:0x0039, B:28:0x0063), top: B:44:0x0018 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater R(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = super.R(r7)
            boolean r0 = r6.f3855f0
            r1 = 2
            if (r0 == 0) goto L83
            boolean r2 = r6.f3857h0
            if (r2 == 0) goto Lf
            goto L83
        Lf:
            if (r0 != 0) goto L12
            goto L6d
        L12:
            boolean r0 = r6.f3863n0
            if (r0 != 0) goto L6d
            r0 = 0
            r2 = 1
            r6.f3857h0 = r2     // Catch: java.lang.Throwable -> L69
            android.app.Dialog r3 = r6.q0()     // Catch: java.lang.Throwable -> L69
            r6.f3859j0 = r3     // Catch: java.lang.Throwable -> L69
            boolean r4 = r6.f3855f0     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L63
            int r4 = r6.f3852c0     // Catch: java.lang.Throwable -> L69
            if (r4 == r2) goto L39
            if (r4 == r1) goto L39
            r5 = 3
            if (r4 == r5) goto L2e
            goto L3c
        L2e:
            android.view.Window r4 = r3.getWindow()     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L39
            r5 = 24
            r4.addFlags(r5)     // Catch: java.lang.Throwable -> L69
        L39:
            r3.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L69
        L3c:
            android.content.Context r3 = r6.r()     // Catch: java.lang.Throwable -> L69
            boolean r4 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L4b
            android.app.Dialog r4 = r6.f3859j0     // Catch: java.lang.Throwable -> L69
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L69
            r4.setOwnerActivity(r3)     // Catch: java.lang.Throwable -> L69
        L4b:
            android.app.Dialog r3 = r6.f3859j0     // Catch: java.lang.Throwable -> L69
            boolean r4 = r6.f3854e0     // Catch: java.lang.Throwable -> L69
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L69
            android.app.Dialog r3 = r6.f3859j0     // Catch: java.lang.Throwable -> L69
            androidx.fragment.app.m$b r4 = r6.f3850a0     // Catch: java.lang.Throwable -> L69
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L69
            android.app.Dialog r3 = r6.f3859j0     // Catch: java.lang.Throwable -> L69
            androidx.fragment.app.m$c r4 = r6.f3851b0     // Catch: java.lang.Throwable -> L69
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L69
            r6.f3863n0 = r2     // Catch: java.lang.Throwable -> L69
            goto L66
        L63:
            r2 = 0
            r6.f3859j0 = r2     // Catch: java.lang.Throwable -> L69
        L66:
            r6.f3857h0 = r0
            goto L6d
        L69:
            r7 = move-exception
            r6.f3857h0 = r0
            throw r7
        L6d:
            boolean r0 = androidx.fragment.app.g0.J(r1)
            if (r0 == 0) goto L76
            r6.toString()
        L76:
            android.app.Dialog r0 = r6.f3859j0
            if (r0 == 0) goto L82
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r7 = r7.cloneInContext(r0)
        L82:
            return r7
        L83:
            boolean r0 = androidx.fragment.app.g0.J(r1)
            if (r0 == 0) goto L8c
            r6.toString()
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.R(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.Fragment
    public void X(Bundle bundle) {
        Dialog dialog = this.f3859j0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f3852c0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f3853d0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f3854e0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f3855f0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f3856g0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.F = true;
        Dialog dialog = this.f3859j0;
        if (dialog != null) {
            this.f3860k0 = false;
            dialog.show();
            View decorView = this.f3859j0.getWindow().getDecorView();
            pdf.pdfreader.viewer.editor.free.utils.t0.q0(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            pdf.pdfreader.viewer.editor.free.utils.t0.r0(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Z() {
        this.F = true;
        Dialog dialog = this.f3859j0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void c0(Bundle bundle) {
        Bundle bundle2;
        this.F = true;
        if (this.f3859j0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3859j0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void e0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.e0(layoutInflater, viewGroup, bundle);
        if (this.H == null && this.f3859j0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f3859j0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final w m() {
        return new e(new Fragment.c());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3860k0) {
            if (g0.J(3)) {
                toString();
            }
            p0(true, true);
        }
    }

    public final void p0(boolean z10, boolean z11) {
        if (this.f3861l0) {
            return;
        }
        this.f3861l0 = true;
        this.f3862m0 = false;
        Dialog dialog = this.f3859j0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f3859j0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.Y.getLooper()) {
                    onDismiss(this.f3859j0);
                } else {
                    this.Y.post(this.Z);
                }
            }
        }
        this.f3860k0 = true;
        if (this.f3856g0 >= 0) {
            g0 u7 = u();
            int i10 = this.f3856g0;
            if (i10 >= 0) {
                u7.w(new g0.n(i10), z10);
                this.f3856g0 = -1;
                return;
            }
            throw new IllegalArgumentException(b.a.c("Bad id: ", i10));
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(u());
        aVar.f3911o = true;
        aVar.m(this);
        if (z10) {
            aVar.g();
        } else {
            aVar.h(false);
        }
    }

    public Dialog q0() {
        if (g0.J(3)) {
            toString();
        }
        return new androidx.activity.l(g0(), this.f3853d0);
    }

    public final Dialog r0() {
        Dialog dialog = this.f3859j0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
