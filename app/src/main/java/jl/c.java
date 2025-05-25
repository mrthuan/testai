package jl;

import android.content.Intent;
import android.net.Uri;

/* compiled from: BaseActivity.java */
/* loaded from: classes3.dex */
public final class c implements xn.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f19310a;

    public c(a aVar) {
        this.f19310a = aVar;
    }

    @Override // xn.b
    public final void a() {
        a aVar = this.f19310a;
        if (aVar.f19292f.f27633d != 0) {
            try {
                Intent intent = new Intent();
                intent.setAction(ea.a.p("Lm5VchZpUy4pZT50HG4PcxtBPlAJSSZBGEkpTgZEB1QOSX1TJlNyVA5JBEdT", "AWpxLfYB"));
                intent.addFlags(1073741824);
                intent.addFlags(8388608);
                intent.setData(Uri.fromParts(ea.a.p("JGESaw1nZQ==", "etTqlYvc"), ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpAm89Lg1yDWU=", "ZuLzvOkh"), null));
                aVar.startActivityForResult(intent, 101);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            tn.a.b(aVar, ea.a.p("Q2U5bRpzEWkdbmsxMA==", "25VtTRjc"), ea.a.p("P2VDbRBzRGk1bnhfEm8bZUFfDWwsY2s=", "CbOpxGOy"));
        }
    }

    @Override // xn.b
    public final void b() {
    }
}
