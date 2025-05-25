package w8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: NavigationMenuPresenter.java */
/* loaded from: classes2.dex */
public final class i implements androidx.appcompat.view.menu.n {

    /* renamed from: a  reason: collision with root package name */
    public NavigationMenuView f31004a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f31005b;
    public androidx.appcompat.view.menu.h c;

    /* renamed from: d  reason: collision with root package name */
    public int f31006d;

    /* renamed from: e  reason: collision with root package name */
    public c f31007e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f31008f;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f31010h;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f31012j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f31013k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f31014l;

    /* renamed from: m  reason: collision with root package name */
    public RippleDrawable f31015m;

    /* renamed from: n  reason: collision with root package name */
    public int f31016n;

    /* renamed from: o  reason: collision with root package name */
    public int f31017o;

    /* renamed from: p  reason: collision with root package name */
    public int f31018p;

    /* renamed from: q  reason: collision with root package name */
    public int f31019q;

    /* renamed from: r  reason: collision with root package name */
    public int f31020r;

    /* renamed from: s  reason: collision with root package name */
    public int f31021s;

    /* renamed from: t  reason: collision with root package name */
    public int f31022t;

    /* renamed from: u  reason: collision with root package name */
    public int f31023u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f31024v;

    /* renamed from: x  reason: collision with root package name */
    public int f31026x;

    /* renamed from: y  reason: collision with root package name */
    public int f31027y;

    /* renamed from: z  reason: collision with root package name */
    public int f31028z;

