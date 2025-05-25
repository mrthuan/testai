package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.x0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements o.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h  reason: collision with root package name */
    public j f1956h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f1957i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f1958j;

    /* renamed from: k  reason: collision with root package name */
    public h.b f1959k;

    /* renamed from: l  reason: collision with root package name */
    public a f1960l;

    /* renamed from: m  reason: collision with root package name */
    public b f1961m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1962n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1963o;

    /* renamed from: p  reason: collision with root package name */
    public final int f1964p;

    /* renamed from: q  reason: collision with root package name */
    public int f1965q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1966r;

    /* loaded from: classes.dex */
    public class a extends d0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.d0
        public final q b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f1961m;
            if (bVar == null || (aVar = androidx.appcompat.widget.c.this.f2541u) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.d0
        public final boolean c() {
            q b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            h.b bVar = actionMenuItemView.f1959k;
            if (bVar == null || !bVar.a(actionMenuItemView.f1956h) || (b10 = b()) == null || !b10.a()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return l();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        if (l() && this.f1956h.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public final void c(j jVar) {
        int i10;
        this.f1956h = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f2076a);
        if (jVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1960l == null) {
            this.f1960l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f1956h;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void n() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f1957i);
        if (this.f1958j != null) {
            if ((this.f1956h.f2099y & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.f1962n && !this.f1963o)) {
                z11 = false;
            }
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence3 = null;
        if (z13) {
            charSequence = this.f1957i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f1956h.f2091q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z13) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f1956h.f2079e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f1956h.f2092r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z13) {
                charSequence3 = this.f1956h.f2079e;
            }
            x0.a(this, charSequence3);
            return;
        }
        x0.a(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.b bVar = this.f1959k;
        if (bVar != null) {
            bVar.a(this.f1956h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1962n = m();
        n();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean l10 = l();
        if (l10 && (i13 = this.f1965q) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.f1964p;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, i14);
        } else {
            i12 = i14;
        }
        if (mode != 1073741824 && i14 > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!l10 && this.f1958j != null) {
            super.setPadding((getMeasuredWidth() - this.f1958j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f1956h.hasSubMenu() && (aVar = this.f1960l) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1963o != z10) {
            this.f1963o = z10;
            j jVar = this.f1956h;
            if (jVar != null) {
                h hVar = jVar.f2088n;
                hVar.f2060k = true;
                hVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1958j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1966r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(h.b bVar) {
        this.f1959k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f1965q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f1961m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1957i = charSequence;
        n();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1962n = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.c, i10, 0);
        this.f1964p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1966r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1965q = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
