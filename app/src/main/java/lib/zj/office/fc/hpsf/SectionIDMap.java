package lib.zj.office.fc.hpsf;

import java.util.HashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes3.dex */
public class SectionIDMap extends HashMap {
    public static final String UNDEFINED = "[undefined]";
    private static SectionIDMap defaultMap;
    public static final byte[] SUMMARY_INFORMATION_ID = {-14, -97, -123, -32, Field.AUTOTEXT, -7, 16, 104, -85, -111, 8, 0, 43, Field.FILLIN, -77, -39};
    public static final byte[][] DOCUMENT_SUMMARY_INFORMATION_ID = {new byte[]{-43, -51, -43, 2, Field.DDEAUTO, -100, 16, Field.NUMWORDS, -109, -105, 8, 0, 43, 44, -7, -82}, new byte[]{-43, -51, -43, 5, Field.DDEAUTO, -100, 16, Field.NUMWORDS, -109, -105, 8, 0, 43, 44, -7, -82}};

    public static SectionIDMap getInstance() {
        if (defaultMap == null) {
            SectionIDMap sectionIDMap = new SectionIDMap();
            sectionIDMap.put(SUMMARY_INFORMATION_ID, PropertyIDMap.getSummaryInformationProperties());
            sectionIDMap.put(DOCUMENT_SUMMARY_INFORMATION_ID[0], PropertyIDMap.getDocumentSummaryInformationProperties());
            defaultMap = sectionIDMap;
        }
        return defaultMap;
    }

    public static String getPIDString(byte[] bArr, long j10) {
        String str;
        PropertyIDMap propertyIDMap = getInstance().get(bArr);
        if (propertyIDMap == null || (str = (String) propertyIDMap.get(j10)) == null) {
            return UNDEFINED;
        }
        return str;
    }

    public PropertyIDMap get(byte[] bArr) {
        return (PropertyIDMap) super.get(new String(bArr));
    }

    public Object put(byte[] bArr, PropertyIDMap propertyIDMap) {
        return super.put((SectionIDMap) new String(bArr), (String) propertyIDMap);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return get((byte[]) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return put((byte[]) obj, (PropertyIDMap) obj2);
    }
}
