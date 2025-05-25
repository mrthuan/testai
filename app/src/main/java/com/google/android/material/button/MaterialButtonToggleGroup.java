package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import f9.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import w8.w;
import x0.f0;
import x0.h;
import x0.n0;
import y0.f;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f12200k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12201a;

    /* renamed from: b  reason: collision with root package name */
    public final e f12202b;
    public final LinkedHashSet<d> c;

    /* renamed from: d  reason: collision with root package name */
    public final a f12203d;

    /* renamed from: e  reason: collision with root package name */
    public Integer[] f12204e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12205f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12206g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12207h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12208i;

    /* renamed from: j  reason: collision with root package name */
    public HashSet f12209j;

    /* loaded from: classes2.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo == 0) {
                int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                if (compareTo2 == 0) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
                }
                return compareTo2;
            }
            return compareTo;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends x0.a {
        public b() {
        }

        @Override // x0.a
        public final void d(View view, f fVar) {
            int i10;
            this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
            int i11 = MaterialButtonToggleGroup.f12200k;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i10 = 0;
                for (int i12 = 0; i12 < materialButtonToggleGroup.getChildCount(); i12++) {
                    if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                        i10++;
                    }
                }
            }
            i10 = -1;
            fVar.i(f.c.a(0, 1, i10, false, ((MaterialButton) view).isChecked(), 1));
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final f9.a f12212e = new f9.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public final f9.d f12213a;

        /* renamed from: b  reason: collision with root package name */
        public final f9.d f12214b;
        public final f9.d c;

        /* renamed from: d  reason: collision with root package name */
        public final f9.d f12215d;

        public c(f9.d dVar, f9.d dVar2, f9.d dVar3, f9.d dVar4) {
            this.f12213a = dVar;
            this.f12214b = dVar3;
            this.c = dVar4;
            this.f12215d = dVar2;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes2.dex */
    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            materialButton.setId(f0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f12202b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton c10 = c(i10);
            int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                h.g(layoutParams, 0);
                h.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                h.h(layoutParams, 0);
            }
            c10.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            h.g(layoutParams3, 0);
            h.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f12201a.add(new c(shapeAppearanceModel.f17215e, shapeAppearanceModel.f17218h, shapeAppearanceModel.f17216f, shapeAppearanceModel.f17217g));
        materialButton.setEnabled(isEnabled());
        f0.o(materialButton, new b());
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f12209j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f12206g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f12207h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f12203d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f12204e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.f12209j;
        this.f12209j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f12205f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f12205f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z10;
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                m shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                m.a aVar = new m.a(shapeAppearanceModel);
                c cVar2 = (c) this.f12201a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f9.a aVar2 = c.f12212e;
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            if (w.e(this)) {
                                cVar = new c(aVar2, aVar2, cVar2.f12214b, cVar2.c);
                            } else {
                                cVar = new c(cVar2.f12213a, cVar2.f12215d, aVar2, aVar2);
                            }
                        } else {
                            cVar = new c(cVar2.f12213a, aVar2, cVar2.f12214b, aVar2);
                        }
                    } else if (i10 == lastVisibleChildIndex) {
                        if (z10) {
                            if (w.e(this)) {
                                cVar = new c(cVar2.f12213a, cVar2.f12215d, aVar2, aVar2);
                            } else {
                                cVar = new c(aVar2, aVar2, cVar2.f12214b, cVar2.c);
                            }
                        } else {
                            cVar = new c(aVar2, cVar2.f12215d, aVar2, cVar2.c);
                        }
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.b(0.0f);
                } else {
                    aVar.f17226e = cVar2.f12213a;
                    aVar.f17229h = cVar2.f12215d;
                    aVar.f17227f = cVar2.f12214b;
                    aVar.f17228g = cVar2.c;
                }
                c10.setShapeAppearanceModel(new m(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.f12206g && !this.f12209j.isEmpty()) {
            return ((Integer) this.f12209j.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            if (this.f12209j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f12204e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f12208i;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f12206g) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, visibleButtonCount, i10).f31967a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f12201a.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f12207h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f12206g != z10) {
            this.f12206g = z10;
            e(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setA11yClassName((this.f12206g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018259), attributeSet, i10);
        this.f12201a = new ArrayList();
        this.f12202b = new e();
        this.c = new LinkedHashSet<>();
        this.f12203d = new a();
        this.f12205f = false;
        this.f12209j = new HashSet();
        TypedArray d10 = s.d(getContext(), attributeSet, e8.a.f16505z, i10, 2132018259, new int[0]);
        setSingleSelection(d10.getBoolean(3, false));
        this.f12208i = d10.getResourceId(1, -1);
        this.f12207h = d10.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d10.getBoolean(0, true));
        d10.recycle();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(this, 1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
