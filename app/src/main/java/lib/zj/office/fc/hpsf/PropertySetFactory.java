package lib.zj.office.fc.hpsf;

import java.io.InputStream;

/* loaded from: classes3.dex */
public class PropertySetFactory {
    public static PropertySet create(InputStream inputStream) {
        PropertySet propertySet = new PropertySet(inputStream);
        try {
            if (propertySet.isSummaryInformation()) {
                return new SummaryInformation(propertySet);
            }
            if (propertySet.isDocumentSummaryInformation()) {
                return new DocumentSummaryInformation(propertySet);
            }
            return propertySet;
        } catch (UnexpectedPropertySetTypeException e10) {
            throw new Error(e10.toString());
        }
    }

    public static DocumentSummaryInformation newDocumentSummaryInformation() {
        MutablePropertySet mutablePropertySet = new MutablePropertySet();
        ((MutableSection) mutablePropertySet.getFirstSection()).setFormatID(SectionIDMap.DOCUMENT_SUMMARY_INFORMATION_ID[0]);
        try {
            return new DocumentSummaryInformation(mutablePropertySet);
        } catch (UnexpectedPropertySetTypeException e10) {
            throw new HPSFRuntimeException(e10);
        }
    }

    public static SummaryInformation newSummaryInformation() {
        MutablePropertySet mutablePropertySet = new MutablePropertySet();
        ((MutableSection) mutablePropertySet.getFirstSection()).setFormatID(SectionIDMap.SUMMARY_INFORMATION_ID);
        try {
            return new SummaryInformation(mutablePropertySet);
        } catch (UnexpectedPropertySetTypeException e10) {
            throw new HPSFRuntimeException(e10);
        }
    }
}
