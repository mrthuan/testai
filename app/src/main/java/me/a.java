package me;

import android.content.DialogInterface;
import eo.d;

/* compiled from: BaseRateDialog.java */
/* loaded from: classes.dex */
public final class a implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ oe.a f21992a;

    public a(d.a aVar) {
        this.f21992a = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        oe.a aVar = this.f21992a;
        if (aVar != null) {
            aVar.b();
            aVar.c();
        }
        dialogInterface.dismiss();
    }
}
