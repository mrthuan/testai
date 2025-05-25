package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.l;
import b9.c;
import java.util.Locale;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: e  reason: collision with root package name */
    public final ListPopupWindow f13002e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f13003f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f13004g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13005h;

    /* renamed from: i  reason: collision with root package name */
    public final float f13006i;

    /* renamed from: j  reason: collision with root package name */
    public int f13007j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f13008k;

    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            Object item;
            int selectedItemPosition;
            View view2 = null;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i10 < 0) {
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f13002e;
                if (!listPopupWindow.a()) {
                    item = null;
                } else {
                    item = listPopupWindow.c.getSelectedItem();
                }
            } else {
                item = materialAutoCompleteTextView.getAdapter().getItem(i10);
            }
            MaterialAutoCompleteTextView.a(materialAutoCompleteTextView, item);
            AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
            ListPopupWindow listPopupWindow2 = materialAutoCompleteTextView.f13002e;
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    if (listPopupWindow2.a()) {
                        view2 = listPopupWindow2.c.getSelectedView();
                    }
                    view = view2;
                    if (!listPopupWindow2.a()) {
                        selectedItemPosition = -1;
                    } else {
                        selectedItemPosition = listPopupWindow2.c.getSelectedItemPosition();
                    }
                    i10 = selectedItemPosition;
                    if (!listPopupWindow2.a()) {
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = listPopupWindow2.c.getSelectedItemId();
                    }
                }
                onItemClickListener.onItemClick(listPopupWindow2.c, view, i10, j10);
            }
            listPopupWindow2.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    public class b<T> extends ArrayAdapter<String> {

        /* renamed from: a  reason: collision with root package name */
        public ColorStateList f13010a;

        /* renamed from: b  reason: collision with root package name */
        public ColorStateList f13011b;

        public b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            b();
        }

        public final void b() {
            boolean z10;
            ColorStateList colorStateList;
            boolean z11;
            boolean z12;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            ColorStateList colorStateList2 = materialAutoCompleteTextView.f13008k;
            if (colorStateList2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ColorStateList colorStateList3 = null;
            if (!z10) {
                colorStateList = null;
            } else {
                int[] iArr = {16842919};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f13011b = colorStateList;
            if (materialAutoCompleteTextView.f13007j != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (materialAutoCompleteTextView.f13008k != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int[] iArr2 = {16843623, -16842919};
                    int[] iArr3 = {16842913, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{o0.a.c(materialAutoCompleteTextView.f13008k.getColorForState(iArr3, 0), materialAutoCompleteTextView.f13007j), o0.a.c(materialAutoCompleteTextView.f13008k.getColorForState(iArr2, 0), materialAutoCompleteTextView.f13007j), materialAutoCompleteTextView.f13007j});
                }
            }
            this.f13010a = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            boolean z10;
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                RippleDrawable rippleDrawable = null;
                if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText())) {
                    if (materialAutoCompleteTextView.f13007j != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.f13007j);
                        if (this.f13011b != null) {
                            a.b.h(colorDrawable, this.f13010a);
                            rippleDrawable = new RippleDrawable(this.f13011b, colorDrawable, null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f13003f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f13002e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.C) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f13006i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f13007j;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f13008k;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.C && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13002e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int selectedItemPosition;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f13002e;
                if (!listPopupWindow.a()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = listPopupWindow.c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable background = listPopupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.f13004g;
                    background.getPadding(rect);
                    i13 += rect.left + rect.right;
                }
                i12 = b10.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean z11;
        AccessibilityManager accessibilityManager = this.f13003f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.f13002e.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f13002e;
        if (listPopupWindow != null) {
            listPopupWindow.h(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f13002e.f2328q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.r();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f13007j = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f13008k = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z10;
        AccessibilityManager accessibilityManager = this.f13003f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f13002e.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f13005h, strArr));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 0), attributeSet, i10);
        this.f13004g = new Rect();
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16503x, i10, 2132017969, new int[0]);
        if (d10.hasValue(0) && d10.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f13005h = d10.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f13006i = d10.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f13007j = d10.getColor(3, 0);
        this.f13008k = c.a(context2, d10, 4);
        this.f13003f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f13002e = listPopupWindow;
        listPopupWindow.f2336y = true;
        l lVar = listPopupWindow.f2337z;
        lVar.setFocusable(true);
        listPopupWindow.f2326o = this;
        lVar.setInputMethodMode(2);
        listPopupWindow.n(getAdapter());
        listPopupWindow.f2327p = new a();
        if (d10.hasValue(5)) {
            setSimpleItems(d10.getResourceId(5, 0));
        }
        d10.recycle();
    }
}
