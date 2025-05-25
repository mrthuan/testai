package k9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes2.dex */
public final class q {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f19685a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19686b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f19687d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f19688e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f19689f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f19690g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f19691h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f19692i;

    /* renamed from: j  reason: collision with root package name */
    public int f19693j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f19694k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f19695l;

    /* renamed from: m  reason: collision with root package name */
    public final float f19696m;

    /* renamed from: n  reason: collision with root package name */
    public int f19697n;

    /* renamed from: o  reason: collision with root package name */
    public int f19698o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f19699p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f19700q;

    /* renamed from: r  reason: collision with root package name */
    public AppCompatTextView f19701r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f19702s;

    /* renamed from: t  reason: collision with root package name */
    public int f19703t;

    /* renamed from: u  reason: collision with root package name */
    public int f19704u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f19705v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f19706w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f19707x;

    /* renamed from: y  reason: collision with root package name */
    public AppCompatTextView f19708y;

    /* renamed from: z  reason: collision with root package name */
    public int f19709z;

    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f19710a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f19711b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f19712d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f19710a = i10;
            this.f19711b = textView;
            this.c = i11;
            this.f19712d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i10 = this.f19710a;
            q qVar = q.this;
            qVar.f19697n = i10;
            qVar.f19695l = null;
            TextView textView = this.f19711b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && (appCompatTextView = qVar.f19701r) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f19712d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f19712d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f19690g = context;
        this.f19691h = textInputLayout;
        this.f19696m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f19685a = x8.a.c(context, R.attr.motionDurationShort4, 217);
        this.f19686b = x8.a.c(context, R.attr.motionDurationMedium4, ShapeTypes.ACTION_BUTTON_END);
        this.c = x8.a.c(context, R.attr.motionDurationShort4, ShapeTypes.ACTION_BUTTON_END);
        this.f19687d = x8.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, f8.b.f17143d);
        LinearInterpolator linearInterpolator = f8.b.f17141a;
        this.f19688e = x8.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f19689f = x8.a.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        boolean z10;
        if (this.f19692i == null && this.f19694k == null) {
            Context context = this.f19690g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f19692i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f19692i;
            TextInputLayout textInputLayout = this.f19691h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f19694k = new FrameLayout(context);
            this.f19692i.addView(this.f19694k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f19694k.setVisibility(0);
            this.f19694k.addView(textView);
        } else {
            this.f19692i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f19692i.setVisibility(0);
        this.f19693j++;
    }

    public final void b() {
        boolean z10;
        LinearLayout linearLayout = this.f19692i;
        TextInputLayout textInputLayout = this.f19691h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f19690g;
            boolean e10 = b9.c.e(context);
            LinearLayout linearLayout2 = this.f19692i;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            int f10 = f0.e.f(editText);
            if (e10) {
                f10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (e10) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e11 = f0.e.e(editText);
            if (e10) {
                e11 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            f0.e.k(linearLayout2, f10, dimensionPixelSize, e11, 0);
        }
    }

    public final void c() {
        Animator animator = this.f19695l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        float f10;
        int i13;
        TimeInterpolator timeInterpolator;
        boolean z13;
        if (textView != null && z10) {
            if (i10 != i12 && i10 != i11) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (i12 == i10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f10);
                int i14 = this.c;
                if (z12) {
                    i13 = this.f19686b;
                } else {
                    i13 = i14;
                }
                ofFloat.setDuration(i13);
                if (z12) {
                    timeInterpolator = this.f19688e;
                } else {
                    timeInterpolator = this.f19689f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 == i12 && i11 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    ofFloat.setStartDelay(i14);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f19696m, 0.0f);
                    ofFloat2.setDuration(this.f19685a);
                    ofFloat2.setInterpolator(this.f19687d);
                    ofFloat2.setStartDelay(i14);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f19708y;
        }
        return this.f19701r;
    }

    public final void f() {
        this.f19699p = null;
        c();
        if (this.f19697n == 1) {
            if (this.f19707x && !TextUtils.isEmpty(this.f19706w)) {
                this.f19698o = 2;
            } else {
                this.f19698o = 0;
            }
        }
        i(this.f19697n, this.f19698o, h(this.f19701r, ""));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f19692i;
        if (linearLayout == null) {
            return;
        }
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        if (z10 && (frameLayout = this.f19694k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f19693j - 1;
        this.f19693j = i11;
        LinearLayout linearLayout2 = this.f19692i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        TextInputLayout textInputLayout = this.f19691h;
        if (f0.g.c(textInputLayout) && textInputLayout.isEnabled() && (this.f19698o != this.f19697n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView e10;
        TextView e11;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f19695l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f19707x, this.f19708y, 2, i10, i11);
            d(arrayList, this.f19700q, this.f19701r, 1, i10, i11);
            com.google.android.play.core.assetpacks.c.O(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (e11 = e(i11)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i10 != 0 && (e10 = e(i10)) != null) {
                e10.setVisibility(4);
                if (i10 == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.f19697n = i11;
        }
        TextInputLayout textInputLayout = this.f19691h;
        textInputLayout.q();
        textInputLayout.t(z10, false);
        textInputLayout.w();
    }
}
