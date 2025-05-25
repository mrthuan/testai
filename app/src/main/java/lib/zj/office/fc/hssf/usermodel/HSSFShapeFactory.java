package lib.zj.office.fc.hssf.usermodel;

import di.e;
import java.util.Map;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.hssf.record.EmbeddedObjectRefSubRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.SubRecord;

/* loaded from: classes3.dex */
public final class HSSFShapeFactory {
    public static HSSFShape createShape(e eVar, Map<EscherRecord, Record> map, EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape) {
        if (escherContainerRecord.getRecordId() == -4093) {
            return createShapeGroup(eVar, map, escherContainerRecord, hSSFShape);
        }
        return createSimpeShape(eVar, map, escherContainerRecord, hSSFShape);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[LOOP:0: B:30:0x00a4->B:32:0x00aa, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup createShapeGroup(di.e r9, java.util.Map<lib.zj.office.fc.ddf.EscherRecord, lib.zj.office.fc.hssf.record.Record> r10, lib.zj.office.fc.ddf.EscherContainerRecord r11, lib.zj.office.fc.hssf.usermodel.HSSFShape r12) {
        /*
            java.util.List r11 = r11.getChildRecords()
            int r0 = r11.size()
            r1 = 0
            if (r0 <= 0) goto Lba
            r0 = 0
            java.lang.Object r2 = r11.get(r0)
            lib.zj.office.fc.ddf.EscherContainerRecord r2 = (lib.zj.office.fc.ddf.EscherContainerRecord) r2
            if (r12 != 0) goto L34
            r3 = -4080(0xfffffffffffff010, float:NaN)
            lib.zj.office.fc.ddf.EscherRecord r3 = androidx.activity.s.F(r2, r3)
            lib.zj.office.fc.ddf.EscherClientAnchorRecord r3 = (lib.zj.office.fc.ddf.EscherClientAnchorRecord) r3
            if (r3 == 0) goto L43
            short r4 = r3.getCol2()
            r5 = 255(0xff, float:3.57E-43)
            if (r4 > r5) goto L43
            short r4 = r3.getRow2()
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r5) goto L43
            lib.zj.office.fc.hssf.usermodel.HSSFClientAnchor r3 = lib.zj.office.fc.hssf.usermodel.HSSFShape.toClientAnchor(r3)
            goto L44
        L34:
            r3 = -4081(0xfffffffffffff00f, float:NaN)
            lib.zj.office.fc.ddf.EscherRecord r3 = androidx.activity.s.F(r2, r3)
            lib.zj.office.fc.ddf.EscherChildAnchorRecord r3 = (lib.zj.office.fc.ddf.EscherChildAnchorRecord) r3
            if (r3 == 0) goto L43
            lib.zj.office.fc.hssf.usermodel.HSSFChildAnchor r3 = lib.zj.office.fc.hssf.usermodel.HSSFShape.toChildAnchor(r3)
            goto L44
        L43:
            r3 = r1
        L44:
            if (r3 != 0) goto L4b
            lib.zj.office.fc.hssf.usermodel.HSSFClientAnchor r3 = new lib.zj.office.fc.hssf.usermodel.HSSFClientAnchor
            r3.<init>()
        L4b:
            r4 = -3806(0xfffffffffffff122, float:NaN)
            lib.zj.office.fc.ddf.EscherRecord r4 = androidx.activity.s.F(r2, r4)
            r5 = 1
            if (r4 == 0) goto L81
            lib.zj.office.fc.ddf.EscherPropertyFactory r6 = new lib.zj.office.fc.ddf.EscherPropertyFactory
            r6.<init>()
            byte[] r7 = r4.serialize()
            r8 = 8
            short r4 = r4.getInstance()
            java.util.List r4 = r6.createProperties(r7, r8, r4)
            java.lang.Object r0 = r4.get(r0)
            lib.zj.office.fc.ddf.EscherSimpleProperty r0 = (lib.zj.office.fc.ddf.EscherSimpleProperty) r0
            short r4 = r0.getPropertyNumber()
            r6 = 927(0x39f, float:1.299E-42)
            if (r4 != r6) goto L7b
            int r0 = r0.getPropertyValue()
            if (r0 == r5) goto L87
        L7b:
            lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup r1 = new lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup
            r1.<init>(r2, r12, r3)
            goto L87
        L81:
            lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup r0 = new lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup
            r0.<init>(r2, r12, r3)
            r1 = r0
        L87:
            r12 = -4087(0xfffffffffffff009, float:NaN)
            lib.zj.office.fc.ddf.EscherRecord r12 = androidx.activity.s.F(r2, r12)
            lib.zj.office.fc.ddf.EscherSpgrRecord r12 = (lib.zj.office.fc.ddf.EscherSpgrRecord) r12
            if (r12 == 0) goto La4
            int r0 = r12.getRectX1()
            int r2 = r12.getRectY1()
            int r3 = r12.getRectX2()
            int r12 = r12.getRectY2()
            r1.setCoordinates(r0, r2, r3, r12)
        La4:
            int r12 = r11.size()
            if (r5 >= r12) goto Lba
            java.lang.Object r12 = r11.get(r5)
            lib.zj.office.fc.ddf.EscherContainerRecord r12 = (lib.zj.office.fc.ddf.EscherContainerRecord) r12
            lib.zj.office.fc.hssf.usermodel.HSSFShape r12 = createShape(r9, r10, r12, r1)
            r1.addChildShape(r12)
            int r5 = r5 + 1
            goto La4
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.usermodel.HSSFShapeFactory.createShapeGroup(di.e, java.util.Map, lib.zj.office.fc.ddf.EscherContainerRecord, lib.zj.office.fc.hssf.usermodel.HSSFShape):lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lib.zj.office.fc.hssf.usermodel.HSSFShape createSimpeShape(di.e r8, java.util.Map<lib.zj.office.fc.ddf.EscherRecord, lib.zj.office.fc.hssf.record.Record> r9, lib.zj.office.fc.ddf.EscherContainerRecord r10, lib.zj.office.fc.hssf.usermodel.HSSFShape r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.hssf.usermodel.HSSFShapeFactory.createSimpeShape(di.e, java.util.Map, lib.zj.office.fc.ddf.EscherContainerRecord, lib.zj.office.fc.hssf.usermodel.HSSFShape):lib.zj.office.fc.hssf.usermodel.HSSFShape");
    }

    private static boolean isEmbeddedObject(ObjRecord objRecord) {
        for (SubRecord subRecord : objRecord.getSubRecords()) {
            if (subRecord instanceof EmbeddedObjectRefSubRecord) {
                return true;
            }
        }
        return false;
    }
}
