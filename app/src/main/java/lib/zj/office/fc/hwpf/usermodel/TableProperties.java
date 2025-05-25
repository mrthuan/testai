package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.types.TAPAbstractType;

/* loaded from: classes3.dex */
public final class TableProperties extends TAPAbstractType implements Cloneable {
    public TableProperties() {
        setTlp(new TableAutoformatLookSpecifier());
        setShdTable(new ShadingDescriptor());
        setBrcBottom(new BorderCode());
        setBrcHorizontal(new BorderCode());
        setBrcLeft(new BorderCode());
        setBrcRight(new BorderCode());
        setBrcTop(new BorderCode());
        setBrcVertical(new BorderCode());
        setRgbrcInsideDefault_0(new BorderCode());
        setRgbrcInsideDefault_1(new BorderCode());
        setRgdxaCenter(new short[0]);
        setRgdxaCenterPrint(new short[0]);
        setRgshd(new ShadingDescriptor[0]);
        setRgtc(new TableCellDescriptor[0]);
    }

    public Object clone() {
        TableProperties tableProperties = (TableProperties) super.clone();
        tableProperties.setTlp(getTlp().clone());
        tableProperties.setRgshd(new ShadingDescriptor[getRgshd().length]);
        for (int i10 = 0; i10 < getRgshd().length; i10++) {
            tableProperties.getRgshd()[i10] = (ShadingDescriptor) getRgshd()[i10].clone();
        }
        tableProperties.setBrcBottom((BorderCode) getBrcBottom().clone());
        tableProperties.setBrcHorizontal((BorderCode) getBrcHorizontal().clone());
        tableProperties.setBrcLeft((BorderCode) getBrcLeft().clone());
        tableProperties.setBrcRight((BorderCode) getBrcRight().clone());
        tableProperties.setBrcTop((BorderCode) getBrcTop().clone());
        tableProperties.setBrcVertical((BorderCode) getBrcVertical().clone());
        tableProperties.setShdTable((ShadingDescriptor) getShdTable().clone());
        tableProperties.setRgbrcInsideDefault_0((BorderCode) getRgbrcInsideDefault_0().clone());
        tableProperties.setRgbrcInsideDefault_1((BorderCode) getRgbrcInsideDefault_1().clone());
        tableProperties.setRgdxaCenter((short[]) getRgdxaCenter().clone());
        tableProperties.setRgdxaCenterPrint((short[]) getRgdxaCenterPrint().clone());
        tableProperties.setRgtc(new TableCellDescriptor[getRgtc().length]);
        for (int i11 = 0; i11 < getRgtc().length; i11++) {
            tableProperties.getRgtc()[i11] = (TableCellDescriptor) getRgtc()[i11].clone();
        }
        return tableProperties;
    }

    public TableProperties(short s4) {
        this();
        setItcMac(s4);
        setRgshd(new ShadingDescriptor[s4]);
        for (int i10 = 0; i10 < s4; i10++) {
            getRgshd()[i10] = new ShadingDescriptor();
        }
        TableCellDescriptor[] tableCellDescriptorArr = new TableCellDescriptor[s4];
        for (int i11 = 0; i11 < s4; i11++) {
            tableCellDescriptorArr[i11] = new TableCellDescriptor();
        }
        setRgtc(tableCellDescriptorArr);
        setRgdxaCenter(new short[s4]);
        setRgdxaCenterPrint(new short[s4]);
    }
}
