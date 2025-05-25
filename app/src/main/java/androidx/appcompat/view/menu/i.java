package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
public final class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* renamed from: a  reason: collision with root package name */
    public final h f2074a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.appcompat.app.b f2075b;
    public g c;

    public i(h hVar) {
        this.f2074a = hVar;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final void b(h hVar, boolean z10) {
        androidx.appcompat.app.b bVar;
        if ((z10 || hVar == this.f2074a) && (bVar = this.f2075b) != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final boolean c(h hVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        g gVar = this.c;
        if (gVar.f2047f == null) {
            gVar.f2047f = new g.a();
        }
        this.f2074a.q(gVar.f2047f.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.b(this.f2074a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        h hVar = this.f2074a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f2075b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f2075b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                hVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return hVar.performShortcut(i10, keyEvent, 0);
    }
}
