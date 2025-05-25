package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.q;
import b1.m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import v0.c;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements b1.p, b1.b {

    /* renamed from: a  reason: collision with root package name */
    public final e f2280a;

    /* renamed from: b  reason: collision with root package name */
    public final r f2281b;
    public final q c;

    /* renamed from: d  reason: collision with root package name */
    public j f2282d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2283e;

    /* renamed from: f  reason: collision with root package name */
    public b f2284f;

    /* renamed from: g  reason: collision with root package name */
    public Future<v0.c> f2285g;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);

        void b(int i10);
    }

    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private j getEmojiTextViewHelper() {
        if (this.f2282d == null) {
            this.f2282d = new j(this);
        }
        return this.f2282d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2280a;
        if (eVar != null) {
            eVar.a();
        }
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d1.f2567b) {
            return super.getAutoSizeMaxTextSize();
        }
        r rVar = this.f2281b;
        if (rVar != null) {
            return Math.round(rVar.f2661i.f2680e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (d1.f2567b) {
            return super.getAutoSizeMinTextSize();
        }
        r rVar = this.f2281b;
        if (rVar != null) {
            return Math.round(rVar.f2661i.f2679d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (d1.f2567b) {
            return super.getAutoSizeStepGranularity();
        }
        r rVar = this.f2281b;
        if (rVar != null) {
            return Math.round(rVar.f2661i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (d1.f2567b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        r rVar = this.f2281b;
        if (rVar != null) {
            return rVar.f2661i.f2681f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (d1.f2567b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        r rVar = this.f2281b;
        if (rVar == null) {
            return 0;
        }
        return rVar.f2661i.f2677a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b1.m.g(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.f2284f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f2284f = new c();
            } else if (i10 >= 26) {
                this.f2284f = new b();
            }
        }
        return this.f2284f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2280a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2280a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2281b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2281b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<v0.c> future = this.f2285g;
        if (future != null) {
            try {
                this.f2285g = null;
                b1.m.f(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        q qVar;
        if (Build.VERSION.SDK_INT < 28 && (qVar = this.c) != null) {
            TextClassifier textClassifier = qVar.f2653b;
            if (textClassifier == null) {
                return q.a.a(qVar.f2652a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public c.a getTextMetricsParamsCompat() {
        return b1.m.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2281b.getClass();
        r.h(this, onCreateInputConnection, editorInfo);
        b.b.P(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r rVar = this.f2281b;
        if (rVar != null && !d1.f2567b) {
            rVar.f2661i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<v0.c> future = this.f2285g;
        if (future != null) {
            try {
                this.f2285g = null;
                b1.m.f(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z11 = false;
        r rVar = this.f2281b;
        if (rVar != null && !d1.f2567b) {
            t tVar = rVar.f2661i;
            if (tVar.h() && tVar.f2677a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            rVar.f2661i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView, b1.b
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (d1.f2567b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (d1.f2567b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView, b1.b
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (d1.f2567b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2280a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f2280a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b1.m.h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            b1.m.d(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            b1.m.e(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        pdf.pdfreader.viewer.editor.free.utils.t0.t(i10);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(v0.c cVar) {
        b1.m.f(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2280a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2280a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        r rVar = this.f2281b;
        rVar.l(colorStateList);
        rVar.b();
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2281b;
        rVar.m(mode);
        rVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        q qVar;
        if (Build.VERSION.SDK_INT >= 28 || (qVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            qVar.f2653b = textClassifier;
        }
    }

    public void setTextFuture(Future<v0.c> future) {
        this.f2285g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        int i10;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f30471b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
            m.b.h(this, i10);
            getPaint().set(aVar.f30470a);
            m.c.e(this, aVar.c);
            m.c.h(this, aVar.f30472d);
        }
        i10 = 1;
        m.b.h(this, i10);
        getPaint().set(aVar.f30470a);
        m.c.e(this, aVar.c);
        m.c.h(this, aVar.f30472d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10;
        boolean z11 = d1.f2567b;
        if (z11) {
            super.setTextSize(i10, f10);
            return;
        }
        r rVar = this.f2281b;
        if (rVar != null && !z11) {
            t tVar = rVar.f2661i;
            if (tVar.h() && tVar.f2677a != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                tVar.e(f10, i10);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.f2283e) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            o0.l lVar = o0.e.f22645a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f2283e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f2283e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(context);
        this.f2283e = false;
        this.f2284f = null;
        p0.a(getContext(), this);
        e eVar = new e(this);
        this.f2280a = eVar;
        eVar.d(attributeSet, i10);
        r rVar = new r(this);
        this.f2281b = rVar;
        rVar.f(attributeSet, i10);
        rVar.b();
        this.c = new q(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? m.a.a(context, i10) : null, i11 != 0 ? m.a.a(context, i11) : null, i12 != 0 ? m.a.a(context, i12) : null, i13 != 0 ? m.a.a(context, i13) : null);
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? m.a.a(context, i10) : null, i11 != 0 ? m.a.a(context, i11) : null, i12 != 0 ? m.a.a(context, i12) : null, i13 != 0 ? m.a.a(context, i13) : null);
        r rVar = this.f2281b;
        if (rVar != null) {
            rVar.b();
        }
    }

    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10) {
        }
    }
}
