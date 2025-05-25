package km;

import android.content.Context;
import androidx.appcompat.widget.y0;
import jf.f;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: AIDbManager.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final AIDataBase f19907a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f19908b;

    static {
        Context m10 = ReaderPdfApplication.m();
        if (AIDataBase.f24342j == null) {
            AIDataBase.f24342j = (AIDataBase) androidx.room.b.a(m10.getApplicationContext(), AIDataBase.class, AIDataBase.f24343k).b();
        }
        AIDataBase aIDataBase = AIDataBase.f24342j;
        g.d(aIDataBase, ea.a.p("VGU_SR1zFmEcY1EoO2U3ZCFyYmQgQTNwWWk2YRNpHW4dZy50Om4RdBNuV2VBKSk=", "5UgrwIcZ"));
        f19907a = aIDataBase;
        f19908b = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24352a;
    }

    public static void a(AIAnswerContent aIAnswerContent) {
        w0.a().f28790a.execute(new y0(aIAnswerContent, 24));
    }
}
