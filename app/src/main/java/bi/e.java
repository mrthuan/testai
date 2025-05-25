package bi;

import lib.zj.office.ss.control.Spreadsheet;
import lib.zj.office.system.f;

/* compiled from: Spreadsheet.java */
/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Spreadsheet f5441a;

    public e(Spreadsheet spreadsheet) {
        this.f5441a = spreadsheet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Spreadsheet spreadsheet = this.f5441a;
        ei.c o10 = spreadsheet.f20957j.o(spreadsheet.f20953f);
        f fVar = spreadsheet.f20956i;
        fVar.r(1073741824, spreadsheet.f20955h + " : " + o10.f16612m);
        spreadsheet.f20956i.r(26, Boolean.FALSE);
        spreadsheet.f20956i.r(536870922, null);
        spreadsheet.postInvalidate();
    }
}
