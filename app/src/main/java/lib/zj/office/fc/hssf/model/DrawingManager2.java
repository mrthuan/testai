package lib.zj.office.fc.hssf.model;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ddf.EscherDgRecord;
import lib.zj.office.fc.ddf.EscherDggRecord;

/* loaded from: classes3.dex */
public class DrawingManager2 {
    EscherDggRecord dgg;
    List drawingGroups = new ArrayList();

    public DrawingManager2(EscherDggRecord escherDggRecord) {
        this.dgg = escherDggRecord;
    }

    public int allocateShapeId(short s4) {
        return allocateShapeId(s4, getDrawingGroup(s4));
    }

    public void clearDrawingGroups() {
        this.drawingGroups.clear();
    }

    public EscherDgRecord createDgRecord() {
        EscherDgRecord escherDgRecord = new EscherDgRecord();
        escherDgRecord.setRecordId(EscherDgRecord.RECORD_ID);
        short findNewDrawingGroupId = findNewDrawingGroupId();
        escherDgRecord.setOptions((short) (findNewDrawingGroupId << 4));
        escherDgRecord.setNumShapes(0);
        escherDgRecord.setLastMSOSPID(-1);
        this.drawingGroups.add(escherDgRecord);
        this.dgg.addCluster(findNewDrawingGroupId, 0);
        EscherDggRecord escherDggRecord = this.dgg;
        escherDggRecord.setDrawingsSaved(escherDggRecord.getDrawingsSaved() + 1);
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

    public EscherDgRecord getDrawingGroup(int i10) {
        return (EscherDgRecord) this.drawingGroups.get(i10 - 1);
    }

    public int allocateShapeId(short s4, EscherDgRecord escherDgRecord) {
        EscherDggRecord escherDggRecord = this.dgg;
        escherDggRecord.setNumShapesSaved(escherDggRecord.getNumShapesSaved() + 1);
        for (int i10 = 0; i10 < this.dgg.getFileIdClusters().length; i10++) {
            EscherDggRecord.FileIdCluster fileIdCluster = this.dgg.getFileIdClusters()[i10];
            if (fileIdCluster.getDrawingGroupId() == s4 && fileIdCluster.getNumShapeIdsUsed() != 1024) {
                int numShapeIdsUsed = ((i10 + 1) * 1024) + fileIdCluster.getNumShapeIdsUsed();
                fileIdCluster.incrementShapeId();
                escherDgRecord.setNumShapes(escherDgRecord.getNumShapes() + 1);
                escherDgRecord.setLastMSOSPID(numShapeIdsUsed);
                if (numShapeIdsUsed >= this.dgg.getShapeIdMax()) {
                    this.dgg.setShapeIdMax(numShapeIdsUsed + 1);
                }
                return numShapeIdsUsed;
            }
        }
        this.dgg.addCluster(s4, 0);
        this.dgg.getFileIdClusters()[this.dgg.getFileIdClusters().length - 1].incrementShapeId();
        escherDgRecord.setNumShapes(escherDgRecord.getNumShapes() + 1);
        int length = this.dgg.getFileIdClusters().length * 1024;
        escherDgRecord.setLastMSOSPID(length);
        if (length >= this.dgg.getShapeIdMax()) {
            this.dgg.setShapeIdMax(length + 1);
        }
        return length;
    }
}
