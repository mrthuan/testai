package lib.zj.office.fc.hpsf;

import android.support.v4.media.session.h;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public class Property {

    /* renamed from: id  reason: collision with root package name */
    protected long f20661id;
    protected long type;
    protected Object value;

    public Property() {
    }

    public Property(long j10, long j11, Object obj) {
        this.f20661id = j10;
        this.type = j11;
        this.value = obj;
    }

    private boolean typesAreEqual(long j10, long j11) {
        if (j10 != j11) {
            if (j10 != 30 || j11 != 31) {
                if (j11 != 30 || j10 != 31) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Property)) {
            return false;
        }
        Property property = (Property) obj;
        Object value = property.getValue();
        long id2 = property.getID();
        long j10 = this.f20661id;
        if (j10 == id2 && (j10 == 0 || typesAreEqual(this.type, property.getType()))) {
            Object obj2 = this.value;
            if (obj2 == null && value == null) {
                return true;
            }
            if (obj2 != null && value != null) {
                Class<?> cls = obj2.getClass();
                Class<?> cls2 = value.getClass();
                if (!cls.isAssignableFrom(cls2) && !cls2.isAssignableFrom(cls)) {
                    return false;
                }
                Object obj3 = this.value;
                if (obj3 instanceof byte[]) {
                    return Util.equal((byte[]) obj3, (byte[]) value);
                }
                return obj3.equals(value);
            }
        }
        return false;
    }

    public long getID() {
        return this.f20661id;
    }

    public int getSize() {
        int variantLength = Variant.getVariantLength(this.type);
        if (variantLength >= 0) {
            return variantLength;
        }
        if (variantLength != -2) {
            int i10 = (int) this.type;
            if (i10 != 0) {
                if (i10 == 30) {
                    int length = ((String) this.value).length() + 1;
                    int i11 = length % 4;
                    if (i11 > 0) {
                        length += 4 - i11;
                    }
                    return variantLength + length;
                }
                throw new WritingNotSupportedException(this.type, this.value);
            }
            return variantLength;
        }
        throw new WritingNotSupportedException(this.type, null);
    }

    public long getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        long j10 = this.f20661id + 0 + this.type;
        Object obj = this.value;
        if (obj != null) {
            j10 += obj.hashCode();
        }
        return (int) (4294967295L & j10);
    }

    public Map readDictionary(byte[] bArr, long j10, int i10, int i11) {
        if (j10 >= 0 && j10 <= bArr.length) {
            int i12 = (int) j10;
            long uInt = LittleEndian.getUInt(bArr, i12);
            int i13 = i12 + 4;
            HashMap hashMap = new HashMap((int) uInt, 1.0f);
            for (int i14 = 0; i14 < uInt; i14++) {
                try {
                    Long valueOf = Long.valueOf(LittleEndian.getUInt(bArr, i13));
                    int i15 = i13 + 4;
                    long uInt2 = LittleEndian.getUInt(bArr, i15);
                    int i16 = i15 + 4;
                    StringBuffer stringBuffer = new StringBuffer();
                    if (i11 != -1) {
                        if (i11 != 1200) {
                            stringBuffer.append(new String(bArr, i16, (int) uInt2, VariantSupport.codepageToEncoding(i11)));
                        } else {
                            int i17 = (int) (2 * uInt2);
                            byte[] bArr2 = new byte[i17];
                            for (int i18 = 0; i18 < i17; i18 += 2) {
                                int i19 = i16 + i18;
                                bArr2[i18] = bArr[i19 + 1];
                                bArr2[i18 + 1] = bArr[i19];
                            }
                            stringBuffer.append(new String(bArr2, 0, i17, VariantSupport.codepageToEncoding(i11)));
                        }
                    } else {
                        stringBuffer.append(new String(bArr, i16, (int) uInt2));
                    }
                    while (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == 0) {
                        stringBuffer.setLength(stringBuffer.length() - 1);
                    }
                    if (i11 == 1200) {
                        if (uInt2 % 2 == 1) {
                            uInt2++;
                        }
                        i13 = (int) (uInt2 + uInt2 + i16);
                    } else {
                        i13 = (int) (i16 + uInt2);
                    }
                    hashMap.put(valueOf, stringBuffer.toString());
                } catch (RuntimeException e10) {
                    POILogFactory.getLogger(getClass()).log(POILogger.WARN, (Object) h.e(new StringBuilder("The property set's dictionary contains bogus data. All dictionary entries starting with the one with ID "), this.f20661id, " will be ignored."), (Throwable) e10);
                }
            }
            return hashMap;
        }
        throw new HPSFRuntimeException("Illegal offset " + j10 + " while HPSF stream contains " + i10 + " bytes.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append("[id: ");
        stringBuffer.append(getID());
        stringBuffer.append(", type: ");
        stringBuffer.append(getType());
        Object value = getValue();
        stringBuffer.append(", value: ");
        stringBuffer.append(value.toString());
        if (value instanceof String) {
            String str = (String) value;
            int length = str.length();
            byte[] bArr = new byte[length * 2];
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                int i11 = i10 * 2;
                bArr[i11] = (byte) ((65280 & charAt) >> 8);
                bArr[i11 + 1] = (byte) ((charAt & 255) >> 0);
            }
            String dump = HexDump.dump(bArr, 0L, 0);
            stringBuffer.append(" [");
            stringBuffer.append(dump);
            stringBuffer.append("]");
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public Property(long j10, byte[] bArr, long j11, int i10, int i11) {
        this.f20661id = j10;
        if (j10 == 0) {
            this.value = readDictionary(bArr, j11, i10, i11);
            return;
        }
        int i12 = (int) j11;
        long uInt = LittleEndian.getUInt(bArr, i12);
        this.type = uInt;
        try {
            this.value = VariantSupport.read(bArr, i12 + 4, i10, (int) uInt, i11);
        } catch (UnsupportedVariantTypeException e10) {
            VariantSupport.writeUnsupportedTypeMessage(e10);
            this.value = e10.getValue();
        }
    }
}
