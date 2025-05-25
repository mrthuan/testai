package h5;

import android.database.Cursor;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import c6.h;
import c7.p;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.material.search.SearchView;
import com.lib.flutter.encrypt.FlutterAppApi;
import gf.b;
import h5.m;
import io.flutter.plugins.pathprovider.Messages;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lib.zj.office.pg.control.Presentation;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.x;
import p001if.b;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.SearchPDFWhenChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.a3;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditSearchActivity;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import x0.s0;
import x0.u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements m.a, h.a, p.a, u, b.d, b.c, b.a, cj.a, x, ro.d, androidx.activity.result.b, pdf.pdfreader.viewer.editor.free.utils.extension.e, ro.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18023b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f18022a = i10;
        this.f18023b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // c6.h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.io.File r18) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.e.a(java.io.File):void");
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        p pVar = (p) this.f18023b;
        Cursor cursor = (Cursor) obj;
        s6.b bVar = p.f5653f;
        pVar.getClass();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            pVar.d(i10, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    @Override // p001if.b.a
    public final boolean b(View view) {
        for (Class cls : (Class[]) this.f18023b) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        ReaderImg2PDFChooseActivity.l2((ReaderImg2PDFChooseActivity) this.f18023b, (Map) obj);
    }

    @Override // ro.b
    public final void d(Object obj, Object obj2) {
        SettingFragment settingFragment = (SettingFragment) this.f18023b;
        SettingFragment.a aVar = SettingFragment.f27957u0;
        kotlin.jvm.internal.g.e(settingFragment, ea.a.p("O2hYc10w", "WRhVMZOk"));
        settingFragment.f27974t0 = (a3.c) obj;
        settingFragment.f27962h0 = (PdfReaderOpenClearDialog) obj2;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.extension.e
    public final void e(Object obj) {
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = (pdf.pdfreader.viewer.editor.free.ui.frag.a) this.f18023b;
        List list = (List) obj;
        ro.c cVar = pdf.pdfreader.viewer.editor.free.ui.frag.a.f27997y0;
        aVar.getClass();
        if (list != null) {
            aVar.K0(ea.a.p("H0RG", "N1CPKEyQ"));
        }
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        int i10 = PDFPageView.f21175y1;
        pDFReaderView.k((ReaderPDFCore.FontInfo) this.f18023b);
    }

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        int i10 = this.f18022a;
        Object obj = this.f18023b;
        switch (i10) {
            case 14:
                SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = (SearchPDFWhenChooseActivity) obj;
                int i11 = SearchPDFWhenChooseActivity.f27034m0;
                kotlin.jvm.internal.g.e(searchPDFWhenChooseActivity, ea.a.p("R2gic1cw", "6KeQ90cz"));
                EditText editText = searchPDFWhenChooseActivity.f27041g0;
                if (editText != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "QKnL0OAZ"));
                    throw null;
                }
            default:
                ReaderEditSearchActivity readerEditSearchActivity = (ReaderEditSearchActivity) obj;
                String str = ReaderEditSearchActivity.f28303b0;
                readerEditSearchActivity.getClass();
                if (motionEvent != null && motionEvent.getActionMasked() == 0) {
                    try {
                        readerEditSearchActivity.c2();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // h5.m.a
    public final void h(o9.a aVar) {
        boolean z10;
        m appUpdateManager = (m) this.f18023b;
        kotlin.jvm.internal.g.e(appUpdateManager, "$appUpdateManager");
        if (aVar != null) {
            if (aVar.c == 11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g gVar = new g(appUpdateManager);
                try {
                    o9.b bVar = appUpdateManager.f18036a;
                    if (bVar != null) {
                        bVar.d(gVar);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                try {
                    o9.b bVar2 = appUpdateManager.f18036a;
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
        }
    }

    @Override // gf.b.d
    public final void i(Object obj) {
        cg.a aVar = (cg.a) this.f18023b;
        tf.c<gf.j> cVar = FlutterAppApi.c;
        kotlin.jvm.internal.g.e(aVar, ea.a.p("a2NQbBViVmNr", "efQsnVJg"));
        aVar.invoke();
    }

    @Override // cj.a
    public final int j() {
        return ((Presentation) this.f18023b).getRealSlideCount();
    }

    @Override // x0.u
    public final s0 m(View view, s0 s0Var) {
        int i10;
        int i11;
        int i12 = this.f18022a;
        Object obj = this.f18023b;
        switch (i12) {
            case 3:
                SearchView.a((SearchView) obj, s0Var);
                return s0Var;
            case 11:
                BaseSubscriptionActivity baseSubscriptionActivity = (BaseSubscriptionActivity) obj;
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                kotlin.jvm.internal.g.e(baseSubscriptionActivity, ea.a.p("R2gic1cw", "h8iqh2sa"));
                kotlin.jvm.internal.g.e(view, ea.a.p("dg==", "zwBA5OAU"));
                ea.a.p("L24FZRdz", "JMFvcqXP");
                o0.b a10 = s0Var.a(7);
                kotlin.jvm.internal.g.d(a10, ea.a.p("Wm44ZQdzTGcXdH1uGmUic2xXW24ibzRJsYDCQxptGmFHLh95A2VMcwtzQGUEQjdyNygbKQ==", "SdujY9Vi"));
                boolean hasWindowFocus = baseSubscriptionActivity.hasWindowFocus();
                int i13 = a10.f22640b;
                if (hasWindowFocus || i13 != 0) {
                    if (baseSubscriptionActivity.f19294h) {
                        i10 = 0;
                    } else {
                        i10 = a10.f22641d;
                    }
                    view.setPadding(a10.f22639a, 0, a10.c, i10);
                    Space i22 = baseSubscriptionActivity.i2();
                    ViewGroup.LayoutParams layoutParams = i22.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                        ((ViewGroup.MarginLayoutParams) bVar).height = i13;
                        i22.setLayoutParams(bVar);
                    } else {
                        throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuP25qbjxsBSA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3Q8YT5vPHRHdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTDF5KHU9UAhyLm1z", "IcOWPGIi"));
                    }
                }
                return s0Var;
            case 12:
                OCRPreviewActivity oCRPreviewActivity = (OCRPreviewActivity) obj;
                OCRPreviewActivity.a aVar2 = OCRPreviewActivity.f25092x;
                kotlin.jvm.internal.g.e(oCRPreviewActivity, ea.a.p("R2gic1cw", "8vwsjtSp"));
                kotlin.jvm.internal.g.e(view, ea.a.p("dg==", "1qFhecuK"));
                ea.a.p("Wm44ZQdz", "1wMS1vbN");
                if (oCRPreviewActivity.hasWindowFocus() || view.getPaddingBottom() == 0) {
                    o0.b a11 = s0Var.a(7);
                    kotlin.jvm.internal.g.d(a11, ea.a.p("Jm5CZQ1zGWc_dANuBmUccx1XB24hbxJJrYDvQwVtGmE7LmV5CWUZcyNzPmUYQglyRihHKQ==", "TGQ1OIjj"));
                    if (oCRPreviewActivity.f19294h) {
                        i11 = 0;
                    } else {
                        i11 = a11.f22641d;
                    }
                    view.setPadding(a11.f22639a, 0, a11.c, i11);
                }
                return s0Var;
            default:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj;
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "phyaR9NF"));
                kotlin.jvm.internal.g.e(view, ea.a.p("SGE-bwx5KG89c0ZwVXI2bV10N3JpMD4=", "HetPbEmV"));
                ea.a.p("Wm44ZQdz", "erK2X5rH");
                o0.b a12 = s0Var.a(7);
                kotlin.jvm.internal.g.d(a12, ea.a.p("Gm43ZSxzZWctdC9uR2UjcxBXO24tb0FJloDXQz5tMmEHLhB5KGVlczFzEmVZQjZySyh7KQ==", "OIsDXKJ7"));
                o0.b a13 = s0Var.a(2);
                kotlin.jvm.internal.g.d(a13, ea.a.p("PG4XZRxzZmctdC9uR2UjcxBXO24tb0FJloDXYSUuFnklZUpuCXYhZyl0D29aQjZySyh7KQ==", "MvUdhHph"));
                boolean z10 = officeReaderActivity.D1;
                int i14 = a12.f22640b;
                if ((z10 || i14 != 0) && !e1.f28647a && !officeReaderActivity.D2().d()) {
                    int i15 = officeReaderActivity.getResources().getConfiguration().orientation;
                    int i16 = a12.f22641d;
                    if (i15 == 2) {
                        if (officeReaderActivity.J0) {
                            ConstraintLayout constraintLayout = officeReaderActivity.f25976w;
                            if (constraintLayout != null) {
                                constraintLayout.setPadding(0, i14, 0, i16);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("UG8ldBJpDGVy", "OsY4oU0c"));
                                throw null;
                            }
                        } else {
                            ConstraintLayout constraintLayout2 = officeReaderActivity.f25976w;
                            if (constraintLayout2 != null) {
                                constraintLayout2.setPadding(0, 0, 0, 0);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("UG8ldBJpDGVy", "6FA8JSgK"));
                                throw null;
                            }
                        }
                    } else if (officeReaderActivity.J0) {
                        boolean z11 = officeReaderActivity.f19294h;
                        int i17 = a12.c;
                        int i18 = a12.f22639a;
                        if (!z11) {
                            ConstraintLayout constraintLayout3 = officeReaderActivity.f25976w;
                            if (constraintLayout3 != null) {
                                constraintLayout3.setPadding(i18, i14, i17, i16);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("LG9fdBhpWWVy", "MNWt4fbD"));
                                throw null;
                            }
                        } else {
                            ConstraintLayout constraintLayout4 = officeReaderActivity.f25976w;
                            if (constraintLayout4 != null) {
                                constraintLayout4.setPadding(i18 - a13.f22639a, i14 - a13.f22640b, i17 - a13.c, i16 - a13.f22641d);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("LG9fdBhpWWVy", "R33R1ooe"));
                                throw null;
                            }
                        }
                    } else {
                        ConstraintLayout constraintLayout5 = officeReaderActivity.f25976w;
                        if (constraintLayout5 != null) {
                            constraintLayout5.setPadding(0, 0, 0, 0);
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("LG9fdBhpWWVy", "Mfe38heb"));
                            throw null;
                        }
                    }
                }
                return s0Var;
        }
    }

    @Override // gf.b.c
    public final void n(Object obj, gf.a aVar) {
        Messages.StorageDirectory storageDirectory;
        Messages.a aVar2 = (Messages.a) this.f18023b;
        ArrayList<Object> arrayList = new ArrayList<>();
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.get(0) == null) {
            storageDirectory = null;
        } else {
            storageDirectory = Messages.StorageDirectory.values()[((Integer) arrayList2.get(0)).intValue()];
        }
        try {
            arrayList.add(0, ((io.flutter.plugins.pathprovider.a) aVar2).a(storageDirectory));
        } catch (Throwable th2) {
            arrayList = Messages.a(th2);
        }
        aVar.i(arrayList);
    }
}
