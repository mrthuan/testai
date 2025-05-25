package pdf.pdfreader.viewer.editor.free.merge;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import industries.deepthought.decode.Decoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.d;
import pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver;

/* compiled from: BaseMergeActivity.kt */
/* loaded from: classes3.dex */
public abstract class BaseMergeActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a implements ReaderActBroadCastReceiver.a {
    public final Handler I;
    public ReaderActBroadCastReceiver<BaseMergeActivity> J;

    public BaseMergeActivity() {
        kotlin.a.a(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.BaseMergeActivity$progressDialog$2
            {
                super(0);
            }

            @Override // cg.a
            public final d invoke() {
                d dVar = new d(BaseMergeActivity.this, false);
                dVar.a(R.string.arg_res_0x7f1303a6);
                return dVar;
            }
        });
        this.I = new Handler(Looper.getMainLooper());
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver.a
    public final void d0(String str, Intent intent) {
        if (g.a(str, ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpIW9HLgJyVWUdQQhUOk8sXz5PdUQ2Rh9MAV9xTwtQD0UBRQ==", "U5d0SXw2"))) {
            if (!RecentAddRepository.f24181a) {
                FileRepository.A(this, new a(this));
                return;
            }
            FileRepository.f24155a.getClass();
            m2(FileRepository.m());
        } else if (g.a(str, ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpG285LhVyVWUdQQhUOk8sXzpPeUU2VB5VCUJhXwVPDlAjRR9F", "oKs01LMw"))) {
            l2();
        }
    }

    public abstract void m2(List<? extends PdfPreviewEntity> list);

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        char c;
        char c10;
        super.onCreate(bundle);
        if (Decoder.f18572a) {
            try {
                String substring = td.a.b(this).substring(385, TTAdConstant.PACKAGE_NAME_CODE);
                g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "03131333130333935325a3074310b30".getBytes(charset);
                g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                long j10 = 2;
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt = td.a.f30000a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c10 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c10 = 0;
                            break;
                        }
                    }
                    if ((c10 ^ 0) != 0) {
                        td.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    td.a.a();
                    throw null;
                }
                try {
                    String substring2 = jc.a.b(this).substring(477, 508);
                    g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Charset charset2 = kotlin.text.a.f19966b;
                    byte[] bytes3 = substring2.getBytes(charset2);
                    g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bytes4 = "1311630140603550407130d4d6f756e".getBytes(charset2);
                    g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                    if (System.currentTimeMillis() % j10 == 0) {
                        int nextInt2 = jc.a.f19172a.nextInt(0, bytes3.length / 2);
                        int i11 = 0;
                        while (true) {
                            if (i11 <= nextInt2) {
                                if (bytes3[i11] != bytes4[i11]) {
                                    c = 16;
                                    break;
                                }
                                i11++;
                            } else {
                                c = 0;
                                break;
                            }
                        }
                        if ((c ^ 0) != 0) {
                            jc.a.a();
                            throw null;
                        }
                    } else if (!Arrays.equals(bytes4, bytes3)) {
                        jc.a.a();
                        throw null;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    jc.a.a();
                    throw null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                td.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        ReaderActBroadCastReceiver<BaseMergeActivity> readerActBroadCastReceiver = new ReaderActBroadCastReceiver<>(this);
        IntentFilter intentFilter = new IntentFilter(ea.a.p("PmQOLkdkUXItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2VgQStUfk95XwBPK0VrVB9VdUIBXwpPe1A4RSVF", "mkNh77VY"));
        intentFilter.addAction(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpNW88LjVyPWUdQQhUOk8sXz5PdUQ2Rh9MAV9xTwtQD0UVRQ==", "ANSX48pU"));
        p1.a.a(this).b(readerActBroadCastReceiver, intentFilter);
        this.J = readerActBroadCastReceiver;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ReaderActBroadCastReceiver<BaseMergeActivity> readerActBroadCastReceiver = this.J;
        if (readerActBroadCastReceiver != null) {
            p1.a.a(this).d(readerActBroadCastReceiver);
        }
    }

    public void l2() {
    }
}
