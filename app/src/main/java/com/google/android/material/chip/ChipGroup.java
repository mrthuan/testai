package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.FlowLayout;
import java.util.List;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w8.b;
import w8.s;
import x0.f0;
import x0.n0;
import y0.f;

/* loaded from: classes2.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: e  reason: collision with root package name */
    public int f12324e;

    /* renamed from: f  reason: collision with root package name */
    public int f12325f;

    /* renamed from: g  reason: collision with root package name */
    public e f12326g;

    /* renamed from: h  reason: collision with root package name */
    public final w8.b<Chip> f12327h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12328i;

    /* renamed from: j  reason: collision with root package name */
    public final f f12329j;

    /* loaded from: classes2.dex */
    public class a implements b.a {
        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements e {
        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c() {
            super(-2, -2);
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface d {
    }

    /* loaded from: classes2.dex */
    public interface e {
    }

    /* loaded from: classes2.dex */
    public class f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f12332a;

        public f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    view2.setId(f0.e.a());
                }
                w8.b<Chip> bVar = chipGroup.f12327h;
                Chip chip = (Chip) view2;
                bVar.f30991a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new w8.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f12332a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                w8.b<Chip> bVar = chipGroup.f12327h;
                Chip chip = (Chip) view2;
                bVar.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                bVar.f30991a.remove(Integer.valueOf(chip.getId()));
                bVar.f30992b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f12332a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        boolean z10;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                if (getChildAt(i11).getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10++;
                }
            }
        }
        return i10;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean a() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof c)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f12327h.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f12327h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f12324e;
    }

    public int getChipSpacingVertical() {
        return this.f12325f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f12328i;
        if (i10 != -1) {
            w8.b<Chip> bVar = this.f12327h;
            w8.f<Chip> fVar = (w8.f) bVar.f30991a.get(Integer.valueOf(i10));
            if (fVar != null && bVar.a(fVar)) {
                bVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.c) {
            i10 = getVisibleChipCount();
        } else {
            i10 = -1;
        }
        int rowCount = getRowCount();
        if (this.f12327h.f30993d) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(rowCount, i10, i11).f31967a);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f12324e != i10) {
            this.f12324e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f12325f != i10) {
            this.f12325f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b());
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f12326g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f12329j.f12332a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f12327h.f30994e = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        w8.b<Chip> bVar = this.f12327h;
        if (bVar.f30993d != z10) {
            bVar.f30993d = z10;
            boolean z11 = !bVar.f30992b.isEmpty();
            for (w8.f<Chip> fVar : bVar.f30991a.values()) {
                bVar.e(fVar, false);
            }
            if (z11) {
                bVar.d();
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018245), attributeSet, i10);
        w8.b<Chip> bVar = new w8.b<>();
        this.f12327h = bVar;
        f fVar = new f();
        this.f12329j = fVar;
        TypedArray d10 = s.d(getContext(), attributeSet, e8.a.f16489j, i10, 2132018245, new int[0]);
        int dimensionPixelOffset = d10.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d10.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d10.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d10.getBoolean(5, false));
        setSingleSelection(d10.getBoolean(6, false));
        setSelectionRequired(d10.getBoolean(4, false));
        this.f12328i = d10.getResourceId(0, -1);
        d10.recycle();
        bVar.c = new a();
        super.setOnHierarchyChangeListener(fVar);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(this, 1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
