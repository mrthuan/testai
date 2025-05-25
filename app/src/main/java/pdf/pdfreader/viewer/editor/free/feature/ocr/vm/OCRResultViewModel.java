package pdf.pdfreader.viewer.editor.free.feature.ocr.vm;

import android.content.Context;
import androidx.lifecycle.e0;
import androidx.lifecycle.j0;
import ea.a;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import kotlin.coroutines.c;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.v;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: OCRResultViewModel.kt */
/* loaded from: classes3.dex */
public final class OCRResultViewModel extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final e0 f25234d;

    /* renamed from: e  reason: collision with root package name */
    public final StateFlowImpl f25235e;

    /* renamed from: f  reason: collision with root package name */
    public final StateFlowImpl f25236f;

    /* renamed from: g  reason: collision with root package name */
    public final s f25237g;

    /* renamed from: h  reason: collision with root package name */
    public final v f25238h;

    /* renamed from: i  reason: collision with root package name */
    public final v f25239i;

    /* renamed from: j  reason: collision with root package name */
    public final v f25240j;

    /* renamed from: k  reason: collision with root package name */
    public final v f25241k;

    /* renamed from: l  reason: collision with root package name */
    public final v f25242l;

    /* renamed from: m  reason: collision with root package name */
    public final v f25243m;

    /* renamed from: n  reason: collision with root package name */
    public long f25244n;

    public OCRResultViewModel(e0 e0Var) {
        g.e(e0Var, a.p("J2EOZVdTNmE8ZS5hWmQ7ZQ==", "qBTx3BhL"));
        this.f25234d = e0Var;
        StateFlowImpl a10 = t0.a(OcrUploadResult.HIDE_LOADING);
        this.f25235e = a10;
        this.f25236f = a10;
        String p10 = a.p("IGNDQhVvVGscbCt0AWVu", "u1u63CIw");
        EmptyList emptyList = EmptyList.INSTANCE;
        LinkedHashMap linkedHashMap = e0Var.f4041d;
        Object obj = linkedHashMap.get(p10);
        if (obj == null) {
            LinkedHashMap linkedHashMap2 = e0Var.f4039a;
            if (!linkedHashMap2.containsKey(p10)) {
                linkedHashMap2.put(p10, emptyList);
            }
            obj = t0.a(linkedHashMap2.get(p10));
            linkedHashMap.put(p10, obj);
            linkedHashMap.put(p10, obj);
        }
        this.f25237g = new s((r) obj, null);
        v d10 = a.d(0, 7);
        this.f25238h = d10;
        this.f25239i = d10;
        v d11 = a.d(0, 7);
        this.f25240j = d11;
        this.f25241k = d11;
        v d12 = a.d(0, 7);
        this.f25242l = d12;
        this.f25243m = d12;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(5:(1:(1:(2:13|14))(9:16|17|18|(3:20|(1:22)(1:30)|(4:24|(2:26|27)|28|29))|31|(1:32)|34|35|36))|37|38|28|29)(4:39|40|41|42))(5:43|44|(2:46|(4:48|(2:50|51)|41|42))|52|(9:60|(2:62|63)|18|(0)|31|(1:32)|34|35|36)(4:56|(2:58|59)|28|29))))|70|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
        r9.printStackTrace();
        r8 = r8.f25235e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f0, code lost:
        r9 = r8.b();
        r10 = (pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fd, code lost:
        if (r8.c(r9, pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult.IMAGE_UPLOAD_ERROR) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[Catch: Exception -> 0x00d7, TryCatch #0 {Exception -> 0x00d7, blocks: (B:18:0x0053, B:46:0x00b6, B:48:0x00ba, B:53:0x00c4, B:59:0x00d9, B:60:0x00db, B:21:0x005b, B:24:0x0064, B:34:0x0085, B:35:0x008a, B:27:0x006b, B:29:0x006f, B:31:0x0077, B:36:0x008b, B:38:0x008f, B:40:0x0094, B:43:0x009f), top: B:68:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel r8, android.content.Context r9, java.io.File r10, um.a r11, java.lang.String r12, kotlin.coroutines.c r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel.d(pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel, android.content.Context, java.io.File, um.a, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] f(android.content.Context r17, java.io.File r18, um.a r19) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel.f(android.content.Context, java.io.File, um.a):byte[]");
    }

    public final void e() {
        StateFlowImpl stateFlowImpl;
        Object b10;
        do {
            stateFlowImpl = this.f25235e;
            b10 = stateFlowImpl.b();
            OcrUploadResult ocrUploadResult = (OcrUploadResult) b10;
        } while (!stateFlowImpl.c(b10, OcrUploadResult.HIDE_LOADING));
    }

    public final Object g(um.a aVar, Context context, c cVar) {
        return t0.w0(kotlinx.coroutines.j0.f20207b, new OCRResultViewModel$doOCR$2(this, aVar, context, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:13:0x002e, B:35:0x0094, B:37:0x0098, B:42:0x00a3, B:44:0x00b0, B:46:0x00bc, B:48:0x00e9, B:52:0x00ff, B:53:0x0112, B:56:0x012b, B:57:0x012d, B:60:0x013d, B:61:0x013f, B:63:0x014e, B:65:0x0151, B:66:0x0153, B:18:0x0044, B:29:0x0065, B:30:0x006a), top: B:76:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable h(android.content.Context r20, java.io.File r21, java.lang.String r22, kotlin.coroutines.c r23) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel.h(android.content.Context, java.io.File, java.lang.String, kotlin.coroutines.c):java.io.Serializable");
    }

    public final void i() {
        t0.d0(t0.X(this), null, null, new OCRResultViewModel$finishPage$1(this, null), 3);
    }

    public final void j() {
        t0.d0(t0.X(this), null, null, new OCRResultViewModel$onBackPressed$1(this, null), 3);
    }

    public final void k(boolean z10) {
        t0.d0(t0.X(this), null, null, new OCRResultViewModel$sendKeyboardStateEvent$1(this, z10, null), 3);
    }
}
