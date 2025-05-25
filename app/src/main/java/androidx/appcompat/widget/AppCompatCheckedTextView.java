package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements b1.p {

    /* renamed from: a  reason: collision with root package name */
    public final f f2240a;

    /* renamed from: b  reason: collision with root package name */
    public final e f2241b;
    public final r c;

    /* renamed from: d  reason: collision with root package name */
    public j f2242d;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    private j getEmojiTextViewHelper() {
        if (this.f2242d == null) {
            this.f2242d = new j(this);
        }
        return this.f2242d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.c;
        if (rVar != null) {
            rVar.b();
        }
        e eVar = this.f2241b;
        if (eVar != null) {
            eVar.a();
        }
        f fVar = this.f2240a;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b1.m.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2241b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2241b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        f fVar = this.f2240a;
        if (fVar != null) {
            return fVar.f2575b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        f fVar = this.f2240a;
        if (fVar != null) {
            return fVar.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.b.P(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2241b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f2241b;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        f fVar = this.f2240a;
        if (fVar != null) {
            if (fVar.f2578f) {
                fVar.f2578f = false;
                return;
            }
            fVar.f2578f = true;
            fVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.c;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2241b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2241b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        f fVar = this.f2240a;
        if (fVar != null) {
            fVar.f2575b = colorStateList;
            fVar.f2576d = true;
            fVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        f fVar = this.f2240a;
        if (fVar != null) {
            fVar.c = mode;
            fVar.f2577e = true;
            fVar.a();
        }
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        r rVar = this.c;
        rVar.l(colorStateList);
        rVar.b();
    }

    @Override // b1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        r rVar = this.c;
        rVar.m(mode);
        rVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        r rVar = this.c;
        if (rVar != null) {
            rVar.g(context, i10);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x0043, B:5:0x0049, B:7:0x004f, B:11:0x005e, B:13:0x0064, B:15:0x006a, B:16:0x0075, B:18:0x007c, B:19:0x0083, B:21:0x008a), top: B:28:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x0043, B:5:0x0049, B:7:0x004f, B:11:0x005e, B:13:0x0064, B:15:0x006a, B:16:0x0075, B:18:0x007c, B:19:0x0083, B:21:0x008a), top: B:28:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatCheckedTextView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.r0.a(r8)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.p0.a(r8, r7)
            androidx.appcompat.widget.r r8 = new androidx.appcompat.widget.r
            r8.<init>(r7)
            r7.c = r8
            r8.f(r9, r10)
            r8.b()
            androidx.appcompat.widget.e r8 = new androidx.appcompat.widget.e
            r8.<init>(r7)
            r7.f2241b = r8
            r8.d(r9, r10)
            androidx.appcompat.widget.f r8 = new androidx.appcompat.widget.f
            r8.<init>(r7)
            r7.f2240a = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = k.a.f19440m
            r6 = 0
            androidx.appcompat.widget.u0 r8 = androidx.appcompat.widget.u0.m(r8, r9, r2, r10, r6)
            android.content.Context r1 = r7.getContext()
            android.content.res.TypedArray r4 = r8.f2688b
            r0 = r7
            r3 = r9
            r5 = r10
            x0.f0.n(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r8.l(r0)     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L5b
            int r1 = r8.i(r0, r6)     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L5b
            android.content.Context r2 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L5b java.lang.Throwable -> La2
            android.graphics.drawable.Drawable r1 = m.a.a(r2, r1)     // Catch: android.content.res.Resources.NotFoundException -> L5b java.lang.Throwable -> La2
            r7.setCheckMarkDrawable(r1)     // Catch: android.content.res.Resources.NotFoundException -> L5b java.lang.Throwable -> La2
            goto L5c
        L5b:
            r0 = r6
        L5c:
            if (r0 != 0) goto L75
            boolean r0 = r8.l(r6)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L75
            int r0 = r8.i(r6, r6)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L75
            android.content.Context r1 = r7.getContext()     // Catch: java.lang.Throwable -> La2
            android.graphics.drawable.Drawable r0 = m.a.a(r1, r0)     // Catch: java.lang.Throwable -> La2
            r7.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> La2
        L75:
            r0 = 2
            boolean r1 = r8.l(r0)     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L83
            android.content.res.ColorStateList r0 = r8.b(r0)     // Catch: java.lang.Throwable -> La2
            r7.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> La2
        L83:
            r0 = 3
            boolean r1 = r8.l(r0)     // Catch: java.lang.Throwable -> La2
            if (r1 == 0) goto L97
            r1 = -1
            int r0 = r8.h(r0, r1)     // Catch: java.lang.Throwable -> La2
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.a0.c(r0, r1)     // Catch: java.lang.Throwable -> La2
            r7.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> La2
        L97:
            r8.n()
            androidx.appcompat.widget.j r8 = r7.getEmojiTextViewHelper()
            r8.b(r9, r10)
            return
        La2:
            r9 = move-exception
            r8.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(m.a.a(getContext(), i10));
    }
}
