package bi;

import android.app.Activity;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.RelativeLayout;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import lib.zj.office.ss.control.ExcelView;
import lib.zj.office.ss.control.Spreadsheet;
import lib.zj.office.ss.sheetbar.SheetBar;
import lib.zj.office.system.h;
import lib.zj.office.system.i;
import lib.zj.office.system.r;

/* compiled from: SSControl.java */
/* loaded from: classes3.dex */
public final class a extends androidx.privacysandbox.ads.adservices.topics.d {

    /* renamed from: a  reason: collision with root package name */
    public final lib.zj.office.system.f f5419a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5420b;
    public final Spreadsheet c;

    /* renamed from: d  reason: collision with root package name */
    public final ExcelView f5421d;

    /* compiled from: SSControl.java */
    /* renamed from: bi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0040a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f5422a;

        public RunnableC0040a(Object obj) {
            this.f5422a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            lib.zj.office.system.f fVar;
            a aVar = a.this;
            if (!aVar.f5420b && (fVar = aVar.f5419a) != null && fVar.s() != null) {
                aVar.f5419a.s().l0(((Boolean) this.f5422a).booleanValue());
            }
        }
    }

    /* compiled from: SSControl.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f5424a;

        public b(Object obj) {
            this.f5424a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            lib.zj.office.system.f fVar;
            a aVar = a.this;
            if (!aVar.f5420b && (fVar = aVar.f5419a) != null && fVar.s() != null) {
                aVar.f5419a.s().n0((List) this.f5424a);
            }
        }
    }

    /* compiled from: SSControl.java */
    /* loaded from: classes3.dex */
    public class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f5426a;

