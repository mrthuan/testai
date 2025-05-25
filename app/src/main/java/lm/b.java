package lm;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.emoji2.text.h;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.s;
import pdf.pdfreader.viewer.editor.free.ui.act.w;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import qb.e0;
import u.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21763a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f21764b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f21765d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f21766e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f21767f;

    public /* synthetic */ b(Context context, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21763a = i10;
        this.f21764b = context;
        this.c = obj;
        this.f21765d = obj2;
        this.f21766e = obj3;
        this.f21767f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        FileOutputStream fileOutputStream;
        Runnable wVar;
        int i11;
        int i12 = this.f21763a;
        boolean z10 = false;
        Object obj = this.f21767f;
        Object obj2 = this.f21766e;
        Object obj3 = this.f21765d;
        Object obj4 = this.c;
        Context ctx = this.f21764b;
        switch (i12) {
            case 0:
                Bitmap bitmap = (Bitmap) obj4;
                cg.a aVar = (cg.a) obj2;
                cg.a aVar2 = (cg.a) obj;
                kotlin.jvm.internal.g.e(bitmap, ea.a.p("F3Iucxx1EGNl", "peU0LbNJ"));
                kotlin.jvm.internal.g.e((c) obj3, ea.a.p("R2gic1cw", "2CD15FNn"));
                try {
                    kotlin.jvm.internal.g.e(ctx, "ctx");
                    File file = new File(v.i(ctx.getApplicationContext()), ea.a.p("Y0QNUhZhBmUAX3VJNm0_biAuWHBn", "PJSfSYjJ"));
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        dp.a.a().getClass();
                        dp.a.d(ctx, e10);
                        file = null;
                    }
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        o9.d.l(fileOutputStream, null);
                        if (file != null) {
                            e1.d(ctx, file);
                        } else if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        if (aVar != null) {
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            o9.d.l(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } finally {
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            case 1:
                ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) ctx;
                ArrayList arrayList = (ArrayList) obj4;
                WeakReference weakReference = (WeakReference) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Handler handler = (Handler) obj;
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                try {
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        boolean z11 = false;
                        while (it.hasNext()) {
                            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
                            try {
                                if (new ReaderPDFCore((Context) weakReference.get(), pdfPreviewEntity.getPath()).needsPassword()) {
                                    PdfPreviewEntity l10 = aj.b.l(pdfPreviewEntity);
                                    arrayList2.add(l10);
                                    arrayList3.add(new MergePdfData(l10, true, "", pdfPreviewEntity.getId()));
                                } else {
                                    arrayList3.add(new MergePdfData(aj.b.l(pdfPreviewEntity), false, "", pdfPreviewEntity.getId()));
                                }
                            } catch (Exception unused) {
                                z11 = true;
                            }
                        }
                        if (z11) {
                            if (arrayList3.isEmpty()) {
                                i11 = R.string.arg_res_0x7f1303ec;
                            } else {
                                i11 = R.string.arg_res_0x7f130408;
                            }
                            handler.post(new u1.a(readerHomeActivity, weakReference, i11));
                        }
                        if (!arrayList3.isEmpty()) {
                            if (arrayList2.isEmpty()) {
                                tn.a.d(readerHomeActivity, ea.a.p("XmU5Z2U=", "YzsISFuH"), ea.a.p("DmUBZxRfH2gndw==", "secsqlV3"), ea.a.p("UGgkbwBl", "RkrVo5uo"), false);
                                readerHomeActivity.B1 = 1;
                                handler.post(new h(9, readerHomeActivity, weakReference, arrayList3));
                            } else {
                                handler.post(new e0(5, readerHomeActivity, weakReference, arrayList2, arrayList3));
                            }
                        }
                        wVar = new pdf.pdfreader.viewer.editor.free.ui.act.v(readerHomeActivity, 1);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        o9.d.s(ea.a.p("K28KZTVlH2ctUAJm", "8qCgxmlk"), e11.toString());
                        wVar = new w(readerHomeActivity, 2);
                    }
                    handler.post(wVar);
                    return;
                } catch (Throwable th4) {
                    handler.post(new s(readerHomeActivity, 3));
                    throw th4;
                }
            default:
                ReaderSearchActivity readerSearchActivity = (ReaderSearchActivity) ctx;
                ArrayList arrayList4 = (ArrayList) obj4;
                WeakReference weakReference2 = (WeakReference) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                Handler handler2 = (Handler) obj;
                String str2 = ReaderSearchActivity.f26794c0;
                readerSearchActivity.getClass();
                try {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) it2.next();
                            try {
                                if (new ReaderPDFCore((Context) weakReference2.get(), pdfPreviewEntity2.getPath()).needsPassword()) {
                                    PdfPreviewEntity l11 = aj.b.l(pdfPreviewEntity2);
                                    arrayList5.add(l11);
                                    arrayList6.add(new MergePdfData(l11, true, "", pdfPreviewEntity2.getId()));
                                } else {
                                    arrayList6.add(new MergePdfData(aj.b.l(pdfPreviewEntity2), false, "", pdfPreviewEntity2.getId()));
                                }
                            } catch (Exception unused2) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            if (arrayList6.isEmpty()) {
                                if (arrayList4.size() > 1) {
                                    i10 = R.string.arg_res_0x7f1303ec;
                                } else {
                                    i10 = R.string.arg_res_0x7f130409;
                                }
                            } else {
                                i10 = R.string.arg_res_0x7f130408;
                            }
                            handler2.post(new j(readerSearchActivity, weakReference2, i10));
                        }
                        if (!arrayList6.isEmpty()) {
                            if (arrayList5.isEmpty()) {
                                tn.a.b(readerSearchActivity, ea.a.p("ImVDZ2U=", "jboI4yWY"), ea.a.p("EWgab0plIGkkZTlzUWElY1BfNm8nZQ==", "iKru9FQg"));
                                DataBridge.a().addAll(arrayList6);
                                readerSearchActivity.e2();
                                readerSearchActivity.finish();
                            } else {
                                handler2.post(new a7.a(3, readerSearchActivity, weakReference2, arrayList5, arrayList6));
                            }
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    return;
                } finally {
                    readerSearchActivity.K.sendEmptyMessage(2);
                }
        }
    }
}
