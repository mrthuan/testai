package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.ddf.EscherTextboxRecord;
import lib.zj.office.fc.hslf.record.EscherTextboxWrapper;
import lib.zj.office.fc.hslf.record.InteractiveInfo;
import lib.zj.office.fc.hslf.record.InteractiveInfoAtom;
import lib.zj.office.fc.hslf.record.OEPlaceholderAtom;
import lib.zj.office.fc.hslf.record.OutlineTextRefAtom;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordTypes;
import lib.zj.office.fc.hslf.record.RoundTripHFPlaceholder12;
import lib.zj.office.fc.hslf.record.StyleTextPropAtom;
import lib.zj.office.fc.hslf.record.TextCharsAtom;
import lib.zj.office.fc.hslf.record.TextHeaderAtom;
import lib.zj.office.fc.hslf.record.TextRulerAtom;
import lib.zj.office.fc.hslf.record.TxInteractiveInfoAtom;
import lib.zj.office.fc.hslf.usermodel.RichTextRun;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public abstract class TextShape extends SimpleShape {
    public static final int AlignCenter = 1;
    public static final int AlignJustify = 3;
    public static final int AlignLeft = 0;
    public static final int AlignRight = 2;
    public static final int AnchorBottom = 2;
    public static final int AnchorBottomBaseline = 7;
    public static final int AnchorBottomCentered = 5;
    public static final int AnchorBottomCenteredBaseline = 9;
    public static final int AnchorMiddle = 1;
    public static final int AnchorMiddleCentered = 4;
    public static final int AnchorTop = 0;
    public static final int AnchorTopBaseline = 6;
    public static final int AnchorTopCentered = 3;
    public static final int AnchorTopCenteredBaseline = 8;
    public static final int WrapByPoints = 1;
    public static final int WrapNone = 2;
    public static final int WrapSquare = 0;
    public static final int WrapThrough = 4;
    public static final int WrapTopBottom = 3;
    protected EscherTextboxWrapper _txtbox;
    protected TextRun _txtrun;

    public TextShape(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public void afterInsert(Sheet sheet) {
        super.afterInsert(sheet);
        EscherTextboxWrapper escherTextboxWrapper = getEscherTextboxWrapper();
        if (escherTextboxWrapper != null) {
            sheet.getPPDrawing().addTextboxWrapper(escherTextboxWrapper);
            if (getAnchor().equals(new Rectangle()) && !"".equals(getText())) {
                resizeToFitText();
            }
        }
        TextRun textRun = this._txtrun;
        if (textRun != null) {
            textRun.setShapeId(getShapeId());
            sheet.onAddTextShape(this);
        }
    }

    public TextRun createTextRun() {
        EscherTextboxWrapper escherTextboxWrapper = getEscherTextboxWrapper();
        this._txtbox = escherTextboxWrapper;
        if (escherTextboxWrapper == null) {
            this._txtbox = new EscherTextboxWrapper();
        }
        TextRun textRun = getTextRun();
        this._txtrun = textRun;
        if (textRun == null) {
            TextHeaderAtom textHeaderAtom = new TextHeaderAtom();
            textHeaderAtom.setParentRecord(this._txtbox);
            this._txtbox.appendChildRecord(textHeaderAtom);
            TextCharsAtom textCharsAtom = new TextCharsAtom();
            this._txtbox.appendChildRecord(textCharsAtom);
            StyleTextPropAtom styleTextPropAtom = new StyleTextPropAtom(0);
            this._txtbox.appendChildRecord(styleTextPropAtom);
            TextRun textRun2 = new TextRun(textHeaderAtom, textCharsAtom, styleTextPropAtom);
            this._txtrun = textRun2;
            textRun2._records = new Record[]{textHeaderAtom, textCharsAtom, styleTextPropAtom};
            textRun2.setText("");
            this._escherContainer.addChildRecord(this._txtbox.getEscherRecord());
            setDefaultTextProperties(this._txtrun);
        }
        return this._txtrun;
    }

    @Override // lib.zj.office.fc.hslf.model.SimpleShape, lib.zj.office.fc.hslf.model.Shape
    public void dispose() {
        super.dispose();
        TextRun textRun = this._txtrun;
        if (textRun != null) {
            textRun.dispose();
        }
        EscherTextboxWrapper escherTextboxWrapper = this._txtbox;
        if (escherTextboxWrapper != null) {
            escherTextboxWrapper.dispose();
        }
    }

    public EscherTextboxWrapper getEscherTextboxWrapper() {
        EscherTextboxRecord escherTextboxRecord;
        if (this._txtbox == null && (escherTextboxRecord = (EscherTextboxRecord) s.F(this._escherContainer, -4083)) != null) {
            this._txtbox = new EscherTextboxWrapper(escherTextboxRecord);
        }
        return this._txtbox;
    }

    public int getHorizontalAlignment() {
        TextRun textRun = getTextRun();
        if (textRun == null) {
            return -1;
        }
        return textRun.getRichTextRuns()[0].getAlignment();
    }

    public float getMarginBottom() {
        int propertyValue;
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_PROCESS);
        if (escherSimpleProperty == null) {
            propertyValue = 45720;
        } else {
            propertyValue = escherSimpleProperty.getPropertyValue();
        }
        return propertyValue / 12700.0f;
    }

    public float getMarginLeft() {
        int propertyValue;
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), 129);
        if (escherSimpleProperty == null) {
            propertyValue = 91440;
        } else {
            propertyValue = escherSimpleProperty.getPropertyValue();
        }
        return propertyValue / 12700.0f;
    }

    public float getMarginRight() {
        int propertyValue;
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), lib.zj.office.fc.ss.usermodel.ShapeTypes.PLUS);
        if (escherSimpleProperty == null) {
            propertyValue = 91440;
        } else {
            propertyValue = escherSimpleProperty.getPropertyValue();
        }
        return propertyValue / 12700.0f;
    }

    public float getMarginTop() {
        int propertyValue;
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), lib.zj.office.fc.ss.usermodel.ShapeTypes.DOUBLE_WAVE);
        if (escherSimpleProperty == null) {
            propertyValue = 45720;
        } else {
            propertyValue = escherSimpleProperty.getPropertyValue();
        }
        return propertyValue / 12700.0f;
    }

    public byte getMetaCharactersType() {
        Record[] childRecords;
        EscherTextboxWrapper escherTextboxWrapper = getEscherTextboxWrapper();
        if (escherTextboxWrapper != null) {
            for (Record record : escherTextboxWrapper.getChildRecords()) {
                if (record != null) {
                    long recordType = record.getRecordType();
                    if (recordType == RecordTypes.SlideNumberMCAtom.typeID) {
                        return (byte) 1;
                    }
                    if (recordType == RecordTypes.DateTimeMCAtom.typeID) {
                        return (byte) 2;
                    }
                    if (recordType == RecordTypes.GenericDateMCAtom.typeID) {
                        return (byte) 3;
                    }
                    if (recordType == RecordTypes.RTFDateTimeMCAtom.typeID) {
                        return (byte) 5;
                    }
                    if (recordType == RecordTypes.FooterMCAtom.typeID) {
                        return (byte) 4;
                    }
                }
            }
            return (byte) -1;
        }
        return (byte) -1;
    }

    public OEPlaceholderAtom getPlaceholderAtom() {
        return (OEPlaceholderAtom) getClientDataRecord(RecordTypes.OEPlaceholderAtom.typeID);
    }

    public int getPlaceholderId() {
        OEPlaceholderAtom placeholderAtom = getPlaceholderAtom();
        if (placeholderAtom != null) {
            return placeholderAtom.getPlaceholderId();
        }
        RoundTripHFPlaceholder12 roundTripHFPlaceholder12 = (RoundTripHFPlaceholder12) getClientDataRecord(RecordTypes.RoundTripHFPlaceholder12.typeID);
        if (roundTripHFPlaceholder12 != null) {
            return roundTripHFPlaceholder12.getPlaceholderId();
        }
        return 0;
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public Sheet getSheet() {
        return this._sheet;
    }

    public String getText() {
        TextRun textRun = getTextRun();
        if (textRun == null) {
            return null;
        }
        return textRun.getText();
    }

    public int getTextId() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), 128);
        if (escherSimpleProperty == null) {
            return 0;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    public TextRun getTextRun() {
        if (this._txtrun == null) {
            initTextRun();
        }
        return this._txtrun;
    }

    public String getUnicodeGeoText() {
        return s.f0(this._escherContainer);
    }

    public int getVerticalAlignment() {
        TextShape textShape;
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS);
        if (escherSimpleProperty == null) {
            int runType = getTextRun().getRunType();
            MasterSheet masterSheet = getSheet().getMasterSheet();
            if (masterSheet != null && getPlaceholderAtom() != null) {
                textShape = masterSheet.getPlaceholderByTextType(runType);
            } else {
                textShape = null;
            }
            if (textShape != null) {
                return textShape.getVerticalAlignment();
            }
            if (runType != 0 && runType != 6) {
                return 0;
            }
            return 1;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    public int getWordWrap() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), lib.zj.office.fc.ss.usermodel.ShapeTypes.FLOW_CHART_DECISION);
        if (escherSimpleProperty == null) {
            return 0;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    public void initTextRun() {
        OutlineTextRefAtom outlineTextRefAtom;
        Record[] records;
        EscherTextboxWrapper escherTextboxWrapper = getEscherTextboxWrapper();
        if (getSheet() != null && escherTextboxWrapper != null) {
            Record[] childRecords = escherTextboxWrapper.getChildRecords();
            int i10 = 0;
            while (true) {
                if (i10 < childRecords.length) {
                    Record record = childRecords[i10];
                    if (record instanceof OutlineTextRefAtom) {
                        outlineTextRefAtom = (OutlineTextRefAtom) record;
                        break;
                    }
                    i10++;
                } else {
                    outlineTextRefAtom = null;
                    break;
                }
            }
            TextRun[] textRuns = this._sheet.getTextRuns();
            if (outlineTextRefAtom != null) {
                int textIndex = outlineTextRefAtom.getTextIndex();
                int i11 = 0;
                while (true) {
                    if (i11 >= textRuns.length) {
                        break;
                    }
                    if (textRuns[i11].getIndex() == textIndex && textRuns[i11].getShapeId() < 0) {
                        this._txtrun = textRuns[i11];
                        break;
                    }
                    i11++;
                }
            } else {
                int shapeId = ((EscherSpRecord) this._escherContainer.getChildById(EscherSpRecord.RECORD_ID)).getShapeId();
                if (textRuns != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= textRuns.length) {
                            break;
                        } else if (textRuns[i12].getShapeId() == shapeId) {
                            this._txtrun = textRuns[i12];
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            if (this._txtrun != null) {
                for (int i13 = 0; i13 < childRecords.length; i13++) {
                    TextRun textRun = this._txtrun;
                    if (textRun._ruler == null) {
                        Record record2 = childRecords[i13];
                        if (record2 instanceof TextRulerAtom) {
                            textRun._ruler = (TextRulerAtom) record2;
                        }
                    }
                    for (Record record3 : textRun.getRecords()) {
                        if (childRecords[i13].getRecordType() == record3.getRecordType()) {
                            childRecords[i13] = record3;
                        }
                    }
                }
            }
        }
    }

    public Rectangle2D resizeToFitText() {
        return getAnchor2D();
    }

    public void setHorizontalAlignment(int i10) {
        TextRun textRun = getTextRun();
        if (textRun != null) {
            textRun.getRichTextRuns()[0].setAlignment(i10);
        }
    }

    public void setHyperlink(int i10, int i11, int i12) {
        InteractiveInfo interactiveInfo = new InteractiveInfo();
        InteractiveInfoAtom interactiveInfoAtom = interactiveInfo.getInteractiveInfoAtom();
        interactiveInfoAtom.setAction((byte) 4);
        interactiveInfoAtom.setHyperlinkType((byte) 8);
        interactiveInfoAtom.setHyperlinkID(i10);
        this._txtbox.appendChildRecord(interactiveInfo);
        TxInteractiveInfoAtom txInteractiveInfoAtom = new TxInteractiveInfoAtom();
        txInteractiveInfoAtom.setStartIndex(i11);
        txInteractiveInfoAtom.setEndIndex(i12);
        this._txtbox.appendChildRecord(txInteractiveInfoAtom);
    }

    public void setMarginBottom(float f10) {
        setEscherProperty((short) 132, (int) (f10 * 12700.0f));
    }

    public void setMarginLeft(float f10) {
        setEscherProperty((short) 129, (int) (f10 * 12700.0f));
    }

    public void setMarginRight(float f10) {
        setEscherProperty((short) 131, (int) (f10 * 12700.0f));
    }

    public void setMarginTop(float f10) {
        setEscherProperty((short) 130, (int) (f10 * 12700.0f));
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public void setSheet(Sheet sheet) {
        this._sheet = sheet;
        TextRun textRun = getTextRun();
        if (textRun != null) {
            textRun.setSheet(this._sheet);
            for (RichTextRun richTextRun : textRun.getRichTextRuns()) {
                richTextRun.supplySlideShow(this._sheet.getSlideShow());
            }
        }
    }

    public void setText(String str) {
        TextRun textRun = getTextRun();
        if (textRun == null) {
            textRun = createTextRun();
        }
        textRun.setText(str);
        setTextId(str.hashCode());
    }

    public void setTextId(int i10) {
        setEscherProperty((short) 128, i10);
    }

    public void setVerticalAlignment(int i10) {
        setEscherProperty(EscherProperties.TEXT__ANCHORTEXT, i10);
    }

    public void setWordWrap(int i10) {
        setEscherProperty((short) 133, i10);
    }

    public TextShape(Shape shape) {
        super(null, shape);
        this._escherContainer = createSpContainer(shape instanceof ShapeGroup);
    }

    public TextShape() {
        this(null);
    }

    public void setDefaultTextProperties(TextRun textRun) {
    }
}
