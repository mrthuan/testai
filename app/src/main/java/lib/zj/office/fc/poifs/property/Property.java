package lib.zj.office.fc.poifs.property;

import androidx.appcompat.view.menu.d;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import lib.zj.office.fc.hpsf.ClassID;
import lib.zj.office.fc.util.ByteField;
import lib.zj.office.fc.util.IntegerField;
import lib.zj.office.fc.util.ShortField;

/* loaded from: classes3.dex */
public abstract class Property implements Child {
    protected static final byte _NODE_BLACK = 1;
    protected static final byte _NODE_RED = 0;
    protected static final int _NO_INDEX = -1;
    private static final int _big_block_minimum_bytes = 4096;
    private static final int _child_property_offset = 76;
    private static final int _days_1_offset = 104;
    private static final int _days_2_offset = 112;
    private static final byte _default_fill = 0;
    private static final int _max_name_length = 31;
    private static final int _name_size_offset = 64;
    private static final int _next_property_offset = 72;
    private static final int _node_color_offset = 67;
    private static final int _previous_property_offset = 68;
    private static final int _seconds_1_offset = 100;
    private static final int _seconds_2_offset = 108;
    private static final int _size_offset = 120;
    private static final int _start_block_offset = 116;
    private static final int _storage_clsid_offset = 80;
    private static final int _user_flags_offset = 96;
    private IntegerField _child_property;
    private IntegerField _days_1;
    private IntegerField _days_2;
    private int _index;
    private String _name;
    private ShortField _name_size;
    private Child _next_child;
    private IntegerField _next_property;
    private ByteField _node_color;
    private Child _previous_child;
    private IntegerField _previous_property;
    private ByteField _property_type;
    private byte[] _raw_data;
    private IntegerField _seconds_1;
    private IntegerField _seconds_2;
    private IntegerField _size;
    private IntegerField _start_block;
    private ClassID _storage_clsid;
    private IntegerField _user_flags;

    public Property() {
        byte[] bArr = new byte[128];
        this._raw_data = bArr;
        Arrays.fill(bArr, (byte) 0);
        this._name_size = new ShortField(64);
        this._property_type = new ByteField(66);
        this._node_color = new ByteField(67);
        this._previous_property = new IntegerField(68, -1, this._raw_data);
        this._next_property = new IntegerField(72, -1, this._raw_data);
        this._child_property = new IntegerField(76, -1, this._raw_data);
        this._storage_clsid = new ClassID(this._raw_data, 80);
        this._user_flags = new IntegerField(96, 0, this._raw_data);
        this._seconds_1 = new IntegerField(100, 0, this._raw_data);
        this._days_1 = new IntegerField(104, 0, this._raw_data);
        this._seconds_2 = new IntegerField(108, 0, this._raw_data);
        this._days_2 = new IntegerField(112, 0, this._raw_data);
        this._start_block = new IntegerField(116);
        this._size = new IntegerField(120, 0, this._raw_data);
        this._index = -1;
        setName("");
        setNextChild(null);
        setPreviousChild(null);
    }

    public static boolean isSmall(int i10) {
        if (i10 < 4096) {
            return true;
        }
        return false;
    }

    public static boolean isValidIndex(int i10) {
        if (i10 != -1) {
            return true;
        }
        return false;
    }

    public int getChildIndex() {
        return this._child_property.get();
    }

    public int getIndex() {
        return this._index;
    }

    public String getName() {
        return this._name;
    }

    @Override // lib.zj.office.fc.poifs.property.Child
    public Child getNextChild() {
        return this._next_child;
    }

    public int getNextChildIndex() {
        return this._next_property.get();
    }

    @Override // lib.zj.office.fc.poifs.property.Child
    public Child getPreviousChild() {
        return this._previous_child;
    }

    public int getPreviousChildIndex() {
        return this._previous_property.get();
    }

    public String getShortDescription() {
        StringBuffer stringBuffer = new StringBuffer("Property: \"");
        stringBuffer.append(getName());
        stringBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        return stringBuffer.toString();
    }

    public int getSize() {
        return this._size.get();
    }

    public int getStartBlock() {
        return this._start_block.get();
    }

    public ClassID getStorageClsid() {
        return this._storage_clsid;
    }

