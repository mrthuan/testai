package pdf.pdfreader.viewer.editor.free.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: FasterFileUtil.kt */
/* loaded from: classes3.dex */
public final class FasterFileUtil {

    /* renamed from: a  reason: collision with root package name */
    public static final FasterFileUtil f28517a = new FasterFileUtil();

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f28518b;
    public static final AtomicInteger c;

    /* renamed from: d  reason: collision with root package name */
    public static ThreadPoolExecutor f28519d;

    static {
        kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.utils.FasterFileUtil$watcherHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                HandlerThread handlerThread = new HandlerThread(ea.a.p("dWE4dBZyJGkeZWF0AGw=", "71s795un"));
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
        f28518b = new String[]{ea.a.p("UHIqc2g=", "1f63ogSJ"), ea.a.p("BmwZchtz", "E9GxvtNO"), ea.a.p("AnVCaWM=", "8izn2vZY"), ea.a.p("Y2kodAZyB3M=", "Mw6WeESy"), ea.a.p("d0MCTQ==", "6pTPYqaL"), ea.a.p("GWlVZRZz", "eiWWmDKp"), ea.a.p("O29FaRRz", "j3v3qzf3"), ea.a.p("YWUobwFkC24Vcw==", "1R8v02K3"), ea.a.p("HWlfZw1vWWVz", "cn8BmEdw"), ea.a.p("Y28vYxJzFnM=", "bOP3aVKc"), ea.a.p("fW8_aRVpAWEGaVtucw==", "JQwi0vK7"), ea.a.p("BHVGbzR1RGlj", "m36QMEpB"), ea.a.p("eHU8bz9pFGU=", "Ty9jazBB"), ea.a.p("PnFcdQppYw==", "is6TiFvI"), ea.a.p("LGxedR1tQnMzYw==", "bVLKV23Q"), ea.a.p("G2VdZR5yVm16QT9kHG8=", "yWVB8n38"), ea.a.p("BWVbZSlyNm1oSQthU2Vz", "DlQ7NWYv"), ea.a.p("G2VdZR5yVm16ViNkEG8=", "Ah8ewyXR")};
        c = new AtomicInteger();
        kotlin.a.a(new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.utils.FasterFileUtil$isFirstScan$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Boolean invoke() {
                boolean f10 = q0.f(ReaderPdfApplication.m(), "key_app_scan_first", true);
                if (f10) {
                    q0.w(ReaderPdfApplication.m(), "key_app_scan_first", false);
                }
                return Boolean.valueOf(f10);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r2 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.Set a(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.FasterFileUtil.a(android.content.Context):java.util.Set");
    }
}
