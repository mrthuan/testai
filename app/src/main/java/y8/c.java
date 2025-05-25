package y8;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.s;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import f2.o;
import h8.b;
import w8.l;

/* compiled from: NavigationBarPresenter.java */
/* loaded from: classes2.dex */
public final class c implements n {

    /* renamed from: a  reason: collision with root package name */
    public NavigationBarMenuView f32093a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32094b = false;
    public int c;

    /* compiled from: NavigationBarPresenter.java */
    /* loaded from: classes2.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0419a();

        /* renamed from: a  reason: collision with root package name */
        public int f32095a;

        /* renamed from: b  reason: collision with root package name */
        public l f32096b;

        /* compiled from: NavigationBarPresenter.java */
        /* renamed from: y8.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0419a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
        }

        public a(Parcel parcel) {
            this.f32095a = parcel.readInt();
            this.f32096b = (l) parcel.readParcelable(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f32095a);
            parcel.writeParcelable(this.f32096b, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final void c(boolean z10) {
        f2.a aVar;
        if (this.f32094b) {
            return;
        }
        if (z10) {
            this.f32093a.a();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.f32093a;
        h hVar = navigationBarMenuView.C;
        if (hVar != null && navigationBarMenuView.f12716f != null) {
            int size = hVar.size();
            if (size != navigationBarMenuView.f12716f.length) {
                navigationBarMenuView.a();
                return;
            }
            int i10 = navigationBarMenuView.f12717g;
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = navigationBarMenuView.C.getItem(i11);
                if (item.isChecked()) {
                    navigationBarMenuView.f12717g = item.getItemId();
                    navigationBarMenuView.f12718h = i11;
                }
            }
            if (i10 != navigationBarMenuView.f12717g && (aVar = navigationBarMenuView.f12712a) != null) {
                o.a(navigationBarMenuView, aVar);
            }
            boolean e10 = NavigationBarMenuView.e(navigationBarMenuView.f12715e, navigationBarMenuView.C.l().size());
            for (int i12 = 0; i12 < size; i12++) {
                navigationBarMenuView.B.f32094b = true;
                navigationBarMenuView.f12716f[i12].setLabelVisibilityMode(navigationBarMenuView.f12715e);
                navigationBarMenuView.f12716f[i12].setShifting(e10);
                navigationBarMenuView.f12716f[i12].c((j) navigationBarMenuView.C.getItem(i12));
                navigationBarMenuView.B.f32094b = false;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean f(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void g(Context context, h hVar) {
        this.f32093a.C = hVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public final int getId() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void h(Parcelable parcelable) {
        SparseArray<h8.a> sparseArray;
        if (parcelable instanceof a) {
            NavigationBarMenuView navigationBarMenuView = this.f32093a;
            a aVar = (a) parcelable;
            int i10 = aVar.f32095a;
            int size = navigationBarMenuView.C.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = navigationBarMenuView.C.getItem(i11);
                if (i10 == item.getItemId()) {
                    navigationBarMenuView.f12717g = i10;
                    navigationBarMenuView.f12718h = i11;
                    item.setChecked(true);
                    break;
                }
                i11++;
            }
            Context context = this.f32093a.getContext();
            l lVar = aVar.f32096b;
            SparseArray sparseArray2 = new SparseArray(lVar.size());
            for (int i12 = 0; i12 < lVar.size(); i12++) {
                int keyAt = lVar.keyAt(i12);
                b.a aVar2 = (b.a) lVar.valueAt(i12);
                if (aVar2 != null) {
                    sparseArray2.put(keyAt, new h8.a(context, aVar2));
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            NavigationBarMenuView navigationBarMenuView2 = this.f32093a;
            navigationBarMenuView2.getClass();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = navigationBarMenuView2.f12728r;
                if (i13 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i13);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (h8.a) sparseArray2.get(keyAt2));
                }
                i13++;
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.f12716f;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    navigationBarItemView.setBadge(sparseArray.get(navigationBarItemView.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean j(s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final Parcelable k() {
        a aVar = new a();
        aVar.f32095a = this.f32093a.getSelectedItemId();
        SparseArray<h8.a> badgeDrawables = this.f32093a.getBadgeDrawables();
        l lVar = new l();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int keyAt = badgeDrawables.keyAt(i10);
            h8.a valueAt = badgeDrawables.valueAt(i10);
            if (valueAt != null) {
                lVar.put(keyAt, valueAt.f18069e.f18078a);
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        aVar.f32096b = lVar;
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public final boolean l(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public final void b(h hVar, boolean z10) {
    }
}
