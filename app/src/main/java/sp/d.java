package sp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29846a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f29847b;

    public /* synthetic */ d(h hVar, int i10) {
        this.f29846a = i10;
        this.f29847b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f29846a;
        h hVar = this.f29847b;
        switch (i16) {
            case 0:
                hVar.g();
                return;
            default:
                boolean z10 = hVar.f29867q;
                f fVar = hVar.f29852a;
                e eVar = hVar.f29856f;
                String str = hVar.f29854d;
                Activity activity = hVar.f29853b;
                if (z10) {
                    try {
                        File file = new File(str);
                        bg.b.z0(file);
                        file.mkdirs();
                        int lastIndexOf = hVar.f29862l.lastIndexOf(ea.a.p("Lg==", "fcHFzpg2"));
                        String str2 = hVar.f29862l;
                        if (lastIndexOf > 0) {
                            str2 = str2.substring(0, lastIndexOf);
                        }
                        String str3 = file.getAbsoluteFile() + File.separator + str2 + ea.a.p("Lg==", "z1DcgOjM") + ea.a.p("MWRm", "F1AkCHv7");
                        File file2 = new File(str3);
                        if (file2.exists()) {
                            file2.delete();
                        }
                        hVar.f29868r = 1;
                        ea.a.p("QGE9ZSNEJCAXbkBlcg==", "30HCMpPY");
                        hVar.f29859i = false;
                        qp.b bVar = new qp.b(activity, activity.getCacheDir().getAbsolutePath(), str3);
                        Rectangle b10 = fVar.b();
                        if (b10 != null && (i10 = b10.width) != 0 && (i11 = b10.height) != 0) {
                            c cVar = new c(Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888), bVar);
                            cVar.drawColor(-1);
                            fVar.a(cVar, hVar);
                            ea.a.p("V3Iqd1NkDW4XIA==", "jUF5AOyl");
                            Objects.toString(activity.getResources().getDisplayMetrics());
                            ReaderPDFCore readerPDFCore = bVar.f29416e;
                            if (readerPDFCore != null) {
                                i12 = readerPDFCore.countPages();
                            } else {
                                i12 = 1;
                            }
                            hVar.f29868r = i12;
                            if (bVar.f29420i != bVar.f29418g) {
                                bVar.d(false);
                                bVar.c();
                            } else {
                                bVar.c();
                                ReaderPDFCore readerPDFCore2 = bVar.f29416e;
                                if (readerPDFCore2 != null) {
                                    readerPDFCore2.onDestroy();
                                    bVar.f29416e = null;
                                }
                            }
                            if (!hVar.f29858h && eVar != null) {
                                hVar.f29863m = str3;
                                eVar.removeCallbacksAndMessages(null);
                                eVar.sendEmptyMessage(4100);
                            }
                        }
                        ea.a.p("PGFHZSlEcSA5bC9hG0MJY11lKGkpZXM=", "DCPClYh2");
                        bVar.b();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        if (eVar != null) {
                            Message obtainMessage = eVar.obtainMessage(4099);
                            obtainMessage.arg1 = -1;
                            obtainMessage.obj = e10;
                            eVar.sendMessage(obtainMessage);
                        }
                    }
                    hVar.f29859i = true;
                    hVar.a(true);
                    return;
                }
                try {
                    Context m10 = ReaderPdfApplication.m();
                    ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
                    File file3 = new File(v.B(m10, ea.a.p("DG9fdhxydA==", "EjKD6x1e")));
                    bg.b.z0(file3);
                    file3.mkdirs();
                    int lastIndexOf2 = hVar.f29862l.lastIndexOf(ea.a.p("Lg==", "UNUClrl5"));
                    String str4 = hVar.f29862l;
                    if (lastIndexOf2 > 0) {
                        str4 = str4.substring(0, lastIndexOf2);
                    }
                    String str5 = str + str4 + ea.a.p("Lg==", "vj5wsd6h") + ea.a.p("P2Rm", "tYE3IVBK");
                    while (v.G(str5)) {
                        str5 = h.d(str5);
                    }
                    String name = new File(str5).getName();
                    int lastIndexOf3 = name.lastIndexOf(ea.a.p("Lg==", "jDsOeAtG"));
                    if (lastIndexOf3 > 0) {
                        name = name.substring(0, lastIndexOf3);
                    }
                    String str6 = file3.getAbsoluteFile() + File.separator + name + ea.a.p("Lg==", "Xsp0XLWG") + ea.a.p("Q2Rm", "patslucp");
                    File file4 = new File(str6);
                    if (file4.exists()) {
                        file4.delete();
                    }
                    hVar.f29868r = 1;
                    ea.a.p("PGFHZSlEcSA_bj5lcg==", "x8UtLQAN");
                    hVar.f29859i = false;
                    qp.b bVar2 = new qp.b(activity, activity.getCacheDir().getAbsolutePath(), str6);
                    Rectangle b11 = fVar.b();
                    if (b11 != null && (i13 = b11.width) != 0 && (i14 = b11.height) != 0) {
                        c cVar2 = new c(Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888), bVar2);
                        cVar2.drawColor(-1);
                        fVar.a(cVar2, hVar);
                        ea.a.p("K3JQd1lkWG4_IA==", "hmfRYhYd");
                        Objects.toString(activity.getResources().getDisplayMetrics());
                        ReaderPDFCore readerPDFCore3 = bVar2.f29416e;
                        if (readerPDFCore3 != null) {
                            i15 = readerPDFCore3.countPages();
                        } else {
                            i15 = 1;
                        }
                        hVar.f29868r = i15;
                        if (bVar2.f29420i != bVar2.f29418g) {
                            bVar2.d(false);
                            bVar2.c();
                        } else {
                            bVar2.c();
                            ReaderPDFCore readerPDFCore4 = bVar2.f29416e;
                            if (readerPDFCore4 != null) {
                                readerPDFCore4.onDestroy();
                                bVar2.f29416e = null;
                            }
                        }
                        if (!hVar.f29858h) {
                            sn.d d10 = sn.d.d();
                            File file5 = new File(str6);
                            String p10 = ea.a.p("LG9fdhxydA==", "p4nMvRie");
                            g gVar = new g(hVar);
                            d10.getClass();
                            sn.d.k(activity, file5, p10, gVar);
                        }
                    }
                    ea.a.p("NWFCZWdEKyArbANhWkM2Y1BlFGklZXM=", "ovF47mIh");
                    bVar2.b();
                } catch (Exception e11) {
                    e11.printStackTrace();
                    if (eVar != null) {
                        Message obtainMessage2 = eVar.obtainMessage(4099);
                        obtainMessage2.arg1 = -1;
                        obtainMessage2.obj = e11;
                        eVar.sendMessage(obtainMessage2);
                    }
                }
                hVar.f29859i = true;
                hVar.a(true);
                return;
        }
    }
}
