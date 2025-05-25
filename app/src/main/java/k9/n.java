package k9;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes2.dex */
public final class n extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f19668e;

    /* renamed from: f  reason: collision with root package name */
    public final int f19669f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f19670g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f19671h;

    /* renamed from: i  reason: collision with root package name */
    public final d9.f f19672i;

    /* renamed from: j  reason: collision with root package name */
    public final j f19673j;

    /* renamed from: k  reason: collision with root package name */
    public final androidx.appcompat.libconvert.a f19674k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f19675l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f19676m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f19677n;

    /* renamed from: o  reason: collision with root package name */
    public long f19678o;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f19679p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f19680q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f19681r;

    /* JADX WARN: Type inference failed for: r0v1, types: [k9.j] */
    public n(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f19672i = new d9.f(this, 1);
        this.f19673j = new View.OnFocusChangeListener() { // from class: k9.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                n nVar = n.this;
                nVar.f19675l = z10;
                nVar.q();
                if (!z10) {
                    nVar.t(false);
                    nVar.f19676m = false;
                }
            }
        };
        this.f19674k = new androidx.appcompat.libconvert.a(this, 6);
        this.f19678o = Long.MAX_VALUE;
        this.f19669f = x8.a.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f19668e = x8.a.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f19670g = x8.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, f8.b.f17141a);
    }

    @Override // k9.o
    public final void a() {
        boolean z10;
        if (this.f19679p.isTouchExplorationEnabled()) {
            if (this.f19671h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f19684d.hasFocus()) {
                this.f19671h.dismissDropDown();
            }
        }
        this.f19671h.post(new androidx.activity.i(this, 3));
    }

    @Override // k9.o
    public final int c() {
        return R.string.arg_res_0x7f130127;
    }

    @Override // k9.o
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // k9.o
    public final View.OnFocusChangeListener e() {
        return this.f19673j;
    }

    @Override // k9.o
    public final View.OnClickListener f() {
        return this.f19672i;
    }

    @Override // k9.o
    public final y0.d h() {
        return this.f19674k;
    }

    @Override // k9.o
    public final boolean i(int i10) {
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    @Override // k9.o
    public final boolean j() {
        return this.f19675l;
    }

    @Override // k9.o
    public final boolean l() {
        return this.f19677n;
    }

    @Override // k9.o
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f19671h = autoCompleteTextView;
            boolean z10 = false;
            autoCompleteTextView.setOnTouchListener(new k(this, 0));
            this.f19671h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: k9.l
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    n nVar = n.this;
                    nVar.f19676m = true;
                    nVar.f19678o = System.currentTimeMillis();
                    nVar.t(false);
                }
            });
            this.f19671h.setThreshold(0);
            TextInputLayout textInputLayout = this.f19682a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z10 = true;
            }
            if (!z10 && this.f19679p.isTouchExplorationEnabled()) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.s(this.f19684d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // k9.o
    public final void n(y0.f fVar) {
        boolean z10;
        boolean z11 = true;
        if (this.f19671h.getInputType() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            fVar.h(Spinner.class.getName());
        }
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
        if (i10 >= 26) {
            z11 = accessibilityNodeInfo.isShowingHintText();
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z11 = false;
            }
        }
        if (z11) {
            fVar.k(null);
        }
    }

    @Override // k9.o
    @SuppressLint({"WrongConstant"})
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (this.f19679p.isEnabled()) {
            boolean z11 = false;
            if (this.f19671h.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (accessibilityEvent.getEventType() == 32768 && this.f19677n && !this.f19671h.isPopupShowing()) {
                    z11 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z11) {
                    u();
                    this.f19676m = true;
                    this.f19678o = System.currentTimeMillis();
                }
            }
        }
    }

    @Override // k9.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f19670g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f19669f);
        ofFloat.addUpdateListener(new b(this, 1));
        this.f19681r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f19668e);
        ofFloat2.addUpdateListener(new b(this, 1));
        this.f19680q = ofFloat2;
        ofFloat2.addListener(new m(this));
        this.f19679p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // k9.o
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f19671h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f19671h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f19677n != z10) {
            this.f19677n = z10;
            this.f19681r.cancel();
            this.f19680q.start();
        }
    }

    public final void u() {
        boolean z10;
        if (this.f19671h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f19678o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f19676m = false;
        }
        if (!this.f19676m) {
            t(!this.f19677n);
            if (this.f19677n) {
                this.f19671h.requestFocus();
                this.f19671h.showDropDown();
                return;
            }
            this.f19671h.dismissDropDown();
            return;
        }
        this.f19676m = false;
    }
}
