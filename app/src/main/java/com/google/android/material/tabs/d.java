package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import d9.g;
import java.lang.ref.WeakReference;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;

/* compiled from: TabLayoutMediator.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final TabLayout f12993a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f12994b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.Adapter<?> f12995d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12996e;

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            d.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            d.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i10, int i11, Object obj) {
            d.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i10, int i11) {
            d.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i10, int i11) {
            d.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            d.this.a();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes2.dex */
    public static class c extends ViewPager2.g {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f12998a;
        public int c = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f12999b = 0;

        public c(TabLayout tabLayout) {
            this.f12998a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i10) {
            this.f12999b = this.c;
            this.c = i10;
            TabLayout tabLayout = this.f12998a.get();
            if (tabLayout != null) {
                tabLayout.U = this.c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void b(int i10, float f10, int i11) {
            boolean z10;
            boolean z11;
            TabLayout tabLayout = this.f12998a.get();
            if (tabLayout != null) {
                int i12 = this.c;
                if (i12 == 2 && this.f12999b != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i12 == 2 && this.f12999b == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tabLayout.n(i10, f10, z10, z11, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f12998a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.c;
                if (i11 != 0 && (i11 != 2 || this.f12999b != 0)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                tabLayout.l(tabLayout.h(i10), z10);
            }
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, g gVar) {
        this.f12993a = tabLayout;
        this.f12994b = viewPager2;
        this.c = gVar;
    }

    public final void a() {
        TabLayout tabLayout = this.f12993a;
        tabLayout.k();
        RecyclerView.Adapter<?> adapter = this.f12995d;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.g i11 = tabLayout.i();
                String[] strArr = (String[]) ((g) this.c).f16160b;
                boolean z10 = ReaderDebugActivity.f27826e;
                kotlin.jvm.internal.g.e(strArr, ea.a.p("TXQlYhxpH2wtTA9zdA==", "ULiDHkrr"));
                ea.a.p("R2Fi", "Pp0CXiz3");
                i11.a(strArr[i10]);
                tabLayout.b(i11, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f12994b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.l(tabLayout.h(min), true);
                }
            }
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* renamed from: com.google.android.material.tabs.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0173d implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager2 f13000a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13001b;

        public C0173d(ViewPager2 viewPager2, boolean z10) {
            this.f13000a = viewPager2;
            this.f13001b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(TabLayout.g gVar) {
            this.f13000a.i(gVar.f12980d, this.f13001b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c() {
        }
    }
}
