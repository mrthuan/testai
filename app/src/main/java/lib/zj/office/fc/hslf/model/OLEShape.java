package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.hslf.record.ExEmbed;
import lib.zj.office.fc.hslf.record.ExObjList;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.usermodel.ObjectData;

/* loaded from: classes3.dex */
public final class OLEShape extends Picture {
    protected ExEmbed _exEmbed;

    public OLEShape(int i10) {
        super(i10);
    }

    @Override // lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public void dispose() {
        super.dispose();
        ExEmbed exEmbed = this._exEmbed;
        if (exEmbed != null) {
            exEmbed.dispose();
        }
    }

    public ExEmbed getExEmbed() {
        Record[] childRecords;
        if (this._exEmbed == null) {
            ExObjList exObjList = getSheet().getSlideShow().getDocumentRecord().getExObjList();
            if (exObjList == null) {
                return null;
            }
            int objectID = getObjectID();
            for (Record record : exObjList.getChildRecords()) {
                if (record instanceof ExEmbed) {
                    ExEmbed exEmbed = (ExEmbed) record;
                    if (exEmbed.getExOleObjAtom().getObjID() == objectID) {
                        this._exEmbed = exEmbed;
                    }
                }
            }
        }
        return this._exEmbed;
    }

    public String getFullName() {
        return getExEmbed().getClipboardName();
    }

    public String getInstanceName() {
        return getExEmbed().getMenuName();
    }

    public ObjectData getObjectData() {
        ObjectData[] embeddedObjects = getSheet().getSlideShow().getEmbeddedObjects();
        int objStgDataRef = getExEmbed().getExOleObjAtom().getObjStgDataRef();
        ObjectData objectData = null;
        for (int i10 = 0; i10 < embeddedObjects.length; i10++) {
            if (embeddedObjects[i10].getExOleObjStg().getPersistId() == objStgDataRef) {
                objectData = embeddedObjects[i10];
            }
        }
        return objectData;
    }

    public int getObjectID() {
        return s.G(getSpContainer(), EscherProperties.BLIP__PICTUREID, 0);
    }

    public String getProgID() {
        return getExEmbed().getProgId();
    }

    public OLEShape(int i10, Shape shape) {
        super(i10, shape);
    }

    public OLEShape(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }
}