    /* renamed from: g  reason: collision with root package name */
    public int f31009g = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f31011i = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f31025w = true;
    public int A = -1;
    public final a B = new a();

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            i iVar = i.this;
            c cVar = iVar.f31007e;
            boolean z10 = true;
            if (cVar != null) {
                cVar.f31032f = true;
            }
            androidx.appcompat.view.menu.j itemData = navigationMenuItemView.getItemData();
            boolean q5 = iVar.c.q(itemData, iVar, 0);
            if (itemData != null && itemData.isCheckable() && q5) {
                iVar.f31007e.i(itemData);
            } else {
                z10 = false;
            }
            c cVar2 = iVar.f31007e;
            if (cVar2 != null) {
                cVar2.f31032f = false;
            }
            if (z10) {
                iVar.c(false);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public static class b extends l {
        public b(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public class c extends RecyclerView.Adapter<l> {

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<e> f31030d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public androidx.appcompat.view.menu.j f31031e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f31032f;

        public c() {
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f31030d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i10) {
            e eVar = this.f31030d.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                if (((g) eVar).f31036a.hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public final void h() {
            boolean z10;
            if (this.f31032f) {
                return;
            }
            this.f31032f = true;
            ArrayList<e> arrayList = this.f31030d;
            arrayList.clear();
            arrayList.add(new d());
            i iVar = i.this;
            int size = iVar.c.l().size();
            boolean z11 = false;
            int i10 = -1;
            int i11 = 0;
            boolean z12 = false;
            int i12 = 0;
            while (i11 < size) {
                androidx.appcompat.view.menu.j jVar = iVar.c.l().get(i11);
                if (jVar.isChecked()) {
                    i(jVar);
                }
                if (jVar.isCheckable()) {
                    jVar.f(z11);
                }
                if (jVar.hasSubMenu()) {
                    androidx.appcompat.view.menu.s sVar = jVar.f2089o;
                    if (sVar.hasVisibleItems()) {
                        if (i11 != 0) {
                            arrayList.add(new f(iVar.f31028z, z11 ? 1 : 0));
                        }
                        arrayList.add(new g(jVar));
                        int size2 = sVar.size();
                        int i13 = z11 ? 1 : 0;
                        int i14 = i13;
                        while (i13 < size2) {
                            androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) sVar.getItem(i13);
                            if (jVar2.isVisible()) {
                                if (i14 == 0 && jVar2.getIcon() != null) {
                                    i14 = 1;
                                }
                                if (jVar2.isCheckable()) {
                                    jVar2.f(z11);
                                }
                                if (jVar.isChecked()) {
                                    i(jVar);
                                }
                                arrayList.add(new g(jVar2));
                            }
                            i13++;
                            z11 = false;
                        }
                        if (i14 != 0) {
                            int size3 = arrayList.size();
                            for (int size4 = arrayList.size(); size4 < size3; size4++) {
                                ((g) arrayList.get(size4)).f31037b = true;
                            }
                        }
                    }
                    z10 = true;
                } else {
                    int i15 = jVar.f2077b;
                    if (i15 != i10) {
                        i12 = arrayList.size();
                        if (jVar.getIcon() != null) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i11 != 0) {
                            i12++;
                            int i16 = iVar.f31028z;
                            arrayList.add(new f(i16, i16));
                        }
                    } else if (!z12 && jVar.getIcon() != null) {
                        int size5 = arrayList.size();
                        for (int i17 = i12; i17 < size5; i17++) {
                            ((g) arrayList.get(i17)).f31037b = true;
                        }
                        z10 = true;
                        z12 = true;
                        g gVar = new g(jVar);
                        gVar.f31037b = z12;
                        arrayList.add(gVar);
                        i10 = i15;
                    }
                    z10 = true;
                    g gVar2 = new g(jVar);
                    gVar2.f31037b = z12;
                    arrayList.add(gVar2);
                    i10 = i15;
                }
                i11++;
                z11 = false;
            }
            this.f31032f = z11 ? 1 : 0;
        }

        public final void i(androidx.appcompat.view.menu.j jVar) {
            if (this.f31031e != jVar && jVar.isCheckable()) {
                androidx.appcompat.view.menu.j jVar2 = this.f31031e;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f31031e = jVar;
                jVar.setChecked(true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(l lVar, int i10) {
            Drawable drawable;
            l lVar2 = lVar;
            int itemViewType = getItemViewType(i10);
            ArrayList<e> arrayList = this.f31030d;
            i iVar = i.this;
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        if (itemViewType == 3) {
                            f0.o(lVar2.itemView, new w8.j(this, i10, true));
                            return;
                        }
                        return;
                    }
                    f fVar = (f) arrayList.get(i10);
                    lVar2.itemView.setPadding(iVar.f31020r, fVar.f31034a, iVar.f31021s, fVar.f31035b);
                    return;
                }
                TextView textView = (TextView) lVar2.itemView;
                textView.setText(((g) arrayList.get(i10)).f31036a.f2079e);
                int i11 = iVar.f31009g;
                if (i11 != 0) {
                    textView.setTextAppearance(i11);
                }
                textView.setPadding(iVar.f31022t, textView.getPaddingTop(), iVar.f31023u, textView.getPaddingBottom());
                ColorStateList colorStateList = iVar.f31010h;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                f0.o(textView, new w8.j(this, i10, true));
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.itemView;
            navigationMenuItemView.setIconTintList(iVar.f31013k);
            int i12 = iVar.f31011i;
            if (i12 != 0) {
                navigationMenuItemView.setTextAppearance(i12);
            }
            ColorStateList colorStateList2 = iVar.f31012j;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable2 = iVar.f31014l;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.q(navigationMenuItemView, drawable);
            RippleDrawable rippleDrawable = iVar.f31015m;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) arrayList.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f31037b);
            int i13 = iVar.f31016n;
            int i14 = iVar.f31017o;
            navigationMenuItemView.setPadding(i13, i14, i13, i14);
            navigationMenuItemView.setIconPadding(iVar.f31018p);
            if (iVar.f31024v) {
                navigationMenuItemView.setIconSize(iVar.f31019q);
            }
            navigationMenuItemView.setMaxLines(iVar.f31026x);
            navigationMenuItemView.c(gVar.f31036a);
            f0.o(navigationMenuItemView, new w8.j(this, i10, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final l onCreateViewHolder(ViewGroup viewGroup, int i10) {
            l c0389i;
            i iVar = i.this;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return null;
                        }
                        return new b(iVar.f31005b);
                    }
                    c0389i = new j(iVar.f31008f, viewGroup);
                } else {
                    c0389i = new k(iVar.f31008f, viewGroup);
                }
            } else {
                c0389i = new C0389i(iVar.f31008f, viewGroup, iVar.B);
            }
            return c0389i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(l lVar) {
            l lVar2 = lVar;
            if (lVar2 instanceof C0389i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.itemView;
                FrameLayout frameLayout = navigationMenuItemView.f12609z;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.f12608y.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public static class d implements e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public interface e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f31034a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31035b;

        public f(int i10, int i11) {
            this.f31034a = i10;
            this.f31035b = i11;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.j f31036a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f31037b;

        public g(androidx.appcompat.view.menu.j jVar) {
            this.f31036a = jVar;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public class h extends androidx.recyclerview.widget.f0 {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        @Override // androidx.recyclerview.widget.f0, x0.a
        public final void d(View view, y0.f fVar) {
            int i10;
            int i11;
            super.d(view, fVar);
            i iVar = i.this;
            if (iVar.f31005b.getChildCount() == 0) {
                i10 = 0;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 1;
            }
            while (i10 < iVar.f31007e.getItemCount()) {
                int itemViewType = iVar.f31007e.getItemViewType(i10);
                if (itemViewType == 0 || itemViewType == 1) {
                    i11++;
                }
                i10++;
            }
            fVar.f31951a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i11, 1, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: w8.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0389i extends l {
        public C0389i(LayoutInflater layoutInflater, ViewGroup viewGroup, a aVar) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(aVar);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    public static abstract class l extends RecyclerView.b0 {
    }

    @Override // androidx.appcompat.view.menu.n
    public final void c(boolean z10) {
        c cVar = this.f31007e;
        if (cVar != null) {
            cVar.h();
            cVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean f(androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void g(Context context, androidx.appcompat.view.menu.h hVar) {
        this.f31008f = LayoutInflater.from(context);
        this.c = hVar;
        this.f31028z = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.n
    public final int getId() {
        return this.f31006d;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void h(Parcelable parcelable) {
        androidx.appcompat.view.menu.j jVar;
        View actionView;
        w8.l lVar;
        androidx.appcompat.view.menu.j jVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f31004a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f31007e;
                cVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                ArrayList<e> arrayList = cVar.f31030d;
                if (i10 != 0) {
                    cVar.f31032f = true;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        e eVar = arrayList.get(i11);
                        if ((eVar instanceof g) && (jVar2 = ((g) eVar).f31036a) != null && jVar2.f2076a == i10) {
                            cVar.i(jVar2);
                            break;
                        }
                        i11++;
                    }
                    cVar.f31032f = false;
                    cVar.h();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        e eVar2 = arrayList.get(i12);
                        if ((eVar2 instanceof g) && (jVar = ((g) eVar2).f31036a) != null && (actionView = jVar.getActionView()) != null && (lVar = (w8.l) sparseParcelableArray2.get(jVar.f2076a)) != null) {
                            actionView.restoreHierarchyState(lVar);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f31005b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean j(androidx.appcompat.view.menu.s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable k() {
        View view;
        Bundle bundle = new Bundle();
        if (this.f31004a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f31004a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f31007e;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.j jVar = cVar.f31031e;
            if (jVar != null) {
                bundle2.putInt("android:menu:checked", jVar.f2076a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList<e> arrayList = cVar.f31030d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.j jVar2 = ((g) eVar).f31036a;
                    if (jVar2 != null) {
                        view = jVar2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        w8.l lVar = new w8.l();
                        view.saveHierarchyState(lVar);
                        sparseArray2.put(jVar2.f2076a, lVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f31005b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f31005b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean l(androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void b(androidx.appcompat.view.menu.h hVar, boolean z10) {
    }
}
