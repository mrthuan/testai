package lib.zj.office.fc.ss.usermodel;

import lib.zj.office.fc.hssf.usermodel.IClientAnchor;

/* loaded from: classes3.dex */
public interface Drawing {
    IClientAnchor createAnchor(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    Comment createCellComment(IClientAnchor iClientAnchor);

    Chart createChart(IClientAnchor iClientAnchor);

    Picture createPicture(IClientAnchor iClientAnchor, int i10);
}
