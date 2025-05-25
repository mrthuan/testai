package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.a;
import androidx.fragment.app.g0;
import androidx.fragment.app.m;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public class SupportErrorDialogFragment extends m {

    /* renamed from: o0  reason: collision with root package name */
    public Dialog f10894o0;

    /* renamed from: p0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f10895p0;

    /* renamed from: q0  reason: collision with root package name */
    public AlertDialog f10896q0;

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10895p0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.m
    public final Dialog q0() {
        Dialog dialog = this.f10894o0;
        if (dialog == null) {
            this.f3855f0 = false;
            if (this.f10896q0 == null) {
                Context r4 = r();
                Preconditions.j(r4);
                this.f10896q0 = new AlertDialog.Builder(r4).create();
            }
            return this.f10896q0;
        }
        return dialog;
    }

    public final void s0(g0 g0Var, String str) {
        this.f3861l0 = false;
        this.f3862m0 = true;
        g0Var.getClass();
        a aVar = new a(g0Var);
        aVar.f3911o = true;
        aVar.c(0, this, str, 1);
        aVar.h(false);
    }
}
