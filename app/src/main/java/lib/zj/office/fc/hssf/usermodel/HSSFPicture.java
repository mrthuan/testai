package lib.zj.office.fc.hssf.usermodel;

import di.e;
import ei.b;
import java.io.ByteArrayInputStream;
import lib.zj.office.fc.ddf.EscherBSERecord;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ss.usermodel.Picture;
import lib.zj.office.fc.ss.util.ImageUtils;
import lib.zj.office.java.awt.Dimension;

/* loaded from: classes3.dex */
public final class HSSFPicture extends HSSFSimpleShape implements Picture {
    public static final int PICTURE_TYPE_DIB = 7;
    public static final int PICTURE_TYPE_EMF = 2;
    public static final int PICTURE_TYPE_JPEG = 5;
    public static final int PICTURE_TYPE_PICT = 4;
    public static final int PICTURE_TYPE_PNG = 6;
    public static final int PICTURE_TYPE_WMF = 3;
    private static final float PX_DEFAULT = 32.0f;
    private static final float PX_MODIFIED = 36.56f;
    private static final int PX_ROW = 15;
    private int _pictureIndex;
    private EscherOptRecord opt;

    public HSSFPicture(EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        setShapeType(8);
    }

    private float getColumnWidthInPixels(int i10) {
        if (checkPatriarch()) {
            return this._patriarch._sheet.d(i10);
        }
        return 0.0f;
    }

    private float getPixelWidth(int i10) {
        return PX_DEFAULT;
    }

    private float getRowHeightInPixels(int i10) {
        b g10;
        if (checkPatriarch() && (g10 = this._patriarch._sheet.g(i10)) != null) {
            return g10.f16598f;
        }
        return 18.0f;
    }

    public EscherOptRecord getEscherOptRecord() {
        return this.opt;
    }

    public Dimension getImageDimension() {
        if (checkPatriarch()) {
            EscherBSERecord bSERecord = ((e) this._patriarch._sheet.f16601a).f16209m.getBSERecord(this._pictureIndex);
            byte[] picturedata = bSERecord.getBlipRecord().getPicturedata();
            return ImageUtils.getImageDimension(new ByteArrayInputStream(picturedata), bSERecord.getBlipTypeWin32());
        }
        return null;
    }

    public int getPictureIndex() {
        return this._pictureIndex;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Picture
    public void resize(double d10) {
        HSSFClientAnchor hSSFClientAnchor = (HSSFClientAnchor) getAnchor();
        hSSFClientAnchor.setAnchorType(2);
        HSSFClientAnchor preferredSize = getPreferredSize(d10);
        int row2 = (preferredSize.getRow2() - preferredSize.getRow1()) + hSSFClientAnchor.getRow1();
        hSSFClientAnchor.setCol2((short) ((preferredSize.getCol2() - preferredSize.getCol1()) + hSSFClientAnchor.getCol1()));
        hSSFClientAnchor.setDx1(0);
        hSSFClientAnchor.setDx2(preferredSize.getDx2());
        hSSFClientAnchor.setRow2(row2);
        hSSFClientAnchor.setDy1(0);
        hSSFClientAnchor.setDy2(preferredSize.getDy2());
    }

    public void setPictureIndex(int i10) {
        this._pictureIndex = i10;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Picture
    public HSSFPictureData getPictureData() {
        int i10;
        if (!checkPatriarch() || (i10 = this._pictureIndex) <= 0) {
            return null;
        }
        return new HSSFPictureData(((e) this._patriarch._sheet.f16601a).f16209m.getBSERecord(i10).getBlipRecord());
    }

    @Override // lib.zj.office.fc.ss.usermodel.Picture
    public HSSFClientAnchor getPreferredSize() {
        return getPreferredSize(1.0d);
    }

    public HSSFPicture(e eVar, EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor, EscherOptRecord escherOptRecord) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        setShapeType(8);
        this.opt = escherOptRecord;
        processLineWidth();
        processLine(escherContainerRecord, eVar);
        processSimpleBackground(escherContainerRecord, eVar);
        processRotationAndFlip(escherContainerRecord);
    }

    public HSSFClientAnchor getPreferredSize(double d10) {
        double d11;
        int i10;
        double d12;
        HSSFClientAnchor hSSFClientAnchor = (HSSFClientAnchor) getAnchor();
        Dimension imageDimension = getImageDimension();
        double width = imageDimension.getWidth() * d10;
        double height = imageDimension.getHeight() * d10;
        float columnWidthInPixels = ((1.0f - (hSSFClientAnchor.dx1 / 1024.0f)) * getColumnWidthInPixels(hSSFClientAnchor.col1)) + 0.0f;
        short s4 = (short) (hSSFClientAnchor.col1 + 1);
        while (true) {
            d11 = columnWidthInPixels;
            if (d11 >= width) {
                break;
            }
            columnWidthInPixels += getColumnWidthInPixels(s4);
            s4 = (short) (s4 + 1);
        }
        int i11 = 0;
        if (d11 > width) {
            s4 = (short) (s4 - 1);
            double columnWidthInPixels2 = getColumnWidthInPixels(s4);
            i10 = (int) (((columnWidthInPixels2 - (d11 - width)) / columnWidthInPixels2) * 1024.0d);
        } else {
            i10 = 0;
        }
        hSSFClientAnchor.col2 = s4;
        hSSFClientAnchor.dx2 = i10;
        float rowHeightInPixels = ((1.0f - (hSSFClientAnchor.dy1 / 256.0f)) * getRowHeightInPixels(hSSFClientAnchor.row1)) + 0.0f;
        int i12 = hSSFClientAnchor.row1 + 1;
        while (true) {
            d12 = rowHeightInPixels;
            if (d12 >= height) {
                break;
            }
            rowHeightInPixels += getRowHeightInPixels(i12);
            i12++;
        }
        if (d12 > height) {
            i12--;
            double rowHeightInPixels2 = getRowHeightInPixels(i12);
            i11 = (int) (((rowHeightInPixels2 - (d12 - height)) / rowHeightInPixels2) * 256.0d);
        }
        hSSFClientAnchor.row2 = i12;
        hSSFClientAnchor.dy2 = i11;
        return hSSFClientAnchor;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Picture
    public void resize() {
        resize(1.0d);
    }
}
