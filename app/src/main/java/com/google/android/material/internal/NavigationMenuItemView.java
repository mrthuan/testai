package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.x0;
import b1.m;
import java.util.WeakHashMap;
import n0.f;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import y0.f;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements o.a {
    public static final int[] F = {16842912};
    public j A;
    public ColorStateList B;
    public boolean C;
    public Drawable D;
    public final a E;

    /* renamed from: v  reason: collision with root package name */
    public int f12605v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f12606w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12607x;

    /* renamed from: y  reason: collision with root package name */
    public final CheckedTextView f12608y;

    /* renamed from: z  reason: collision with root package name */
    public FrameLayout f12609z;

    /* loaded from: classes2.dex */
    public class a extends x0.a {
        public a() {
        }

        @Override // x0.a
        public final void d(View view, f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f12607x);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f12609z == null) {
                this.f12609z = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f12609z.removeAllViews();
            this.f12609z.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public final void c(j jVar) {
        int i10;
        StateListDrawable stateListDrawable;
        this.A = jVar;
        int i11 = jVar.f2076a;
        if (i11 > 0) {
            setId(i11);
        }
        if (jVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.q(this, stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.f2079e);
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.f2091q);
        x0.a(this, jVar.f2092r);
        j jVar2 = this.A;
        if (jVar2.f2079e != null || jVar2.getIcon() != null || this.A.getActionView() == null) {
            z10 = false;
        }
        CheckedTextView checkedTextView = this.f12608y;
        if (z10) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f12609z;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f12609z.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f12609z;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f12609z.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        j jVar = this.A;
        if (jVar != null && jVar.isCheckable() && this.A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f12607x != z10) {
            this.f12607x = z10;
            this.E.h(this.f12608y, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f12608y;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.b.h(drawable, this.B);
            }
            int i10 = this.f12605v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f12606w) {
            if (this.D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = n0.f.f22291a;
                Drawable a10 = f.a.a(resources, R.drawable.navigation_empty_icon, theme);
                this.D = a10;
                if (a10 != null) {
                    int i11 = this.f12605v;
                    a10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.D;
        }
        m.b.e(this.f12608y, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f12608y.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f12605v = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.B = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C = z10;
        j jVar = this.A;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f12608y.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f12606w = z10;
    }

    public void setTextAppearance(int i10) {
        this.f12608y.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12608y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12608y.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f12608y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        f0.o(checkedTextView, aVar);
    }
}
