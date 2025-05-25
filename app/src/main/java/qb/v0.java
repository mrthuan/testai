package qb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.media.C1705l2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f29273b;

    public /* synthetic */ v0(List list, int i10) {
        this.f29272a = i10;
        this.f29273b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = 0;
        switch (this.f29272a) {
            case 0:
                C1705l2.a(this.f29273b);
                return;
            case 1:
                List<PdfPreviewEntity> list = this.f29273b;
                FileRepository fileRepository = FileRepository.f24155a;
                kotlin.jvm.internal.g.e(list, ea.a.p("a2xYc3Q=", "jxjOtWXy"));
                ArrayList arrayList = new ArrayList();
                FileRepository.f24155a.getClass();
                int size = FileRepository.v().size();
                int size2 = FileRepository.z().size();
                int size3 = FileRepository.t().size();
                int size4 = FileRepository.x().size();
                for (PdfPreviewEntity pdfPreviewEntity : list) {
                    FileRepository.f24155a.getClass();
                    PdfPreviewEntity E = pdf.pdfreader.viewer.editor.free.utils.t0.E(FileRepository.r(), pdfPreviewEntity);
                    if (E != null) {
                        FileRepository.r().remove(E);
                        arrayList.add(E);
                        String otherStrOne = pdfPreviewEntity.getOtherStrOne();
                        if (otherStrOne != null) {
                            switch (otherStrOne.hashCode()) {
                                case 79058:
                                    if (otherStrOne.equals(ea.a.p("H0RG", "vNKVw36l"))) {
                                        FileRepository.v().remove(pdfPreviewEntity);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 79444:
                                    if (otherStrOne.equals(ea.a.p("Y1BU", "iSbYgJWj"))) {
                                        FileRepository.x().remove(pdfPreviewEntity);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 2670346:
                                    if (otherStrOne.equals(ea.a.p("ZE8ZRA==", "eOawEZ2L"))) {
                                        FileRepository.z().remove(pdfPreviewEntity);
                                        break;
                                    } else {
                                        continue;
                                    }
                                case 66411159:
                                    if (otherStrOne.equals(ea.a.p("dlgIRUw=", "SNTEO50X"))) {
                                        FileRepository.t().remove(pdfPreviewEntity);
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    FileRepository.f24155a.getClass();
                    if (size != FileRepository.v().size()) {
                        FileRepository.u().setValue(kotlin.collections.m.E0(FileRepository.v()));
                    }
                    if (size2 != FileRepository.z().size()) {
                        FileRepository.y().setValue(kotlin.collections.m.E0(FileRepository.z()));
                    }
                    if (size3 != FileRepository.t().size()) {
                        FileRepository.s().setValue(kotlin.collections.m.E0(FileRepository.t()));
                    }
                    if (size4 != FileRepository.x().size()) {
                        FileRepository.w().setValue(kotlin.collections.m.E0(FileRepository.x()));
                    }
                    FileRepository.q().setValue(kotlin.collections.m.E0(FileRepository.r()));
                    synchronized (FileRepository.j()) {
                        ((List) FileRepository.E.getValue()).addAll(arrayList);
                    }
                    boolean z11 = RecentAddRepository.f24181a;
                    Iterator it = arrayList.iterator();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (it.hasNext()) {
                        PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) it.next();
                        PdfPreviewEntity E2 = pdf.pdfreader.viewer.editor.free.utils.t0.E(RecentAddRepository.b(), pdfPreviewEntity2);
                        if (E2 != null && RecentAddRepository.b().remove(E2)) {
                            i10++;
                            String otherStrOne2 = pdfPreviewEntity2.getOtherStrOne();
                            if (otherStrOne2 != null) {
                                switch (otherStrOne2.hashCode()) {
                                    case 79058:
                                        if (otherStrOne2.equals(ea.a.p("H0RG", "jhPoTOte"))) {
                                            if (RecentAddRepository.h().remove(E2)) {
                                                i11++;
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    case 79444:
                                        if (otherStrOne2.equals(ea.a.p("Y1BU", "CTa8tv1Y"))) {
                                            if (RecentAddRepository.k().remove(E2)) {
                                                i14++;
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    case 2670346:
                                        if (otherStrOne2.equals(ea.a.p("GE9jRA==", "tfdsGkXk"))) {
                                            if (RecentAddRepository.n().remove(E2)) {
                                                i12++;
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    case 66411159:
                                        if (otherStrOne2.equals(ea.a.p("dlgIRUw=", "SVf7LeHW"))) {
                                            if (RecentAddRepository.e().remove(E2)) {
                                                i13++;
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                }
                            }
                        }
                    }
                    if (i10 > 0) {
                        RecentAddRepository.c().setValue(kotlin.collections.m.E0(RecentAddRepository.b()));
                        RecentAddRepository.d().setValue(Integer.valueOf(((Number) RecentAddRepository.d().b()).intValue() - i10));
                    }
                    if (i11 > 0) {
                        RecentAddRepository.i().setValue(kotlin.collections.m.E0(RecentAddRepository.h()));
                        RecentAddRepository.j().setValue(Integer.valueOf(((Number) RecentAddRepository.j().b()).intValue() - i11));
                    }
                    if (i12 > 0) {
                        RecentAddRepository.o().setValue(kotlin.collections.m.E0(RecentAddRepository.n()));
                        RecentAddRepository.p().setValue(Integer.valueOf(((Number) RecentAddRepository.p().b()).intValue() - i12));
                    }
                    if (i13 > 0) {
                        RecentAddRepository.f().setValue(kotlin.collections.m.E0(RecentAddRepository.e()));
                        RecentAddRepository.g().setValue(Integer.valueOf(((Number) RecentAddRepository.g().b()).intValue() - i13));
                    }
                    if (i14 > 0) {
                        RecentAddRepository.l().setValue(kotlin.collections.m.E0(RecentAddRepository.k()));
                        RecentAddRepository.m().setValue(Integer.valueOf(((Number) RecentAddRepository.m().b()).intValue() - i14));
                    }
                    FileRepository.f24155a.getClass();
                    if (!FileRepository.i().get()) {
                        FileRepository.o().execute(new com.facebook.appevents.h(4));
                        return;
                    }
                    return;
                }
                return;
            default:
                FileRepository fileRepository2 = FileRepository.f24155a;
                String p10 = ea.a.p("VWMgZQhrAGkkZXM=", "x1qHkFMl");
                List<PdfPreviewEntity> list2 = this.f29273b;
                kotlin.jvm.internal.g.e(list2, p10);
                SystemClock.elapsedRealtime();
                ArrayList arrayList2 = new ArrayList();
                boolean z12 = false;
                int i15 = 0;
                for (PdfPreviewEntity pdfPreviewEntity3 : list2) {
                    if (TextUtils.equals(pdfPreviewEntity3.getOtherStrOne(), ea.a.p("Y0RG", "YMiRFLKS"))) {
                        String path = pdfPreviewEntity3.getPath();
                        if (path != null && path.length() != 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!z10) {
                            File file = pdfPreviewEntity3.getFile();
                            if (file.exists()) {
                                if (pdfPreviewEntity3.getOtherIntOne() == 0 || file.lastModified() > pdfPreviewEntity3.getDate()) {
                                    try {
                                        try {
                                            ReaderPDFCore readerPDFCore = new ReaderPDFCore(ReaderPdfApplication.m(), pdfPreviewEntity3.getPath());
                                            pdfPreviewEntity3.setOtherBoolOne(readerPDFCore.needsPassword());
                                            readerPDFCore.onDestroy();
                                            i15++;
                                        } catch (Exception unused) {
                                            int i16 = pdf.pdfreader.viewer.editor.free.utils.d0.f28617a;
                                            ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
                                        }
                                        pdfPreviewEntity3.setOtherIntOne(1);
                                        pdfPreviewEntity3.setDate(file.lastModified());
                                        pdfPreviewEntity3.setSize(file.length());
                                        arrayList2.add(pdfPreviewEntity3);
                                        z12 = true;
                                    } catch (Throwable th2) {
                                        pdfPreviewEntity3.setOtherIntOne(1);
                                        pdfPreviewEntity3.setDate(file.lastModified());
                                        pdfPreviewEntity3.setSize(file.length());
                                        arrayList2.add(pdfPreviewEntity3);
                                        throw th2;
                                    }
                                }
                                if (i15 % 50 == 0 && i15 != 0) {
                                    bm.c.b(ReaderPdfApplication.m()).j(arrayList2);
                                    arrayList2.clear();
                                }
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    bm.c.b(ReaderPdfApplication.m()).j(arrayList2);
                }
                FileRepository fileRepository3 = FileRepository.f24155a;
                if (z12) {
                    fileRepository3.getClass();
                    ((androidx.lifecycle.w) FileRepository.f24168o.getValue()).k(Boolean.TRUE);
                }
                SystemClock.elapsedRealtime();
                fileRepository3.getClass();
                return;
        }
    }
}
