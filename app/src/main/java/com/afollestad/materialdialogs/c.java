package com.afollestad.materialdialogs;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.MDButton;

/* compiled from: MaterialDialog.java */
/* loaded from: classes.dex */
public final class c implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialDialog f5981a;

    public c(MaterialDialog materialDialog) {
        this.f5981a = materialDialog;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        MDButton mDButton;
        boolean z11;
        MDButton mDButton2;
        int length = charSequence.toString().length();
        MaterialDialog materialDialog = this.f5981a;
        materialDialog.c.getClass();
        int i13 = 0;
        if (length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        DialogAction dialogAction = DialogAction.POSITIVE;
        int[] iArr = MaterialDialog.a.f5944a;
        int i14 = iArr[dialogAction.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                mDButton = materialDialog.f5939m;
            } else {
                mDButton = materialDialog.f5941o;
            }
        } else {
            mDButton = materialDialog.f5940n;
        }
        mDButton.setEnabled(!z10);
        TextView textView = materialDialog.f5937k;
        MaterialDialog.b bVar = materialDialog.c;
        if (textView != null) {
            bVar.getClass();
            materialDialog.f5937k.setVisibility(8);
            if ((z10 && length == 0) || length < -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                i13 = bVar.f5955k;
            }
            c3.c.a(materialDialog.f5933g, i13);
            int i15 = iArr[dialogAction.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    mDButton2 = materialDialog.f5939m;
                } else {
                    mDButton2 = materialDialog.f5941o;
                }
            } else {
                mDButton2 = materialDialog.f5940n;
            }
            mDButton2.setEnabled(!z11);
        }
        bVar.getClass();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
