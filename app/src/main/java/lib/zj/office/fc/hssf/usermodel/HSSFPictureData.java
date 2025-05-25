package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.ddf.EscherBlipRecord;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.ss.usermodel.PictureData;

/* loaded from: classes3.dex */
public class HSSFPictureData implements PictureData {
    public static final short FORMAT_MASK = -16;
    public static final short MSOBI_DIB = 31360;
    public static final short MSOBI_EMF = 15680;
    public static final short MSOBI_JPEG = 18080;
    public static final short MSOBI_PICT = 21536;
    public static final short MSOBI_PNG = 28160;
    public static final short MSOBI_WMF = 8544;
    private EscherBlipRecord blip;

    public HSSFPictureData(EscherBlipRecord escherBlipRecord) {
        this.blip = escherBlipRecord;
    }

    @Override // lib.zj.office.fc.ss.usermodel.PictureData
    public byte[] getData() {
        return this.blip.getPicturedata();
    }

    public int getFormat() {
        return this.blip.getRecordId() + 4072;
    }

    @Override // lib.zj.office.fc.ss.usermodel.PictureData
    public String getMimeType() {
        switch (this.blip.getRecordId()) {
            case -4070:
                return "image/x-emf";
            case -4069:
                return "image/x-wmf";
            case -4068:
                return "image/x-pict";
            case -4067:
                return ContentTypes.IMAGE_JPEG;
            case -4066:
                return ContentTypes.IMAGE_PNG;
            case -4065:
                return "image/bmp";
            default:
                return "image/unknown";
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.PictureData
    public String suggestFileExtension() {
        switch (this.blip.getRecordId()) {
            case -4070:
                return "emf";
            case -4069:
                return "wmf";
            case -4068:
                return "pict";
            case -4067:
                return ContentTypes.EXTENSION_JPG_2;
            case -4066:
                return ContentTypes.EXTENSION_PNG;
            case -4065:
                return "dib";
            default:
                return "";
        }
    }
}
