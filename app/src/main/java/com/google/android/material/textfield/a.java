package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.u0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k9.g;
import k9.n;
import k9.o;
import k9.p;
import k9.s;
import k9.t;
import pdf.pdfreader.viewer.editor.free.R;
import w8.r;
import w8.w;
import x0.f0;
import x0.h;
import x0.n0;

/* compiled from: EndCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f13070a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f13071b;
    public final CheckableImageButton c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f13072d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f13073e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnLongClickListener f13074f;

    /* renamed from: g  reason: collision with root package name */
    public final CheckableImageButton f13075g;

    /* renamed from: h  reason: collision with root package name */
    public final d f13076h;

    /* renamed from: i  reason: collision with root package name */
    public int f13077i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.h> f13078j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f13079k;

    /* renamed from: l  reason: collision with root package name */
    public PorterDuff.Mode f13080l;

    /* renamed from: m  reason: collision with root package name */
    public int f13081m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView.ScaleType f13082n;

    /* renamed from: o  reason: collision with root package name */
    public View.OnLongClickListener f13083o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f13084p;

    /* renamed from: q  reason: collision with root package name */
    public final AppCompatTextView f13085q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13086r;

    /* renamed from: s  reason: collision with root package name */
    public EditText f13087s;

    /* renamed from: t  reason: collision with root package name */
    public final AccessibilityManager f13088t;

    /* renamed from: u  reason: collision with root package name */
    public y0.d f13089u;

    /* renamed from: v  reason: collision with root package name */
    public final C0174a f13090v;

    /* compiled from: EndCompoundLayout.java */
    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0174a extends r {
        public C0174a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // w8.r, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.b().b();
        }
    }

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes2.dex */
    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.f13087s == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.f13087s;
            C0174a c0174a = aVar.f13090v;
            if (editText != null) {
                editText.removeTextChangedListener(c0174a);
                if (aVar.f13087s.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.f13087s.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.f13087s = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0174a);
            }
            aVar.b().m(aVar.f13087s);
            aVar.i(aVar.b());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.f13089u != null && (accessibilityManager = aVar.f13088t) != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (f0.g.b(aVar)) {
                    y0.c.a(accessibilityManager, aVar.f13089u);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            y0.d dVar = aVar.f13089u;
            if (dVar != null && (accessibilityManager = aVar.f13088t) != null) {
                y0.c.b(accessibilityManager, dVar);
            }
        }
    }

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<o> f13094a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public final a f13095b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13096d;

        public d(a aVar, u0 u0Var) {
            this.f13095b = aVar;
            this.c = u0Var.i(26, 0);
            this.f13096d = u0Var.i(50, 0);
        }
    }

    public a(TextInputLayout textInputLayout, u0 u0Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f13077i = 0;
        this.f13078j = new LinkedHashSet<>();
        this.f13090v = new C0174a();
        b bVar = new b();
        this.f13088t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f13070a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f13071b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.c = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f13075g = a11;
        this.f13076h = new d(this, u0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f13085q = appCompatTextView;
        if (u0Var.l(36)) {
            this.f13072d = b9.c.b(getContext(), u0Var, 36);
        }
        if (u0Var.l(37)) {
            this.f13073e = w.f(u0Var.h(37, -1), null);
        }
        if (u0Var.l(35)) {
            h(u0Var.e(35));
        }
        a10.setContentDescription(getResources().getText(R.string.arg_res_0x7f13011f));
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!u0Var.l(51)) {
            if (u0Var.l(30)) {
                this.f13079k = b9.c.b(getContext(), u0Var, 30);
            }
            if (u0Var.l(31)) {
                this.f13080l = w.f(u0Var.h(31, -1), null);
            }
        }
        if (u0Var.l(28)) {
            f(u0Var.h(28, 0));
            if (u0Var.l(25) && a11.getContentDescription() != (k10 = u0Var.k(25))) {
                a11.setContentDescription(k10);
            }
            a11.setCheckable(u0Var.a(24, true));
        } else if (u0Var.l(51)) {
            if (u0Var.l(52)) {
                this.f13079k = b9.c.b(getContext(), u0Var, 52);
            }
            if (u0Var.l(53)) {
                this.f13080l = w.f(u0Var.h(53, -1), null);
            }
            f(u0Var.a(51, false) ? 1 : 0);
            CharSequence k11 = u0Var.k(49);
            if (a11.getContentDescription() != k11) {
                a11.setContentDescription(k11);
            }
        }
        int d10 = u0Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f13081m) {
                this.f13081m = d10;
                a11.setMinimumWidth(d10);
                a11.setMinimumHeight(d10);
                a10.setMinimumWidth(d10);
                a10.setMinimumHeight(d10);
            }
            if (u0Var.l(29)) {
                ImageView.ScaleType b10 = p.b(u0Var.h(29, -1));
                this.f13082n = b10;
                a11.setScaleType(b10);
                a10.setScaleType(b10);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            f0.g.f(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(u0Var.i(70, 0));
            if (u0Var.l(71)) {
                appCompatTextView.setTextColor(u0Var.b(71));
            }
            CharSequence k12 = u0Var.k(69);
            this.f13084p = TextUtils.isEmpty(k12) ? null : k12;
            appCompatTextView.setText(k12);
            m();
            frameLayout.addView(a11);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f13019c0.add(bVar);
            if (textInputLayout.f13020d != null) {
                bVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (b9.c.e(getContext())) {
            h.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final o b() {
        o hVar;
        int i10 = this.f13077i;
        d dVar = this.f13076h;
        SparseArray<o> sparseArray = dVar.f13094a;
        o oVar = sparseArray.get(i10);
        if (oVar == null) {
            a aVar = dVar.f13095b;
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                hVar = new n(aVar);
                            } else {
                                throw new IllegalArgumentException(b.a.c("Invalid end icon mode: ", i10));
                            }
                        } else {
                            hVar = new g(aVar);
                        }
                    } else {
                        oVar = new t(aVar, dVar.f13096d);
                        sparseArray.append(i10, oVar);
                    }
                } else {
                    hVar = new s(aVar);
                }
            } else {
                hVar = new k9.h(aVar);
            }
            oVar = hVar;
            sparseArray.append(i10, oVar);
        }
        return oVar;
    }

    public final boolean c() {
        if (this.f13071b.getVisibility() == 0 && this.f13075g.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        o b10 = b();
        boolean k10 = b10.k();
        CheckableImageButton checkableImageButton = this.f13075g;
        boolean z12 = true;
        if (k10 && (isChecked = checkableImageButton.isChecked()) != b10.l()) {
            checkableImageButton.setChecked(!isChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b10 instanceof n) && (isActivated = checkableImageButton.isActivated()) != b10.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z11;
        }
        if (z10 || z12) {
            p.c(this.f13070a, checkableImageButton, this.f13079k);
        }
    }

    public final void f(int i10) {
        boolean z10;
        Drawable drawable;
        if (this.f13077i == i10) {
            return;
        }
        o b10 = b();
        y0.d dVar = this.f13089u;
        AccessibilityManager accessibilityManager = this.f13088t;
        if (dVar != null && accessibilityManager != null) {
            y0.c.b(accessibilityManager, dVar);
        }
        CharSequence charSequence = null;
        this.f13089u = null;
        b10.s();
        this.f13077i = i10;
        Iterator<TextInputLayout.h> it = this.f13078j.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(z10);
        o b11 = b();
        int i11 = this.f13076h.c;
        if (i11 == 0) {
            i11 = b11.d();
        }
        if (i11 != 0) {
            drawable = m.a.a(getContext(), i11);
        } else {
            drawable = null;
        }
        CheckableImageButton checkableImageButton = this.f13075g;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f13070a;
        if (drawable != null) {
            p.a(textInputLayout, checkableImageButton, this.f13079k, this.f13080l);
            p.c(textInputLayout, checkableImageButton, this.f13079k);
        }
        int c10 = b11.c();
        if (c10 != 0) {
            charSequence = getResources().getText(c10);
        }
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
        checkableImageButton.setCheckable(b11.k());
        if (b11.i(textInputLayout.getBoxBackgroundMode())) {
            b11.r();
            y0.d h10 = b11.h();
            this.f13089u = h10;
            if (h10 != null && accessibilityManager != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (f0.g.b(this)) {
                    y0.c.a(accessibilityManager, this.f13089u);
                }
            }
            View.OnClickListener f10 = b11.f();
            View.OnLongClickListener onLongClickListener = this.f13083o;
            checkableImageButton.setOnClickListener(f10);
            p.d(checkableImageButton, onLongClickListener);
            EditText editText = this.f13087s;
            if (editText != null) {
                b11.m(editText);
                i(b11);
            }
            p.a(textInputLayout, checkableImageButton, this.f13079k, this.f13080l);
            e(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
    }

    public final void g(boolean z10) {
        int i10;
        if (c() != z10) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.f13075g.setVisibility(i10);
            j();
            l();
            this.f13070a.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        k();
        p.a(this.f13070a, checkableImageButton, this.f13072d, this.f13073e);
    }

    public final void i(o oVar) {
        if (this.f13087s == null) {
            return;
        }
        if (oVar.e() != null) {
            this.f13087s.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.f13075g.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void j() {
        int i10;
        boolean z10;
        boolean z11;
        int i11 = 8;
        if (this.f13075g.getVisibility() == 0 && !d()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f13071b.setVisibility(i10);
        if (this.f13084p != null && !this.f13086r) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!c() && !d() && z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    public final void k() {
        boolean z10;
        int i10;
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z11 = true;
        TextInputLayout textInputLayout = this.f13070a;
        if (drawable != null && textInputLayout.f13032j.f19700q && textInputLayout.m()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        j();
        l();
        if (this.f13077i == 0) {
            z11 = false;
        }
        if (!z11) {
            textInputLayout.p();
        }
    }

    public final void l() {
        int i10;
        TextInputLayout textInputLayout = this.f13070a;
        if (textInputLayout.f13020d == null) {
            return;
        }
        if (!c() && !d()) {
            EditText editText = textInputLayout.f13020d;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            i10 = f0.e.e(editText);
        } else {
            i10 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f13020d.getPaddingTop();
        int paddingBottom = textInputLayout.f13020d.getPaddingBottom();
        WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
        f0.e.k(this.f13085q, dimensionPixelSize, paddingTop, i10, paddingBottom);
    }

    public final void m() {
        int i10;
        AppCompatTextView appCompatTextView = this.f13085q;
        int visibility = appCompatTextView.getVisibility();
        boolean z10 = false;
        if (this.f13084p != null && !this.f13086r) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            o b10 = b();
            if (i10 == 0) {
                z10 = true;
            }
            b10.p(z10);
        }
        j();
        appCompatTextView.setVisibility(i10);
        this.f13070a.p();
    }
}