        public c(Object obj) {
            this.f5426a = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            lib.zj.office.system.f fVar;
            a aVar = a.this;
            if (!aVar.f5420b && (fVar = aVar.f5419a) != null && fVar.s() != null) {
                aVar.f5419a.s().n0((List) this.f5426a);
            }
        }
    }

    /* compiled from: SSControl.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f5420b) {
                aVar.s().i();
                aVar.i();
            }
        }
    }

    /* compiled from: SSControl.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f5420b) {
                aVar.i();
            }
        }
    }

    /* compiled from: SSControl.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f5420b) {
                aVar.i();
            }
        }
    }

    /* compiled from: SSControl.java */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f5420b) {
                aVar.s().N();
            }
        }
    }

    public a(lib.zj.office.system.f fVar, ei.d dVar, String str) {
        this.f5419a = fVar;
        ExcelView excelView = new ExcelView(s().m(), str, dVar, this);
        this.f5421d = excelView;
        this.c = excelView.getSpreadsheet();
    }

    @Override // lib.zj.office.system.f
    public final void dispose() {
        Spreadsheet spreadsheet;
        a2.a aVar;
        this.f5420b = true;
        ExcelView excelView = this.f5421d;
        if (excelView == null && (spreadsheet = excelView.f20947b) != null) {
            oi.f fVar = spreadsheet.f20958k;
            if (fVar != null) {
                oi.b bVar = fVar.f23085l;
                if (bVar != null && (aVar = bVar.f23062f) != null) {
                    aVar.e();
                }
                ArrayList arrayList = fVar.f23093t;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            bi.c cVar = spreadsheet.f20959l;
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    @Override // lib.zj.office.system.f
    public final View getView() {
        return this.f5421d;
    }

    public final void i() {
        Spreadsheet spreadsheet = this.c;
        if (spreadsheet != null) {
            spreadsheet.post(new g());
        }
    }

    @Override // lib.zj.office.system.f
    public final Activity m() {
        return this.f5419a.s().m();
    }

    @Override // lib.zj.office.system.f
    public final sg.c n() {
        return this.f5419a.n();
    }

    @Override // lib.zj.office.system.f
    public final r o() {
        lib.zj.office.system.f fVar = this.f5419a;
        if (fVar == null) {
            return null;
        }
        return fVar.o();
    }

    @Override // lib.zj.office.system.f
    public final boolean p() {
        return this.f5419a.p();
    }

    @Override // lib.zj.office.system.f
    public final byte q() {
        return (byte) 1;
    }

    @Override // lib.zj.office.system.f
    public final void r(int i10, Object obj) {
        ih.a aVar;
        if (this.f5420b) {
            return;
        }
        Spreadsheet spreadsheet = this.c;
        lib.zj.office.system.f fVar = this.f5419a;
        ExcelView excelView = this.f5421d;
        int i11 = 0;
        switch (i10) {
            case -268435456:
                if (spreadsheet != null) {
                    spreadsheet.postInvalidate();
                    return;
                }
                return;
            case 19:
                if (excelView != null) {
                    Spreadsheet spreadsheet2 = excelView.f20947b;
                    int lastIndexOf = spreadsheet2.f20955h.lastIndexOf(File.separator);
                    if (lastIndexOf > 0) {
                        spreadsheet2.f20955h = spreadsheet2.f20955h.substring(lastIndexOf + 1);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(spreadsheet2.f20955h);
                    sb2.append(" : ");
                    ei.d dVar = spreadsheet2.f20957j;
                    sb2.append(dVar.o(0).f16612m);
                    String sb3 = sb2.toString();
                    lib.zj.office.system.f fVar2 = spreadsheet2.f20956i;
                    fVar2.r(1073741824, sb3);
                    if (spreadsheet2.f20958k == null) {
                        spreadsheet2.f20958k = new oi.f(spreadsheet2, dVar.o(0));
                    }
                    spreadsheet2.f20951d = true;
                    if (dVar.o(0).j() != 2) {
                        dVar.o(0).f16621v = spreadsheet2;
                        fVar2.r(26, Boolean.TRUE);
                    }
                    spreadsheet2.post(new bi.d(spreadsheet2));
                    spreadsheet2.postInvalidate();
                    if (excelView.f20946a) {
                        excelView.c = new SheetBar(excelView.getContext(), excelView.f20948d, excelView.getResources().getDisplayMetrics().widthPixels);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.addRule(12);
                        excelView.addView(excelView.c, layoutParams);
                    }
                    excelView.a();
                    return;
                }
                return;
            case 22:
                if (fVar != null && fVar.p() && s() != null && s().m() != null) {
                    s().m().onBackPressed();
                    return;
                }
                return;
            case 26:
                if (spreadsheet != null && spreadsheet.getParent() != null) {
                    spreadsheet.post(new RunnableC0040a(obj));
                    return;
                }
                return;
            case 27:
                if (spreadsheet != null && spreadsheet.getParent() != null) {
                    spreadsheet.post(new b(obj));
                    return;
                } else {
                    new c(obj).start();
                    return;
                }
            case 268435458:
                if (spreadsheet != null) {
                    ((ClipboardManager) s().m().getSystemService("clipboard")).setText(spreadsheet.getActiveCellContent());
                    return;
                }
                return;
            case 536870914:
                if (spreadsheet != null) {
                    r o10 = o();
                    String activeCellContent = spreadsheet.getActiveCellContent();
                    Activity m10 = s().m();
                    o10.getClass();
                    r.i(m10, activeCellContent);
                    return;
                }
                return;
            case 536870917:
                if (spreadsheet != null) {
                    spreadsheet.setZoom(((int[]) obj)[0] / 10000.0f);
                    spreadsheet.post(new d());
                    return;
                }
                return;
            case 536870919:
                i();
                return;
            case 536870920:
                if (spreadsheet != null && excelView != null) {
                    if (obj instanceof ih.a) {
                        aVar = (ih.a) obj;
                    } else {
                        aVar = null;
                    }
                    if (aVar == null) {
                        aVar = spreadsheet.getActiveCellHyperlink();
                    }
                    if (aVar != null) {
                        try {
                            int i12 = aVar.f18491a;
                            if (i12 == 2) {
                                String str = aVar.f18492b;
                                int indexOf = str.indexOf("!");
                                String replace = str.substring(0, indexOf).replace(OperatorName.SHOW_TEXT_LINE, "");
                                String substring = str.substring(indexOf + 1, str.length());
                                int x4 = aj.b.x(substring);
                                int q5 = aj.b.q(substring);
                                spreadsheet.getWorkbook().p(replace).n(x4, q5);
                                excelView.b(replace);
                                int i13 = x4 - 1;
                                int i14 = q5 - 1;
                                oi.f sheetView = spreadsheet.getSheetView();
                                if (i13 < 0) {
                                    i13 = 0;
                                }
                                if (i14 >= 0) {
                                    i11 = i14;
                                }
                                sheetView.i(i13, i11);
                                s().t(20, null);
                                spreadsheet.postInvalidate();
                            } else {
                                if (i12 != 3 && i12 != 1) {
                                    if (fVar != null) {
                                        fVar.r(17, "not supported hyperlink!");
                                    }
                                }
                                if (s() != null) {
                                    s().A0(aVar.f18492b);
                                }
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 536870921:
                if (fVar != null && fVar.v() != null) {
                    fVar.v().abortReader();
                    return;
                }
                return;
            case 536870922:
                if (spreadsheet != null) {
                    spreadsheet.post(new bi.b(this));
                    return;
                }
                return;
            case 536870925:
                if (spreadsheet != null && spreadsheet.getEventManage() != null) {
                    spreadsheet.getEventManage().onScroll(null, null, 0.0f, (-spreadsheet.getHeight()) + 10);
                    if (spreadsheet != null) {
                        spreadsheet.post(new bi.b(this));
                    }
                    spreadsheet.post(new e());
                    return;
                }
                return;
            case 536870926:
                if (spreadsheet != null && spreadsheet.getEventManage() != null) {
                    spreadsheet.getEventManage().onScroll(null, null, 0.0f, spreadsheet.getHeight() - 10);
                    if (spreadsheet != null) {
                        spreadsheet.post(new bi.b(this));
                    }
                    spreadsheet.post(new f());
                    return;
                }
                return;
            case 536870942:
                if (spreadsheet != null) {
                    spreadsheet.g();
                    return;
                }
                return;
            case 1073741825:
                if (excelView != null) {
                    int intValue = ((Integer) obj).intValue();
                    excelView.f20947b.h(intValue);
                    if (excelView.f20946a) {
                        excelView.c.a(intValue, false);
                        return;
                    } else {
                        excelView.f20948d.s().t(1073741828, Integer.valueOf(intValue));
                        return;
                    }
                }
                return;
            case 1073741829:
                if (excelView != null) {
                    excelView.f20946a = false;
                    excelView.removeView(excelView.c);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // lib.zj.office.system.f
    public final i s() {
        lib.zj.office.system.f fVar = this.f5419a;
        if (fVar == null) {
            return null;
        }
        return fVar.s();
    }

    @Override // lib.zj.office.system.f
    public final h t() {
        return this.c;
    }

    @Override // lib.zj.office.system.f
    public final sg.b u() {
        return this.f5419a.u();
    }

    @Override // lib.zj.office.system.f
    public final Object w(int i10) {
        Spreadsheet spreadsheet = this.c;
        if (spreadsheet == null) {
            return null;
        }
        switch (i10) {
            case 536870917:
                return Float.valueOf(spreadsheet.getZoom());
            case 536870918:
                return Float.valueOf(spreadsheet.getFitZoom());
            case 536870923:
                return Integer.valueOf(spreadsheet.getSheetCount());
            case 536870924:
                return Integer.valueOf(spreadsheet.getCurrentSheetNumber());
            case 536870928:
            case 536870936:
                return null;
            case 1073741826:
                Vector vector = new Vector();
                ei.d workbook = this.c.getWorkbook();
                int q5 = workbook.q();
                for (int i11 = 0; i11 < q5; i11++) {
                    vector.add(workbook.o(i11).f16612m);
                }
                return vector;
            case 1073741827:
                throw null;
            default:
                return null;
        }
    }

    @Override // lib.zj.office.system.f
    public final boolean x() {
        return this.f5420b;
    }

    @Override // lib.zj.office.system.f
    public final int z() {
        return this.f5421d.getCurrentViewIndex();
    }
}
