package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.afollestad.materialdialogs.GravityEnum;
import pdf.pdfreader.viewer.editor.free.R;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class MDButton extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5982a;

    /* renamed from: b  reason: collision with root package name */
    public GravityEnum f5983b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f5984d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f5985e;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5982a = false;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
        this.f5983b = GravityEnum.END;
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        int i11;
        Drawable drawable;
        if (this.f5982a != z10 || z11) {
            if (z10) {
                i10 = this.f5983b.getGravityInt() | 16;
            } else {
                i10 = 17;
            }
            setGravity(i10);
            if (z10) {
                i11 = this.f5983b.getTextAlignment();
            } else {
                i11 = 4;
            }
            setTextAlignment(i11);
            if (z10) {
                drawable = this.f5984d;
            } else {
                drawable = this.f5985e;
            }
            setBackground(drawable);
            if (z10) {
                setPadding(this.c, getPaddingTop(), this.c, getPaddingBottom());
            }
            this.f5982a = z10;
        }
    }

    public void setAllCapsCompat(boolean z10) {
        setAllCaps(z10);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f5985e = drawable;
        if (!this.f5982a) {
            a(false, true);
        }
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        this.f5983b = gravityEnum;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f5984d = drawable;
        if (this.f5982a) {
            a(true, true);
        }
    }

    public MDButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5982a = false;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin);
        this.f5983b = GravityEnum.END;
    }
}
