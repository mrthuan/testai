package me;

import android.content.DialogInterface;
import eo.d;

/* compiled from: BaseRateDialog.java */
/* loaded from: classes.dex */
public final class c implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ oe.a f21996a;

    public c(d.a aVar) {
        this.f21996a = aVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        oe.a aVar = this.f21996a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
