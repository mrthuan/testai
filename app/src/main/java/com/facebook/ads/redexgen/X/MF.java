package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* loaded from: assets/audience_network.dex */
public class MF implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1199Vd A00;

    public MF(C1199Vd c1199Vd) {
        this.A00 = c1199Vd;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        dialogInterface.cancel();
    }
}