    public Object[] getViewableArray() {
        return new Object[]{"Name          = \"" + getName() + OperatorName.SHOW_TEXT_LINE_AND_SPACE, "Property Type = " + ((int) this._property_type.get()), "Node Color    = " + ((int) this._node_color.get()), d.c("Time 1        = ", (this._days_1.get() << 32) + (this._seconds_1.get() & 65535)), d.c("Time 2        = ", (this._days_2.get() << 32) + (this._seconds_2.get() & 65535))};
    }

    public Iterator getViewableIterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    public abstract boolean isDirectory();

    public abstract void preWrite();

    public boolean preferArray() {
        return true;
    }

    public void setChildProperty(int i10) {
        this._child_property.set(i10, this._raw_data);
    }

    public void setIndex(int i10) {
        this._index = i10;
    }

    public void setName(String str) {
        char[] charArray = str.toCharArray();
        int min = Math.min(charArray.length, 31);
        this._name = new String(charArray, 0, min);
        int i10 = 0;
        short s4 = 0;
        while (i10 < min) {
            new ShortField(s4, (short) charArray[i10], this._raw_data);
            s4 = (short) (s4 + 2);
            i10++;
        }
        while (i10 < 32) {
            new ShortField(s4, (short) 0, this._raw_data);
            s4 = (short) (s4 + 2);
            i10++;
        }
        this._name_size.set((short) ((min + 1) * 2), this._raw_data);
    }

    @Override // lib.zj.office.fc.poifs.property.Child
    public void setNextChild(Child child) {
        int index;
        this._next_child = child;
        IntegerField integerField = this._next_property;
        if (child == null) {
            index = -1;
        } else {
            index = ((Property) child).getIndex();
        }
        integerField.set(index, this._raw_data);
    }

    public void setNodeColor(byte b10) {
        this._node_color.set(b10, this._raw_data);
    }

    @Override // lib.zj.office.fc.poifs.property.Child
    public void setPreviousChild(Child child) {
        int index;
        this._previous_child = child;
        IntegerField integerField = this._previous_property;
        if (child == null) {
            index = -1;
        } else {
            index = ((Property) child).getIndex();
        }
        integerField.set(index, this._raw_data);
    }

    public void setPropertyType(byte b10) {
        this._property_type.set(b10, this._raw_data);
    }

    public void setSize(int i10) {
        this._size.set(i10, this._raw_data);
    }

    public void setStartBlock(int i10) {
        this._start_block.set(i10, this._raw_data);
    }

    public void setStorageClsid(ClassID classID) {
        this._storage_clsid = classID;
        if (classID == null) {
            Arrays.fill(this._raw_data, 80, 96, (byte) 0);
        } else {
            classID.write(this._raw_data, 80);
        }
    }

    public boolean shouldUseSmallBlocks() {
        return isSmall(this._size.get());
    }

    public void writeData(OutputStream outputStream) {
        outputStream.write(this._raw_data);
    }

    public Property(int i10, byte[] bArr, int i11) {
        byte[] bArr2 = new byte[128];
        this._raw_data = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 128);
        this._name_size = new ShortField(64, this._raw_data);
        this._property_type = new ByteField(66, this._raw_data);
        this._node_color = new ByteField(67, this._raw_data);
        this._previous_property = new IntegerField(68, this._raw_data);
        this._next_property = new IntegerField(72, this._raw_data);
        this._child_property = new IntegerField(76, this._raw_data);
        this._storage_clsid = new ClassID(this._raw_data, 80);
        this._user_flags = new IntegerField(96, 0, this._raw_data);
        this._seconds_1 = new IntegerField(100, this._raw_data);
        this._days_1 = new IntegerField(104, this._raw_data);
        this._seconds_2 = new IntegerField(108, this._raw_data);
        this._days_2 = new IntegerField(112, this._raw_data);
        this._start_block = new IntegerField(116, this._raw_data);
        this._size = new IntegerField(120, this._raw_data);
        this._index = i10;
        int i12 = (this._name_size.get() / 2) - 1;
        if (i12 < 1) {
            this._name = "";
        } else {
            char[] cArr = new char[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                cArr[i14] = (char) new ShortField(i13, this._raw_data).get();
                i13 += 2;
            }
            this._name = new String(cArr, 0, i12);
        }
        this._next_child = null;
        this._previous_child = null;
    }
}
