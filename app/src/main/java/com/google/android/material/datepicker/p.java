package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.g0;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import x0.q0;
import x0.t0;

/* compiled from: MaterialDatePicker.java */
/* loaded from: classes2.dex */
public final class p<S> extends androidx.fragment.app.m {
    public static final /* synthetic */ int O0 = 0;
    public boolean A0;
    public int B0;
    public int C0;
    public CharSequence D0;
    public int E0;
    public CharSequence F0;
    public TextView G0;
    public TextView H0;
    public CheckableImageButton I0;
    public f9.h J0;
    public Button K0;
    public boolean L0;
    public CharSequence M0;
    public CharSequence N0;

    /* renamed from: o0  reason: collision with root package name */
    public final LinkedHashSet<s<? super S>> f12443o0 = new LinkedHashSet<>();

    /* renamed from: p0  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f12444p0 = new LinkedHashSet<>();

    /* renamed from: q0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f12445q0 = new LinkedHashSet<>();

    /* renamed from: r0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f12446r0 = new LinkedHashSet<>();

    /* renamed from: s0  reason: collision with root package name */
    public int f12447s0;

    /* renamed from: t0  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f12448t0;

    /* renamed from: u0  reason: collision with root package name */
    public z<S> f12449u0;

    /* renamed from: v0  reason: collision with root package name */
    public com.google.android.material.datepicker.a f12450v0;

    /* renamed from: w0  reason: collision with root package name */
    public f f12451w0;

    /* renamed from: x0  reason: collision with root package name */
    public MaterialCalendar<S> f12452x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f12453y0;

    /* renamed from: z0  reason: collision with root package name */
    public CharSequence f12454z0;

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p pVar = p.this;
            Iterator<s<? super S>> it = pVar.f12443o0.iterator();
            while (it.hasNext()) {
                pVar.s0().q();
                it.next().a();
            }
            pVar.p0(false, false);
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class b extends x0.a {
        public b() {
        }

        @Override // x0.a
        public final void d(View view, y0.f fVar) {
            this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
            StringBuilder sb2 = new StringBuilder();
            int i10 = p.O0;
            sb2.append(p.this.s0().n0());
            sb2.append(", ");
            sb2.append((Object) fVar.e());
            fVar.j(sb2.toString());
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p pVar = p.this;
            Iterator<View.OnClickListener> it = pVar.f12444p0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            pVar.p0(false, false);
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* loaded from: classes2.dex */
    public class d extends y<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s4) {
            p pVar = p.this;
            com.google.android.material.datepicker.d<S> s02 = pVar.s0();
            pVar.r();
            String s10 = s02.s();
            TextView textView = pVar.H0;
            com.google.android.material.datepicker.d<S> s03 = pVar.s0();
            pVar.g0();
            textView.setContentDescription(s03.W());
            pVar.H0.setText(s10);
            pVar.K0.setEnabled(pVar.s0().U());
        }
    }

    public static int t0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d10 = d0.d();
        d10.set(5, 1);
        Calendar c10 = d0.c(d10);
        c10.get(2);
        c10.get(1);
        int maximum = c10.getMaximum(7);
        c10.getActualMaximum(5);
        c10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean u0(Context context) {
        return v0(context, 16843277);
    }

