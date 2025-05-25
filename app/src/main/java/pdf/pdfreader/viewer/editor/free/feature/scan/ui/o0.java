package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import nn.b;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.o;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;

/* compiled from: ScanSettingActivity.kt */
/* loaded from: classes3.dex */
public final class o0 implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScanSettingActivity f25840a;

    public o0(ScanSettingActivity scanSettingActivity) {
        this.f25840a = scanSettingActivity;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.dialog.o.a
    public final void a(GroupAiFilterType groupAiFilterType) {
        int i10;
        int i11 = ScanSettingActivity.f25783v;
        ScanSettingActivity scanSettingActivity = this.f25840a;
        scanSettingActivity.c2().f1427h.setText(nn.b.a(scanSettingActivity, groupAiFilterType));
        jn.a aVar = jn.a.c;
        switch (b.a.f22607a[groupAiFilterType.ordinal()]) {
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 4;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 7;
                break;
            case 9:
                i10 = 8;
                break;
            case 10:
                i10 = 9;
                break;
            case 11:
                i10 = 10;
                break;
            default:
                i10 = 0;
                break;
        }
        aVar.getClass();
        jn.a.f19326g.c(jn.a.f19323d[2], Integer.valueOf(i10));
    }
}
