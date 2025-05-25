package k9;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.u0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w8.w;
import x0.f0;
import x0.n0;

/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class u extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f19718a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatTextView f19719b;
    public CharSequence c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f19720d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f19721e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f19722f;

    /* renamed from: g  reason: collision with root package name */
    public int f19723g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView.ScaleType f19724h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnLongClickListener f19725i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f19726j;

    public u(TextInputLayout textInputLayout, u0 u0Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f19718a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f19720d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f19719b = appCompatTextView;
        if (b9.c.e(getContext())) {
            x0.h.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f19725i;
        checkableImageButton.setOnClickListener(null);
        p.d(checkableImageButton, onLongClickListener);
        this.f19725i = null;
        checkableImageButton.setOnLongClickListener(null);
        p.d(checkableImageButton, null);
        if (u0Var.l(67)) {
            this.f19721e = b9.c.b(getContext(), u0Var, 67);
        }
        if (u0Var.l(68)) {
            this.f19722f = w.f(u0Var.h(68, -1), null);
        }
        if (u0Var.l(64)) {
            a(u0Var.e(64));
            if (u0Var.l(63) && checkableImageButton.getContentDescription() != (k10 = u0Var.k(63))) {
                checkableImageButton.setContentDescription(k10);
            }
            checkableImageButton.setCheckable(u0Var.a(62, true));
        }
        int d10 = u0Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f19723g) {
                this.f19723g = d10;
                checkableImageButton.setMinimumWidth(d10);
                checkableImageButton.setMinimumHeight(d10);
            }
            if (u0Var.l(66)) {
                ImageView.ScaleType b10 = p.b(u0Var.h(66, -1));
                this.f19724h = b10;
                checkableImageButton.setScaleType(b10);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.g.f(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(u0Var.i(58, 0));
            if (u0Var.l(59)) {
                appCompatTextView.setTextColor(u0Var.b(59));
            }
            CharSequence k11 = u0Var.k(57);
            this.c = TextUtils.isEmpty(k11) ? null : k11;
            appCompatTextView.setText(k11);
            d();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f19720d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f19721e;
            PorterDuff.Mode mode = this.f19722f;
            TextInputLayout textInputLayout = this.f19718a;
            p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            p.c(textInputLayout, checkableImageButton, this.f19721e);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f19725i;
        checkableImageButton.setOnClickListener(null);
        p.d(checkableImageButton, onLongClickListener);
        this.f19725i = null;
        checkableImageButton.setOnLongClickListener(null);
        p.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.f19720d;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            c();
            d();
        }
    }

    public final void c() {
        boolean z10;
        EditText editText = this.f19718a.f13020d;
        if (editText == null) {
            return;
        }
        int i10 = 0;
        if (this.f19720d.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            i10 = f0.e.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
        f0.e.k(this.f19719b, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i10;
        boolean z10;
        int i11 = 8;
        if (this.c != null && !this.f19726j) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (this.f19720d.getVisibility() != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f19719b.setVisibility(i10);
        this.f19718a.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c();
    }
}
