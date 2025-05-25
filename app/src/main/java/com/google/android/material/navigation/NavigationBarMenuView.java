package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import f8.b;
import f9.m;
import java.util.HashSet;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w0.e;
import w8.q;
import x0.f0;
import x0.n0;
import y0.f;
import y8.c;

/* loaded from: classes2.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements o {
    public static final int[] D = {16842912};
    public static final int[] E = {-16842910};
    public ColorStateList A;
    public c B;
    public h C;

    /* renamed from: a  reason: collision with root package name */
    public final f2.a f12712a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12713b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f12714d;

    /* renamed from: e  reason: collision with root package name */
    public int f12715e;

    /* renamed from: f  reason: collision with root package name */
    public NavigationBarItemView[] f12716f;

    /* renamed from: g  reason: collision with root package name */
    public int f12717g;

    /* renamed from: h  reason: collision with root package name */
    public int f12718h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f12719i;

    /* renamed from: j  reason: collision with root package name */
    public int f12720j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f12721k;

    /* renamed from: l  reason: collision with root package name */
    public final ColorStateList f12722l;

    /* renamed from: m  reason: collision with root package name */
    public int f12723m;

    /* renamed from: n  reason: collision with root package name */
    public int f12724n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f12725o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f12726p;

    /* renamed from: q  reason: collision with root package name */
    public int f12727q;

    /* renamed from: r  reason: collision with root package name */
    public final SparseArray<h8.a> f12728r;

    /* renamed from: s  reason: collision with root package name */
    public int f12729s;

    /* renamed from: t  reason: collision with root package name */
    public int f12730t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12731u;

    /* renamed from: v  reason: collision with root package name */
    public int f12732v;

    /* renamed from: w  reason: collision with root package name */
    public int f12733w;

    /* renamed from: x  reason: collision with root package name */
    public int f12734x;

    /* renamed from: y  reason: collision with root package name */
    public m f12735y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f12736z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            j itemData = ((NavigationBarItemView) view).getItemData();
            NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
            if (!navigationBarMenuView.C.q(itemData, navigationBarMenuView.B, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        this.c = new e(5);
        this.f12714d = new SparseArray<>(5);
        this.f12717g = 0;
        this.f12718h = 0;
        this.f12728r = new SparseArray<>(5);
        this.f12729s = -1;
        this.f12730t = -1;
        this.f12736z = false;
        this.f12722l = b();
        if (isInEditMode()) {
            this.f12712a = null;
        } else {
            f2.a aVar = new f2.a();
            this.f12712a = aVar;
            aVar.M(0);
            aVar.B(x8.a.c(getContext(), R.attr.motionDurationMedium4, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            aVar.D(x8.a.d(getContext(), R.attr.motionEasingStandard, b.f17142b));
            aVar.J(new q());
        }
        this.f12713b = new a();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(this, 1);
    }

    public static boolean e(int i10, int i11) {
        if (i10 != -1 ? i10 == 0 : i11 > 3) {
            return true;
        }
        return false;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.c.b();
        if (navigationBarItemView == null) {
            return d(getContext());
        }
        return navigationBarItemView;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        boolean z10;
        h8.a aVar;
        int id2 = navigationBarItemView.getId();
        if (id2 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aVar = this.f12728r.get(id2)) != null) {
            navigationBarItemView.setBadge(aVar);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        boolean z10;
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.c.a(navigationBarItemView);
                    if (navigationBarItemView.D != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ImageView imageView = navigationBarItemView.f12695m;
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            h8.a aVar = navigationBarItemView.D;
                            if (aVar != null) {
                                if (aVar.d() != null) {
                                    aVar.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar);
                                }
                            }
                        }
                        navigationBarItemView.D = null;
                    }
                    navigationBarItemView.f12700r = null;
                    navigationBarItemView.f12706x = 0.0f;
                    navigationBarItemView.f12684a = false;
                }
            }
        }
        if (this.C.size() == 0) {
            this.f12717g = 0;
            this.f12718h = 0;
            this.f12716f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            hashSet.add(Integer.valueOf(this.C.getItem(i10).getItemId()));
        }
        int i11 = 0;
        while (true) {
            SparseArray<h8.a> sparseArray = this.f12728r;
            if (i11 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i11++;
        }
        this.f12716f = new NavigationBarItemView[this.C.size()];
        boolean e10 = e(this.f12715e, this.C.l().size());
        for (int i12 = 0; i12 < this.C.size(); i12++) {
            this.B.f32094b = true;
            this.C.getItem(i12).setCheckable(true);
            this.B.f32094b = false;
            NavigationBarItemView newItem = getNewItem();
            this.f12716f[i12] = newItem;
            newItem.setIconTintList(this.f12719i);
            newItem.setIconSize(this.f12720j);
            newItem.setTextColor(this.f12722l);
            newItem.setTextAppearanceInactive(this.f12723m);
            newItem.setTextAppearanceActive(this.f12724n);
            newItem.setTextColor(this.f12721k);
            int i13 = this.f12729s;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.f12730t;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            newItem.setActiveIndicatorWidth(this.f12732v);
            newItem.setActiveIndicatorHeight(this.f12733w);
            newItem.setActiveIndicatorMarginHorizontal(this.f12734x);
            newItem.setActiveIndicatorDrawable(c());
            newItem.setActiveIndicatorResizeable(this.f12736z);
            newItem.setActiveIndicatorEnabled(this.f12731u);
            Drawable drawable = this.f12725o;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f12727q);
            }
            newItem.setItemRippleColor(this.f12726p);
            newItem.setShifting(e10);
            newItem.setLabelVisibilityMode(this.f12715e);
            j jVar = (j) this.C.getItem(i12);
            newItem.c(jVar);
            newItem.setItemPosition(i12);
            SparseArray<View.OnTouchListener> sparseArray2 = this.f12714d;
            int i15 = jVar.f2076a;
            newItem.setOnTouchListener(sparseArray2.get(i15));
            newItem.setOnClickListener(this.f12713b);
            int i16 = this.f12717g;
            if (i16 != 0 && i15 == i16) {
                this.f12718h = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.C.size() - 1, this.f12718h);
        this.f12718h = min;
        this.C.getItem(min).setChecked(true);
    }

    public final ColorStateList b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = androidx.core.content.a.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = E;
        return new ColorStateList(new int[][]{iArr, D, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    public final f9.h c() {
        if (this.f12735y != null && this.A != null) {
            f9.h hVar = new f9.h(this.f12735y);
            hVar.n(this.A);
            return hVar;
        }
        return null;
    }

    public abstract NavigationBarItemView d(Context context);

    @Override // androidx.appcompat.view.menu.o
    public final void g(h hVar) {
        this.C = hVar;
    }

    public SparseArray<h8.a> getBadgeDrawables() {
        return this.f12728r;
    }

    public ColorStateList getIconTintList() {
        return this.f12719i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.A;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f12731u;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f12733w;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f12734x;
    }

    public m getItemActiveIndicatorShapeAppearance() {
        return this.f12735y;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f12732v;
    }

    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null && navigationBarItemViewArr.length > 0) {
            return navigationBarItemViewArr[0].getBackground();
        }
        return this.f12725o;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f12727q;
    }

    public int getItemIconSize() {
        return this.f12720j;
    }

    public int getItemPaddingBottom() {
        return this.f12730t;
    }

    public int getItemPaddingTop() {
        return this.f12729s;
    }

    public ColorStateList getItemRippleColor() {
        return this.f12726p;
    }

    public int getItemTextAppearanceActive() {
        return this.f12724n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f12723m;
    }

    public ColorStateList getItemTextColor() {
        return this.f12721k;
    }

    public int getLabelVisibilityMode() {
        return this.f12715e;
    }

    public h getMenu() {
        return this.C;
    }

    public int getSelectedItemId() {
        return this.f12717g;
    }

    public int getSelectedItemPosition() {
        return this.f12718h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, this.C.l().size(), 1).f31967a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f12719i = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(c());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f12731u = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f12733w = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f12734x = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.f12736z = z10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(m mVar) {
        this.f12735y = mVar;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(c());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f12732v = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f12725o = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f12727q = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f12720j = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f12730t = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f12729s = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f12726p = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f12724n = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f12721k;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f12723m = i10;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f12721k;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f12721k = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f12716f;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f12715e = i10;
    }

    public void setPresenter(c cVar) {
        this.B = cVar;
    }
}
