package pdf.pdfreader.viewer.editor.free.feature.ocr.ui;

import android.content.Context;
import androidx.activity.r;
import androidx.fragment.app.w;
import java.util.HashSet;
import kotlin.jvm.internal.Ref$BooleanRef;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;

/* compiled from: OCRResultActivity.kt */
/* loaded from: classes3.dex */
public final class b extends w {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f25166d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ OCRResultActivity f25167e;

    public b(Ref$BooleanRef ref$BooleanRef, OCRResultActivity oCRResultActivity) {
        this.f25166d = ref$BooleanRef;
        this.f25167e = oCRResultActivity;
    }

    @Override // oo.a
    public final void a() {
        this.f25166d.element = true;
        HashSet<String> hashSet = OCREventCenter.c;
        if (!hashSet.contains(ea.a.p("XGM5XxdpEWMTclBfDWklXydsW2Nr", "S63gyeWE"))) {
            Context c = r.c("XGM5XxdpEWMTclBfDWklXydsW2Nr", "WNO2uaAW", hashSet);
            OCREventCenter.b(c, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "G9xOzj53", c, "IGNy", "XMF6c4hr"), ea.a.p("WWNBXy5pJ2MpcgJfUGkkX1tsO2Nr", "P763JTNf"));
        }
        this.f25167e.finish();
    }
}
