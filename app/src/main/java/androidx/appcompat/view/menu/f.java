package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.e;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e.d f2040a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuItem f2041b;
    public final /* synthetic */ h c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.c f2042d;

    public f(e.c cVar, e.d dVar, j jVar, h hVar) {
        this.f2042d = cVar;
        this.f2040a = dVar;
        this.f2041b = jVar;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.d dVar = this.f2040a;
        if (dVar != null) {
            e.c cVar = this.f2042d;
            e.this.A = true;
            dVar.f2039b.c(false);
            e.this.A = false;
        }
        MenuItem menuItem = this.f2041b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.c.q(menuItem, null, 4);
        }
    }
}
