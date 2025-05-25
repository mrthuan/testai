package k9;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class g extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f19651e;

    /* renamed from: f  reason: collision with root package name */
    public final int f19652f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f19653g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f19654h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f19655i;

    /* renamed from: j  reason: collision with root package name */
    public final c f19656j;

    /* renamed from: k  reason: collision with root package name */
    public final d f19657k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f19658l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f19659m;

    public g(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f19656j = new c(this, 0);
        this.f19657k = new d(this, 0);
        this.f19651e = x8.a.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f19652f = x8.a.c(aVar.getContext(), R.attr.motionDurationShort3, ShapeTypes.FLOW_CHART_EXTRACT);
        this.f19653g = x8.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, f8.b.f17141a);
        this.f19654h = x8.a.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, f8.b.f17143d);
    }

    @Override // k9.o
    public final void a() {
        if (this.f19683b.f13084p != null) {
            return;
        }
        t(u());
    }

    @Override // k9.o
    public final int c() {
        return R.string.arg_res_0x7f1300b1;
    }

    @Override // k9.o
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // k9.o
    public final View.OnFocusChangeListener e() {
        return this.f19657k;
    }

    @Override // k9.o
    public final View.OnClickListener f() {
        return this.f19656j;
    }

    @Override // k9.o
    public final View.OnFocusChangeListener g() {
        return this.f19657k;
    }

    @Override // k9.o
    public final void m(EditText editText) {
        this.f19655i = editText;
        this.f19682a.setEndIconVisible(u());
    }

    @Override // k9.o
    public final void p(boolean z10) {
        if (this.f19683b.f13084p == null) {
            return;
        }
        t(z10);
    }

    @Override // k9.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f19654h);
        ofFloat.setDuration(this.f19652f);
        ofFloat.addUpdateListener(new a(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f19653g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f19651e;
        ofFloat2.setDuration(i10);
        ofFloat2.addUpdateListener(new b(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f19658l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f19658l.addListener(new e(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i10);
        ofFloat3.addUpdateListener(new b(this, 0));
        this.f19659m = ofFloat3;
        ofFloat3.addListener(new f(this));
    }

    @Override // k9.o
    public final void s() {
        EditText editText = this.f19655i;
        if (editText != null) {
            editText.post(new b7.g(this, 3));
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        if (this.f19683b.c() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f19658l.isRunning()) {
            this.f19659m.cancel();
            this.f19658l.start();
            if (z11) {
                this.f19658l.end();
            }
        } else if (!z10) {
            this.f19658l.cancel();
            this.f19659m.start();
            if (z11) {
                this.f19659m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f19655i;
        if (editText != null && ((editText.hasFocus() || this.f19684d.hasFocus()) && this.f19655i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
