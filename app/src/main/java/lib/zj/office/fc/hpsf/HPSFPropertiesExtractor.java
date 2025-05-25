package lib.zj.office.fc.hpsf;

import java.io.File;
import java.io.OutputStream;
import lib.zj.office.fc.a;
import lib.zj.office.fc.b;
import lib.zj.office.fc.poifs.filesystem.NPOIFSFileSystem;
import lib.zj.office.fc.poifs.filesystem.POIFSFileSystem;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class HPSFPropertiesExtractor extends b {

    /* loaded from: classes3.dex */
    public static final class PropertiesOnlyDocument extends a {
        public PropertiesOnlyDocument(NPOIFSFileSystem nPOIFSFileSystem) {
            super(nPOIFSFileSystem.getRoot());
        }

        @Override // lib.zj.office.fc.a
        public void write(OutputStream outputStream) {
            throw new IllegalStateException("Unable to write, only for properties!");
        }

        public PropertiesOnlyDocument(POIFSFileSystem pOIFSFileSystem) {
            super(pOIFSFileSystem);
        }
    }

    public HPSFPropertiesExtractor(b bVar) {
        super(bVar);
    }

    private static String getPropertiesText(SpecialPropertySet specialPropertySet) {
        if (specialPropertySet == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        PropertyIDMap propertySetIDMap = specialPropertySet.getPropertySetIDMap();
        Property[] properties = specialPropertySet.getProperties();
        for (int i10 = 0; i10 < properties.length; i10++) {
            String l10 = Long.toString(properties[i10].getID());
            Object obj = propertySetIDMap.get(properties[i10].getID());
            if (obj != null) {
                l10 = obj.toString();
            }
            String propertyValueText = getPropertyValueText(properties[i10].getValue());
            stringBuffer.append(l10 + " = " + propertyValueText + "\n");
        }
        return stringBuffer.toString();
    }

    private static String getPropertyValueText(Object obj) {
        if (obj == null) {
            return "(not set)";
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr.length == 0) {
                return "";
            }
            if (bArr.length == 1) {
                return Byte.toString(bArr[0]);
            }
            if (bArr.length == 2) {
                return Integer.toString(LittleEndian.getUShort(bArr));
            }
            if (bArr.length == 4) {
                return Long.toString(LittleEndian.getUInt(bArr));
            }
            return new String(bArr);
        }
        return obj.toString();
    }

    public static void main(String[] strArr) {
        for (String str : strArr) {
            System.out.println(new HPSFPropertiesExtractor(new NPOIFSFileSystem(new File(str))).getText());
        }
    }

    public String getDocumentSummaryInformationText() {
        CustomProperties customProperties;
        DocumentSummaryInformation documentSummaryInformation = this.document.getDocumentSummaryInformation();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getPropertiesText(documentSummaryInformation));
        if (documentSummaryInformation == null) {
            customProperties = null;
        } else {
            customProperties = documentSummaryInformation.getCustomProperties();
        }
        if (customProperties != null) {
            for (String str : customProperties.nameSet()) {
                String propertyValueText = getPropertyValueText(customProperties.get(str));
                stringBuffer.append(str + " = " + propertyValueText + "\n");
            }
        }
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.b
    public b getMetadataTextExtractor() {
        throw new IllegalStateException("You already have the Metadata Text Extractor, not recursing!");
    }

    public String getSummaryInformationText() {
        return getPropertiesText(this.document.getSummaryInformation());
    }

    @Override // lib.zj.office.fc.b
    public String getText() {
        return getSummaryInformationText() + getDocumentSummaryInformationText();
    }

    public HPSFPropertiesExtractor(a aVar) {
        super(aVar);
    }

    public HPSFPropertiesExtractor(POIFSFileSystem pOIFSFileSystem) {
        super(new PropertiesOnlyDocument(pOIFSFileSystem));
    }

    public HPSFPropertiesExtractor(NPOIFSFileSystem nPOIFSFileSystem) {
        super(new PropertiesOnlyDocument(nPOIFSFileSystem));
    }
}
