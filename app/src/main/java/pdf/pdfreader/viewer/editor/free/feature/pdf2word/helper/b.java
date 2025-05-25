package pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import androidx.activity.k;
import androidx.activity.r;
import androidx.appcompat.libconvert.ConvertCore;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import bm.c;
import com.google.android.play.core.assetpacks.b1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.utils.FileMimeTypeEnum;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import sn.d;

/* compiled from: PDF2WordHelper.kt */
/* loaded from: classes3.dex */
public final class b implements ConvertCore.ConvertCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25584a = 30;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f25585b;
    public final /* synthetic */ File c;

    public b(Activity activity, File file) {
        this.f25585b = activity;
        this.c = file;
    }

    @Override // androidx.appcompat.libconvert.ConvertCore.ConvertCallback
    public final void onCanceled(String str, String str2) {
        ea.a.p("H0R3Mi5vRWQSZSZwEHJWPj4=", "PddOGror");
        String str3 = n0.f28727a;
    }

    @Override // androidx.appcompat.libconvert.ConvertCore.ConvertCallback
    public final void onException(String str, String str2, Exception exc) {
        ea.a.p("Y0QNMiRvEGQ6ZVhwDHJoPj4=", "bmmDLd09");
        Objects.toString(exc);
        String str3 = n0.f28727a;
    }

    @Override // androidx.appcompat.libconvert.ConvertCore.ConvertCallback
    public final void onFailed(String str, String str2, ConvertCore.ConvertResult convertResult) {
        int i10;
        String str3 = NativeSoLoaderHelper.f1933a;
        Activity activity = this.f25585b;
        NativeSoLoaderHelper.Companion.d(activity);
        ea.a.p("CUQAMjxvAWQAZQpwUXJpPj4=", "E1YFksXq");
        String str4 = n0.f28727a;
        PDF2WordHelper.a aVar = PDF2WordHelper.f25579g;
        if (convertResult != null) {
            i10 = convertResult.getValue();
        } else {
            i10 = -200;
        }
        aVar.obtainMessage(2, Integer.valueOf(i10)).sendToTarget();
        if (convertResult == ConvertCore.ConvertResult.LowROM) {
            PDF2WordHelper.f25574a.getClass();
            w0.a().f28791b.execute(new k(activity, 28));
        }
    }

    @Override // androidx.appcompat.libconvert.ConvertCore.ConvertCallback
    public final void onFinally(String str, String str2, ConvertCore.ConvertResult convertResult) {
        if (!PDF2WordHelper.f25578f.get()) {
            String str3 = NativeSoLoaderHelper.f1933a;
            NativeSoLoaderHelper.Companion.d(this.f25585b);
        }
        ea.a.p("Y0QNMiRvEGQ6ZVhwDHJoPj4=", "dRByng0g");
        String str4 = n0.f28727a;
    }

    @Override // androidx.appcompat.libconvert.ConvertCore.ConvertCallback
    public final void onMessage(String str) {
        ea.a.p("G0QxMg9vFGQAZQpwUXJpPj4=", "mtKwXfvq");
        String str2 = n0.f28727a;
    }

    @Override // androidx.appcompat.libconvert.ConvertCore.ConvertCallback
    public final void onProgress(int i10, int i11) {
        ea.a.p("aUQpMjhvNGQAZQpwUXJpPj4=", "by9ooF9k");
        String str = n0.f28727a;
        PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
        int i12 = this.f25584a;
        companion.getClass();
        PDF2WordHelper.f25576d = (int) ((((i10 * 1.0f) / i11) * (95 - i12)) + i12);
        PDF2WordHelper.f25579g.sendEmptyMessage(1);
    }

    @Override // androidx.appcompat.libconvert.ConvertCore.ConvertCallback
    public final void onSuccess(String str, String str2, ConvertCore.ConvertData convertData) {
        String str3;
        ea.a.p("Y0QNMiRvEGQ6ZVhwDHJoPj4=", "scE7T3SW");
        String str4 = n0.f28727a;
        if (convertData != null) {
            PDF2WordHelper.f25574a.getClass();
        }
        String str5 = NativeSoLoaderHelper.f1933a;
        Activity activity = this.f25585b;
        NativeSoLoaderHelper.Companion.d(activity);
        File file = this.c;
        if (!file.exists()) {
            ea.a.p("Y0QNMiRvEGQ6ZVhwDHJoPj4=", "IA7H4Ji0");
            ea.a.p("Gm4rdVRjLXM7Plg-QGU6cH5pPmVpbll0VGUJaSJ0cw==", "e4ux7H9V");
            PDF2WordHelper.a aVar = PDF2WordHelper.f25579g;
            Message obtainMessage = aVar.obtainMessage(2);
            g.d(obtainMessage, ea.a.p("O3kEYTxkOWU6LgliQGE-bnVlIXMoZ1MoOVM2XxJPDFYTUhhfFEEcTA1EKQ==", "71VLRUDA"));
            obtainMessage.obj = -200;
            aVar.sendMessage(obtainMessage);
            return;
        }
        d d10 = d.d();
        Context m10 = ReaderPdfApplication.m();
        if (str2 == null) {
            str2 = "";
        }
        File file2 = new File(str2);
        String p10 = ea.a.p("UG8ldhZydA==", "7hlgiStk");
        a aVar2 = new a(activity, file);
        d10.getClass();
        Context applicationContext = m10.getApplicationContext();
        String str6 = d.c;
        boolean isEmpty = TextUtils.isEmpty(p10);
        String str7 = d.f29830b;
        if (!isEmpty) {
            str3 = r.g(a0.a.k(str7), File.separator, p10);
        } else {
            str3 = str7;
        }
        d.l(applicationContext, file2, FileMimeTypeEnum.DOCX.getMimeType(), str6, str3, file2.getName(), true, aVar2);
    }

    /* compiled from: PDF2WordHelper.kt */
    /* loaded from: classes3.dex */
    public static final class a implements sn.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f25586a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ File f25587b;

        public a(Activity activity, File file) {
            this.f25586a = activity;
            this.f25587b = file;
        }

        @Override // sn.a
        public final void a(Exception exc) {
            ea.a.p("H0R3Mi5vRWQSZSZwEHJWPj4=", "EexWvpUk");
            Objects.toString(exc);
            String str = n0.f28727a;
            PDF2WordHelper.a aVar = PDF2WordHelper.f25579g;
            Message obtainMessage = aVar.obtainMessage(2);
            g.d(obtainMessage, ea.a.p("XnkDYR1kDmUALltiHWE_bgllQXMnZyYoPlMmXzJPNFZ2Uh9fNUErTDdEKQ==", "saqz2xPx"));
            obtainMessage.obj = -200;
            aVar.sendMessage(obtainMessage);
            try {
                this.f25587b.delete();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // sn.a
        public final void b(String str) {
            pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
            if (str == null) {
                str = "";
            }
            StorageFileObserver.b(str);
        }

        @Override // sn.a
        public final void c(String str) {
            ea.a.p("H0R3Mi5vRWQSZSZwEHJWPj4=", "Ri46l1j8");
            String str2 = n0.f28727a;
            File file = new File(str);
            if (file.exists()) {
                b1.Y();
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("FG8KZTpwNm8_XwJvWmU=", "idwxeBIq"));
                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                pdfPreviewEntity.setDate(file.lastModified());
                pdfPreviewEntity.setPath(file.getAbsolutePath());
                pdfPreviewEntity.setSize(file.length());
                pdfPreviewEntity.setName(bg.b.B0(file));
                pdfPreviewEntity.setOtherStrOne(ea.a.p("GE9jRA==", "1ixXLUGX"));
                c.b(this.f25586a).f(ge.a.H(pdfPreviewEntity), new C0345a(str, pdfPreviewEntity));
            }
        }

        /* compiled from: PDF2WordHelper.kt */
        /* renamed from: pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0345a implements c.InterfaceC0042c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f25588a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PdfPreviewEntity f25589b;

            public C0345a(String str, PdfPreviewEntity pdfPreviewEntity) {
                this.f25588a = str;
                this.f25589b = pdfPreviewEntity;
            }

            @Override // bm.c.InterfaceC0042c
            public final void b(ArrayList arrayList) {
                String str;
                PdfPreviewEntity pdfPreviewEntity = this.f25589b;
                if (!arrayList.isEmpty()) {
                    str = ((PdfPreviewEntity) arrayList.get(0)).getPath();
                } else {
                    str = this.f25588a;
                }
                pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
                Context m10 = ReaderPdfApplication.m();
                g.d(m10, ea.a.p("VGU_SR1zFmEcY1EoKQ==", "BrZS8ghF"));
                g.d(str, ea.a.p("Q2E_aDVvEERi", "TLYSXZqx"));
                StorageFileObserver.c(m10, str, true);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) it.next();
                    dp.a a10 = dp.a.a();
                    a10.getClass();
                    dp.a.c("convert insert database id is:" + pdfPreviewEntity2.getId());
                    FileRepository.I(pdfPreviewEntity2);
                }
                try {
                    v.b();
                } finally {
                    PDF2WordHelper.f25579g.obtainMessage(0, pdfPreviewEntity).sendToTarget();
                }
            }

            @Override // bm.c.InterfaceC0042c
            public final void a() {
            }
        }
    }
}
