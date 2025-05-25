package lib.zj.office.fc.ppt;

import a6.h;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lh.g;
import lh.m;
import lh.n;
import lib.zj.office.fc.hslf.HSLFSlideShow;
import lib.zj.office.fc.hslf.model.AutoShape;
import lib.zj.office.fc.hslf.model.Fill;
import lib.zj.office.fc.hslf.model.Freeform;
import lib.zj.office.fc.hslf.model.HeadersFooters;
import lib.zj.office.fc.hslf.model.Line;
import lib.zj.office.fc.hslf.model.MasterSheet;
import lib.zj.office.fc.hslf.model.Notes;
import lib.zj.office.fc.hslf.model.Picture;
import lib.zj.office.fc.hslf.model.Shape;
import lib.zj.office.fc.hslf.model.ShapeGroup;
import lib.zj.office.fc.hslf.model.Sheet;
import lib.zj.office.fc.hslf.model.SimpleShape;
import lib.zj.office.fc.hslf.model.Slide;
import lib.zj.office.fc.hslf.model.SlideMaster;
import lib.zj.office.fc.hslf.model.Table;
import lib.zj.office.fc.hslf.model.TableCell;
import lib.zj.office.fc.hslf.model.TextBox;
import lib.zj.office.fc.hslf.model.TextShape;
import lib.zj.office.fc.hslf.model.TitleMaster;
import lib.zj.office.fc.hslf.record.BinaryTagDataBlob;
import lib.zj.office.fc.hslf.record.ClientVisualElementContainer;
import lib.zj.office.fc.hslf.record.DocumentAtom;
import lib.zj.office.fc.hslf.record.OEPlaceholderAtom;
import lib.zj.office.fc.hslf.record.PositionDependentRecordContainer;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hslf.record.SlideProgBinaryTagContainer;
import lib.zj.office.fc.hslf.record.SlideProgTagsContainer;
import lib.zj.office.fc.hslf.record.SlideShowSlideInfoAtom;
import lib.zj.office.fc.hslf.record.TimeAnimateBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeColorBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeCommandBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeEffectBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeMotionBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeNodeAttributeContainer;
import lib.zj.office.fc.hslf.record.TimeNodeContainer;
import lib.zj.office.fc.hslf.record.TimeRotationBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeScaleBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeSetBehaviorContainer;
import lib.zj.office.fc.hslf.record.TimeVariant;
import lib.zj.office.fc.hslf.record.VisualShapeAtom;
import lib.zj.office.fc.hslf.usermodel.PictureData;
import lib.zj.office.fc.hslf.usermodel.RichTextRun;
import lib.zj.office.fc.hslf.usermodel.SlideShow;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.ppt.bulletnumber.BulletNumberManage;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Rectangle2D;
import lib.zj.office.ss.util.format.NumericFormatter;
import lib.zj.office.system.b;
import lib.zj.office.system.f;
import qh.e;
import s5.a;
import th.c;
import th.d;
import zh.i;
import zh.j;
import zh.l;

/* loaded from: classes3.dex */
public class PPTReader extends b {
    public static final int DEFAULT_CELL_HEIGHT = 40;
    public static final int DEFAULT_CELL_WIDTH = 100;
    public static final int FIRST_READ_SLIDE_NUM = 2;
    public static final float POINT_PER_LINE_PER_FONTSIZE = 1.2f;
    private int currentReaderIndex;
    private String filePath;
    private boolean hasProcessedMasterDateTime;
    private boolean hasProcessedMasterFooter;
    private boolean hasProcessedMasterSlideNumber;
    private boolean isGetThumbnail;
    private int maxFontSize;
    private c model;
    private int number;
    private int offset;
    private HeadersFooters poiHeadersFooters;
    private SlideShow poiSlideShow;
    private Map<Integer, Integer> slideMasterIndexs;
    private boolean tableShape;
    private Map<Integer, Integer> titleMasterIndexs;

    public PPTReader(f fVar, String str) {
        this(fVar, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
        if (r10 != 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private eh.b converFill(th.d r18, lib.zj.office.fc.hslf.model.Fill r19) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.PPTReader.converFill(th.d, lib.zj.office.fc.hslf.model.Fill):eh.b");
    }

    private int converterColor(Color color) {
        return color.getRGB();
    }

    private int getBorderColor(Line line) {
        Color lineColor;
        if (line != null && (lineColor = line.getLineColor()) != null) {
            return converterColor(lineColor);
        }
        return -16777216;
    }

    private int getGroupShapeID(int i10, Map<Integer, List<Integer>> map) {
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            List<Integer> list = map.get(Integer.valueOf(intValue));
            if (list != null && list.contains(Integer.valueOf(i10))) {
                return intValue;
            }
        }
        return -1;
    }

    private int getParaIndex(d dVar, VisualShapeAtom visualShapeAtom) {
        g[] i10 = dVar.i();
        int length = i10.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            g gVar = i10[i12];
            if ((gVar instanceof n) && gVar.e() == visualShapeAtom.getTargetElementID()) {
                l lVar = ((n) i10[i12]).f20643n;
                j jVar = (j) lVar.f32391e.c(0L);
                while (jVar != null) {
                    long j10 = jVar.f32372b;
                    if (jVar.f32371a == visualShapeAtom.getData1() && (j10 == visualShapeAtom.getData2() || j10 == visualShapeAtom.getData2() - 1)) {
                        return i11;
                    }
                    i11++;
                    jVar = (j) lVar.f32391e.c(j10);
                }
                return -2;
            }
        }
        return -2;
    }

    private gh.b getShapeLine(SimpleShape simpleShape) {
        return getShapeLine(simpleShape, false);
    }

    private boolean isTitleSlide(Slide slide) {
        int i10;
        Shape[] shapes;
        int placeholderId;
        SlideAtom slideAtom = slide.getSlideRecord().getSlideAtom();
        if (slideAtom != null && slideAtom.getSSlideLayoutAtom() != null) {
            i10 = slideAtom.getSSlideLayoutAtom().getGeometryType();
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 != 16) {
            return false;
        }
        for (Shape shape : slide.getShapes()) {
            if (!(shape instanceof TextShape)) {
                return false;
            }
            OEPlaceholderAtom placeholderAtom = ((TextShape) shape).getPlaceholderAtom();
            if (placeholderAtom != null && (placeholderId = placeholderAtom.getPlaceholderId()) != 15 && placeholderId != 16 && placeholderId != -1) {
                return false;
            }
        }
        return true;
    }

