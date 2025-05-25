package lib.zj.office.fc.hslf.model;

import androidx.activity.s;
import java.io.ByteArrayOutputStream;
import lib.zj.office.fc.ddf.DefaultEscherRecordFactory;
import lib.zj.office.fc.ddf.EscherChildAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientAnchorRecord;
import lib.zj.office.fc.ddf.EscherClientDataRecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hslf.exceptions.HSLFException;
import lib.zj.office.fc.hslf.record.InteractiveInfo;
import lib.zj.office.fc.hslf.record.InteractiveInfoAtom;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.geom.AffineTransform;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* loaded from: classes3.dex */
public abstract class SimpleShape extends Shape {
    protected EscherClientDataRecord _clientData;
    protected Record[] _clientRecords;

    public SimpleShape(EscherContainerRecord escherContainerRecord, Shape shape) {
        super(escherContainerRecord, shape);
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public EscherContainerRecord createSpContainer(boolean z10) {
        int i10;
        EscherRecord escherClientAnchorRecord;
        EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
        this._escherContainer = escherContainerRecord;
        escherContainerRecord.setRecordId(EscherContainerRecord.SP_CONTAINER);
        this._escherContainer.setOptions((short) 15);
        EscherSpRecord escherSpRecord = new EscherSpRecord();
        if (z10) {
            i10 = 2562;
        } else {
            i10 = 2560;
        }
        escherSpRecord.setFlags(i10);
        this._escherContainer.addChildRecord(escherSpRecord);
        EscherOptRecord escherOptRecord = new EscherOptRecord();
        escherOptRecord.setRecordId(EscherOptRecord.RECORD_ID);
        this._escherContainer.addChildRecord(escherOptRecord);
        if (z10) {
            escherClientAnchorRecord = new EscherChildAnchorRecord();
        } else {
            escherClientAnchorRecord = new EscherClientAnchorRecord();
            byte[] bArr = new byte[16];
            LittleEndian.putUShort(bArr, 0, 0);
            LittleEndian.putUShort(bArr, 2, 0);
            LittleEndian.putInt(bArr, 4, 8);
            escherClientAnchorRecord.fillFields(bArr, 0, null);
        }
        this._escherContainer.addChildRecord(escherClientAnchorRecord);
        return this._escherContainer;
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public void dispose() {
        super.dispose();
        Record[] recordArr = this._clientRecords;
        if (recordArr != null) {
            for (Record record : recordArr) {
                record.dispose();
            }
        }
        EscherClientDataRecord escherClientDataRecord = this._clientData;
        if (escherClientDataRecord != null) {
            escherClientDataRecord.dispose();
        }
    }

    public Record getClientDataRecord(int i10) {
        Record[] clientRecords = getClientRecords();
        if (clientRecords != null) {
            for (int i11 = 0; i11 < clientRecords.length; i11++) {
                if (clientRecords[i11].getRecordType() == i10) {
                    return clientRecords[i11];
                }
            }
            return null;
        }
        return null;
    }

    public Record[] getClientRecords() {
        if (this._clientData == null) {
            EscherRecord F = s.F(getSpContainer(), -4079);
            if (F != null && !(F instanceof EscherClientDataRecord)) {
                byte[] serialize = F.serialize();
                EscherClientDataRecord escherClientDataRecord = new EscherClientDataRecord();
                escherClientDataRecord.fillFields(serialize, 0, new DefaultEscherRecordFactory());
                F = escherClientDataRecord;
            }
            this._clientData = (EscherClientDataRecord) F;
        }
        EscherClientDataRecord escherClientDataRecord2 = this._clientData;
        if (escherClientDataRecord2 != null && this._clientRecords == null) {
            byte[] remainingData = escherClientDataRecord2.getRemainingData();
            this._clientRecords = Record.findChildRecords(remainingData, 0, remainingData.length);
        }
        return this._clientRecords;
    }

    public int getLineDashing() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), 462);
        if (escherSimpleProperty == null) {
            return 0;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    public int getLineStyle() {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) s.H((EscherOptRecord) s.F(this._escherContainer, -4085), 461);
        if (escherSimpleProperty == null) {
            return 0;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    @Override // lib.zj.office.fc.hslf.model.Shape
    public Rectangle2D getLogicalAnchor2D() {
        Rectangle2D anchor2D = getAnchor2D();
        Shape shape = this._parent;
        if (shape != null) {
            Rectangle2D clientAnchor2D = ((ShapeGroup) shape).getClientAnchor2D(shape);
            Rectangle2D coordinates = ((ShapeGroup) this._parent).getCoordinates();
            double width = coordinates.getWidth() / clientAnchor2D.getWidth();
            double height = coordinates.getHeight() / clientAnchor2D.getHeight();
            anchor2D = new Rectangle2D.Double(((anchor2D.getX() - coordinates.getX()) / width) + clientAnchor2D.getX(), ((anchor2D.getY() - coordinates.getY()) / height) + clientAnchor2D.getY(), anchor2D.getWidth() / width, anchor2D.getHeight() / height);
        }
        int rotation = getRotation();
        if (rotation != 0) {
            double width2 = (anchor2D.getWidth() / 2.0d) + anchor2D.getX();
            double height2 = (anchor2D.getHeight() / 2.0d) + anchor2D.getY();
            AffineTransform affineTransform = new AffineTransform();
            affineTransform.translate(width2, height2);
            affineTransform.rotate(Math.toRadians(rotation));
            double d10 = -width2;
            double d11 = -height2;
            affineTransform.translate(d10, d11);
            Rectangle2D bounds2D = affineTransform.createTransformedShape(anchor2D).getBounds2D();
            if ((anchor2D.getWidth() < anchor2D.getHeight() && bounds2D.getWidth() > bounds2D.getHeight()) || (anchor2D.getWidth() > anchor2D.getHeight() && bounds2D.getWidth() < bounds2D.getHeight())) {
                AffineTransform affineTransform2 = new AffineTransform();
                affineTransform2.translate(width2, height2);
                affineTransform2.rotate(1.5707963267948966d);
                affineTransform2.translate(d10, d11);
                return affineTransform2.createTransformedShape(anchor2D).getBounds2D();
            }
            return anchor2D;
        }
        return anchor2D;
    }

    public void setFillColor(Color color) {
        getFill().setForegroundColor(color);
    }

    public void setHyperlink(Hyperlink hyperlink) {
        if (hyperlink.getId() != -1) {
            EscherClientDataRecord escherClientDataRecord = new EscherClientDataRecord();
            escherClientDataRecord.setOptions((short) 15);
            getSpContainer().addChildRecord(escherClientDataRecord);
            InteractiveInfoAtom interactiveInfoAtom = new InteractiveInfo().getInteractiveInfoAtom();
            int type = hyperlink.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 2) {
                        if (type != 3) {
                            if (type == 8) {
                                interactiveInfoAtom.setAction((byte) 4);
                                interactiveInfoAtom.setJump((byte) 0);
                                interactiveInfoAtom.setHyperlinkType((byte) 8);
                            }
                        } else {
                            interactiveInfoAtom.setAction((byte) 3);
                            interactiveInfoAtom.setJump((byte) 4);
                            interactiveInfoAtom.setHyperlinkType((byte) 3);
                        }
                    } else {
                        interactiveInfoAtom.setAction((byte) 3);
                        interactiveInfoAtom.setJump((byte) 3);
                        interactiveInfoAtom.setHyperlinkType((byte) 2);
                    }
                } else {
                    interactiveInfoAtom.setAction((byte) 3);
                    interactiveInfoAtom.setJump((byte) 2);
                    interactiveInfoAtom.setHyperlinkType((byte) 1);
                }
            } else {
                interactiveInfoAtom.setAction((byte) 3);
                interactiveInfoAtom.setJump((byte) 1);
                interactiveInfoAtom.setHyperlinkType((byte) 0);
            }
            interactiveInfoAtom.setHyperlinkID(hyperlink.getId());
            return;
        }
        throw new HSLFException("You must call SlideShow.addHyperlink(Hyperlink link) first");
    }

    public void setLineColor(Color color) {
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        if (color == null) {
            Shape.setEscherProperty(escherOptRecord, EscherProperties.LINESTYLE__NOLINEDRAWDASH, 524288);
            return;
        }
        Shape.setEscherProperty(escherOptRecord, EscherProperties.LINESTYLE__COLOR, new Color(color.getBlue(), color.getGreen(), color.getRed(), 0).getRGB());
        Shape.setEscherProperty(escherOptRecord, EscherProperties.LINESTYLE__NOLINEDRAWDASH, 1572888);
    }

    public void setLineDashing(int i10) {
        Shape.setEscherProperty((EscherOptRecord) s.F(this._escherContainer, -4085), EscherProperties.LINESTYLE__LINEDASHING, i10);
    }

    public void setLineStyle(int i10) {
        EscherOptRecord escherOptRecord = (EscherOptRecord) s.F(this._escherContainer, -4085);
        if (i10 == 0) {
            i10 = -1;
        }
        Shape.setEscherProperty(escherOptRecord, EscherProperties.LINESTYLE__LINESTYLE, i10);
    }

    public void setLineWidth(double d10) {
        Shape.setEscherProperty((EscherOptRecord) s.F(this._escherContainer, -4085), EscherProperties.LINESTYLE__LINEWIDTH, (int) (d10 * 12700.0d));
    }

    public void setRotation(int i10) {
        setEscherProperty((short) 4, i10 << 16);
    }

    public void updateClientData() {
        if (this._clientData != null && this._clientRecords != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i10 = 0; i10 < this._clientRecords.length; i10++) {
                try {
                } catch (Exception e10) {
                    throw new HSLFException(e10);
                }
            }
            this._clientData.setRemainingData(byteArrayOutputStream.toByteArray());
        }
    }
}
