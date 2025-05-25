package c6;

import com.inmobi.media.E9;
import com.inmobi.media.Lc;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import jm.c;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5589a;

    public /* synthetic */ b(int i10) {
        this.f5589a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5589a) {
            case 0:
                com.facebook.appevents.iap.g.d();
                return;
            case 1:
                E9.a();
                return;
            case 2:
                Lc.b();
                return;
            case 3:
                FileRepository.f24155a.getClass();
                FileRepository.H();
                return;
            case 4:
                c.a.InterfaceC0260a interfaceC0260a = jm.c.f19316b;
                if (interfaceC0260a != null) {
                    interfaceC0260a.H();
                    return;
                }
                return;
            case 5:
                v.a();
                return;
            case 6:
                String str = OfficeReaderActivity.D2;
                v.b();
                return;
            case 7:
                ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
                bg.b.z0(new File(v.C(ea.a.p("G2hEbRtuVmls", "GJbCOR4d"))));
                return;
            default:
                ReaderImg2PDFConvertActivity.a aVar = ReaderImg2PDFConvertActivity.f27381i0;
                v.b();
                v.a();
                return;
        }
    }
}
