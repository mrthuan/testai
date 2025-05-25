package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import b9.b;
import b9.c;
import e8.a;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public final void l(int i10, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, a.I);
        Context context = getContext();
        int[] iArr = {1, 2};
        int i11 = -1;
        for (int i12 = 0; i12 < 2 && i11 < 0; i12++) {
            i11 = c.c(context, obtainStyledAttributes, iArr[i12], -1);
        }
        obtainStyledAttributes.recycle();
        if (i11 >= 0) {
            setLineHeight(i11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (b.b(context, true, R.attr.textAppearanceLineHeightEnabled)) {
            l(i10, context.getTheme());
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 0), attributeSet, i10);
        Context context2 = getContext();
        if (b.b(context2, true, R.attr.textAppearanceLineHeightEnabled)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a.J;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, 0);
            int[] iArr2 = {1, 2};
            int i11 = -1;
            for (int i12 = 0; i12 < 2 && i11 < 0; i12++) {
                i11 = c.c(context2, obtainStyledAttributes, iArr2[i12], -1);
            }
            obtainStyledAttributes.recycle();
            if (i11 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i10, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                l(resourceId, theme);
            }
        }
    }
}
