package lib.zj.office.fc.hpsf;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class MutableSection extends Section {
    private boolean dirty = true;
    private List<Property> preprops;
    private byte[] sectionBytes;

    public MutableSection() {
        this.formatID = null;
        this.offset = -1L;
        this.preprops = new LinkedList();
    }

    private int calcSize() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        write(byteArrayOutputStream);
        byteArrayOutputStream.close();
        byte[] pad4 = Util.pad4(byteArrayOutputStream.toByteArray());
        this.sectionBytes = pad4;
        return pad4.length;
    }

    private static int writeDictionary(OutputStream outputStream, Map<Long, String> map, int i10) {
        int writeUIntToStream = TypeWriter.writeUIntToStream(outputStream, map.size());
        for (Long l10 : map.keySet()) {
            String str = map.get(l10);
            if (i10 == 1200) {
                int length = str.length() + 1;
                if (length % 2 == 1) {
                    length++;
                }
                writeUIntToStream = TypeWriter.writeUIntToStream(outputStream, length) + TypeWriter.writeUIntToStream(outputStream, l10.longValue()) + writeUIntToStream;
                byte[] bytes = str.getBytes(VariantSupport.codepageToEncoding(i10));
                for (int i11 = 2; i11 < bytes.length; i11 += 2) {
                    outputStream.write(bytes[i11 + 1]);
                    outputStream.write(bytes[i11]);
                    writeUIntToStream += 2;
                }
                for (int length2 = length - str.length(); length2 > 0; length2--) {
                    outputStream.write(0);
                    outputStream.write(0);
                    writeUIntToStream += 2;
                }
            } else {
                int writeUIntToStream2 = TypeWriter.writeUIntToStream(outputStream, str.length() + 1) + TypeWriter.writeUIntToStream(outputStream, l10.longValue()) + writeUIntToStream;
                byte[] bytes2 = str.getBytes(VariantSupport.codepageToEncoding(i10));
                for (byte b10 : bytes2) {
                    outputStream.write(b10);
                    writeUIntToStream2++;
                }
                outputStream.write(0);
                writeUIntToStream = writeUIntToStream2 + 1;
            }
        }
        return writeUIntToStream;
    }

    public void clear() {
        for (Property property : getProperties()) {
            removeProperty(property.getID());
        }
    }

    @Override // lib.zj.office.fc.hpsf.Section
    public Property[] getProperties() {
        Property[] propertyArr = (Property[]) this.preprops.toArray(new Property[0]);
        this.properties = propertyArr;
        return propertyArr;
    }

    @Override // lib.zj.office.fc.hpsf.Section
    public Object getProperty(long j10) {
        getProperties();
        return super.getProperty(j10);
    }

    @Override // lib.zj.office.fc.hpsf.Section
    public int getPropertyCount() {
        return this.preprops.size();
    }

    @Override // lib.zj.office.fc.hpsf.Section
    public int getSize() {
        if (this.dirty) {
            try {
                this.size = calcSize();
                this.dirty = false;
            } catch (HPSFRuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new HPSFRuntimeException(e11);
            }
        }
        return this.size;
    }

    public void removeProperty(long j10) {
        Iterator<Property> it = this.preprops.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().getID() == j10) {
                it.remove();
                break;
            }
        }
        this.dirty = true;
    }

    public void setCodepage(int i10) {
        setProperty(1, 2L, Integer.valueOf(i10));
    }

    public void setDictionary(Map<Long, String> map) {
        if (map != null) {
            this.dictionary = map;
            setProperty(0, -1L, map);
            if (((Integer) getProperty(1L)) == null) {
                setProperty(1, 2L, 1200);
                return;
            }
            return;
        }
        removeProperty(0L);
    }

    public void setFormatID(ClassID classID) {
        this.formatID = classID;
    }

    public void setProperties(Property[] propertyArr) {
        this.properties = propertyArr;
        this.preprops = new LinkedList();
        for (Property property : propertyArr) {
            this.preprops.add(property);
        }
        this.dirty = true;
    }

    public void setProperty(int i10, String str) {
        setProperty(i10, 31L, str);
        this.dirty = true;
    }

    public void setPropertyBooleanValue(int i10, boolean z10) {
        setProperty(i10, 11L, Boolean.valueOf(z10));
    }

    public int write(OutputStream outputStream) {
        int i10;
        byte[] bArr;
        if (!this.dirty && (bArr = this.sectionBytes) != null) {
            outputStream.write(bArr);
            return this.sectionBytes.length;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        int propertyCount = (getPropertyCount() * 2 * 4) + 8 + 0;
        if (getProperty(0L) != null) {
            Object property = getProperty(1L);
            if (property != null) {
                if (!(property instanceof Integer)) {
                    throw new IllegalPropertySetDataException("The codepage property (ID = 1) must be an Integer object.");
                }
            } else {
                setProperty(1, 2L, 1200);
            }
            i10 = getCodepage();
        } else {
            i10 = -1;
        }
        Collections.sort(this.preprops, new Comparator<Property>() { // from class: lib.zj.office.fc.hpsf.MutableSection.1
            @Override // java.util.Comparator
            public int compare(Property property2, Property property3) {
                if (property2.getID() < property3.getID()) {
                    return -1;
                }
                return property2.getID() == property3.getID() ? 0 : 1;
            }
        });
        ListIterator<Property> listIterator = this.preprops.listIterator();
        while (listIterator.hasNext()) {
            MutableProperty mutableProperty = (MutableProperty) listIterator.next();
            long id2 = mutableProperty.getID();
            TypeWriter.writeUIntToStream(byteArrayOutputStream2, mutableProperty.getID());
            TypeWriter.writeUIntToStream(byteArrayOutputStream2, propertyCount);
            if (id2 != 0) {
                propertyCount = mutableProperty.write(byteArrayOutputStream, getCodepage()) + propertyCount;
            } else if (i10 != -1) {
                propertyCount += writeDictionary(byteArrayOutputStream, this.dictionary, i10);
            } else {
                throw new IllegalPropertySetDataException("Codepage (property 1) is undefined.");
            }
        }
        byteArrayOutputStream.close();
        byteArrayOutputStream2.close();
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        TypeWriter.writeToStream(outputStream, byteArray.length + 8 + byteArray2.length);
        TypeWriter.writeToStream(outputStream, getPropertyCount());
        outputStream.write(byteArray);
        outputStream.write(byteArray2);
        return byteArray.length + 8 + byteArray2.length;
    }

    public void setFormatID(byte[] bArr) {
        ClassID formatID = getFormatID();
        if (formatID == null) {
            formatID = new ClassID();
            setFormatID(formatID);
        }
        formatID.setBytes(bArr);
    }

    public void setProperty(int i10, int i11) {
        setProperty(i10, 3L, Integer.valueOf(i11));
        this.dirty = true;
    }

    public void setProperty(int i10, long j10) {
        setProperty(i10, 20L, Long.valueOf(j10));
        this.dirty = true;
    }

    public MutableSection(Section section) {
        setFormatID(section.getFormatID());
        Property[] properties = section.getProperties();
        MutableProperty[] mutablePropertyArr = new MutableProperty[properties.length];
        for (int i10 = 0; i10 < properties.length; i10++) {
            mutablePropertyArr[i10] = new MutableProperty(properties[i10]);
        }
        setProperties(mutablePropertyArr);
        setDictionary(section.getDictionary());
    }

    public void setProperty(int i10, boolean z10) {
        setProperty(i10, 11L, Boolean.valueOf(z10));
        this.dirty = true;
    }

    public void setProperty(int i10, long j10, Object obj) {
        MutableProperty mutableProperty = new MutableProperty();
        mutableProperty.setID(i10);
        mutableProperty.setType(j10);
        mutableProperty.setValue(obj);
        setProperty(mutableProperty);
        this.dirty = true;
    }

    public void setProperty(Property property) {
        removeProperty(property.getID());
        this.preprops.add(property);
        this.dirty = true;
    }

    public void setProperty(int i10, Object obj) {
        if (obj instanceof String) {
            setProperty(i10, (String) obj);
        } else if (obj instanceof Long) {
            setProperty(i10, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            setProperty(i10, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            setProperty(i10, ((Short) obj).intValue());
        } else if (obj instanceof Boolean) {
            setProperty(i10, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Date) {
            setProperty(i10, 64L, obj);
        } else {
            throw new HPSFRuntimeException("HPSF does not support properties of type " + obj.getClass().getName() + ".");
        }
    }
}
