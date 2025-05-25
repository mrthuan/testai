package l;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import l.s;
import q.a;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class p extends androidx.activity.l implements c {

    /* renamed from: d  reason: collision with root package name */
    public f f20357d;

    /* renamed from: e  reason: collision with root package name */
    public final o f20358e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968996(0x7f0401a4, float:1.7546661E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            l.o r2 = new l.o
            r2.<init>()
            r4.f20358e = r2
            l.e r2 = r4.p()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            l.f r5 = (l.f) r5
            r5.U = r6
            r2.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.p.<init>(android.content.Context, int):void");
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p().c(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        p().q();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return x0.g.b(this.f20358e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i10) {
        return (T) p().f(i10);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        p().m();
    }

    @Override // androidx.activity.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        p().l();
        super.onCreate(bundle);
        p().p();
    }

    @Override // androidx.activity.l, android.app.Dialog
    public void onStop() {
        super.onStop();
        p().v();
    }

    @Override // l.c
    public final q.a onWindowStartingSupportActionMode(a.InterfaceC0365a interfaceC0365a) {
        return null;
    }

    public final e p() {
        if (this.f20357d == null) {
            s.a aVar = e.f20282a;
            this.f20357d = new f(getContext(), getWindow(), this, this);
        }
        return this.f20357d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.l, android.app.Dialog
    public void setContentView(int i10) {
        p().y(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        p().E(charSequence);
    }

    @Override // androidx.activity.l, android.app.Dialog
    public void setContentView(View view) {
        p().z(view);
    }

    @Override // androidx.activity.l, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p().A(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        super.setTitle(i10);
        p().E(getContext().getString(i10));
    }

    @Override // l.c
    public final void onSupportActionModeFinished(q.a aVar) {
    }

    @Override // l.c
    public final void onSupportActionModeStarted(q.a aVar) {
    }
}
