package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.text.TextUtils;
import java.io.File;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: MyPrintAdapter.java */
/* loaded from: classes3.dex */
public final class m extends PrintDocumentAdapter {

    /* renamed from: b  reason: collision with root package name */
    public final String f27275b;

    /* renamed from: a  reason: collision with root package name */
    public final int f27274a = 1;
    public volatile boolean c = false;

    /* compiled from: MyPrintAdapter.java */
    /* loaded from: classes3.dex */
    public class a implements CancellationSignal.OnCancelListener {
        public a() {
        }

        @Override // android.os.CancellationSignal.OnCancelListener
        public final void onCancel() {
            m.this.c = true;
        }
    }

    /* compiled from: MyPrintAdapter.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f27277a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f27278b;

        public b(ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f27277a = parcelFileDescriptor;
            this.f27278b = writeResultCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
            ea.a.p("AnlhchBuQ0E-YTp0EHI=", "CPdMTgVo");
            ea.a.p("IG5mchB0Ujp6aTlDFG4LZVllZA==", "c2jYhbvl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            r2.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
            r0.printStackTrace();
         */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0092 -> B:85:0x0095). Please submit an issue!!! */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                pdf.pdfreader.viewer.editor.free.ui.adapter.m r3 = pdf.pdfreader.viewer.editor.free.ui.adapter.m.this     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                java.lang.String r3 = r3.f27275b     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L68
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
                android.os.ParcelFileDescriptor r4 = r8.f27277a     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
                java.io.FileDescriptor r4 = r4.getFileDescriptor()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
                r1 = 4096(0x1000, float:5.74E-42)
                byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> La4
            L1a:
                int r4 = r2.read(r1)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> La4
                if (r4 <= 0) goto L4c
                pdf.pdfreader.viewer.editor.free.ui.adapter.m r5 = pdf.pdfreader.viewer.editor.free.ui.adapter.m.this     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> La4
                boolean r5 = r5.c     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> La4
                if (r5 == 0) goto L48
                java.lang.String r1 = "AnlhchBuQ0E-YTp0EHI="
                java.lang.String r4 = "CPdMTgVo"
                ea.a.p(r1, r4)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> La4
                java.lang.String r1 = "IG5mchB0Ujp6aTlDFG4LZVllZA=="
                java.lang.String r4 = "c2jYhbvl"
                ea.a.p(r1, r4)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> La4
                r2.close()     // Catch: java.lang.Exception -> L38
                goto L3c
            L38:
                r0 = move-exception
                r0.printStackTrace()
            L3c:
                r3.flush()     // Catch: java.lang.Exception -> L43
                r3.close()     // Catch: java.lang.Exception -> L43
                goto L47
            L43:
                r0 = move-exception
                r0.printStackTrace()
            L47:
                return
            L48:
                r3.write(r1, r0, r4)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> La4
                goto L1a
            L4c:
                r2.close()     // Catch: java.lang.Exception -> L50
                goto L54
            L50:
                r1 = move-exception
                r1.printStackTrace()
            L54:
                r3.flush()     // Catch: java.lang.Exception -> L91
                r3.close()     // Catch: java.lang.Exception -> L91
                goto L95
            L5b:
                r1 = move-exception
                goto L6c
            L5d:
                r0 = move-exception
                r3 = r1
                goto La5
            L60:
                r3 = move-exception
                r7 = r3
                r3 = r1
                r1 = r7
                goto L6c
            L65:
                r0 = move-exception
                r3 = r1
                goto La6
            L68:
                r2 = move-exception
                r3 = r1
                r1 = r2
                r2 = r3
            L6c:
                android.print.PrintDocumentAdapter$WriteResultCallback r4 = r8.f27278b     // Catch: java.lang.Throwable -> La4
                if (r4 == 0) goto L7b
                java.lang.String r5 = "dWEibBZkQnQdIENyAHQzICBhRmEu"
                java.lang.String r6 = "ZXh0jSJr"
                java.lang.String r5 = ea.a.p(r5, r6)     // Catch: java.lang.Throwable -> La4
                r4.onWriteFailed(r5)     // Catch: java.lang.Throwable -> La4
            L7b:
                r1.printStackTrace()     // Catch: java.lang.Throwable -> La4
                if (r2 == 0) goto L88
                r2.close()     // Catch: java.lang.Exception -> L84
                goto L88
            L84:
                r1 = move-exception
                r1.printStackTrace()
            L88:
                if (r3 == 0) goto L95
                r3.flush()     // Catch: java.lang.Exception -> L91
                r3.close()     // Catch: java.lang.Exception -> L91
                goto L95
            L91:
                r1 = move-exception
                r1.printStackTrace()
            L95:
                android.print.PrintDocumentAdapter$WriteResultCallback r1 = r8.f27278b
                if (r1 == 0) goto La3
                r2 = 1
                android.print.PageRange[] r2 = new android.print.PageRange[r2]
                android.print.PageRange r3 = android.print.PageRange.ALL_PAGES
                r2[r0] = r3
                r1.onWriteFinished(r2)
            La3:
                return
            La4:
                r0 = move-exception
            La5:
                r1 = r2
            La6:
                if (r1 == 0) goto Lb0
                r1.close()     // Catch: java.lang.Exception -> Lac
                goto Lb0
            Lac:
                r1 = move-exception
                r1.printStackTrace()
            Lb0:
                if (r3 == 0) goto Lbd
                r3.flush()     // Catch: java.lang.Exception -> Lb9
                r3.close()     // Catch: java.lang.Exception -> Lb9
                goto Lbd
            Lb9:
                r1 = move-exception
                r1.printStackTrace()
            Lbd:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.adapter.m.b.run():void");
        }
    }

    public m(String str) {
        this.f27275b = str;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
            return;
        }
        if (this.f27274a > 0) {
            String str = this.f27275b;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                String p10 = ea.a.p("JHIAbiFSXHM9bBIuRGRm", "6YTiU9Wf");
                if (file.exists()) {
                    p10 = file.getName();
                }
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(p10).setContentType(0).setPageCount(-1).build(), true);
                return;
            }
        }
        layoutResultCallback.onLayoutFailed(ea.a.p("FmEdZUhjAnUmdEZpRyAtZUpvLg==", "BkFzhmX9"));
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        cancellationSignal.setOnCancelListener(new a());
        w0.a().c.execute(new b(parcelFileDescriptor, writeResultCallback));
    }
}
