package lib.zj.office.fc.ddf;

import a0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.RecordFormatException;

/* loaded from: classes3.dex */
public final class EscherDggRecord extends EscherRecord {
    private static final Comparator<FileIdCluster> MY_COMP = new Comparator<FileIdCluster>() { // from class: lib.zj.office.fc.ddf.EscherDggRecord.1
        @Override // java.util.Comparator
        public int compare(FileIdCluster fileIdCluster, FileIdCluster fileIdCluster2) {
            if (fileIdCluster.getDrawingGroupId() == fileIdCluster2.getDrawingGroupId()) {
                return 0;
            }
            return fileIdCluster.getDrawingGroupId() < fileIdCluster2.getDrawingGroupId() ? -1 : 1;
        }
    };
    public static final String RECORD_DESCRIPTION = "MsofbtDgg";
    public static final short RECORD_ID = -4090;
    private int field_1_shapeIdMax;
    private int field_3_numShapesSaved;
    private int field_4_drawingsSaved;
    private FileIdCluster[] field_5_fileIdClusters;
    private int maxDgId;

    /* loaded from: classes3.dex */
    public static class FileIdCluster {
        private int field_1_drawingGroupId;
        private int field_2_numShapeIdsUsed;

        public FileIdCluster(int i10, int i11) {
            this.field_1_drawingGroupId = i10;
            this.field_2_numShapeIdsUsed = i11;
        }

        public int getDrawingGroupId() {
            return this.field_1_drawingGroupId;
        }

        public int getNumShapeIdsUsed() {
            return this.field_2_numShapeIdsUsed;
        }

        public void incrementShapeId() {
            this.field_2_numShapeIdsUsed++;
        }
    }

    public void addCluster(int i10, int i11) {
        addCluster(i10, i11, true);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        int i11 = i10 + 8;
        this.field_1_shapeIdMax = LittleEndian.getInt(bArr, i11 + 0);
        LittleEndian.getInt(bArr, i11 + 4);
        this.field_3_numShapesSaved = LittleEndian.getInt(bArr, i11 + 8);
        this.field_4_drawingsSaved = LittleEndian.getInt(bArr, i11 + 12);
        this.field_5_fileIdClusters = new FileIdCluster[(readHeader - 16) / 8];
        int i12 = 0;
        int i13 = 16;
        while (true) {
            FileIdCluster[] fileIdClusterArr = this.field_5_fileIdClusters;
            if (i12 >= fileIdClusterArr.length) {
                break;
            }
            int i14 = i11 + i13;
            fileIdClusterArr[i12] = new FileIdCluster(LittleEndian.getInt(bArr, i14), LittleEndian.getInt(bArr, i14 + 4));
            this.maxDgId = Math.max(this.maxDgId, this.field_5_fileIdClusters[i12].getDrawingGroupId());
            i13 += 8;
            i12++;
        }
        int i15 = readHeader - i13;
        if (i15 == 0) {
            return i13 + 8 + i15;
        }
        throw new RecordFormatException(a.g("Expecting no remaining data but got ", i15, " byte(s)."));
    }

    public int getDrawingsSaved() {
        return this.field_4_drawingsSaved;
    }

    public FileIdCluster[] getFileIdClusters() {
        return this.field_5_fileIdClusters;
    }

    public int getMaxDrawingGroupId() {
        return this.maxDgId;
    }

    public int getNumIdClusters() {
        FileIdCluster[] fileIdClusterArr = this.field_5_fileIdClusters;
        if (fileIdClusterArr == null) {
            return 0;
        }
        return fileIdClusterArr.length + 1;
    }

    public int getNumShapesSaved() {
        return this.field_3_numShapesSaved;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getRecordId() {
        return RECORD_ID;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "Dgg";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return (this.field_5_fileIdClusters.length * 8) + 24;
    }

    public int getShapeIdMax() {
        return this.field_1_shapeIdMax;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        int i11 = i10 + 2;
        LittleEndian.putShort(bArr, i11, getRecordId());
        int i12 = i11 + 2;
        LittleEndian.putInt(bArr, i12, getRecordSize() - 8);
        int i13 = i12 + 4;
        LittleEndian.putInt(bArr, i13, this.field_1_shapeIdMax);
        int i14 = i13 + 4;
        LittleEndian.putInt(bArr, i14, getNumIdClusters());
        int i15 = i14 + 4;
        LittleEndian.putInt(bArr, i15, this.field_3_numShapesSaved);
        int i16 = i15 + 4;
        LittleEndian.putInt(bArr, i16, this.field_4_drawingsSaved);
        int i17 = i16 + 4;
        int i18 = 0;
        while (true) {
            FileIdCluster[] fileIdClusterArr = this.field_5_fileIdClusters;
            if (i18 < fileIdClusterArr.length) {
                LittleEndian.putInt(bArr, i17, fileIdClusterArr[i18].field_1_drawingGroupId);
                int i19 = i17 + 4;
                LittleEndian.putInt(bArr, i19, this.field_5_fileIdClusters[i18].field_2_numShapeIdsUsed);
                i17 = i19 + 4;
                i18++;
            } else {
                escherSerializationListener.afterRecordSerialize(i17, getRecordId(), getRecordSize(), this);
                return getRecordSize();
            }
        }
    }

    public void setDrawingsSaved(int i10) {
        this.field_4_drawingsSaved = i10;
    }

    public void setFileIdClusters(FileIdCluster[] fileIdClusterArr) {
        this.field_5_fileIdClusters = fileIdClusterArr;
    }

    public void setMaxDrawingGroupId(int i10) {
        this.maxDgId = i10;
    }

    public void setNumShapesSaved(int i10) {
        this.field_3_numShapesSaved = i10;
    }

    public void setShapeIdMax(int i10) {
        this.field_1_shapeIdMax = i10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.field_5_fileIdClusters != null) {
            int i10 = 0;
            while (i10 < this.field_5_fileIdClusters.length) {
                stringBuffer.append("  DrawingGroupId");
                int i11 = i10 + 1;
                stringBuffer.append(i11);
                stringBuffer.append(": ");
                stringBuffer.append(this.field_5_fileIdClusters[i10].field_1_drawingGroupId);
                stringBuffer.append("\n  NumShapeIdsUsed");
                stringBuffer.append(i11);
                stringBuffer.append(": ");
                stringBuffer.append(this.field_5_fileIdClusters[i10].field_2_numShapeIdsUsed);
                stringBuffer.append('\n');
                i10 = i11;
            }
        }
        return EscherDggRecord.class.getName() + ":\n  RecordId: 0x" + HexDump.toHex((short) RECORD_ID) + "\n  Options: 0x" + HexDump.toHex(getOptions()) + "\n  ShapeIdMax: " + this.field_1_shapeIdMax + "\n  NumIdClusters: " + getNumIdClusters() + "\n  NumShapesSaved: " + this.field_3_numShapesSaved + "\n  DrawingsSaved: " + this.field_4_drawingsSaved + "\n" + stringBuffer.toString();
    }

    public void addCluster(int i10, int i11, boolean z10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.field_5_fileIdClusters));
        arrayList.add(new FileIdCluster(i10, i11));
        if (z10) {
            Collections.sort(arrayList, MY_COMP);
        }
        this.maxDgId = Math.min(this.maxDgId, i10);
        this.field_5_fileIdClusters = (FileIdCluster[]) arrayList.toArray(new FileIdCluster[arrayList.size()]);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}
