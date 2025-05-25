package lib.zj.office.fc.doc;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.play.core.assetpacks.b1;
import fh.a;
import fj.e;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jf.o;
import l.t;
import lh.g;
import lh.i;
import lh.p;
import lh.r;
import lh.s;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherTextboxRecord;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hssf.record.chart.LineFormatRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesLabelsRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesRecord;
import lib.zj.office.fc.hssf.record.chart.SeriesTextRecord;
import lib.zj.office.fc.hwpf.HWPFDocument;
import lib.zj.office.fc.hwpf.model.FieldsDocumentPart;
import lib.zj.office.fc.hwpf.model.ListFormatOverride;
import lib.zj.office.fc.hwpf.model.ListTables;
import lib.zj.office.fc.hwpf.model.POIListData;
import lib.zj.office.fc.hwpf.model.POIListLevel;
import lib.zj.office.fc.hwpf.model.PicturesTable;
import lib.zj.office.fc.hwpf.usermodel.Bookmarks;
import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.hwpf.usermodel.CharacterRun;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.hwpf.usermodel.HWPFAutoShape;
import lib.zj.office.fc.hwpf.usermodel.HWPFShape;
import lib.zj.office.fc.hwpf.usermodel.HWPFShapeGroup;
import lib.zj.office.fc.hwpf.usermodel.HeaderStories;
import lib.zj.office.fc.hwpf.usermodel.InlineWordArt;
import lib.zj.office.fc.hwpf.usermodel.LineSpacingDescriptor;
import lib.zj.office.fc.hwpf.usermodel.OfficeDrawing;
import lib.zj.office.fc.hwpf.usermodel.POIBookmark;
import lib.zj.office.fc.hwpf.usermodel.Paragraph;
import lib.zj.office.fc.hwpf.usermodel.Picture;
import lib.zj.office.fc.hwpf.usermodel.PictureType;
import lib.zj.office.fc.hwpf.usermodel.Range;
import lib.zj.office.fc.hwpf.usermodel.Section;
import lib.zj.office.fc.hwpf.usermodel.Table;
import lib.zj.office.fc.hwpf.usermodel.TableCell;
import lib.zj.office.fc.hwpf.usermodel.TableRow;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.util.Arrays;
import lib.zj.office.system.b;
import lib.zj.office.system.f;
import o9.d;
import zh.c;
import zh.h;
import zh.j;
import zh.l;

/* loaded from: classes3.dex */
public class DOCReader extends b {
    private long docRealOffset;
    private String filePath;
    private String hyperlinkAddress;
    private boolean isBreakChar;
    private long offset;
    private HWPFDocument poiDoc;
    private long textboxIndex;
    private e wpdoc;
    private String lastEmptyTextHyperlinkAddress = null;
    private Pattern hyperlinkPattern = Pattern.compile("[ \\t\\r\\n]*HYPERLINK \"(.*)\"[ \\t\\r\\n]*");
    private List<a> bms = new ArrayList();

    public DOCReader(f fVar, String str) {
        this.control = fVar;
        this.filePath = str;
    }

