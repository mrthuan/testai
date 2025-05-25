package di;

import android.os.Message;
import di.e;
import java.util.HashMap;
import lib.zj.office.system.q;

/* compiled from: AWorkbook.java */
/* loaded from: classes3.dex */
public final class d extends q {

    /* renamed from: a  reason: collision with root package name */
    public e f16205a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f16206b;

    public d(e eVar, e eVar2) {
        this.f16206b = eVar;
        this.f16205a = eVar2;
    }

    @Override // lib.zj.office.system.q
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 4) {
                this.f16205a = null;
                return;
            }
            return;
        }
        int intValue = ((Integer) message.obj).intValue();
        e eVar = this.f16206b;
        eVar.f16211o = intValue;
        HashMap hashMap = eVar.c;
        if (((ei.c) hashMap.get(Integer.valueOf(intValue))).j() != 2) {
            new e.a(this.f16205a, hashMap, eVar.f16211o, eVar.f16212p).start();
        }
    }
}
