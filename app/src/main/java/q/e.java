package q;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;
import q.a;
import y.i;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29006a;

    /* renamed from: b  reason: collision with root package name */
    public final q.a f29007b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0365a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f29008a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f29009b;
        public final ArrayList<e> c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final i<Menu, Menu> f29010d = new i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f29009b = context;
            this.f29008a = callback;
        }

        @Override // q.a.InterfaceC0365a
        public final void a(q.a aVar) {
            this.f29008a.onDestroyActionMode(e(aVar));
        }

        @Override // q.a.InterfaceC0365a
        public final boolean b(q.a aVar, androidx.appcompat.view.menu.h hVar) {
            e e10 = e(aVar);
            i<Menu, Menu> iVar = this.f29010d;
            Menu orDefault = iVar.getOrDefault(hVar, null);
            if (orDefault == null) {
                orDefault = new p(this.f29009b, hVar);
                iVar.put(hVar, orDefault);
            }
            return this.f29008a.onPrepareActionMode(e10, orDefault);
        }

        @Override // q.a.InterfaceC0365a
        public final boolean c(q.a aVar, MenuItem menuItem) {
            return this.f29008a.onActionItemClicked(e(aVar), new k(this.f29009b, (q0.b) menuItem));
        }

        @Override // q.a.InterfaceC0365a
        public final boolean d(q.a aVar, androidx.appcompat.view.menu.h hVar) {
            e e10 = e(aVar);
            i<Menu, Menu> iVar = this.f29010d;
            Menu orDefault = iVar.getOrDefault(hVar, null);
            if (orDefault == null) {
                orDefault = new p(this.f29009b, hVar);
                iVar.put(hVar, orDefault);
            }
            return this.f29008a.onCreateActionMode(e10, orDefault);
        }

        public final e e(q.a aVar) {
            ArrayList<e> arrayList = this.c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = arrayList.get(i10);
                if (eVar != null && eVar.f29007b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f29009b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, q.a aVar) {
        this.f29006a = context;
        this.f29007b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f29007b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f29007b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new p(this.f29006a, this.f29007b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f29007b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f29007b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f29007b.f28994a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f29007b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f29007b.f28995b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f29007b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f29007b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f29007b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f29007b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f29007b.f28994a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f29007b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f29007b.p(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f29007b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f29007b.n(i10);
    }
}
