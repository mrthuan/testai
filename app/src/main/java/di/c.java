package di;

import java.util.ArrayList;
import java.util.List;
import lh.h;
import lib.zj.office.fc.hssf.model.InternalSheet;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.EscherAggregate;
import lib.zj.office.fc.hssf.usermodel.HSSFChart;
import lib.zj.office.fc.hssf.usermodel.HSSFPatriarch;
import lib.zj.office.fc.hssf.usermodel.HSSFShape;
import lib.zj.office.fc.hssf.util.ColumnInfo;
import lib.zj.office.fc.hssf.util.HSSFPaneInformation;
import lib.zj.office.fc.ss.usermodel.Sheet;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.xls.ChartConverter;
import lib.zj.office.system.AbortReaderError;
import lib.zj.office.system.f;
import lib.zj.office.thirdpart.achartengine.renderers.DefaultRenderer;

/* compiled from: ASheet.java */
/* loaded from: classes3.dex */
public final class c extends ei.c implements Sheet {

    /* renamed from: y  reason: collision with root package name */
    public InternalSheet f16203y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f16204z;

    public c(e eVar, InternalSheet internalSheet) {
        this.f16203y = internalSheet;
        this.f16601a = eVar;
        int numMergedRegions = internalSheet.getNumMergedRegions();
        for (int i10 = 0; i10 < numMergedRegions; i10++) {
            HSSFCellRangeAddress mergedRegionAt = internalSheet.getMergedRegionAt(i10);
            ci.a aVar = new ci.a(mergedRegionAt.getFirstRow(), mergedRegionAt.getFirstColumn(), mergedRegionAt.getLastRow(), mergedRegionAt.getLastColumn());
            ArrayList arrayList = this.f16615p;
            arrayList.add(aVar);
            arrayList.size();
        }
        HSSFPaneInformation paneInformation = internalSheet.getPaneInformation();
        if (paneInformation != null) {
            paneInformation.getHorizontalSplitTopRow();
            paneInformation.getVerticalSplitLeftColumn();
            paneInformation.isFreezePane();
        }
        List<ColumnInfo> columnInfo = internalSheet.getColumnInfo();
        if (columnInfo != null) {
            for (ColumnInfo columnInfo2 : columnInfo) {
                hi.a aVar2 = new hi.a((int) ((columnInfo2.getColWidth() / 256.0d) * 6.0d * 1.3333333730697632d), columnInfo2.getFirstCol(), columnInfo2.getLastCol(), columnInfo2.getStyle(), columnInfo2.isHidden());
                if (this.f16616q == null) {
                    this.f16616q = new ArrayList();
                }
                this.f16616q.add(aVar2);
            }
        }
    }

    public static void q(HSSFShape hSSFShape, lh.b bVar) {
        float rotation = hSSFShape.getRotation();
        if (hSSFShape.getFlipH()) {
            bVar.f20605f = true;
            rotation = -rotation;
        }
        if (hSSFShape.getFlipV()) {
            bVar.f20606g = true;
            rotation = -rotation;
        }
        if ((bVar instanceof h) && ((rotation == 45.0f || rotation == 135.0f || rotation == 225.0f) && !bVar.f20605f && !bVar.f20606g)) {
            rotation -= 90.0f;
        }
        bVar.f20607h = rotation;
    }

    public final eh.b p(HSSFShape hSSFShape, f fVar) {
        if (hSSFShape == null) {
            return null;
        }
        if (hSSFShape.isGradientTile()) {
            return hSSFShape.getGradientTileBackground((e) this.f16601a, fVar);
        }
        if (hSSFShape.getFillType() == 3) {
            byte[] bGPictureData = hSSFShape.getBGPictureData();
            if (bGPictureData == null) {
                return null;
            }
            jh.a aVar = new jh.a();
            aVar.f19231b = bGPictureData;
            int b10 = fVar.o().g().b(aVar);
            eh.b bVar = new eh.b();
            bVar.c = (byte) 3;
            bVar.f16572e = b10;
            return bVar;
        }
        eh.b bVar2 = new eh.b();
        bVar2.c = (byte) 0;
        bVar2.f16571d = hSSFShape.getFillColor();
        return bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x04f3, code lost:
        if (r11 != 7) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0515, code lost:
        if (r14 != 7) goto L239;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(lib.zj.office.system.f r17, lh.f r18, lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup r19, lib.zj.office.fc.hssf.usermodel.HSSFShape r20, lib.zj.office.java.awt.Rectangle r21) {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: di.c.r(lib.zj.office.system.f, lh.f, lib.zj.office.fc.hssf.usermodel.HSSFShapeGroup, lib.zj.office.fc.hssf.usermodel.HSSFShape, lib.zj.office.java.awt.Rectangle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (ei.d.s(r11.f16601a.h(r3)) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(lib.zj.office.fc.xls.SSReader r12) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: di.c.s(lib.zj.office.fc.xls.SSReader):void");
    }

    public final void t(f fVar) {
        EscherAggregate escherAggregate;
        HSSFPatriarch hSSFPatriarch;
        short s4 = this.f16609j;
        DefaultRenderer defaultRenderer = null;
        if (s4 == 0) {
            InternalSheet internalSheet = this.f16203y;
            InternalWorkbook internalWorkbook = ((e) this.f16601a).f16209m;
            internalWorkbook.findDrawingGroup();
            if (internalWorkbook.getDrawingManager() == null || internalSheet.aggregateDrawingRecords(internalWorkbook.getDrawingManager(), false) == -1) {
                escherAggregate = null;
            } else {
                escherAggregate = (EscherAggregate) internalSheet.findFirstRecordBySid(EscherAggregate.sid);
            }
            if (escherAggregate == null) {
                hSSFPatriarch = null;
            } else {
                hSSFPatriarch = new HSSFPatriarch(this, escherAggregate);
                escherAggregate.setPatriarch(hSSFPatriarch);
                escherAggregate.convertRecordsToUserModel((e) this.f16601a);
            }
            if (hSSFPatriarch != null) {
                for (HSSFShape hSSFShape : hSSFPatriarch.getChildren()) {
                    if (!((e) this.f16601a).f16212p.isAborted()) {
                        r(fVar, null, null, hSSFShape, null);
                    } else {
                        throw new AbortReaderError("abort Reader");
                    }
                }
                hSSFPatriarch.dispose();
            }
            this.f16203y = null;
        } else if (s4 == 1) {
            if (!((e) this.f16601a).f16212p.isAborted()) {
                HSSFChart chart = this.f16203y.getChart();
                lh.a aVar = new lh.a();
                ui.a converter = ChartConverter.instance().converter(this, chart);
                if (converter != null) {
                    if (converter instanceof ui.f) {
                        defaultRenderer = ((ui.f) converter).f30390e;
                    } else if (converter instanceof ui.d) {
                        defaultRenderer = ((ui.d) converter).f30386e;
                    }
                    if (defaultRenderer != null && !chart.isNoBorder()) {
                        defaultRenderer.setChartFrame(chart.getLine());
                    }
                    aVar.f20600m = converter;
                    this.f16617r.add(aVar);
                    return;
                }
                return;
            }
            throw new AbortReaderError("abort Reader");
        }
    }
}
