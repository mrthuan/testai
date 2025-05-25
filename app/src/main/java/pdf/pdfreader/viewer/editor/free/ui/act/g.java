package pdf.pdfreader.viewer.editor.free.ui.act;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f26933b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f26932a = i10;
        this.f26933b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f26932a;
        Object obj = this.f26933b;
        switch (i10) {
            case 0:
                LanguageChooseActivity languageChooseActivity = (LanguageChooseActivity) obj;
                int i11 = LanguageChooseActivity.H;
                kotlin.jvm.internal.g.e(languageChooseActivity, ea.a.p("R2gic1cw", "4hpbmSdM"));
                languageChooseActivity.b2().f942d.setVisibility(8);
                languageChooseActivity.b2().f944f.setVisibility(0);
                return;
            case 1:
                LanguageChooseActivity.a aVar = (LanguageChooseActivity.a) obj;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("R2gic1cw", "90pfDeoa"));
                int i12 = aVar.f26617e;
                if (view.getTag() != null && (view.getTag() instanceof Integer)) {
                    Object tag = view.getTag();
                    kotlin.jvm.internal.g.c(tag, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuIm5obhRsFCBHeTtlU2sNdB5pWi4gbnQ=", "MEaxJo9E"));
                    int intValue = ((Integer) tag).intValue();
                    aVar.f26618f.invoke(Integer.valueOf(intValue));
                    if (intValue >= 0 && intValue < aVar.f26616d.size() && intValue != i12) {
                        aVar.f26617e = intValue;
                        aVar.notifyItemChanged(i12);
                        aVar.notifyItemChanged(intValue);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) obj;
                ReaderMergeChooserActivity.a aVar2 = ReaderMergeChooserActivity.f26759n0;
                kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("R2gic1cw", "CbPMf088"));
                readerMergeChooserActivity.f26769i0 = true;
                return;
            default:
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) obj;
                RecentAddedActivity.a aVar3 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("R2gic1cw", "qdr58M8f"));
                recentAddedActivity.o2();
                return;
        }
    }
}
