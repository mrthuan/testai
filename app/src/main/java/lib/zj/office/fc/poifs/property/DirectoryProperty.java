package lib.zj.office.fc.poifs.property;

import a6.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class DirectoryProperty extends Property implements Parent {
    private List<Property> _children;
    private Set<String> _children_names;

    /* loaded from: classes3.dex */
    public static class PropertyComparator implements Comparator<Property> {
        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return false;
        }

        @Override // java.util.Comparator
        public int compare(Property property, Property property2) {
            String name = property.getName();
            String name2 = property2.getName();
            int length = name.length() - name2.length();
            if (length == 0) {
                if (name.compareTo("_VBA_PROJECT") != 0) {
                    if (name2.compareTo("_VBA_PROJECT") != 0) {
                        if (name.startsWith("__") && name2.startsWith("__")) {
                            return name.compareToIgnoreCase(name2);
                        }
                        if (!name.startsWith("__")) {
                            if (!name2.startsWith("__")) {
                                return name.compareToIgnoreCase(name2);
                            }
                        }
                    }
                    return -1;
                }
                return 1;
            }
            return length;
        }
    }

    public DirectoryProperty(String str) {
        this._children = new ArrayList();
        this._children_names = new HashSet();
        setName(str);
        setSize(0);
        setPropertyType((byte) 1);
        setStartBlock(0);
        setNodeColor((byte) 1);
    }

    @Override // lib.zj.office.fc.poifs.property.Parent
    public void addChild(Property property) {
        String name = property.getName();
        if (!this._children_names.contains(name)) {
            this._children_names.add(name);
            this._children.add(property);
            return;
        }
        throw new IOException(h.d("Duplicate name \"", name, OperatorName.SHOW_TEXT_LINE_AND_SPACE));
    }

    public boolean changeName(Property property, String str) {
        String name = property.getName();
        property.setName(str);
        String name2 = property.getName();
        if (this._children_names.contains(name2)) {
            property.setName(name);
            return false;
        }
        this._children_names.add(name2);
        this._children_names.remove(name);
        return true;
    }

    public boolean deleteChild(Property property) {
        boolean remove = this._children.remove(property);
        if (remove) {
            this._children_names.remove(property.getName());
        }
        return remove;
    }

    @Override // lib.zj.office.fc.poifs.property.Parent
    public Iterator<Property> getChildren() {
        return this._children.iterator();
    }

    @Override // lib.zj.office.fc.poifs.property.Property
    public boolean isDirectory() {
        return true;
    }

    @Override // lib.zj.office.fc.poifs.property.Property
    public void preWrite() {
        if (this._children.size() > 0) {
            Property[] propertyArr = (Property[]) this._children.toArray(new Property[0]);
            Arrays.sort(propertyArr, new PropertyComparator());
            int length = propertyArr.length / 2;
            setChildProperty(propertyArr[length].getIndex());
            propertyArr[0].setPreviousChild(null);
            propertyArr[0].setNextChild(null);
            for (int i10 = 1; i10 < length; i10++) {
                propertyArr[i10].setPreviousChild(propertyArr[i10 - 1]);
                propertyArr[i10].setNextChild(null);
            }
            if (length != 0) {
                propertyArr[length].setPreviousChild(propertyArr[length - 1]);
            }
            if (length != propertyArr.length - 1) {
                Property property = propertyArr[length];
                int i11 = length + 1;
                property.setNextChild(propertyArr[i11]);
                while (i11 < propertyArr.length - 1) {
                    propertyArr[i11].setPreviousChild(null);
                    Property property2 = propertyArr[i11];
                    i11++;
                    property2.setNextChild(propertyArr[i11]);
                }
                propertyArr[propertyArr.length - 1].setPreviousChild(null);
                propertyArr[propertyArr.length - 1].setNextChild(null);
                return;
            }
            propertyArr[length].setNextChild(null);
        }
    }

    public DirectoryProperty(int i10, byte[] bArr, int i11) {
        super(i10, bArr, i11);
        this._children = new ArrayList();
        this._children_names = new HashSet();
    }
}
