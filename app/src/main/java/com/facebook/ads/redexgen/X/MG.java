package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public class MG implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C1199Vd A01;

    public MG(C1199Vd c1199Vd, EditText editText) {
        this.A01 = c1199Vd;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new C1200Ve(this, dialogInterface));
    }
}