    public static boolean v0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b9.b.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (bundle == null) {
            bundle = this.f3674g;
        }
        this.f12447s0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f12448t0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f12450v0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f12451w0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f12453y0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f12454z0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.B0 = bundle.getInt("INPUT_MODE_KEY");
        this.C0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.D0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.E0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.F0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f12454z0;
        if (charSequence == null) {
            charSequence = g0().getResources().getText(this.f12453y0);
        }
        this.M0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.N0 = charSequence;
    }

    @Override // androidx.fragment.app.Fragment
    public final View N(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        boolean z10;
        if (this.A0) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        f fVar = this.f12451w0;
        if (fVar != null) {
            fVar.getClass();
        }
        if (this.A0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(t0(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(t0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.H0 = textView;
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        f0.g.f(textView, 1);
        this.I0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.G0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.I0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.I0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, m.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], m.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.I0;
        if (this.B0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton2.setChecked(z10);
        x0.f0.o(this.I0, null);
        y0(this.I0);
        this.I0.setOnClickListener(new r(this));
        this.K0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (s0().U()) {
            this.K0.setEnabled(true);
        } else {
            this.K0.setEnabled(false);
        }
        this.K0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.D0;
        if (charSequence != null) {
            this.K0.setText(charSequence);
        } else {
            int i11 = this.C0;
            if (i11 != 0) {
                this.K0.setText(i11);
            }
        }
        this.K0.setOnClickListener(new a());
        x0.f0.o(this.K0, new b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.F0;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i12 = this.E0;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        button.setOnClickListener(new c());
        return inflate;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void X(Bundle bundle) {
        u uVar;
        super.X(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f12447s0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f12448t0);
        a.b bVar = new a.b(this.f12450v0);
        MaterialCalendar<S> materialCalendar = this.f12452x0;
        u uVar2 = null;
        if (materialCalendar == null) {
            uVar = null;
        } else {
            uVar = materialCalendar.f12383d0;
        }
        if (uVar != null) {
            bVar.c = Long.valueOf(uVar.f12469f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f12407e);
        u b10 = u.b(bVar.f12404a);
        u b11 = u.b(bVar.f12405b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.c;
        if (l10 != null) {
            uVar2 = u.b(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(b10, b11, cVar, uVar2, bVar.f12406d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f12451w0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f12453y0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f12454z0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.C0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.D0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.E0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.F0);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void Y() {
        Integer num;
        boolean z10;
        int i10;
        boolean z11;
        t0.e bVar;
        t0.e bVar2;
        t0.e eVar;
        super.Y();
        Window window = r0().getWindow();
        if (this.A0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.J0);
            if (!this.L0) {
                View findViewById = h0().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i11 = Build.VERSION.SDK_INT;
                boolean z12 = false;
                if (num != null && num.intValue() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int J = pdf.pdfreader.viewer.editor.free.utils.t0.J(window.getContext(), 16842801, -16777216);
                if (z10) {
                    num = Integer.valueOf(J);
                }
                Integer valueOf = Integer.valueOf(J);
                q0.a(window, false);
                window.getContext();
                Context context = window.getContext();
                if (i11 < 27) {
                    i10 = o0.a.d(pdf.pdfreader.viewer.editor.free.utils.t0.J(context, 16843858, -16777216), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i10);
                boolean a02 = pdf.pdfreader.viewer.editor.free.utils.t0.a0(num.intValue());
                if (!pdf.pdfreader.viewer.editor.free.utils.t0.a0(0) && !a02) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                View decorView = window.getDecorView();
                if (i11 >= 30) {
                    bVar = new t0.d(window);
                } else if (i11 >= 26) {
                    bVar = new t0.c(window, decorView);
                } else {
                    bVar = new t0.b(window, decorView);
                }
                bVar.d(z11);
                boolean a03 = pdf.pdfreader.viewer.editor.free.utils.t0.a0(valueOf.intValue());
                if (pdf.pdfreader.viewer.editor.free.utils.t0.a0(i10) || (i10 == 0 && a03)) {
                    z12 = true;
                }
                View decorView2 = window.getDecorView();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    eVar = new t0.d(window);
                } else {
                    if (i12 >= 26) {
                        bVar2 = new t0.c(window, decorView2);
                    } else {
                        bVar2 = new t0.b(window, decorView2);
                    }
                    eVar = bVar2;
                }
                eVar.c(z12);
                q qVar = new q(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
                f0.i.u(findViewById, qVar);
                this.L0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = v().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.J0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new r8.a(r0(), rect));
        }
        x0();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void Z() {
        this.f12449u0.Y.clear();
        super.Z();
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f12445q0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f12446r0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.H;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.m
    public final Dialog q0() {
        Context g02 = g0();
        g0();
        int i10 = this.f12447s0;
        if (i10 == 0) {
            i10 = s0().R();
        }
        Dialog dialog = new Dialog(g02, i10);
        Context context = dialog.getContext();
        this.A0 = u0(context);
        int i11 = b9.b.c(context, R.attr.colorSurface, p.class.getCanonicalName()).data;
        f9.h hVar = new f9.h(context, null, R.attr.materialCalendarStyle, 2132018260);
        this.J0 = hVar;
        hVar.k(context);
        this.J0.n(ColorStateList.valueOf(i11));
        f9.h hVar2 = this.J0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
        hVar2.m(f0.i.i(decorView));
        return dialog;
    }

    public final com.google.android.material.datepicker.d<S> s0() {
        if (this.f12448t0 == null) {
            this.f12448t0 = (com.google.android.material.datepicker.d) this.f3674g.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f12448t0;
    }

    public final void x0() {
        z<S> zVar;
        CharSequence charSequence;
        boolean z10;
        g0();
        int i10 = this.f12447s0;
        if (i10 == 0) {
            i10 = s0().R();
        }
        com.google.android.material.datepicker.d<S> s02 = s0();
        com.google.android.material.datepicker.a aVar = this.f12450v0;
        f fVar = this.f12451w0;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", s02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", fVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f12398d);
        materialCalendar.j0(bundle);
        this.f12452x0 = materialCalendar;
        boolean isChecked = this.I0.isChecked();
        if (isChecked) {
            com.google.android.material.datepicker.d<S> s03 = s0();
            com.google.android.material.datepicker.a aVar2 = this.f12450v0;
            zVar = new t<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", s03);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            zVar.j0(bundle2);
        } else {
            zVar = this.f12452x0;
        }
        this.f12449u0 = zVar;
        TextView textView = this.G0;
        if (isChecked) {
            if (v().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                charSequence = this.N0;
                textView.setText(charSequence);
                com.google.android.material.datepicker.d<S> s04 = s0();
                r();
                String s4 = s04.s();
                TextView textView2 = this.H0;
                com.google.android.material.datepicker.d<S> s05 = s0();
                g0();
                textView2.setContentDescription(s05.W());
                this.H0.setText(s4);
                g0 q5 = q();
                q5.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(q5);
                aVar3.d(R.id.mtrl_calendar_frame, this.f12449u0, null);
                aVar3.i();
                this.f12449u0.p0(new d());
            }
        }
        charSequence = this.M0;
        textView.setText(charSequence);
        com.google.android.material.datepicker.d<S> s042 = s0();
        r();
        String s42 = s042.s();
        TextView textView22 = this.H0;
        com.google.android.material.datepicker.d<S> s052 = s0();
        g0();
        textView22.setContentDescription(s052.W());
        this.H0.setText(s42);
        g0 q52 = q();
        q52.getClass();
        androidx.fragment.app.a aVar32 = new androidx.fragment.app.a(q52);
        aVar32.d(R.id.mtrl_calendar_frame, this.f12449u0, null);
        aVar32.i();
        this.f12449u0.p0(new d());
    }

    public final void y0(CheckableImageButton checkableImageButton) {
        String string;
        if (this.I0.isChecked()) {
            string = checkableImageButton.getContext().getString(R.string.arg_res_0x7f130299);
        } else {
            string = checkableImageButton.getContext().getString(R.string.arg_res_0x7f13029b);
        }
        this.I0.setContentDescription(string);
    }
}
