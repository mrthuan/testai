package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.q;
import pdf.pdfreader.viewer.editor.free.R;
import x0.c;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements x0.w, b1.p {

    /* renamed from: a  reason: collision with root package name */
    public final e f2243a;

    /* renamed from: b  reason: collision with root package name */
    public final r f2244b;
    public final q c;

    /* renamed from: d  reason: collision with root package name */
    public final b1.n f2245d;

    /* renamed from: e  reason: collision with root package name */
    public final i f2246e;

    /* renamed from: f  reason: collision with root package name */
    public a f2247f;

    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.f2247f == null) {
            this.f2247f = new a();
        }
        return this.f2247f;
    }

    @Override // x0.w
    public final x0.c a(x0.c cVar) {
        return this.f2245d.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2243a;
        if (eVar != null) {
            eVar.a();
        }
        r rVar = this.f2244b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b1.m.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2243a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2243a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2244b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2244b.e();
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1 != null) goto L15;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r6) {
        /*
            r5 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r6)
            androidx.appcompat.widget.r r1 = r5.f2244b
            r1.getClass()
            androidx.appcompat.widget.r.h(r5, r0, r6)
            b.b.P(r5, r6, r0)
            if (r0 == 0) goto L5f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L5f
            java.lang.String[] r2 = x0.f0.g(r5)
            if (r2 == 0) goto L5f
            a1.c.a(r6, r2)
            a1.e r2 = new a1.e
            r3 = 0
            r2.<init>(r5, r3)
            r3 = 25
            if (r1 < r3) goto L31
            a1.f r1 = new a1.f
            r1.<init>(r0, r2)
        L2f:
            r0 = r1
            goto L5f
        L31:
            java.lang.String[] r4 = a1.c.f16a
            if (r1 < r3) goto L3d
            java.lang.String[] r1 = a1.b.f(r6)
            if (r1 == 0) goto L55
        L3b:
            r4 = r1
            goto L55
        L3d:
            android.os.Bundle r1 = r6.extras
            if (r1 != 0) goto L42
            goto L55
        L42:
            java.lang.String r3 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r1 = r1.getStringArray(r3)
            if (r1 != 0) goto L52
            android.os.Bundle r1 = r6.extras
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r1 = r1.getStringArray(r3)
        L52:
            if (r1 == 0) goto L55
            goto L3b
        L55:
            int r1 = r4.length
            if (r1 != 0) goto L59
            goto L5f
        L59:
            a1.g r1 = new a1.g
            r1.<init>(r0, r2)
            goto L2f
        L5f:
            androidx.appcompat.widget.i r1 = r5.f2246e
            android.view.inputmethod.InputConnection r6 = r1.g(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && x0.f0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = n.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        ClipData primaryClip;
        c.b c0401c;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && x0.f0.g(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    c0401c = new c.a(primaryClip, 1);
                } else {
                    c0401c = new c.C0401c(primaryClip, 1);
                }
                if (i10 != 16908322) {
                    i12 = 1;
                }
                c0401c.b(i12);
                x0.f0.k(this, c0401c.build());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2243a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f2243a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2244b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f2244b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b1.m.h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f2246e.i(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2246e.e(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2243a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2243a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        r rVar = this.f2244b;
        rVar.l(colorStateList);
        rVar.b();
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2244b;
        rVar.m(mode);
        rVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        r rVar = this.f2244b;
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

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(context);
        p0.a(getContext(), this);
        e eVar = new e(this);
        this.f2243a = eVar;
        eVar.d(attributeSet, i10);
        r rVar = new r(this);
        this.f2244b = rVar;
        rVar.f(attributeSet, i10);
        rVar.b();
        this.c = new q(this);
        this.f2245d = new b1.n();
        i iVar = new i(this);
        this.f2246e = iVar;
        iVar.f(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener e10 = iVar.e(keyListener);
            if (e10 == keyListener) {
                return;
            }
            super.setKeyListener(e10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
