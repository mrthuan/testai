package lib.zj.office.fc.ss.usermodel;

import lib.zj.office.fc.hssf.usermodel.IClientAnchor;

/* loaded from: classes3.dex */
public interface Picture {
    PictureData getPictureData();

    IClientAnchor getPreferredSize();

    void resize();

    void resize(double d10);
}
