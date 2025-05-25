package pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper;

import android.app.Activity;
import androidx.activity.k;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import cg.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.w;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import tf.d;
import wf.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PDF2WordHelper.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper$Companion$convertPDF2Word$1", f = "PDF2WordHelper.kt", l = {ShapeTypes.FLOW_CHART_EXTRACT, ShapeTypes.FLOW_CHART_OFFLINE_STORAGE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PDF2WordHelper$Companion$convertPDF2Word$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $pdfPath;
    final /* synthetic */ String $pdfPwd;
    Object L$0;
    int label;

    /* compiled from: PDF2WordHelper.kt */
    /* loaded from: classes3.dex */
    public static final class a implements NativeSoLoaderHelper.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f25582a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f25583b;
        public final /* synthetic */ String c;

        public a(Activity activity, String str, String str2) {
            this.f25582a = activity;
            this.f25583b = str;
            this.c = str2;
        }

        @Override // androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.b
        public final void a() {
            PDF2WordHelper.Companion.b(PDF2WordHelper.f25574a, this.f25582a, this.f25583b, this.c);
        }

        @Override // androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.b
        public final void b() {
            PDF2WordHelper.f25579g.sendEmptyMessage(4);
        }

        @Override // androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.b
        public final void c(NativeSoLoaderHelper.DynamicErrorCode errorCode) {
            g.e(errorCode, "errorCode");
            PDF2WordHelper.f25579g.obtainMessage(2, Integer.valueOf(errorCode.getValue())).sendToTarget();
            NativeSoLoaderHelper.DynamicErrorCode dynamicErrorCode = NativeSoLoaderHelper.DynamicErrorCode.NoSpaceException;
            Activity activity = this.f25582a;
            if (errorCode == dynamicErrorCode) {
                PDF2WordHelper.f25574a.getClass();
                w0.a().f28791b.execute(new k(activity, 28));
            }
            String str = NativeSoLoaderHelper.f1933a;
            NativeSoLoaderHelper.Companion.d(activity);
        }

        @Override // androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.b
        public final void d(NativeSoLoaderHelper.DynamicErrorCode errorCode) {
            g.e(errorCode, "errorCode");
            PDF2WordHelper.f25579g.obtainMessage(3, Integer.valueOf(errorCode.getValue())).sendToTarget();
        }

        @Override // androidx.appcompat.libconvert.helper.NativeSoLoaderHelper.b
        public final void e(int i10) {
            PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
            companion.getClass();
            if (i10 > PDF2WordHelper.f25576d) {
                companion.getClass();
                PDF2WordHelper.f25576d = i10;
                PDF2WordHelper.f25579g.sendEmptyMessage(1);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDF2WordHelper$Companion$convertPDF2Word$1(Activity activity, String str, String str2, kotlin.coroutines.c<? super PDF2WordHelper$Companion$convertPDF2Word$1> cVar) {
        super(2, cVar);
        this.$activity = activity;
        this.$pdfPath = str;
        this.$pdfPwd = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PDF2WordHelper$Companion$convertPDF2Word$1(this.$activity, this.$pdfPath, this.$pdfPwd, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (androidx.appcompat.libconvert.c.c(r1).getConverting() != false) goto L9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper$Companion$convertPDF2Word$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((PDF2WordHelper$Companion$convertPDF2Word$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
