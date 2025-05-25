package lib.zj.office.fc.hslf.usermodel;

import java.io.InputStream;
import lib.zj.office.fc.hslf.record.ExOleObjStg;

/* loaded from: classes3.dex */
public class ObjectData {
    private ExOleObjStg storage;

    public ObjectData(ExOleObjStg exOleObjStg) {
        this.storage = exOleObjStg;
    }

    public void dispose() {
        ExOleObjStg exOleObjStg = this.storage;
        if (exOleObjStg != null) {
            exOleObjStg.dispose();
        }
    }

    public InputStream getData() {
        return this.storage.getData();
    }

    public ExOleObjStg getExOleObjStg() {
        return this.storage;
    }

    public void setData(byte[] bArr) {
        this.storage.setData(bArr);
    }
}
