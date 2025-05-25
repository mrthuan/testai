package pdf.pdfreader.viewer.editor.free.bean;

import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.split.SplitPdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;

/* compiled from: DataBridge.kt */
/* loaded from: classes3.dex */
public final class DataBridge {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f24030b;
    public static boolean c;

    /* renamed from: a  reason: collision with root package name */
    public static ToolsType f24029a = ToolsType.MERGE_PDF;

    /* renamed from: d  reason: collision with root package name */
    public static final tf.c f24031d = kotlin.a.a(new cg.a<List<MergePdfData>>() { // from class: pdf.pdfreader.viewer.editor.free.bean.DataBridge$mergeSelectEntities$2
        @Override // cg.a
        public final List<MergePdfData> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: e  reason: collision with root package name */
    public static final tf.c f24032e = kotlin.a.a(new cg.a<List<SplitPdfData>>() { // from class: pdf.pdfreader.viewer.editor.free.bean.DataBridge$splitPdfInfo$2
        @Override // cg.a
        public final List<SplitPdfData> invoke() {
            return new ArrayList();
        }
    });

    public static List a() {
        return (List) f24031d.getValue();
    }

    public static List b() {
        return (List) f24032e.getValue();
    }
}
