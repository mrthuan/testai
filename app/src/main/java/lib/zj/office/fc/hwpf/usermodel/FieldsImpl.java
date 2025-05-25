package lib.zj.office.fc.hwpf.usermodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.model.FieldsDocumentPart;
import lib.zj.office.fc.hwpf.model.FieldsTables;
import lib.zj.office.fc.hwpf.model.PlexOfField;

/* loaded from: classes3.dex */
public class FieldsImpl implements Fields {
    private PlexOfFieldComparator comparator = new PlexOfFieldComparator(0);
    private Map<FieldsDocumentPart, Map<Integer, FieldImpl>> _fieldsByOffset = new HashMap(FieldsDocumentPart.values().length);

    /* loaded from: classes3.dex */
    public static final class PlexOfFieldComparator implements Comparator<PlexOfField> {
        private PlexOfFieldComparator() {
        }

        public /* synthetic */ PlexOfFieldComparator(int i10) {
            this();
        }

        @Override // java.util.Comparator
        public int compare(PlexOfField plexOfField, PlexOfField plexOfField2) {
            int fcStart = plexOfField.getFcStart();
            int fcStart2 = plexOfField2.getFcStart();
            if (fcStart < fcStart2) {
                return -1;
            }
            return fcStart == fcStart2 ? 0 : 1;
        }
    }

    public FieldsImpl(FieldsTables fieldsTables) {
        FieldsDocumentPart[] values;
        for (FieldsDocumentPart fieldsDocumentPart : FieldsDocumentPart.values()) {
            this._fieldsByOffset.put(fieldsDocumentPart, parseFieldStructure(fieldsTables.getFieldsPLCF(fieldsDocumentPart)));
        }
    }

    private static <T> int binarySearch(List<PlexOfField> list, int i10, int i11, int i12) {
        checkIndexForBinarySearch(list.size(), i10, i11);
        int i13 = i11 - 1;
        int i14 = -1;
        int i15 = i10;
        while (i15 <= i13) {
            i14 = (i15 + i13) >>> 1;
            int fcStart = list.get(i14).getFcStart();
            if (fcStart == i12) {
                return i14;
            }
            if (fcStart < i12) {
                i15 = i14 + 1;
            } else {
                i13 = i14 - 1;
            }
        }
        if (i14 < 0) {
            int i16 = i11;
            while (i10 < i11) {
                if (i12 < list.get(i10).getFcStart()) {
                    i16 = i10;
                }
                i10++;
            }
            return (-i16) - 1;
        }
        return (-i14) - 1;
    }

    private static void checkIndexForBinarySearch(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 >= i12 && i11 >= 0) {
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    private Map<Integer, FieldImpl> parseFieldStructure(List<PlexOfField> list) {
        if (list != null && !list.isEmpty()) {
            Collections.sort(list, this.comparator);
            ArrayList arrayList = new ArrayList((list.size() / 3) + 1);
            parseFieldStructureImpl(list, 0, list.size(), arrayList);
            HashMap hashMap = new HashMap(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FieldImpl fieldImpl = (FieldImpl) it.next();
                hashMap.put(Integer.valueOf(fieldImpl.getFieldStartOffset()), fieldImpl);
            }
            return hashMap;
        }
        return new HashMap();
    }

    private void parseFieldStructureImpl(List<PlexOfField> list, int i10, int i11, List<FieldImpl> list2) {
        while (i10 < i11) {
            PlexOfField plexOfField = list.get(i10);
            if (plexOfField.getFld().getBoundaryType() != 19) {
                i10++;
            } else {
                i10++;
                int binarySearch = binarySearch(list, i10, i11, plexOfField.getFcEnd());
                if (binarySearch >= 0) {
                    PlexOfField plexOfField2 = list.get(binarySearch);
                    int boundaryType = plexOfField2.getFld().getBoundaryType();
                    if (boundaryType != 20) {
                        if (boundaryType == 21) {
                            list2.add(new FieldImpl(plexOfField, null, plexOfField2));
                            if (plexOfField.getFcStart() + 1 < plexOfField2.getFcStart() - 1) {
                                parseFieldStructureImpl(list, i10, binarySearch, list2);
                            }
                            i10 = binarySearch + 1;
                        }
                    } else {
                        int binarySearch2 = binarySearch(list, binarySearch, i11, plexOfField2.getFcEnd());
                        if (binarySearch2 >= 0) {
                            PlexOfField plexOfField3 = list.get(binarySearch2);
                            if (plexOfField3.getFld().getBoundaryType() == 21) {
                                list2.add(new FieldImpl(plexOfField, plexOfField2, plexOfField3));
                                if (plexOfField.getFcStart() + 1 < plexOfField2.getFcStart() - 1) {
                                    parseFieldStructureImpl(list, i10, binarySearch, list2);
                                }
                                if (plexOfField2.getFcStart() + 1 < plexOfField3.getFcStart() - 1) {
                                    parseFieldStructureImpl(list, binarySearch + 1, binarySearch2, list2);
                                }
                                i10 = binarySearch2 + 1;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Fields
    public Collection<Field> getFields(FieldsDocumentPart fieldsDocumentPart) {
        Map<Integer, FieldImpl> map = this._fieldsByOffset.get(fieldsDocumentPart);
        if (map != null && !map.isEmpty()) {
            return Collections.unmodifiableCollection(map.values());
        }
        return Collections.emptySet();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Fields
    public FieldImpl getFieldByStartOffset(FieldsDocumentPart fieldsDocumentPart, int i10) {
        Map<Integer, FieldImpl> map = this._fieldsByOffset.get(fieldsDocumentPart);
        if (map == null || map.isEmpty()) {
            return null;
        }
        return map.get(Integer.valueOf(i10));
    }
}
