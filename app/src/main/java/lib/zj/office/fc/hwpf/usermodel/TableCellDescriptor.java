package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.types.TCAbstractType;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class TableCellDescriptor extends TCAbstractType implements Cloneable {
    public static final int SIZE = 20;
    protected short field_x_unused;

    public TableCellDescriptor() {
        setBrcTop(new BorderCode());
        setBrcLeft(new BorderCode());
        setBrcBottom(new BorderCode());
        setBrcRight(new BorderCode());
    }

    public static TableCellDescriptor convertBytesToTC(byte[] bArr, int i10) {
        TableCellDescriptor tableCellDescriptor = new TableCellDescriptor();
        tableCellDescriptor.fillFields(bArr, i10);
        return tableCellDescriptor;
    }

    public Object clone() {
        TableCellDescriptor tableCellDescriptor = (TableCellDescriptor) super.clone();
        tableCellDescriptor.setBrcTop((BorderCode) getBrcTop().clone());
        tableCellDescriptor.setBrcLeft((BorderCode) getBrcLeft().clone());
        tableCellDescriptor.setBrcBottom((BorderCode) getBrcBottom().clone());
        tableCellDescriptor.setBrcRight((BorderCode) getBrcRight().clone());
        return tableCellDescriptor;
    }

    public void fillFields(byte[] bArr, int i10) {
        this.field_1_rgf = LittleEndian.getShort(bArr, i10 + 0);
        this.field_x_unused = LittleEndian.getShort(bArr, i10 + 2);
        setBrcTop(new BorderCode(bArr, i10 + 4));
        setBrcLeft(new BorderCode(bArr, i10 + 8));
        setBrcBottom(new BorderCode(bArr, i10 + 12));
        setBrcRight(new BorderCode(bArr, i10 + 16));
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10 + 0, this.field_1_rgf);
        LittleEndian.putShort(bArr, i10 + 2, this.field_x_unused);
        getBrcTop().serialize(bArr, i10 + 4);
        getBrcLeft().serialize(bArr, i10 + 8);
        getBrcBottom().serialize(bArr, i10 + 12);
        getBrcRight().serialize(bArr, i10 + 16);
    }
}
