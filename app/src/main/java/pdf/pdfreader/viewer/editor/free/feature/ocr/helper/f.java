package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25083b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f25084d;

    public /* synthetic */ f(int i10, Object obj, int i11, int i12) {
        this.f25082a = i12;
        this.f25084d = obj;
        this.f25083b = i10;
        this.c = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[ADDED_TO_REGION] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f25082a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L19
        L6:
            java.lang.Object r0 = r11.f25084d
            pdf.pdfreader.viewer.editor.free.feature.ocr.helper.k r0 = (pdf.pdfreader.viewer.editor.free.feature.ocr.helper.k) r0
            java.lang.String r1 = "F2MqbB9iA2Nr"
            java.lang.String r2 = "T3c2F3za"
            java.lang.String r1 = ea.a.p(r1, r2)
            kotlin.jvm.internal.g.e(r0, r1)
            r0.c()
            return
        L19:
            java.lang.Object r0 = r11.f25084d
            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity r0 = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity) r0
            int r1 = r11.f25083b
            int r2 = r11.c
            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity$a r3 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity.H0
            java.lang.String r3 = "O2hYc10w"
            java.lang.String r4 = "RFuOgnK8"
            java.lang.String r3 = ea.a.p(r3, r4)
            kotlin.jvm.internal.g.e(r0, r3)
            pdf.pdfreader.viewer.editor.free.utils.f0 r3 = r0.f25275n0
            if (r3 != 0) goto L39
            pdf.pdfreader.viewer.editor.free.utils.f0 r3 = new pdf.pdfreader.viewer.editor.free.utils.f0
            r3.<init>()
            r0.f25275n0 = r3
        L39:
            lib.zj.pdfeditor.ReaderPDFCore r3 = r0.f25317x
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L94
            boolean r3 = r3.hasChanges()
            java.lang.String r6 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
            if (r3 == 0) goto L94
            java.lang.String r3 = r0.f25314u
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r6 = 2
            if (r3 != 0) goto L7b
            java.io.File r3 = new java.io.File
            java.lang.String r7 = r0.f25314u
            r3.<init>(r7)
            boolean r7 = r3.exists()
            if (r7 == 0) goto L7b
            long r7 = r3.length()
            long r9 = (long) r6
            long r7 = r7 * r9
            double r7 = (double) r7
            r9 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r7 = r7 * r9
            pdf.pdfreader.viewer.editor.free.utils.f0 r3 = r0.f25275n0
            kotlin.jvm.internal.g.b(r3)
            long r9 = pdf.pdfreader.viewer.editor.free.utils.f0.b()
            float r3 = (float) r9
            double r9 = (double) r3
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 >= 0) goto L7b
            r3 = r5
            goto L7c
        L7b:
            r3 = r4
        L7c:
            if (r3 == 0) goto L95
            lib.zj.pdfeditor.ReaderPDFCore r7 = r0.f25317x
            if (r7 == 0) goto L87
            boolean r7 = r7.save()
            goto L88
        L87:
            r7 = r5
        L88:
            r8 = 5
            if (r1 == r8) goto L96
            if (r1 != r6) goto L8f
            r6 = r4
            goto L90
        L8f:
            r6 = r5
        L90:
            r0.A2(r6)
            goto L96
        L94:
            r3 = r4
        L95:
            r7 = r5
        L96:
            r0.f25280s0 = r4
            if (r3 == 0) goto L9d
            if (r7 == 0) goto L9d
            goto L9e
        L9d:
            r4 = r5
        L9e:
            android.os.Handler r3 = r0.f25313t
            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.u r5 = new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.u
            r5.<init>(r4, r1, r2)
            long r0 = r0.f25281t0
            long r0 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity.p2(r0)
            r3.postDelayed(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.helper.f.run():void");
    }
}
