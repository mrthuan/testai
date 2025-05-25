package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import com.adjust.sdk.network.ErrorCodes;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public final class g implements n, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f2043a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f2044b;
    public h c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandedMenuView f2045d;

    /* renamed from: e  reason: collision with root package name */
    public n.a f2046e;

    /* renamed from: f  reason: collision with root package name */
    public a f2047f;

    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public int f2048a = -1;

        public a() {
            b();
        }

        public final void b() {
            h hVar = g.this.c;
            j jVar = hVar.f2071v;
            if (jVar != null) {
                hVar.i();
                ArrayList<j> arrayList = hVar.f2059j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == jVar) {
                        this.f2048a = i10;
                        return;
                    }
                }
            }
            this.f2048a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public final j getItem(int i10) {
            g gVar = g.this;
            h hVar = gVar.c;
            hVar.i();
            ArrayList<j> arrayList = hVar.f2059j;
            gVar.getClass();
            int i11 = i10 + 0;
            int i12 = this.f2048a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            g gVar = g.this;
            h hVar = gVar.c;
            hVar.i();
            int size = hVar.f2059j.size();
            gVar.getClass();
            int i10 = size + 0;
            if (this.f2048a < 0) {
                return i10;
            }
            return i10 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = g.this.f2044b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((o.a) view).c(getItem(i10));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public g(Context context) {
        this.f2043a = context;
        this.f2044b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.n
    public final void b(h hVar, boolean z10) {
        n.a aVar = this.f2046e;
        if (aVar != null) {
            aVar.b(hVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void c(boolean z10) {
        a aVar = this.f2047f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void e(n.a aVar) {
        this.f2046e = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean f(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void g(Context context, h hVar) {
        if (this.f2043a != null) {
            this.f2043a = context;
            if (this.f2044b == null) {
                this.f2044b = LayoutInflater.from(context);
            }
        }
        this.c = hVar;
        a aVar = this.f2047f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2045d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean j(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        i iVar = new i(sVar);
        Context context = sVar.f2051a;
        b.a aVar = new b.a(context);
        AlertController.b bVar = aVar.f1918a;
        g gVar = new g(bVar.f1897a);
        iVar.c = gVar;
        gVar.f2046e = iVar;
        sVar.b(gVar, context);
        g gVar2 = iVar.c;
        if (gVar2.f2047f == null) {
            gVar2.f2047f = new a();
        }
        bVar.f1909n = gVar2.f2047f;
        bVar.f1910o = iVar;
        View view = sVar.f2064o;
        if (view != null) {
            bVar.f1900e = view;
        } else {
            bVar.c = sVar.f2063n;
            bVar.f1899d = sVar.f2062m;
        }
        bVar.f1907l = iVar;
        androidx.appcompat.app.b a10 = aVar.a();
        iVar.f2075b = a10;
        a10.setOnDismissListener(iVar);
        WindowManager.LayoutParams attributes = iVar.f2075b.getWindow().getAttributes();
        attributes.type = ErrorCodes.MALFORMED_URL_EXCEPTION;
        attributes.flags |= 131072;
        iVar.f2075b.show();
        n.a aVar2 = this.f2046e;
        if (aVar2 != null) {
            aVar2.c(sVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable k() {
        if (this.f2045d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f2045d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean l(j jVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.c.q(this.f2047f.getItem(i10), this, 0);
    }
}