    private List<e> processAnimation(d dVar, TimeNodeContainer timeNodeContainer) {
        Record[] childRecords;
        e processSingleAnimation;
        try {
            ArrayList arrayList = new ArrayList();
            Record[] childRecords2 = timeNodeContainer.getChildRecords();
            if (childRecords2 == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Record record : childRecords2) {
                if (record instanceof TimeNodeContainer) {
                    arrayList2.add((TimeNodeContainer) record);
                }
            }
            if (arrayList2.size() > 1) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Record findFirstOfType = ((TimeNodeContainer) it.next()).findFirstOfType(TimeNodeContainer.RECORD_ID);
                    if (findFirstOfType != null && (processSingleAnimation = processSingleAnimation(dVar, (TimeNodeContainer) findFirstOfType)) != null) {
                        arrayList.add(processSingleAnimation);
                    }
                }
            } else if (arrayList2.size() == 1) {
                arrayList2.clear();
                for (Record record2 : ((TimeNodeContainer) arrayList2.get(0)).getChildRecords()) {
                    if (record2 instanceof TimeNodeContainer) {
                        arrayList2.add((TimeNodeContainer) record2);
                    }
                }
                if (arrayList2.size() == 1) {
                    e processSingleAnimation2 = processSingleAnimation(dVar, (TimeNodeContainer) arrayList2.get(0));
                    if (processSingleAnimation2 != null) {
                        arrayList.add(processSingleAnimation2);
                    }
                } else if (arrayList2.size() > 1) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        e processSingleAnimation3 = processSingleAnimation(dVar, (TimeNodeContainer) it2.next());
                        if (processSingleAnimation3 != null) {
                            arrayList.add(processSingleAnimation3);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private n processCurrentSlideHeadersFooters(n nVar, String str) {
        l lVar;
        if (nVar != null && str != null && str.length() > 0 && (lVar = nVar.f20643n) != null && lVar.f32372b - lVar.f32371a > 0) {
            n nVar2 = new n();
            nVar2.f20604e = nVar.f20604e;
            nVar2.f20642m = nVar.f20642m;
            l lVar2 = new l();
            lVar2.f32371a = 0L;
            lVar2.f32372b = str.length();
            lVar2.c = ((zh.c) nVar.f20643n.c).clone();
            nVar2.f20643n = lVar2;
            j jVar = (j) nVar.f20643n.f32391e.d(0);
            j jVar2 = new j();
            jVar2.f32371a = 0L;
            jVar2.f32372b = str.length();
            jVar2.c = ((zh.c) jVar.c).clone();
            lVar2.e(jVar2);
            i iVar = (i) jVar.f(0);
            String text = iVar.getText();
            if (text != null && text.contains("*")) {
                str = text.replace("*", str);
            }
            i iVar2 = new i(str);
            iVar2.f32371a = 0L;
            iVar2.f32372b = str.length();
            iVar2.c = ((zh.c) iVar.c).clone();
            jVar2.e(iVar2);
            return nVar2;
        }
        return null;
    }

    private void processGroupShape(d dVar) {
        HashMap hashMap = dVar.f30044k;
        if (hashMap == null) {
            return;
        }
        int f10 = dVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            g e10 = dVar.e(i10);
            e10.i(getGroupShapeID(e10.e(), hashMap));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processNormalTextShape(lh.n r16, lib.zj.office.fc.hslf.model.TextShape r17, lib.zj.office.java.awt.Rectangle r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.PPTReader.processNormalTextShape(lh.n, lib.zj.office.fc.hslf.model.TextShape, lib.zj.office.java.awt.Rectangle, int, int):void");
    }

    private void processNotes(d dVar, Notes notes) {
        Shape[] shapes;
        TextShape textShape;
        OEPlaceholderAtom placeholderAtom;
        String text;
        if (notes != null) {
            String str = "";
            for (Shape shape : notes.getShapes()) {
                if (this.abortReader) {
                    break;
                }
                if (((shape instanceof AutoShape) || (shape instanceof TextBox)) && (placeholderAtom = (textShape = (TextShape) shape).getPlaceholderAtom()) != null && placeholderAtom.getPlaceholderId() == 12 && (text = textShape.getText()) != null && text.length() > 0) {
                    str = h.c(str, text) + '\n';
                }
            }
            if (str.trim().length() > 0) {
                dVar.f30040g = new a(str.trim());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x021e, code lost:
        r7 = r20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processParagraph(zh.l r26, lib.zj.office.fc.hslf.model.TextShape r27, java.lang.String r28, lib.zj.office.fc.hslf.model.Hyperlink[] r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.fc.ppt.PPTReader.processParagraph(zh.l, lib.zj.office.fc.hslf.model.TextShape, java.lang.String, lib.zj.office.fc.hslf.model.Hyperlink[], int, int, int):void");
    }

    private void processRun(TextShape textShape, RichTextRun richTextRun, j jVar, String str, int i10, int i11, int i12, boolean z10) {
        int i13;
        int a10;
        int i14;
        Sheet sheet = textShape.getSheet();
        byte metaCharactersType = textShape.getMetaCharactersType();
        String replace = str.replace((char) 160, ' ');
        int i15 = 0;
        int i16 = 0;
        if (z10) {
            int i17 = 0;
            while (i17 < replace.length()) {
                if (replace.charAt(i17) == '\n') {
                    int i18 = i11 + i17;
                    i14 = i17;
                    processRun(textShape, richTextRun, jVar, replace.substring(i16, i17), i10, i11 + i16, i18, false);
                    processRun(textShape, richTextRun, jVar, String.valueOf((char) 11), i10, i18, i18 + 1, false);
                    i16 = i14 + 1;
                } else {
                    i14 = i17;
                }
                i17 = i14 + 1;
            }
            if (i16 < replace.length()) {
                processRun(textShape, richTextRun, jVar, replace.substring(i16, replace.length()), i10, i11 + i16, replace.length() + i11, false);
                i16 = replace.length();
            }
        }
        int i19 = i11 + i16;
        this.maxFontSize = 0;
        if (i12 <= i19) {
            return;
        }
        if (replace.length() > i12) {
            replace = replace.substring(i19, i12);
        }
        int i20 = 2;
        if (replace.contains("*")) {
            if (metaCharactersType != 2 && metaCharactersType != 3 && metaCharactersType != 5) {
                if (metaCharactersType == 4 && this.poiHeadersFooters.getFooterText() != null) {
                    replace = this.poiHeadersFooters.getFooterText();
                }
            } else {
                NumericFormatter numericFormatter = NumericFormatter.f20969b;
                Date date = new Date(System.currentTimeMillis());
                numericFormatter.getClass();
                replace = replace.replace("*", NumericFormatter.d("yyyy/m/d", date));
            }
        }
        i iVar = new i(replace);
        zh.f fVar = iVar.c;
        int fontSize = richTextRun.getFontSize();
        zh.b bVar = zh.b.f32374b;
        if (fontSize <= 0) {
            fontSize = 18;
        }
        bVar.getClass();
        zh.b.z(fVar, fontSize);
        setMaxFontSize(richTextRun.getFontSize());
        if (!"\n".equals(replace)) {
            if (richTextRun.getFontName() != null && (a10 = w1.f.b().a(richTextRun.getFontName())) >= 0) {
                ((zh.c) fVar).e(a10, (short) 2);
            }
            zh.b.w(fVar, converterColor(richTextRun.getFontColor()));
            zh.b.v(fVar, richTextRun.isBold());
            zh.b.x(fVar, richTextRun.isItalic());
            if (richTextRun.isUnderlined()) {
                i15 = 1;
            }
            zh.b.B(fVar, i15);
            zh.b.A(fVar, richTextRun.isStrikethrough());
            int superscript = richTextRun.getSuperscript();
            if (superscript != 0) {
                if (superscript > 0) {
                    i20 = 1;
                }
                zh.b.y(fVar, i20);
            }
            if (i10 >= 0) {
                if (sheet != null) {
                    i13 = o9.d.b(sheet.getColorScheme().getAccentAndHyperlinkColourRGB());
                } else {
                    i13 = -16776961;
                }
                zh.b.w(fVar, i13);
                zh.b.B(fVar, 1);
                zh.b.C(fVar, i13);
                zh.b.D(fVar, i10);
            }
        }
        int i21 = this.offset;
        iVar.f32371a = i21;
        int length = replace.length() + i21;
        this.offset = length;
        iVar.f32372b = length;
        jVar.e(iVar);
    }

    private void processShape(d dVar, lh.f fVar, Shape shape, int i10) {
        Rectangle2D logicalAnchor2D;
        eh.b bVar;
        gh.b bVar2;
        lh.e eVar;
        lh.b bVar3;
        PointF pointF;
        PointF pointF2;
        ug.a endArrowPathAndTail;
        eh.b bVar4;
        ug.a startArrowPathAndTail;
        eh.b bVar5;
        g gVar;
        this.tableShape = false;
        if (!this.abortReader && !shape.isHidden()) {
            boolean z10 = shape instanceof ShapeGroup;
            if (z10) {
                logicalAnchor2D = ((ShapeGroup) shape).getClientAnchor2D(shape);
            } else {
                logicalAnchor2D = shape.getLogicalAnchor2D();
            }
            if (logicalAnchor2D == null) {
                return;
            }
            Rectangle rectangle = new Rectangle();
            rectangle.f20688x = (int) (logicalAnchor2D.getX() * 1.3333333730697632d);
            rectangle.f20689y = (int) (logicalAnchor2D.getY() * 1.3333333730697632d);
            rectangle.width = (int) (logicalAnchor2D.getWidth() * 1.3333333730697632d);
            rectangle.height = (int) (logicalAnchor2D.getHeight() * 1.3333333730697632d);
            if (shape instanceof SimpleShape) {
                if (i10 == 2) {
                    int masterShapeID = shape.getMasterShapeID();
                    d e10 = this.model.e(dVar.f30042i[0]);
                    if (e10 != null) {
                        int f10 = e10.f();
                        for (int i11 = 0; i11 < f10; i11++) {
                            gVar = e10.e(i11);
                            if (gVar.e() == masterShapeID) {
                                break;
                            }
                        }
                    }
                }
                gVar = null;
                bVar = converFill(dVar, shape.getFill());
                if (bVar == null && gVar != null && (gVar instanceof lh.b)) {
                    bVar = ((lh.b) gVar).f20603d;
                }
                bVar2 = getShapeLine((SimpleShape) shape);
                if (bVar2 == null && gVar != null && (gVar instanceof lh.b)) {
                    bVar2 = ((lh.b) gVar).f20610k;
                }
            } else {
                bVar = null;
                bVar2 = null;
            }
            boolean z11 = shape instanceof Line;
            if (!z11 && !(shape instanceof Freeform) && !(shape instanceof AutoShape) && !(shape instanceof TextBox) && !(shape instanceof Picture)) {
                if (shape instanceof Table) {
                    processTable(dVar, (Table) shape, fVar, i10);
                } else if (z10) {
                    ShapeGroup shapeGroup = (ShapeGroup) shape;
                    lh.f fVar2 = new lh.f();
                    fVar2.f20604e = rectangle;
                    fVar2.c = shape.getShapeId();
                    fVar2.f20605f = shapeGroup.getFlipHorizontal();
                    fVar2.f20606g = shapeGroup.getFlipVertical();
                    fVar2.f20601a = fVar;
                    processGrpRotation(shape, fVar2);
                    Shape[] shapes = shapeGroup.getShapes();
                    ArrayList arrayList = new ArrayList(shapes.length);
                    for (int i12 = 0; i12 < shapes.length; i12++) {
                        processShape(dVar, fVar2, shapes[i12], i10);
                        arrayList.add(Integer.valueOf(shapes[i12].getShapeId()));
                    }
                    if (fVar == null) {
                        dVar.c(fVar2);
                    } else {
                        fVar.q(fVar2);
                    }
                    dVar.a(shape.getShapeId(), arrayList);
                }
            } else if (z11) {
                if (bVar2 != null) {
                    lh.h hVar = new lh.h();
                    hVar.f20615m = shape.getShapeType();
                    hVar.f20604e = rectangle;
                    hVar.f20603d = bVar;
                    hVar.f20610k = bVar2;
                    Line line = (Line) shape;
                    Float[] adjustmentValue = line.getAdjustmentValue();
                    if (hVar.f20615m == 33 && adjustmentValue == null) {
                        hVar.f20616n = new Float[]{Float.valueOf(1.0f)};
                    } else {
                        hVar.f20616n = adjustmentValue;
                    }
                    int startArrowType = shape.getStartArrowType();
                    if (startArrowType > 0) {
                        hVar.r((byte) startArrowType, shape.getStartArrowWidth(), shape.getStartArrowLength());
                    }
                    int endArrowType = line.getEndArrowType();
                    if (endArrowType > 0) {
                        hVar.q((byte) endArrowType, shape.getEndArrowWidth(), shape.getEndArrowLength());
                    }
                    processGrpRotation((SimpleShape) shape, hVar);
                    hVar.c = shape.getShapeId();
                    if (fVar == null) {
                        dVar.c(hVar);
                    } else {
                        fVar.q(hVar);
                    }
                }
            } else if (shape instanceof Freeform) {
                if (bVar != null || bVar2 != null) {
                    lh.c cVar = new lh.c();
                    cVar.f20615m = UnknownRecord.BITMAP_00E9;
                    cVar.f20604e = rectangle;
                    int startArrowType2 = shape.getStartArrowType();
                    if (startArrowType2 > 0 && (startArrowPathAndTail = ((Freeform) shape).getStartArrowPathAndTail(rectangle)) != null && startArrowPathAndTail.f30368a != null) {
                        PointF pointF3 = startArrowPathAndTail.f30369b;
                        tg.b bVar6 = new tg.b();
                        bVar6.c(startArrowPathAndTail.f30368a);
                        bVar6.f30013e = true;
                        if (startArrowType2 != 5) {
                            if (bVar2 != null && (bVar5 = bVar2.f17807b) != null) {
                                bVar6.f30011b = bVar5;
                            } else {
                                Color lineColor = ((SimpleShape) shape).getLineColor();
                                if (lineColor != null) {
                                    eh.b bVar7 = new eh.b();
                                    bVar7.c = (byte) 0;
                                    bVar7.f16571d = converterColor(lineColor);
                                    bVar6.f30011b = bVar7;
                                }
                            }
                        } else {
                            bVar6.b(bVar2);
                        }
                        cVar.u(bVar6);
                        pointF = pointF3;
                    } else {
                        pointF = null;
                    }
                    int endArrowType2 = shape.getEndArrowType();
                    if (endArrowType2 > 0 && (endArrowPathAndTail = ((Freeform) shape).getEndArrowPathAndTail(rectangle)) != null && endArrowPathAndTail.f30368a != null) {
                        PointF pointF4 = endArrowPathAndTail.f30369b;
                        tg.b bVar8 = new tg.b();
                        bVar8.c(endArrowPathAndTail.f30368a);
                        bVar8.f30013e = true;
                        if (endArrowType2 != 5) {
                            if (bVar2 != null && (bVar4 = bVar2.f17807b) != null) {
                                bVar8.f30011b = bVar4;
                            } else {
                                Color lineColor2 = ((SimpleShape) shape).getLineColor();
                                if (lineColor2 != null) {
                                    eh.b bVar9 = new eh.b();
                                    bVar9.c = (byte) 0;
                                    bVar9.f16571d = converterColor(lineColor2);
                                    bVar8.f30011b = bVar9;
                                }
                            }
                        } else {
                            bVar8.b(bVar2);
                        }
                        cVar.u(bVar8);
                        pointF2 = pointF4;
                    } else {
                        pointF2 = null;
                    }
                    Path[] freeformPath = ((Freeform) shape).getFreeformPath(rectangle, pointF, (byte) startArrowType2, pointF2, (byte) endArrowType2);
                    for (int i13 = 0; freeformPath != null && i13 < freeformPath.length; i13++) {
                        tg.b bVar10 = new tg.b();
                        bVar10.c(freeformPath[i13]);
                        if (bVar2 != null) {
                            bVar10.b(bVar2);
                        }
                        if (bVar != null) {
                            bVar10.f30011b = bVar;
                        }
                        cVar.u(bVar10);
                    }
                    processGrpRotation((SimpleShape) shape, cVar);
                    cVar.c = shape.getShapeId();
                    if (fVar == null) {
                        dVar.c(cVar);
                    } else {
                        fVar.q(cVar);
                    }
                }
            } else if (!(shape instanceof AutoShape) && !(shape instanceof TextBox)) {
                if (shape instanceof Picture) {
                    Picture picture = (Picture) shape;
                    PictureData pictureData = picture.getPictureData();
                    if (pictureData != null) {
                        lh.i iVar = new lh.i();
                        iVar.f20623m = this.control.o().g().c(pictureData);
                        iVar.f20604e = rectangle;
                        processGrpRotation((SimpleShape) shape, iVar);
                        iVar.c = shape.getShapeId();
                        iVar.f20625o = b.b.z(picture.getEscherOptRecord());
                        iVar.f20603d = bVar;
                        iVar.f20610k = bVar2;
                        if (fVar == null) {
                            dVar.c(iVar);
                        } else {
                            fVar.q(iVar);
                        }
                    } else if (bVar != null || bVar2 != null) {
                        lh.e eVar2 = new lh.e(1);
                        eVar2.f20617o = false;
                        eVar2.f20604e = rectangle;
                        eVar2.f20603d = bVar;
                        eVar2.f20610k = bVar2;
                        if (fVar == null) {
                            dVar.c(eVar2);
                        } else {
                            fVar.q(eVar2);
                        }
                    }
                }
            } else {
                TextShape textShape = (TextShape) shape;
                int placeholderId = textShape.getPlaceholderId();
                if (bVar == null && bVar2 == null) {
                    bVar3 = null;
                } else {
                    int shapeType = shape.getShapeType();
                    if (shapeType != 20 && shapeType != 32 && shapeType != 33 && shapeType != 34 && shapeType != 35 && shapeType != 36 && shapeType != 37 && shapeType != 38 && shapeType != 39 && shapeType != 40) {
                        lh.e eVar3 = new lh.e(shape.getShapeType());
                        eVar3.f20617o = false;
                        eVar3.f20604e = rectangle;
                        eVar3.f20603d = bVar;
                        if (bVar2 != null) {
                            eVar3.f20610k = bVar2;
                        }
                        eVar = eVar3;
                        if (shape.getShapeType() != 202) {
                            eVar3.f20616n = shape.getAdjustmentValue();
                            eVar = eVar3;
                        }
                    } else {
                        lh.h hVar2 = new lh.h();
                        hVar2.f20615m = shape.getShapeType();
                        hVar2.f20604e = rectangle;
                        hVar2.f20610k = bVar2;
                        Float[] adjustmentValue2 = shape.getAdjustmentValue();
                        if (hVar2.f20615m == 33 && adjustmentValue2 == null) {
                            hVar2.f20616n = new Float[]{Float.valueOf(1.0f)};
                        } else {
                            hVar2.f20616n = adjustmentValue2;
                        }
                        int startArrowType3 = shape.getStartArrowType();
                        if (startArrowType3 > 0) {
                            hVar2.r((byte) startArrowType3, shape.getStartArrowWidth(), shape.getStartArrowLength());
                        }
                        int endArrowType3 = shape.getEndArrowType();
                        eVar = hVar2;
                        if (endArrowType3 > 0) {
                            hVar2.q((byte) endArrowType3, shape.getEndArrowWidth(), shape.getEndArrowLength());
                            eVar = hVar2;
                        }
                    }
                    processGrpRotation((SimpleShape) shape, eVar);
                    eVar.c = shape.getShapeId();
                    eVar.f20611l = placeholderId;
                    if (fVar == null) {
                        dVar.c(eVar);
                    } else {
                        fVar.q(eVar);
                    }
                    bVar3 = eVar;
                }
                n nVar = new n();
                byte metaCharactersType = textShape.getMetaCharactersType();
                nVar.f20645p = metaCharactersType;
                processTextShape(nVar, textShape, rectangle, i10, placeholderId);
                if (nVar.f20643n != null) {
                    if (nVar.f20646q && bVar3 != null) {
                        bVar3.f20603d = null;
                    }
                    processGrpRotation((SimpleShape) shape, nVar);
                    nVar.c = shape.getShapeId();
                    nVar.f20611l = placeholderId;
                    if (i10 == 2) {
                        if (placeholderId == 9) {
                            this.hasProcessedMasterFooter = true;
                        } else if (placeholderId == 7 && (metaCharactersType == 2 || metaCharactersType == 3 || metaCharactersType == 5)) {
                            this.hasProcessedMasterDateTime = true;
                        } else if (placeholderId == 8 && metaCharactersType == 1) {
                            this.hasProcessedMasterSlideNumber = true;
                        }
                    }
                    if (fVar != null && (i10 != 0 || !MasterSheet.isPlaceholder(shape))) {
                        fVar.q(nVar);
                    } else {
                        dVar.c(nVar);
                    }
                }
            }
        }
    }

    private e processSingleAnimation(d dVar, TimeNodeContainer timeNodeContainer) {
        int i10;
        byte b10;
        Record[] childRecords;
        try {
            Record[] childRecords2 = ((TimeNodeAttributeContainer) timeNodeContainer.findFirstOfType(TimeNodeAttributeContainer.RECORD_ID)).getChildRecords();
            int length = childRecords2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    Record record = childRecords2[i11];
                    if ((record instanceof TimeVariant) && ((TimeVariant) record).getAttributeType() == 11) {
                        int intValue = ((Integer) ((TimeVariant) record).getValue()).intValue();
                        b10 = 1;
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    return null;
                                }
                            } else {
                                b10 = 2;
                            }
                        } else {
                            b10 = 0;
                        }
                    } else {
                        i11++;
                    }
                } else {
                    b10 = -1;
                    break;
                }
            }
        } catch (Exception unused) {
        }
        for (Record record2 : ((TimeNodeContainer) timeNodeContainer.findFirstOfType(TimeNodeContainer.RECORD_ID)).getChildRecords()) {
            if (record2.getRecordType() != TimeAnimateBehaviorContainer.RECORD_ID && record2.getRecordType() != TimeColorBehaviorContainer.RECORD_ID && record2.getRecordType() != TimeEffectBehaviorContainer.RECORD_ID && record2.getRecordType() != TimeMotionBehaviorContainer.RECORD_ID && record2.getRecordType() != TimeRotationBehaviorContainer.RECORD_ID && record2.getRecordType() != TimeScaleBehaviorContainer.RECORD_ID && record2.getRecordType() != TimeSetBehaviorContainer.RECORD_ID && record2.getRecordType() != TimeCommandBehaviorContainer.RECORD_ID) {
            }
            VisualShapeAtom visualShapeAtom = (VisualShapeAtom) ((ClientVisualElementContainer) ((TimeBehaviorContainer) ((PositionDependentRecordContainer) record2).findFirstOfType(TimeBehaviorContainer.RECORD_ID)).findFirstOfType(ClientVisualElementContainer.RECORD_ID)).findFirstOfType(VisualShapeAtom.RECORD_ID);
            int targetElementType = visualShapeAtom.getTargetElementType();
            if (targetElementType != 0) {
                if (targetElementType != 2) {
                    if (targetElementType != 6) {
                        return null;
                    }
                    return new e(visualShapeAtom.getTargetElementID(), b10, -1, -1);
                }
                int paraIndex = getParaIndex(dVar, visualShapeAtom);
                return new e(visualShapeAtom.getTargetElementID(), b10, paraIndex, paraIndex);
            }
            return new e(visualShapeAtom.getTargetElementID(), b10, -2, -2);
        }
        return null;
    }

    private void processSlide(Slide slide) {
        d e10;
        n nVar;
        n nVar2;
        n nVar3;
        n nVar4;
        n nVar5;
        d dVar = new d();
        dVar.c = 2;
        int i10 = this.number;
        this.number = i10 + 1;
        dVar.f30036b = i10;
        if (slide.getBackground() != null) {
            dVar.f30041h = converFill(dVar, slide.getBackground().getFill());
        }
        processMaster(dVar, slide);
        SlideAtom slideAtom = slide.getSlideRecord().getSlideAtom();
        if (slideAtom != null && slideAtom.getSSlideLayoutAtom() != null) {
            slideAtom.getSSlideLayoutAtom().getGeometryType();
        }
        resetFlag();
        boolean z10 = false;
        for (Shape shape : slide.getShapes()) {
            processShape(dVar, null, shape, 2);
        }
        if ((!this.model.f30034h || !isTitleSlide(slide)) && (e10 = this.model.e(dVar.f30042i[0])) != null) {
            HeadersFooters slideHeadersFooters = slide.getSlideHeadersFooters();
            if (slideHeadersFooters != null) {
                if (slideHeadersFooters.isSlideNumberVisible() && !this.hasProcessedMasterSlideNumber && (nVar5 = (n) e10.j(8)) != null) {
                    dVar.c(processCurrentSlideHeadersFooters(nVar5, String.valueOf(dVar.f30036b + this.model.f30033g)));
                }
                if (!this.hasProcessedMasterFooter && slideHeadersFooters.isFooterVisible() && slideHeadersFooters.getFooterText() != null && (nVar4 = (n) e10.j(9)) != null) {
                    dVar.c(processCurrentSlideHeadersFooters(nVar4, slideHeadersFooters.getFooterText()));
                }
                if (!this.hasProcessedMasterDateTime && slideHeadersFooters.isUserDateVisible() && slideHeadersFooters.getDateTimeText() != null) {
                    n nVar6 = (n) e10.j(7);
                    if (nVar6 != null) {
                        dVar.c(processCurrentSlideHeadersFooters(nVar6, slideHeadersFooters.getDateTimeText()));
                    }
                } else if (!this.hasProcessedMasterDateTime && slideHeadersFooters.isDateTimeVisible()) {
                    NumericFormatter numericFormatter = NumericFormatter.f20969b;
                    Date date = new Date(System.currentTimeMillis());
                    numericFormatter.getClass();
                    String d10 = NumericFormatter.d("yyyy/m/d", date);
                    n nVar7 = (n) e10.j(7);
                    if (nVar7 != null && nVar7.f20643n != null) {
                        dVar.c(processCurrentSlideHeadersFooters(nVar7, d10));
                    }
                }
            } else {
                if (!this.hasProcessedMasterSlideNumber && this.poiHeadersFooters.isSlideNumberVisible() && (nVar3 = (n) e10.j(8)) != null) {
                    dVar.c(processCurrentSlideHeadersFooters(nVar3, String.valueOf(dVar.f30036b + this.model.f30033g)));
                }
                if (!this.hasProcessedMasterFooter && this.poiHeadersFooters.isFooterVisible() && this.poiHeadersFooters.getFooterText() != null && (nVar2 = (n) e10.j(9)) != null) {
                    dVar.c(nVar2);
                }
                if (!this.hasProcessedMasterDateTime && (((this.poiHeadersFooters.getDateTimeText() != null && this.poiHeadersFooters.isUserDateVisible()) || this.poiHeadersFooters.isDateTimeVisible()) && (nVar = (n) e10.j(7)) != null)) {
                    dVar.c(nVar);
                }
            }
        }
        processNotes(dVar, slide.getNotesSheet());
        processGroupShape(dVar);
        SlideShowSlideInfoAtom slideShowSlideInfoAtom = slide.getSlideShowSlideInfoAtom();
        if (slideShowSlideInfoAtom != null && slideShowSlideInfoAtom.isValidateTransition()) {
            z10 = true;
        }
        dVar.f30043j = z10;
        processSlideshow(dVar, slide.getSlideProgTagsContainer());
        c cVar = this.model;
        synchronized (cVar) {
            ArrayList arrayList = cVar.f30029b;
            if (arrayList != null) {
                arrayList.add(dVar);
            }
        }
        if (this.abortReader || this.model.f30031e == 0 || this.currentReaderIndex >= this.poiSlideShow.getSlideCount()) {
            this.slideMasterIndexs.clear();
            this.slideMasterIndexs = null;
            this.titleMasterIndexs.clear();
            this.titleMasterIndexs = null;
        }
    }

    private void processSlideshow(d dVar, SlideProgTagsContainer slideProgTagsContainer) {
        Record findFirstOfType;
        Record findFirstOfType2;
        Record findFirstOfType3;
        Record[] childRecords;
        List<e> processAnimation;
        if (slideProgTagsContainer == null) {
            return;
        }
        try {
            Record[] childRecords2 = slideProgTagsContainer.getChildRecords();
            if (childRecords2 != null && childRecords2.length >= 1) {
                Record record = childRecords2[0];
                if ((record instanceof SlideProgBinaryTagContainer) && (findFirstOfType = ((SlideProgBinaryTagContainer) record).findFirstOfType(BinaryTagDataBlob.RECORD_ID)) != null && (findFirstOfType2 = ((BinaryTagDataBlob) findFirstOfType).findFirstOfType(TimeNodeContainer.RECORD_ID)) != null && (findFirstOfType3 = ((TimeNodeContainer) findFirstOfType2).findFirstOfType(TimeNodeContainer.RECORD_ID)) != null && (childRecords = ((TimeNodeContainer) findFirstOfType3).getChildRecords()) != null) {
                    for (Record record2 : childRecords) {
                        if ((record2 instanceof TimeNodeContainer) && (processAnimation = processAnimation(dVar, (TimeNodeContainer) record2)) != null) {
                            for (e eVar : processAnimation) {
                                dVar.b(eVar);
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            this.control.o().c().a(false, e10);
        }
    }

    private void processTable(d dVar, Table table, lh.f fVar, int i10) {
        SimpleShape[] tableBorders;
        int i11;
        int i12;
        int i13;
        Rectangle2D logicalAnchor2D;
        Table table2 = table;
        Rectangle2D clientAnchor2D = table2.getClientAnchor2D(table2);
        Rectangle2D coordinates = table.getCoordinates();
        this.tableShape = true;
        int numberOfRows = table.getNumberOfRows();
        int numberOfColumns = table.getNumberOfColumns();
        m mVar = new m(numberOfRows, numberOfColumns);
        int i14 = 0;
        while (i14 < numberOfRows) {
            int i15 = 0;
            while (i15 < numberOfColumns) {
                if (this.abortReader) {
                    return;
                }
                TableCell cell = table2.getCell(i14, i15);
                if (cell != null && (logicalAnchor2D = cell.getLogicalAnchor2D()) != null) {
                    double width = coordinates.getWidth() / clientAnchor2D.getWidth();
                    double height = coordinates.getHeight() / clientAnchor2D.getHeight();
                    double x4 = ((logicalAnchor2D.getX() - coordinates.getX()) / width) + clientAnchor2D.getX();
                    double y10 = ((logicalAnchor2D.getY() - coordinates.getY()) / height) + clientAnchor2D.getY();
                    double height2 = logicalAnchor2D.getHeight() / height;
                    lib.zj.office.java.awt.a aVar = new lib.zj.office.java.awt.a();
                    i13 = numberOfRows;
                    aVar.f20690a = (float) (x4 * 1.3333333730697632d);
                    aVar.f20691b = (float) (y10 * 1.3333333730697632d);
                    aVar.c = (float) ((logicalAnchor2D.getWidth() / width) * 1.3333333730697632d);
                    aVar.f20692d = (float) (height2 * 1.3333333730697632d);
                    lh.l lVar = new lh.l();
                    lVar.f20631f = aVar;
                    lVar.f20627a = getShapeLine(cell.getBorderLeft(), true);
                    lVar.f20628b = getShapeLine(cell.getBorderRight(), true);
                    lVar.c = getShapeLine(cell.getBorderTop(), true);
                    lVar.f20629d = getShapeLine(cell.getBorderBottom(), true);
                    lVar.f20632g = converFill(dVar, cell.getFill());
                    String text = cell.getText();
                    if (text != null && text.trim().length() > 0) {
                        n nVar = new n();
                        i11 = i15;
                        i12 = i14;
                        processTextShape(nVar, cell, new Rectangle((int) aVar.f20690a, (int) aVar.f20691b, (int) aVar.c, (int) aVar.f20692d), i10, -1);
                        if (nVar.f20643n != null) {
                            processGrpRotation(cell, nVar);
                            lVar.f20630e = nVar;
                        }
                    } else {
                        i11 = i15;
                        i12 = i14;
                    }
                    mVar.f20633m[(i12 * numberOfColumns) + i11] = lVar;
                } else {
                    i11 = i15;
                    i12 = i14;
                    i13 = numberOfRows;
                }
                i15 = i11 + 1;
                table2 = table;
                numberOfRows = i13;
                i14 = i12;
            }
            i14++;
            table2 = table;
        }
        for (SimpleShape simpleShape : table.getTableBorders()) {
            gh.b shapeLine = getShapeLine(simpleShape, true);
            if (shapeLine != null) {
                Rectangle2D logicalAnchor2D2 = simpleShape.getLogicalAnchor2D();
                if (logicalAnchor2D2 == null) {
                    return;
                }
                Rectangle rectangle = new Rectangle();
                rectangle.f20688x = (int) (logicalAnchor2D2.getX() * 1.3333333730697632d);
                rectangle.f20689y = (int) (logicalAnchor2D2.getY() * 1.3333333730697632d);
                rectangle.width = (int) (logicalAnchor2D2.getWidth() * 1.3333333730697632d);
                rectangle.height = (int) (logicalAnchor2D2.getHeight() * 1.3333333730697632d);
                lh.h hVar = new lh.h();
                hVar.f20615m = simpleShape.getShapeType();
                hVar.f20604e = rectangle;
                hVar.f20610k = shapeLine;
                Float[] adjustmentValue = simpleShape.getAdjustmentValue();
                if (hVar.f20615m == 33 && adjustmentValue == null) {
                    hVar.f20616n = new Float[]{Float.valueOf(1.0f)};
                } else {
                    hVar.f20616n = null;
                }
                processGrpRotation(simpleShape, hVar);
                hVar.c = simpleShape.getShapeId();
                dVar.c(hVar);
            }
        }
        Rectangle rectangle2 = new Rectangle();
        rectangle2.f20688x = (int) (clientAnchor2D.getX() * 1.3333333730697632d);
        rectangle2.f20689y = (int) (clientAnchor2D.getY() * 1.3333333730697632d);
        rectangle2.width = (int) (clientAnchor2D.getWidth() * 1.3333333730697632d);
        rectangle2.height = (int) (clientAnchor2D.getHeight() * 1.3333333730697632d);
        mVar.f20604e = rectangle2;
        mVar.c = table.getShapeId();
        if (fVar == null) {
            dVar.c(mVar);
        } else {
            fVar.q(mVar);
        }
        this.tableShape = false;
    }

    private void processTextShape(n nVar, TextShape textShape, Rectangle rectangle, int i10, int i11) {
        Rectangle rectangle2;
        boolean z10;
        if (rectangle == null) {
            Rectangle2D logicalAnchor2D = textShape.getLogicalAnchor2D();
            if (logicalAnchor2D == null) {
                return;
            }
            Rectangle rectangle3 = new Rectangle();
            rectangle3.f20688x = (int) (logicalAnchor2D.getX() * 1.3333333730697632d);
            rectangle3.f20689y = (int) (logicalAnchor2D.getY() * 1.3333333730697632d);
            rectangle3.width = (int) (logicalAnchor2D.getWidth() * 1.3333333730697632d);
            rectangle3.height = (int) (logicalAnchor2D.getHeight() * 1.3333333730697632d);
            rectangle2 = rectangle3;
        } else {
            rectangle2 = rectangle;
        }
        nVar.f20604e = rectangle2;
        if (textShape.getWordWrap() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        nVar.f20642m = z10;
        if (textShape.getText() != null) {
            processNormalTextShape(nVar, textShape, rectangle2, i10, i11);
            return;
        }
        String unicodeGeoText = textShape.getUnicodeGeoText();
        if (unicodeGeoText != null && unicodeGeoText.length() > 0) {
            nVar.f20646q = true;
            processWordArtTextShape(nVar, textShape, unicodeGeoText, rectangle2, i10, i11);
        }
    }

    private void processWordArtParagraph(l lVar, String str, int i10, int i11, int i12) {
        j jVar = new j();
        jVar.f32371a = this.offset;
        zh.f fVar = jVar.c;
        zh.b.f32374b.getClass();
        zh.b.N(fVar, 1);
        i iVar = new i(str);
        zh.f fVar2 = iVar.c;
        Paint a10 = sg.d.f29801b.a();
        int i13 = 12;
        a10.setTextSize(12);
        for (Paint.FontMetrics fontMetrics = a10.getFontMetrics(); ((int) a10.measureText(str)) < i10 && ((int) Math.ceil(fontMetrics.descent - fontMetrics.ascent)) < i11; fontMetrics = a10.getFontMetrics()) {
            i13++;
            a10.setTextSize(i13);
        }
        zh.b.f32374b.getClass();
        zh.b.z(iVar.c, (int) ((i13 - 1) * 0.75f));
        zh.b.w(fVar2, i12);
        setMaxFontSize(18);
        int i14 = this.offset;
        iVar.f32371a = i14;
        int length = str.length() + i14;
        this.offset = length;
        iVar.f32372b = length;
        jVar.e(iVar);
        jVar.f32372b = this.offset;
        lVar.e(jVar);
    }

    private void processWordArtTextShape(n nVar, TextShape textShape, String str, Rectangle rectangle, int i10, int i11) {
        String dateTimeText;
        int rgb;
        if (i11 == 9 && str.contains("*")) {
            if (i10 == 0) {
                if (this.poiHeadersFooters.getFooterText() != null) {
                    dateTimeText = this.poiHeadersFooters.getFooterText();
                }
                dateTimeText = str;
            } else {
                if (i10 == 2) {
                    if (this.poiHeadersFooters.getFooterText() != null) {
                        dateTimeText = this.poiHeadersFooters.getFooterText();
                    }
                    dateTimeText = null;
                }
                dateTimeText = str;
            }
        } else {
            if (i11 == 7 && str.contains("*")) {
                if (i10 == 0) {
                    if (this.poiHeadersFooters.getDateTimeText() != null) {
                        dateTimeText = this.poiHeadersFooters.getDateTimeText();
                    }
                } else if (i10 == 2) {
                    if (this.poiHeadersFooters.getDateTimeText() != null) {
                        dateTimeText = this.poiHeadersFooters.getDateTimeText();
                    }
                    dateTimeText = null;
                }
            }
            dateTimeText = str;
        }
        l lVar = new l();
        nVar.f20643n = lVar;
        zh.f fVar = lVar.c;
        zh.b.f32374b.getClass();
        zh.b.K(fVar, (int) (rectangle.width * 15.0f));
        zh.b.E(fVar, (int) (rectangle.height * 15.0f));
        zh.b.G(fVar, (int) (textShape.getMarginLeft() * 20.0f));
        zh.b.H(fVar, (int) (textShape.getMarginRight() * 20.0f));
        zh.b.I(fVar, (int) (textShape.getMarginTop() * 20.0f));
        zh.b.F(fVar, (int) (textShape.getMarginBottom() * 20.0f));
        ((zh.c) fVar).e(1, (short) 8201);
        zh.b.J(fVar, (byte) 1);
        int marginRight = (int) (rectangle.width - ((textShape.getMarginRight() + textShape.getMarginLeft()) * 1.3333334f));
        int marginBottom = (int) (rectangle.height - ((textShape.getMarginBottom() + textShape.getMarginTop()) * 1.3333334f));
        this.offset = 0;
        lVar.f32371a = 0;
        Fill fill = textShape.getFill();
        int fillType = fill.getFillType();
        if (fillType == 0) {
            if (fill.getForegroundColor() != null) {
                rgb = converterColor(fill.getForegroundColor());
            }
            rgb = -16777216;
        } else {
            if (fillType == 7 || fillType == 4 || fillType == 5 || fillType == 6) {
                Color foregroundColor = fill.getForegroundColor();
                if (fill.isShaderPreset()) {
                    int[] shaderColors = fill.getShaderColors();
                    if (shaderColors != null) {
                        rgb = shaderColors[0];
                    } else if (foregroundColor != null) {
                        rgb = foregroundColor.getRGB();
                    }
                }
            }
            rgb = -16777216;
        }
        processWordArtParagraph(lVar, dateTimeText, marginRight, marginBottom, rgb);
        lVar.f32372b = this.offset;
        BulletNumberManage.instance().clearData();
    }

    private void resetFlag() {
        this.hasProcessedMasterDateTime = false;
        this.hasProcessedMasterFooter = false;
        this.hasProcessedMasterSlideNumber = false;
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void backReader() {
        SlideShow slideShow = this.poiSlideShow;
        int i10 = this.currentReaderIndex;
        this.currentReaderIndex = i10 + 1;
        processSlide(slideShow.getSlide(i10));
        if (!this.isGetThumbnail) {
            this.control.r(536870927, null);
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public void dispose() {
        c cVar;
        if (isReaderFinish()) {
            super.dispose();
            if (this.abortReader && (cVar = this.model) != null && cVar.f30031e < 2 && this.poiSlideShow.getSlideCount() > 0) {
                this.model.b();
            }
            this.model = null;
            this.filePath = null;
            SlideShow slideShow = this.poiSlideShow;
            if (slideShow != null) {
                try {
                    slideShow.dispose();
                } catch (Exception unused) {
                }
                this.poiSlideShow = null;
            }
            Map<Integer, Integer> map = this.slideMasterIndexs;
            if (map != null) {
                map.clear();
                this.slideMasterIndexs = null;
            }
            Map<Integer, Integer> map2 = this.titleMasterIndexs;
            if (map2 != null) {
                map2.clear();
                this.titleMasterIndexs = null;
            }
            BulletNumberManage.instance().dispose();
            System.gc();
        }
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public Object getModel() {
        c cVar = this.model;
        if (cVar != null) {
            return cVar;
        }
        this.poiSlideShow = new SlideShow(new HSLFSlideShow(this.control, this.filePath), this.isGetThumbnail);
        this.model = new c();
        Dimension pageSize = this.poiSlideShow.getPageSize();
        pageSize.width = (int) (pageSize.width * 1.3333334f);
        pageSize.height = (int) (pageSize.height * 1.3333334f);
        this.model.c = pageSize;
        DocumentAtom documentAtom = this.poiSlideShow.getDocumentRecord().getDocumentAtom();
        if (documentAtom != null) {
            this.model.f30033g = documentAtom.getFirstSlideNum() - 1;
            this.model.f30034h = documentAtom.getOmitTitlePlace();
        }
        int slideCount = this.poiSlideShow.getSlideCount();
        this.model.f30031e = slideCount;
        if (slideCount != 0) {
            this.poiHeadersFooters = this.poiSlideShow.getSlideHeadersFooters();
            int min = Math.min(slideCount, 2);
            for (int i10 = 0; i10 < min && !this.abortReader; i10++) {
                SlideShow slideShow = this.poiSlideShow;
                int i11 = this.currentReaderIndex;
                this.currentReaderIndex = i11 + 1;
                processSlide(slideShow.getSlide(i11));
            }
            if (!isReaderFinish()) {
                if (!this.isGetThumbnail) {
                    new lib.zj.office.system.c(this, this.control).start();
                }
            } else {
                this.control.r(805306376, Boolean.TRUE);
            }
            return this.model;
        }
        throw new Exception("Format error");
    }

    @Override // lib.zj.office.system.b, lib.zj.office.system.j
    public boolean isReaderFinish() {
        SlideShow slideShow;
        c cVar = this.model;
        if (cVar == null || (slideShow = this.poiSlideShow) == null || this.abortReader || cVar.f30031e == 0 || this.currentReaderIndex >= slideShow.getSlideCount()) {
            return true;
        }
        return false;
    }

    public boolean isRectangle(TextShape textShape) {
        int shapeType = textShape.getShapeType();
        if (shapeType == 1 || shapeType == 2 || shapeType == 202) {
            return true;
        }
        return false;
    }

    public void processGrpRotation(Shape shape, g gVar) {
        float rotation = shape.getRotation();
        if (shape.getFlipHorizontal()) {
            gVar.h();
            rotation = -rotation;
        }
        if (shape.getFlipVertical()) {
            gVar.k();
            rotation = -rotation;
        }
        if ((gVar instanceof lh.h) && ((rotation == 45.0f || rotation == 135.0f || rotation == 225.0f) && !gVar.c() && !gVar.d())) {
            rotation -= 90.0f;
        }
        gVar.j(rotation);
    }

    public void processMaster(d dVar, Slide slide) {
        if (this.slideMasterIndexs == null) {
            this.slideMasterIndexs = new HashMap();
        }
        if (this.titleMasterIndexs == null) {
            this.titleMasterIndexs = new HashMap();
        }
        SlideAtom slideAtom = slide.getSlideRecord().getSlideAtom();
        if (!slideAtom.getFollowMasterObjects()) {
            return;
        }
        int masterID = slideAtom.getMasterID();
        SlideMaster[] slidesMasters = this.poiSlideShow.getSlidesMasters();
        int i10 = 0;
        while (true) {
            if (i10 >= slidesMasters.length) {
                break;
            } else if (masterID == slidesMasters[i10]._getSheetNumber()) {
                Integer num = this.slideMasterIndexs.get(Integer.valueOf(masterID));
                if (num != null) {
                    dVar.f30042i[0] = num.intValue();
                    return;
                }
                d dVar2 = new d();
                dVar2.c = 0;
                dVar2.f30041h = dVar.f30041h;
                Shape[] shapes = slidesMasters[i10].getShapes();
                for (Shape shape : shapes) {
                    processShape(dVar2, null, shape, 0);
                }
                if (dVar2.f() > 0) {
                    Integer valueOf = Integer.valueOf(this.model.a(dVar2));
                    dVar.f30042i[0] = valueOf.intValue();
                    this.slideMasterIndexs.put(Integer.valueOf(masterID), valueOf);
                }
            } else {
                i10++;
            }
        }
        TitleMaster[] titleMasters = this.poiSlideShow.getTitleMasters();
        if (titleMasters != null) {
            for (int i11 = 0; i11 < titleMasters.length; i11++) {
                if (masterID == titleMasters[i11]._getSheetNumber()) {
                    Integer num2 = this.titleMasterIndexs.get(Integer.valueOf(masterID));
                    if (num2 != null) {
                        dVar.f30042i[1] = num2.intValue();
                        return;
                    }
                    d dVar3 = new d();
                    dVar3.c = 0;
                    dVar3.f30041h = dVar.f30041h;
                    Shape[] shapes2 = titleMasters[i11].getShapes();
                    for (Shape shape2 : shapes2) {
                        processShape(dVar3, null, shape2, 0);
                    }
                    if (dVar3.f() > 0) {
                        Integer valueOf2 = Integer.valueOf(this.model.a(dVar3));
                        dVar.f30042i[1] = valueOf2.intValue();
                        this.titleMasterIndexs.put(Integer.valueOf(masterID), valueOf2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // lib.zj.office.system.b
    public boolean searchContent(File file, String str) {
        Slide[] slides;
        Shape[] shapes;
        OEPlaceholderAtom placeholderAtom;
        for (Slide slide : new SlideShow(new HSLFSlideShow(this.control, this.filePath)).getSlides()) {
            for (Shape shape : slide.getShapes()) {
                if (searchShape(shape, str)) {
                    return true;
                }
            }
            Notes notesSheet = slide.getNotesSheet();
            if (notesSheet != null) {
                for (Shape shape2 : notesSheet.getShapes()) {
                    if (((shape2 instanceof AutoShape) || (shape2 instanceof TextBox)) && (placeholderAtom = ((TextShape) shape2).getPlaceholderAtom()) != null && placeholderAtom.getPlaceholderId() == 12 && searchShape(shape2, str)) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public boolean searchShape(Shape shape, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (!(shape instanceof AutoShape) && !(shape instanceof TextBox)) {
            if (shape instanceof ShapeGroup) {
                for (Shape shape2 : ((ShapeGroup) shape).getShapes()) {
                    if (searchShape(shape2, str)) {
                        return true;
                    }
                }
            }
        } else {
            sb2.append(((TextShape) shape).getText());
            if (sb2.indexOf(str) >= 0) {
                return true;
            }
            sb2.delete(0, sb2.length());
        }
        return false;
    }

    public void setMaxFontSize(int i10) {
        if (i10 > this.maxFontSize) {
            this.maxFontSize = i10;
        }
    }

    public PPTReader(f fVar, String str, boolean z10) {
        this.number = 1;
        this.filePath = str;
        this.control = fVar;
        this.isGetThumbnail = z10;
    }

    private gh.b getShapeLine(SimpleShape simpleShape, boolean z10) {
        if (simpleShape == null || !simpleShape.hasLine()) {
            if (z10) {
                gh.b bVar = new gh.b();
                eh.b bVar2 = new eh.b();
                bVar2.f16571d = -16777216;
                bVar.f17807b = bVar2;
                return bVar;
            }
            return null;
        }
        int round = (int) Math.round(simpleShape.getLineWidth() * 1.3333333730697632d);
        boolean z11 = simpleShape.getLineDashing() > 0;
        Color lineColor = simpleShape.getLineColor();
        if (lineColor != null) {
            gh.b bVar3 = new gh.b();
            eh.b bVar4 = new eh.b();
            bVar4.f16571d = converterColor(lineColor);
            bVar3.f17807b = bVar4;
            bVar3.c = z11;
            bVar3.f17806a = round;
            return bVar3;
        }
        return null;
    }
}
