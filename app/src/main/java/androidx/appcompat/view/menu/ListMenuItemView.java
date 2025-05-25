package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.u0;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public j f1970a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f1971b;
    public RadioButton c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f1972d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f1973e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f1974f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f1975g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f1976h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f1977i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f1978j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1979k;

    /* renamed from: l  reason: collision with root package name */
    public final Context f1980l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1981m;

    /* renamed from: n  reason: collision with root package name */
    public final Drawable f1982n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1983o;

    /* renamed from: p  reason: collision with root package name */
    public LayoutInflater f1984p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1985q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f1984p == null) {
            this.f1984p = LayoutInflater.from(getContext());
        }
        return this.f1984p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f1975g;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1976h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1976h.getLayoutParams();
            rect.top = this.f1976h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    @Override // androidx.appcompat.view.menu.o.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.appcompat.view.menu.j r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(androidx.appcompat.view.menu.j):void");
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f1970a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.q(this, this.f1978j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1972d = textView;
        int i10 = this.f1979k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1980l, i10);
        }
        this.f1974f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1975g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1982n);
        }
        this.f1976h = (ImageView) findViewById(R.id.group_divider);
        this.f1977i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f1971b != null && this.f1981m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1971b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.c == null && this.f1973e == null) {
            return;
        }
        if ((this.f1970a.f2098x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.f1977i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
            view = this.f1973e;
        } else {
            if (this.f1973e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1973e = checkBox;
                LinearLayout linearLayout2 = this.f1977i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1973e;
            view = this.c;
        }
        if (z10) {
            compoundButton.setChecked(this.f1970a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f1973e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        if ((this.f1970a.f2098x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.f1977i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.f1973e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1973e = checkBox;
                LinearLayout linearLayout2 = this.f1977i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1973e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1985q = z10;
        this.f1981m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f1976h;
        if (imageView != null) {
            if (!this.f1983o && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1970a.f2088n.getClass();
        boolean z10 = this.f1985q;
        if (!z10 && !this.f1981m) {
            return;
        }
        ImageView imageView = this.f1971b;
        if (imageView == null && drawable == null && !this.f1981m) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f1971b = imageView2;
            LinearLayout linearLayout = this.f1977i;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f1981m) {
            this.f1971b.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f1971b;
        if (!z10) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f1971b.getVisibility() != 0) {
            this.f1971b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1972d.setText(charSequence);
            if (this.f1972d.getVisibility() != 0) {
                this.f1972d.setVisibility(0);
            }
        } else if (this.f1972d.getVisibility() != 8) {
            this.f1972d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        u0 m10 = u0.m(getContext(), attributeSet, k.a.f19447t, i10, 0);
        this.f1978j = m10.e(5);
        this.f1979k = m10.i(1, -1);
        this.f1981m = m10.a(7, false);
        this.f1980l = context;
        this.f1982n = m10.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f1983o = obtainStyledAttributes.hasValue(0);
        m10.n();
        obtainStyledAttributes.recycle();
    }
}
