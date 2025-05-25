package lib.zj.office.fc.hpsf;

import a0.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class PropertySet {
    static final byte[] BYTE_ORDER_ASSERTION = {-2, -1};
    static final byte[] FORMAT_ASSERTION = {0, 0};
    public static final int OS_MACINTOSH = 1;
    public static final int OS_WIN16 = 0;
    public static final int OS_WIN32 = 2;
    protected int byteOrder;
    protected ClassID classID;
    protected int format;
    protected int osVersion;
    protected List sections;

    public PropertySet() {
    }

    public PropertySet(InputStream inputStream) {
        if (isPropertySetStream(inputStream)) {
            int available = inputStream.available();
            byte[] bArr = new byte[available];
            inputStream.read(bArr, 0, available);
            init(bArr, 0, available);
            return;
        }
        throw new NoPropertySetStreamException();
    }

    private void init(byte[] bArr, int i10, int i11) {
        this.byteOrder = LittleEndian.getUShort(bArr, i10);
        int i12 = i10 + 2;
        this.format = LittleEndian.getUShort(bArr, i12);
        int i13 = i12 + 2;
        this.osVersion = (int) LittleEndian.getUInt(bArr, i13);
        int i14 = i13 + 4;
        this.classID = new ClassID(bArr, i14);
        int i15 = i14 + 16;
        int i16 = LittleEndian.getInt(bArr, i15);
        int i17 = i15 + 4;
        if (i16 >= 0) {
            this.sections = new ArrayList(i16);
            for (int i18 = 0; i18 < i16; i18++) {
                Section section = new Section(bArr, i17);
                i17 += 20;
                this.sections.add(section);
            }
            return;
        }
        throw new HPSFRuntimeException(a.g("Section count ", i16, " is negative."));
    }

    public static boolean isPropertySetStream(InputStream inputStream) {
        if (inputStream.markSupported()) {
            inputStream.mark(50);
            byte[] bArr = new byte[50];
            boolean isPropertySetStream = isPropertySetStream(bArr, 0, inputStream.read(bArr, 0, Math.min(50, inputStream.available())));
            inputStream.reset();
            return isPropertySetStream;
        }
        throw new MarkUnsupportedException(inputStream.getClass().getName());
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof PropertySet)) {
            PropertySet propertySet = (PropertySet) obj;
            int byteOrder = propertySet.getByteOrder();
            int byteOrder2 = getByteOrder();
            ClassID classID = propertySet.getClassID();
            ClassID classID2 = getClassID();
            int format = propertySet.getFormat();
            int format2 = getFormat();
            int oSVersion = propertySet.getOSVersion();
            int oSVersion2 = getOSVersion();
            int sectionCount = propertySet.getSectionCount();
            int sectionCount2 = getSectionCount();
            if (byteOrder == byteOrder2 && classID.equals(classID2) && format == format2 && oSVersion == oSVersion2 && sectionCount == sectionCount2) {
                return Util.equals(getSections(), propertySet.getSections());
            }
        }
        return false;
    }

    public int getByteOrder() {
        return this.byteOrder;
    }

    public ClassID getClassID() {
        return this.classID;
    }

    public Section getFirstSection() {
        if (getSectionCount() >= 1) {
            return (Section) this.sections.get(0);
        }
        throw new MissingSectionException("Property set does not contain any sections.");
    }

    public int getFormat() {
        return this.format;
    }

    public int getOSVersion() {
        return this.osVersion;
    }

    public Property[] getProperties() {
        return getFirstSection().getProperties();
    }

    public Object getProperty(int i10) {
        return getFirstSection().getProperty(i10);
    }

    public boolean getPropertyBooleanValue(int i10) {
        return getFirstSection().getPropertyBooleanValue(i10);
    }

    public int getPropertyIntValue(int i10) {
        return getFirstSection().getPropertyIntValue(i10);
    }

    public int getSectionCount() {
        return this.sections.size();
    }

    public List getSections() {
        return this.sections;
    }

    public Section getSingleSection() {
        int sectionCount = getSectionCount();
        if (sectionCount == 1) {
            return (Section) this.sections.get(0);
        }
        throw new NoSingleSectionException(a.g("Property set contains ", sectionCount, " sections."));
    }

    public int hashCode() {
        throw new UnsupportedOperationException("FIXME: Not yet implemented.");
    }

    public boolean isDocumentSummaryInformation() {
        if (this.sections.size() <= 0) {
            return false;
        }
        return Util.equal(((Section) this.sections.get(0)).getFormatID().getBytes(), SectionIDMap.DOCUMENT_SUMMARY_INFORMATION_ID[0]);
    }

    public boolean isSummaryInformation() {
        if (this.sections.size() <= 0) {
            return false;
        }
        return Util.equal(((Section) this.sections.get(0)).getFormatID().getBytes(), SectionIDMap.SUMMARY_INFORMATION_ID);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int sectionCount = getSectionCount();
        stringBuffer.append(getClass().getName());
        stringBuffer.append("[byteOrder: ");
        stringBuffer.append(getByteOrder());
        stringBuffer.append(", classID: ");
        stringBuffer.append(getClassID());
        stringBuffer.append(", format: ");
        stringBuffer.append(getFormat());
        stringBuffer.append(", OSVersion: ");
        stringBuffer.append(getOSVersion());
        stringBuffer.append(", sectionCount: ");
        stringBuffer.append(sectionCount);
        stringBuffer.append(", sections: [\n");
        List sections = getSections();
        for (int i10 = 0; i10 < sectionCount; i10++) {
            stringBuffer.append(((Section) sections.get(i10)).toString());
        }
        stringBuffer.append("]]");
        return stringBuffer.toString();
    }

    public boolean wasNull() {
        return getFirstSection().wasNull();
    }

    public PropertySet(byte[] bArr, int i10, int i11) {
        if (isPropertySetStream(bArr, i10, i11)) {
            init(bArr, i10, i11);
            return;
        }
        throw new NoPropertySetStreamException();
    }

    public static boolean isPropertySetStream(byte[] bArr, int i10, int i11) {
        int uShort = LittleEndian.getUShort(bArr, i10);
        int i12 = i10 + 2;
        byte[] bArr2 = new byte[2];
        LittleEndian.putShort(bArr2, (short) uShort);
        if (Util.equal(bArr2, BYTE_ORDER_ASSERTION)) {
            int uShort2 = LittleEndian.getUShort(bArr, i12);
            int i13 = i12 + 2;
            byte[] bArr3 = new byte[2];
            LittleEndian.putShort(bArr3, (short) uShort2);
            return Util.equal(bArr3, FORMAT_ASSERTION) && LittleEndian.getUInt(bArr, (i13 + 4) + 16) >= 0;
        }
        return false;
    }

    public PropertySet(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