    private void adjustBookmarkOffset(long j10, long j11) {
        for (a aVar : this.bms) {
            long j12 = aVar.f17287a;
            if (j12 >= j10 && j12 <= j11) {
                aVar.f17287a = this.offset;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0142, code lost:
        if (r11 != 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private eh.b converFill(lib.zj.office.fc.hwpf.usermodel.HWPFAutoShape r19, lib.zj.office.fc.hwpf.usermodel.OfficeDrawing r20, int r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.doc.DOCReader.converFill(lib.zj.office.fc.hwpf.usermodel.HWPFAutoShape, lib.zj.office.fc.hwpf.usermodel.OfficeDrawing, int):eh.b");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean convertShape(h hVar, OfficeDrawing officeDrawing, lh.f fVar, HWPFShape hWPFShape, Rectangle rectangle, float f10, float f11) {
        r rVar;
        boolean z10;
        p pVar;
        PointF pointF;
        PointF pointF2;
        ug.a endArrowPath;
        ug.a startArrowPath;
        if (rectangle == null) {
            return false;
        }
        boolean z11 = true;
        z11 = true;
        if (hWPFShape instanceof HWPFAutoShape) {
            HWPFAutoShape hWPFAutoShape = (HWPFAutoShape) hWPFShape;
            int shapeType = hWPFAutoShape.getShapeType();
            eh.b converFill = converFill(hWPFAutoShape, officeDrawing, shapeType);
            if (shapeType == 20) {
                z10 = true;
            } else {
                z10 = false;
            }
            gh.b line = hWPFShape.getLine(z10);
            if (line == null && converFill == null && shapeType != 202 && shapeType != 75) {
                return false;
            }
            Rectangle processGrpSpRect = processGrpSpRect(fVar, rectangle);
            if (shapeType == 75) {
                pVar = new s();
            } else {
                pVar = new p();
            }
            pVar.f20615m = shapeType;
            pVar.f20617o = false;
            mi.a.k(processGrpSpRect, Math.abs(hWPFAutoShape.getRotation()));
            pVar.f20604e = processGrpSpRect;
            pVar.f20603d = converFill;
            if (line != null) {
                pVar.f20610k = line;
            }
            Float[] adjustmentValue = hWPFAutoShape.getAdjustmentValue();
            pVar.f20616n = adjustmentValue;
            processRotation(hWPFAutoShape, pVar);
            processAutoshapePosition(hWPFAutoShape, pVar);
            if (shapeType == 75) {
                byte[] pictureframeData = getPictureframeData(officeDrawing, hWPFAutoShape);
                if (pictureframeData != null && isSupportPicture(PictureType.findMatchingType(pictureframeData))) {
                    i iVar = new i();
                    int k10 = this.control.o().g().k(officeDrawing.getTempFilePath(this.control));
                    if (k10 < 0) {
                        jh.a aVar = new jh.a();
                        aVar.c = officeDrawing.getTempFilePath(this.control);
                        aVar.a(PictureType.findMatchingType(pictureframeData).getExtension());
                        k10 = this.control.o().g().b(aVar);
                    }
                    iVar.f20623m = k10;
                    iVar.f20604e = processGrpSpRect;
                    iVar.f20625o = officeDrawing.getPictureEffectInfor();
                    ((s) pVar).v(iVar);
                }
            } else if (shapeType != 20 && shapeType != 32 && shapeType != 33 && shapeType != 34 && shapeType != 38) {
                if (shapeType != 0 && shapeType != 100) {
                    processTextbox(hWPFAutoShape.getSpContainer(), pVar, this.poiDoc.getMainTextboxRange().getSection(0));
                } else {
                    pVar.f20615m = UnknownRecord.BITMAP_00E9;
                    int startArrowType = hWPFAutoShape.getStartArrowType();
                    if (startArrowType > 0 && (startArrowPath = hWPFAutoShape.getStartArrowPath(processGrpSpRect)) != null && startArrowPath.f30368a != null) {
                        PointF pointF3 = startArrowPath.f30369b;
                        tg.b bVar = new tg.b();
                        bVar.c(startArrowPath.f30368a);
                        bVar.f30013e = true;
                        if (startArrowType != 5) {
                            if ((line == null || line.f17807b == null) && hWPFShape.getLineColor() != null) {
                                eh.b bVar2 = new eh.b();
                                bVar2.c = (byte) 0;
                                bVar2.f16571d = hWPFShape.getLineColor().getRGB();
                                bVar.f30011b = bVar2;
                            } else {
                                bVar.f30011b = line.f17807b;
                            }
                        } else {
                            bVar.b(line);
                        }
                        pVar.u(bVar);
                        pointF = pointF3;
                    } else {
                        pointF = null;
                    }
                    int endArrowType = hWPFAutoShape.getEndArrowType();
                    if (endArrowType > 0 && (endArrowPath = hWPFAutoShape.getEndArrowPath(processGrpSpRect)) != null && endArrowPath.f30368a != null) {
                        PointF pointF4 = endArrowPath.f30369b;
                        tg.b bVar3 = new tg.b();
                        bVar3.c(endArrowPath.f30368a);
                        bVar3.f30013e = true;
                        if (endArrowType != 5) {
                            if ((line == null || line.f17807b == null) && hWPFShape.getLineColor() != null) {
                                eh.b bVar4 = new eh.b();
                                bVar4.c = (byte) 0;
                                bVar4.f16571d = hWPFShape.getLineColor().getRGB();
                                bVar3.f30011b = bVar4;
                            } else {
                                bVar3.f30011b = line.f17807b;
                            }
                        } else {
                            bVar3.b(line);
                        }
                        pVar.u(bVar3);
                        pointF2 = pointF4;
                    } else {
                        pointF2 = null;
                    }
                    Path[] freeformPath = hWPFAutoShape.getFreeformPath(processGrpSpRect, pointF, (byte) startArrowType, pointF2, (byte) endArrowType);
                    for (Path path : freeformPath) {
                        tg.b bVar5 = new tg.b();
                        bVar5.c(path);
                        if (line != null) {
                            bVar5.b(line);
                        }
                        if (converFill != null) {
                            bVar5.f30011b = converFill;
                        }
                        pVar.u(bVar5);
                    }
                }
            } else {
                if (pVar.f20615m == 33 && adjustmentValue == null) {
                    pVar.f20616n = new Float[]{Float.valueOf(1.0f)};
                }
                int startArrowType2 = hWPFAutoShape.getStartArrowType();
                if (startArrowType2 > 0) {
                    pVar.r((byte) startArrowType2, hWPFAutoShape.getStartArrowWidth(), hWPFAutoShape.getStartArrowLength());
                }
                int endArrowType2 = hWPFAutoShape.getEndArrowType();
                if (endArrowType2 > 0) {
                    pVar.q((byte) endArrowType2, hWPFAutoShape.getEndArrowWidth(), hWPFAutoShape.getEndArrowLength());
                }
            }
            if (fVar == null) {
                if (officeDrawing.getWrap() == 3 && !officeDrawing.isAnchorLock()) {
                    if (officeDrawing.isBelowText()) {
                        pVar.A = (short) 6;
                    } else {
                        pVar.A = (short) 3;
                    }
                } else {
                    pVar.A = (short) 2;
                }
                zh.b bVar6 = zh.b.f32374b;
                zh.f d10 = hVar.d();
                int d11 = this.control.o().h().d(pVar);
                bVar6.getClass();
                zh.b.S(d10, d11);
                return true;
            }
            fVar.q(pVar);
            return false;
        } else if (hWPFShape instanceof HWPFShapeGroup) {
            HWPFShapeGroup hWPFShapeGroup = (HWPFShapeGroup) hWPFShape;
            r rVar2 = new r();
            if (fVar == null) {
                p pVar2 = new p();
                pVar2.D = rVar2;
                rVar = pVar2;
            } else {
                rVar = rVar2;
            }
            float[] shapeAnchorFit = hWPFShapeGroup.getShapeAnchorFit(rectangle, f10, f11);
            Rectangle processGrpSpRect2 = processGrpSpRect(fVar, rectangle);
            Rectangle coordinates = hWPFShapeGroup.getCoordinates(shapeAnchorFit[0] * f10, shapeAnchorFit[1] * f11);
            rVar2.f20618m = processGrpSpRect2.f20688x - coordinates.f20688x;
            rVar2.f20619n = processGrpSpRect2.f20689y - coordinates.f20689y;
            rVar2.f20604e = processGrpSpRect2;
            rVar2.f20601a = fVar;
            rVar2.f20607h = hWPFShapeGroup.getGroupRotation();
            rVar2.f20605f = hWPFShapeGroup.getFlipHorizontal();
            rVar2.f20606g = hWPFShapeGroup.getFlipVertical();
            HWPFShape[] shapes = hWPFShapeGroup.getShapes();
            if (shapes != null) {
                int i10 = 0;
                while (i10 < shapes.length) {
                    HWPFShape hWPFShape2 = shapes[i10];
                    convertShape(hVar, officeDrawing, rVar2, hWPFShape2, hWPFShape2.getAnchor(processGrpSpRect2, shapeAnchorFit[0] * f10, shapeAnchorFit[z11 ? 1 : 0] * f11), shapeAnchorFit[0] * f10, shapeAnchorFit[z11 ? 1 : 0] * f11);
                    i10++;
                    processGrpSpRect2 = processGrpSpRect2;
                    z11 = (z11 ? 1 : 0) == 1 ? 1 : 0;
                    shapes = shapes;
                }
            }
            boolean z12 = z11;
            if (fVar == null) {
                if (officeDrawing.getWrap() == 3 && !officeDrawing.isAnchorLock()) {
                    ((p) rVar).A = (short) 3;
                } else {
                    ((p) rVar).A = (short) 2;
                }
                zh.b bVar7 = zh.b.f32374b;
                zh.f d12 = hVar.d();
                int d13 = this.control.o().h().d(rVar);
                bVar7.getClass();
                zh.b.S(d12, d13);
            } else {
                rVar.f20601a = fVar;
                fVar.q(rVar);
            }
            return z12;
        } else {
            return false;
        }
    }

    private int converterColorForIndex(short s4) {
        switch (s4) {
            case 1:
                return -16777216;
            case 2:
                return -16776961;
            case 3:
                return -16711681;
            case 4:
                return -16711936;
            case 5:
                return -65281;
            case 6:
                return -65536;
            case 7:
                return -256;
            case 8:
            default:
                return -1;
            case 9:
                return -16776961;
            case 10:
                return -12303292;
            case 11:
                return -16711936;
            case 12:
                return -65281;
            case 13:
                return -65536;
            case 14:
                return -256;
            case 15:
                return -7829368;
            case 16:
                return -3355444;
        }
    }

    private void converterLineSpace(LineSpacingDescriptor lineSpacingDescriptor, zh.f fVar) {
        float dyaLine;
        int i10 = 1;
        if (lineSpacingDescriptor.getMultiLinespace() == 1) {
            float dyaLine2 = lineSpacingDescriptor.getDyaLine() / 240.0f;
            dyaLine = 1.0f;
            if (dyaLine2 == 1.0f) {
                i10 = 0;
            } else if (dyaLine2 == 1.5d) {
                dyaLine = 1.5f;
            } else {
                if (dyaLine2 == 2.0f) {
                    dyaLine2 = 2.0f;
                }
                i10 = 2;
                dyaLine = dyaLine2;
            }
        } else {
            dyaLine = lineSpacingDescriptor.getDyaLine();
            if (dyaLine >= 0.0f) {
                i10 = 3;
            } else {
                dyaLine = -dyaLine;
                i10 = 4;
            }
        }
        zh.b.f32374b.getClass();
        zh.b.P(fVar, dyaLine);
        zh.b.Q(fVar, i10);
    }

    private char[] converterNumberChar(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c = cArr[i10];
            if (c == 61548) {
                cArr[i10] = 9679;
            } else if (c == 61550) {
                cArr[i10] = 9632;
            } else if (c == 61557) {
                cArr[i10] = 9670;
            } else if (c == 61692) {
                cArr[i10] = 8730;
            } else if (c == 61656) {
                cArr[i10] = 9733;
            } else if (c == 61618) {
                cArr[i10] = 9734;
            } else if (c >= 61536) {
                cArr[i10] = 9679;
            }
        }
        return cArr;
    }

    private byte converterParaHorAlign(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 8) {
                        return (byte) 0;
                    }
                }
            }
            return (byte) 2;
        }
        return (byte) 1;
    }

    private void converterSpecialIndent(zh.f fVar, int i10) {
        zh.b.f32374b.getClass();
        zh.b.R(fVar, i10);
        if (i10 < 0) {
            zh.b.O(fVar, zh.b.r(fVar) + i10);
        }
    }

    private byte[] getPictureframeData(OfficeDrawing officeDrawing, HWPFShape hWPFShape) {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) hWPFShape.getSpContainer().getChildById(EscherOptRecord.RECORD_ID);
        if (escherOptRecord == null || (escherSimpleProperty = (EscherSimpleProperty) escherOptRecord.lookup(260)) == null) {
            return null;
        }
        return officeDrawing.getPictureData(this.control, escherSimpleProperty.getPropertyValue());
    }

    private short getTextboxId(EscherContainerRecord escherContainerRecord) {
        byte[] data;
        EscherTextboxRecord escherTextboxRecord = (EscherTextboxRecord) escherContainerRecord.getChildById(EscherTextboxRecord.RECORD_ID);
        if (escherTextboxRecord != null && (data = escherTextboxRecord.getData()) != null && data.length == 4) {
            return LittleEndian.getShort(data, 2);
        }
        return (short) -1;
    }

    private boolean isPageNumber(Field field, String str) {
        if (field != null && (field.getType() == 33 || field.getType() == 26)) {
            return true;
        }
        if (str != null) {
            if (str.contains("NUMPAGES") || str.contains("PAGE")) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isSupportPicture(PictureType pictureType) {
        String extension = pictureType.getExtension();
        if (!extension.equalsIgnoreCase(ContentTypes.EXTENSION_GIF) && !extension.equalsIgnoreCase(ContentTypes.EXTENSION_JPG_2) && !extension.equalsIgnoreCase(ContentTypes.EXTENSION_JPG_1) && !extension.equalsIgnoreCase("bmp") && !extension.equalsIgnoreCase(ContentTypes.EXTENSION_PNG) && !extension.equalsIgnoreCase("wmf") && !extension.equalsIgnoreCase("emf")) {
            return false;
        }
        return true;
    }

    private void processAutoshapePosition(HWPFAutoShape hWPFAutoShape, p pVar) {
        int position_H = hWPFAutoShape.getPosition_H();
        if (position_H != 0) {
            if (position_H != 1) {
                if (position_H != 2) {
                    if (position_H != 3) {
                        if (position_H != 4) {
                            if (position_H == 5) {
                                pVar.f20650v = (byte) 7;
                            }
                        } else {
                            pVar.f20650v = (byte) 6;
                        }
                    } else {
                        pVar.f20650v = (byte) 3;
                    }
                } else {
                    pVar.f20650v = (byte) 2;
                }
            } else {
                pVar.f20650v = (byte) 1;
            }
        } else {
            pVar.f20647s = (byte) 0;
        }
        int positionRelTo_H = hWPFAutoShape.getPositionRelTo_H();
        if (positionRelTo_H != 0) {
            if (positionRelTo_H != 1) {
                if (positionRelTo_H != 2) {
                    if (positionRelTo_H == 3) {
                        pVar.f20648t = (byte) 3;
                    }
                } else {
                    pVar.f20648t = (byte) 0;
                }
            } else {
                pVar.f20648t = (byte) 2;
            }
        } else {
            pVar.f20648t = (byte) 1;
        }
        int position_V = hWPFAutoShape.getPosition_V();
        if (position_V != 0) {
            if (position_V != 1) {
                if (position_V != 2) {
                    if (position_V != 3) {
                        if (position_V != 4) {
                            if (position_V == 5) {
                                pVar.f20654z = (byte) 7;
                            }
                        } else {
                            pVar.f20654z = (byte) 6;
                        }
                    } else {
                        pVar.f20654z = (byte) 5;
                    }
                } else {
                    pVar.f20654z = (byte) 2;
                }
            } else {
                pVar.f20654z = (byte) 4;
            }
        } else {
            pVar.f20651w = (byte) 0;
        }
        int positionRelTo_V = hWPFAutoShape.getPositionRelTo_V();
        if (positionRelTo_V != 0) {
            if (positionRelTo_V != 1) {
                if (positionRelTo_V != 2) {
                    if (positionRelTo_V == 3) {
                        pVar.f20652x = (byte) 11;
                        return;
                    }
                    return;
                }
                pVar.f20652x = (byte) 10;
                return;
            }
            pVar.f20652x = (byte) 2;
            return;
        }
        pVar.f20652x = (byte) 1;
    }

    private void processBookmark() {
        Bookmarks bookmarks = this.poiDoc.getBookmarks();
        if (bookmarks != null) {
            for (int i10 = 0; i10 < bookmarks.getBookmarksCount(); i10++) {
                POIBookmark bookmark = bookmarks.getBookmark(i10);
                String name = bookmark.getName();
                bookmark.getEnd();
                a aVar = new a(name, bookmark.getStart());
                lib.zj.office.system.r o10 = this.control.o();
                if (o10.f21075h == null) {
                    o10.f21075h = new o(1);
                }
                o10.f21075h.f19201a.put(name, aVar);
                this.bms.add(aVar);
            }
        }
    }

    private void processBulletNumber() {
        ListTables listTables = this.poiDoc.getListTables();
        if (listTables == null) {
            return;
        }
        int overrideCount = listTables.getOverrideCount();
        int i10 = 0;
        while (i10 < overrideCount) {
            hh.a aVar = new hh.a();
            i10++;
            POIListData listData = listTables.getListData(listTables.getOverride(i10).getLsid());
            if (listData != null) {
                aVar.f18332a = listData.getLsid();
                POIListLevel[] levels = listData.getLevels();
                int length = levels.length;
                hh.b[] bVarArr = new hh.b[length];
                for (int i11 = 0; i11 < length; i11++) {
                    hh.b bVar = new hh.b();
                    bVarArr[i11] = bVar;
                    processListLevel(levels[i11], bVar);
                }
                aVar.c = bVarArr;
                a2.a e10 = this.control.o().e();
                Integer valueOf = Integer.valueOf(aVar.f18332a);
                if (!((AtomicBoolean) e10.c).get()) {
                    ((LinkedHashMap) e10.f26b).put(valueOf, aVar);
                }
                ((LinkedHashMap) e10.f26b).size();
            }
        }
    }

    private void processCellAttribute(TableCell tableCell, zh.f fVar) {
        if (tableCell.isFirstMerged()) {
            zh.b.f32374b.getClass();
            ((c) fVar).e(1, (short) 12300);
        }
        if (tableCell.isMerged()) {
            zh.b.f32374b.getClass();
            ((c) fVar).e(1, (short) 12301);
        }
        if (tableCell.isFirstVerticallyMerged()) {
            zh.b.f32374b.getClass();
            ((c) fVar).e(1, (short) 12302);
        }
        if (tableCell.isVerticallyMerged()) {
            zh.b.f32374b.getClass();
            ((c) fVar).e(1, (short) 12303);
        }
        zh.b bVar = zh.b.f32374b;
        byte vertAlign = tableCell.getVertAlign();
        bVar.getClass();
        c cVar = (c) fVar;
        cVar.e(vertAlign, (short) 12304);
        cVar.e(tableCell.getWidth(), (short) 12297);
    }

    private void processDoc() {
        boolean z10;
        String text;
        String text2;
        this.poiDoc = new HWPFDocument(new FileInputStream(new File(this.filePath)), this.control);
        processBulletNumber();
        processBookmark();
        this.offset = 0L;
        this.docRealOffset = 0L;
        Range range = this.poiDoc.getRange();
        int numSections = range.numSections();
        for (int i10 = 0; i10 < numSections && !this.abortReader; i10++) {
            processSection(range.getSection(i10));
            if (this.isBreakChar) {
                h f10 = this.wpdoc.f(this.offset - 2);
                if ((f10 instanceof zh.i) && (text2 = f10.getText()) != null && text2.length() == 1 && text2.charAt(0) == '\b') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h f11 = this.wpdoc.f(this.offset - 1);
                if (f11 != null && (f11 instanceof zh.i) && (text = f11.getText()) != null && text.length() == 1 && text.charAt(0) == '\f' && !z10) {
                    ((zh.i) f11).e(String.valueOf('\n'));
                }
            }
        }
        processHeaderFooter();
    }

    private Rectangle processGrpSpRect(lh.f fVar, Rectangle rectangle) {
        if (fVar != null) {
            rectangle.f20688x += fVar.f20618m;
            rectangle.f20689y += fVar.f20619n;
        }
        return rectangle;
    }

    private void processHeaderFooter() {
        HeaderStories headerStories = new HeaderStories(this.poiDoc);
        this.offset = 1152921504606846976L;
        this.docRealOffset = 1152921504606846976L;
        Range oddHeaderSubrange = headerStories.getOddHeaderSubrange();
        if (oddHeaderSubrange != null) {
            processHeaderFooterPara(oddHeaderSubrange, (short) 5, (byte) 1);
        }
        this.offset = 2305843009213693952L;
        this.docRealOffset = 2305843009213693952L;
        Range oddFooterSubrange = headerStories.getOddFooterSubrange();
        if (oddFooterSubrange != null) {
            processHeaderFooterPara(oddFooterSubrange, (short) 6, (byte) 1);
        }
    }

    private void processHeaderFooterPara(Range range, short s4, byte b10) {
        fj.b bVar = new fj.b(s4);
        bVar.f32371a = this.offset;
        int numParagraphs = range.numParagraphs();
        int i10 = 0;
        while (i10 < numParagraphs && !this.abortReader) {
            Paragraph paragraph = range.getParagraph(i10);
            if (paragraph.isInTable()) {
                Table table = range.getTable(paragraph);
                processTable(table);
                i10 += table.numParagraphs() - 1;
            } else {
                processParagraph(paragraph);
            }
            i10++;
        }
        long j10 = this.offset;
        bVar.f32372b = j10;
        this.wpdoc.l(bVar, j10);
    }

    private void processListLevel(POIListLevel pOIListLevel, hh.b bVar) {
        bVar.f18336a = pOIListLevel.getStartAt();
        pOIListLevel.getAlignment();
        bVar.f18338d = pOIListLevel.getTypeOfCharFollowingTheNumber();
        bVar.f18337b = pOIListLevel.getNumberFormat();
        bVar.c = converterNumberChar(pOIListLevel.getNumberChar());
        bVar.f18340f = pOIListLevel.getSpecialIndnet();
        bVar.f18339e = pOIListLevel.getTextIndent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [lib.zj.office.fc.hwpf.usermodel.Field] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [lib.zj.office.fc.doc.DOCReader, lib.zj.office.system.b] */
    private void processParagraph(Paragraph paragraph) {
        int i10;
        long j10;
        String str;
        String str2;
        FieldsDocumentPart fieldsDocumentPart;
        boolean z10;
        boolean z11;
        Object obj;
        String str3;
        ListTables listTables;
        j jVar = new j();
        zh.f fVar = jVar.c;
        zh.b bVar = zh.b.f32374b;
        int spacingBefore = paragraph.getSpacingBefore();
        bVar.getClass();
        zh.b.M(fVar, spacingBefore);
        zh.b.L(fVar, paragraph.getSpacingAfter());
        zh.b.O(fVar, paragraph.getIndentFromLeft());
        c cVar = (c) fVar;
        cVar.e(paragraph.getIndentFromRight(), SeriesRecord.sid);
        zh.b.N(fVar, converterParaHorAlign(paragraph.getJustification()));
        cVar.e(paragraph.getFontAlignment(), LineFormatRecord.sid);
        converterSpecialIndent(fVar, paragraph.getFirstLineIndent());
        converterLineSpace(paragraph.getLineSpacing(), fVar);
        if (paragraph.getIlfo() > 0 && (listTables = this.poiDoc.getListTables()) != null) {
            ListFormatOverride override = listTables.getOverride(paragraph.getIlfo());
            if (override != null) {
                cVar.e(override.getLsid(), SeriesTextRecord.sid);
            }
            cVar.e(paragraph.getIlvl(), SeriesLabelsRecord.sid);
        }
        if (paragraph.isInTable()) {
            cVar.e(paragraph.getTableLevel(), (short) 4107);
        }
        jVar.f32371a = this.offset;
        int numCharacterRuns = paragraph.numCharacterRuns();
        long j11 = this.docRealOffset;
        int i11 = 0;
        ?? r15 = 0;
        boolean z12 = false;
        boolean z13 = false;
        String str4 = "";
        String str5 = str4;
        CharacterRun characterRun = null;
        while (i11 < numCharacterRuns && !this.abortReader) {
            CharacterRun characterRun2 = paragraph.getCharacterRun(i11);
            String text = characterRun2.text();
            if (text.length() != 0 && !characterRun2.isMarkedDeleted()) {
                i10 = numCharacterRuns;
                j10 = j11;
                this.docRealOffset += text.length();
                char charAt = text.charAt(0);
                char charAt2 = text.charAt(text.length() - 1);
                if ((charAt != '\t' || text.length() != 1) && charAt != 5) {
                    if (charAt != 19 && charAt2 != 19) {
                        if (charAt != 20 && charAt2 != 20) {
                            if (charAt != 21 && charAt2 != 21) {
                                if (z12) {
                                    StringBuilder k10 = a0.a.k(str5);
                                    k10.append(characterRun2.text());
                                    str5 = k10.toString();
                                } else if (z13 && isPageNumber(r15, str5)) {
                                    StringBuilder k11 = a0.a.k(str4);
                                    k11.append(characterRun2.text());
                                    str4 = k11.toString();
                                } else {
                                    str = str4;
                                    processRun(characterRun2, paragraph, r15, jVar, null, null);
                                    str2 = str5;
                                    r15 = r15;
                                }
                            } else {
                                String str6 = str4;
                                String str7 = str5;
                                if (characterRun != null && str6 != null && r15 != 0 && r15.getType() == 58) {
                                    if (str6.indexOf("EQ") >= 0 && str6.indexOf("jc") >= 0) {
                                        processRun(characterRun, paragraph, r15, jVar, str7, str6);
                                        obj = null;
                                        z11 = false;
                                        r15 = obj;
                                        this.hyperlinkAddress = r15;
                                        z12 = z11;
                                        z13 = z12;
                                        str4 = "";
                                        str5 = str4;
                                    } else {
                                        if (charAt2 == 21) {
                                            StringBuilder k12 = a0.a.k(str6);
                                            k12.append(text.substring(0, text.length() - 1));
                                            str3 = k12.toString();
                                            z10 = false;
                                        } else {
                                            z10 = false;
                                            str3 = str6;
                                        }
                                        processRun(characterRun2, paragraph, r15, jVar, str7, str3);
                                    }
                                } else {
                                    z10 = false;
                                    if (isPageNumber(r15, str7)) {
                                        processRun(characterRun2, paragraph, r15, jVar, str7, str6);
                                    }
                                }
                                z11 = z10;
                                obj = null;
                                r15 = obj;
                                this.hyperlinkAddress = r15;
                                z12 = z11;
                                z13 = z12;
                                str4 = "";
                                str5 = str4;
                            }
                            i11++;
                            characterRun = characterRun2;
                            numCharacterRuns = i10;
                            j11 = j10;
                            r15 = r15;
                        } else {
                            str = str4;
                            str2 = str5;
                            z13 = true;
                            z12 = false;
                            r15 = r15;
                        }
                    } else {
                        str = str4;
                        str2 = str5;
                        r15 = r15;
                        if (charAt != 21 || charAt2 != 19) {
                            long j12 = this.offset & (-1152921504606846976L);
                            if (j12 != 1152921504606846976L && j12 != 2305843009213693952L) {
                                fieldsDocumentPart = FieldsDocumentPart.MAIN;
                            } else {
                                fieldsDocumentPart = FieldsDocumentPart.HEADER;
                            }
                            z12 = true;
                            r15 = this.poiDoc.getFields().getFieldByStartOffset(fieldsDocumentPart, characterRun2.getStartOffset());
                        }
                    }
                    str5 = str2;
                    str4 = str;
                    i11++;
                    characterRun = characterRun2;
                    numCharacterRuns = i10;
                    j11 = j10;
                    r15 = r15;
                }
            } else {
                i10 = numCharacterRuns;
                j10 = j11;
            }
            str = str4;
            str2 = str5;
            r15 = r15;
            str5 = str2;
            str4 = str;
            i11++;
            characterRun = characterRun2;
            numCharacterRuns = i10;
            j11 = j10;
            r15 = r15;
        }
        long j13 = j11;
        if (paragraph.getTabClearPosition() > 0) {
            zh.b bVar2 = zh.b.f32374b;
            short tabClearPosition = paragraph.getTabClearPosition();
            bVar2.getClass();
            cVar.e(tabClearPosition, (short) 4111);
        }
        long j14 = this.offset;
        if (j14 == jVar.f32371a) {
            jVar.dispose();
            return;
        }
        jVar.f32372b = j14;
        this.wpdoc.j(jVar, j14);
        adjustBookmarkOffset(j13, this.docRealOffset);
    }

    private void processPicturePosition(OfficeDrawing officeDrawing, p pVar) {
        byte horizontalPositioning = officeDrawing.getHorizontalPositioning();
        if (horizontalPositioning != 0) {
            if (horizontalPositioning != 1) {
                if (horizontalPositioning != 2) {
                    if (horizontalPositioning != 3) {
                        if (horizontalPositioning != 4) {
                            if (horizontalPositioning == 5) {
                                pVar.f20650v = (byte) 7;
                            }
                        } else {
                            pVar.f20650v = (byte) 6;
                        }
                    } else {
                        pVar.f20650v = (byte) 3;
                    }
                } else {
                    pVar.f20650v = (byte) 2;
                }
            } else {
                pVar.f20650v = (byte) 1;
            }
        } else {
            pVar.f20647s = (byte) 0;
        }
        byte horizontalRelative = officeDrawing.getHorizontalRelative();
        if (horizontalRelative != 0) {
            if (horizontalRelative != 1) {
                if (horizontalRelative != 2) {
                    if (horizontalRelative == 3) {
                        pVar.f20648t = (byte) 3;
                    }
                } else {
                    pVar.f20648t = (byte) 0;
                }
            } else {
                pVar.f20648t = (byte) 2;
            }
        } else {
            pVar.f20648t = (byte) 1;
        }
        byte verticalPositioning = officeDrawing.getVerticalPositioning();
        if (verticalPositioning != 0) {
            if (verticalPositioning != 1) {
                if (verticalPositioning != 2) {
                    if (verticalPositioning != 3) {
                        if (verticalPositioning != 4) {
                            if (verticalPositioning == 5) {
                                pVar.f20654z = (byte) 7;
                            }
                        } else {
                            pVar.f20654z = (byte) 6;
                        }
                    } else {
                        pVar.f20654z = (byte) 5;
                    }
                } else {
                    pVar.f20654z = (byte) 2;
                }
            } else {
                pVar.f20654z = (byte) 4;
            }
        } else {
            pVar.f20651w = (byte) 0;
        }
        byte verticalRelativeElement = officeDrawing.getVerticalRelativeElement();
        if (verticalRelativeElement != 0) {
            if (verticalRelativeElement != 1) {
                if (verticalRelativeElement != 2) {
                    if (verticalRelativeElement == 3) {
                        pVar.f20652x = (byte) 11;
                        return;
                    }
                    return;
                }
                pVar.f20652x = (byte) 10;
                return;
            }
            pVar.f20652x = (byte) 2;
            return;
        }
        pVar.f20652x = (byte) 1;
    }

    private void processRotation(HWPFAutoShape hWPFAutoShape, g gVar) {
        float rotation = hWPFAutoShape.getRotation();
        if (hWPFAutoShape.getFlipHorizontal()) {
            gVar.h();
            rotation = -rotation;
        }
        if (hWPFAutoShape.getFlipVertical()) {
            gVar.k();
            rotation = -rotation;
        }
        if ((gVar instanceof lh.h) && ((rotation == 45.0f || rotation == 135.0f || rotation == 225.0f) && !gVar.c() && !gVar.d())) {
            rotation -= 90.0f;
        }
        gVar.j(rotation);
    }

    private void processRowAttribute(TableRow tableRow, zh.f fVar) {
        if (tableRow.getRowHeight() != 0) {
            zh.b bVar = zh.b.f32374b;
            int rowHeight = tableRow.getRowHeight();
            bVar.getClass();
            ((c) fVar).e(rowHeight, (short) 12296);
        }
        if (tableRow.isTableHeader()) {
            zh.b.f32374b.getClass();
            ((c) fVar).e(1, (short) 12298);
        }
        if (tableRow.cantSplit()) {
            zh.b.f32374b.getClass();
            ((c) fVar).e(1, (short) 12299);
        }
    }

    private void processRun(CharacterRun characterRun, Range range, Field field, j jVar, String str, String str2) {
        int a10;
        Range firstSubrange;
        int lastIndexOf;
        boolean z10;
        boolean z11;
        String text = characterRun.text();
        if (str2 == null) {
            str2 = text;
        }
        int i10 = 1;
        boolean z12 = false;
        if (str2 != null && str2.length() > 0) {
            char charAt = str2.charAt(0);
            if (charAt == '\f') {
                z10 = true;
            } else {
                z10 = false;
            }
            this.isBreakChar = z10;
            if (charAt == '\b' || charAt == 1) {
                for (int i11 = 0; i11 < str2.length() && !characterRun.isVanished(); i11++) {
                    char charAt2 = str2.charAt(i11);
                    if (charAt2 == '\b' || charAt2 == 1) {
                        zh.i iVar = new zh.i(String.valueOf(charAt2));
                        if (charAt2 == '\b') {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!processShape(characterRun, iVar, z11, i11)) {
                            return;
                        }
                        long j10 = this.offset;
                        iVar.f32371a = j10;
                        long j11 = j10 + 1;
                        this.offset = j11;
                        iVar.f32372b = j11;
                        jVar.e(iVar);
                    }
                }
                return;
            }
        }
        zh.i iVar2 = new zh.i(str2);
        zh.f fVar = iVar2.c;
        zh.b.f32374b.getClass();
        zh.b.z(fVar, (int) ((characterRun.getFontSize() / 2.0f) + 0.5d));
        int a11 = w1.f.b().a(characterRun.getFontName());
        if (a11 >= 0) {
            ((c) fVar).e(a11, (short) 2);
        }
        zh.b.w(fVar, d.b(characterRun.getIco24()));
        zh.b.v(fVar, characterRun.isBold());
        zh.b.x(fVar, characterRun.isItalic());
        zh.b.A(fVar, characterRun.isStrikeThrough());
        c cVar = (c) fVar;
        cVar.e(characterRun.isDoubleStrikeThrough() ? 1 : 0, (short) 7);
        zh.b.B(fVar, characterRun.getUnderlineCode());
        zh.b.C(fVar, d.b(characterRun.getUnderlineColor()));
        zh.b.y(fVar, characterRun.getSubSuperScriptIndex());
        cVar.e(converterColorForIndex(characterRun.getHighlightedColor()), (short) 11);
        if (!TextUtils.isEmpty(this.lastEmptyTextHyperlinkAddress) && (field == null || field.getType() != 88)) {
            this.hyperlinkAddress = this.lastEmptyTextHyperlinkAddress;
            z12 = true;
        }
        if (!z12 && (field == null || field.getType() != 88)) {
            if (str != null) {
                if (str.indexOf("HYPERLINK") > 0) {
                    int indexOf = str.indexOf("_Toc");
                    if (indexOf > 0 && (lastIndexOf = str.lastIndexOf(34)) > 0 && lastIndexOf > indexOf) {
                        int a12 = this.control.o().d().a(5, str.substring(indexOf, lastIndexOf));
                        if (a12 >= 0) {
                            zh.b.w(fVar, -16776961);
                            zh.b.B(fVar, 1);
                            zh.b.C(fVar, -16776961);
                            zh.b.D(fVar, a12);
                        }
                    }
                } else {
                    long j12 = this.offset & (-1152921504606846976L);
                    if (j12 == 1152921504606846976L || j12 == 2305843009213693952L) {
                        if (str.contains("NUMPAGES")) {
                            i10 = 2;
                        } else if (!str.contains("PAGE")) {
                            i10 = -1;
                        }
                        if (i10 > 0) {
                            ((c) iVar2.c).e(i10, (short) 15);
                            ((c) jVar.c).e(i10, (short) 15);
                        }
                    }
                }
            }
        } else {
            if (this.hyperlinkAddress == null && (firstSubrange = field.firstSubrange(range)) != null) {
                Matcher matcher = this.hyperlinkPattern.matcher(firstSubrange.text());
                if (matcher.find()) {
                    this.hyperlinkAddress = matcher.group(1);
                }
            }
            if (this.hyperlinkAddress != null && (a10 = this.control.o().d().a(1, this.hyperlinkAddress)) >= 0) {
                if (TextUtils.isEmpty(str2.trim())) {
                    this.lastEmptyTextHyperlinkAddress = new String(this.hyperlinkAddress);
                }
                zh.b.w(fVar, -16776961);
                zh.b.B(fVar, 1);
                zh.b.C(fVar, -16776961);
                zh.b.D(fVar, a10);
                if (z12) {
                    this.lastEmptyTextHyperlinkAddress = null;
                }
            }
        }
        long j13 = this.offset;
        iVar2.f32371a = j13;
        long length = j13 + str2.length();
        this.offset = length;
        iVar2.f32372b = length;
        jVar.e(iVar2);
    }

    private void processSection(Section section) {
        l lVar = new l();
        zh.f fVar = lVar.c;
        zh.b bVar = zh.b.f32374b;
        int pageWidth = section.getPageWidth();
        bVar.getClass();
        zh.b.K(fVar, pageWidth);
        zh.b.E(fVar, section.getPageHeight());
        zh.b.G(fVar, section.getMarginLeft());
        zh.b.H(fVar, section.getMarginRight());
        zh.b.I(fVar, section.getMarginTop());
        zh.b.F(fVar, section.getMarginBottom());
        c cVar = (c) fVar;
        cVar.e(section.getMarginHeader(), (short) 8199);
        cVar.e(section.getMarginFooter(), (short) 8200);
        if (section.getGridType() != 0) {
            cVar.e(section.getLinePitch(), (short) 8204);
        }
        processSectionBorder(lVar, section);
        lVar.f32371a = this.offset;
        int numParagraphs = section.numParagraphs();
        int i10 = 0;
        while (i10 < numParagraphs && !this.abortReader) {
            Paragraph paragraph = section.getParagraph(i10);
            if (paragraph.isInTable()) {
                Table table = section.getTable(paragraph);
                processTable(table);
                i10 += table.numParagraphs() - 1;
            } else {
                processParagraph(section.getParagraph(i10));
            }
            i10++;
        }
        lVar.f32372b = this.offset;
        this.wpdoc.h(lVar);
    }

    private void processSectionBorder(l lVar, Section section) {
        BorderCode topBorder = section.getTopBorder();
        BorderCode bottomBorder = section.getBottomBorder();
        BorderCode leftBorder = section.getLeftBorder();
        BorderCode rightBorder = section.getRightBorder();
        if (topBorder != null || bottomBorder != null || leftBorder != null || rightBorder != null) {
            section.getPageBorderInfo();
            b1 b1Var = new b1();
            if (topBorder != null) {
                if (topBorder.getColor() != 0) {
                    converterColorForIndex(topBorder.getColor());
                }
                topBorder.getSpace();
            }
            if (bottomBorder != null) {
                if (bottomBorder.getColor() != 0) {
                    converterColorForIndex(bottomBorder.getColor());
                }
                bottomBorder.getSpace();
            }
            if (leftBorder != null) {
                if (leftBorder.getColor() != 0) {
                    converterColorForIndex(leftBorder.getColor());
                }
                leftBorder.getSpace();
            }
            if (rightBorder != null) {
                if (rightBorder.getColor() != 0) {
                    converterColorForIndex(rightBorder.getColor());
                }
                rightBorder.getSpace();
            }
            zh.b bVar = zh.b.f32374b;
            zh.f fVar = lVar.c;
            lib.zj.office.system.r o10 = this.control.o();
            if (o10.f21073f == null) {
                o10.f21073f = new t(8);
            }
            List list = (List) o10.f21073f.f20374a;
            int size = list.size();
            list.add(b1Var);
            bVar.getClass();
            ((c) fVar).e(size, (short) 8203);
        }
    }

    private boolean processShape(CharacterRun characterRun, h hVar, boolean z10, int i10) {
        boolean z11 = false;
        if (z10) {
            OfficeDrawing officeDrawingAt = this.poiDoc.getOfficeDrawingsMain().getOfficeDrawingAt(characterRun.getStartOffset() + i10);
            if (officeDrawingAt == null) {
                return false;
            }
            Rectangle rectangle = new Rectangle();
            rectangle.f20688x = (int) (officeDrawingAt.getRectangleLeft() * 0.06666667f);
            rectangle.f20689y = (int) (officeDrawingAt.getRectangleTop() * 0.06666667f);
            rectangle.width = (int) ((officeDrawingAt.getRectangleRight() - officeDrawingAt.getRectangleLeft()) * 0.06666667f);
            rectangle.height = (int) ((officeDrawingAt.getRectangleBottom() - officeDrawingAt.getRectangleTop()) * 0.06666667f);
            byte[] pictureData = officeDrawingAt.getPictureData(this.control);
            if (pictureData != null) {
                if (isSupportPicture(PictureType.findMatchingType(pictureData))) {
                    i iVar = new i();
                    int k10 = this.control.o().g().k(officeDrawingAt.getTempFilePath(this.control));
                    if (k10 < 0) {
                        jh.a aVar = new jh.a();
                        aVar.c = officeDrawingAt.getTempFilePath(this.control);
                        aVar.a(PictureType.findMatchingType(pictureData).getExtension());
                        k10 = this.control.o().g().b(aVar);
                    }
                    iVar.f20623m = k10;
                    iVar.f20604e = rectangle;
                    iVar.f20625o = officeDrawingAt.getPictureEffectInfor();
                    s sVar = new s();
                    sVar.v(iVar);
                    if (officeDrawingAt.getWrap() == 3 && !officeDrawingAt.isAnchorLock()) {
                        if (officeDrawingAt.isBelowText()) {
                            sVar.A = (short) 6;
                        } else {
                            sVar.A = (short) 3;
                        }
                        processPicturePosition(officeDrawingAt, sVar);
                    } else {
                        sVar.A = (short) 2;
                    }
                    zh.b bVar = zh.b.f32374b;
                    zh.f d10 = hVar.d();
                    int d11 = this.control.o().h().d(sVar);
                    bVar.getClass();
                    zh.b.S(d10, d11);
                    return true;
                }
            } else {
                HWPFShape autoShape = officeDrawingAt.getAutoShape();
                if (autoShape != null) {
                    return convertShape(hVar, officeDrawingAt, null, autoShape, rectangle, 1.0f, 1.0f);
                }
            }
        } else {
            PicturesTable picturesTable = this.poiDoc.getPicturesTable();
            Picture extractPicture = picturesTable.extractPicture(this.control.o().g().f19248b, characterRun, false);
            if (extractPicture != null && isSupportPicture(extractPicture.suggestPictureType())) {
                i iVar2 = new i();
                int k11 = this.control.o().g().k(extractPicture.getTempFilePath());
                if (k11 < 0) {
                    jh.a aVar2 = new jh.a();
                    aVar2.c = extractPicture.getTempFilePath();
                    aVar2.a(extractPicture.suggestPictureType().getExtension());
                    k11 = this.control.o().g().b(aVar2);
                }
                iVar2.f20623m = k11;
                Rectangle rectangle2 = new Rectangle();
                rectangle2.width = (int) (((extractPicture.getDxaGoal() * 0.06666667f) * extractPicture.getHorizontalScalingFactor()) / 1000.0f);
                rectangle2.height = (int) (((extractPicture.getDyaGoal() * 0.06666667f) * extractPicture.getVerticalScalingFactor()) / 1000.0f);
                iVar2.f20604e = rectangle2;
                extractPicture.getZoomX();
                extractPicture.getZoomY();
                kh.b bVar2 = new kh.b();
                float dxaCropLeft = extractPicture.getDxaCropLeft();
                float dyaCropTop = extractPicture.getDyaCropTop();
                float dxaCropRight = extractPicture.getDxaCropRight();
                float dyaCropBottom = extractPicture.getDyaCropBottom();
                if (dxaCropLeft != 0.0f || dyaCropTop != 0.0f || dxaCropRight != 0.0f || dyaCropBottom != 0.0f) {
                    bVar2.f19753a = new kh.a(dxaCropLeft, dyaCropTop, dxaCropRight, dyaCropBottom);
                    z11 = true;
                }
                if (extractPicture.isSetBright()) {
                    bVar2.f19755d = Float.valueOf(extractPicture.getBright());
                    z11 = true;
                }
                if (extractPicture.isSetContrast()) {
                    bVar2.f19756e = Float.valueOf(extractPicture.getContrast());
                    z11 = true;
                }
                if (extractPicture.isSetGrayScl()) {
                    bVar2.f19754b = Boolean.TRUE;
                    z11 = true;
                }
                if (extractPicture.isSetThreshold()) {
                    bVar2.c = Float.valueOf(extractPicture.getThreshold());
                    z11 = true;
                }
                if (!z11) {
                    bVar2 = null;
                }
                iVar2.f20625o = bVar2;
                s sVar2 = new s();
                sVar2.v(iVar2);
                sVar2.A = (short) 2;
                zh.b bVar3 = zh.b.f32374b;
                zh.f d12 = hVar.d();
                int d13 = this.control.o().h().d(sVar2);
                bVar3.getClass();
                zh.b.S(d12, d13);
                return true;
            }
            InlineWordArt extracInlineWordArt = picturesTable.extracInlineWordArt(characterRun);
            if (extracInlineWordArt != null && extracInlineWordArt.getInlineWordArt() != null) {
                p pVar = new p();
                Rectangle rectangle3 = new Rectangle();
                rectangle3.width = (int) (((extracInlineWordArt.getDxaGoal() * 0.06666667f) * extracInlineWordArt.getHorizontalScalingFactor()) / 1000.0f);
                rectangle3.height = (int) (((extracInlineWordArt.getDyaGoal() * 0.06666667f) * extracInlineWordArt.getVerticalScalingFactor()) / 1000.0f);
                pVar.f20604e = rectangle3;
                pVar.A = (short) 2;
                processWordArtTextbox(extracInlineWordArt.getInlineWordArt().getSpContainer(), pVar);
                zh.b bVar4 = zh.b.f32374b;
                zh.f d14 = hVar.d();
                int d15 = this.control.o().h().d(pVar);
                bVar4.getClass();
                zh.b.S(d14, d15);
                return true;
            }
        }
        return false;
    }

    private void processSimpleTextBox(EscherContainerRecord escherContainerRecord, p pVar, Section section) {
        Table table;
        int textboxId = getTextboxId(escherContainerRecord) - 1;
        int textboxStart = this.poiDoc.getTextboxStart(textboxId);
        int textboxEnd = this.poiDoc.getTextboxEnd(textboxId);
        long j10 = this.offset;
        long j11 = this.textboxIndex;
        this.offset = (j11 << 32) + 5764607523034234880L;
        pVar.B = (int) j11;
        l lVar = new l();
        long j12 = this.offset;
        lVar.f32371a = j12;
        this.wpdoc.l(lVar, j12);
        zh.f fVar = lVar.c;
        zh.b.f32374b.getClass();
        zh.b.K(fVar, (int) (pVar.getBounds().width * 15.0f));
        zh.b.E(fVar, (int) (pVar.getBounds().height * 15.0f));
        if (section.getGridType() != 0) {
            ((c) fVar).e(section.getLinePitch(), (short) 8204);
        }
        zh.b.I(fVar, (int) (androidx.activity.s.e0(escherContainerRecord) * 15.0f));
        zh.b.F(fVar, (int) (androidx.activity.s.b0(escherContainerRecord) * 15.0f));
        zh.b.G(fVar, (int) (androidx.activity.s.c0(escherContainerRecord) * 15.0f));
        zh.b.H(fVar, (int) (androidx.activity.s.d0(escherContainerRecord) * 15.0f));
        int i10 = 0;
        zh.b.J(fVar, (byte) 0);
        pVar.C = androidx.activity.s.m0(escherContainerRecord);
        lVar.f32371a = this.offset;
        int numParagraphs = section.numParagraphs();
        int i11 = 0;
        while (i10 < numParagraphs && !this.abortReader) {
            Paragraph paragraph = section.getParagraph(i10);
            i11 += paragraph.text().length();
            if (i11 > textboxStart && i11 <= textboxEnd) {
                if (paragraph.isInTable()) {
                    processTable(section.getTable(paragraph));
                    i10 += table.numParagraphs() - 1;
                } else {
                    processParagraph(section.getParagraph(i10));
                }
            }
            i10++;
        }
        long j13 = this.textboxIndex;
        pVar.B = (int) j13;
        lVar.f32372b = this.offset;
        this.textboxIndex = j13 + 1;
        this.offset = j10;
    }

    private void processTable(Table table) {
        fj.d dVar = new fj.d();
        dVar.f32371a = this.offset;
        Vector vector = new Vector();
        int numRows = table.numRows();
        int i10 = 0;
        while (i10 < numRows) {
            TableRow row = table.getRow(i10);
            if (i10 == 0) {
                processTableAttribute(row, dVar.c);
            }
            fj.c cVar = new fj.c();
            cVar.f32371a = this.offset;
            processRowAttribute(row, cVar.c);
            int numCells = row.numCells();
            int i11 = 0;
            int i12 = 0;
            while (i11 < numCells) {
                TableCell cell = row.getCell(i11);
                cell.isBackward();
                fj.a aVar = new fj.a();
                aVar.f32371a = this.offset;
                processCellAttribute(cell, aVar.c);
                int numParagraphs = cell.numParagraphs();
                for (int i13 = 0; i13 < numParagraphs; i13++) {
                    processParagraph(cell.getParagraph(i13));
                }
                long j10 = this.offset;
                aVar.f32372b = j10;
                int i14 = numRows;
                if (j10 > aVar.f32371a) {
                    cVar.f17299e.a(aVar);
                }
                i12 += cell.getWidth();
                if (!vector.contains(Integer.valueOf(i12))) {
                    vector.add(Integer.valueOf(i12));
                }
                i11++;
                numRows = i14;
            }
            int i15 = numRows;
            long j11 = this.offset;
            cVar.f32372b = j11;
            if (j11 > cVar.f32371a) {
                dVar.f17301f.a(cVar);
            }
            i10++;
            numRows = i15;
        }
        long j12 = this.offset;
        dVar.f32372b = j12;
        if (j12 > dVar.f32371a) {
            this.wpdoc.j(dVar, j12);
            int size = vector.size();
            int[] iArr = new int[size];
            for (int i16 = 0; i16 < size; i16++) {
                iArr[i16] = ((Integer) vector.get(i16)).intValue();
            }
            int i17 = 0;
            Arrays.c(0, iArr, size);
            fj.c cVar2 = (fj.c) dVar.f(0);
            int i18 = 1;
            while (cVar2 != null) {
                zh.e eVar = cVar2.f17299e;
                h d10 = eVar.d(i17);
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                while (d10 != null) {
                    zh.b bVar = zh.b.f32374b;
                    zh.f d11 = d10.d();
                    bVar.getClass();
                    int b10 = ((c) d11).b((short) 12297, true);
                    if (b10 == Integer.MIN_VALUE) {
                        b10 = 0;
                    }
                    i19 += b10;
                    while (true) {
                        if (i21 >= size) {
                            break;
                        } else if (i19 > iArr[i21]) {
                            fj.a aVar2 = new fj.a();
                            i20++;
                            int i22 = eVar.f32384a;
                            int i23 = i22 + 1;
                            h[] hVarArr = eVar.f32385b;
                            if (i23 >= hVarArr.length) {
                                h[] hVarArr2 = new h[i22 + 5];
                                System.arraycopy(hVarArr, 0, hVarArr2, 0, i22);
                                eVar.f32385b = hVarArr2;
                            }
                            int i24 = eVar.f32384a;
                            while (i24 >= i20) {
                                h[] hVarArr3 = eVar.f32385b;
                                int i25 = i24 - 1;
                                hVarArr3[i24] = hVarArr3[i25];
                                i24 = i25;
                            }
                            eVar.f32385b[i20] = aVar2;
                            eVar.f32384a++;
                            i21++;
                        } else {
                            i21++;
                            break;
                        }
                    }
                    i20++;
                    d10 = eVar.d(i20);
                }
                i18++;
                cVar2 = (fj.c) dVar.f(i18);
                i17 = 0;
            }
        }
    }

    private void processTableAttribute(TableRow tableRow, zh.f fVar) {
        if (tableRow.getRowJustification() != 0) {
            zh.b bVar = zh.b.f32374b;
            int rowJustification = tableRow.getRowJustification();
            bVar.getClass();
            zh.b.N(fVar, rowJustification);
        }
        if (tableRow.getTableIndent() != 0) {
            zh.b bVar2 = zh.b.f32374b;
            int tableIndent = tableRow.getTableIndent();
            bVar2.getClass();
            zh.b.O(fVar, tableIndent);
        }
    }

    private void processTextbox(EscherContainerRecord escherContainerRecord, p pVar, Section section) {
        if (section == null) {
            return;
        }
        if (getTextboxId(escherContainerRecord) - 1 >= 0) {
            processSimpleTextBox(escherContainerRecord, pVar, section);
        } else {
            processWordArtTextbox(escherContainerRecord, pVar);
        }
    }

    private void processWordArtTextbox(EscherContainerRecord escherContainerRecord, p pVar) {
        String f02 = androidx.activity.s.f0(escherContainerRecord);
        if (f02 != null && f02.length() > 0) {
            long j10 = this.offset;
            long j11 = this.textboxIndex;
            this.offset = (j11 << 32) + 5764607523034234880L;
            pVar.B = (int) j11;
            l lVar = new l();
            long j12 = this.offset;
            lVar.f32371a = j12;
            this.wpdoc.l(lVar, j12);
            zh.f fVar = lVar.c;
            zh.b.f32374b.getClass();
            zh.b.K(fVar, (int) (pVar.getBounds().width * 15.0f));
            zh.b.E(fVar, (int) (pVar.getBounds().height * 15.0f));
            zh.b.I(fVar, (int) (androidx.activity.s.e0(escherContainerRecord) * 15.0f));
            zh.b.F(fVar, (int) (androidx.activity.s.b0(escherContainerRecord) * 15.0f));
            zh.b.G(fVar, (int) (androidx.activity.s.c0(escherContainerRecord) * 15.0f));
            zh.b.H(fVar, (int) (androidx.activity.s.d0(escherContainerRecord) * 15.0f));
            zh.b.J(fVar, (byte) 0);
            pVar.C = androidx.activity.s.m0(escherContainerRecord);
            int c02 = (int) ((pVar.getBounds().width - androidx.activity.s.c0(escherContainerRecord)) - androidx.activity.s.d0(escherContainerRecord));
            int e02 = (int) ((pVar.getBounds().height - androidx.activity.s.e0(escherContainerRecord)) - androidx.activity.s.b0(escherContainerRecord));
            Paint a10 = sg.d.f29801b.a();
            int i10 = 12;
            a10.setTextSize(12);
            for (Paint.FontMetrics fontMetrics = a10.getFontMetrics(); ((int) a10.measureText(f02)) < c02 && ((int) Math.ceil(fontMetrics.descent - fontMetrics.ascent)) < e02; fontMetrics = a10.getFontMetrics()) {
                i10++;
                a10.setTextSize(i10);
            }
            lVar.f32371a = this.offset;
            j jVar = new j();
            jVar.f32371a = this.offset;
            long j13 = this.docRealOffset;
            zh.i iVar = new zh.i(f02);
            zh.f fVar2 = iVar.c;
            zh.b.f32374b.getClass();
            zh.b.z(fVar2, (int) ((i10 - 1) * 0.75f));
            Color O = androidx.activity.s.O(escherContainerRecord, null, 2);
            if (O != null) {
                zh.b.w(fVar2, O.getRGB());
            }
            long j14 = this.offset;
            iVar.f32371a = j14;
            long length = j14 + f02.length();
            this.offset = length;
            iVar.f32372b = length;
            jVar.e(iVar);
            long j15 = this.offset;
            jVar.f32372b = j15;
            this.wpdoc.j(jVar, j15);
            adjustBookmarkOffset(j13, this.docRealOffset);
            long j16 = this.textboxIndex;
            pVar.B = (int) j16;
            lVar.f32372b = this.offset;
            this.textboxIndex = j16 + 1;
            this.offset = j10;
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void dispose() {
        List<a> list;
        if (isReaderFinish() && (list = this.bms) != null) {
            list.clear();
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public Object getModel() {
        e eVar = this.wpdoc;
        if (eVar != null) {
            return eVar;
        }
        this.wpdoc = new e();
        processDoc();
        return this.wpdoc;
    }

    public boolean searchContent(File file, String str, f fVar) {
        Range range = new HWPFDocument(new FileInputStream(file), fVar).getRange();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (int i10 = 0; i10 < range.numSections(); i10++) {
            Section section = range.getSection(i10);
            int i11 = 0;
            while (true) {
                if (i11 < section.numParagraphs()) {
                    Paragraph paragraph = section.getParagraph(i11);
                    for (int i12 = 0; i12 < paragraph.numCharacterRuns(); i12++) {
                        sb2.append(paragraph.getCharacterRun(i12).text());
                    }
                    if (sb2.indexOf(str) >= 0) {
                        z10 = true;
                        break;
                    }
                    sb2.delete(0, sb2.length());
                    i11++;
                }
            }
        }
        return z10;
    }
}
