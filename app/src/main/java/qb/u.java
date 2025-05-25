package qb;

import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.inmobi.media.Rb;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.FileMimeTypeEnum;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29264a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f29265b;

    public /* synthetic */ u(Context context, int i10) {
        this.f29264a = i10;
        this.f29265b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10;
        int i11;
        String[] strArr;
        ArrayList arrayList;
        String str2;
        String[] strArr2;
        PdfPreviewEntity pdfPreviewEntity;
        String str3;
        String string;
        long j10;
        long j11;
        int i12 = this.f29264a;
        Context context = this.f29265b;
        switch (i12) {
            case 0:
                Rb.b(context);
                return;
            default:
                FileRepository fileRepository = FileRepository.f24155a;
                kotlin.jvm.internal.g.e(context, ea.a.p("YGMnbgBlM3Q=", "lgDHtKxZ"));
                String p10 = ea.a.p("qryx5d6L0Ynx5sWPkKr65IiTi7qT", "2FVJue3D");
                FileRepository.f24155a.getClass();
                FileRepository.G(p10);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String[] strArr3 = pdf.pdfreader.viewer.editor.free.utils.e0.f28646a;
                String str4 = "bGQqdGE=";
                String[] strArr4 = {ea.a.p("bGQqdGE=", "wjGDz2da"), ea.a.p("K2FFZSZtWGQzZiNlZA==", "AogFDKog"), ea.a.p("EHNYemU=", "rUflhXEW")};
                StringBuilder sb2 = new StringBuilder(ea.a.p("DmkIZRB0MXAtIFs_", "hXceOHvB"));
                String[] strArr5 = {FileMimeTypeEnum.PDF.getMimeType(), FileMimeTypeEnum.DOC.getMimeType(), FileMimeTypeEnum.DOCX.getMimeType(), FileMimeTypeEnum.DOT.getMimeType(), FileMimeTypeEnum.DOTX.getMimeType(), FileMimeTypeEnum.DOTM.getMimeType(), FileMimeTypeEnum.XLS.getMimeType(), FileMimeTypeEnum.XLSX.getMimeType(), FileMimeTypeEnum.XLT.getMimeType(), FileMimeTypeEnum.XLTX.getMimeType(), FileMimeTypeEnum.XLTM.getMimeType(), FileMimeTypeEnum.XLSM.getMimeType(), FileMimeTypeEnum.PPT.getMimeType(), FileMimeTypeEnum.PPTX.getMimeType(), FileMimeTypeEnum.POT.getMimeType(), FileMimeTypeEnum.PPTM.getMimeType(), FileMimeTypeEnum.POTX.getMimeType(), FileMimeTypeEnum.POTM.getMimeType()};
                for (int i13 = 0; i13 < 17; i13++) {
                    sb2.append(ea.a.p("ZE81IA5pIWUXdB9wUSBqPw==", "XwDgcL7U"));
                }
                sb2.append(ea.a.p("b0F_RFlfRGkgZWo-VTA=", "zfPPMQcp"));
                String sb3 = sb2.toString();
                kotlin.jvm.internal.g.d(sb3, ea.a.p("O2UIZQh0L28mUwQuQG8EdEppPGdhKQ==", "DWHdkFYi"));
                ArrayList arrayList2 = new ArrayList();
                String[] strArr6 = pdf.pdfreader.viewer.editor.free.utils.e0.f28646a;
                int length = strArr6.length;
                int i14 = 0;
                while (i14 < length) {
                    try {
                        i10 = i14;
                        i11 = length;
                        strArr = strArr6;
                        arrayList = arrayList2;
                        str2 = sb3;
                    } catch (Exception e10) {
                        e = e10;
                        str = str4;
                        i10 = i14;
                        i11 = length;
                        strArr = strArr6;
                        arrayList = arrayList2;
                        str2 = sb3;
                    }
                    try {
                        Cursor query = context.getContentResolver().query(MediaStore.Files.getContentUri(strArr6[i14]), strArr4, sb3, strArr5, null);
                        if (query != null) {
                            while (query.moveToNext()) {
                                try {
                                    pdfPreviewEntity = new PdfPreviewEntity();
                                    int columnIndex = query.getColumnIndex(ea.a.p(str4, "m4Lcpd54"));
                                    str3 = "";
                                    if (columnIndex <= -1) {
                                        string = "";
                                    } else {
                                        try {
                                            string = query.getString(columnIndex);
                                            kotlin.jvm.internal.g.d(string, ea.a.p("UHU5cxxyTGcXdGd0G2k4Z2xwU3QuSS1kNHgp", "QAiaxcB7"));
                                        } catch (Throwable th2) {
                                            th = th2;
                                            str = str4;
                                            strArr2 = strArr4;
                                            throw th;
                                            break;
                                        }
                                    }
                                    if (!TextUtils.isEmpty(string)) {
                                        String str5 = File.separator;
                                        kotlin.jvm.internal.g.d(str5, ea.a.p("PGVBYQthQ29y", "8DzsiFcZ"));
                                        str3 = kotlin.text.k.m0(kotlin.text.k.l0(string, str5, string), ea.a.p("Lg==", "DEIuipor"));
                                    }
                                    int columnIndex2 = query.getColumnIndex(ea.a.p("K2FFZSZtWGQzZiNlZA==", "C4vhze4c"));
                                    long j12 = -1;
                                    if (columnIndex2 > -1) {
                                        j10 = query.getLong(columnIndex2);
                                    } else {
                                        j10 = -1;
                                    }
                                    int columnIndex3 = query.getColumnIndex(ea.a.p("bHMiemU=", "345L1qSm"));
                                    if (columnIndex3 > -1) {
                                        j12 = query.getLong(columnIndex3);
                                    }
                                    str = str4;
                                    strArr2 = strArr4;
                                    j11 = j12;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(str3) && j10 > 0 && j11 > 0 && aj.b.H(string)) {
                                        pdfPreviewEntity.setPath(string);
                                        pdfPreviewEntity.setName(str3);
                                        pdfPreviewEntity.setSize(j11);
                                        if (j10 < 9999999999L) {
                                            pdfPreviewEntity.setDate(j10 * 1000);
                                        } else {
                                            pdfPreviewEntity.setDate(j10);
                                        }
                                        pdfPreviewEntity.setOtherStrOne(aj.b.P(string));
                                        arrayList.add(pdfPreviewEntity);
                                    } else {
                                        File file = new File(string);
                                        if (com.google.android.play.core.assetpacks.b1.N(file) || com.google.android.play.core.assetpacks.b1.Q(file) || com.google.android.play.core.assetpacks.b1.M(file) || com.google.android.play.core.assetpacks.b1.O(file)) {
                                            pdfPreviewEntity.setPath(string);
                                            pdfPreviewEntity.setName(bg.b.B0(file));
                                            pdfPreviewEntity.setSize(file.length());
                                            pdfPreviewEntity.setDate(file.lastModified());
                                            pdfPreviewEntity.setOtherStrOne(pdf.pdfreader.viewer.editor.free.utils.v.y(file));
                                            arrayList.add(pdfPreviewEntity);
                                        }
                                    }
                                    str4 = str;
                                    strArr4 = strArr2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw th;
                                }
                            }
                            str = str4;
                            strArr2 = strArr4;
                            tf.d dVar = tf.d.f30009a;
                            try {
                                o9.d.l(query, null);
                            } catch (Exception e11) {
                                e = e11;
                                e.printStackTrace();
                                i14 = i10 + 1;
                                str4 = str;
                                strArr4 = strArr2;
                                arrayList2 = arrayList;
                                length = i11;
                                strArr6 = strArr;
                                sb3 = str2;
                            }
                        } else {
                            str = str4;
                            strArr2 = strArr4;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = str4;
                        strArr2 = strArr4;
                        e.printStackTrace();
                        i14 = i10 + 1;
                        str4 = str;
                        strArr4 = strArr2;
                        arrayList2 = arrayList;
                        length = i11;
                        strArr6 = strArr;
                        sb3 = str2;
                    }
                    i14 = i10 + 1;
                    str4 = str;
                    strArr4 = strArr2;
                    arrayList2 = arrayList;
                    length = i11;
                    strArr6 = strArr;
                    sb3 = str2;
                }
                ArrayList arrayList3 = arrayList2;
                FileRepository.f24171r = new nl.e(SystemClock.elapsedRealtime() - elapsedRealtime, arrayList3.size());
                arrayList3.size();
                FileRepository.F();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (true) {
                    boolean z10 = true;
                    if (it.hasNext()) {
                        Object next = it.next();
                        PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) next;
                        if ((FileRepository.l().contains(pdfPreviewEntity2.getPath()) || ((ArrayBlockingQueue) FileRepository.f24161h.getValue()).contains(pdfPreviewEntity2.getPath())) ? false : false) {
                            arrayList4.add(next);
                        }
                    } else {
                        if (!arrayList4.isEmpty()) {
                            arrayList4.size();
                            FileRepository.F();
                            FileRepository.E(context, arrayList4);
                            ea.a.p("vKrV5M2Trrrb5vOw0o355reSt4Xs5ZiMkoiQ", "7VYGpKY4");
                            FileRepository.F();
                        } else {
                            FileRepository.k().execute(new com.facebook.appevents.a(8));
                            ea.a.p("qqqj5MST0rrJLS5pE2aNrrnm5pCqvOnk6Y2rnPXo5YGpj6Pl_KXRlurm37CTja4=", "LfCyQBuC");
                            FileRepository.F();
                        }
                        FileRepository.H = true;
                        SystemClock.elapsedRealtime();
                        ea.a.p("anAfZSBUEHN0", "tX9zDuoZ");
                        return;
                    }
                }
                break;
        }
    }
}
