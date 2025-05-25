package lib.zj.office.fc.hssf.model;

import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.ddf.EscherDgRecord;
import lib.zj.office.fc.ddf.EscherDggRecord;

/* loaded from: classes3.dex */
public class DrawingManager {
    Map dgMap = new HashMap();
    EscherDggRecord dgg;

    public DrawingManager(EscherDggRecord escherDggRecord) {
        this.dgg = escherDggRecord;
    }

    public int allocateShapeId(short s4) {
        int i10;
        EscherDgRecord escherDgRecord = (EscherDgRecord) this.dgMap.get(Short.valueOf(s4));
        if (escherDgRecord.getLastMSOSPID() % 1024 == 1023) {
            i10 = findFreeSPIDBlock();
            this.dgg.addCluster(s4, 1);
        } else {
            int i11 = 0;
            for (int i12 = 0; i12 < this.dgg.getFileIdClusters().length; i12++) {
                EscherDggRecord.FileIdCluster fileIdCluster = this.dgg.getFileIdClusters()[i12];
                if (fileIdCluster.getDrawingGroupId() == s4 && fileIdCluster.getNumShapeIdsUsed() != 1024) {
                    fileIdCluster.incrementShapeId();
                }
                if (escherDgRecord.getLastMSOSPID() == -1) {
                    i11 = findFreeSPIDBlock();
                } else {
                    i11 = escherDgRecord.getLastMSOSPID() + 1;
                }
            }
            i10 = i11;
        }
        EscherDggRecord escherDggRecord = this.dgg;
        escherDggRecord.setNumShapesSaved(escherDggRecord.getNumShapesSaved() + 1);
        if (i10 >= this.dgg.getShapeIdMax()) {
            this.dgg.setShapeIdMax(i10 + 1);
        }
        escherDgRecord.setLastMSOSPID(i10);
        escherDgRecord.incrementShapeCount();
        return i10;
    }

    public EscherDgRecord createDgRecord() {
        EscherDgRecord escherDgRecord = new EscherDgRecord();
        escherDgRecord.setRecordId(EscherDgRecord.RECORD_ID);
        short findNewDrawingGroupId = findNewDrawingGroupId();
        escherDgRecord.setOptions((short) (findNewDrawingGroupId << 4));
        escherDgRecord.setNumShapes(0);
        escherDgRecord.setLastMSOSPID(-1);
        this.dgg.addCluster(findNewDrawingGroupId, 0);
        EscherDggRecord escherDggRecord = this.dgg;
        escherDggRecord.setDrawingsSaved(escherDggRecord.getDrawingsSaved() + 1);
        this.dgMap.put(Short.valueOf(findNewDrawingGroupId), escherDgRecord);
        return escherDgRecord;
    }

    public boolean drawingGroupExists(short s4) {
        for (int i10 = 0; i10 < this.dgg.getFileIdClusters().length; i10++) {
            if (this.dgg.getFileIdClusters()[i10].getDrawingGroupId() == s4) {
                return true;
            }
        }
        return false;
    }

    public int findFreeSPIDBlock() {
        return ((this.dgg.getShapeIdMax() / 1024) + 1) * 1024;
    }

    public short findNewDrawingGroupId() {
        short s4 = 1;
        while (drawingGroupExists(s4)) {
            s4 = (short) (s4 + 1);
        }
        return s4;
    }

    public EscherDggRecord getDgg() {
        return this.dgg;
    }
}
